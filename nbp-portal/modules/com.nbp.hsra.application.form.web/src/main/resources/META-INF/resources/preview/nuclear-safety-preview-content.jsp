<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/init.jsp" %>
<%
long unsealedSourceAddCounter=1;
long sealedSourcesAddCounter=1;
long radiationDevicesCounter=1;
String numberOfHaccp="";
FileEntry attachDocFE=null;
DLFolder servicingInfo = null;
List<DLFileEntry> servicingInfoFileEntry = null;
FileEntry servicingInfoDocFE=null;

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
			supportingDocumentsFolder1.getFolderId(), "Copy of the curriculum vitae");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
} catch (Exception e) {
}
if (fileEntry2 != null) {
	for (DLFileEntry uploadedFile : fileEntry2) {
		fileEntryexperiencecopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		experiencecopy=fileEntryexperiencecopy.getFileName();
		experiencecopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryexperiencecopy,
				fileEntryexperiencecopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
	}
} 
try{
	supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder1.getFolderId(), "Copies of relevant");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
} catch (Exception e) {
}
if (fileEntry2 != null) {
	for (DLFileEntry uploadedFile : fileEntry2) {
		fileEntrycertificatescopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		certificatescopy=fileEntrycertificatescopy.getFileName();
		certificatescopyUrl=DLURLHelperUtil.getDownloadURL(fileEntrycertificatescopy,
				fileEntrycertificatescopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
	}
} 
try{
	supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder1.getFolderId(), "Details of Qualified Expert ");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
} catch (Exception e) {
}
if (fileEntry2 != null) {
	for (DLFileEntry uploadedFile : fileEntry2) {
		fileEntryqualifiedcopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		qualifiedcopy=fileEntryqualifiedcopy.getFileName();
		qualifiedcopyUrl=DLURLHelperUtil.getDownloadURL(fileEntryqualifiedcopy,
				fileEntryqualifiedcopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
	}
} 
try{
	supportingDocumentsParentFolder1= DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingDocumentsFolder1.getFolderId(), "Curriculum Vitae Copy");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
} catch (Exception e) {
}
if (fileEntry2 != null) {
	for (DLFileEntry uploadedFile : fileEntry2) {
		fileEntrycurriculumcopy = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		curriculumVitaeCopy=fileEntrycurriculumcopy.getFileName();
		curriculumcopyUrl=DLURLHelperUtil.getDownloadURL(fileEntrycurriculumcopy,
				fileEntrycurriculumcopy.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
	}}
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
		scopeOfActivity=fileEntryclassificationOfWork.getFileName();
		scopeOfActivityUrl=DLURLHelperUtil.getDownloadURL(fileEntryclassificationOfWork,
				fileEntryclassificationOfWork.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
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
		investigationLevel=fileEntryhealthWork.getFileName();
		investigationLevelUrl=DLURLHelperUtil.getDownloadURL(fileEntryhealthWork,
				fileEntryhealthWork.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
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
try {
	supportingDocumentsParentFolder1 = DLFolderLocalServiceUtil.getFolder(
			themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
			"Signature of Service Declaration");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
			supportingDocumentsParentFolder1.getFolderId());
	for (DLFileEntry dlFileEntry : fileEntry2) {
		fileEntrySignatureInDeclaration = DLAppLocalServiceUtil
				.getFileEntry(dlFileEntry.getFileEntryId());
		fileUrlInDeclaration = DLURLHelperUtil.getDownloadURL(fileEntrySignatureInDeclaration,
				fileEntrySignatureInDeclaration.getFileVersion(), themeDisplay, StringPool.BLANK, false,
				true);
	}
} catch (Exception e) {
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
			supportingDocumentsFolder1.getFolderId(), "Copy of All Manufacturing");
	fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),supportingDocumentsParentFolder1.getFolderId());
} catch (Exception e) {}
if (fileEntry2 != null) {
	for (DLFileEntry uploadedFile : fileEntry2) {
		fileEntrycopyOfAll= DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		copyOfAll=fileEntrycopyOfAll.getFileName();
		copyOfAllUrl=DLURLHelperUtil.getDownloadURL(fileEntrycopyOfAll,
				fileEntrycopyOfAll.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);}}
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
%>
<div class="nuclear-safety-forms hide">
	<section id="hsraPreviewStep1" class="final-preview-section">
		<div class="nuclear-safety-forms-preview-details">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section I</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionOneEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
									   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
								</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Type of Application</p>
						<p class="sub_heading_content" id="applicationTypePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Current Authorization Number</p>
						<p class="sub_heading_content" id="currentAuthorizationNoPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Reason for Amendment</p>
						<p class="sub_heading_content" id="amendmentReasonPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep2">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section II</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionTwoEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name of Organization</p>
						<p class="sub_heading_content" id="organizationNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Mailing Address</p>
						<p class="sub_heading_content" id="nuclearMailingAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="nuclearMailingParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Organization's T.R.N</p>
						<p class="sub_heading_content" id="nuclearTrnNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="nuclearTelephoneNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax Number</p>
						<p class="sub_heading_content" id="nuclearFaxNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="nuclearEmailAddressPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep3">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section III</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionThreeEdit"> <svg
									width="19" height="19" viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Type of Business</p>
						<p class="sub_heading_content" id="businessTypePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Proof of Legal Status</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Business Number</p>
						<p class="sub_heading_content" id="nuclearBusinessNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Corporation Number</p>
						<p class="sub_heading_content"
							id="nuclearCorporationNumberPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">For Public Institutions, specify the
							enabling legislation (Act)</p>
						<p class="sub_heading_content" id="nuclearPublicActPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Financial Contact Person</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="nuclearNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Parish</p>
						<p class="sub_heading_content" id="nuclearThirdParishPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Address</p>
						<p class="sub_heading_content" id="nuclearAddressThirdPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="nuclearTelephoneNumPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax Number</p>
						<p class="sub_heading_content" id="nuclearfaxNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="nuclearEmailAddPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading financialGuaranteeUpload">Financial Guarantee</p>
				        <p><a class="sub_heading_content" id="financialGuaranteeUpload-preview" href="<%=Validator.isNotNull(financialInfoGuaranteeUrl)? financialInfoGuaranteeUrl:""%>"><%=(Validator.isNotNull(financialInfoGuarantee))?financialInfoGuarantee:""%></a></p>
						<p class="sub_heading_content" id="nuclearFinancialGuaranteePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep4">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section IV</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionFourEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Registration/License Activities</p>
						<p class="sub_heading_content"
							id="nuclearRegistrationLicencePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Location</p>
					</div>
				</div>
				<!-- <div class="col-6">
					<div>
						<p class="sub_heading">Location</p>
						<p class="sub_heading_content" id="applicationTypeLocPreview"></p>
					</div>
				</div> -->
				<div class="col-12">
					<div>
						<p class="sub_heading">Address of place of business</p>
						<p class="sub_heading_content" id="nuclearBusinessPlacePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Main address of storage and/ or use/ or
							any other activity</p>
						<p class="sub_heading_content" id="nuclearActivityMainAddPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading_content" id="applicationTypeLocPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Additional information regarding other
							locations of storage and/or use</p>
						<p class="sub_heading_content"
							id="nuclearAdditionalLocationPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading unsealedCertiCopy"></p>
						<p><a class="sub_heading_content" id="unsealedCertiCopy-preview"></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addUnsealedSourcesDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Radionuclide</th>
								<th class="sub_heading text-nowrap">Maximum Activity in
									possession at any one time</th>
								<th class="sub_heading text-nowrap">Total Activity to be
									acquired per year</th>
								<th class="sub_heading text-nowrap">Use</th>
								<th class="sub_heading text-nowrap">Attach File Details</th>
							</tr>
							<%
	
	 if(Validator.isNotNull(unsealedSourceAdd)&&unsealedSourceAdd.size()>0){
			for(UnsealedSourceAdd unsealedAddInfo:unsealedSourceAdd){ 
		FileEntry attachDocFE1=null;
		 numberOfHaccp="";      
	                         
		 try {
         	supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"Unsealed Certificate Copy"+unsealedSourceAddCounter);
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE1 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				numberOfHaccp=attachDocFE1.getFileName();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
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
			<a class="file-info sub_heading_content unsealedCertiCopy<%=unsealedSourceAddCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></a>
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
				<div class="col-md-12">
					<div>
						<p class="sub_heading sealedSourceRadDevice"></p>
						<p><a class="sub_heading_content" id="sealedSourceRadDevice-preview"></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addSealedSourcesDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Radionuclide</th>
								<th class="sub_heading text-nowrap">Maximum Activity to be
									contained in any single source</th>
								<th class="sub_heading text-nowrap">Activity Date</th>
								<th class="sub_heading text-nowrap">Number of sealed
									sources - Categories 1, 2 and 3 to be acquired</th>
								<th class="sub_heading text-nowrap">Use</th>
								<th class="sub_heading text-nowrap">Attach File Details</th>
							</tr>
							<%
	
	 if(Validator.isNotNull(sealedSourcesAdd)&&sealedSourcesAdd.size()>0){
			for(SealedSourcesAdd sealedSourcesInfo:sealedSourcesAdd){ 
		FileEntry attachDocFE3=null;
		numberOfHaccp="";      
	                         
		 try {
         	supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"SealedSource Certificate Copy"+sealedSourcesAddCounter);
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE3 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				numberOfHaccp=attachDocFE3.getFileName();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
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
			<a class="file-info sub_heading_content sealedSourceRadDevice<%=sealedSourcesAddCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></a>
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
				<div class="col-md-12">
					<div>
						<p class="sub_heading radDeviceCeritificateCopy"></p>
						<p><a class="sub_heading_content" id="radDeviceCeritificateCopy-preview"></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
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
							</tr>
							<%
	
	 if(Validator.isNotNull(sealedSourcesAdd)&&sealedSourcesAdd.size()>0){
		 for(RadiationDevicesAdd radiationDevicesinfo:radiationDevicesAdd){ 
		FileEntry attachDocFE4=null;
		numberOfHaccp="";      
	                         
		 try {
         	supportingDocumentSubFolderManagment1 = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder1.getFolderId(),
					"RadDevice Certificate Copy"+radiationDevicesCounter);
			fileEntry2 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentSubFolderManagment1.getFolderId());
			for (DLFileEntry dlFileEntry : fileEntry2) {
				attachDocFE4 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
				numberOfHaccp=attachDocFE4.getFileName();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
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
			<a class="file-info sub_heading_content radDeviceCeritificateCopy<%=radiationDevicesCounter%>" href="javascript:void(0)"><%=(Validator.isNotNull(numberOfHaccp))?numberOfHaccp:""%></a>
	</td>
</tr>
<input type="hidden" id="radiationDevicesDetailId<%=radiationDevicesCounter%>" name="radiationDevicesDetailId<%=radiationDevicesCounter%>" value="<%=radiationDevicesinfo.getRadiationDevicesAddId()%>">
							<%
							radiationDevicesCounter++;
							}
 }
						%>
							
							
							
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section hide section-five" id="hsraPreviewStep5">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section V</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionFiveEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Radiation Safety Officer (RSO) Details</p>
					</div>
				</div>
				<!-- <div class="col-12">
						<div>
							<p class="sub_heading">Registration/License Activities</p>
							<p class="sub_heading_content"
								id="nuclearRegistrationLicencePreview"></p>
						</div>
					</div> -->
				<div class="col-md-12">
					<div>
						<p class="sub_heading copy-of-cv">Radiation Safety Officer (RSO) Details</p>
						 <p><a class="sub_heading_content" id="copy-of-cv-preview" href="<%=Validator.isNotNull(copyofcvUrl)? copyofcvUrl:""%>"><%=(Validator.isNotNull(copyofcv))?copyofcv:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="nuclearRsoNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="nuclearRsoTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="nuclearRsoTeleNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Ext</p>
						<p class="sub_heading_content" id="nuclearRsoExtPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="nuclearRsoFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="nuclearRsoEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Details of the duties and
							responsibilities associated with the RSO's role</p>
						<p class="sub_heading_content" id="rsoDetailsPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading experience-copy"></p>
						<p><a class="sub_heading_content" id="experience-copy-preview" href="<%=Validator.isNotNull(experiencecopyUrl)? experiencecopyUrl:""%>"><%=(Validator.isNotNull(experiencecopy))?experiencecopy:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading certificates-copy"></p>
						<p><a class="sub_heading_content" id="certificates-copy-preview" href="<%=Validator.isNotNull(certificatescopyUrl)? certificatescopyUrl:""%>"><%=(Validator.isNotNull(certificatescopy))?certificatescopy:""%></a></p>
					</div>
				</div>
			<!-- 	<div class="col-md-12">
					<div>
						<p class="sub_heading training-expert"></p>
						<p><a class="sub_heading_content" id="training-expert-preview"></p>
					</div>
				</div> -->
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addAlternateRsoDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">RSO Name</th>
								<th class="sub_heading text-nowrap">Title</th>
								<th class="sub_heading text-nowrap">Telephone</th>
								<th class="sub_heading text-nowrap">Ext</th>
								<th class="sub_heading text-nowrap">Fax</th>
								<th class="sub_heading text-nowrap">Email Address</th>
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
				<div class="col-12">
					<div>
						<p>Qualified Expert Details</p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading qualified-copy"></p>
						<p><a class="sub_heading_content" id="qualified-copy-preview" href="<%=Validator.isNotNull(qualifiedcopyUrl)? qualifiedcopyUrl:""%>"><%=(Validator.isNotNull(qualifiedcopy))?qualifiedcopy:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="qualifiedExpertNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="qualifiedExpertTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="qualifiedExpertTelePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Ext</p>
						<p class="sub_heading_content" id="qualifiedExpertExtPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="qualifiedExpertFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="qualifiedExpertEmailPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">HSRA Registration No.</p>
						<p class="sub_heading_content"
							id="qualifiedExpertRegistrationNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">HSRA Registration Expiration Date</p>
						<p class="sub_heading_content" id="qualifiedExpertDatePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Details of the duties and
							responsibilities associated with the Qualified Expert's role</p>
						<p class="sub_heading_content" id="qualifiedDetailsPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading curriculum-copy"></p>
						<p><a class="sub_heading_content" id="curriculum-copy-preview" href="<%=Validator.isNotNull(curriculumcopyUrl)? curriculumcopyUrl:""%>"><%=(Validator.isNotNull(curriculumVitaeCopy))?curriculumVitaeCopy:""%></a></p>
					</div> 
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading qualified-expert"></p>
						<p><a class="sub_heading_content" id="qualified-expert-preview" href="<%=Validator.isNotNull(prospectiveQualifiedUrl)? prospectiveQualifiedUrl:""%>"><%=(Validator.isNotNull(prospectiveQualified))?prospectiveQualified:""%></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addQualifedExpertDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Qualified Expert Name</th>
								<th class="sub_heading text-nowrap">Title</th>
								<th class="sub_heading text-nowrap">Telephone</th>
								<th class="sub_heading text-nowrap">Ext</th>
								<th class="sub_heading text-nowrap">Fax</th>
								<th class="sub_heading text-nowrap">Email Address</th>
								<th class="sub_heading text-nowrap">HSRA Registration No</th>
								<th class="sub_heading text-nowrap">HSRA Registration
									Expiration Date</th>
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
				<div class="col-12">
					<div>
						<p>Other Representative(s) of applicant</p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="applicantNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="applicantTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Limitations of authority</p>
						<p class="sub_heading_content" id="authorityNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="authorityDatePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature of Representative</p>
					<%
								if (Validator.isNotNull(fileUrlOfRegistration)) {
							%>
							<div class="signature_texarea mb-2" id="applicantRepresentativeSignaturePreview">
								<img src="<%=fileUrlOfRegistration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2" id="applicantRepresentativeSignaturePreview"></div>
							<%
								}
							%>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Classification of Workers</p>
						<p class="sub_heading_content"
							id="classificationWorkersListPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading classificationOfWorkers"></p>
						<p><a class="sub_heading_content" id="classificationOfWorkers-preview" href="<%=Validator.isNotNull(classificationOfWorkUrl)? classificationOfWorkUrl:""%>"><%=(Validator.isNotNull(classificationOfWork))?classificationOfWork:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Individual Protective Equipment and
							Safety Appliances</p>
						<p class="sub_heading_content" id="equipmentProtectionPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading radiationProUpload"></p>
						<p><a class="sub_heading_content" id="radiationProUpload-preview" href="<%=Validator.isNotNull(radiationProUrl)? radiationProUrl:""%>"><%=(Validator.isNotNull(radiationPro))?radiationPro:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading scopeOfActivitiesUpload">Scope of Activities</p>
						<p class="sub_heading_content" id="scopeOfActivitiesPreview"></p>
						<p><a class="sub_heading_content" id="scopeOfActivitiesUpload-preview" href="<%=Validator.isNotNull(scopeOfActivityUrl)? scopeOfActivityUrl:""%>"><%=(Validator.isNotNull(scopeOfActivity))?scopeOfActivity:""%></a></p>
					</div>
				</div>
				
				<div class="col-6">
					<div>
						<p class="sub_heading managementSystemUpload">Management System</p>
						<p class="sub_heading_content" id="managementSystemPreview"></p>
						<p><a class="sub_heading_content" id="managementSystemUpload-preview" href="<%=Validator.isNotNull(managementSystemUrl)? managementSystemUrl:""%>"><%=(Validator.isNotNull(managementSystem))?managementSystem:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Monitoring Occupational Exposure</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading workerRecordingsUpload">Ascertaining and recording doses to
							workers</p>
						<p class="sub_heading_content" id="workerRecordingsPreview"></p>
						<p><a class="sub_heading_content" id="workerRecordingsUpload-preview" href="<%=Validator.isNotNull(workerRecordingUrl)? workerRecordingUrl:""%>"><%=(Validator.isNotNull(workerRecording))?workerRecording:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">For new licences, provide dose
							estimates for all categories of workers</p>
						<p class="sub_heading_content" id="categoriesLicencePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">For renewals, provide a summary of the
							annual radiation doses for each worker</p>
						<p class="sub_heading_content" id="renewalsSummaryPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading constraintsLimitsUpload">Dose limits, dose constraints and
							optimization</p>
						<p class="sub_heading_content" id="constraintsLimitsPreview"></p>
						<p><a class="sub_heading_content" id="constraintsLimitsUpload-preview" href="<%=Validator.isNotNull(constraintSlimitsUrl)? constraintSlimitsUrl:""%>"><%=(Validator.isNotNull(constraintSlimits))?constraintSlimits:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading equipmentMonitoringUpload">Acquisition and maintenance of
							individual monitoring equipment</p>
						<p class="sub_heading_content" id="equipmentMonitoringPreview"></p>
						<p><a class="sub_heading_content" id="equipmentMonitoringUpload-preview" href="<%=Validator.isNotNull(equipmentMonitoringUrl)? equipmentMonitoringUrl:""%>"><%=(Validator.isNotNull(equipmentMonitoring))?equipmentMonitoring:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading areasControlUpload"></p>
						<p><a class="sub_heading_content" id="areasControlUpload-preview" href="<%=Validator.isNotNull(areaControlUrl)? areaControlUrl:""%>"><%=(Validator.isNotNull(areaControl))?areaControl:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading classificationAreaUpload">Classification of areas (control and
							supervised areas) and local rules</p>
						<p class="sub_heading_content" id="areasControlPreview"></p>
						<p><a class="sub_heading_content" id="classificationAreaUpload-preview" href="<%=Validator.isNotNull(classificationAreaUrl)? classificationAreaUrl:""%>"><%=(Validator.isNotNull(classificationArea))?classificationArea:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading radioactiveSourcesUpload">Control of radioactive contamination;
							where unsealed radiation sources are handled</p>
						<p class="sub_heading_content" id="radioactiveSourcesPreview"></p>
						<p><a class="sub_heading_content" id="radioactiveSourcesUpload-preview" href="<%=Validator.isNotNull(radioactiveSourceUrl)? radioactiveSourceUrl:""%>"><%=(Validator.isNotNull(radioactiveSource))?radioactiveSource:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading radiationiInstrumentsUpload">Radiation detection instruments</p>
						<p class="sub_heading_content" id="radiationiInstrumentsPreview"></p>
						<p><a class="sub_heading_content" id="radiationiInstrumentsUpload-preview" href="<%=Validator.isNotNull(radiationInstrumentUrl)? radiationInstrumentUrl:""%>"><%=(Validator.isNotNull(radiationInstrument))?radiationInstrument:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading healthWorkersUpload">Health Surveillance of Workers</p>
						<p class="sub_heading_content" id="healthWorkersPreview"></p>
						<p><a class="sub_heading_content" id="healthWorkersUpload-preview" href="<%=Validator.isNotNull(healthWorkUrl)? healthWorkUrl:""%>"><%=(Validator.isNotNull(healthWork))?healthWork:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading investigationLevelUpload">Investigation Levels and Feedback of
							Operating Experience</p>
						<p class="sub_heading_content" id="investigationLevelPreview"></p>
						<p><a class="sub_heading_content" id="investigationLevelUpload-preview" href="<%=Validator.isNotNull(investigationLevelUrl)? investigationLevelUrl:""%>"><%=(Validator.isNotNull(investigationLevel))?investigationLevel:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading recordReportingUpload">Record and Reporting System</p>
						<p class="sub_heading_content" id="policyDetailsPreview"></p>
						<p><a class="sub_heading_content" id="recordReportingUpload-preview" href="<%=Validator.isNotNull(recordReportingUrl)? recordReportingUrl:""%>"><%=(Validator.isNotNull(recordReporting))?recordReporting:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading securityAccessUpload">Access control and security</p>
						<p class="sub_heading_content" id="securityAccessPreview"></p>
						<p><a class="sub_heading_content" id="securityAccessUpload-preview" href="<%=Validator.isNotNull(securityAccessUrl)? securityAccessUrl:""%>"><%=(Validator.isNotNull(securityAccess))?securityAccess:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading raditionSourcesUpload">Controlling possession of radiation
							sources</p>
						<p class="sub_heading_content" id="raditionSourcesPreview"></p>
						<p><a class="sub_heading_content" id="raditionSourcesUpload-preview" href="<%=Validator.isNotNull(raditionSourceUrl)? raditionSourceUrl:""%>"><%=(Validator.isNotNull(raditionSource))?raditionSource:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading workerTrainingUpload">Worker Training and Authorization</p>
						<p class="sub_heading_content" id="workerTrainingPreview"></p>
						<p><a class="sub_heading_content" id="workerTrainingUpload-preview" href="<%=Validator.isNotNull(workTraninigUrl)? workTraninigUrl:""%>"><%=(Validator.isNotNull(workTraninig))?workTraninig:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading publicControlUpload">Control of Public Exposure</p>
						<p class="sub_heading_content" id="publicControlPreview"></p>
						<p><a class="sub_heading_content" id="publicControlUpload-preview" href="<%=Validator.isNotNull(publicControlUrl)? publicControlUrl:""%>"><%=(Validator.isNotNull(publicControl))?publicControl:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Management of Radioactive Waste and
							Disused Sources</p>
						<p class="sub_heading_content" id="managementSourcesPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading emergencyProceeUpload">Emergency Procedures</p>
						<p class="sub_heading_content" id="publicControlPreview"></p>
						<p><a class="sub_heading_content" id="emergencyProceeUpload-preview" href="<%=Validator.isNotNull(safetyEmergencyUrl)? safetyEmergencyUrl:""%>"><%=(Validator.isNotNull(safetyEmergency1))?safetyEmergency1:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading licenceLocationUpload">Decommissioning</p>
						<p class="sub_heading_content" id="licenceLocationPreview"></p>
						<p><a class="sub_heading_content" id="licenceLocationUpload-preview" href="<%=Validator.isNotNull(licenceLocationUrl)? licenceLocationUrl:""%>"><%=(Validator.isNotNull(licenceLocation))?licenceLocation:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Radiation Protection Program Policies</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading lowAchievableProgramUpload">As Low As Reasonably Achievable (ALARA)
							Program</p>
						<p class="sub_heading_content" id="achievableProgramPreview"></p>
						<p><a class="sub_heading_content" id="lowAchievableProgramUpload-preview" href="<%=Validator.isNotNull(lowAchievableUrl)? lowAchievableUrl:""%>"><%=(Validator.isNotNull(lowAchievable))?lowAchievable:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading leakTestingUpload">Leak testing of sealed sources</p>
						<p class="sub_heading_content" id="leakTestingProgramPreview"></p>
						<p><a class="sub_heading_content" id="leakTestingUpload-preview" href="<%=Validator.isNotNull(leakTestingUrl)? leakTestingUrl:""%>"><%=(Validator.isNotNull(leakTesting))?leakTesting:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading transferSourcesUpload">Transfer of radiation sources</p>
						<p class="sub_heading_content" id="transferSourcesPreview"></p>
						<p><a class="sub_heading_content" id="transferSourcesUpload-preview" href="<%=Validator.isNotNull(transferSourceUrl)? transferSourceUrl:""%>"><%=(Validator.isNotNull(transferSource))?transferSource:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading nuclearMaterialsUpload">Transfer of radiation sources and /
							nuclear materials</p>
						<p class="sub_heading_content" id="nuclearMaterialsPreview"></p>
						<p><a class="sub_heading_content" id="nuclearMaterialsUpload-preview" href="<%=Validator.isNotNull(nuclearMaterialUrl)? nuclearMaterialUrl:""%>"><%=(Validator.isNotNull(nuclearMaterial))?nuclearMaterial:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading transportPackagingUpload">Packaging and transport of radiation
							sources and/nuclear materials</p>
						<p class="sub_heading_content" id="transportPackagingPreview"></p>
						<p><a class="sub_heading_content" id="transportPackagingUpload-preview" href="<%=Validator.isNotNull(packagingTransferUrl)? packagingTransferUrl:""%>"><%=(Validator.isNotNull(packagingTransfer))?packagingTransfer:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading internalReviewUpload">Internal review</p>
						<p class="sub_heading_content" id="internalReviewPreview"></p>
						<p><a class="sub_heading_content" id="internalReviewUpload-preview" href="<%=Validator.isNotNull(safetyInternalUrl)? safetyInternalUrl:""%>"><%=(Validator.isNotNull(safetyInternal))?safetyInternal:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading sourcesActivitiesUpload">Append Safety Assessment for facilities
							of activities involving sources of Categories 1 and 2</p>
						<p class="sub_heading_content" id="sourcesActivitiesPreview"></p>
						<p><a class="sub_heading_content" id="sourcesActivitiesUpload-preview" href="<%=Validator.isNotNull(appendSafetyUrl)? appendSafetyUrl:""%>"><%=(Validator.isNotNull(appendSafety))?appendSafety:""%></a></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section hide section-six" id="hsraPreviewStep6">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section VI</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionSixEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Radiation Safety Program-low Risk Sources</p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading certificates-cv"></p>
						<p><a class="sub_heading_content" id="certificates-cv-preview" href="<%=Validator.isNotNull(certificateCvUrl)? certificateCvUrl:""%>"><%=(Validator.isNotNull(certificateCv))?certificateCv:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="appendixRsoNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="appendixRsoTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="appendixRsoTeleNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Ext</p>
						<p class="sub_heading_content" id="appendixRsoExtPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="appendixRsoFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="appendixRsoEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Details of the duties and
							responsibilities associated with the RSO's role</p>
						<p class="sub_heading_content" id="appendixRsoDetailsPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading resume-copy"></p>
						<p><a class="sub_heading_content" id="resume-copy-preview" href="<%=Validator.isNotNull(resumeCopyUrl)? resumeCopyUrl:""%>"><%=(Validator.isNotNull(resumeCopy))?resumeCopy:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading training-copy"></p>
						<p><a class="sub_heading_content" id="training-copy-preview" href="<%=Validator.isNotNull(trainingCopyUrl)? trainingCopyUrl:""%>"><%=(Validator.isNotNull(trainingCopy))?trainingCopy:""%></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addAlternateRsoOneDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">RSO Name</th>
								<th class="sub_heading text-nowrap">Title</th>
								<th class="sub_heading text-nowrap">Telephone</th>
								<th class="sub_heading text-nowrap">Ext</th>
								<th class="sub_heading text-nowrap">Fax</th>
								<th class="sub_heading text-nowrap">Email Address</th>
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
										</tr>
										<input type="hidden" id="alternateRsoOneDetailId<%=alternateRsoOneAddCounter%>" name="alternateRsoOneDetailId<%=alternateRsoOneAddCounter%>" value="<%=alternateRsoOneInfo.getAlternateRsoOneAddId()%>">
																	<%
																	alternateRsoOneAddCounter++;
																	}}
																%>	
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p>Qualified Expert Details</p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading relevant-cv-copy"></p>
						<p><a class="sub_heading_content" id="relevant-cv-copy-preview" href="<%=Validator.isNotNull(relevantCopyUrl)? relevantCopyUrl:""%>"><%=(Validator.isNotNull(relevantCopy))?relevantCopy:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Name</p>
						<p class="sub_heading_content" id="qualifiedAppendixNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="qualifiedAppendixTitlePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Telephone</p>
						<p class="sub_heading_content" id="qualifiedAppendixTelePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Ext</p>
						<p class="sub_heading_content" id="qualifiedAppendixExtPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Fax</p>
						<p class="sub_heading_content" id="qualifiedAppendixFaxPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="qualifiedAppendixEmailPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">HSRA Registration No.</p>
						<p class="sub_heading_content"
							id="qualifiedAppendixRegistrationNoPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">HSRA Registration Expiration Date</p>
						<p class="sub_heading_content" id="qualifiedAppendixDatePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Details of the duties and
							responsibilities associated with the Qualified Expert's role</p>
						<p class="sub_heading_content"
							id="qualifiedAppendixDetailsPreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading qualified-resume-copy"></p>
						<p><a class="sub_heading_content" id="qualified-resume-copy-preview" href="<%=Validator.isNotNull(qualifiedCopyUrl)? qualifiedCopyUrl:""%>"><%=(Validator.isNotNull(qualifiedCopy))?qualifiedCopy:""%></a></p>
					</div>
				</div>
				<div class="col-md-12">
					<div>
						<p class="sub_heading training-expert"></p>
						<p><a class="sub_heading_content" id="training-expert-preview" href="<%=Validator.isNotNull(trainingExpertUrl)? trainingExpertUrl:""%>"><%=(Validator.isNotNull(trainingExpert))?trainingExpert:""%></a></p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addQualifedExpertOneDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Qualified Expert Name</th>
								<th class="sub_heading text-nowrap">Title</th>
								<th class="sub_heading text-nowrap">Telephone</th>
								<th class="sub_heading text-nowrap">Ext</th>
								<th class="sub_heading text-nowrap">Fax</th>
								<th class="sub_heading text-nowrap">Email Address</th>
								<th class="sub_heading text-nowrap">HSRA Registration No</th>
								<th class="sub_heading text-nowrap">HSRA Registration
									Expiration Date</th>
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
																	} }
																%>
						</tbody>
					</table>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Monitoring Occupational Exposure</p>
						<p class="sub_heading_content" id="monitoringExposurePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Record and Reporting System</p>
						<p class="sub_heading_content" id="recordSystemPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Access Control and Security</p>
						<p class="sub_heading_content" id="securityAccessPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Worker Training, Information and
							Instructions</p>
						<p class="sub_heading_content" id="trainingInformationPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Leak Testing of Sealed Sources</p>
						<p class="sub_heading_content" id="leakTestingPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Emergency Procedures</p>
						<p class="sub_heading_content" id="emergencyProceduresPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Management of Radioactive Waste and
							Disused Sources</p>
						<p class="sub_heading_content" id="managementSourcesDisPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep7">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section VII</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="sectionSevenEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Specific Requirements Based on Proposed Licence Activity</p>
					</div>
				</div>
				<div class="col-12">
					<p>(a) Medical Practices</p>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addMedicalPractitionerDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Address</th>
								<th class="sub_heading text-nowrap">Telephone</th>
								<th class="sub_heading text-nowrap">Fax Number</th>
								<th class="sub_heading text-nowrap">Email</th>
								<th class="sub_heading text-nowrap">Licence No</th>
				
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
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addAcknowledgementMedicalDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Signature</th>
								<th class="sub_heading text-nowrap">Date</th>
							</tr>
												<%
												List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
												DLFolder supportingDocumentsAcknowParentFolder = null;
												DLFolder supportingDocumentsAcknowFolder = null;
												DLFolder supportingDocumentAcknowSubFolderManagment = null;
												try {
													supportingDocumentsAcknowParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
													supportingDocumentsAcknowFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															supportingDocumentsAcknowParentFolder.getFolderId(), String.valueOf(hsraApplicationId));
												} catch (Exception e) {}
										if (medical != null) {
											long medicalPracticionerDataCounter = 1;
											for (AddMedicalPractitioner addmedical: medical) {
												if (addmedical.getMedicalPractitionerDate() != null) {
												fileUrlInAcknowledgeMedical="";
												try {
													supportingDocumentAcknowSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
															themeDisplay.getScopeGroupId(), supportingDocumentsAcknowFolder.getFolderId(),
															"Signature of Acknowledgement Medical"+medicalPracticionerDataCounter);
													fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
															supportingDocumentAcknowSubFolderManagment.getFolderId());
													for (DLFileEntry dlFileEntry : fileEntry) {
														attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
														fileUrlInAcknowledgeMedical=DLURLHelperUtil.getPreviewURL(attachDocFE,
																attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
													}} catch (Exception e) {}
									             %>
												<tr class="acknowledgement-medical-row<%=medicalPracticionerDataCounter%>">
							            <td class="sub_heading_content acknowledgementMedicalSignature<%=medicalPracticionerDataCounter%>">
							            <div class="signature_texarea mb-2" id="acknowledgementMedicalSignature">
												<img src="<%=Validator.isNotNull(fileUrlInAcknowledgeMedical)?fileUrlInAcknowledgeMedical:""%>" class="thumb-image" style="height: 100px; width: 100px;">
										</div>
										</td>
										<td class="sub_heading_content acknowledgementMedicalDate<%=medicalPracticionerDataCounter%>">
										<%=Validator.isNotNull(addmedical)&&Validator.isNotNull(addmedical.getMedicalPractitionerDate())?new SimpleDateFormat("YYYY-dd-MM").format(addmedical.getMedicalPractitionerDate()):"" %></td>
									</tr>
									<input type="hidden" id="acknowledgementMedicalDetail<%=medicalPracticionerDataCounter%>" name="acknowledgementMedicalDetail<%=medicalPracticionerDataCounter%>" value="<%=addmedical.getAddMedicalPractitionerId()%>">
									<%
									medicalPracticionerDataCounter++;
						       }}}
					                %>			
						</tbody>
					</table>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addApplicantSignatureDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Signature</th>
								<th class="sub_heading text-nowrap">Date</th>
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
															}
														} catch (Exception e) {}
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
				<div class="col-6">
					<div>
						<p class="sub_heading administrationTreatmentUpload">Administration of Radiation Doses for
							Therapeutic Treatment</p>
						<p class="sub_heading_content" id="administrationTreatmentPreview"></p>
						<p><a class="sub_heading_content" id="administrationTreatmentUpload-preview" href="<%=Validator.isNotNull(adminstrationOfRadiationUrl)? adminstrationOfRadiationUrl:""%>"><%=(Validator.isNotNull(adminstrationOfRadiation))?adminstrationOfRadiation:""%></a></p>
					</div>
				</div>
