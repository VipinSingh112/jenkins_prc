<%@page import="com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.JtbAddListDriverInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.JtbAddListVehicleRegstLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst"%>
<%@page import="com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBPaymentMethod"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionCraftTraderLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionCraftTrader"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionPlaceOfInterestLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionBikeRentalInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionWaterEmployeeLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionWaterEmployee"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionConCarriageInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionWaterRequiredLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionWaterGenDeclareLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionWaterSportLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionWaterRequired"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionWaterSport"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionTravelAgencyLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionTravelAgency"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionDomesticServiceLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionDomesticTourLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionDomesticService"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionDomesticTour"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionCarRentConditionLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionCarRentCondition"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionCarRentalLicenceLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.AttractDetailFormInfoLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AttractDetailFormInfo"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoHomeStayLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoHomeStay"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoNonHotelGenDecLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoNonHotelRequiredLicLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoNonHotelLicenceLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoNonHotelLicence"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoGenDeclaration"%>
<%@page import="com.nbp.jtb.application.form.service.service.AccoHotelLicenceLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.AccoHotelLicence"%>
<%@page import="com.nbp.jtb.application.form.service.service.JTBCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBCurrentStage"%>
<%@page import="com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil"%>
<%@page import="com.nbp.jtb.application.form.service.model.JTBApplication"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<portlet:resourceURL var="uploadMultipleDocumentsUrl" id="/upload/multiple/documents"></portlet:resourceURL>
<portlet:resourceURL var="uploadGenericDocumentsUrl" id="/upload/multiple/documents"></portlet:resourceURL>
<% 
int counterOfDocuments=1;
JTBApplication jtbApplication=null;
JTBCurrentStage jtbCurrentStage=null;
AccoHotelLicence accoHotelLic =null;
AccoGenDeclaration accoHotelGenDec = null;
AccoNonHotelLicence accoNonHotelLic=null;
AccoNonHotelRequiredLic reqLicence=null;
AccoNonHotelGenDec accoNonHotelGenDec=null;
AccoHomeStay accoHomeStay=null;

AttractDetailFormInfo attractApplicant=null;
AttractionGenDeclareInfo attractiongenDec=null;
AttractionCarRentalLicence carRentalLicence =null;
AttractionCarRentCondition carRentalLicCond =null;
AttractionDomesticTour domesticTour =null;
AttractionDomesticService domesticService =null;
AttractionTravelAgency travelAgency =null;
AttractionWaterSport waterSport =null;
AttractionWaterGenDeclare waterGeneralDec =null;
AttractionWaterRequired waterRequirement =null;
AttractionConCarriageInfo contractCarriage =null;
AttractionTravelHaltApp travelHalt =null;
AttractionWaterEmployee waterEmpLic =null;
AttractionBikeRentalInfo bikeRental =null;
AttractionPlaceOfInterest placeOfInterest =null;
AttractionCraftTrader craftTrader =null;
JTBPaymentMethod jtbPayment=null;

List<JtbAddCraftApplicantInfo> attarctionManagerAdd=null;
int sizeOfAttractionAdd=0;
List<JtbAddBranchDetailInfo> branchOfficeAdd=null;
int sizeOfBranchOfficeAdd=0;
List<JtbAddListVehicleRegst> listVehicleRegstAdd=null;
int sizeOflistVehicleRegstAdd=0;
List<JtbAddListDriverInfo> listDriverAdd=null;
int sizeOfListDriverAdd=0;
List<JtbAddCraftEmployeeInfo> craftEmp=null;
int sizeOfCraftEmpAdd=0;

DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;

/* FORM DOCS */
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String formNameDoc="";
String formNameDocUrl="";

