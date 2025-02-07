<%@page import="com.nbp.hsra.application.service.model.SpecificReqPropLicActivity"%>
<%@page import="com.nbp.hsra.application.service.service.SpecificReqPropLicActivityLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationDeclarationLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationDeclaration"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationSafetyLowRisk"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationSafetyLowRiskLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationSafetyProgram"%>
<%@page import="com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.PurposeOfPropLicence"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.DetailOfBusinessSecThree"%>
<%@page import="com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil"%>
<%@page import="com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalService"%>
<%@page import="com.nbp.hsra.application.service.model.RadiationProtectionSecOne"%>
<%@ include file="../init.jsp" %>
<%
RadiationProtectionSecOne sectionOne=null;
RadiationSafetyLowRisk lowRiskSafety = null;
DetailOfApplicantSecTwo sectionTwo=null;
DetailOfBusinessSecThree sectionThree=null;
PurposeOfPropLicence purposeOfPropLiceData=null;
RadiationSafetyProgram radiationSafetyData=null;
long unsealedSourceAddCounter=1;
long radiationDevicesCounter=1;
String radiationDeclaration="";
String unsealedCopy="";
String sealedCopy="";
String RadDeviceCopy="";
long sealedSourcesAddCounter=1;
String financialGuarantee="";
FileEntry attachDocFE=null;