<!-- 				<div class="col-md-12">
					<div>
						<p class="sub_heading certificates-cv"></p>
						<p><a class="sub_heading_content" id="certificates-cv-preview"></a></p>
					</div>
				</div>
 -->				<div class="col-6">
					<div>
						<p class="sub_heading qualityProgrammeUpload">Quality Assurance Programme for Medical
							Exposure</p>
						<p class="sub_heading_content" id="qualityProgrammePreview"></p>
						<p><a class="sub_heading_content" id="qualityProgrammeUpload-preview" href="<%=Validator.isNotNull(qualityAssuranceProgrammeUrl)? qualityAssuranceProgrammeUrl:""%>"><%=(Validator.isNotNull(qualityAssuranceProgramme))?qualityAssuranceProgramme:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading instructionsCaregiversUpload">Instructions to Caregivers</p>
						<p class="sub_heading_content" id="instructionsCaregiversPreview"></p>
						<p><a class="sub_heading_content" id="instructionsCaregiversUpload-preview" href="<%=Validator.isNotNull(instructionOfCaregiverUrl)? instructionOfCaregiverUrl:""%>"><%=(Validator.isNotNull(instructionOfCaregiver))?instructionOfCaregiver:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading instructionsPatientsUpload">Instructions to Patients and their
							Families</p>
						<p class="sub_heading_content" id="instructionsPatientsPreview"></p>
						<p><a class="sub_heading_content" id="instructionsPatientsUpload-preview" href="<%=Validator.isNotNull(instructionOfPatientsUrl)? instructionOfPatientsUrl:""%>"><%=(Validator.isNotNull(instructionOfPatients))?instructionOfPatients:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading patientsReleaseUpload">Release of Patients</p>
						<p class="sub_heading_content" id="patientsReleasePreview"></p>
						<p><a class="sub_heading_content" id="patientsReleaseUpload-preview" href="<%=Validator.isNotNull(releaseOfPatientsUrl)? releaseOfPatientsUrl:""%>"><%=(Validator.isNotNull(releaseOfPatients))?releaseOfPatients:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading treatmentRoomsUpload">Decontamination and Release of
							Treatment Rooms</p>
						<p class="sub_heading_content" id="treatmentRoomsPreview"></p>
						<p><a class="sub_heading_content" id="treatmentRoomsUpload-preview" href="<%=Validator.isNotNull(treatmentRoomsUploadUrl)? treatmentRoomsUploadUrl:""%>"><%=(Validator.isNotNull(treatmentRoomsUpload))?treatmentRoomsUpload:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading medicalEmergenciesUpload">Medical Emergencies</p>
						<p class="sub_heading_content" id="medicalEmergenciesPreview"></p>
						<p><a class="sub_heading_content" id="medicalEmergenciesUpload-preview" href="<%=Validator.isNotNull(medicalEmergenciesUrl)? medicalEmergenciesUrl:""%>"><%=(Validator.isNotNull(medicalEmergencies))?medicalEmergencies:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading diagnosticStudiesUpload">Diagnostic Studies Protocols and
							Procedures</p>
						<p class="sub_heading_content" id="diagnosticStudiesPreview"></p>
						<p><a class="sub_heading_content" id="diagnosticStudiesUpload-preview" href="<%=Validator.isNotNull(diagnosticStudiesProtocolUrl)? diagnosticStudiesProtocolUrl:""%>"><%=(Validator.isNotNull(diagnosticStudiesProtocol))?diagnosticStudiesProtocol:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading nuclearMedicineUpload">For Therapeutic Nuclear Medicine:
							Assignment of Nuclear Medicine Therapy Rooms</p>
						<p class="sub_heading_content" id="nuclearMedicinePreview"></p>
						<p><a class="sub_heading_content" id="nuclearMedicineUpload-preview" href="<%=Validator.isNotNull(nuclearMedicineUrl)? nuclearMedicineUrl:""%>"><%=(Validator.isNotNull(nuclearMedicine))?nuclearMedicine:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading biomedicalResearchUpload">For Biomedical Research</p>
						<p class="sub_heading_content" id="biomedicalResearchPreview"></p>
						<p><a class="sub_heading_content" id="biomedicalResearchUpload-preview" href="<%=Validator.isNotNull(biomedicalResearchUrl)? biomedicalResearchUrl:""%>"><%=(Validator.isNotNull(biomedicalResearch))?biomedicalResearch:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading researchReviewUpload">Research Review Committee</p>
						<p class="sub_heading_content" id="researchReviewPreview"></p>
						<p><a class="sub_heading_content" id="researchReviewUpload-preview" href="<%=Validator.isNotNull(researchReviewComitteeUrl)? researchReviewComitteeUrl:""%>"><%=(Validator.isNotNull(researchReviewComittee))?researchReviewComittee:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(b) Industrial Radiography</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading emergencyOperatingUpload">Emergency and Operating Procedures</p>
						<p class="sub_heading_content" id="emergencyOperatingPreview"></p>
						<p><a class="sub_heading_content" id="emergencyOperatingUpload-preview" href="<%=Validator.isNotNull(emergencyAndOperatingUrl)? emergencyAndOperatingUrl:""%>"><%=(Validator.isNotNull(emergencyAndOperating))?emergencyAndOperating:""%></a></p>
					</div>
				</div>

				<div class="col-6">
					<div>
						<p class="sub_heading certificatePackagesUpload">Application for Registration of Use of
							Packages</p>
						<p class="sub_heading_content" id="certificatePackagesPreview"></p>
						<p><a class="sub_heading_content" id="certificatePackagesUpload-preview" href="<%=Validator.isNotNull(applicationForResgisUrl)? applicationForResgisUrl:""%>"><%=(Validator.isNotNull(applicationForResgis))?applicationForResgis:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading exposureDevicesUpload">Maintenance and Use of Exposure Devices</p>
						<p class="sub_heading_content" id="exposureDevicesPreview"></p>
						<p><a class="sub_heading_content" id="exposureDevicesUpload-preview" href="<%=Validator.isNotNull(useOfExposureUrl)? useOfExposureUrl:""%>"><%=(Validator.isNotNull(useOfExposure))?useOfExposure:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading equipmentSafetyUpload">Safety and Emergency Equipment</p>
						<p class="sub_heading_content" id="equipmentSafetyPreview"></p>
						<p><a class="sub_heading_content" id="equipmentSafetyUpload-preview" href="<%=Validator.isNotNull(safetyEmergency2Url)? safetyEmergency2Url:""%>"><%=(Validator.isNotNull(safetyEmergency2))?safetyEmergency2:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading transportPlanOneUpload">Transport Plan</p>
						<p class="sub_heading_content" id="transportPlanPreview"></p>
						<p><a class="sub_heading_content" id="transportPlanOneUpload-preview" href="<%=Validator.isNotNull(transportUrl)? transportUrl:""%>"><%=(Validator.isNotNull(transport))?transport:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(c) Vetrinary Nuclear Medicine</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading animalsTreatmentUpload">Administering Treatment to Animals</p>
						<p class="sub_heading_content" id="animalsTreatmentPreview"></p>
						<p><a class="sub_heading_content" id="animalsTreatmentUpload-preview" href="<%=Validator.isNotNull(treatmentAnimalUrl)? treatmentAnimalUrl:""%>"><%=(Validator.isNotNull(treatmentAnimal))?treatmentAnimal:""%></a></p>
					</div>
				</div>

				<div class="col-6">
					<div>
						<p class="sub_heading animalHousingUpload">Animal Housing</p>
						<p class="sub_heading_content" id="animalHousingPreview"></p>
						<p><a class="sub_heading_content" id="animalHousingUpload-preview" href="<%=Validator.isNotNull(animalHouseUrl)? animalHouseUrl:""%>"><%=(Validator.isNotNull(animalHouse))?animalHouse:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading disposalWasteUpload">Disposal of Animal Waste</p>
						<p class="sub_heading_content" id="disposalWastePreview"></p>
						<p><a class="sub_heading_content" id="disposalWasteUpload-preview" href="<%=Validator.isNotNull(disposalWasteUrl)? disposalWasteUrl:""%>"><%=(Validator.isNotNull(disposalWaste))?disposalWaste:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading monitoringAnimalHousingUpload">Monitoring and Release of Animal
							Housing</p>
						<p class="sub_heading_content" id="monitoringAnimalHousingPreview"></p>
						<p><a class="sub_heading_content" id="monitoringAnimalHousingUpload-preview" href="<%=Validator.isNotNull(releaseOfAnimalHostingUrl)? releaseOfAnimalHostingUrl:""%>"><%=(Validator.isNotNull(releaseOfAnimalHosting))?releaseOfAnimalHosting:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading releaseAnimalsUpload">Release of Animals</p>
						<p class="sub_heading_content" id="releaseAnimalsPreview"></p>
						<p><a class="sub_heading_content" id="releaseAnimalsUpload-preview" href="<%=Validator.isNotNull(releaseOfAnimalUrl)? releaseOfAnimalUrl:""%>"><%=(Validator.isNotNull(releaseOfAnimal))?releaseOfAnimal:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(d) Other Industries That Use Nuclear Material</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading proceduresAppUpload">Procedures</p>
						<p class="sub_heading_content" id="proceduresAppPreview"></p>
						<p><a class="sub_heading_content" id="proceduresAppUpload-preview" href="<%=Validator.isNotNull(appendProcedureUrl)? appendProcedureUrl:""%>"><%=(Validator.isNotNull(appendProcedure))?appendProcedure:""%></a></p>
					</div>
				</div>

				<div class="col-6">
					<div>
						<p class="sub_heading disposalsAppUpload">Disposals</p>
						<p class="sub_heading_content" id="disposalsAppPreview"></p>
						<p><a class="sub_heading_content" id="disposalsAppUpload-preview" href="<%=Validator.isNotNull(managementDiposalUrl)? managementDiposalUrl:""%>"><%=(Validator.isNotNull(managementDiposal))?managementDiposal:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading monitoringMaterialNuUpload">Monitoring</p>
						<p class="sub_heading_content" id="monitoringMaterialNuPreview"></p>
						<p><a class="sub_heading_content" id="monitoringMaterialNuUpload-preview" href="<%=Validator.isNotNull(proceduresForMoniUrl)? proceduresForMoniUrl:""%>"><%=(Validator.isNotNull(proceduresForMoni))?proceduresForMoni:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(e) Gauges (Fixed & Portable)</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading handlingProceduresUpload">Handling Procedures</p>
						<p class="sub_heading_content" id="handlingProceduresPreview"></p>
						<p><a class="sub_heading_content" id="handlingProceduresUpload-preview" href="<%=Validator.isNotNull(handlingProUrl)? handlingProUrl:""%>"><%=(Validator.isNotNull(handlingPro))?handlingPro:""%></a></p>
					</div>
				</div>

				<div class="col-6">
					<div>
						<p class="sub_heading hoppersEntryUpload">Rules for Entry into the Vessels or Hoppers</p>
						<p class="sub_heading_content" id="hoppersEntryPreview"></p>
						<p><a class="sub_heading_content" id="hoppersEntryUpload-preview" href="<%=Validator.isNotNull(rulesForEntryUrl)? rulesForEntryUrl:""%>"><%=(Validator.isNotNull(rulesForEntry))?rulesForEntry:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading operatingConditionsUpload">Operating Conditions and Maintenance Programme</p>
						<p class="sub_heading_content" id="operatingConditionsPreview"></p>
						<p><a class="sub_heading_content" id="operatingConditionsUpload-preview" href="<%=Validator.isNotNull(operatingConUrl)? operatingConUrl:""%>"><%=(Validator.isNotNull(operatingCon))?operatingCon:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading insertionTypeUpload">Operation of Insertion-Type Fixed Gauges</p>
						<p class="sub_heading_content" id="insertionTypePreview"></p>
						<p><a class="sub_heading_content" id="insertionTypeUpload-preview" href="<%=Validator.isNotNull(operationOfInserUrl)? operationOfInserUrl:""%>"><%=(Validator.isNotNull(operationOfInser))?operationOfInser:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading installationFixedUpload">Installation and Dismounting of Fixed Gauges</p>
						<p class="sub_heading_content" id="installationFixedPreview"></p>
						<p><a class="sub_heading_content" id="installationFixedUpload-preview" href="<%=Validator.isNotNull(installationOfFixUrl)? installationOfFixUrl:""%>"><%=(Validator.isNotNull(installationOfFix))?installationOfFix:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading transportPlanGaugeUpload">Transport Plan</p>
						<p class="sub_heading_content" id="transportPlanGaugePreview"></p>
						<p><a class="sub_heading_content" id="transportPlanGaugeUpload-preview" href="<%=Validator.isNotNull(transportPlanUrl)? transportPlanUrl:""%>"><%=(Validator.isNotNull(transportPlan))?transportPlan:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading EmergencyAdditionUpload">Emergency Procedures</p>
						<p class="sub_heading_content" id="EmergencyAdditionPreview"></p>
						<p><a class="sub_heading_content" id="EmergencyAdditionUpload-preview" href="<%=Validator.isNotNull(emergencyProUrl)? emergencyProUrl:""%>"><%=(Validator.isNotNull(emergencyPro))?emergencyPro:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(f) Petroleum Exploration (Well Logging)</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading nuclearEnviromentUpload">Release of Radiation Sources</p>
						<p class="sub_heading_content" id="nuclearEnviromentPreview"></p>
						<p><a class="sub_heading_content" id="nuclearEnviromentUpload-preview" href="<%=Validator.isNotNull(releaseOfRadiationUrl)? releaseOfRadiationUrl:""%>"><%=(Validator.isNotNull(releaseOfRadiation))?releaseOfRadiation:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading fishingToolUpload">Fishing for Stuck Tools/Sources</p>
						<p class="sub_heading_content" id="fishingToolPreview"></p>
						<p><a class="sub_heading_content" id="fishingToolUpload-preview" href="<%=Validator.isNotNull(fishingForStruckUrl)? fishingForStruckUrl:""%>"><%=(Validator.isNotNull(fishingForStruck))?fishingForStruck:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading sealedSourcesUpload">Abandonment of Sealed Sources</p>
						<p class="sub_heading_content" id="sealedSourcesPreview"></p>
						<p><a class="sub_heading_content" id="sealedSourcesUpload-preview" href="<%=Validator.isNotNull(abandonmentOfSealedUrl)? abandonmentOfSealedUrl:""%>"><%=(Validator.isNotNull(abandonmentOfSealed))?abandonmentOfSealed:""%></a></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading abandonmentZoneUpload">Abandonment of Unsealed Sources</p>
						<p class="sub_heading_content" id="abandonmentZonePreview"></p>
						<p><a class="sub_heading_content" id="abandonmentZoneUpload-preview" href="<%=Validator.isNotNull(abamdomentOfUnsealedUrl)? abamdomentOfUnsealedUrl:""%>"><%=(Validator.isNotNull(abamdomentOfUnsealed))?abamdomentOfUnsealed:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(g) Servicing</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading servicingCopyUpload">Servicing Procedures</p>
						<p class="sub_heading_content" id="servicingCopyPreview"></p>
						<p><a class="sub_heading_content" id="servicingCopyUpload-preview" href="<%=Validator.isNotNull(servicingProceduresUrl)? servicingProceduresUrl:""%>"><%=(Validator.isNotNull(servicingProcedures))?servicingProcedures:""%></a></p>
					</div>
				</div>
				<div class="col-12">
					<p>(h) Manufacturing</p>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading manufacturingDevelopmentUpload">Manufacturing or Development Procedures</p>
						<p class="sub_heading_content" id="manufacturingDevProcedurePreview"></p>
						<p><a class="sub_heading_content" id="manufacturingDevelopmentUpload-preview" href="<%=Validator.isNotNull(copyOfAllUrl)? copyOfAllUrl:""%>"><%=(Validator.isNotNull(copyOfAll))?copyOfAll:""%></a></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep8">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Declaration</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="generalDeclarationsEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Legal Operator Name</p>
						<p class="sub_heading_content" id="legalOperatorNamePreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Title</p>
						<p class="sub_heading_content" id="operatorTitlePreview"></p>
					</div>
				</div>
				<div class="col-md-12">
					<p class="pt-2 common-para">Signature</p>
					<%
								if (Validator.isNotNull(fileUrlInDeclaration)) {
							%>
							<div class="signature_texarea mb-2" id="signatureOperatorImageHolderPreview">
								<img src="<%=fileUrlInDeclaration%>" class="thumb-image"
									style="height: 100px; width: 100px;">
							</div>
							<%
								} else {
							%>
							<div class="signature_texarea mb-2" id="signatureOperatorImageHolderPreview"></div>
							<%
								}
							%>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Date</p>
						<p class="sub_heading_content" id="operatorDatePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<p class="application-detail-subtitle common-para">Notification of Practices and Sources</p>
	<section class="final-preview-section" id="hsraPreviewStep9">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section 1</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="addressEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Address and Contact Information</p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and address of the legal person</p>
						<p class="sub_heading_content" id="legalPersonNamePreview"></p>
						<p class="sub_heading_content" id="legalPersonAddressPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Name and address of the organization</p>
						<p class="sub_heading_content" id="organizationNamePreview"></p>
						<p class="sub_heading_content" id="organizationAddressPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Contact Number</p>
						<p class="sub_heading_content" id="contactNumberPreview"></p>
					</div>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Email Address</p>
						<p class="sub_heading_content" id="legalPersonEmailPreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p class="sub_heading">Nature of the practice in which the
							source is used</p>
						<p class="sub_heading_content" id="practiceNaturePreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep10">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section 2</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="detailEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Details of Source</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addSourcesDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Identification of
									source</th>
								<th class="sub_heading text-nowrap">Field of application
									and purpose of the Activity</th>
							</tr>
							<%
										if (sourcesDetailAdd != null) {
											long sourcesDetailAddCounter = 1;
											for (SourcesDetailAdd sourcesDetailInfo : sourcesDetailAdd) {
									%>
									<tr class="sources-detail-row<%=sourcesDetailAddCounter%>">
										<td
											class="sub_heading_content sourceIdentification<%=sourcesDetailAddCounter%>">
											<%=Validator.isNotNull(sourcesDetailInfo)
							&& Validator.isNotNull(sourcesDetailInfo.getSourceIdentification())
									? sourcesDetailInfo.getSourceIdentification()
									: ""%>
										</td>
										<td
											class="sub_heading_content stateActivity<%=sourcesDetailAddCounter%>">
											<%=Validator.isNotNull(sourcesDetailInfo)
							&& Validator.isNotNull(sourcesDetailInfo.getStateActivity())
									? sourcesDetailInfo.getStateActivity()
									: ""%>
									</tr>
									<input type="hidden" id="sourcesDetailId<%=sourcesDetailAddCounter%>" name="sourcesDetailId<%=sourcesDetailAddCounter%>" value="<%=sourcesDetailInfo.getSourcesDetailAddId()%>">
									<%
									sourcesDetailAddCounter++;
											}
										}
									%>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep11">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section 3</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="radionuclideEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Radionuclide</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addRadionuclideDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Radionuclide</th>
								<th class="sub_heading text-nowrap">Activity(Bq)</th>
								<th class="sub_heading text-nowrap">Activity Date</th>
								<th class="sub_heading text-nowrap">Chemical form</th>
								<th class="sub_heading text-nowrap">Serial No</th>
								<th class="sub_heading text-nowrap">Location</th>
							</tr>
							 <%
										if (radionuclideAdd != null) {
											long radionuclideAddCounter = 1;
											for (RadionuclideAdd radionuclideinfo : radionuclideAdd) {
									%>
									<tr class="radionuclide-detail-row<%=radionuclideAddCounter%>">
										<td
											class="sub_heading_content radionuclideDetails<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getRadionuclideDetails())
									? radionuclideinfo.getRadionuclideDetails()
									: ""%>
										</td>
										<td
											class="sub_heading_content activityDetails<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getActivityDetails())
									? radionuclideinfo.getActivityDetails()
									: ""%></td>
										<td
											class="sub_heading_content activityDate<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getActivityDate())
									? new SimpleDateFormat("yyyy-MM-dd").format(radionuclideinfo.getActivityDate())
									: ""%></td>
										<td
											class="sub_heading_content chemicalDetailsForm<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getChemicalDetailsForm())
									? radionuclideinfo.getChemicalDetailsForm()
									: ""%></td>
										<td
											class="sub_heading_content serialNo<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo) && Validator.isNotNull(radionuclideinfo.getSerialNo())
									? radionuclideinfo.getSerialNo()
									: ""%></td>
										<td
											class="sub_heading_content radionuclideLocation<%=radionuclideAddCounter%>">
											<%=Validator.isNotNull(radionuclideinfo)
							&& Validator.isNotNull(radionuclideinfo.getRadionuclideLocation())
									? radionuclideinfo.getRadionuclideLocation()
									: ""%></td>
									</tr>
									<input type="hidden"
										id="radionuclideDetailId<%=radionuclideAddCounter%>"
										name="radionuclideDetailId<%=radionuclideAddCounter%>"
										value="<%=radionuclideinfo.getRadionuclideAddId()%>">
									<%
							radionuclideAddCounter++;
							}
 }
						%>
							
						</tbody>
					</table>
				</div>
				<div class="col-6">
					<div>
						<p class="sub_heading">Sealed source</p>
						<p class="sub_heading_content" id="sealedSourcePreview"></p>
					</div>
				</div>
				<div class="col-12">
					<div class="row hide" id="sealedManuPreview">
						<div class="col-6">
							<p class="sub_heading">Manufacturer</p>
							<p class="sub_heading_content" id="manufacturerDetailsPreview"></p>
						</div>
						<div class="col-6">
							<p class="sub_heading">Model No</p>
							<p class="sub_heading_content" id="modelNoPreview"></p>
						</div>
					</div>
				</div>
				<div class="col-6 sealNoMenuPreview">
					<p class="sub_heading">Identification no./code</p>
					<p class="sub_heading_content" id="identificationNoPreview"></p>
				</div>

				<div class="col-6">
					<div>
						<p class="sub_heading">Status</p>
						<p class="sub_heading_content" id="statusDetailsPreview"></p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="final-preview-section" id="hsraPreviewStep12">
		<div class="general-business-info-form">
			<div class="row">
				<div class="col-12">
					<div class="d-flex">
						<p class="heading2">Section 4</p>
						<span class="ml-3"> <a href="javascript:void(0)"
							class="preview-edit-button" id="generatingEdit"> <svg width="19" height="19"
									viewBox="0 0 19 19" fill="none"
									xmlns="http://www.w3.org/2000/svg">
								   <path
										d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z"
										fill="#047247" />
							</svg>
						</a>
						</span>
					</div>
				</div>
				<div class="col-12">
					<div>
						<p>Radiation Generating Equipment</p>
					</div>
				</div>
				<div class="col-12 table-responsive">
					<table class="table table-bordered mb-3">
						<tbody class="addGenEquipmentDetailTable">
							<tr>
								<th class="sub_heading text-nowrap">Manufacturer</th>
								<th class="sub_heading text-nowrap">Model No</th>
								<th class="sub_heading text-nowrap">Serial No</th>
								<th class="sub_heading text-nowrap">Max. Operating Potential</th>
								<th class="sub_heading text-nowrap">Nature of the equipment</th>
								<th class="sub_heading text-nowrap">Location</th>
								<th class="sub_heading text-nowrap">Model</th>
								<th class="sub_heading text-nowrap">Status</th>
								<th class="sub_heading text-nowrap">Date</th>
								<th class="sub_heading text-nowrap">Signature of legal
									person</th>
							</tr>
							<%

											List<DLFileEntry> fileEntry9 = new ArrayList<DLFileEntry>();
												DLFolder supportingDocumentsParentFolder = null;
												DLFolder supportingDocumentsFolder = null;
												DLFolder supportingDocumentSubFolderManagment = null;
												try {
													supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "HSRA Supporting Documents");
													supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
															supportingDocumentsParentFolder.getFolderId(), String.valueOf(hsraApplicationId));
												} catch (Exception e) {
												}
										if (genEquipmentData != null) {
											long genEquipmentDataCounter = 1;
											for (GenEquipmentData genEquipmentInfo : genEquipmentData) {

												try {
													supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
															themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
															"Signature of Equip"+genEquipmentDataCounter);
													fileEntry9 = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
															supportingDocumentSubFolderManagment.getFolderId());
													for (DLFileEntry dlFileEntry : fileEntry9) {
														attachDocFE8 = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
														fileUrlOfLegalPerson=DLURLHelperUtil.getPreviewURL(attachDocFE8,
																attachDocFE8.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
																System.out.println("--------------------------FileUrlOfLegalPerson--------------"+attachDocFE8);
														
													}
												} catch (Exception e) {
												}
												
												System.out.println("---------------------counter------------------"+genEquipmentDataCounter);
									%>
									<tr class="gen-equipment-row<%=genEquipmentDataCounter%>">
										<td
											class="sub_heading_content manufacturerEquipment<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getManufacturerEquipment())
									? genEquipmentInfo.getManufacturerEquipment()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentModel<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentModel())
									? genEquipmentInfo.getEquipmentModel()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentSerial<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentSerial())
									? genEquipmentInfo.getEquipmentSerial()
									: ""%>
										</td>
										<td
											class="sub_heading_content operatingPotential<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getOperatingPotential())
									? genEquipmentInfo.getOperatingPotential()
									: ""%>
										</td>
										<td
											class="sub_heading_content natureEquipment<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getNatureEquipment())
									? genEquipmentInfo.getNatureEquipment()
									: ""%>
										</td>
										<td
											class="sub_heading_content radiationGeneratingLoc<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getRadiationGeneratingLoc())
									? genEquipmentInfo.getRadiationGeneratingLoc()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentModels<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentModels())
									? genEquipmentInfo.getEquipmentModels()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentStatusDetail<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentStatusDetail())
									? genEquipmentInfo.getEquipmentStatusDetail()
									: ""%>
										</td>
										<td
											class="sub_heading_content equipmentDate<%=genEquipmentDataCounter%>">
											<%=Validator.isNotNull(genEquipmentInfo)
							&& Validator.isNotNull(genEquipmentInfo.getEquipmentDate())
									? new SimpleDateFormat("yyyy-MM-dd").format(genEquipmentInfo.getEquipmentDate())
									: ""%>
										</td>
										<td
										class="sub_heading_content legalPersonSignature<%=genEquipmentDataCounter%>">
											<div class="signature_texarea mb-2" id="legalPersonSignature">
												<img src="<%=Validator.isNotNull(fileUrlOfLegalPerson)?fileUrlOfLegalPerson:""%>" class="thumb-image" style="height: 100px; width: 100px;">
											</div>
										</td>
									</tr>
									<input type="hidden"
										id="genEquipmentDetailId<%=genEquipmentDataCounter%>"
										name="genEquipmentDetailId<%=genEquipmentDataCounter%>"
										value="<%=genEquipmentInfo.getGenEquipmentDataId()%>">
									<%
							genEquipmentDataCounter++;
							}
 }
						%> 
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>
</div>