String publicLaw="";
String publicLawDocUrl="";
String hotelSignApp="";
String hotelSignManager="";
String resortAttached="";
String resortAttachedUrl="";
String resortSignApp="";
String homeSeal="";
String homeSignApp="";
String attarctionDirect="";
String attarctionDirectUrl="";
String attractionSignApp="";
String paymentMethod = "";
String amount="";
String currency="";
String occupyLocation="";
String waterSportOpActivitiesList="";
String craftOccupyLocation="";
String generalOperator="";
String operatorName="";
String licenceNumber="";
String typeOfRole="";
String typeOfPlace="";

String feeRecipetUrl="";
String feeRecipet="";

DLFolder docCarRentStatement = null;
List<DLFileEntry> carRentFileEntry = null;
FileEntry carRentDocFE=null;
String carRentDoc="";

DLFolder docDomesticTourStatement = null;
List<DLFileEntry> domesticTourFileEntry = null;
FileEntry domesticTourDocFE=null;
String domesticTourDoc="";
DLFolder docDomesticServStatement = null;
List<DLFileEntry> domesticServFileEntry = null;
FileEntry domesticServDocFE=null;
String domesticServDoc="";
DLFolder docDomesticSealStatement = null;
List<DLFileEntry> domesticSealFileEntry = null;
FileEntry domesticSealDocFE=null;
String domesticSealDoc="";

DLFolder docAgencyStatement = null;
List<DLFileEntry> agencyFileEntry = null;
FileEntry agencyDocFE=null;
String agencyDoc="";
DLFolder docWaterSportStatement = null;
List<DLFileEntry> waterSportFileEntry = null;
FileEntry waterSportDocFE=null;
String waterSportDoc="";
String waterSportDocUrl="";
String waterSportOwner="";
String waterSportManager="";

DLFolder docWorkPermit = null;
List<DLFileEntry> workPermitFileEntry = null;
FileEntry workPermitDocFE=null;
String workPermitDoc="";
String workPermitDocUrl="";

DLFolder docJusticePeace = null;
List<DLFileEntry> justicePeaceFileEntry = null;
FileEntry justicePeaceDocFE=null;
String justicePeaceDoc="";
String justicePeaceDocUrl="";

DLFolder docWaterStatement=null;
List<DLFileEntry> waterFileEntry = null;
FileEntry waterDocFE=null;
String waterManager="";

DLFolder docCarriageStatement = null;
List<DLFileEntry> carriageFileEntry = null;
FileEntry carriageDocFE=null;
String carriageDoc="";

DLFolder docHaltSignStatement = null;
List<DLFileEntry> haltSignFileEntry = null;
FileEntry haltSignDocFE=null;
String haltSignApp="";

DLFolder docWaterEmpSignStatement = null;
List<DLFileEntry> waterEmpSignFileEntry = null;
FileEntry waterEmpSignDocFE=null;
String waterEmpSign="";

DLFolder docJusticeSealStatement = null;
List<DLFileEntry> justiceSealFileEntry = null;
FileEntry justiceSealDocFE=null;
String justiceSeal="";

DLFolder docCprCopyStatement = null;
List<DLFileEntry> cprCopyFileEntry = null;
FileEntry cprCopyDocFE=null;
String cprCopy="";

DLFolder docBikeSignStatement = null;
List<DLFileEntry> bikeSignFileEntry = null;
FileEntry bikeSignDocFE=null;
String bikeSignApp="";

DLFolder docplaceAddressStatement = null;
List<DLFileEntry> placeAddressFileEntry = null;
FileEntry placeAddressDocFE=null;
String placeAddress="";
String placeAddressUrl="";

DLFolder docplaceSignAppStatement = null;
List<DLFileEntry> placeSignAppFileEntry = null;
FileEntry placeSignAppDocFE=null;
String placeSignApp="";

DLFolder docassistantStatement = null;
List<DLFileEntry> assistantFileEntry = null;
FileEntry assistantDocFE=null;
String craftAssistantSign="";


DLFolder docvendorStatement = null;
List<DLFileEntry> vendorFileEntry = null;
FileEntry vendorDocFE=null;
String craftVendorSign="";

DLFolder docEvidence = null;
List<DLFileEntry> evidenceFileEntry = null;
FileEntry evidenceDocFE=null;
String evidenceSign="";
String evidenceSignUrl="";

