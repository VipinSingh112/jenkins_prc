<%@page import="com.nbp.ncbj.application.form.service.service.NCBJCompanyNewLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NCBJCompanyNew"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjSpecificActivitiesLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjNumOfEmpAddLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjProductServiceDetailLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjSectionFour"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjSectionThree"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjSectionTwoLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjSectionTwo"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjPremisesLocationLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailGenLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjAddLocMultiSiteLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjCurrentStage"%>
<%@page import="com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil"%>
<%@page import="com.nbp.ncbj.application.form.service.model.NcbjApplication"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<portlet:resourceURL var="numOfEffectedPersonalInfoUrl" id="add/numOf/effective/personal/info"/>
<portlet:resourceURL var="certificationPreferredDateInfoUrl" id="add/certification/preferred/date/info"/>
<portlet:resourceURL var="orgInformationUrl" id="add/org/detail/info"/>
<portlet:resourceURL var="companyAddMoreDetailInfoUrl" id="add/more/company/detail/info"/>
<portlet:resourceURL var="sectiononeAddMoreCompDetailInfoUrl" id="add/section/one/company/info" />
<portlet:resourceURL var="productsAndServicesInfoUrl" id="add/products/services/info" />
<portlet:resourceURL var="uploadDocInNcbjFormUrl" id="/upload/document/ncbj"/>
<portlet:resourceURL var="businessDetailInfoUrl" id="add/business/detail/info"/>
<portlet:resourceURL var="delteinformation" id="delete/information"/>
<portlet:resourceURL var="deleteProductINfoUrl" id="delete/product"/>
<portlet:resourceURL var="deleteNumberOfEmployeeUrl" id="delete/Employee"/>
<portlet:resourceURL var="deleteWorkPatternUrl" id="delete/WorkPattern"/>
<portlet:resourceURL var="deleteHaccpNumberUrl" id="delete/HaccpNumber"/>
<%
String currentStage = "";
String lastFormStep = "";
String typeOfCertification="";
String typeOfTransaction="";
String isoFirstCertificate="";
String isoSecondCertificate="";
String numberOfSite="";
String typeOfService="";
String subCategoryService="";
String result="";
int counterOfDocuments = 1;
long ncbjApplicationId =0;
HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if(Validator.isNotNull(ParamUtil.getLong(request, "ncbjApplicationId"))){
	ncbjApplicationId =ParamUtil.getLong(request, "ncbjApplicationId");
}
else if(Validator.isNotNull(httpServletRequest.getParameter("ncbjApplicationId"))){
	ncbjApplicationId = Long.valueOf(httpServletRequest.getParameter("ncbjApplicationId"));
}
if(Validator.isNotNull(httpServletRequest.getParameter("result"))){
	result = String.valueOf(httpServletRequest.getParameter("result"));
}
NcbjApplication ncbjApplication=null;
NcbjCurrentStage ncbjCurrentStage=null;
NcbjApplicantDetail preferredDate=null;
NcbjOrgDetailInfo orgDetailInfo=null;
NcbjAddLocMultiSite ncbjAdditionalLocation=null;
NcbjOrganizationDetail ncbjOrganizationDetail=null;
NCBJCompanyNew newCompany=null;
NcbjCompanyDetailGen companyDetail=null;
List<NcbjCompanyDetailGen> companyDetailAdd=null;
int sizeOfcompDetailAdd=0;
NcbjPremisesLocation premisesLocation=null;
NcbjSectionTwo processDetails=null;
NcbjSectionThree sectionThree=null;
NcbjSectionFour consultService=null;
NcbjOrganizationDetail quotationFormTwo=null;
List<NcbjCompanyDetailGen> companyDetailTwo=null;
int sizeOfCompTwo=0;
List<NcbjProductServiceDetail> productDetail=null;
int sizeOfProdService=0;
List<NcbjNumOfEmpAdd> numOfEmp = null;
int sizeOfNumOfEmp=0;
List<NcbjSectionDetailAdd> workPattern = null;
int sizeOfWorkPattern=0;
List<NcbjSectionDetailAdd> haccpNum = null;
int sizeOfHaccpNum=0;
List<NcbjSectionDetailAdd> hazardAnalysis = null;
int sizeOfHazard=0;
List<NcbjSectionDetailAdd> consentList = null;
int sizeOfConsentList=0;
List<NcbjBusinessDetailAdd> businessDetail=null;
int sizeOfBusinessDetail=0;
List<NcbjSpecificActivities> specificActivities = null;
int sizeOfSpecificActivities=0;
List<NcbjBusinessDetail> quotationBusinessDetail=null;
int sizeOfQuotationBusiness=0;
DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
if(ncbjApplicationId>0){
   try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCBJ Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(ncbjApplicationId));
	} catch (Exception e) {} 	
	try {
		ncbjApplication =NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		preferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		orgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		ncbjAdditionalLocation= NcbjAddLocMultiSiteLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		companyDetail= NcbjCompanyDetailGenLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		companyDetailAdd = NcbjCompanyDetailGenLocalServiceUtil.getNCBJListByAppId(ncbjApplicationId);
		sizeOfcompDetailAdd=companyDetailAdd.size();
	} catch (Exception e) {}
	try {
		premisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		processDetails= NcbjSectionTwoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		sectionThree= NcbjSectionThreeLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		consultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		quotationFormTwo= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		companyDetailTwo= NcbjCompanyDetailGenLocalServiceUtil.getNCBJListByAppId(ncbjApplicationId);
		sizeOfCompTwo=companyDetailTwo.size();
	} catch (Exception e) {}
	try {
		productDetail= NcbjProductServiceDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		sizeOfProdService=productDetail.size();
	} catch (Exception e) {}
	try {
		numOfEmp= NcbjNumOfEmpAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfNumOfEmp=numOfEmp.size();
	} catch (Exception e) {}
	try {
		workPattern= NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfWorkPattern=workPattern.size();
	} catch (Exception e) {}
	try {
		haccpNum= NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfHaccpNum=haccpNum.size();
	} catch (Exception e) {}
	try {
		hazardAnalysis= NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfHazard=hazardAnalysis.size();
	} catch (Exception e) {}
	try {
		consentList= NcbjSectionDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfConsentList=consentList.size();
	} catch (Exception e) {}
	try {
		businessDetail= NcbjBusinessDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
		sizeOfBusinessDetail=businessDetail.size();
	}catch (Exception e) {}
	try {
		specificActivities= NcbjSpecificActivitiesLocalServiceUtil.getNcbjById(ncbjApplicationId);
	} catch (Exception e) {}
	try {
		quotationBusinessDetail= NcbjBusinessDetailLocalServiceUtil.getByNcbjBusiDetail(ncbjApplicationId);
		sizeOfQuotationBusiness=quotationBusinessDetail.size();
	}catch (Exception e) {}
	try {
		newCompany= NCBJCompanyNewLocalServiceUtil.getNCBJById(ncbjApplicationId);
	} catch (Exception e) {}
	if(specificActivities!=null){
		sizeOfSpecificActivities=specificActivities.size();
	}
	if (Validator.isNotNull(ncbjApplication)) {
		if (Validator.isNotNull(ncbjApplication.getTypeOfCertification())) {
			typeOfCertification = ncbjApplication.getTypeOfCertification();
		}
		if (Validator.isNotNull(ncbjApplication.getTypeOfTransaction())) {
			typeOfTransaction = ncbjApplication.getTypeOfTransaction();
		}
		if (Validator.isNotNull(ncbjApplication.getIso9001CertificationValue())) {
			isoFirstCertificate = ncbjApplication.getIso9001CertificationValue();
		}
		if (Validator.isNotNull(ncbjApplication.getIso22000CertificationValue())) {
			isoSecondCertificate = ncbjApplication.getIso22000CertificationValue();
		}
		if (Validator.isNotNull(ncbjApplication.getNumberOfSite())) {
			numberOfSite = ncbjApplication.getNumberOfSite();
		}
		if (Validator.isNotNull(ncbjApplication.getTypeOfServices())) {
			typeOfService = ncbjApplication.getTypeOfServices();
		}
		if (Validator.isNotNull(ncbjApplication.getSubCategoryServices())) {
			subCategoryService = ncbjApplication.getSubCategoryServices();
		}
	}
	try {
		ncbjCurrentStage = NcbjCurrentStageLocalServiceUtil.getByNcbj_Stage(ncbjApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(ncbjCurrentStage)
			&& Validator.isNotNull(ncbjCurrentStage.getCurrentStage())) {
		currentStage = ncbjCurrentStage.getCurrentStage();
	}
	if (Validator.isNotNull(ncbjCurrentStage)
			&& Validator.isNotNull(ncbjCurrentStage.getLastFormStep())) {
		lastFormStep = ncbjCurrentStage.getLastFormStep();
	} 
}
%>
<script>
function uploadDocuments(fileID, folderName, url, fileTitle) {
	ncbjApplicationId = $("#ncbjApplicationId").val();
		$.ajaxFileUpload({
			secureuri : false,
			method : "POST",
			fileElementId : fileID,
			url : "${uploadDocInNcbjFormUrl}",
			dataType : 'text',
			data : {
				"<portlet:namespace/>fileID" : fileID,
				"<portlet:namespace/>command" : "fileUpload",
				"<portlet:namespace/>folderName" : folderName,
				"<portlet:namespace/>ncbjApplicationId" : ncbjApplicationId,
			},
			async : false,
			success : function(data, status) {
				var parsedData = JSON.parse(data);
	         	$.each(parsedData,function(key,entry){
					var decodedUrl = entry.downloadFileUrl.replace(/&amp;/g, '&');
					$("."+fileID).html(fileTitle);
					$("#"+fileID+"-preview").html(entry.fileName);
					$("#"+fileID+"-preview").attr("href", decodedUrl);
				});
			},
			error : function(data, status, e) {}
		});
}
</script>