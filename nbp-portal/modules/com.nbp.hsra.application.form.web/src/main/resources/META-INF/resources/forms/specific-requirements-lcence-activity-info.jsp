<%@page import="com.nbp.hsra.application.service.model.SpecificReqPropLicActivity"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
	<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
	<%@page
	import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
	<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationDeclaration"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationSafetyProgram"%>
<%@page import="com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.PurposeOfPropLicence"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.DetailOfBusinessSecThree"%>
<%@page import="com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalService"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationProtectionSecOne"%>
<%@ include file="../init.jsp" %>
<%
if(hsraApplicationId>0){
	 try{
	    	specificRquirements=SpecificReqPropLicActivityLocalServiceUtil.getHsraById(hsraApplicationId);
	   }catch(Exception e){  
	   }
	 try {
			radiationDecData = RadiationDeclarationLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
	 List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsParentFolder =null;
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentSubFolderManagment = null;
		try{
		 supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"HSRA Supporting Documents");
		 supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(hsraApplicationId));
		 }catch(Exception e){
		 }
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Administration of Radiation");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntryadminstrationOfRadiation = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					adminstrationOfRadiation=fileEntryadminstrationOfRadiation.getFileName();
					adminstrationOfRadiationUrl=DLURLHelperUtil.getDownloadURL(fileEntryadminstrationOfRadiation,
							fileEntryadminstrationOfRadiation.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Quality Assurance Programme");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntryqualityAssuranceProgramme = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					qualityAssuranceProgramme=fileEntryqualityAssuranceProgramme.getFileName();
					qualityAssuranceProgrammeUrl=DLURLHelperUtil.getDownloadURL(fileEntryqualityAssuranceProgramme,
							fileEntryqualityAssuranceProgramme.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Instructions to Caregiver");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntryinstructionOfCaregiver = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					instructionOfCaregiver=fileEntryinstructionOfCaregiver.getFileName();
					instructionOfCaregiverUrl=DLURLHelperUtil.getDownloadURL(fileEntryinstructionOfCaregiver,
							fileEntryinstructionOfCaregiver.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Instructions to Patients");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntryinstructionOfPatients = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					instructionOfPatients=fileEntryinstructionOfPatients.getFileName();
					instructionOfPatientsUrl=DLURLHelperUtil.getDownloadURL(fileEntryinstructionOfPatients,
							fileEntryinstructionOfPatients.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Release of Patients");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntryreleaseOfPatients= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					releaseOfPatients=fileEntryreleaseOfPatients.getFileName();
					releaseOfPatientsUrl=DLURLHelperUtil.getDownloadURL(fileEntryreleaseOfPatients,
							fileEntryreleaseOfPatients.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Release of Treatment Rooms");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntrytreatmentRoomsUpload= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					treatmentRoomsUpload=fileEntrytreatmentRoomsUpload.getFileName();
					treatmentRoomsUploadUrl=DLURLHelperUtil.getDownloadURL(fileEntrytreatmentRoomsUpload,
							fileEntrytreatmentRoomsUpload.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Medical Emergencies");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntrymedicalEmergencies= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					medicalEmergencies=fileEntrymedicalEmergencies.getFileName();
					medicalEmergenciesUrl=DLURLHelperUtil.getDownloadURL(fileEntrymedicalEmergencies,
							fileEntrymedicalEmergencies.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
			try{
				supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						supportingDocumentsFolder1.getFolderId(), "Therapeutic Nuclear Medicine");
				fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
			} catch (Exception e) {}
			if (fileEntry2 != null) {
				for (DLFileEntry uploadedFile : fileEntry2) {
					fileEntrynuclearMedicine= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
					nuclearMedicine=fileEntrynuclearMedicine.getFileName();
					nuclearMedicineUrl=DLURLHelperUtil.getDownloadURL(fileEntrynuclearMedicine,
							fileEntrynuclearMedicine.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Diagnostic Studies Protocols");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrydiagnosticStudiesProtocol= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				diagnosticStudiesProtocol=fileEntrydiagnosticStudiesProtocol.getFileName();
				diagnosticStudiesProtocolUrl=DLURLHelperUtil.getDownloadURL(fileEntrydiagnosticStudiesProtocol,
						fileEntrydiagnosticStudiesProtocol.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Biomedical Research");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrybiomedicalResearch= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				biomedicalResearch=fileEntrybiomedicalResearch.getFileName();
				biomedicalResearchUrl=DLURLHelperUtil.getDownloadURL(fileEntrybiomedicalResearch,
						fileEntrybiomedicalResearch.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Research Review Committee");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryresearchReviewComittee= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				researchReviewComittee=fileEntryresearchReviewComittee.getFileName();
				researchReviewComitteeUrl=DLURLHelperUtil.getDownloadURL(fileEntryresearchReviewComittee,
						fileEntryresearchReviewComittee.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Emergency and Operating");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryemergencyAndOperating= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				emergencyAndOperating=fileEntryemergencyAndOperating.getFileName();
				emergencyAndOperatingUrl=DLURLHelperUtil.getDownloadURL(fileEntryemergencyAndOperating,
						fileEntryemergencyAndOperating.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Application for Registration");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryapplicationForResgis= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				applicationForResgis=fileEntryapplicationForResgis.getFileName();
				applicationForResgisUrl=DLURLHelperUtil.getDownloadURL(fileEntryapplicationForResgis,
						fileEntryapplicationForResgis.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Use of Exposure Devices");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryuseOfExposure= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				useOfExposure=fileEntryuseOfExposure.getFileName();
				useOfExposureUrl=DLURLHelperUtil.getDownloadURL(fileEntryuseOfExposure,
						fileEntryuseOfExposure.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Emergency Equipment");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrysafetyEmergency= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				safetyEmergency2=fileEntrysafetyEmergency.getFileName();
				safetyEmergency2Url=DLURLHelperUtil.getDownloadURL(fileEntrysafetyEmergency,
						fileEntrysafetyEmergency.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Release of Treatment Rooms");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryreleaseOfTreatmentRoom= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				releaseOfTreatmentRoom=fileEntryreleaseOfTreatmentRoom.getFileName();
				releaseOfTreatmentRoomUrl=DLURLHelperUtil.getDownloadURL(fileEntryreleaseOfTreatmentRoom,
						fileEntryreleaseOfTreatmentRoom.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Transport Plan");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrytransport = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				transport=fileEntrytransport.getFileName();
				transportUrl=DLURLHelperUtil.getDownloadURL(fileEntrytransport,
						fileEntrytransport.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Treatment to Animals");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrytreatmentAnimal = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				treatmentAnimal=fileEntrytreatmentAnimal.getFileName();
				treatmentAnimalUrl=DLURLHelperUtil.getDownloadURL(fileEntrytreatmentAnimal,
						fileEntrytreatmentAnimal.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Animal Housing");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryanimalHouse = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				animalHouse=fileEntryanimalHouse.getFileName();
				animalHouseUrl=DLURLHelperUtil.getDownloadURL(fileEntryanimalHouse,
						fileEntryanimalHouse.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Disposal of Animal Waste");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrydisposalWaste = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				disposalWaste=fileEntrydisposalWaste.getFileName();
				disposalWasteUrl=DLURLHelperUtil.getDownloadURL(fileEntrydisposalWaste,
						fileEntrydisposalWaste.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Release of Animal Housing");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryreleaseOfAnimalHosting = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				releaseOfAnimalHosting=fileEntryreleaseOfAnimalHosting.getFileName();
				releaseOfAnimalHostingUrl=DLURLHelperUtil.getDownloadURL(fileEntryreleaseOfAnimalHosting,
						fileEntryreleaseOfAnimalHosting.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Release of Animals");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryreleaseOfAnimal = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				releaseOfAnimal=fileEntryreleaseOfAnimal.getFileName();
				releaseOfAnimalUrl=DLURLHelperUtil.getDownloadURL(fileEntryreleaseOfAnimal,
						fileEntryreleaseOfAnimal.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Append Procedures");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryappendProcedure= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				appendProcedure=fileEntryappendProcedure.getFileName();
				appendProcedureUrl=DLURLHelperUtil.getDownloadURL(fileEntryappendProcedure,
						fileEntryappendProcedure.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Management Disposal Waste");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrymanagementDiposal= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				managementDiposal=fileEntrymanagementDiposal.getFileName();
				managementDiposalUrl=DLURLHelperUtil.getDownloadURL(fileEntrymanagementDiposal,
						fileEntrymanagementDiposal.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Procedures for Monitoring");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryproceduresForMoni= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				proceduresForMoni=fileEntryproceduresForMoni.getFileName();
				proceduresForMoniUrl=DLURLHelperUtil.getDownloadURL(fileEntryproceduresForMoni,
						fileEntryproceduresForMoni.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Handling Procedures");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryhandlingPro= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				handlingPro=fileEntryhandlingPro.getFileName();
				handlingProUrl=DLURLHelperUtil.getDownloadURL(fileEntryhandlingPro,
						fileEntryhandlingPro.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Rules for Entry into the Vessels");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryrulesForEntry= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				rulesForEntry=fileEntryrulesForEntry.getFileName();
				rulesForEntryUrl=DLURLHelperUtil.getDownloadURL(fileEntryrulesForEntry,
						fileEntryrulesForEntry.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Operating Conditions");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryoperatingCon= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				operatingCon=fileEntryoperatingCon.getFileName();
				operatingConUrl=DLURLHelperUtil.getDownloadURL(fileEntryoperatingCon,
						fileEntryoperatingCon.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Operation of Insertion-Type");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryoperationOfInser= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				operationOfInser=fileEntryoperationOfInser.getFileName();
				operationOfInserUrl=DLURLHelperUtil.getDownloadURL(fileEntryoperationOfInser,
						fileEntryoperationOfInser.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Installation of Fixed Gauges");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryinstallationOfFix= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				installationOfFix=fileEntryinstallationOfFix.getFileName();
				installationOfFixUrl=DLURLHelperUtil.getDownloadURL(fileEntryinstallationOfFix,
						fileEntryinstallationOfFix.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Transport Plan");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrytransportPlan= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				transportPlan=fileEntrytransportPlan.getFileName();
				transportPlanUrl=DLURLHelperUtil.getDownloadURL(fileEntrytransportPlan,
						fileEntrytransportPlan.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Emergency Procedures");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryemergencyPro= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				emergencyPro=fileEntryemergencyPro.getFileName();
				emergencyProUrl=DLURLHelperUtil.getDownloadURL(fileEntryemergencyPro,
						fileEntryemergencyPro.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Release of Radiation Sources");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryreleaseOfRadiation= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				releaseOfRadiation=fileEntryreleaseOfRadiation.getFileName();
				releaseOfRadiationUrl=DLURLHelperUtil.getDownloadURL(fileEntryreleaseOfRadiation,
						fileEntryreleaseOfRadiation.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Fishing for Stuck Tools");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryfishingForStruck= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				fishingForStruck=fileEntryfishingForStruck.getFileName();
				fishingForStruckUrl=DLURLHelperUtil.getDownloadURL(fileEntryfishingForStruck,
						fileEntryfishingForStruck.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Abandonment of Sealed Sources");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryabandonmentOfSealed= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				abandonmentOfSealed=fileEntryabandonmentOfSealed.getFileName();
				abandonmentOfSealedUrl=DLURLHelperUtil.getDownloadURL(fileEntryabandonmentOfSealed,
						fileEntryabandonmentOfSealed.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Abandonment of Unsealed Sources");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryabamdomentOfUnsealed= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				abamdomentOfUnsealed=fileEntryabamdomentOfUnsealed.getFileName();
				abamdomentOfUnsealedUrl=DLURLHelperUtil.getDownloadURL(fileEntryabamdomentOfUnsealed,
						fileEntryabamdomentOfUnsealed.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Servicing Procedures");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryservicePro= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				servicingProcedures=fileEntryservicePro.getFileName();
				servicingProceduresUrl=DLURLHelperUtil.getDownloadURL(fileEntryservicePro,
						fileEntryservicePro.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Copy of All Manufacturing");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrycopyOfAll= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				copyOfAll=fileEntrycopyOfAll.getFileName();
				copyOfAllUrl=DLURLHelperUtil.getDownloadURL(fileEntrycopyOfAll,
						fileEntrycopyOfAll.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try {
			supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
					"Signature of Service Declaration");
			fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry) {
				fileEntrySignatureInDeclaration = DLAppLocalServiceUtil
						.getFileEntry(dlFileEntry.getFileEntryId());
				fileUrlInDeclaration = DLURLHelperUtil.getDownloadURL(fileEntrySignatureInDeclaration,
						fileEntrySignatureInDeclaration.getFileVersion(), themeDisplay, StringPool.BLANK, false,
						true);
			}
		} catch (Exception e) {
		}
}
%>
<div class="tab-pane" role="tabpanel" id="childStep8">
			<div class="tab-form">
				<div class="section-seven-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section VII</p>
							<p class="tab-form-title-subtitle f2">Specific
								Requirements Based on Proposed Licence Activity</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 medical-practices">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(a)  Medical
											Practices</span> 
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<input id="medicalPractitionerDetailVal" type="hidden"
										name="medicalPractitionerDetailVal" value="1">
									<div class="">
										<div class="accordion secured-accordian" id="medicalPractitionerDetailBox">
											<div class="accordion__header is-active" id="medicalPractitionerDetail"
												onclick="expandDetails(this.id)">
												<div class="d-flex align-items-center">
													<div class="d-flex align-items-center">
														<div>
															<span class="accordion__toggle"></span>
														</div>
														<div>
															<h2>i. Medical Practitioner</h2>
														</div>
													</div>
												</div>
												<div>
													<p class="accordian-employee mb-0 common-para"></p>
												</div>
											</div>
											<div class="accordion__body is-active">
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Name</p>
															<input type="text" class="form-control"
																id="medicalPractitionerName" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Address</p>
															<input type="text" class="form-control"
																id="medicalPractitionerAddress" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Telephone</p>
															<input type="text" class="form-control"
																id="medicalPractitionerTelephone" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""
																placeholder="">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Fax Number</p>
															<input type="text" class="form-control"
																id="medicalPractitionerFax" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Email</p>
															<input type="text" class="form-control"
																id="medicalPractitionerEmail" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Licence No</p>
															<input type="text" class="form-control"
																id="medicalPractitionerLicenceNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value=""
																placeholder="">
														</div>
													</div>
													<div class="col-md-12 d-flex justify-content-end py-4">
														<a href="javascript:void(0);" class="add-more-employee"
															id="addMedicalPractitionerDetail"
															onclick="addMedicalPractitionerDetail();"> <span>+
																1</span> Add More
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-12 table-responsive hide addMedicalPractitionerDetailTableBox">
										<table class="table table-bordered mb-3">
											<tbody class="addMedicalPractitionerDetailTable">
												<tr>
													<th class="sub_heading text-nowrap">Name</th>
													<th class="sub_heading text-nowrap">Address</th>
													<th class="sub_heading text-nowrap">Telephone</th>
													<th class="sub_heading text-nowrap">Fax Number</th>
													<th class="sub_heading text-nowrap">Email</th>
													<th class="sub_heading text-nowrap">Licence No</th>
													<th class="sub_heading">Edit</th>
													<th class="sub_heading">Delete</th>
												</tr>
<%if(medicalPractitionerAdd!=null){
	long medicalPractitionerAddCounter=1;
	for(MedicalPractitionerAdd medicalPractitionerInfo:medicalPractitionerAdd){
%>
<tr class="medical-practitioner-row<%=medicalPractitionerAddCounter%>">
	<td class="sub_heading_content medicalPractitionerName<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerName())?medicalPractitionerInfo.getMedicalPractitionerName():""%>
	</td>
	<td class="sub_heading_content medicalPractitionerAddress<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerAddress())?medicalPractitionerInfo.getMedicalPractitionerAddress():""%>
	</td>
	<td class="sub_heading_content medicalPractitionerTelephone<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerTelephone())?medicalPractitionerInfo.getMedicalPractitionerTelephone():""%>
	</td>
	<td class="sub_heading_content medicalPractitionerFax<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerFax())?medicalPractitionerInfo.getMedicalPractitionerFax():""%>
	</td>
	<td class="sub_heading_content medicalPractitionerEmail<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerEmail())?medicalPractitionerInfo.getMedicalPractitionerEmail():""%>
	</td>
	<td class="sub_heading_content medicalPractitionerLicenceNo<%=medicalPractitionerAddCounter%>">
	<%=Validator.isNotNull(medicalPractitionerInfo)&&Validator.isNotNull(medicalPractitionerInfo.getMedicalPractitionerLicenceNo())?medicalPractitionerInfo.getMedicalPractitionerLicenceNo():""%>
	</td>
	<td> 
	
	<!--   
		<column name="medicalPractitionerAddress" type="String"></column>
		<column name="medicalPractitionerTelephone" type="String"></column>
		<column name="medicalPractitionerFax" type="String"></column>
		<column name="medicalPractitionerEmail" type="String"></column>
		<column name="medicalPractitionerLicenceNo" type="String"></column> -->
	
	
		<span> 
			<a href="javascript:void(0)" id="medicalPractitionerEditTab" onclick="medicalPractitionerEditTab('<%=medicalPractitionerAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
		        </svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="medicalPractitionerDetailDeleteDataTab" onclick="medicalPractitionerDetailDeleteData('<%=medicalPractitionerAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="medicalPractitionerDetailId<%=medicalPractitionerAddCounter%>" name="medicalPractitionerDetailId<%=medicalPractitionerAddCounter%>" value="">
							<%
							medicalPractitionerAddCounter++;
							}
 }
						%>		
</tbody>
										</table>
									</div>
								</div>
								<div class="col-md-12">
									<input id="acknowledgementMedicalDetailVal" type="hidden"
										name="acknowledgementMedicalDetailVal" value="1">
									<div class="col-md-12">
										<div class="accordion secured-accordian" id="acknowledgementMedicalDetailBox">
											<div class="accordion__header is-active" id="acknowledgementMedicalDetail"
												onclick="expandDetails(this.id)">
												<div class="d-flex align-items-center">
													<div class="d-flex align-items-center">
														<div>
															<span class="accordion__toggle"></span>
														</div>
														<div>
															<h2>ii. Acknowledgement of Medical Practitioner</h2>
														</div>
													</div>
												</div>
												<div>
													<p class="accordian-employee mb-0 common-para"></p>
												</div>
											</div>
											<div class="accordion__body is-active">
												<div class="row">
													<div class="col-md-12">
														<p class="pt-2 common-para">Signature</p>
														<%
														if (Validator.isNotNull(fileUrlInAcknowledgeMedical)) {
													%>
													<div class="signature_texarea mb-2"
															id="acknowledgementMedicalSignature">
														<img src="<%=fileUrlInAcknowledgeMedical%>" class="thumb-image"
															style="height: 100px; width: 100px;">
													</div>
													<%
														} else {
													%>
															<div class="signature_texarea mb-2"
															id="acknowledgementMedicalSignature"></div>
													<%
														}
													%>
														<input type="file" id="acknowledgementMedicalSignatureUpload"
															name="acknowledgementMedicalSignatureUpload"
															onchange="acknowledgementMedicalSignatureUpload" hidden="">
														<label for="acknowledgementMedicalSignatureUpload"
															class="choose-sign-btn"> <span class="mr-2">
																<svg width="14" height="17" viewBox="0 0 14 17"
																	fill="none" xmlns="http://www.w3.org/2000/svg">
																	<path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#ffffff"></path>
																</svg>
															</span> Upload Signature
														</label>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Date</p>
															<input type="date" class="form-control"
																id="acknowledgementMedicalDate" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-12 d-flex justify-content-end py-4">
														<a href="javascript:void(0);" class="add-more-employee"
															id="addAcknowledgementMedicalDetail"
															onclick="addAcknowledgementMedicalDetail();"> <span>+
																1</span> Add More
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-12 table-responsive hide addAcknowledgementMedicalDetailTableBox">
										<table class="table table-bordered mb-3">
											<tbody class="addAcknowledgementMedicalDetailTable">
												<tr>
													<th class="sub_heading text-nowrap">Signature</th>
													<th class="sub_heading text-nowrap">Date</th>
													<th class="sub_heading">Edit</th>
													<th class="sub_heading">Delete</th>
												</tr>
													
												<%
												List<DLFileEntry> fileEntry3 = new ArrayList<DLFileEntry>();
												DLFolder supportingDocumentsAcknowParentFolder = null;
												DLFolder supportingDocumentsAcknowFolder = null;
												DLFolder supportingDocumentAcknowSubFolderManagment = null;
												try {
													supportingDocumentsAcknowParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
													supportingDocumentsAcknowFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															supportingDocumentsAcknowParentFolder.getFolderId(), String.valueOf(hsraApplicationId));
												} catch (Exception e) {
												}
												
										if (medical != null) {
											long medicalPracticionerDataCounter = 1;
											for (AddMedicalPractitioner addmedical: medical) {
												if (addmedical.getMedicalPractitionerDate() != null) {
												FileEntry attachDocFE5=null;
												fileUrlInAcknowledgeMedical="";
												try {
													supportingDocumentAcknowSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
															themeDisplay.getScopeGroupId(), supportingDocumentsAcknowFolder.getFolderId(),
															"Signature of Acknowledgement Medical"+medicalPracticionerDataCounter);
													fileEntry3 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
															supportingDocumentAcknowSubFolderManagment.getFolderId());
													for (DLFileEntry dlFileEntry : fileEntry3) {
														attachDocFE5 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
														fileUrlInAcknowledgeMedical=DLURLHelperUtil.getPreviewURL(attachDocFE5,
																attachDocFE5.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
																System.out.println("--------------------------FileUrlOfLegalPerson--------------"+medicalPracticionerDataCounter);
														
													}
												} catch (Exception e) {
												}
												
									             %>
												<tr class="acknowledgement-medical-row<%=medicalPracticionerDataCounter%>">
							            <td class="sub_heading_content acknowledgementMedicalSignature<%=medicalPracticionerDataCounter%>">
							            <div class="signature_texarea mb-2" id="acknowledgementMedicalSignature">
												<img src="<%=Validator.isNotNull(fileUrlInAcknowledgeMedical)?fileUrlInAcknowledgeMedical:""%>" class="thumb-image" style="height: 100px; width: 100px;">
										</div>
										</td>
										<td class="sub_heading_content acknowledgementMedicalDate<%=medicalPracticionerDataCounter%>">
										<%=Validator.isNotNull(addmedical)&&Validator.isNotNull(addmedical.getMedicalPractitionerDate())?new SimpleDateFormat("YYYY-dd-MM").format(addmedical.getMedicalPractitionerDate()):"" %></td>
										<td> 
											<span> 
												<a href="javascript:void(0)" id="acknowledgementMedicalEditTab" onclick="acknowledgementMedicalEditTab('<%=medicalPracticionerDataCounter%>');"> 
											        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
											         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
											        </svg>
											      </a> 
											  </span>
									     </td>
									     <td> 
											<span> 
												<a href="javascript:void(0)" id="acknowledgementMedicalDetailDeleteDataTab" onclick="acknowledgementMedicalDetailDeleteData('<%=medicalPracticionerDataCounter%>');"> 
											        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
											        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
											        </svg>
											      </a> 
											  </span>  
									     </td>
									     
									</tr>
									<input type="hidden" id="acknowledgementMedicalDetail<%=medicalPracticionerDataCounter%>" name="acknowledgementMedicalDetail<%=medicalPracticionerDataCounter%>" value="<%=addmedical.getAddMedicalPractitionerId()%>">
									<%
									medicalPracticionerDataCounter++;
						       }
							}
                          }
					                %>			
											</tbody>
										</table>
									</div>
								</div>
								<div class="col-md-12">
									<input id="applicantSignatureDetailVal" type="hidden"
										name="applicantSignatureDetailVal" value="1">
									<div class="col-md-12">
										<div class="accordion secured-accordian" id="applicantSignatureDetailBox">
											<div class="accordion__header is-active" id="applicantSignatureDetail"
												onclick="expandDetails(this.id)">
												<div class="d-flex align-items-center">
													<div class="d-flex align-items-center">
														<div>
															<span class="accordion__toggle"></span>
														</div>
														<div>
															<h2>iii. Signature of Applicant's Legal Operator to
																indicate designation of Medical Practitioner</h2>
														</div>
													</div>
												</div>
												<div>
													<p class="accordian-employee mb-0 common-para"></p>
												</div>
											</div>
											<div class="accordion__body is-active">
												<div class="row">
													<div class="col-md-12">
														<p class="pt-2 common-para">Signature</p>
														<%
														if (Validator.isNotNull(fileUrlInApplicantMedical)) {
													%>
													<div class="signature_texarea mb-2"
													id="applicantSignaturelegalSignature">
														<img src="<%=fileUrlInApplicantMedical%>" class="thumb-image"
															style="height: 100px; width: 100px;">
													</div>
													<%
														} else {
													%>
													<div class="signature_texarea mb-2"
													id="applicantSignaturelegalSignature"></div>
													<%
														}
													%>
														<input type="file" id="applicantSignaturelegalSignatureUpload"
															name="applicantSignaturelegalSignatureUpload"
															onchange="applicantSignaturelegalSignatureUpload" hidden="">
														<label for="applicantSignaturelegalSignatureUpload"
															class="choose-sign-btn"> <span class="mr-2">
																<svg width="14" height="17" viewBox="0 0 14 17"
																	fill="none" xmlns="http://www.w3.org/2000/svg">
																	<path
																		d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																		fill="#ffffff"></path>
																</svg>
															</span> Upload Signature
														</label>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<p class="tab-form-main-heading">Date</p>
															<input type="date" class="form-control"
																id="applicantSignatureDate" value="" placeholder="">
														</div>
													</div>
													<div class="col-md-12 d-flex justify-content-end py-4">
														<a href="javascript:void(0);" class="add-more-employee"
															id="addApplicantSignatureDetail"
															onclick="addApplicantSignatureDetail();"> <span>+
																1</span> Add More
														</a>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-12 table-responsive hide addApplicantSignatureDetailTableBox">
										<table class="table table-bordered mb-3">
											<tbody class="addApplicantSignatureDetailTable">
												<tr>
													<th class="sub_heading text-nowrap">Signature</th>
													<th class="sub_heading text-nowrap">Date</th>
													<th class="sub_heading">Edit</th>
													<th class="sub_heading">Delete</th>
												</tr>
												<%
												List<DLFileEntry> fileEntry1 = new ArrayList<DLFileEntry>();
												DLFolder supportingDocumentsApplicantParentFolder = null;
												DLFolder supportingDocumentsApplicantFolder = null;
												DLFolder supportingDocumentApplicantSubFolderManagment = null;
												try {
													supportingDocumentsApplicantParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
													supportingDocumentsApplicantFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															supportingDocumentsApplicantParentFolder.getFolderId(), String.valueOf(hsraApplicationId));
												} catch (Exception e) {
												}
												if (medical != null) {
													long ApplicantDataCounter = 1;
													for (AddMedicalPractitioner addmedical: medical) {
														if (addmedical.getApplicantDate() != null) {
														FileEntry attachDocFE1=null;
														fileUrlInApplicantMedical="";
														try {
															supportingDocumentApplicantSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
																	themeDisplay.getScopeGroupId(), supportingDocumentsApplicantFolder.getFolderId(),
																	"Signature of Applicant Medical"+ApplicantDataCounter);
															fileEntry1 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
																	supportingDocumentApplicantSubFolderManagment.getFolderId());
															for (DLFileEntry dlFileEntry : fileEntry1) {
																attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
																fileUrlInApplicantMedical=DLURLHelperUtil.getPreviewURL(attachDocFE1,
																		attachDocFE1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
																		System.out.println("--------------------------FileUrlOfLegalPerson--------------"+ApplicantDataCounter);
																
															}
														} catch (Exception e) {
														}
												
														 %>
														<tr class="applicant-signature-row<%=ApplicantDataCounter%>">
			<td class="sub_heading_content applicantSignaturelegalSignature<%=ApplicantDataCounter%>">
			<div class="signature_texarea mb-2" id="applicantSignaturelegalSignature">
			<img src="<%=Validator.isNotNull(fileUrlInApplicantMedical)?fileUrlInApplicantMedical:""%>" 
			         class="thumb-image" style="height: 100px; width: 100px;">
		    </div>
		    </td>
			<td class="sub_heading_content applicantSignatureDate<%=ApplicantDataCounter%>">
				<%=Validator.isNotNull(addmedical)&&Validator.isNotNull(addmedical.getApplicantDate())?new SimpleDateFormat("YYYY-dd-MM").format(addmedical.getApplicantDate()):"" %></td>
			<td> 
				<span> 
					<a href="javascript:void(0)" id="applicantSignatureEditTab" onclick="applicantSignatureEditTab('<%=ApplicantDataCounter%>');"> 
						<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
						 <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
						</svg>
					  </a> 
				  </span>
			 </td>
			 <td> 
				<span> 
					<a href="javascript:void(0)" id="applicantSignatureDetailDeleteDataTab" onclick="applicantSignatureDetailDeleteData('<%=ApplicantDataCounter%>');"> 
						<svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
						<path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
						</svg>
					  </a> 
				  </span>  
			 </td>
			
		</tr>
		 <input type="hidden" id="applicantSignatureDetail<%=ApplicantDataCounter%>" name="applicantSignatureDetail<%=ApplicantDataCounter%>" value="<%=addmedical.getAddMedicalPractitionerId()%>">
								   <%
						  ApplicantDataCounter++;
									}}
							  }
								%>	
											</tbody>
										</table>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iv) </span>Administration
											of Radiation Doses for Therapeutic Treatment
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="administrationTreatment" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="administrationTreatment"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAdminTreatment())?specificRquirements.getAdminTreatment():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="administrationTreatmentUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>administrationTreatmentUpload"> <label
																class="custom-upload" for="administrationTreatmentUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(adminstrationOfRadiation)){%>
													<span class="attach-detailed-overview"><%=adminstrationOfRadiation%></span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for delivering radiation doses to patients for
											therapeutic purposes. Include protocols and procedures for
											administering radiation doses to pregnant patients.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(v) </span>Quality
											Assurance Programme for Medical Exposure
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="qualityProgramme" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="qualityProgramme"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getQualityProgramme())?specificRquirements.getQualityProgramme():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="qualityProgrammeUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>qualityProgrammeUpload"> <label
																class="custom-upload" for="qualityProgrammeUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(qualityAssuranceProgramme)){%>
													<span class="attach-detailed-overview"><%=qualityAssuranceProgramme%></span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-0">Quality assurance
											programme shall provide as appropriate: adequate assurance that
											the specified requirements relating to protection and safety
											are satisfied.</p>
										<p class="tab-form-sub-heading">(Append quality
											control mechanisms and procedures for reviewing and assessing
											the overall effectiveness of protection and safety measures.
											Include, where applicable: protocol and procedures for
											calibration, acceptance and commissioning testing and reports,
											maintenance and quality control testing of all equipment and
											software used for medical exposure.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(vi) </span>Instructions
											to Caregivers
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="instructionsCaregivers" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="instructionsCaregivers"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstructionsCaregivers())?specificRquirements.getInstructionsCaregivers():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="instructionsCaregiversUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>instructionsCaregiversUpload"> <label
																class="custom-upload" for="instructionsCaregiversUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(instructionOfCaregiver)){%>
													<span class="attach-detailed-overview"><%=instructionOfCaregiver%></span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append
											instructions that are to be given to patients who have recently
											received nuclear medicine therapy in order to control
											radioactive contamination effects and radiation exposures to
											others.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(vii) </span>Instructions
											to Patients and their Families
										</p>
											<textarea rows="3" class="mt-3 form-control" maxlength="255" id="instructionsPatients" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="instructionsPatients"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstructionsPatients())?specificRquirements.getInstructionsPatients():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="instructionsPatientsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>instructionsPatientsUpload"> <label
																class="custom-upload" for="instructionsPatientsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(instructionOfPatients)){%>
													<span class="attach-detailed-overview"><%=instructionOfPatients%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append
											instructions that are to be given to patients who have recently
											received nuclear medicine therapy in order to control
											radioactive contamination effects and radiation exposures to
											others.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(viii) </span>Release
											of Patients
										</p>
											<textarea rows="3" class="mt-3 form-control" maxlength="255" id="patientsRelease" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="patientsRelease"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstructionsPatients())?specificRquirements.getInstructionsPatients():"" %></textarea>
											<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="patientsReleaseUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>patientsReleaseUpload"> <label
																class="custom-upload" for="patientsReleaseUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(releaseOfPatients)){%>
													<span class="attach-detailed-overview"><%=releaseOfPatients%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
											<p class="tab-form-sub-heading">(Append procedures
											for determining when patients that have received nuclear
											medicine therapy must be isolated and when they may be released
											from isolation.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ix) </span>Decontamination
											and Release of Treatment Rooms
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="treatmentRooms" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="treatmentRooms"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTreatmentRooms())?specificRquirements.getTreatmentRooms():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="treatmentRoomsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>treatmentRoomsUpload"> <label
																class="custom-upload" for="treatmentRoomsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(releaseOfTreatmentRoom)){%>
													<span class="attach-detailed-overview"><%=releaseOfTreatmentRoom%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append procedures
											for returning rooms that have been used for nuclear medicine
											therapy to a condition where they can be safely released for
											other purposes.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(x) </span>Medical
											Emergencies
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="medicalEmergencies" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="medicalEmergencies"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMedicalEmergencies())?specificRquirements.getMedicalEmergencies():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="medicalEmergenciesUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>medicalEmergenciesUpload"> <label
																class="custom-upload" for="medicalEmergenciesUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(medicalEmergencies)){%>
													<span class="attach-detailed-overview"><%=medicalEmergencies%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for responding to medical emergencies that involve
											patients treated with radiation sources during the activities
											to be licensed, as well as investigations of unintended and
											accidental medical exposures.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(xi) </span>For
											Therapeutic Nuclear Medicine: Assignment of Nuclear Medicine
											Therapy Rooms
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="nuclearMedicine" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="nuclearMedicine"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMedicalEmergencies())?specificRquirements.getMedicalEmergencies():"" %></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="nuclearMedicineUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>nuclearMedicineUpload"> <label
																class="custom-upload" for="nuclearMedicineUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(nuclearMedicine)){%>
													<span class="attach-detailed-overview"><%=nuclearMedicine%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append procedures
											used to assure that patients undergoing nuclear therapy will be
											assigned to a specifically designated private room with a
											private washroom.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(xii) </span>Diagnostic
											Studies Protocols and Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="diagnosticStudies" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="diagnosticStudies"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDiagnosticStudies())?specificRquirements.getDiagnosticStudies():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="diagnosticStudiesUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>diagnosticStudiesUpload"> <label
																class="custom-upload" for="diagnosticStudiesUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(diagnosticStudiesProtocol)){%>
													<span class="attach-detailed-overview"><%=diagnosticStudiesProtocol%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append protocols
											and procedures for conducting diagnostic studies.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(xiii) </span>For
											Biomedical Research
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="biomedicalResearch" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="biomedicalResearch"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getBiomedicalResearch())?specificRquirements.getBiomedicalResearch():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="biomedicalResearchUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>biomedicalResearchUpload"> <label
																class="custom-upload" for="biomedicalResearchUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(biomedicalResearch)){%>
													<span class="attach-detailed-overview"><%=biomedicalResearch%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append research
											studies protocol and procedures. Include a statement of the
											proposed research studies and their proposed radiation dose
											constraints. Append policy and criteria for selecting human
											research volunteers. Append policy and procedures for obtaining
											and assuring informed consent of volunteers.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(xiv) </span>Research
											Review Committee
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="researchReview" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="researchReview"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getResearchReview())?specificRquirements.getResearchReview():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="researchReviewUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>researchReviewUpload"> <label
																class="custom-upload" for="researchReviewUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(researchReviewComittee)){%>
													<span class="attach-detailed-overview"><%=researchReviewComittee%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append
											information regarding proposed human research review committee
											or its equivalent.)</p>
									</div>
								</div>

							</div>
						</div>
						<div class="col-md-12 industrial-radiography">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b)  Industrial Radiography</span>
											
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Emergency
											and Operating Procedures:
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="emergencyOperating" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="emergencyOperating"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEmergencyOperating())?specificRquirements.getEmergencyOperating():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="emergencyOperatingUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>emergencyOperatingUpload"> <label
																class="custom-upload" for="emergencyOperatingUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(emergencyAndOperating)){%>
													<span class="attach-detailed-overview"><%=emergencyAndOperating%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append summary of
											the Emergency and Operating Procedures.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ii) </span>Application
											for Registration of Use of Packages (one per certificate)
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="certificatePackages" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="certificatePackages"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getCertificatePackages())?specificRquirements.getCertificatePackages():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="certificatePackagesUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>certificatePackagesUpload"> <label
																class="custom-upload" for="certificatePackagesUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(applicationForResgis)){%>
													<span class="attach-detailed-overview"><%=applicationForResgis%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append a copy of
											the Registration of Use of Packages application for each
											package.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iii) </span>Maintenance
											and Use of Exposure Devices (for renewals only)
										</p>										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="exposureDevices" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="exposureDevices"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getExposureDevices())?specificRquirements.getExposureDevices():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="exposureDevicesUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>exposureDevicesUpload"> <label
																class="custom-upload" for="exposureDevicesUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(useOfExposure)){%>
													<span class="attach-detailed-overview"><%=useOfExposure%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append sample
											copies of records of the quarterly and annual maintenance of
											exposure devices and associated equipment and of camera use
											records.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iv) </span>Safety
											and Emergency Equipment:
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="equipmentSafety" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="equipmentSafety"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEquipmentSafety())?specificRquirements.getEquipmentSafety():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="equipmentSafetyUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>equipmentSafetyUpload"> <label
																class="custom-upload" for="equipmentSafetyUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(safetyEmergency2)){%>
													<span class="attach-detailed-overview"><%=safetyEmergency2%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(All safety and
											emergency equipment which is used as part of the daily
											radiography operations. List any additional shielding
											materials.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(v) </span>Transport
											Plan
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="transportPlan" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="transportPlan"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTransportPlan())?specificRquirements.getTransportPlan():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="transportPlanOneUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>transportPlanOneUpload"> <label
																class="custom-upload" for="transportPlanOneUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(transport)){%>
													<span class="attach-detailed-overview"><%=transport%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedure for transporting gauges; include all special
											requirements for personnel, vehicle, monitoring, security and
											emergencies.)</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 vetrinary-nuclear-medicine">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(c) Veterinary Nuclear Medicine</span>
											
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Administering
											Treatment to Animals:
										</p>
										<input type="text" class="form-control" id="animalsTreatment" value="<%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAnimalsTreatment())?specificRquirements.getAnimalsTreatment():""%>"
											placeholder="">
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="animalsTreatmentUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>animalsTreatmentUpload"> <label
																class="custom-upload" for="animalsTreatmentUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(treatmentAnimal)){%>
													<span class="attach-detailed-overview"><%=treatmentAnimal%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policies
											and procedures used to administer radiation sources to animals.
											Owners of animals should provide a (written) consent before
											radionuclides is used on animals. Append a copy of the
											treatment consent form.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ii) </span>Animal
											Housing
										</p>
										<input type="text" class="form-control" id="animalHousing" value="<%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAnimalHousing())?specificRquirements.getAnimalHousing():""%>"
											placeholder="">
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="animalHousingUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>animalHousingUpload"> <label
																class="custom-upload" for="animalHousingUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(animalHouse)){%>
													<span class="attach-detailed-overview"><%=animalHouse%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading ">(Append policy and
											procedures regarding the housing controls imposed on animals
											undergoing veterinary nuclear medicine.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iii) </span>Disposal
											of Animal Waste
										</p>
										<input type="text" class="form-control" id="disposalWaste" value="<%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDisposalWaste())?specificRquirements.getDisposalWaste():""%>"
											placeholder="">
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="disposalWasteUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>disposalWasteUpload"> <label
																class="custom-upload" for="disposalWasteUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(disposalWaste)){%>
													<span class="attach-detailed-overview"><%=disposalWaste%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading ">(Append policy and
											procedures for management of animal waste arising from
											veterinary nuclear medicine.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iv) </span>Monitoring
											and Release of Animal Housing
										</p>
										<input type="text" class="form-control" id="monitoringAnimalHousing" value="<%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMonitoringAnimalHousing())?specificRquirements.getMonitoringAnimalHousing():""%>"
											placeholder="">
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="monitoringAnimalHousingUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>monitoringAnimalHousingUpload"> <label
																class="custom-upload" for="monitoringAnimalHousingUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(releaseOfAnimalHosting)){%>
													<span class="attach-detailed-overview"><%=releaseOfAnimalHosting%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for monitoring and release of animal housing.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(v) </span>Release
											of Animals
										</p>
										
										<input type="text" class="form-control" id="releaseAnimals" value="<%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getReleaseAnimals())?specificRquirements.getReleaseAnimals():""%>"
											placeholder="">
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="releaseAnimalsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>releaseAnimalsUpload"> <label
																class="custom-upload" for="releaseAnimalsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(releaseOfAnimal)){%>
													<span class="attach-detailed-overview"><%=releaseOfAnimal%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append the
											criteria used by the applicant to decide when animals treated
											with radiation sources can be released to their owners.)</p>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12 other-industries">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(d)  Other
											Industries That Use Nuclear Material</span> 
										</p>
										<p class="tab-form-sub-heading">(This section is
											only applicable for industries where nuclear material is used;
											however, the industry or use is not otherwise specified in this
											application form.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="proceduresApp" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="proceduresApp"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getProceduresApp())?specificRquirements.getProceduresApp():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="proceduresAppUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>proceduresAppUpload"> <label
																class="custom-upload" for="proceduresAppUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(appendProcedure)){%>
													<span class="attach-detailed-overview"><%=appendProcedure%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append procedures
											regarding the controls of the use of nuclear material.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ii) </span>Disposals
										</p>
										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="disposalsApp" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="disposalsApp"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getDisposalsApp())?specificRquirements.getDisposalsApp():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="disposalsAppUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>disposalsAppUpload"> <label
																class="custom-upload" for="disposalsAppUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(managementDiposal)){%>
													<span class="attach-detailed-overview"><%=managementDiposal%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for management of waste arising from the use of
											nuclear material.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iii) </span>Monitoring
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="monitoringMaterialNu" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="monitoringMaterialNu"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getMonitoringMaterialNu())?specificRquirements.getMonitoringMaterialNu():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="monitoringMaterialNuUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>monitoringMaterialNuUpload"> <label
																class="custom-upload" for="monitoringMaterialNuUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(proceduresForMoni)){%>
													<span class="attach-detailed-overview"><%=proceduresForMoni%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for monitoring the use of nuclear material.)</p>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12 gauges">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(e)  Gauges
											(Fixed & Portable)</span> 
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Handling
											Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="handlingProcedures" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="handlingProcedures"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getHandlingProcedures())?specificRquirements.getHandlingProcedures():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="handlingProceduresUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>handlingProceduresUpload"> <label
																class="custom-upload" for="handlingProceduresUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(handlingPro)){%>
													<span class="attach-detailed-overview"><%=handlingPro%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
										procedures that detail the handling of fixed and/or portable
										gauges.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ii) </span>Rules
											for Entry into the Vessels or Hoppers
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="hoppersEntry" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="hoppersEntry"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getHoppersEntry())?specificRquirements.getHoppersEntry():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="hoppersEntryUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>hoppersEntryUpload"> <label
																class="custom-upload" for="hoppersEntryUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(rulesForEntry)){%>
													<span class="attach-detailed-overview"><%=rulesForEntry%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures to enter vessels or hoppers fitted with gauges.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iii) </span>Operating
											Conditions and Maintenance Programme
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="operatingConditions" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="operatingConditions"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getOperatingConditions())?specificRquirements.getOperatingConditions():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="operatingConditionsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>operatingConditionsUpload"> <label
																class="custom-upload" for="operatingConditionsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(operatingCon)){%>
													<span class="attach-detailed-overview"><%=operatingCon%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for the operating conditions and maintenance
											programme.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iv) </span>Operation
											of Insertion-Type Fixed Gauges
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="insertionType" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="insertionType"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInsertionType())?specificRquirements.getInsertionType():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="insertionTypeUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>insertionTypeUpload"> <label
																class="custom-upload" for="insertionTypeUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(operationOfInser)){%>
													<span class="attach-detailed-overview"><%=operationOfInser%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedure to handle the insertion-type fixed gauges.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(v) </span>Installation
											and Dismounting of Fixed Gauges
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="installationFixed" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="installationFixed"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getInstallationFixed())?specificRquirements.getInstallationFixed():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="installationFixedUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>installationFixedUpload"> <label
																class="custom-upload" for="installationFixedUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(installationOfFix)){%>
													<span class="attach-detailed-overview"><%=installationOfFix%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for the installing and dismounting of fixed gauges.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(vi) </span>Transport
											Plan
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="transportPlanGauge" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="transportPlanGauge"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getTransportPlanGauge())?specificRquirements.getTransportPlanGauge():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="transportPlanGaugeUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>transportPlanGaugeUpload"> <label
																class="custom-upload" for="transportPlanGaugeUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(transportPlan)){%>
													<span class="attach-detailed-overview"><%=transportPlan%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedure for transporting gauges; include all special
											requirements for personnel, vehicle, monitoring, security and
											emergencies.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(vii) </span>Emergency
											Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="EmergencyAddition" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="EmergencyAddition"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getEmergencyAddition())?specificRquirements.getEmergencyAddition():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="EmergencyAdditionUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>EmergencyAdditionUpload"> <label
																class="custom-upload" for="EmergencyAdditionUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(emergencyPro)){%>
													<span class="attach-detailed-overview"><%=emergencyPro%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(In addition to
											the information provided in Section V: f (xii) append
											procedures specific to dealing with fire. For portable gauges
											this must include procedures for responding to and managing
											situations involving crushed or damaged portable gauges.)</p>
									</div>
								</div>
								<div class="col-md-12 hide">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(viii) </span>If No
											Radiation Survey Meter is Available on Site
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="radiationSurvey" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="radiationSurvey"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getNuclearEnviroment())?specificRquirements.getNuclearEnviroment():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="radiationSurveyUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>radiationSurveyUpload"> <label
																class="custom-upload" for="radiationSurveyUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<span class="attach-detailed-overview"></span>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append
											information to demonstrate that the survey meter will be
											available during an emergency in less than four (4) hours.)</p>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12 petroleum-exploration">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(f)  Petroleum Exploration (Well Logging)</span>
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Release
											of Radiation Sources and/Nuclear Material to the Environment
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="nuclearEnviroment" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="nuclearEnviroment"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getNuclearEnviroment())?specificRquirements.getNuclearEnviroment():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="nuclearEnviromentUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>nuclearEnviromentUpload"> <label
																class="custom-upload" for="nuclearEnviromentUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(releaseOfRadiation)){%>
													<span class="attach-detailed-overview"><%=releaseOfRadiation%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy for
											monitoring release of radiation source(s) and/ nuclear
											materials to the environment.)</p>
											
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(ii) </span>Fishing
											for Stuck Tools/Sources
										</p>										
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="fishingTool" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="fishingTool"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getFishingTool())?specificRquirements.getFishingTool():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="fishingToolUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>fishingToolUpload"> <label
																class="custom-upload" for="fishingToolUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(fishingForStruck)){%>
													<span class="attach-detailed-overview"><%=fishingForStruck%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedure that will be used during an emergency that involves
											fishing for stuck tools and sources.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iii) </span>Abandonment
											of Sealed Sources
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="sealedSources" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="sealedSources"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getSealedSources())?specificRquirements.getSealedSources():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="sealedSourcesUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>sealedSourcesUpload"> <label
																class="custom-upload" for="sealedSourcesUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(abandonmentOfSealed)){%>
													<span class="attach-detailed-overview"><%=abandonmentOfSealed%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and
											procedure for the proposed abandonment of sealed source.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(iv) </span>Abandonment
											of Unsealed Sources
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="abandonmentZone" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="abandonmentZone"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getAbandonmentZone())?specificRquirements.getAbandonmentZone():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="abandonmentZoneUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>abandonmentZoneUpload"> <label
																class="custom-upload" for="abandonmentZoneUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(abamdomentOfUnsealed)){%>
													<span class="attach-detailed-overview"><%=abamdomentOfUnsealed%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append policy and
											procedures for the abandonment of unsealed radiation sources
											and/ nuclear materials following sub-surface zone location or
											sub-surface tracer studies.)</p>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12 serivicing">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(g)  Servicing</span>
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Servicing
											Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="servicingCopy" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="servicingCopy"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getServicingCopy())?specificRquirements.getServicingCopy():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="servicingCopyUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>servicingCopyUpload"> <label
																class="custom-upload" for="servicingCopyUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(servicingProcedures)){%>
													<span class="attach-detailed-overview"><%=servicingProcedures%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append a copy of
											servicing procedures, specific to each radiation device
											identified in the application for this activity.)</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12 manufacturing">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(h)  Manufacturing</span>
										</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(i) </span>Manufacturing
											or Development Procedures
										</p>
										<textarea rows="3" class="mt-3 form-control" maxlength="255" id="manufacturingDevProcedure" placeholder="" 
									style="border-radius: 5px; width: 100%" aria-describedby="manufacturingDevelopment"><%=Validator.isNotNull(specificRquirements)&&Validator.isNotNull(specificRquirements.getManufacturingDevelopment())?specificRquirements.getManufacturingDevelopment():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="manufacturingDevelopmentUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>manufacturingDevelopmentUpload"> <label
																class="custom-upload" for="manufacturingDevelopmentUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"> 
			                                                                    <path
																			d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
																			fill="#047247"></path> 
			                                                              </svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(copyOfAll)){%>
													<span class="attach-detailed-overview"><%=copyOfAll%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading">(Append a copy of
											all manufacturing or development procedures, specific to each
											sealed source or radiation device identified in the application
											for this activity.)</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="applicantInfo(); addSectionSeventhDetail(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg width="18" height="14" viewBox="0 0 18 14"
						fill="none" xmlns="http://www.w3.org/2000/svg">
						<pathd="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
							1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917">
						</pathd="m6.00016>
					</svg>
				</span>
			</button>
		</div>
			<div class="tab-pane" role="tabpanel" id="childStep9">
			<div class="tab-form">
				<div class="section-eight-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Declaration</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-sub-heading mt-3">
								<b>Declaration:</b> I hereby declare that the information
								contained herein and any supplemental pages appended to this
								application are correct to the best of my knowledge and belief.
							</p>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Legal Operator Name</p>
								<input type="text" class="form-control" id="legalOperatorName"
									value="<%=Validator.isNotNull(radiationDecData)&&Validator.isNotNull(radiationDecData.getLegalOperatorName())?radiationDecData.getLegalOperatorName():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control" id="operatorTitle"
									value="<%=Validator.isNotNull(radiationDecData)&&Validator.isNotNull(radiationDecData.getOperatorTitle())?radiationDecData.getOperatorTitle():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature</p>
							<%
								if (Validator.isNotNull(fileUrlInDeclaration)) {
							%>
							<div class="signature_texarea mb-2"
								id="signatureOperatorImageHolder">
								<img src="<%=fileUrlInDeclaration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
						        } else {
					         %>
					            <div class="signature_texarea mb-2" id="signatureOperatorImageHolder"></div>
					         <%
						         }
					          %>
				
							<input type="file" id="signatureOperatorBtn" hidden=""
								name="<portlet:namespace/>signatureOperatorBtn"> <label
								for="signatureOperatorBtn" class="choose-sign-btn"> <span
								class="mr-2"> <svg width="14" height="17"
										viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"> 
                              <path
											d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
											fill="#ffffff"></path> 
                             </svg>
							</span> Upload Signature
							</label>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="operatorDate"
									value="<%=Validator.isNotNull(radiationDecData)&&Validator.isNotNull(radiationDecData.getOperatorDate())?new SimpleDateFormat("yyyy-MM-dd").format(radiationDecData.getOperatorDate()):""%>" placeholder="">
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo(); radiationDeclaration(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right service-button">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"> 
			                        <pathd ="m6.00016 11.17l1.83016=""
							6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
							1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
			                       </svg>
				</span>
			</button>
		</div>