DLFolder docRent = null;
List<DLFileEntry> rentFileEntry = null;
FileEntry rentDocFE=null;
String rentSign="";
String rentSignUrl="";

DLFolder docLetterOwner = null;
List<DLFileEntry> letterOwnerFileEntry = null;
FileEntry letterOwnerDocFE=null;
String letterOwnerSign="";
String letterOwnerSignUrl="";

DLFolder docContractLease = null;
List<DLFileEntry> contractLeaseFileEntry = null;
FileEntry contractLeaseDocFE=null;
String contractLeaseSign="";
String contractLeaseSignUrl="";

DLFolder docWaterEvidence = null;
List<DLFileEntry> waterEvidenceFileEntry = null;
FileEntry waterEvidenceDocFE=null;
String waterEvidenceSign="";
String waterEvidenceSignUrl="";

DLFolder docWaterRent = null;
List<DLFileEntry> waterRentFileEntry = null;
FileEntry waterRentDocFE=null;
String waterRentSign="";
String waterRentSignUrl="";

DLFolder docWaterLetterOwner = null;
List<DLFileEntry> waterLetterOwnerFileEntry = null;
FileEntry waterLetterOwnerDocFE=null;
String waterLetterOwnerSign="";
String waterLetterOwnerSignUrl="";

DLFolder docWaterContractLease = null;
List<DLFileEntry> waterContractLeaseFileEntry = null;
FileEntry waterContractLeaseDocFE=null;
String waterContractLeaseSign="";
String waterContractLeaseSignUrl="";

String currentStage = "";
String lastFormStep = "";
String typeOfApplication = null;
String categoryTypeValAccomo = null;
String nonHotelSubCategory = null;
String jtbTransactionTypeVal = null;
String attractionCategoryTypeVal = null;
String domesticToursType = null;
String otherCategories = null;
String applicantNationality=null;
String workPermitApplied=null;
String expiration_date=null;
String issued_date=null;
String result=null;


String fileUrl="";

String friendlyURL = "";
if(themeDisplay.getLayout().getFriendlyURL().contains("/tpdco-accommodation-application-form")){
	friendlyURL = "Accommodation";
}
if(themeDisplay.getLayout().getFriendlyURL().contains("/tpdco-attraction-application-form")){
	friendlyURL = "Attraction";
}

long jtbApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "jtbApplicationId"))){
	jtbApplicationId =ParamUtil.getLong(request, "jtbApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("jtbApplicationId"))){
	jtbApplicationId = Long.valueOf(httpServletRequest.getParameter("jtbApplicationId"));
}

if(Validator.isNotNull(httpServletRequest.getParameter("expiration_date"))){
	expiration_date = String.valueOf(httpServletRequest.getParameter("expiration_date"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("issued_date"))){
	issued_date = String.valueOf(httpServletRequest.getParameter("issued_date"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("result"))){
	result = String.valueOf(httpServletRequest.getParameter("result"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("paymentMethod"))){
	paymentMethod = String.valueOf(httpServletRequest.getParameter("paymentMethod"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("currency"))){
	currency = String.valueOf(httpServletRequest.getParameter("currency"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("amount"))){
	amount = String.valueOf(httpServletRequest.getParameter("amount"));
}
 if(jtbApplicationId>0){
	 try {
			supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
			supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentFolder.getFolderId(), String.valueOf(jtbApplicationId));

		} catch (Exception e) {
		}
		/*Form Docs Accomodation*/
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Hotel Licence Certificate Issued");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				formNameDoc=attachDocFE.getFileName();
				formNameDocUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Hotel Public Health Law");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				publicLaw=attachDocFE.getFileName();
				publicLawDocUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
				
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Hotel Signature Of Applicant");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				hotelSignApp=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Hotel Signature Of Manager");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				hotelSignManager=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Non Hotel Attached List");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				resortAttached=attachDocFE.getFileName();
				resortAttachedUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Resort Signature of Applicant");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				resortSignApp=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Home Stay Signature Of Applicant");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				homeSignApp=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Home Stay Applicant Seal");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				homeSeal=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		}
		/*Form Docs Attraction*/
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Attraction Address of Directors");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				attarctionDirect=attachDocFE.getFileName();
				attarctionDirectUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		//fee recipet
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Fee Reciept");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				feeRecipet=attachDocFE.getFileName();
				feeRecipetUrl=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
		try{
			docAttachedStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Attraction Signature of Applicant");
			attachedFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAttachedStatement.getFolderId());
		} catch (Exception e) {
		}
		if (attachedFileEntry != null) {
			for (DLFileEntry uploadedFile : attachedFileEntry) {
				attachDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				attractionSignApp=DLURLHelperUtil.getDownloadURL(attachDocFE,
						attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		/*Form Docs Attraction-Other Tourism*/
		
		try{
			docCarRentStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Car Rental Signature of Applicant");
			carRentFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docCarRentStatement.getFolderId());
		} catch (Exception e) {
		}
		if (carRentFileEntry != null) {
			for (DLFileEntry uploadedFile : carRentFileEntry) {
				carRentDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				carRentDoc=DLURLHelperUtil.getDownloadURL(carRentDocFE,
						carRentDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docDomesticTourStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Domestic Signature of Applicant");
			domesticTourFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docDomesticTourStatement.getFolderId());
		} catch (Exception e) {
		}
		if (domesticTourFileEntry != null) {
			for (DLFileEntry uploadedFile : domesticTourFileEntry) {
				domesticTourDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				domesticTourDoc=DLURLHelperUtil.getDownloadURL(domesticTourDocFE,
						domesticTourDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docDomesticServStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Domestic Signature Service");
			domesticServFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docDomesticServStatement.getFolderId());
		} catch (Exception e) {
		}
		if (domesticServFileEntry != null) {
			for (DLFileEntry uploadedFile : domesticServFileEntry) {
				domesticServDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				domesticServDoc=DLURLHelperUtil.getDownloadURL(domesticServDocFE,
						domesticServDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docDomesticSealStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Domestic Company Seal");
			domesticSealFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docDomesticSealStatement.getFolderId());
		} catch (Exception e) {
		}
		if (domesticSealFileEntry != null) {
			for (DLFileEntry uploadedFile : domesticSealFileEntry) {
				domesticSealDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				domesticSealDoc=DLURLHelperUtil.getDownloadURL(domesticSealDocFE,
						domesticSealDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docAgencyStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Travel Agency Applicant Sign");
			agencyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docAgencyStatement.getFolderId());
		} catch (Exception e) {
		}
		if (agencyFileEntry != null) {
			for (DLFileEntry uploadedFile : agencyFileEntry) {
				agencyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				agencyDoc=DLURLHelperUtil.getDownloadURL(agencyDocFE,
						agencyDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterSportStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Watersports Employee Doc");
			waterSportFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterSportStatement.getFolderId());
		} catch (Exception e) {
		}
		if (waterSportFileEntry != null) {
			for (DLFileEntry uploadedFile : waterSportFileEntry) {
				waterSportDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterSportDoc=waterSportDocFE.getFileName();
				waterSportDocUrl=DLURLHelperUtil.getDownloadURL(waterSportDocFE,
						waterSportDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWorkPermit = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Jamaica Work Permit");
			workPermitFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWorkPermit.getFolderId());
		} catch (Exception e) {
		}
		if (workPermitFileEntry != null) {
			for (DLFileEntry uploadedFile : workPermitFileEntry) {
				workPermitDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				workPermitDoc=workPermitDocFE.getFileName();
				workPermitDocUrl=DLURLHelperUtil.getDownloadURL(workPermitDocFE,
						workPermitDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docJusticePeace = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Justice Peace Letter");
			justicePeaceFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docJusticePeace.getFolderId());
		} catch (Exception e) {
		}
		if (justicePeaceFileEntry != null) {
			for (DLFileEntry uploadedFile : justicePeaceFileEntry) {
				justicePeaceDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				justicePeaceDoc=justicePeaceDocFE.getFileName();
				justicePeaceDocUrl=DLURLHelperUtil.getDownloadURL(justicePeaceDocFE,
						justicePeaceDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterSportStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Watersports Signature of Owner");
			waterSportFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterSportStatement.getFolderId());
		} catch (Exception e) {
		}
		if (waterSportFileEntry != null) {
			for (DLFileEntry uploadedFile : waterSportFileEntry) {
				waterSportDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterSportOwner=DLURLHelperUtil.getDownloadURL(waterSportDocFE,
						waterSportDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterSportStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Watersports Signature of Manager");
			waterSportFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterSportStatement.getFolderId());
		} catch (Exception e) {
		}
		if (waterSportFileEntry != null) {
			for (DLFileEntry uploadedFile : waterSportFileEntry) {
				waterSportDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterSportManager=DLURLHelperUtil.getDownloadURL(waterSportDocFE,
						waterSportDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 

		try{
			docWaterStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Manager Signature Water");
			waterFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterStatement.getFolderId());
		} catch (Exception e) {
		}
		if (waterFileEntry != null) {
			for (DLFileEntry uploadedFile : waterFileEntry) {
				waterDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterManager=DLURLHelperUtil.getDownloadURL(waterDocFE,
						waterDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
		try{
			docCarriageStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Carriage Signature of Owner Operator");
			carriageFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docCarriageStatement.getFolderId());
		} catch (Exception e) {
		}
		if (carriageFileEntry != null) {
			for (DLFileEntry uploadedFile : carriageFileEntry) {
				carriageDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				carriageDoc=DLURLHelperUtil.getDownloadURL(carriageDocFE,
						carriageDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docHaltSignStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Travel Halt Signature of Applicant");
			haltSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docHaltSignStatement.getFolderId());
		} catch (Exception e) {
		}
		if (haltSignFileEntry != null) {
			for (DLFileEntry uploadedFile : haltSignFileEntry) {
				haltSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				haltSignApp=DLURLHelperUtil.getDownloadURL(haltSignDocFE,
						haltSignDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterEmpSignStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Water Sport Signature of Employee");
			waterEmpSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterEmpSignStatement.getFolderId());
		} catch (Exception e) {
		}
		if (waterEmpSignFileEntry != null) {
			for (DLFileEntry uploadedFile : waterEmpSignFileEntry) {
				waterEmpSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterEmpSign=DLURLHelperUtil.getDownloadURL(waterEmpSignDocFE,
						waterEmpSignDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
		try{
			docJusticeSealStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Superintendent of Police");
			justiceSealFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docJusticeSealStatement.getFolderId());
		} catch (Exception e) {
		}
		if (justiceSealFileEntry != null) {
			for (DLFileEntry uploadedFile : justiceSealFileEntry) {
				justiceSealDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				justiceSeal=DLURLHelperUtil.getDownloadURL(justiceSealDocFE,
						justiceSealDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docCprCopyStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Copy of CPR");
			cprCopyFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docCprCopyStatement.getFolderId());
		} catch (Exception e) {
		}
		if (cprCopyFileEntry != null) {
			for (DLFileEntry uploadedFile : cprCopyFileEntry) {
				cprCopyDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				cprCopy=cprCopyDocFE.getFileName();
			}
		} 
		try{
			docBikeSignStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Bike Rental Signature of Applicant");
			bikeSignFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docBikeSignStatement.getFolderId());
		} catch (Exception e) {
		}
		if (bikeSignFileEntry != null) {
			for (DLFileEntry uploadedFile : bikeSignFileEntry) {
				bikeSignDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				bikeSignApp=DLURLHelperUtil.getDownloadURL(bikeSignDocFE,
						bikeSignDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docplaceAddressStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Place Address of Directors");
			placeAddressFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docplaceAddressStatement.getFolderId());
		} catch (Exception e) {
		}
		if (placeAddressFileEntry != null) {
			for (DLFileEntry uploadedFile : placeAddressFileEntry) {
				placeAddressDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				placeAddress=placeAddressDocFE.getFileName();
				placeAddressUrl=DLURLHelperUtil.getDownloadURL(placeAddressDocFE,
						placeAddressDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docplaceSignAppStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Place Signature of Applicant");
			placeSignAppFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docplaceSignAppStatement.getFolderId());
		} catch (Exception e) {
		}
		if (placeSignAppFileEntry != null) {
			for (DLFileEntry uploadedFile : placeSignAppFileEntry) {
				placeSignAppDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				placeSignApp=DLURLHelperUtil.getDownloadURL(placeSignAppDocFE,
						placeSignAppDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docvendorStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Craft Vendor's Signature");
			vendorFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docvendorStatement.getFolderId());
		} catch (Exception e) {
		}
		if (vendorFileEntry != null) {
			for (DLFileEntry uploadedFile : vendorFileEntry) {
				vendorDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				craftVendorSign=DLURLHelperUtil.getDownloadURL(vendorDocFE,
						vendorDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docassistantStatement = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Craft Vendor's Assistant Signature");
			assistantFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docassistantStatement.getFolderId());
		} catch (Exception e) {
		}
		if (assistantFileEntry != null) {
			for (DLFileEntry uploadedFile : assistantFileEntry) {
				assistantDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				craftAssistantSign=DLURLHelperUtil.getDownloadURL(assistantDocFE,
						assistantDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		/* checkbox docs*/
		try{
			docEvidence = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Evidence of Ownership");
			evidenceFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docEvidence.getFolderId());
		} catch (Exception e) {
		}
		if (evidenceFileEntry != null) {
			for (DLFileEntry uploadedFile : evidenceFileEntry) {
				evidenceDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				evidenceSign=evidenceDocFE.getFileName();
				evidenceSignUrl=DLURLHelperUtil.getDownloadURL(evidenceDocFE,
						evidenceDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docRent = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Rent Receipt");
			rentFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docRent.getFolderId());
		} catch (Exception e) {
		}
		if (rentFileEntry != null) {
			for (DLFileEntry uploadedFile : rentFileEntry) {
				rentDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				rentSign=rentDocFE.getFileName();
				rentSignUrl=DLURLHelperUtil.getDownloadURL(rentDocFE,
						rentDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docLetterOwner = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Letter from Owner");
			letterOwnerFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docLetterOwner.getFolderId());
		} catch (Exception e) {
		}
		if (letterOwnerFileEntry != null) {
			for (DLFileEntry uploadedFile : letterOwnerFileEntry) {
				letterOwnerDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				letterOwnerSign=letterOwnerDocFE.getFileName();
				letterOwnerSignUrl=DLURLHelperUtil.getDownloadURL(letterOwnerDocFE,
						letterOwnerDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
		
		try{
			docContractLease = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Contract of Lease");
			contractLeaseFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docContractLease.getFolderId());
		} catch (Exception e) {
		}
		if (contractLeaseFileEntry != null) {
			for (DLFileEntry uploadedFile : contractLeaseFileEntry) {
				contractLeaseDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				contractLeaseSign=contractLeaseDocFE.getFileName();
				contractLeaseSignUrl=DLURLHelperUtil.getDownloadURL(contractLeaseDocFE,
						contractLeaseDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);	
			}
		} 
		/* checkbox water sport docs*/
		
		try{
			docWaterEvidence = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Water Evidence of Ownership");
			waterEvidenceFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterEvidence.getFolderId());
		} catch (Exception e) {
		}
		if (waterEvidenceFileEntry != null) {
			for (DLFileEntry uploadedFile : waterEvidenceFileEntry) {
				waterEvidenceDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterEvidenceSign=waterEvidenceDocFE.getFileName();
				waterEvidenceSignUrl=DLURLHelperUtil.getDownloadURL(waterEvidenceDocFE,
						waterEvidenceDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterRent = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Water Rent Receipt");
			waterRentFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterRent.getFolderId());
		} catch (Exception e) {
		}
		if (waterRentFileEntry != null) {
			for (DLFileEntry uploadedFile : waterRentFileEntry) {
				waterRentDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterRentSign=waterRentDocFE.getFileName();
				waterRentSignUrl=DLURLHelperUtil.getDownloadURL(waterRentDocFE,
						waterRentDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		try{
			docWaterLetterOwner = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Water Letter from Owner");
			waterLetterOwnerFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterLetterOwner.getFolderId());
		} catch (Exception e) {
		}
		if (waterLetterOwnerFileEntry != null) {
			for (DLFileEntry uploadedFile : waterLetterOwnerFileEntry) {
				waterLetterOwnerDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterLetterOwnerSign=waterLetterOwnerDocFE.getFileName();
				waterLetterOwnerSignUrl=DLURLHelperUtil.getDownloadURL(waterLetterOwnerDocFE,
						waterLetterOwnerDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
		
		try{
			docWaterContractLease = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingSubDocumentFolder.getFolderId(), "Water Contract of Lease");
			waterContractLeaseFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),docWaterContractLease.getFolderId());
		} catch (Exception e) {
		}
		if (waterContractLeaseFileEntry != null) {
			for (DLFileEntry uploadedFile : waterContractLeaseFileEntry) {
				waterContractLeaseDocFE = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
				waterContractLeaseSign=waterContractLeaseDocFE.getFileName();
				waterContractLeaseSignUrl=DLURLHelperUtil.getDownloadURL(waterContractLeaseDocFE,
						waterContractLeaseDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			}
		} 
		
	
	try {
		jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		licenceNumber=jtbApplication.getExpiredLicenseAppNumber();
	} catch (Exception e) {}
	
	try{
		accoHotelLic=AccoHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try{
		accoHotelGenDec=AccoGenDeclarationLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try{
		accoNonHotelLic= AccoNonHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try{
		reqLicence= AccoNonHotelRequiredLicLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try{
		accoNonHotelGenDec= AccoNonHotelGenDecLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try{
		accoHomeStay= AccoHomeStayLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		operatorName=accoHomeStay.getHomeOwnerName();
	}catch(Exception e){}
	try{
		attractApplicant= AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e){}
	try {
		attractiongenDec=AttractionGenDeclareInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	}catch(Exception e) {}
	try {
		carRentalLicence=AttractionCarRentalLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		carRentalLicCond=AttractionCarRentConditionLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		domesticTour=AttractionDomesticTourLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {
	}
	try {
		domesticService=AttractionDomesticServiceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {
	}
	try {
		travelAgency=AttractionTravelAgencyLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {
	}
	try {
		waterSport=AttractionWaterSportLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		occupyLocation=waterSport.getOccupyLocation();
		waterSportOpActivitiesList=waterSport.getWaterSportOpActivityList();
	} catch (Exception e) {
	}
	try {
		waterGeneralDec=AttractionWaterGenDeclareLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {
	}
	try {
		waterRequirement=AttractionWaterRequiredLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		contractCarriage=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		travelHalt=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		waterEmpLic=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		applicantNationality=waterEmpLic.getApplicantNationality();
		workPermitApplied=waterEmpLic.getWorkPermitApplied();
	} catch (Exception e) {
	}
	try {
		bikeRental=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	} catch (Exception e) {}
	try {
		placeOfInterest= AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
	    typeOfPlace=placeOfInterest.getPlaceOfInterest();
	    typeOfRole=placeOfInterest.getTypeOfRole();
		
	} catch (Exception e) {}
	try {
		craftTrader= AttractionCraftTraderLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		craftOccupyLocation=craftTrader.getOccupyLocation();
	} catch (Exception e) {}
	
	
	if (Validator.isNotNull(jtbApplication)) {
		if (Validator.isNotNull(jtbApplication.getTypeOfApplication())) {
			typeOfApplication = jtbApplication.getTypeOfApplication();
		}
		if (Validator.isNotNull(jtbApplication.getCategoryTypeValAccomo())) {
			categoryTypeValAccomo = jtbApplication.getCategoryTypeValAccomo();
		}
		if (Validator.isNotNull(jtbApplication.getNonHotelSubCategory())) {
			nonHotelSubCategory = jtbApplication.getNonHotelSubCategory();
		}
		if (Validator.isNotNull(jtbApplication.getJtbTransactionTypeVal())) {
			jtbTransactionTypeVal = jtbApplication.getJtbTransactionTypeVal();
		}
		if (Validator.isNotNull(jtbApplication.getAttractionCategoryTypeVal())) {
			attractionCategoryTypeVal = jtbApplication.getAttractionCategoryTypeVal();
		}
		if (Validator.isNotNull(jtbApplication.getDomesticToursType())) {
			domesticToursType = jtbApplication.getDomesticToursType();
		}
		if (Validator.isNotNull(jtbApplication.getOtherCategories())) {
			otherCategories = jtbApplication.getOtherCategories();
		}
	} 
	 try {
		jtbCurrentStage = JTBCurrentStageLocalServiceUtil.getByJTB_Stage(jtbApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(jtbCurrentStage)
			&& Validator.isNotNull(jtbCurrentStage.getCurrentStage())) {
		currentStage = jtbCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(jtbCurrentStage)
			&& Validator.isNotNull(jtbCurrentStage.getLastFormStep())) {
		lastFormStep = jtbCurrentStage.getLastFormStep();
	} 
	try {
		attarctionManagerAdd = JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		sizeOfAttractionAdd=attarctionManagerAdd.size();
	} catch (Exception e) {
	}
	try {
		branchOfficeAdd = JtbAddBranchDetailInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		sizeOfBranchOfficeAdd=branchOfficeAdd.size();
	} catch (Exception e) {
	}
	try {
		listVehicleRegstAdd = JtbAddListVehicleRegstLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		sizeOflistVehicleRegstAdd=listVehicleRegstAdd.size();
	} catch (Exception e) {
	}
	try {
		listDriverAdd = JtbAddListDriverInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		sizeOfListDriverAdd=listDriverAdd.size();
	} catch (Exception e) {
	}
	try {
		craftEmp = JtbAddCraftEmployeeInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		sizeOfCraftEmpAdd=craftEmp.size();
	} catch (Exception e) {
	}
	try {
		jtbPayment = JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		paymentMethod=jtbPayment.getPaymentMethod();
		amount=jtbPayment.getAmountPaid();
		currency=jtbPayment.getAmountCurrency();
	} catch (Exception e) {
	}
}
%>
<script>
function uploadDocuments(fileID,folderName,fileTitle){
	jtbApplicationId=$("#jtbApplicationId").val();
    $.ajaxFileUpload({
	        secureuri: false,
	        method: "POST",
	        fileElementId: fileID,
	        url: "${uploadMultipleDocumentsUrl}",
	        dataType: 'text',
	        data: {
	            "<portlet:namespace/>fileID": fileID,
	            "<portlet:namespace/>command": "fileUpload",
	            "<portlet:namespace/>folderName": folderName,
	            "<portlet:namespace/>jtbApplicationId": jtbApplicationId,
           },
       	async: false,
        success: function (data, status) {
               try {
                   var parsedData = JSON.parse(data);
                   if (parsedData.fileData && parsedData.fileData.length > 0) {
                       var fileInfo = parsedData.fileData[0]; // Get the first file object
                       $("." + fileID).html(fileTitle);
                       $("#" + fileID + "-preview").html(fileInfo.fileName);
                       $("#" + fileID + "-preview").attr("href", fileInfo.downloadFileUrl);
                   } else {
                       console.error("No file data received from the server.");
                   }
               } catch (error) {
                   console.error("Error parsing response JSON:", error);
               }
           },
           error: function (data, status, e) {
               console.error("File upload failed:", e);
           }
       });
   }
</script>