if(hsraApplicationId>0){
	try {
		 supportingDocumentsParentFolder1 = DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
				"Signature of Representative");
		fileEntry2  = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolder1.getFolderId());
		for (DLFileEntry dlFileEntry : fileEntry2 ) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			fileUrlOfRegistration=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			
		}
	} catch (Exception e) {}
	 try{
		 supportingDocumentsParentFolder1=DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
						 supportingDocumentsFolder1.getFolderId(),
							"Financial Guarantee");
				 fileEntry2 =  DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder1.getFolderId());
					for (DLFileEntry dlFileEntry : fileEntry2 ) {
						financialGuarantee=dlFileEntry.getFileName();
					}
		}catch(Exception e){}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Classification of Workers");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryclassificationOfWork = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				classificationOfWork=fileEntryclassificationOfWork.getFileName();
				classificationOfWorkUrl=DLURLHelperUtil.getDownloadURL(fileEntryclassificationOfWork,
						fileEntryclassificationOfWork.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}} 
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Radiation Protection Program");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryradiationPro = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				radiationPro=fileEntryradiationPro.getFileName();
				radiationProUrl=DLURLHelperUtil.getDownloadURL(fileEntryradiationPro,
						fileEntryradiationPro.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Scope of Activities");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryscopeOfActivity = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				scopeOfActivity=fileEntryscopeOfActivity.getFileName();
				scopeOfActivityUrl=DLURLHelperUtil.getDownloadURL(fileEntryscopeOfActivity,
						fileEntryscopeOfActivity.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Management System");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrymanagementSystem = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				managementSystem=fileEntrymanagementSystem.getFileName();
				managementSystemUrl=DLURLHelperUtil.getDownloadURL(fileEntrymanagementSystem,
						fileEntrymanagementSystem.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Recording Doses");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryworkerRecording = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				workerRecording=fileEntryworkerRecording.getFileName();
				workerRecordingUrl=DLURLHelperUtil.getDownloadURL(fileEntryworkerRecording,
						fileEntryworkerRecording.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Dose Limit Optimization");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryconstraintSlimits = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				constraintSlimits=fileEntryconstraintSlimits.getFileName();
				constraintSlimitsUrl=DLURLHelperUtil.getDownloadURL(fileEntryconstraintSlimits,
						fileEntryconstraintSlimits.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "maintenance of individual");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryequipmentMonitoring = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				equipmentMonitoring=fileEntryequipmentMonitoring.getFileName();
				equipmentMonitoringUrl=DLURLHelperUtil.getDownloadURL(fileEntryequipmentMonitoring,
						fileEntryequipmentMonitoring.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Workplace Monitoring");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryareaControl = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				areaControl=fileEntryareaControl.getFileName();
				areaControlUrl=DLURLHelperUtil.getDownloadURL(fileEntryareaControl,
						fileEntryareaControl.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Classification Control");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryclassificationArea = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				classificationArea=fileEntryclassificationArea.getFileName();
				classificationAreaUrl=DLURLHelperUtil.getDownloadURL(fileEntryclassificationArea,
						fileEntryclassificationArea.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Control of radioactive");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryradioactiveSource = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				radioactiveSource=fileEntryradioactiveSource.getFileName();
				radioactiveSourceUrl=DLURLHelperUtil.getDownloadURL(fileEntryradioactiveSource,
						fileEntryradioactiveSource.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Radiation detection instrum");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryradiationInstrument = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				radiationInstrument=fileEntryradiationInstrument.getFileName();
				radiationInstrumentUrl=DLURLHelperUtil.getDownloadURL(fileEntryradiationInstrument,
						fileEntryradiationInstrument.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Health Surveillance of Workers");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryhealthWork = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				healthWork=fileEntryhealthWork.getFileName();
				healthWorkUrl=DLURLHelperUtil.getDownloadURL(fileEntryhealthWork,
						fileEntryhealthWork.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Investigation Levels");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryinvestigationLevel = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				investigationLevel=fileEntryinvestigationLevel.getFileName();
				investigationLevelUrl=DLURLHelperUtil.getDownloadURL(fileEntryinvestigationLevel,
						fileEntryinvestigationLevel.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Record Reporting System");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryrecordReporting = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				recordReporting=fileEntryrecordReporting.getFileName();
				recordReportingUrl=DLURLHelperUtil.getDownloadURL(fileEntryrecordReporting,
						fileEntryrecordReporting.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Access control and security");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrysecurityAccess = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				securityAccess=fileEntrysecurityAccess.getFileName();
				securityAccessUrl=DLURLHelperUtil.getDownloadURL(fileEntrysecurityAccess,
						fileEntrysecurityAccess.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Controlling possession");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryraditionSource = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				raditionSource=fileEntryraditionSource.getFileName();
				raditionSourceUrl=DLURLHelperUtil.getDownloadURL(fileEntryraditionSource,
						fileEntryraditionSource.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Worker Training");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryworkTraninig = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				workTraninig=fileEntryworkTraninig.getFileName();
				workTraninigUrl=DLURLHelperUtil.getDownloadURL(fileEntryworkTraninig,
						fileEntryworkTraninig.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Control of Public Exposure");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrypublicControl = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				publicControl=fileEntrypublicControl.getFileName();
				publicControlUrl=DLURLHelperUtil.getDownloadURL(fileEntrypublicControl,
						fileEntrypublicControl.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Emergency Procedures");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrysafetyEmergency1 = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				safetyEmergency1=fileEntrysafetyEmergency1.getFileName();
				safetyEmergencyUrl=DLURLHelperUtil.getDownloadURL(fileEntrysafetyEmergency1,
						fileEntrysafetyEmergency1.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Low As Reasonably Achievable");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrylowAchievable = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				lowAchievable=fileEntrylowAchievable.getFileName();
				lowAchievableUrl=DLURLHelperUtil.getDownloadURL(fileEntrylowAchievable,
						fileEntrylowAchievable.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Leak testing of sealed sources");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryleakTesting = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				leakTesting=fileEntryleakTesting.getFileName();
				leakTestingUrl=DLURLHelperUtil.getDownloadURL(fileEntryleakTesting,
						fileEntryleakTesting.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Transfer of radiation sources");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrytransferSource = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				transferSource=fileEntrytransferSource.getFileName();
				transferSourceUrl=DLURLHelperUtil.getDownloadURL(fileEntrytransferSource,
						fileEntrytransferSource.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Nuclear Materials Transfer");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrynuclearMaterial = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				nuclearMaterial=fileEntrynuclearMaterial.getFileName();
				nuclearMaterialUrl=DLURLHelperUtil.getDownloadURL(fileEntrynuclearMaterial,
						fileEntrynuclearMaterial.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Packaging Transfer Material");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrypackagingTransfer = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				packagingTransfer=fileEntrypackagingTransfer.getFileName();
				packagingTransferUrl=DLURLHelperUtil.getDownloadURL(fileEntrypackagingTransfer,
						fileEntrypackagingTransfer.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Safety Internal review");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntrysafetyInternal = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				safetyInternal=fileEntrysafetyInternal.getFileName();
				safetyInternalUrl=DLURLHelperUtil.getDownloadURL(fileEntrysafetyInternal,
						fileEntrysafetyInternal.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try{
			supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder1.getFolderId(), "Append Safety Assessment");
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
		} catch (Exception e) {}
		if (fileEntry2 != null) {
			for (DLFileEntry uploadedFile : fileEntry2) {
				fileEntryappendSafety = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				appendSafety=fileEntryappendSafety.getFileName();
				appendSafetyUrl=DLURLHelperUtil.getDownloadURL(fileEntryappendSafety,
						fileEntryappendSafety.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Copy of the curriculum vitae");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryexperiencecopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			experiencecopy=fileEntryexperiencecopy.getFileName();
			experiencecopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryexperiencecopy,
					fileEntryexperiencecopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}} 
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Copies of relevant");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrycertificatescopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			certificatescopy=fileEntrycertificatescopy.getFileName();
			certificatescopyUrl=DLURLHelperUtil.getDownloadURL(fileEntrycertificatescopy,
					fileEntrycertificatescopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}} 
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Details of Qualified Expert ");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryqualifiedcopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			qualifiedcopy=fileEntryqualifiedcopy.getFileName();
			qualifiedcopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryqualifiedcopy,
					fileEntryqualifiedcopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}} 
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Curriculum Vitae Copy");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrycurriculumcopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			curriculumVitaeCopy=fileEntrycurriculumcopy.getFileName();
			curriculumcopyUrl=DLURLHelperUtil.getDownloadURL(fileEntrycurriculumcopy,
					fileEntrycurriculumcopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}} 
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Safety Decommissioning");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrylicenceLocation = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			licenceLocation=fileEntrylicenceLocation.getFileName();
			licenceLocationUrl=DLURLHelperUtil.getDownloadURL(fileEntrylicenceLocation,
					fileEntrylicenceLocation.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Certificate Cv");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrycertificateCv = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			certificateCv=fileEntrycertificateCv.getFileName();
			certificateCvUrl=DLURLHelperUtil.getDownloadURL(fileEntrycertificateCv,
					fileEntrycertificateCv.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Resume Copy");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryresumeCopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			resumeCopy=fileEntryresumeCopy.getFileName();
			resumeCopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryresumeCopy,
					fileEntryresumeCopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Training Copy");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrytrainingCopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			trainingCopy=fileEntrytrainingCopy.getFileName();
			trainingCopyUrl=DLURLHelperUtil.getDownloadURL(fileEntrytrainingCopy,
					fileEntrytrainingCopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Relevant Cv Copy");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryrelevantCopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			relevantCopy=fileEntryrelevantCopy.getFileName();
			relevantCopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryrelevantCopy,
					fileEntryrelevantCopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Relevant Cv Copy");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntryqualifiedCopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			qualifiedCopy=fileEntryqualifiedCopy.getFileName();
			qualifiedCopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryqualifiedCopy,
					fileEntryqualifiedCopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
	try{
		supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsFolder1.getFolderId(), "Training Expert");
		fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
	} catch (Exception e) {}
	if (fileEntry2 != null) {
		for (DLFileEntry uploadedFile : fileEntry2) {
			fileEntrytrainingExpert = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
			trainingExpert=fileEntrytrainingExpert.getFileName();
			trainingExpertUrl=DLURLHelperUtil.getDownloadURL(fileEntrytrainingExpert,
					fileEntrytrainingExpert.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
		try {
			sectionOne = RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			sectionTwo = DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			sectionThree = DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			purposeOfPropLiceData = PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			radiationSafetyData = RadiationSafetyProgramLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		try {
			lowRiskSafety = RadiationSafetyLowRiskLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
	 }
%>
<div class="nuclear-safety-forms hide">
	<div class="tab-content pl-lg-4">
		<div class="tab-pane" role="tabpanel" id="childStep1">
			<div class="tab-form">
				<div class="nuclear-safety-forms-details">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Nuclear Safety and Radiation
								Protection Application Form</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-main-heading mt-3">
								<b> Section 38 of the NSRP Act, 2015 states that "every person who engages or proposes to engage in a prescribed activity shall apply, subject to subsection (4) in the prescribed form and manner to the Authority for the appropriate authorization." HSRA may require additional information that it considers necessary to determine the application, (Section 38(3) of NSRP Act, 2015). To ensure compliance with the NSRP Act, 2015 and associated Regulations, the Authority has amended the NSRP Application Form that is found in the second schedule of the NSRP Regulations, 2019 to produce the form below.</b>
							</p>
						</div>
						<div class="col-md-12">
							<p class="tab-form-sub-heading mt-3">
								<b>Instructions:</b> Kindly complete all applicable sections of this application form and submit to the HSRA along with a copy of receipt for fees paid, completed Fit and Proper Questionnaire, a certified copy of the legal operator's valid national ID and all supporting documents stipulated in the guidance document. Additionally, a Declaration Form is to be completed and submitted if radioactive material or nuclear material is being used on premises that are leased. For construction of new facilities that will use sources of Categories 1 and 2, an Environmental Impact Assessment (EIA) is also to be submitted.
							</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">For the purpose of this application;</p>
						</div>
						<div class="col-md-12">
							<ul class="list-group tab-form-sub-heading">
								<li class="list-group-item">
									<p class="tab-form-sub-heading">
										<b>"Radiation Source"</b> means a radiation generator, a radioactive source or other radioactive material.
									</p>
								</li>
								<li class="list-group-item">
									<p class="tab-form-sub-heading">
										<b>"Nuclear Material"</b> means thorium, uranium or an element with an atomic number greater than 92; a derivative or compound of thorium, uranium or of an element with an atomic number greater than 92.
									</p>
								</li>
								<li class="list-group-item">
									<p class="tab-form-sub-heading">
										<b>"Low Risk"</b> in relation to any activity or practice means that the possibility of suffering harm from or loss due to exposure to ionizing radiation is low. See Appendix 1 for categorization and classification of sources.
									</p>
								</li>
								<li class="list-group-item mb-4">
									<p class="tab-form-sub-heading">
										<b>Note:</b> Processing of applications will not commence until the completed application form, proof of payment and all required documents have been submitted to the HSRA. Once all required documents have been submitted to the HSRA, the Applicant will receive a response from the Authority within <b>14 days</b> of receipt.
									</p>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep2">
			<div class="tab-form">
				<div class="section-first-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section I</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Type of Application</p>
								<div class="wizard-form-radio d-block">
									<input value="New Licence" type="radio" name="applicationType" placeholder="" id="newLicence"> <label for="applicationType">New Licence</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Permit" type="radio" name="applicationType" placeholder="" id="permit"> <label for="applicationType">Permit</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="New Registration" type="radio" name="applicationType" placeholder="" id="newRegistration"> <label for="applicationType">New Registration</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Renewal" type="radio" name="applicationType" placeholder="" id="renewal"> <label for="applicationType">Renewal</label>
								</div>
								<div class="wizard-form-radio d-block">
									<input value="Amendment" type="radio" name="applicationType" placeholder="" id="amendent"> <label for="applicationType">Amendment</label>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading" for="Authorization Number">Current Authorization Number</p>
								<input type="text" class="form-control" id="currentAuthorizationNo" value="<%=Validator.isNotNull(sectionOne)&&Validator.isNotNull(sectionOne.getCurrentAuthNum())?sectionOne.getCurrentAuthNum():"" %>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Reason for Amendment</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="amendmentReason" placeholder="Reason for Amendment" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionOne)&&Validator.isNotNull(sectionOne.getReasonForAmendment())?sectionOne.getReasonForAmendment():"" %></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="applicantInfo();radiationSectionOneHsraApplication(false);" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right"> Continue to the next form section
				<span class="ml-2"> 
				  <svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep3">
			<div class="tab-form">
				<div class="section-third-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section II</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 mb-0">Details of Applicant</p>
							<p class="tab-form-sub-heading">(Provide information for the organization that is to be authorized.)</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>Name of Organization*
								</p>
								<input type="text" class="form-control mt-3" id="organizationName" placeholder="Name of Organization" value="<%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getOrganizationName())?sectionTwo.getOrganizationName():"" %>">
								<p class="tab-form-sub-heading fieldAlert hide" id="organizationNameValidation" style="color: red;">Enter a Name of Organization</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>Mailing Address
								</p>
								<textarea rows="3" class="form-control" maxlength="255" id="nuclearMailingAddress" placeholder="Mailing Address" spellcheck="false"><%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getNuclearMailingAddr())?sectionTwo.getNuclearMailingAddr():"" %></textarea>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="nuclearMailingParish">
										<option value="" selected="" disabled="">Choose Parish</option>
										<option value="Kingston"<%=sectionTwo!=null?sectionTwo.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
					                    <option value="St. Andrew"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
					                    <option value="Manchester"<%=sectionTwo!=null?sectionTwo.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
					                    <option value="St. Catherine"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
					                    <option value="St. Thomas"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
					                    <option value="St. Mary"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
					                    <option value="Portland"<%=sectionTwo!=null?sectionTwo.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
					                    <option value="St. Ann"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
					                    <option value="Trelawny"<%=sectionTwo!=null?sectionTwo.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
					                    <option value="St. James"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
					                    <option value="Hanover"<%=sectionTwo!=null?sectionTwo.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
					                    <option value="Westmoreland"<%=sectionTwo!=null?sectionTwo.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
					                    <option value="St. Elizabeth"<%=sectionTwo!=null?sectionTwo.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					                    <option value="Clarendon"<%=sectionTwo!=null?sectionTwo.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">
									<span class="tab-form-highlghtme-link pr-2">(c) </span>Organization's T.R.N
								</p>
								<input type="text" class="form-control" id="nuclearTrnNumber" value="<%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getNuclearTrnNumber())?sectionTwo.getNuclearTrnNumber():"" %>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">
									<span class="tab-form-highlghtme-link pr-2">(d) </span>Telephone
								</p>
								<input type="text" class="form-control" id="nuclearTelephoneNo" value="<%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getNuclearTelephoneNo())?sectionTwo.getNuclearTelephoneNo():"" %>" oninput="formatPhoneNumber(this);" placeholder="+1 876-876-1234">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Fax Number</p>
								<input type="text" class="form-control" id="nuclearFaxNo" value="<%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getNuclearFaxNo())?sectionTwo.getNuclearFaxNo():"" %>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(e) </span>Email Address*
								</p>
								<input type="text" class="form-control" id="nuclearEmailAddress" value="<%=Validator.isNotNull(sectionTwo)&&Validator.isNotNull(sectionTwo.getNuclearEmailAddr())?sectionTwo.getNuclearEmailAddr():"" %>" placeholder="info@companyname.jm">
								<p class="tab-form-sub-heading fieldAlert hide" id="nuclearEmailAddressValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="applicantDetailSecTwoHsraApplication(false);" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right"> Continue to the next form section 
				<span class="ml-2"> 
					<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep4">
			<div class="tab-form">
				<div class="section-third-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section III</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Details of Business</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>Type of Business
								</p>
								<input type="text" class="form-control" id="businessType" name="businessType" placeholder="" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getBusinessType())?sectionThree.getBusinessType():""  %>" style="display: none;">
								<p class="tab-form-sub-heading">Separate values with Enter</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b)</span>Proof of Legal Status:
								</p>
								<p class="tab-form-sub-heading mb-0 pl-2">(These supporting documents should be submitted with the application form - Certified Copy of Certificate of Incorporation or Certificate of Registration of Business or charter and Certified Copy of Valid Photo Identification for Authorized Signatories.)</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Business Number</p>
								<input type="text" class="form-control" id="nuclearBusinessNumber" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearBusinessNumber())?sectionThree.getNuclearBusinessNumber():""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Corporation Number</p>
								<input type="text" class="form-control" id="nuclearCorporationNumber" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearCorporationNum())?sectionThree.getNuclearCorporationNum():""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">For Public Institutions, specify the enabling legislation (Act)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="nuclearPublicAct" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearPublicAct())?sectionThree.getNuclearPublicAct():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(c)</span>Financial Contact Person
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Name*</p>
								<input type="text" class="form-control" id="nuclearName" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearName())?sectionThree.getNuclearName():""%>" placeholder="">
								<p class="tab-form-sub-heading fieldAlert hide" id="nuclearNameValidation" style="color: red;">Enter a Name</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">Address</p>
								<textarea rows="3" class="form-control" maxlength="255" id="nuclearAddressThird" placeholder="" spellcheck="false"><%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearAddressThird())?sectionThree.getNuclearAddressThird():""%></textarea>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Parish</p>
								<div class="select-wrapper position-relative">
									<select class="form-select form-control" id="nuclearThirdParish">
										<option value="" selected="" disabled="">Choose Parish</option>
										<option value="Kingston"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
					                    <option value="St. Andrew"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
					                    <option value="Manchester"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
					                    <option value="St. Catherine"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
					                    <option value="St. Thomas"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
					                    <option value="St. Mary"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
					                    <option value="Portland"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
					                    <option value="St. Ann"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
					                    <option value="Trelawny"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
					                    <option value="St. James"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
					                    <option value="Hanover"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
					                    <option value="Westmoreland"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
					                    <option value="St. Elizabeth"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
					                    <option value="Clarendon"<%=sectionThree!=null?sectionThree.getNuclearThirdParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
									</select>
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Telephone</p>
								<input type="text" class="form-control" id="nuclearTelephoneNum" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearTelephoneNum())?sectionThree.getNuclearTelephoneNum():""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading" for="">Fax Number</p>
								<input type="text" class="form-control" id="nuclearfaxNumber" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearfaxNumber())?sectionThree.getNuclearfaxNumber():""%>" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address*</p>
								<input type="text" class="form-control" id="nuclearEmailAdd" value="<%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearEmailAdd())?sectionThree.getNuclearEmailAdd():""%>" placeholder="info@companyname.jm">
								<p class="tab-form-sub-heading fieldAlert hide" id="nuclearEmailAddValidation" style="color: red;">Enter a valid E-mail Address</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(d)</span>Financial Guarantee
								</p>								
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach File</p>
												</div>
												<div class="right">
													<input type="file" id="financialGuaranteeUpload" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>financialGuaranteeUpload"> 
													<label class="custom-upload" for="financialGuaranteeUpload"> 
														<span class="mr-2"> 
															<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
														</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(financialGuarantee)){%>
												<span class="attach-detailed-overview"><%=financialGuarantee%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-3 pl-2">(Provide information regarding the value and form of the financial guarantee, if required by the Authority.)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="nuclearFinancialGuarantee" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(sectionThree)&&Validator.isNotNull(sectionThree.getNuclearFinancial())?sectionThree.getNuclearFinancial():""%></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName" onclick="detailOfBusinessSecThree(false);" class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section 
				<span class="ml-2"> 
					<svg width="18" height="14" viewBox="0 0 18 14" fill="none" xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep5">
			<div class="tab-form">
				<div class="section-four-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section IV</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Purpose of Proposed Registration/licence</p>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>Registration/License Activities
								</p>
								<input type="text" class="form-control" id="nuclearRegistrationLicence" value="<%=Validator.isNotNull(purposeOfPropLiceData)&&Validator.isNotNull(purposeOfPropLiceData.getNuclearRegstLic())?purposeOfPropLiceData.getNuclearRegstLic():""%>" placeholder="" disabled>
								<p class="tab-form-sub-heading">(This application does NOT cover Import/Export activities)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b) </span>Location
										</p>
										<p class="tab-form-sub-heading">
											<span class="pr-2">(i) </span>Address of place of business
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="nuclearBusinessPlace" placeholder="" spellcheck="false"><%=Validator.isNotNull(purposeOfPropLiceData)&&Validator.isNotNull(purposeOfPropLiceData.getNuclearBusinessPlace())?purposeOfPropLiceData.getNuclearBusinessPlace():""%></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-sub-heading">
											<span class="pr-2">(ii) </span>Main address of storage and/ or use/ or any other activity
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="nuclearActivityMainAdd" placeholder="" spellcheck="false"><%=Validator.isNotNull(purposeOfPropLiceData)&&Validator.isNotNull(purposeOfPropLiceData.getNuclearActivityMainAdd())?purposeOfPropLiceData.getNuclearActivityMainAdd():""%></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<div class="wizard-form-radio d-block">
											<input value="Used at" type="radio" name="applicationTypeLoc"<%=purposeOfPropLiceData!=null &&purposeOfPropLiceData.getApplicationType().contains("Used at")?"checked":StringPool.BLANK%> placeholder=""> 
											<label for="applicationType">Used at</label>
										</div>
										<div class="wizard-form-radio d-block">
											<input value="Stored at" type="radio" name="applicationTypeLoc"<%=purposeOfPropLiceData!=null &&purposeOfPropLiceData.getApplicationType().contains("Stored at")?"checked":StringPool.BLANK%> placeholder=""> 
											<label for="applicationType">Stored at</label>
										</div>
										<div class="wizard-form-radio d-block">
											<input value="Both" type="radio" name="applicationTypeLoc"<%=purposeOfPropLiceData!=null &&purposeOfPropLiceData.getApplicationType().contains("Both")?"checked":StringPool.BLANK%> placeholder=""> <label for="applicationType">Both</label>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(c) </span>Additional information regarding other locations of storage and/or use
								</p>
								<textarea rows="3" class="form-control" maxlength="255" id="nuclearAdditionalLocation" placeholder="" spellcheck="false"><%=Validator.isNotNull(purposeOfPropLiceData)&&Validator.isNotNull(purposeOfPropLiceData.getNuclearAdditionalLoc())?purposeOfPropLiceData.getNuclearAdditionalLoc():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<input id="unsealedSourcesDetailVal" type="hidden" name="unsealedSourcesDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian" id="unsealedSourcesDetailBox">
									<div class="accordion__header is-active" id="unsealedSourcesDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>(d) Unsealed Sources (Append copy of all standard certificates)</h2>
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
												<div class="supporting-document-card my-3">
													<div class="row">
														<div class="col-md-12">
															<div class="supporting-document-card-wrapper">
																<div class="left">
																	<p class="supporting-document-card-upper-heading">Attach File</p>
																</div>
																<div class="right">
																	<input type="file" id="unsealedCertiCopy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>unsealedCertiCopy"> <label class="custom-upload" for="unsealedCertiCopy"> 
																	<span class="mr-2"> 
																		<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																	</span>Upload
																	</label>
																</div>
															</div>
															<span class="attach-detailed-overview"><%=(Validator.isNotNull(unsealedCopy))?unsealedCopy:""%></span>
														</div>
													</div>
												</div>
												<p class="tab-form-sub-heading"> Append additional source details where required. For sources to be added to existing licence and/or requests for removal from regulatory control, complete and append <b>Amendment of Inventory Form.</b>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Radionuclide</p>
													<input type="text" class="form-control" id="unsealedSourcesRadionuclide" value="" placeholder="">	
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Maximum Activity in possession at any one time</p>
													<input type="text" class="form-control" id="unsealedSourcesActivity" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Total Activity to be acquired per year</p>
													<input type="text" class="form-control" id="unsealedSourcesTotalYear" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Use</p>
													<input type="text" class="form-control" id="unsealedSourcesUse" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee" id="addUnsealedSourcesDetail" onclick="addUnsealedSourcesDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addUnsealedSourcesDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addUnsealedSourcesDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Radionuclide</th>
											<th class="sub_heading text-nowrap">Maximum Activity in possession at any one time</th>
											<th class="sub_heading text-nowrap">Total Activity to be acquired per year</th>
											<th class="sub_heading text-nowrap">Use</th>
											<th class="sub_heading text-nowrap">Attach File Details</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
				<%
					 if(Validator.isNotNull(unsealedSourceAdd)&&unsealedSourceAdd.size()>0){
							for(UnsealedSourceAdd unsealedAddInfo:unsealedSourceAdd){ 
						FileEntry attachDocFE1=null;
						unsealedCopy="";      
						 try {
				         	supportingDocumentsParentFolder1 = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
									"Unsealed Certificate Copy"+unsealedSourceAddCounter);
							fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
									supportingDocumentsParentFolder1.getFolderId());
							for (DLFileEntry dlFileEntry : fileEntry2) {
								attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
								unsealedCopy=attachDocFE1.getFileName();
							}
						} catch (Exception e) {}
						%>
<tr class="unsealed-sources-row<%=unsealedSourceAddCounter%>">
	<td class="sub_heading_content unsealedSourcesRadionuclide<%=unsealedSourceAddCounter%>">
	<%=Validator.isNotNull(unsealedAddInfo)&&Validator.isNotNull(unsealedAddInfo.getUnsealedSourcesRadionu())?unsealedAddInfo.getUnsealedSourcesRadionu():""%></td>
	<td class="sub_heading_content unsealedSourcesActivity<%=unsealedSourceAddCounter%>">
	<%=Validator.isNotNull(unsealedAddInfo)&&Validator.isNotNull(unsealedAddInfo.getUnsealedSourcesActivity())?unsealedAddInfo.getUnsealedSourcesActivity():""%></td>
	<td class="sub_heading_content unsealedSourcesTotalYear<%=unsealedSourceAddCounter%>">
	<%=Validator.isNotNull(unsealedAddInfo)&&Validator.isNotNull(unsealedAddInfo.getUnsealedSourcesTotalYear())?unsealedAddInfo.getUnsealedSourcesTotalYear():""%></td>
	<td class="sub_heading_content unsealedSourcesUse<%=unsealedSourceAddCounter%>">
	<%=Validator.isNotNull(unsealedAddInfo)&&Validator.isNotNull(unsealedAddInfo.getUnsealedSourcesUse())?unsealedAddInfo.getUnsealedSourcesUse():""%></td>
	<td class="sub_heading_content">
			<a class="file-info sub_heading_content unsealedCertiCopy<%=unsealedSourceAddCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(unsealedCopy))?unsealedCopy:""%></a>
	</td> 
	<td> 
		<span> 
			<a href="javascript:void(0)" id="unsealedSourcesEditTab" onclick="unsealedSourcesEditTab('<%=unsealedSourceAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="unsealedSourcesDetailDeleteDataTab" onclick="unsealedSourcesDetailDeleteData('<%=unsealedSourceAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="unsealedSourcesDetailId<%=unsealedSourceAddCounter%>" name="unsealedSourcesDetailId<%=unsealedSourceAddCounter%>" value="<%=unsealedAddInfo.getUnsealedSourceAddId()%>">
							<%
							unsealedSourceAddCounter++;
 }}
						%>	
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<input id="sealedSourcesDetailVal" type="hidden" name="sealedSourcesDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian" id="sealedSourcesDetailBox">
									<div class="accordion__header is-active" id="sealedSourcesDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>(e) Sealed Sources (NOT included in radiation device)</h2>
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
												<div class="supporting-document-card my-3">
													<div class="row">
														<div class="col-md-12">
															<div class="supporting-document-card-wrapper">
																<div class="left">
																	<p class="supporting-document-card-upper-heading">Attach File</p>
																</div>
																<div class="right">
																	<input type="file" id="sealedSourceRadDevice" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>sealedSourceRadDevice"> 
																	<label class="custom-upload" for="sealedSourceRadDevice"> 
																		<span class="mr-2"> 
																		 <svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																		</span>Upload
																	</label>
																</div>
															</div>
															<span class="attach-detailed-overview"><%=(Validator.isNotNull(sealedCopy))?sealedCopy:""%></span>
														</div>
													</div>
												</div>
												<p class="tab-form-sub-heading"> (Append copy of all standard certificates)<br /> Append additional source details where required. Complete and append <b>Amendment of Inventory Form</b> for sources to be added to existing licence and/or requests for removal from regulatory control.													</p>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Radionuclide</p>
													<input type="text" class="form-control" id="sealedSourcesRadionuclide" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Maximum Activity to be contained in any single source</p>
													<input type="text" class="form-control" id="sealedSourcesMaxActivity" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Activity Date</p>
													<input type="date" class="form-control" id="sealedSourcesActivityDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Number of sealed sources - Categories 1, 2 and 3 to be acquired</p>
													<input type="text" class="form-control" id="sealedSourcesCategories" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Use</p>
													<input type="text" class="form-control" id="sealedSourcesUse" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee" id="addSealedSourcesDetail" onclick="addSealedSourcesDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addSealedSourcesDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addSealedSourcesDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Radionuclide</th>
											<th class="sub_heading text-nowrap">Maximum Activity to be contained in any single source</th>
											<th class="sub_heading text-nowrap">Activity Date</th>
											<th class="sub_heading text-nowrap">Number of sealed sources - Categories 1, 2 and 3 to be acquired</th>
											<th class="sub_heading text-nowrap">Use</th>
											<th class="sub_heading text-nowrap">Attach File Details</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
				<%
	 if(Validator.isNotNull(sealedSourcesAdd)&&sealedSourcesAdd.size()>0){
			for(SealedSourcesAdd sealedSourcesInfo:sealedSourcesAdd){ 
		FileEntry attachDocFE3=null;
		sealedCopy="";      
		 try {
         	supportingDocumentsParentFolder1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"SealedSource Certificate Copy"+sealedSourcesAddCounter);
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE3 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				sealedCopy=attachDocFE3.getFileName();
			}} catch (Exception e) {}
		%>
<tr class="sealed-sources-row<%=sealedSourcesAddCounter%>">
	<td class="sub_heading_content sealedSourcesRadionuclide<%=sealedSourcesAddCounter%>">
	<%=Validator.isNotNull(sealedSourcesInfo)&&Validator.isNotNull(sealedSourcesInfo.getSealedSourcesRadionu())?sealedSourcesInfo.getSealedSourcesRadionu():""%>
	</td>
	<td class="sub_heading_content sealedSourcesMaxActivity<%=sealedSourcesAddCounter%>">
	<%=Validator.isNotNull(sealedSourcesInfo)&&Validator.isNotNull(sealedSourcesInfo.getSealedSourcesMaxActivity())?sealedSourcesInfo.getSealedSourcesMaxActivity():""%></td>
	<td class="sub_heading_content sealedSourcesActivityDate<%=sealedSourcesAddCounter%>">
	<%=Validator.isNotNull(sealedSourcesInfo)&&Validator.isNotNull(sealedSourcesInfo.getSealedSourcesActivityDate())?new SimpleDateFormat("yyyy-MM-dd").format(sealedSourcesInfo.getSealedSourcesActivityDate()):""%></td>
	<td class="sub_heading_content sealedSourcesCategories<%=sealedSourcesAddCounter%>">
	<%=Validator.isNotNull(sealedSourcesInfo)&&Validator.isNotNull(sealedSourcesInfo.getSealedSourcesCategories())?sealedSourcesInfo.getSealedSourcesCategories():""%></td>
	<td class="sub_heading_content sealedSourcesUse<%=sealedSourcesAddCounter%>">
	<%=Validator.isNotNull(sealedSourcesInfo)&&Validator.isNotNull(sealedSourcesInfo.getSealedSourcesUse())?sealedSourcesInfo.getSealedSourcesUse():""%></td>
	<td class="sub_heading_content">
			<a class="file-info sub_heading_content sealedSourceRadDevice<%=sealedSourcesAddCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(sealedCopy))?sealedCopy:""%></a>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="sealedSourcesEditTab" onclick="sealedSourcesEditTab('<%=sealedSourcesAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="sealedSourcesDetailDeleteDataTab" onclick="sealedSourcesDetailDeleteData('<%=sealedSourcesAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="sealedSourcesDetailId<%=sealedSourcesAddCounter%>" name="sealedSourcesDetailId<%=sealedSourcesAddCounter%>" value="<%=sealedSourcesInfo.getSealedSourcesAddId()%>">
							<%
							sealedSourcesAddCounter++;
							}
 }
						%>						
</tbody>
					</table>
							</div>
						</div>
						<div class="col-md-12">
							<input id="radiationDevicesDetailVal" type="hidden" name="radiationDevicesDetailVal" value="1">
							<div class="">
								<div class="accordion secured-accordian" id="radiationDevicesDetailBox">
									<div class="accordion__header is-active" id="radiationDevicesDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>(f) Radiation Devices (Append copy of all standard certificates)</h2>
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
												<div class="supporting-document-card my-3">
													<div class="row">
														<div class="col-md-12">
															<div class="supporting-document-card-wrapper">
																<div class="left">
																	<p class="supporting-document-card-upper-heading">Attach File</p>
																</div>
																<div class="right">
																	<input type="file" id="radDeviceCeritificateCopy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>radDeviceCeritificateCopy"> 
																	<label class="custom-upload" for="radDeviceCeritificateCopy"> 
																		<span class="mr-2"> 
																			<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																		</span>Upload
																	</label>
																</div>
															</div>
															<span class="attach-detailed-overview"><%=(Validator.isNotNull(RadDeviceCopy))?RadDeviceCopy:""%></span>
														</div>
													</div>
												</div>
												<p class="tab-form-sub-heading">Append additional source details where required. For sources to be added to existing licence and/or requests for removal from regulatory control, complete and append <b>Amendment of Inventory Form.</b>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Radio-nuclide</p>
													<input type="text" class="form-control" id="radiationDevicesRadio" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Maximum Activity</p>
													<input type="text" class="form-control" id="radiationDevicesMaxActivity" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Manufacturer</p>
													<input type="text" class="form-control" id="radiationDevicesManufacturer" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Type and Name of device</p>
													<input type="text" class="form-control" id="radiationDevicesName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Model Number</p>
													<input type="text" class="form-control" id="radiationDevicesModelNo" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">No. of devices</p>
													<input type="text" class="form-control" id="radiationDevicesNumber" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12">
												<div class="form-group">
													<p class="tab-form-main-heading">Use</p>
													<input type="text" class="form-control" id="radiationDevicesUse" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee" id="addRadiationDevicesDetail" onclick="addRadiationDevicesDetail();"> <span>+1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addRadiationDevicesDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addRadiationDevicesDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Radio-nuclide</th>
											<th class="sub_heading text-nowrap">Maximum Activity</th>
											<th class="sub_heading text-nowrap">Manufacturer</th>
											<th class="sub_heading text-nowrap">Type and Name of device</th>
											<th class="sub_heading text-nowrap">Model Number</th>
											<th class="sub_heading text-nowrap">No.of devices</th>
											<th class="sub_heading text-nowrap">Use</th>
											<th class="sub_heading text-nowrap">Attach File Details</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
<%
	 if(Validator.isNotNull(sealedSourcesAdd)&&sealedSourcesAdd.size()>0){
		 for(RadiationDevicesAdd radiationDevicesinfo:radiationDevicesAdd){ 
		FileEntry attachDocFE4=null;
		RadDeviceCopy="";      
		 try {
         	supportingDocumentsParentFolder1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"RadDevice Certificate Copy"+radiationDevicesCounter);
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE4 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				RadDeviceCopy=attachDocFE4.getFileName();
			}} catch (Exception e) {}
		%>
<tr class="radiation-devices-row<%=radiationDevicesCounter%>">
	<td class="sub_heading_content radiationDevicesRadio<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesRadio())?radiationDevicesinfo.getRadiationDevicesRadio():""%>
	</td>
	<td class="sub_heading_content radiationDevicesMaxActivity<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesMaxActivity())?radiationDevicesinfo.getRadiationDevicesMaxActivity():""%></td>
	<td class="sub_heading_content radiationDevicesManufacturer<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesManufacturer())?radiationDevicesinfo.getRadiationDevicesManufacturer():""%></td>
	<td class="sub_heading_content radiationDevicesName<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesName())?radiationDevicesinfo.getRadiationDevicesName():""%></td>
	<td class="sub_heading_content radiationDevicesModelNo<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesModelNo())?radiationDevicesinfo.getRadiationDevicesModelNo():""%></td>
	<td class="sub_heading_content radiationDevicesNumber<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesNumber())?radiationDevicesinfo.getRadiationDevicesNumber():""%></td>
	<td class="sub_heading_content radiationDevicesUse<%=radiationDevicesCounter%>">
	<%=Validator.isNotNull(radiationDevicesinfo)&&Validator.isNotNull(radiationDevicesinfo.getRadiationDevicesUse())?radiationDevicesinfo.getRadiationDevicesUse():""%></td>
	<td class="sub_heading_content">
			<a class="file-info sub_heading_content radDeviceCeritificateCopy<%=radiationDevicesCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(RadDeviceCopy))?RadDeviceCopy:""%></a>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="radiationDevicesEditTab" onclick="radiationDevicesEditTab('<%=radiationDevicesCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="radiationDevicesDetailDeleteDataTab" onclick="radiationDevicesDetailDeleteData('<%=radiationDevicesCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="radiationDevicesDetailId<%=radiationDevicesCounter%>" name="radiationDevicesDetailId<%=radiationDevicesCounter%>" value="<%=radiationDevicesinfo.getRadiationDevicesAddId()%>">
							<%
							radiationDevicesCounter++;
							}}%>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();purposeOfPropLicenceSecFour(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep6">
			<div class="tab-form">
				<div class="section-five-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section V</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2">Radiation Safety
								Program</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) i. Radiation Safety Officer (RSO) Details</span>
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="copy-of-cv" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>copy-of-cv">
														 <label class="custom-upload" for="copy-of-cv"> 
														 	<span class="mr-2"> 
														 		<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(copyofcv)){%>
													<span class="attach-detailed-overview"><%=copyofcv%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading">(Append details of duties and responsibilities associated with RSO's role, copy of CV and relevant RSO training certificates and/ or qualification).</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control" id="nuclearRsoName" value="<%=Validator.isNotNull(radiationSafetyData) && Validator.isNotNull(radiationSafetyData.getNuclearRsoName())? radiationSafetyData.getNuclearRsoName(): ""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control" id="nuclearRsoTitle" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearRsoTitle())?radiationSafetyData.getNuclearRsoTitle():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="nuclearRsoTeleNo" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearRsoTeleNo())?radiationSafetyData.getNuclearRsoTeleNo():""%>" onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Ext</p>
								<input type="text" class="form-control" id="nuclearRsoExt" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearRsoExt())?radiationSafetyData.getNuclearRsoExt():""%>" onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control" id="nuclearRsoFax" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearRsoFax())?radiationSafetyData.getNuclearRsoFax():""%>" onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control" id="nuclearRsoEmail" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearRsoEmail())?radiationSafetyData.getNuclearRsoEmail():""%>" placeholder="info@companyname.jm">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2"> ii.</span> Alternate RSO Details
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i) </span> Detaiof the duties and responsibilities associated with the RSO's role.
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="rsoDetails" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getRsoDetails())?radiationSafetyData.getRsoDetails():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span> Copy of the curriculum vitae or resume of the prospective alternate RSO indicating radiation safety-related experience.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach File</p>
												</div>
												<div class="right">
													<input type="file" id="experience-copy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>experience-copy"> 
													 <label class="custom-upload" for="experience-copy"> 
													 <span class="mr-2"> 
													  	<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(experiencecopy)){%>
													<span class="attach-detailed-overview"><%=experiencecopy%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span> Copies of relevant RSO training certificates of the prospective RSO.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach File</p>
												</div>
												<div class="right">
													<input type="file" id="certificates-copy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>certificates-copy"> 
													<label class="custom-upload" for="certificates-copy"> 
													<span class="mr-2"> 
														<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(certificatescopy)){%>
												<span class="attach-detailed-overview"><%=certificatescopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<input id="alternateRsoDetailVal" type="hidden"
								name="alternateRsoDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian" id="alternateRsoDetailBox">
									<div class="accordion__header is-active" id="alternateRsoDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Alternate RSO Form</h2>
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
													<p class="tab-form-main-heading">RSO Name</p>
													<input type="text" class="form-control" id="alternateRsoName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Title</p>
													<input type="text" class="form-control" id="alternateRsoTitle" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone</p>
													<input type="text" class="form-control" id="alternateRsoTelephone" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Ext</p>
													<input type="text" class="form-control" id="alternateRsoExt" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax</p>
													<input type="text" class="form-control" id="alternateRsoFax" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Email Address</p>
													<input type="text" class="form-control" id="alternateRsoEmailAdd" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee" id="addAlternateRsoDetail" onclick="addAlternateRsoDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addAlternateRsoDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addAlternateRsoDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">RSO Name</th>
											<th class="sub_heading text-nowrap">Title</th>
											<th class="sub_heading text-nowrap">Telephone</th>
											<th class="sub_heading text-nowrap">Ext</th>
											<th class="sub_heading text-nowrap">Fax</th>
											<th class="sub_heading text-nowrap">Email Address</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
<%if(alternateRsoAdd!=null){
	long alternateRsoAddCounter=1;
	for(AlternateRsoAdd alterRsoInfo:alternateRsoAdd){
%>
<tr class="alternate-rso-row<%=alternateRsoAddCounter%>">
	<td class="sub_heading_content alternateRsoName<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoName())?alterRsoInfo.getAlternateRsoName():""%>
	</td>
	<td class="sub_heading_content alternateRsoTitle<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoTitle())?alterRsoInfo.getAlternateRsoTitle():""%>
	</td>
	<td class="sub_heading_content alternateRsoTelephone<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoTelephone())?alterRsoInfo.getAlternateRsoTelephone():""%>
	</td>
	<td class="sub_heading_content alternateRsoExt<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoExt())?alterRsoInfo.getAlternateRsoExt():""%>
	</td>
	<td class="sub_heading_content alternateRsoFax<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoFax())?alterRsoInfo.getAlternateRsoFax():""%>
	</td>
	<td class="sub_heading_content alternateRsoEmailAdd<%=alternateRsoAddCounter%>">
	<%=Validator.isNotNull(alterRsoInfo)&&Validator.isNotNull(alterRsoInfo.getAlternateRsoEmailAdd())?alterRsoInfo.getAlternateRsoEmailAdd():""%>
	</td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="alternateRsoEditTab" onclick="alternateRsoEditTab('<%=alternateRsoAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="alternateRsoDetailDeleteDataTab" onclick="alternateRsoDetailDeleteData('<%=alternateRsoAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="alternateRsoDetailId<%=alternateRsoAddCounter%>" name="alternateRsoDetailId<%=alternateRsoAddCounter%>" value="<%=alterRsoInfo.getAlternateRsoAddId()%>">
							<%
							alternateRsoAddCounter++;
							}
 }
						%>						
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b) i. Qualified Expert Details</span>
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach File</p>
												</div>
												<div class="right">
													<input type="file" id="qualified-copy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="hsra-qualified-copy"> 
														<label class="custom-upload" for="qualified-copy"> 
															<span class="mr-2"> 
																<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(qualifiedcopy)){%>
												<span class="attach-detailed-overview"><%=qualifiedcopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading">(Append details of duties and responsibilities of the Qualified Expert's role, copy of CV and relevant qualification(s) and/or training certificates. Alternatively, if the Qualified Expert holds a valid HSRA Certificate of Registration, provide the registration number and expiration date.)</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control" id="qualifiedExpertName" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertName())?radiationSafetyData.getQualifiedExpertName():""%>" placeholder="Name">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control" id="qualifiedExpertTitle" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertTitle())?radiationSafetyData.getQualifiedExpertTitle():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="qualifiedExpertTele" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertTele())?radiationSafetyData.getQualifiedExpertTele():""%>" onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Ext</p>
								<input type="text" class="form-control" id="qualifiedExpertExt" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertExt())?radiationSafetyData.getQualifiedExpertExt():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control" id="qualifiedExpertFax" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertFax())?radiationSafetyData.getQualifiedExpertFax():""%>" onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control" id="qualifiedExpertEmail" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertEmail())?radiationSafetyData.getQualifiedExpertEmail():""%>" placeholder="info@companyname.jm">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">HSRA Registration No.</p>
								<input type="text" class="form-control" id="qualifiedExpertRegistrationNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"  value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertRegstNo())?radiationSafetyData.getQualifiedExpertRegstNo():""%>" placeholder="">
								<p class="tab-form-sub-heading">(if applicable)</p>	
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">HSRA Registration Expiration Date</p>
								<input type="date" class="form-control" id="qualifiedExpertDate" value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedExpertDate())?new SimpleDateFormat("YYYY-dd-MM").format(radiationSafetyData.getQualifiedExpertDate()):""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2"> ii.</span> Alternate Qualified Expert
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i) </span> Details of the duties and responsibilities associated with the Qualified Expert's role.
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="qualifiedDetails" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getQualifiedDetails())?radiationSafetyData.getQualifiedDetails():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span> Copy of the curriculum vitae or resume of the prospective alternate Qualified Expert indicating radiation safety-related experience.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach File</p>
												</div>
												<div class="right">
													<input type="file" id="curriculum-copy" onchange="attachDetailed(this.id)" hidden="" multiple="" name="<portlet:namespace/>curriculum-copy"> 
													<label class="custom-upload" for="curriculum-copy">
														<span class="mr-2"> 
														 	<svg width="14" height="17" viewBox="0 0 14 17" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(curriculumVitaeCopy)){%>
													<span class="attach-detailed-overview"><%=curriculumVitaeCopy%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span> Copies of relevant training certificates of the prospective Qualified Expert.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="qualified-expert"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>qualified-expert"> <label
														class="custom-upload" for="qualified-expert"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(prospectiveQualified)){%>
													<span class="attach-detailed-overview"><%=prospectiveQualified%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<input id="qualifedExpertDetailVal" type="hidden"
								name="qualifedExpertDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="qualifedExpertDetailBox">
									<div class="accordion__header is-active"
										id="qualifedExpertDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Alternate Qualified Expert Form</h2>
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
													<p class="tab-form-main-heading">Qualified Expert Name</p>
													<input type="text" class="form-control" id="qualifedName"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Title</p>
													<input type="text" class="form-control" id="qualifedTitle"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone</p>
													<input type="text" class="form-control"
														id="qualifedTelephone" 
														oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Ext</p>
													<input type="text" class="form-control" id="qualifedExt"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax</p>
													<input type="text" class="form-control" id="qualifedFax"
														value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Email Address</p>
													<input type="text" class="form-control"
														id="qualifedEmailAdd" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">HSRA Registration No</p>
													<input type="text" class="form-control"
														id="qualifedRegistrationNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">HSRA Registration
														Expiration Date</p>
													<input type="date" class="form-control"
														id="qualifedExpirationDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addQualifedExpertDetail"
													onclick="addQualifedExpertDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addQualifedExpertDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addQualifedExpertDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Qualified Expert
												Name</th>
											<th class="sub_heading text-nowrap">Title</th>
											<th class="sub_heading text-nowrap">Telephone</th>
											<th class="sub_heading text-nowrap">Ext</th>
											<th class="sub_heading text-nowrap">Fax</th>
											<th class="sub_heading text-nowrap">Email Address</th>
											<th class="sub_heading text-nowrap">HSRA Registration No</th>
											<th class="sub_heading text-nowrap">HSRA Registration
												Expiration Date</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
										<%if(qualifedExpertAdd!=null){
	long qualifedExpertAddCounter=1;
	for(QualifedExpertAdd qualifedExpertInfo:qualifedExpertAdd){
%>
<tr class="qualifed-expert-row<%=qualifedExpertAddCounter%>">
	<td class="sub_heading_content qualifedName<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedName())?qualifedExpertInfo.getQualifedName():""%>
	</td>
	<td class="sub_heading_content qualifedTitle<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedTitle())?qualifedExpertInfo.getQualifedTitle():""%></td>
	<td class="sub_heading_content qualifedTelephone<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedTelephone())?qualifedExpertInfo.getQualifedTelephone():""%></td>
	<td class="sub_heading_content qualifedExt<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedExt())?qualifedExpertInfo.getQualifedExt():""%></td>
	<td class="sub_heading_content qualifedFax<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedFax())?qualifedExpertInfo.getQualifedFax():""%></td>
	<td class="sub_heading_content qualifedEmailAdd<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedEmailAdd())?qualifedExpertInfo.getQualifedEmailAdd():""%></td>
	<td class="sub_heading_content qualifedRegistrationNo<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedRegistrationNo())?qualifedExpertInfo.getQualifedRegistrationNo():""%></td>
	<td class="sub_heading_content qualifedExpirationDate<%=qualifedExpertAddCounter%>">
	<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedExpirationDate())?new SimpleDateFormat("yyyy-MM-dd").format(qualifedExpertInfo.getQualifedExpirationDate()):""%></td>
	<td> 
		<span> 
			<a href="javascript:void(0)" id="qualifedExpertEditTab" onclick="qualifedExpertEditTab('<%=qualifedExpertAddCounter%>');"> 
		        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
		      </a> 
		  </span>
     </td>
     <td> 
		<span> 
			<a href="javascript:void(0)" id="qualifedExpertDetailDeleteDataTab" onclick="qualifedExpertDetailDeleteData('<%=qualifedExpertAddCounter%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="qualifedExpertDetailId<%=qualifedExpertAddCounter%>" name="qualifedExpertDetailId<%=qualifedExpertAddCounter%>" value="<%=qualifedExpertInfo.getQualifedExpertAddId() %>">
							<%
							qualifedExpertAddCounter++;
							}
 }
						%>	
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(c) Other
									Representative(s) of applicant</span>
								</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control" id="applicantName"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getApplicantName())?radiationSafetyData.getApplicantName():""%>" placeholder="Name">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control" id="applicantTitle"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getApplicantTitle())?radiationSafetyData.getApplicantTitle():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Limitations of authority</p>
								<input type="text" class="form-control" id="otherLimitationAuth"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getOtherLimitationAuth())?radiationSafetyData.getOtherLimitationAuth():""%>" placeholder="Limitations of authority">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Date</p>
								<input type="date" class="form-control" id="otherDate"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getOtherDate())?new SimpleDateFormat("yyyy-MM-dd").format(radiationSafetyData.getOtherDate()):""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<p class="pt-2 common-para">Signature of Representative</p>
							<%
								if (Validator.isNotNull(fileUrlOfRegistration)) {
							%>
							<div class="signature_texarea mb-2"
								id="applicantRepresentativeSignature">
								<img src="<%=fileUrlOfRegistration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2"
								id="applicantRepresentativeSignature"></div>
							<%
								}
							%>
							<input type="file" id="applicantRepresentativeSignatureBtn"
								hidden=""
								name="<portlet:namespace/>applicantRepresentativeSignatureBtn">
							<label for="applicantRepresentativeSignatureBtn"
								class="choose-sign-btn"> <span class="mr-2"> <svg
										width="14" height="17" viewBox="0 0 14 17" fill="none"
										xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#ffffff"></path></svg>
							</span> Upload Signature
							</label>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(d) Classification
									of Workers</span>
								</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="classificationWorkersList" placeholder=""
									spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getClassifiWorkersList())?radiationSafetyData.getClassifiWorkersList():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="classificationOfWorkers"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>classificationOfWorkers"> <label
														class="custom-upload" for="classificationOfWorkers"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(classificationOfWork)){%>
													<span class="attach-detailed-overview"><%=classificationOfWork%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append a list of
									all job categories for workers using or working in the vicinity
									of nuclear material and radiation sources.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(e) Individual
									Protective Equipment and Safety Appliances</span>
								</p>
								<p class="tab-form-main-heading">Tick all that applies</p>
							</div>
							<!--firstly save this in DB -->
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection1"
									value="Lab coats"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Lab coats")?"checked":StringPool.BLANK%> name="equipmentProtection" /> <label
									for="equipmentProtection1">
									<p class="tab-form-main-heading mb-0">Lab coats</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection2" value="Gloves"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Gloves")?"checked":StringPool.BLANK%>
									name="equipmentProtection" /> <label
									for="equipmentProtection2">
									<p class="tab-form-main-heading mb-0">Gloves</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection3"
									value="Safety glasses"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Safety glasses")?"checked":StringPool.BLANK%> name="equipmentProtection" /> <label
									for="equipmentProtection3">
									<p class="tab-form-main-heading mb-0">Safety glasses</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection4"
									value="Splash guards"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Splash guards")?"checked":StringPool.BLANK%> name="equipmentProtection" /> <label
									for="equipmentProtection4">
									<p class="tab-form-main-heading mb-0">Splash guards</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection5"
									value="Lucite (plexiglass, perspex) beta guards"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Lucite (plexiglass, perspex) beta guards")?"checked":StringPool.BLANK%>
									name="equipmentProtection" /> <label
									for="equipmentProtection5">
									<p class="tab-form-main-heading mb-0">Lucite (plexiglass,
										perspex) beta guards</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection6"
									value="Respiratory protection"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Respiratory protection")?"checked":StringPool.BLANK%> name="equipmentProtection" /> <label
									for="equipmentProtection6">
									<p class="tab-form-main-heading mb-0">Respiratory
										protection</p>
								</label>
							</div>
							<div class="form-group otherSpecifyHerePro hide">
								<p class="tab-form-main-heading">Please specify here</p>
								<input type="text" class="form-control" id="otherEquipment"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getResProPleaseSpecify())?radiationSafetyData.getResProPleaseSpecify():"" %>" />
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection7"
									value="Fume hood(s)"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Fume hood(s)")?"checked":StringPool.BLANK%> name="equipmentProtection" /> <label
									for="equipmentProtection7">
									<p class="tab-form-main-heading mb-0">Fume hood(s)</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection8"
									value="Removable table covering(s)"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Removable table covering(s)")?"checked":StringPool.BLANK%> name="equipmentProtection" />
								<label for="equipmentProtection8">
									<p class="tab-form-main-heading mb-0">Removable table
										covering(s)</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection9"
									value="Lead sheet/ block for gamma shielding, appropriate to photon energies"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Lead sheet/ block for gamma shielding, appropriate to photon energies")?"checked":StringPool.BLANK%>
									name="equipmentProtection" /> <label
									for="equipmentProtection9">
									<p class="tab-form-main-heading mb-0">Lead sheet/ block for
										gamma shielding, appropriate to photon energies</p>
								</label>
							</div>
							<div class="checkbox-form-group second-custom-checkbox">
								<input type="checkbox" id="equipmentProtection10"
									value="Tongs/forceps/other remote handling tool"<%=radiationSafetyData!=null &&radiationSafetyData.getIndividualProtectiveEquipment().contains("Tongs/forceps/other remote handling tool")?"checked":StringPool.BLANK%>
									name="equipmentProtection" /> <label
									for="equipmentProtection10">
									<p class="tab-form-main-heading mb-0">Tongs/forceps/other
										remote handling tool</p>
								</label>
							</div>
							<div class="form-group otherSpecifyHere hide">
								<p class="tab-form-main-heading">Please specify here</p>
								<input type="text" class="form-control" id="otherEquipmentOne"
									value="" />
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(f) Radiation
									Protection Program (RPP)</span>
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="radiationProUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>radiationProUpload"> <label
														class="custom-upload" for="radiationProUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(radiationPro)){%>
													<span class="attach-detailed-overview"><%=radiationPro%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">
									(Append RPP or other relevant documents that address the
									requirements in items (i) to (xiv) below. In the space
									provided, state the name of the document and page numbers that
									specifically address each requirement. For further guidance
									please refer to the <b>NSRP Application Guide.</b> )
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i) </span>Scope of
									Activities
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255"
									id="scopeOfActivities" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getScopeOfActivities())?radiationSafetyData.getScopeOfActivities():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="scopeOfActivitiesUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>scopeOfActivitiesUpload"> <label
														class="custom-upload" for="scopeOfActivitiesUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(scopeOfActivity)){%>
													<span class="attach-detailed-overview"><%=scopeOfActivity%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append tasks and
									operations to be performed by staff, frequency and duration of
									these activities as well as radiological risks associated with
									the work.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span>Management
									System
								</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="managementSystem" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getManagementSystem())?radiationSafetyData.getManagementSystem():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="managementSystemUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>managementSystemUpload"> <label
														class="custom-upload" for="managementSystemUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(managementSystem)){%>
													<span class="attach-detailed-overview"><%=managementSystem%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append a
									description of the management and organizational structures
									that relate to radiation safety. Include details of roles and
									responsibilities of different management levels including
									Directors in charge, Radiation Safety Officers and workers.
									Include organizational chart showing radiation protection lines
									of responsibility as well as quality assurance program.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>Monitoring
									Occupational Exposure
								</p>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(a) </span>Ascertaining
											and recording doses to workers
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
										id="workerRecordings" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getWorkerRecordings())?radiationSafetyData.getWorkerRecordings():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="workerRecordingsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>workerRecordingsUpload"> <label
																class="custom-upload" for="workerRecordingsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(workerRecording)){%>
													<span class="attach-detailed-overview"><%=workerRecording%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append
											procedures for ascertaining, monitoring and recording
											radiation doses received by all workers. Include dose to the
											eye and extremities (hands and feet) and intakes of
											radioactive material.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b) </span>For
											new licences, provide dose estimates for all categories of
											workers
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
									id="categoriesLicence" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getCategoriesLicence())?radiationSafetyData.getCategoriesLicence():""%></textarea>

									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(c) </span>For
											renewals, provide a summary of the annual radiation doses for
											each worker
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
									id="renewalsSummary" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getRenewalsSummary())?radiationSafetyData.getRenewalsSummary():""%></textarea>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(d) </span>Dose
											limits, dose constraints and optimization
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
									id="constraintsLimits" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getConstraintsLimits())?radiationSafetyData.getConstraintsLimits():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="constraintsLimitsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>constraintsLimitsUpload"> <label
																class="custom-upload" for="constraintsLimitsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(constraintSlimits)){%>
													<span class="attach-detailed-overview"><%=constraintSlimits%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append the dose
											limits for planned exposure situation, the established dose
											constraints that will be used as part of the organization's
											optimization of protection and safety.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(e) </span>Acquisition
											and maintenance of individual monitoring equipment
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
									id="equipmentMonitoring" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getEquipmentMonitoring())?radiationSafetyData.getEquipmentMonitoring():""%></textarea>
											
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="equipmentMonitoringUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>equipmentMonitoringUpload"> <label
																class="custom-upload" for="equipmentMonitoringUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(equipmentMonitoring)){%>
													<span class="attach-detailed-overview"><%=equipmentMonitoring%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append the list
											of all types of individual monitoring equipment that will be
											used, including the policy and procedure for acquisition,
											use, monitoring period, maintenance and storage, including
											the name of the individual monitoring service provider.)</p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iv) </span>Workplace
									Monitoring
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="areasControlUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>areasControlUpload"> <label
														class="custom-upload" for="areasControlUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(areaControl)){%>
													<span class="attach-detailed-overview"><%=areaControl%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">Append procedures
									for workplace monitoring, which should include the following
									details</p>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(a) </span>Classification
											of areas (control and supervised areas) and local rules
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="areasControl" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getAreasControl())?radiationSafetyData.getAreasControl():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="classificationAreaUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>classificationAreaUpload"> <label
																class="custom-upload" for="classificationAreaUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(classificationArea)){%>
													<span class="attach-detailed-overview"><%=classificationArea%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append policy
											and procedures for classifying areas, rooms or enclosures as
											controlled or supervised areas, including floor plans,
											arrangement of equipment, shielding and other measures for
											protection and safety. Include access control, posting of
											radiation warning signs, local (site) rules and/policies to
											be followed by workers and work supervision, as well as,
											procedures for contamination control.)</p>

									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b) </span>Control
											of radioactive contamination; where unsealed radiation
											sources are handled
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="radioactiveSources" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getRadioactiveSources())?radiationSafetyData.getRadioactiveSources():""%></textarea>
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="radioactiveSourcesUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>radioactiveSourcesUpload"> <label
																	class="custom-upload"  for="radioactiveSourcesUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(radioactiveSource)){%>
													<span class="attach-detailed-overview"><%=radioactiveSource%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Append policy
											and procedures for maintaining contamination control,
											including the procedure for monitoring contamination where
											unsealed radiative sources are used and stored; describe
											actions to be taken if contamination limits are exceeded.)</p>

									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(c) </span>Radiation
											detection instruments
										</p>
										
										<textarea rows="3" class="form-control" maxlength="255" id="radiationiInstruments" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getRadiationiInstruments())?radiationSafetyData.getRadiationiInstruments():""%></textarea>
										<div class="supporting-document-card my-3">
											<div class="row">
												<div class="col-md-12">
													<div class="supporting-document-card-wrapper">
														<div class="left">
															<p class="supporting-document-card-upper-heading">Attach
																File</p>
														</div>
														<div class="right">
															<input type="file" id="radiationiInstrumentsUpload"
																onchange="attachDetailed(this.id)" hidden="" multiple=""
																name="<portlet:namespace/>radiationiInstrumentsUpload"> <label
																class="custom-upload" for="radiationiInstrumentsUpload"> <span
																class="mr-2"> <svg width="14" height="17"
																		viewBox="0 0 14 17" fill="none"
																		xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
															</span>Upload
															</label>
														</div>
													</div>
													<%if(Validator.isNotNull(radiationInstrument)){%>
													<span class="attach-detailed-overview"><%=radiationInstrument%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
												</div>
											</div>
										</div>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append a list
											of all radiation detection and measuring instruments to be
											used, as well as the policy and procedures for the
											acquisition, use, maintenance, storage and calibration of
											said instruments and the calibration service provider.
											Provide the calibration certificates for all instruments
											listed.)</p>

									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(v) </span>Health
									Surveillance of Workers
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255" id="healthWorkers" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getHealthWorkers())?radiationSafetyData.getHealthWorkers():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="healthWorkersUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>healthWorkersUpload"> <label
														class="custom-upload" for="healthWorkersUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(healthWork)){%>
													<span class="attach-detailed-overview"><%=healthWork%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policies
							and procedures for monitoring the health of workers.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(vi) </span>Investigation
									Levels and Feedback of Operating Experience
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255" id="investigationLevel" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getInvestigationLevel())?radiationSafetyData.getInvestigationLevel():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="investigationLevelUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>investigationLevelUpload"> <label
														class="custom-upload" for="investigationLevelUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(investigationLevel)){%>
													<span class="attach-detailed-overview"><%=investigationLevel%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append details of
									investigation levels and the procedures to be taken if they are
									reached and/ or exceeded; as well as, procedure to provide HSRA
									and suppliers with information regarding normal operating
									procedures, abnormal conditions and events.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(vii) </span>Record
									and Reporting System
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="recordReportingUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>recordReportingUpload"> <label
														class="custom-upload" for="recordReportingUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(recordReporting)){%>
													<span class="attach-detailed-overview"><%=recordReporting%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">Append details of
									the policy and procedures</p>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(a) </span>That
											outlines the process for retention of records and the list of
											documents that will be retained at each location of licensed
											activity, including field locations
										</p>
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b) </span>For
											the reporting of accidents, incidents, as well as any event
											in which the Authority should be notified; e.g.
											investigations conducted, release of radioactive materials
											into the environment, remedial actions etc.
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="policyDetails" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getPolicyDetails())?radiationSafetyData.getPolicyDetails():""%></textarea>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(viii a) </span>Access
									control and security
								</p>
								<textarea rows="3" class="form-control" maxlength="255" id="securityAccess" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getSecurityAccess())?radiationSafetyData.getSecurityAccess():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="securityAccessUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>securityAccessUpload"> <label
														class="custom-upload" for="securityAccessUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(securityAccess)){%>
													<span class="attach-detailed-overview"><%=securityAccess%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and
									procedures for restricting access to radiation sources and / or
									nuclear material, to only authorized and trained persons, as
									well as, the policy and procedure for alerting the applicant to
									the loss, theft or unauthorized use of/ access to radiation
									sources.)</p>
							</div>
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>Controlling
									possession of radiation sources
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255" id="raditionSources" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getRaditionSources())?radiationSafetyData.getRaditionSources():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="raditionSourcesUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>raditionSourcesUpload"> <label
														class="custom-upload" for="raditionSourcesUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(raditionSource)){%>
													<span class="attach-detailed-overview"><%=raditionSource%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and
									procedures to account for radiation sources and / or nuclear
									materials, as well as, to ensure that inventory do not exceed
									the licence limit.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ix) </span>Worker
									Training and Authorization
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255" id="workerTraining" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getWorkerTraining())?radiationSafetyData.getWorkerTraining():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="workerTrainingUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>workerTrainingUpload"> <label
														class="custom-upload" for="workerTrainingUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(workTraninig)){%>
													<span class="attach-detailed-overview"><%=workTraninig%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append a detailed
									description of the proposed (theoretical and practical)
									radiation safety training program for each job category, as
									well as, for contractors and subcontractors. Also include all
									instructions and information provided for radiation safety and
									protection including safe work practices.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(x) </span>Control
									of Public Exposure
								</p>
								<textarea rows="3" class="form-control" maxlength="255" id="publicControl" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getPublicControl())?radiationSafetyData.getPublicControl():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="publicControlUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>publicControlUpload"> <label
														class="custom-upload" for="publicControlUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(publicControl)){%>
													<span class="attach-detailed-overview"><%=publicControl%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and
									procedures for controlling and monitoring discharge to the
									environment.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(xi) </span>Management
									of Radioactive Waste and Disused Sources
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>Append
									details of the policy and procedures for handling and disposing
									of waste containing radioactive and/or nuclear materials namely
									waste generation; predisposal, pre-treatment, characterization,
									treatment, conditioning, storage, control of discharges,
									clearance, packaging strategies, transport, design and
									manufacturing of container, handling of waste packages, site
									evaluation, design, construction, closure and the post-closure
									stage of estate management facility.
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>For
									disused sources, provide details of the safe management of the
									sources, as well as, means of disposal.
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">
									<span class="tab-form-highlghtme-link pr-2">(c) </span>Include
									financial provisions, where appropriate, and any contractual
									agreements regarding repatriation, disposal etc.
								</p>
								<input type="text" class="form-control" id="managementSources"
									value="<%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getManagementSources())?radiationSafetyData.getManagementSources():""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(xii) </span>Emergency
									Procedures
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255"
									id="emergencyProcedure" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getEmergencyProcedure())?radiationSafetyData.getEmergencyProcedure():""%></textarea>
								
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="emergencyProceeUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>emergencyProceeUpload"> <label
														class="custom-upload" for="emergencyProceeUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(safetyEmergency1)){%>
													<span class="attach-detailed-overview"><%=safetyEmergency1%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append a summary
									of the policy and procedures that will be used in incidents,
									accidents and other events that involve radiation source(s)
									and/nuclear materials. Include procedures for notification and
									response to events as well as policies and prevention and
									mitigation of accidents.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(xiii) </span>Decommissioning
								</p>
								
								<textarea rows="3" class="form-control" maxlength="255"
									id="licenceLocation" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getLicenceLocation())?radiationSafetyData.getLicenceLocation():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="licenceLocationUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>licenceLocationUpload"> <label
														class="custom-upload" for="licenceLocationUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(licenceLocation)){%>
													<span class="attach-detailed-overview"><%=licenceLocation%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and
									procedures that are related to decommissioning or remediation
									of licensed locations.)</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(xiv) </span>Radiation
									Protection Program Policies
								</p>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(a) </span>As Low
											As Reasonably Achievable (ALARA) Program:
										</p>
										<textarea rows="3" class="form-control" maxlength="255"
											id="achievableProgram" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getAchievableProgram())?radiationSafetyData.getAchievableProgram():""%></textarea>
											<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="lowAchievableProgramUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>lowAchievableProgramUpload"> <label
																	class="custom-upload" for="lowAchievableProgramUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(lowAchievable)){%>
													<span class="attach-detailed-overview"><%=lowAchievable%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Summary of the
											policies and procedures of the ALARA program, including
											condition of service and special arrangement for female
											workers and persons under the age of 18 years.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(b) </span>Leak
											testing of sealed sources
										</p>
										<p class="tab-form-sub-heading mb-2 pl-2">(Append policy
											and procedure for leak testing of sealed sources, including
											the name of the leak test service provider to be used, if
											applicable.)</p>
										<textarea rows="3" class="form-control" maxlength="255" id="leakedTestingSources" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getLeakedTestingSources())?radiationSafetyData.getLeakedTestingSources():""%></textarea>
										<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="leakTestingUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>leakTestingUpload"> <label
																	class="custom-upload" for="leakTestingUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(leakTesting)){%>
													<span class="attach-detailed-overview"><%=leakTesting%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(c) </span>Transfer
											of radiation sources
										</p>
										<textarea rows="3" class="form-control" maxlength="255" id="transferSources" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getTransferSources())?radiationSafetyData.getTransferSources():""%></textarea>
										<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="transferSourcesUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>transferSourcesUpload"> <label
																	class="custom-upload" for="transferSourcesUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(transferSource)){%>
													<span class="attach-detailed-overview"><%=transferSource%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Append policy
											and procedure for the transfer of radiation sources and / or
											nuclear materials.)</p>
									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(d) </span>Transfer
											of radiation sources and / nuclear materials - (for renewal)
										</p>
										
										<textarea rows="3" class="form-control" maxlength="255" id="nuclearMaterials" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getNuclearMaterials())?radiationSafetyData.getNuclearMaterials():""%></textarea>
										<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="nuclearMaterialsUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>nuclearMaterialsUpload"> <label
																	class="custom-upload" for="nuclearMaterialsUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(nuclearMaterial)){%>
													<span class="attach-detailed-overview"><%=nuclearMaterial%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Append a
											summary of the annual activity of each radiation source and/
											nuclear materials transferred during the previous licensing
											period.)</p>
										</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(e) </span>Packaging
											and transport of radiation sources and/nuclear materials
										</p>		
										<textarea rows="3" class="form-control" maxlength="255" id="transportPackaging" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getTransportPackaging())?radiationSafetyData.getTransportPackaging():""%></textarea>
										<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="transportPackagingUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>transportPackagingUpload"> <label
																	class="custom-upload" for="transportPackagingUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
														<%if(Validator.isNotNull(packagingTransfer)){%>
													<span class="attach-detailed-overview"><%=packagingTransfer%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Append policy
											and procedures for packaging and transporting radiation
											source and/nuclear materials, as well as the policy and
											procedure for receiving such shipments.)</p>

									</div>
								</div>
								<div class="col-md-12">
									<div class="form-group">
										<p class="tab-form-main-heading">
											<span class="tab-form-highlghtme-link pr-2">(f) </span>Internal
											review
										</p>
										
										<textarea rows="3" class="form-control" maxlength="255" id="internalReview" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getInternalReview())?radiationSafetyData.getInternalReview():""%></textarea>
										<div class="supporting-document-card my-3">
												<div class="row">
													<div class="col-md-12">
														<div class="supporting-document-card-wrapper">
															<div class="left">
																<p class="supporting-document-card-upper-heading">Attach
																	File</p>
															</div>
															<div class="right">
																<input type="file" id="internalReviewUpload"
																	onchange="attachDetailed(this.id)" hidden="" multiple=""
																	name="<portlet:namespace/>internalReviewUpload"> <label
																	class="custom-upload" for="internalReviewUpload"> <span
																	class="mr-2"> <svg width="14" height="17"
																			viewBox="0 0 14 17" fill="none"
																			xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
																</span>Upload
																</label>
															</div>
														</div>
															<%if(Validator.isNotNull(safetyInternal)){%>
													<span class="attach-detailed-overview"><%=safetyInternal%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
													</div>
												</div>
											</div>
											<p class="tab-form-sub-heading mb-2 pl-2">(Append
											arrangements for supervising and auditing the Radiation
											Protection Programme.)</p>


									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(g) </span>Append
									Safety Assessment for facilities of activities involving
									sources of Categories 1 and 2
								</p>
								<textarea rows="3" class="form-control" maxlength="255" id="sourcesActivities" placeholder="" spellcheck="false"><%=Validator.isNotNull(radiationSafetyData)&&Validator.isNotNull(radiationSafetyData.getSourcesActivities())?radiationSafetyData.getSourcesActivities():""%></textarea>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="sourcesActivitiesUpload"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>sourcesActivitiesUpload"> <label
														class="custom-upload" for="sourcesActivitiesUpload"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
												<%if(Validator.isNotNull(appendSafety)){%>
													<span class="attach-detailed-overview"><%=appendSafety%> </span>
													<%}else{%>
													<span class="attach-detailed-overview"></span>
													<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo();radiationSafetyProgramSectionFive(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
		<div class="tab-pane" role="tabpanel" id="childStep7">
			<div class="tab-form">
				<div class="section-six-form ">
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title f2">Section VI</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="tab-form-title-subtitle f2 mb-0">Radiation Safety
								Program-low Risk Sources</p>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(a) i. Radiation
									Safety Officer (RSO) Details</span>
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="certificates-cv"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>certificates-cv"> <label
														class="custom-upload" for="certificates-cv"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(certificateCv)){%>
												<span class="attach-detailed-overview"><%=certificateCv%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading">(Append details of
									duties and responsibilities associated with RSO's role, copy of
									CV and relevant RSO training certificates and/ or
									qualification).</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control" id="appendixRsoName"
								value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getAppendixRsoName())
								? lowRiskSafety.getAppendixRsoName()
								: ""%>"placeholder="Name">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control" id="appendixRsoTitle"
								value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getAppendixRsoTitle())
								? lowRiskSafety.getAppendixRsoTitle()
								: ""%>"placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control" id="appendixRsoTeleNo"
								value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getAppendixRsoTeleNo())
								? lowRiskSafety.getAppendixRsoTeleNo()
								: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Ext</p>
								<input type="text" class="form-control" id="appendixRsoExt"
								value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getAppendixRsoExt())
								? lowRiskSafety.getAppendixRsoExt()
								: ""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control" id="appendixRsoFax"
								value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getAppendixRsoFax())
								? lowRiskSafety.getAppendixRsoFax()
								: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control" id="appendixRsoEmail"
									value="" placeholder="info@companyname.jm">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2"> ii. Alternate RSO Details</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i) </span> Details
									of the duties and responsibilities associated with the RSO's
									role.
								</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="appendixRsoDetails" placeholder=""
									spellcheck="false"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getAppendixRsoDetails())?lowRiskSafety.getAppendixRsoDetails():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span> Copy
									of the curriculum vitae or resume of the prospective alternate
									RSO indicating radiation safety-related experience.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="resume-copy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>resume-copy"> <label class="custom-upload"
														for="resume-copy"> <span class="mr-2"> <svg
																width="14" height="17" viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(resumeCopy)){%>
												<span class="attach-detailed-overview"><%=resumeCopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>
									Copies of relevant RSO training certificates of the prospective
									RSO.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="training-copy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>training-copy"> <label class="custom-upload"
														for="training-copy"> <span class="mr-2"> <svg
																width="14" height="17" viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(trainingCopy)){%>
												<span class="attach-detailed-overview"><%=trainingCopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<input id="alternateRsoOneDetailVal" type="hidden"
								name="alternateRsoOneDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="alternateRsoOneDetailBox">
									<div class="accordion__header is-active"
										id="alternateRsoOneDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Alternate RSO Form</h2>
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
													<p class="tab-form-main-heading">RSO Name</p>
													<input type="text" class="form-control"
														id="alternateRsoOneName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Title</p>
													<input type="text" class="form-control"
														id="alternateRsoOneTitle" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone</p>
													<input type="text" class="form-control"
														id="alternateRsoOneTelephone" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Ext</p>
													<input type="text" class="form-control"
														id="alternateRsoOneExt" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax</p>
													<input type="text" class="form-control"
														id="alternateRsoOneFax" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Email Address</p>
													<input type="text" class="form-control"
														id="alternateRsoOneEmailAdd" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addAlternateRsoOneDetail"
													onclick="addAlternateRsoOneDetail();"> <span>+ 1</span>
													Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addAlternateRsoOneDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addAlternateRsoOneDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">RSO Name</th>
											<th class="sub_heading text-nowrap">Title</th>
											<th class="sub_heading text-nowrap">Telephone</th>
											<th class="sub_heading text-nowrap">Ext</th>
											<th class="sub_heading text-nowrap">Fax</th>
											<th class="sub_heading text-nowrap">Email Address</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
										<%if(alternateRsoOneAdd!=null){
											long alternateRsoOneAddCounter=1;
											for(AlternateRsoOneAdd alternateRsoOneInfo:alternateRsoOneAdd){
										%>
										<tr class="alternate-rso-one-row<%=alternateRsoOneAddCounter%>">
											<td class="sub_heading_content alternateRsoOneName<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneName())?alternateRsoOneInfo.getAlternateRsoOneName():""%>
											</td>
											<td class="sub_heading_content alternateRsoOneTitle<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneTitle())?alternateRsoOneInfo.getAlternateRsoOneTitle():""%></td>
											<td class="sub_heading_content alternateRsoOneTelephone<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneTelephone())?alternateRsoOneInfo.getAlternateRsoOneTelephone():""%></td>
											<td class="sub_heading_content alternateRsoOneExt<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneExt())?alternateRsoOneInfo.getAlternateRsoOneExt():""%></td>
											<td class="sub_heading_content alternateRsoOneFax<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneFax())?alternateRsoOneInfo.getAlternateRsoOneFax():""%></td>
											<td class="sub_heading_content alternateRsoOneEmailAdd<%=alternateRsoOneAddCounter%>">
											<%=Validator.isNotNull(alternateRsoOneInfo)&&Validator.isNotNull(alternateRsoOneInfo.getAlternateRsoOneEmailAdd())?alternateRsoOneInfo.getAlternateRsoOneEmailAdd():""%></td>
											<td> 
												<span> 
													<a href="javascript:void(0)" id="alternateRsoOneEditTab" onclick="alternateRsoOneEditTab('<%=alternateRsoOneAddCounter%>');"> 
														<svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path></svg>
													  </a> 
												  </span>
											 </td>
											 <td> 
												<span> 
													<a href="javascript:void(0)" id="alternateRsoOneDetailDeleteDataTab" onclick="alternateRsoOneDetailDeleteData('<%=alternateRsoOneAddCounter%>');"> 
														<svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path></svg>
													  </a> 
												  </span>  
											 </td>
										</tr>
										<input type="hidden" id="alternateRsoOneDetailId<%=alternateRsoOneAddCounter%>" name="alternateRsoOneDetailId<%=alternateRsoOneAddCounter%>" value="<%=alternateRsoOneInfo.getAlternateRsoOneAddId()%>">
																	<%
																	alternateRsoOneAddCounter++;
																	}
										 }
																%>	
									</tbody>
								</table>
							</div>

						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(b) i.  Qualified
									Expert Details</span>
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="relevant-cv-copy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="<portlet:namespace/>relevant-cv-copy"> <label
														class="custom-upload" for="relevant-cv-copy"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(relevantCopy)){%>
												<span class="attach-detailed-overview"><%=relevantCopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
								<p class="tab-form-sub-heading">(Append details of
									duties and responsibilities of the Qualified Expert's role,
									copy of CV and relevant qualification(s) and/or training
									certificates. Alternatively, if the Qualified Expert holds a
									valid HSRA Certificate of Registration, provide the
									registration number and expiration date.)</p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Name</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixName" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixName())
									? lowRiskSafety.getQualifiedAppendixName()
									: ""%>" placeholder="Name">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Title</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixTitle" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixTitle())
									? lowRiskSafety.getQualifiedAppendixTitle()
									: ""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Telephone</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixTele" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixTele())
									? lowRiskSafety.getQualifiedAppendixTele()
									: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Ext</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixExt" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixExt())
									? lowRiskSafety.getQualifiedAppendixExt()
									: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Fax</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixFax" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixFax())
									? lowRiskSafety.getQualifiedAppendixFax()
									: ""%>"
									onclick="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');"
									placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">Email Address</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixEmail" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixEmail())
									? lowRiskSafety.getQualifiedAppendixEmail()
									: ""%>"
									placeholder="info@companyname.jm">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">HSRA Registration No. (if
									applicable)</p>
								<input type="text" class="form-control"
									id="qualifiedAppendixRegistrationNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="<%=Validator.isNotNull(lowRiskSafety) && Validator.isNotNull(lowRiskSafety.getQualifiedAppendixRegstNo())
									? lowRiskSafety.getQualifiedAppendixRegstNo()
									: ""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<p class="tab-form-main-heading">HSRA Registration
									Expiration Date</p>
								<input type="date" class="form-control"
									id="qualifiedAppendixDate" value="<%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixDate())?new SimpleDateFormat("YYYY-dd-MM").format(lowRiskSafety.getQualifiedAppendixDate()):""%>" placeholder="">
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2"> ii.  Alternate Qualified Expert</span>
								</p>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i) </span> Details
									of the duties and responsibilities associated with the
									Qualified Expert's role.
								</p>
								<textarea rows="3" class="form-control" maxlength="255"
									id="qualifiedAppendixDetails" placeholder=""
									spellcheck="false"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getQualifiedAppendixDetails())?lowRiskSafety.getQualifiedAppendixDetails():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span> Copy
									of the curriculum vitae or resume of the prospective alternate
									Qualified Expert indicating radiation safety-related
									experience.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="qualified-resume-copy"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="qualified-resume-copy"> <label
														class="custom-upload" for="qualified-resume-copy">
														<span class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(qualifiedCopy)){%>
												<span class="attach-detailed-overview"><%=qualifiedCopy%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>
									Copies of relevant training certificates of the prospective
									Qualified Expert.
								</p>
								<div class="supporting-document-card my-3">
									<div class="row">
										<div class="col-md-12">
											<div class="supporting-document-card-wrapper">
												<div class="left">
													<p class="supporting-document-card-upper-heading">Attach
														File</p>
												</div>
												<div class="right">
													<input type="file" id="training-expert"
														onchange="attachDetailed(this.id)" hidden="" multiple=""
														name="training-expert"> <label
														class="custom-upload" for="training-expert"> <span
														class="mr-2"> <svg width="14" height="17"
																viewBox="0 0 14 17" fill="none"
																xmlns="http://www.w3.org/2000/svg"><path d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z" fill="#047247"></path></svg>
													</span>Upload
													</label>
												</div>
											</div>
											<%if(Validator.isNotNull(trainingExpert)){%>
												<span class="attach-detailed-overview"><%=trainingExpert%> </span>
											<%}else{%>
												<span class="attach-detailed-overview"></span>
											<%}%>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-md-12">
							<input id="qualifedExpertOneDetailVal" type="hidden"
								name="qualifedExpertOneDetailVal" value="1">
							<div class="col-md-12">
								<div class="accordion secured-accordian"
									id="qualifedExpertOneDetailBox">
									<div class="accordion__header is-active"
										id="qualifedExpertOneDetail" onclick="expandDetails(this.id)">
										<div class="d-flex align-items-center">
											<div class="d-flex align-items-center">
												<div>
													<span class="accordion__toggle"></span>
												</div>
												<div>
													<h2>Alternate Qualifed Expert Form</h2>
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
													<p class="tab-form-main-heading">Qualified Expert Name</p>
													<input type="text" class="form-control"
														id="qualifedOneName" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Title</p>
													<input type="text" class="form-control"
														id="qualifedOneTitle" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Telephone</p>
													<input type="text" class="form-control"
														id="qualifedOneTelephone" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Ext</p>
													<input type="text" class="form-control" id="qualifedOneExt"
														value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Fax</p>
													<input type="text" class="form-control" id="qualifedOneFax"
														value="" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">Email Address</p>
													<input type="text" class="form-control"
														id="qualifedOneEmailAdd" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">HSRA Registration No</p>
													<input type="text" class="form-control"
														id="qualifedOneRegistrationNo" oninput="this.value = this.value.replace(/[^0-9\-\+]+/g, '').replace(/(\..*)\./g, '$1');" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<p class="tab-form-main-heading">HSRA Registration
														Expiration Date</p>
													<input type="date" class="form-control"
														id="qualifedOneExpirationDate" value="" placeholder="">
												</div>
											</div>
											<div class="col-md-12 d-flex justify-content-end py-4">
												<a href="javascript:void(0);" class="add-more-employee"
													id="addQualifedExpertOneDetail"
													onclick="addQualifedExpertOneDetail();"> <span>+
														1</span> Add More
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-12 table-responsive hide addQualifedExpertOneDetailTableBox">
								<table class="table table-bordered mb-3">
									<tbody class="addQualifedExpertOneDetailTable">
										<tr>
											<th class="sub_heading text-nowrap">Qualified Expert
												Name</th>
											<th class="sub_heading text-nowrap">Title</th>
											<th class="sub_heading text-nowrap">Telephone</th>
											<th class="sub_heading text-nowrap">Ext</th>
											<th class="sub_heading text-nowrap">Fax</th>
											<th class="sub_heading text-nowrap">Email Address</th>
											<th class="sub_heading text-nowrap">HSRA Registration No</th>
											<th class="sub_heading text-nowrap">HSRA Registration
												Expiration Date</th>
											<th class="sub_heading">Edit</th>
											<th class="sub_heading">Delete</th>
										</tr>
										<%if(qualifedExpertOneAdd!=null){
											long qualifedExpertAddCounter=1;
											for(QualifedExpertOneAdd qualifedExpertInfo:qualifedExpertOneAdd){
										%>
												<tr class="qualifed-expert-one-row<%=qualifedExpertAddCounter%>">
												<td class="sub_heading_content qualifedOneName<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneName())?qualifedExpertInfo.getQualifedOneName():""%></td>
												<td class="sub_heading_content qualifedOneTitle<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneTitle())?qualifedExpertInfo.getQualifedOneTitle():""%></td>
												<td class="sub_heading_content qualifedOneTelephone<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneTelephone())?qualifedExpertInfo.getQualifedOneTelephone():""%></td>
												<td class="sub_heading_content qualifedOneExt<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneExt())?qualifedExpertInfo.getQualifedOneExt():""%></td>
												<td class="sub_heading_content qualifedOneFax<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneFax())?qualifedExpertInfo.getQualifedOneFax():""%></td>
												<td class="sub_heading_content qualifedOneEmailAdd<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneEmailAdd())?qualifedExpertInfo.getQualifedOneEmailAdd():""%></td>
												<td class="sub_heading_content qualifedOneRegistrationNo<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneRegistrationNo())?qualifedExpertInfo.getQualifedOneRegistrationNo():""%></td>
												<td class="sub_heading_content qualifedOneExpirationDate<%=qualifedExpertAddCounter%>">
												<%=Validator.isNotNull(qualifedExpertInfo)&&Validator.isNotNull(qualifedExpertInfo.getQualifedOneExpirationDate())?new SimpleDateFormat("yyyy-MM-dd").format(qualifedExpertInfo.getQualifedOneExpirationDate()):""%></td>
												</tr>
												<input type="hidden" id="qualifedExpertOneDetailId<%=qualifedExpertAddCounter%>" name="qualifedExpertOneDetailId<%=qualifedExpertAddCounter%>" value="<%=qualifedExpertInfo.getQualifedExpertOneAddId()%>">
																								<%
																								qualifedExpertAddCounter++;
																								}
																	 }
																							%>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(c)  Monitoring
									Occupational Exposure</span>
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(i) </span>Procedures
									for ascertaining, monitoring and recording radiation doses
									received by all workers
								</p>
								<p class="tab-form-sub-heading  pl-3">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span>Summary
									of the annual radiation doses for each worker, for renewals
									only.
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>Dose
									limits for planned exposure situation, the established dose
									constraints that will be used as part of the organization's
									optimization of protection and safety.
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(iv) </span>Append
									the list of the type(s) of individual and workplace monitoring
									equipment that will be used, including the policy and procedure
									for acquisition, use, monitoring period, maintenance and
									storage, including the policy for calibration and the name of
									all service providers.
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="monitoringExposure" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="monitoringExposure"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getMonitoringExposure())?lowRiskSafety.getMonitoringExposure():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(d) Record and Reporting System</span>
								</p>
								<p class="tab-form-sub-heading pl-3">Append details of the policy and procedures</p>
								<p class="tab-form-sub-heading mb-2 pl-2">
									<span class="tab-form-highlghtme-link pr-2">(a) </span>That outlines the process for retention of records and the list of documents that will be retained at each location of licensed activity including field locations.
								</p>
								<p class="tab-form-sub-heading pl-2">
									<span class="tab-form-highlghtme-link pr-2">(b) </span>For the reporting of accidents, incidents, as well as, any event in which the authority should be notified; e.g. investigations conducted, release of radioactive materials into the environment, remedial actions etc.
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="recordSystem" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="recordSystem"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getRecordSystem())?lowRiskSafety.getRecordSystem():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(e)  Access Control and Security</span>
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and procedures for restricting access to radiation sources, to only authorized and trained persons, as well as, the policy and procedure for alerting the applicant to the loss, theft or unauthorized use of/ access to radiation sources.)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="securityAccessOne" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="securityAccess"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getSecurityAccess())?lowRiskSafety.getSecurityAccess():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(f)  Worker Training, Information and Instructions</span>
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append details of the proposed radiation safety training program and all instructions and information provided for radiation safety including local rules.)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="trainingInformation" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="trainingInformation"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getTrainingInformation())?lowRiskSafety.getTrainingInformation():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(g)  Leak Testing of Sealed Sources</span>
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append policy and procedure for leak testing of sealed sources, including the name of the leak test service provider to be used, if applicable.)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="leakTesting" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="leakTesting"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getLeakTesting())?lowRiskSafety.getLeakTesting():""%></textarea>
							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(h)  Emergency Procedures</span>
								</p>
								<p class="tab-form-sub-heading mb-2 pl-2">(Append a summary of the policy and procedures that will be used in incidents, accidents and other events that involve radiation source(s). Include procedures for notification and response to events as well as policies and prevention and mitigation of accidents.)</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="emergencyProcedures" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="emergencyProcedures"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getEmergencyProcedures())?lowRiskSafety.getEmergencyProcedures():""%></textarea>

							</div>
						</div>
						<div class="col-md-12">
							<div class="form-group">
								<p class="tab-form-main-heading">
									<span class="tab-form-highlghtme-link pr-2">(i)  Management of Radioactive Waste and Disused Sources</span>
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(i) </span>Append details of the policy and procedures for handling and disposing of waste containing radioactive materials - namely waste generation; predisposal, pre-treatment, characterization, treatment, conditioning, storage, control of discharges, clearance, packaging strategies, transport, design and manufacturing of container, handling of waste packages, site evaluation, design, construction, closure and the post-closure stage of estate management facility.
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(ii) </span>
									For disused sources, provide details the safe management of the sources as well as means of disposal.
								</p>
								<p class="tab-form-sub-heading pl-3">
									<span class="tab-form-highlghtme-link pr-2">(iii) </span>Include financial provisions where appropriate, and any contractual agreements regarding repatriation, disposal etc
								</p>
								<textarea rows="3" class="mt-3 form-control" maxlength="255" id="managementSourcesDis" placeholder="" style="border-radius: 5px; width: 100%" aria-describedby="certificationSeekingAddress"><%=Validator.isNotNull(lowRiskSafety)&&Validator.isNotNull(lowRiskSafety.getManagementSourcesDis())?lowRiskSafety.getManagementSourcesDis():""%></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<button type="button" id="saveName"
				onclick="applicantInfo(); radiationSafetyLowRiskSectionSix(false);"
				class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
				Continue to the next form section <span class="ml-2"> <svg
						width="18" height="14" viewBox="0 0 18 14" fill="none"
						xmlns="http://www.w3.org/2000/svg"><pathd ="m6.00016 11.17l1.83016="" 6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002="" 1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016></svg>
				</span>
			</button>
		</div>
<jsp:include page="/forms/specific-requirements-lcence-activity-info.jsp" />
<jsp:include page="/forms/notification-practices-form-detail-info.jsp" />
<jsp:include page="/forms/fit-proper-form-detail-info.jsp" />
	</div>
</div>