<!-- Init code -->
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%
DLFolder rightSignOfApplicant = null;
List<DLFileEntry> signFileEntry = null;
FileEntry fileEntrySingle = null;
String signUrl = "";
DLFolder serviceSignature = null;
List<DLFileEntry> serviceFileEntry = null;
FileEntry serviceSignFE = null;
String serviceSignUrl = "";
DLFolder docPosBank = null;
List<DLFileEntry> bankruptyFileEntry = null;
FileEntry bankruptcyDocFE=null;
String docBrochure="";
String docBrochureUrl="";
DLFolder docDarftScope = null;
List<DLFileEntry> scopeDraftFileEntry = null;
FileEntry scopeDraftDocFE=null;
String docDraftScope="";
String docDraftScopeUrl="";
DLFolder docIncomingMat = null;
List<DLFileEntry> incomingMatFileEntry = null;
FileEntry incomingMatDocFE=null;
String docIncomingMate="";
String docIncomingMateUrl="";
DLFolder docProduct = null;
List<DLFileEntry> productaFileEntry = null;
FileEntry productaDocFE=null;
String docProdStorage="";
String docProdStorageUrl="";
DLFolder docBuilding = null;
List<DLFileEntry> buildingFileEntry = null;
FileEntry buildingDocFE=null;
String docBuildingAspects="";
String docBuildingAspectsUrl="";
DLFolder docWasteDischarge = null;
List<DLFileEntry> wasteDisFileEntry = null;
FileEntry wasteDisDocFE=null;
String docDischargeWaste="";
String docDischargeWasteUrl="";
DLFolder docTransport = null;
List<DLFileEntry> transportFileEntry = null;
FileEntry transportDocFE=null;
String docTransportDetail="";
String docTransportDetailUrl="";
DLFolder docSubContract = null;
List<DLFileEntry> subContractFileEntry = null;
FileEntry subContractDocFileEntry=null;
String docSubContAct="";
String docSubContActUrl="";
DLFolder docProcessAct = null;
List<DLFileEntry> processActFileEntry = null;
FileEntry processActDocFE=null;
String docProcessActivities="";
String docProcessActivitiesUrl="";
DLFolder operationBroch = null;
List<DLFileEntry> operationScopeFileEntry = null;
FileEntry operationScopeDocFE=null;
String operationScope="";
String operationScopeUrl="";
DLFolder docIncoMaterial = null;
List<DLFileEntry> incoMaterialFileEntry = null;
FileEntry incoMaterialDocFE=null;
String incoMatDoc="";
String incoMatDocUrl="";
DLFolder docProcess = null;
List<DLFileEntry> processFileEntry = null;
FileEntry processDocFE=null;
String processDocument="";
String processDocumentUrl="";
DLFolder docListSubCont = null;
List<DLFileEntry> subContractListFileEntry = null;
FileEntry subContractListDocFE=null;
String docSubContractList="";
String docSubContractListUrl="";
DLFolder docSiteActivities = null;
List<DLFileEntry> siteActivitiesFileEntry = null;
FileEntry siteActivitiesDocFE=null;
String siteActivitiesDoc="";
String siteActivitiesDocUrl="";
try {
	rightSignOfApplicant = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Signature of Applicant");
	signFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),rightSignOfApplicant.getFolderId());
} catch (Exception e) {}
if (signFileEntry != null) {
	for (DLFileEntry uploadedFile : signFileEntry) {
		fileEntrySingle = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		signUrl = DLURLHelperUtil.getDownloadURL(fileEntrySingle, fileEntrySingle.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try {
	serviceSignature = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Signature");
	serviceFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),serviceSignature.getFolderId());
} catch (Exception e) {}
if (serviceFileEntry != null) {
	for (DLFileEntry uploadedFile : serviceFileEntry) {
		serviceSignFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		serviceSignUrl = DLURLHelperUtil.getDownloadURL(serviceSignFE, serviceSignFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docPosBank = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Scope of the Certification");
	bankruptyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docPosBank.getFolderId());
} catch (Exception e) {}
if (bankruptyFileEntry != null) {
	for (DLFileEntry uploadedFile : bankruptyFileEntry) {
		bankruptcyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docBrochure=bankruptcyDocFE.getFileName();
		docBrochureUrl = DLURLHelperUtil.getDownloadURL(bankruptcyDocFE, bankruptcyDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docDarftScope = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Draft Scope");
	scopeDraftFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docDarftScope.getFolderId());
} catch (Exception e) {}
if (scopeDraftFileEntry != null) {
	for (DLFileEntry uploadedFile : scopeDraftFileEntry) {
		scopeDraftDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docDraftScope=scopeDraftDocFE.getFileName();
		docDraftScopeUrl = DLURLHelperUtil.getDownloadURL(scopeDraftDocFE, scopeDraftDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docIncomingMat = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Incoming Materials");
	incomingMatFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docIncomingMat.getFolderId());
} catch (Exception e) {}
if (incomingMatFileEntry != null) {
	for (DLFileEntry uploadedFile : incomingMatFileEntry) {
		incomingMatDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docIncomingMate=incomingMatDocFE.getFileName();
		docIncomingMateUrl = DLURLHelperUtil.getDownloadURL(incomingMatDocFE, incomingMatDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docProduct = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Product Storage");
	productaFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docProduct.getFolderId());
} catch (Exception e) {}
if (productaFileEntry != null) {
	for (DLFileEntry uploadedFile : productaFileEntry) {
		productaDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docProdStorage=productaDocFE.getFileName();
		docProdStorageUrl = DLURLHelperUtil.getDownloadURL(productaDocFE, productaDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docBuilding = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Building and Site Aspects");
	buildingFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docBuilding.getFolderId());
} catch (Exception e) {}
if (buildingFileEntry != null) {
	for (DLFileEntry uploadedFile : buildingFileEntry) {
		buildingDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docBuildingAspects=buildingDocFE.getFileName();
		docBuildingAspectsUrl = DLURLHelperUtil.getDownloadURL(buildingDocFE, buildingDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docWasteDischarge = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Waste and Discharges");
	wasteDisFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWasteDischarge.getFolderId());
} catch (Exception e) {}
if (wasteDisFileEntry != null) {
	for (DLFileEntry uploadedFile : wasteDisFileEntry) {
		wasteDisDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docDischargeWaste=wasteDisDocFE.getFileName();
		docDischargeWasteUrl = DLURLHelperUtil.getDownloadURL(wasteDisDocFE, wasteDisDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docTransport = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Details of Transport");
	transportFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docTransport.getFolderId());
} catch (Exception e) {}
if (transportFileEntry != null) {
	for (DLFileEntry uploadedFile : transportFileEntry) {
		transportDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docTransportDetail=transportDocFE.getFileName();
		docTransportDetailUrl = DLURLHelperUtil.getDownloadURL(transportDocFE, transportDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}
try{
	docSubContract = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Sub Contracted Activities");
	subContractFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docSubContract.getFolderId());
} catch (Exception e) {}
if (subContractFileEntry != null) {
	for (DLFileEntry uploadedFile : subContractFileEntry) {
		subContractDocFileEntry = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docSubContAct=subContractDocFileEntry.getFileName();
		docSubContActUrl = DLURLHelperUtil.getDownloadURL(subContractDocFileEntry, subContractDocFileEntry.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	docProcessAct = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Process Activities");
	processActFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docProcessAct.getFolderId());
} catch (Exception e) {}
if (processActFileEntry != null) {
	for (DLFileEntry uploadedFile : processActFileEntry) {
		processActDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docProcessActivities=processActDocFE.getFileName();
		docProcessActivitiesUrl = DLURLHelperUtil.getDownloadURL(processActDocFE, processActDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	operationBroch = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Scope of the Documents");
	operationScopeFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),operationBroch.getFolderId());
} catch (Exception e) {}
if (operationScopeFileEntry != null) {
	for (DLFileEntry uploadedFile : operationScopeFileEntry) {
		operationScopeDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		operationScope=operationScopeDocFE.getFileName();
		operationScopeUrl=DLURLHelperUtil.getDownloadURL(operationScopeDocFE, operationScopeDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	docSiteActivities = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Site Activities");
	siteActivitiesFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docSiteActivities.getFolderId());
} catch (Exception e) {
}
if (siteActivitiesFileEntry != null) {
	for (DLFileEntry uploadedFile : siteActivitiesFileEntry) {
		siteActivitiesDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		siteActivitiesDoc=siteActivitiesDocFE.getFileName();
		siteActivitiesDocUrl=DLURLHelperUtil.getDownloadURL(siteActivitiesDocFE, siteActivitiesDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	docIncoMaterial = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Incoming materials");
	incoMaterialFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docIncoMaterial.getFolderId());
} catch (Exception e) {}
if (incoMaterialFileEntry != null) {
	for (DLFileEntry uploadedFile : incoMaterialFileEntry) {
		incoMaterialDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		incoMatDoc=incoMaterialDocFE.getFileName();
		incoMatDocUrl=DLURLHelperUtil.getDownloadURL(incoMaterialDocFE, incoMaterialDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	docProcess = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "Processes");
	processFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docProcess.getFolderId());
} catch (Exception e) {}
if (processFileEntry != null) {
	for (DLFileEntry uploadedFile : processFileEntry) {
		processDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		processDocument=processDocFE.getFileName();
		processDocumentUrl=DLURLHelperUtil.getDownloadURL(processDocFE, processDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}} 
try{
	docListSubCont = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
			supportingSubDocumentFolder.getFolderId(), "List of sub contracted activities");
	subContractListFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docListSubCont.getFolderId());
} catch (Exception e) {}
if (subContractListFileEntry != null) {
	for (DLFileEntry uploadedFile : subContractListFileEntry) {
		subContractListDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
		docSubContractList=subContractListDocFE.getFileName();
		docSubContractListUrl=DLURLHelperUtil.getDownloadURL(subContractListDocFE, subContractListDocFE.getFileVersion(),themeDisplay, StringPool.BLANK, false, true);
	}}  
	 %>	