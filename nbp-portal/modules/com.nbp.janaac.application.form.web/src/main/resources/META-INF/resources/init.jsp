<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalService"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacApplicationPayment"%>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddOutsourcedActivitiesLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddOutsourcedActivities"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestStructuralLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestStructural"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestDescriptionLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestDescription"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLaboratoryPartOfOrgLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyMngReqTwoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestManageReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabManagementReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestManageReq"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabManagementReq"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaPersonnelSecondLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaPersonnelThirdLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaPersonnelFourLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaPersonnelFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaScopeClientLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddFdaAppliInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaPersonnelFour"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaPersonnelFirst"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaScopeClient"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddFdaAppliInfo"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddPhyResourceSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddPhyResourceFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddInsOrgInfoThirdLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddInsOrgInfoSecondLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddInsOrgInfoFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddInsApplicationInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccInsBodiesManageSysLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccInsBodiesPhyResourceLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccInsBodiesOrganizationLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddInsApplicationInfo"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddPhyResourceSec"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddPhyResourceFirst"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerPersonnelThirdLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerPersonnelThird"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerPersonnelSecondLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerPersonnelFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerScopeServiceThirdLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerScopeServiceThird"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerScopeServiceLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerScopeService"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyInfo"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyPersonnelLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyProdScopeLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyProdScope"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyGeneralLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyGeneral"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabCalibraStrucReqSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabCalibraStrucReqSec"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddCerApplicationInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddCerApplicationInfo"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabResourceReqSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabResourceReqSec"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabResourceReqFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabResourceReqFirst"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalService"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabTestStructuralReqSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabTestStructuralReqSec"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabStructuralRequirementLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabStructuralRequirement"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabOtherReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabPhysicalResourceLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabOrganizationLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabActivitiesDescLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabOtherReq"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabOrganization"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabActivitiesDesc"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabMedicalPhysicalFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabMedicalOrganSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabDescOfActivityLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabMedicalOrganFirstLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabMedicalDescOfActiSecLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabMedicalOrganSec"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabMedicalDescOfActiSec"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabDescOfActivity"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLaboratoryPartOfOrg" %>
<%@page import="com.nbp.janaac.application.form.service.service.AddLabAppliInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AddLabAppliInfo"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo" %>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacAppliCurrentStageLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage"%>
<%@page import="com.nbp.janaac.application.form.service.model.JanaacApplication"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<portlet:resourceURL var="pendingJanaacApplicationUrl" id="/pending/janaac/application"></portlet:resourceURL>
<portlet:resourceURL var="addMedicalLabApplicationInfo" id="/acc/medical/application/info"></portlet:resourceURL>
<portlet:resourceURL var="addMedicalLabDescriptionOfActivity" id="/acc/medical/activity/description"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabOrganizationInfo" id="/acc/medical/organization/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabPhysicalResource" id="/acc/medical/physical/resource/info"></portlet:resourceURL>
<portlet:resourceURL var="addJanaacUploadDocumentUrl" id="/add/janaac/upload/document/url"></portlet:resourceURL>
<portlet:resourceURL var="deletedocumentUrl" id="/delete/document/url"></portlet:resourceURL>
<portlet:resourceURL var="janaacDeleteDocumentUrl" id="/delete/document/url"></portlet:resourceURL>
<portlet:resourceURL var="submitJanaacApplicationUrl" id="/submit/Janaac/Application/Url"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabManagementSysReq" id="/acc/medical/management/req/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabOtherReq" id="/acc/medical/other/req/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabTestingActivityDesc" id="/acc/medical/test/description"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabTestStructuralReq" id="/acc/medical/test/structural/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabTestResourceReq" id="/acc/medical/test/resource/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccMediLabTestManagementSysReq" id="/acc/medical/test/management/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccInsBodiesOrganization" id="/acc/inspection/bodies/org/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccInsBodiesPhysicalResource" id="/acc/ins/bodies/physical/resource"></portlet:resourceURL>
<portlet:resourceURL var="addAccInsBodiesManagementSysReq" id="/acc/ins/bodies/manage/sys/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccInsBodiesOtherReq" id="/acc/ins/bodies/other/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesApplicationInfo" id="/acc/cer/bodies/appli/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesGeneral" id="/acc/cer/bodies/general"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesScopeService" id="/acc/cer/bodies/scope/service"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodyPersonnelResource" id="/acc/cer/bodies/personnel/resource"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodyInformation" id="/acc/cer/bodies/information"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesManagementSysReq" id="/acc/cer/bodies/manage/sys/req"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesProductScopeService" id="/acc/cer/bodies/product/scope/service"></portlet:resourceURL>
<portlet:resourceURL var="addAccCerBodiesManagementSystemReq" id="/acc/certi/bodies/manage/sys/req/two"></portlet:resourceURL>
<portlet:resourceURL var="addAccThirdPartyAppliInfo" id="/acc/third/party/appli/info"></portlet:resourceURL>
<portlet:resourceURL var="addAccFDAThirdPartyScopeService" id="/acc/third/party/scope/service"></portlet:resourceURL>
<portlet:resourceURL var="uloadFormDocumentUrl" id="/upload/form/document/"></portlet:resourceURL>
<portlet:resourceURL var="uploadJanaacGenericSupportingDocUrl" id="/upload/form/document/"></portlet:resourceURL>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
 <%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestResourceReqLocalServiceUtil"%>
 <%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
 <%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq"%>
 <%@page import="com.nbp.janaac.application.form.service.model.AccMediLabTestStructural"%>
 <%@page import="com.nbp.janaac.application.form.service.service.AccMediLabTestStructuralLocalServiceUtil"%>
 <%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
 <%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyManageReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyManageReq"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyScopeLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyScope"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyApplicantInfoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyApplicantInfoLocalService"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyApplicantInfo"%>
<%
int counterOfDocuments = 1;
JanaacApplication janaacApplicationData = null;
JanaacAppliCurrentStage janaaccurrentStageData = null;
long janaacApplicationId = 0;
String accreditationType = null;
String accreditationServicesType = null;
String typeOfTransaction = null;
String currentStage = "";
String lastFormStep = "";
AccMediLabApplicationInfo labMedicalAppliInfo=  null;
AccMediLabActivitiesDesc medicalDecOfActiInfo=null;
AccMediLabOrganization medicalOrganizationInfo=null;
AccMediLabPhysicalResource medicalPhyResource=null;
AccMediLabOtherReq medicalOtherReq=null;
List<AddLabAppliInfo> labMedicalAdd = null;
List<AddLabDescOfActivity> labMedicalDecOfActiAdd = null;
List<AddLabMedicalDescOfActiSec> labMedicalDecOfActiSecAdd = null;
List<AddLabMedicalOrganFirst> labMedicalOrganFirstAdd = null;
List<AddLabMedicalOrganSec> labMedicalOrganSecAdd = null;
List<AddLabMedicalPhysicalFirst> labMedicalPhysicalFirstAdd = null;
List<AddLabMedicalPhysicalSec> labMedicalPhysicalSecAdd = null;
List<AddLabStructuralRequirement> labTestStructuralAdd = null;
List<AddLabTestStructuralReqSec> labTestStructuralSecAdd=null;
List<AddLabResourceReqFirst> labTestResourceFirstAdd=null;
List<AddLabResourceReqSec> labTestResourceSecAdd=null;
List<AddLabCalibraStrucReqSec> labCalStrucReqSecInfo=null;
AccCerBodyGeneral cerBodyGenInfo=null;
AccCerBodyProdScope cerBodyProdInfo=null;
AccCerBodyPersonnel cerBodyPersonnel=null;
AccCerBodyInfo cerBobyInformation=null;
List<AddCerApplicationInfo> cerApplicaionInfo=null;
List<AddCerScopeService> cerAddScopeService=null;
List<AddCerScopeServiceThird> cerThirdAddScopeService=null;
List<AddCerPersonnelFirst> cerPersonnelFirst=null;
List<AddCerPersonnelSecond> cerPersonnelSec=null;
List<AddCerPersonnelThird> cerPersonnelThird=null;
AccInsBodiesOtherReq cerOtherRequ=null;
AccInsBodiesOrganization insBodiesOrganization =null;
AccInsBodiesPhyResource insBodiesPhyResource=null;
AccInsBodiesManageSys bodiesManageSys=null;
AccInsBodiesOtherReq insBodiesOtherReq=null;
List<AddInsOrgInfoFirst> organFirst = null;
List<AddInsOrgInfoSecond> orgInfoSec = null;
List<AddInsOrgInfoThird> orgInfoThird = null;
List<AddPhyResourceFirst> phyResourceFirst = null;
List<AddPhyResourceSec> phyResourceSecond = null;
List<AddInsApplicationInfo> inspApplicationInfo = null;
List<AddFdaAppliInfo>  fdaAppliInfo=null;
List<AddFdaScopeClient>  fdaScopeClientInfo=null;
List<AddFdaPersonnelFirst>  fdaPersonnelFirstInfo=null;
List<AddFdaPersonnelSecond>  fdaPersonnelSecInfo=null;
List<AddFdaPersonnelThird>  fdaPersonnelThirdInfo=null;
List<AddFdaPersonnelFour>  fdaPersonnelFourInfo=null;
AccMediLabManagementReq mediLabManagementReq=null;
AccMediLabTestManageReq MediLabTestManageReq=null;
AccCerBodyMngReqTwo accCerBodyMngReqTwo=null;
List<AddLaboratoryPartOfOrg> laboratoryPartOfOrg=null; 
AccMediLabTestDescription labMedicalTestDesc=null;
AccMediLabTestStructural mediLabTestStructural=null;
AccMediLabTestResourceReq mediLabTestResourceReq=null;
List<AddOutsourcedActivities> outsourcedActivities=null;
JanaacApplicationPayment appPayment=null;
int sizeOfLabMedicalAdd = 0;
int sizeOfLabMedicalDecOfActiAdd = 0;
int sizeOfLabMedicalDecOfActiSecAdd = 0;
int sizeOfLabMedicalOrganFirstAdd = 0;
int sizeOfLabMedicalOrganSecAdd = 0;
int sizeOfLabMedicalPhysicalFirstAdd = 0;
int sizeOfLabMedicalPhysicalSecAdd = 0;
int sizeOfTestStructAdd = 0;
int sizeOfLabTestStructuralSecAdd = 0;
int sizeOfLabTestResourceFisrtAdd = 0;
int sizeOfLabTestResourceSecAdd = 0;
int sizeOfCerApplicationInfo = 0;
int sizeOfCerStruReqSec = 0;
int sizeOfCerApplicaionInfo = 0;
int sizeOfCerAddScopeService = 0;
int sizeOfCerThirdAddScopeService = 0;
int sizeOfCerPersonnelFirst = 0;
int sizeOfCerPersonnelSec = 0;
int sizeOfCerPersonnelThird = 0;
int sizeOfinspApplicationInfoAdd=0;
int sizeOforganFirstAdd=0;
int sizeOforgInfoSecAdd=0;
int sizeOforgInfoThirdAdd=0;
int sizeOfphyResourceFirstAdd=0;
int sizeOfphyResourceSecondAdd=0;
int sizeOfFdaAppliInfoAdd=0;
int sizeOfFdaScopeClientInfoAdd=0;
int sizeOfFdaPersonnelFirstInfoAdd=0;
int sizeOfFdaPersonnelSecInfoAdd=0;
int sizeOfFdaPersonnelThirdInfoAdd=0;
int sizeOfFdaPersonnelFourInfoAdd=0;
int sizeOflaboratoryPartOfOrgAdd=0;
int sizeOfOutSourcedActivitiesAdd=0;
DLFolder supportingDocumentFolder = null;
DLFolder supportingSubDocumentFolder = null;
DLFolder docAttachedStatement = null;
List<DLFileEntry> attachedFileEntry = null;
FileEntry attachDocFE=null;
String feeRecipet="";
String feeRecipetUrl="";
String paymentMethod="";
String amount="";
String currency="";

HttpServletRequest httpServletRequest = PortalUtil.getOriginalServletRequest(request);
if (Validator.isNotNull(httpServletRequest.getParameter("janaacApplicationId"))) {
	janaacApplicationId = Long.valueOf(httpServletRequest.getParameter("janaacApplicationId"));
}
if (janaacApplicationId > 0) {
	try {
		supportingDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
		supportingSubDocumentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentFolder.getFolderId(), String.valueOf(janaacApplicationId));
	} catch (Exception e) {
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
	try {
		janaacApplicationData = JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(janaacApplicationData)) {
		if (Validator.isNotNull(janaacApplicationData.getAccreditationType())) {
			accreditationType = janaacApplicationData.getAccreditationType();
		}
		if (Validator.isNotNull(janaacApplicationData.getAccServiceType())) {
			accreditationServicesType =janaacApplicationData.getAccServiceType();
		}
		if (Validator.isNotNull(janaacApplicationData.getTransactionType())) {
			typeOfTransaction =janaacApplicationData.getTransactionType();
		}
	}
	try {
		janaaccurrentStageData = JanaacAppliCurrentStageLocalServiceUtil.getJanaac_Stage_JAI(janaacApplicationId);
	} catch (Exception e) {
	}
	if (Validator.isNotNull(janaaccurrentStageData) && Validator.isNotNull(janaaccurrentStageData.getCurrentStage())) {
		currentStage = janaaccurrentStageData.getCurrentStage();
	}
	if (Validator.isNotNull(janaaccurrentStageData) && Validator.isNotNull(janaaccurrentStageData.getLastFormStep())) {
		lastFormStep = janaaccurrentStageData.getLastFormStep();
	}
	
	try{
		labMedicalAppliInfo=AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);
	}catch(Exception e){
	}
	try{
		medicalDecOfActiInfo=AccMediLabActivitiesDescLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	} 
	try{
		medicalOrganizationInfo=AccMediLabOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	} 
	try{
		medicalPhyResource=AccMediLabPhysicalResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	} 
	try{
		medicalOtherReq=AccMediLabOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	} 
	
	try {
		labMedicalAdd = AddLabAppliInfoLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalAdd = labMedicalAdd.size();
	} catch (Exception e) {
	}
	try {
		labMedicalDecOfActiAdd = AddLabDescOfActivityLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalDecOfActiAdd = labMedicalDecOfActiAdd.size();
	} catch (Exception e) {
	}
	
	try {
		labMedicalDecOfActiSecAdd = AddLabMedicalDescOfActiSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalDecOfActiSecAdd = labMedicalDecOfActiSecAdd.size();
	} catch (Exception e) {
	}
	try {
		labMedicalOrganFirstAdd = AddLabMedicalOrganFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalOrganFirstAdd = labMedicalOrganFirstAdd.size();
	} catch (Exception e) {
	}
	try {
		labMedicalOrganSecAdd = AddLabMedicalOrganSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalOrganSecAdd = labMedicalOrganSecAdd.size();
	} catch (Exception e) {
	}
	try {
		labMedicalPhysicalFirstAdd = AddLabMedicalPhysicalFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalPhysicalFirstAdd = labMedicalPhysicalFirstAdd.size();
	} catch (Exception e) {
	}
	
	try {
		labMedicalPhysicalSecAdd = AddLabMedicalPhysicalSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabMedicalPhysicalSecAdd = labMedicalPhysicalSecAdd.size();
	} catch (Exception e) {
	}
	try {
		labTestStructuralAdd = AddLabStructuralRequirementLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfTestStructAdd = labTestStructuralAdd.size();
	} catch (Exception e) {
	}
	try {
		labTestStructuralSecAdd = AddLabTestStructuralReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabTestStructuralSecAdd = labTestStructuralSecAdd.size();
	} catch (Exception e) {
	}
	try {
		labTestResourceFirstAdd = AddLabResourceReqFirstLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabTestResourceFisrtAdd = labTestResourceFirstAdd.size();
	} catch (Exception e) {
	}
	try {
		labTestResourceSecAdd = AddLabResourceReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfLabTestResourceSecAdd = labTestResourceSecAdd.size();
	} catch (Exception e) {
	}
	try {
		labCalStrucReqSecInfo = AddLabCalibraStrucReqSecLocalServiceUtil.getJanaacById(janaacApplicationId);
		sizeOfCerStruReqSec = labCalStrucReqSecInfo.size();
	} catch (Exception e) {
	}
	try {
		cerBodyGenInfo = AccCerBodyGeneralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	} catch (Exception e) {
	}
	try {
		cerBodyProdInfo = AccCerBodyProdScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	} catch (Exception e) {
	}
	try {
		cerBodyPersonnel = AccCerBodyPersonnelLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	} catch (Exception e) {
	}
	try {
		cerBobyInformation = AccCerBodyInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch (Exception e) {
	}
	try {
		cerApplicaionInfo = AddCerApplicationInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerApplicaionInfo = cerApplicaionInfo.size();
	} catch (Exception e) {
	}
	try {
		cerAddScopeService = AddCerScopeServiceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerAddScopeService = cerAddScopeService.size();
	} catch (Exception e) {
	}
	try {
		cerThirdAddScopeService = AddCerScopeServiceThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerThirdAddScopeService = cerThirdAddScopeService.size();
	} catch (Exception e) {
	}
	try {
		cerPersonnelFirst = AddCerPersonnelFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerPersonnelFirst = cerPersonnelFirst.size();
	} catch (Exception e) {
	}
	try {
		cerPersonnelSec = AddCerPersonnelSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerPersonnelSec = cerPersonnelSec.size();
	} catch (Exception e) {
	}
	try {
		cerPersonnelThird = AddCerPersonnelThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfCerPersonnelThird = cerPersonnelThird.size();
	} catch (Exception e) {
	}
	try {
		cerOtherRequ = AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	} catch (Exception e) {
	}
	
	try{
		insBodiesOrganization=AccInsBodiesOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
	try{
		insBodiesPhyResource=AccInsBodiesPhyResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
	try{
		bodiesManageSys=AccInsBodiesManageSysLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
	try{
		insBodiesOtherReq=AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
	try {
		inspApplicationInfo = AddInsApplicationInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfinspApplicationInfoAdd = inspApplicationInfo.size();
	} catch (Exception e) {
	}
	try {
		organFirst =AddInsOrgInfoFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOforganFirstAdd = organFirst.size();
	} catch (Exception e) {
	}
	
	try {
		orgInfoSec = AddInsOrgInfoSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOforgInfoSecAdd = orgInfoSec.size();
	} catch (Exception e) {
	}
	
	try {
		orgInfoThird =AddInsOrgInfoThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOforgInfoThirdAdd = orgInfoThird.size();
	} catch (Exception e) {
	}
	try {
		phyResourceFirst =AddPhyResourceFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfphyResourceFirstAdd = phyResourceFirst.size();
	} catch (Exception e) {
	}
	try {
		phyResourceSecond =AddPhyResourceSecLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfphyResourceSecondAdd = phyResourceSecond.size();
	} catch (Exception e) {
	}
	/*Last category */
	try {
		fdaAppliInfo =AddFdaAppliInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaAppliInfoAdd = fdaAppliInfo.size();
	} catch (Exception e) {
	}
	
	try {
		fdaScopeClientInfo =AddFdaScopeClientLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaScopeClientInfoAdd = fdaScopeClientInfo.size();
	} catch (Exception e) {
	}
	
	try {
		fdaPersonnelFirstInfo =AddFdaPersonnelFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaPersonnelFirstInfoAdd = fdaPersonnelFirstInfo.size();
	} catch (Exception e) {
	}
	
	try {
		fdaPersonnelSecInfo =AddFdaPersonnelSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaPersonnelSecInfoAdd = fdaPersonnelSecInfo.size();
	} catch (Exception e) {
	}
	
	try {
		fdaPersonnelThirdInfo =AddFdaPersonnelThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaPersonnelThirdInfoAdd = fdaPersonnelThirdInfo.size();
	} catch (Exception e) {
	}
	
	try {
		fdaPersonnelFourInfo =AddFdaPersonnelFourLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		sizeOfFdaPersonnelFourInfoAdd = fdaPersonnelFourInfo.size();
	} catch (Exception e) {
	}
	try {
		mediLabManagementReq = AccMediLabManagementReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch (Exception e) {
	}
	try {
		MediLabTestManageReq = AccMediLabTestManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch (Exception e) {
	}
	
	try {
		accCerBodyMngReqTwo = AccCerBodyMngReqTwoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch (Exception e) {
	}
	try{
		appPayment=JanaacApplicationPaymentLocalServiceUtil.getJanaacById(janaacApplicationId);
		paymentMethod=Validator.isNotNull(appPayment)&&Validator.isNotNull(appPayment.getPaymentMethod())?appPayment.getPaymentMethod():"";
		amount=Validator.isNotNull(appPayment)&&Validator.isNotNull(appPayment.getAmountPaid())?appPayment.getAmountPaid():"";
		currency=Validator.isNotNull(appPayment)&&Validator.isNotNull(appPayment.getAmountCurrency())?appPayment.getAmountCurrency():"";
	}catch(Exception e){}
	
	try {
		laboratoryPartOfOrg = AddLaboratoryPartOfOrgLocalServiceUtil.getJanaacByAppId(janaacApplicationId);
		sizeOflaboratoryPartOfOrgAdd = laboratoryPartOfOrg.size();
	} catch (Exception e) {
	}
	
	try {
		labMedicalTestDesc = AccMediLabTestDescriptionLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch (Exception e) {
	}
	
	try{
		mediLabTestStructural=  AccMediLabTestStructuralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
	
	try{
		mediLabTestResourceReq=  AccMediLabTestResourceReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	} 
	
	try {
		outsourcedActivities = AddOutsourcedActivitiesLocalServiceUtil.getJanaac_OutSrc_Id(janaacApplicationId);
		sizeOfOutSourcedActivitiesAdd = outsourcedActivities.size();
	} catch (Exception e) {
	}
}


/* Medical lab */
/* AccMediLabManagementReq mediLabManagementReq=null; */

String hasManagementEstablishedDoc="";
String hasManagementEstablishedDocUrl="";
String laboratoryControlAwareDoc="";
String laboratoryControlAwareDocUrl="";
String ObjectivepoliciesDoc="";
String ObjectivepoliciesDocUrl="";
String laboratoryControlledDoc="";
String laboratoryControlledDocUrl="";
String retainedLegibleRecordsDoc="";
String retainedLegibleRecordsDocUrl="";
String laboratoryActivitiesDoc="";
String laboratoryActivitiesDocUrl="";
String irrespectiveResponsibilitiesDoc="";
String irrespectiveResponsibilitiesDocUrl="";
String laboratoryAuthorizePersonnelDoc="";
String laboratoryAuthorizePersonnelDocUrl="";
String laboratoryControlDocumentsDoc="";
String laboratoryControlDocumentsDocUrl="";
String demonstrateFulfilmentDoc="";
String demonstrateFulfilmentDocUrl="";
String serviceAgreementDoc="";
String serviceAgreementDocUrl="";
String interpretationAdviceDoc="";
String interpretationAdviceDocUrl="";
String serviceSuppliesDoc="";
String serviceSuppliesDocUrl="";
String complaintReceivedDoc="";
String complaintReceivedDocUrl="";
String nonconformitiesDoc="";
String nonconformitiesDocUrl="";
String programmeCorrectiveDoc="";
String programmeCorrectiveDocUrl="";
String improvementAssociatedDoc="";
String improvementAssociatedDocUrl="";
String retainLegibleDoc="";
String retainLegibleDocUrl="";
String effectiveManagementDoc="";
String effectiveManagementDocUrl="";
String suitabilityAdequacyDoc="";
String suitabilityAdequacyDocUrl="";
String servicesNecessaryDoc="";
String servicesNecessaryDocUrl="";
String participateManagerialDoc="";
String participateManagerialDocUrl="";
String accommodationEnvironmentaltDoc="";
String accommodationEnvironmentaltDocUrl="";
String selectionPurchasingDoc="";
String selectionPurchasingDocUrl="";
String reagentsConsumablesDoc="";
String reagentsConsumablesDocUrl="";
String preExaminationActivitiesDoc="";
String preExaminationActivitiesDocUrl="";
String clinicalAccuracyDoc="";
String clinicalAccuracyDocUrl="";
String procedureMonitoringDoc="";
String procedureMonitoringDocUrl="";
String noneStandardizedMethodsDoc="";
String noneStandardizedMethodsDocUrl="";
String measurementProcedureDeterminedDoc="";
String measurementProcedureDeterminedDocUrl="";
String qualityControlFailureDoc="";
String qualityControlFailureDocUrl="";
String preventiveMaintenanceDoc="";
String preventiveMaintenanceDocUrl="";
String procedureCalibrationDoc="";
String procedureCalibrationDocUrl="";
String interLaboratoryComparisonDoc="";
String interLaboratoryComparisonDocUrl="";
String postExaminationDoc="";
String postExaminationDocUrl="";
String reportedAccuratelyDoc="";
String reportedAccuratelyDocUrl="";
String responsibilitiesProceduresDoc="";
String responsibilitiesProceduresDocUrl="";
String authoritiesAndResponsibilitiesDoc="";
String authoritiesAndResponsibilitiesDocUrl="";

String fileDetailsJson="";
//sign medical lab
String signAuthPersonnel="";
String companyStamp="";
String medicalSign="";
String resumeHuman="";
String resumeHumanUrl="";
if(janaacApplicationId>0){
	//sign
	try{
		signAuthPersonnel=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Signature of Authorized Personnel", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		companyStamp=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Application Company Stamp", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		medicalSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Medical representative signature", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	//attach
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		hasManagementEstablishedDoc = fileDetails.getString("fileName");
		hasManagementEstablishedDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "Resume Human Resource", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		resumeHuman = fileDetails.getString("fileName");
		resumeHumanUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		laboratoryControlAwareDoc = fileDetails.getString("fileName");
		laboratoryControlAwareDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}

	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		ObjectivepoliciesDoc = fileDetails.getString("fileName");
		ObjectivepoliciesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		laboratoryControlledDoc = fileDetails.getString("fileName");
		laboratoryControlledDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		retainedLegibleRecordsDoc = fileDetails.getString("fileName");
		retainedLegibleRecordsDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		 fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		 JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		 laboratoryActivitiesDoc = fileDetails.getString("fileName");
		 laboratoryActivitiesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		irrespectiveResponsibilitiesDoc = fileDetails.getString("fileName");
		irrespectiveResponsibilitiesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical Quality manual eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		laboratoryAuthorizePersonnelDoc = fileDetails.getString("fileName");
		laboratoryAuthorizePersonnelDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}

	try{
		 fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		 JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		 laboratoryControlDocumentsDoc = fileDetails.getString("fileName");
		 laboratoryControlDocumentsDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}

	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		demonstrateFulfilmentDoc = fileDetails.getString("fileName");
		demonstrateFulfilmentDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		serviceAgreementDoc = fileDetails.getString("fileName");
		serviceAgreementDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		interpretationAdviceDoc = fileDetails.getString("fileName");
		interpretationAdviceDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		serviceSuppliesDoc = fileDetails.getString("fileName");
		serviceSuppliesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		complaintReceivedDoc = fileDetails.getString("fileName");
		complaintReceivedDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		nonconformitiesDoc = fileDetails.getString("fileName");
		nonconformitiesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		programmeCorrectiveDoc = fileDetails.getString("fileName");
		programmeCorrectiveDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		improvementAssociatedDoc = fileDetails.getString("fileName");
		improvementAssociatedDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		retainLegibleDoc = fileDetails.getString("fileName");
		retainLegibleDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		effectiveManagementDoc = fileDetails.getString("fileName");
		effectiveManagementDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet re Qua twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		suitabilityAdequacyDoc = fileDetails.getString("fileName");
		suitabilityAdequacyDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		servicesNecessaryDoc = fileDetails.getString("fileName");
		servicesNecessaryDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}

	try{
		 fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		 JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		 participateManagerialDoc = fileDetails.getString("fileName");
		 participateManagerialDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		accommodationEnvironmentaltDoc = fileDetails.getString("fileName");
		accommodationEnvironmentaltDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		 fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		 JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		 selectionPurchasingDoc = fileDetails.getString("fileName");
		 selectionPurchasingDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		reagentsConsumablesDoc = fileDetails.getString("fileName");
		reagentsConsumablesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		preExaminationActivitiesDoc = fileDetails.getString("fileName");
		preExaminationActivitiesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		clinicalAccuracyDoc = fileDetails.getString("fileName");
		clinicalAccuracyDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		procedureMonitoringDoc = fileDetails.getString("fileName");
		procedureMonitoringDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		noneStandardizedMethodsDoc = fileDetails.getString("fileName");
		noneStandardizedMethodsDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		measurementProcedureDeterminedDoc = fileDetails.getString("fileName");
		measurementProcedureDeterminedDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		qualityControlFailureDoc = fileDetails.getString("fileName");
		qualityControlFailureDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		 fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource twelev", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		 JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		 preventiveMaintenanceDoc = fileDetails.getString("fileName");
		 preventiveMaintenanceDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource thirteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		procedureCalibrationDoc = fileDetails.getString("fileName");
		procedureCalibrationDocUrl = fileDetails.getString("downloadLink");

	
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource fourteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		interLaboratoryComparisonDoc = fileDetails.getString("fileName");
		interLaboratoryComparisonDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource fivteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		postExaminationDoc = fileDetails.getString("fileName");
		postExaminationDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource sixteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		reportedAccuratelyDoc = fileDetails.getString("fileName");
		reportedAccuratelyDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource seventeen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		responsibilitiesProceduresDoc = fileDetails.getString("fileName");
		responsibilitiesProceduresDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
	try{
		fileDetailsJson=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab medical managemet resource eighteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetails = JSONFactoryUtil.createJSONObject(fileDetailsJson);
		authoritiesAndResponsibilitiesDoc = fileDetails.getString("fileName");
		authoritiesAndResponsibilitiesDocUrl = fileDetails.getString("downloadLink");
	}catch(Exception e){}
	
}

/* medical testing */
String normatDoc="";
String normatDocUrl="";
String fileDetailsJsonTest="";
String PoliciesObjectivesDoc="";
String PoliciesObjectivesDocUrl="";
String ProvisionsImpartialityDoc="";
String ProvisionsImpartialityDocUrl="";
String ProvisionsConfidentialityDoc="";
String ProvisionsConfidentialityDocUrl="";
String developmentImplementDoc="";
String developmentImplementDocUrl="";
String evidenceReferencesDoc1="";
String evidenceReferencesDocUrl1="";
String laboratoryActivitiesTestDoc="";
String laboratoryActivitiesTestDocUrl="";
String personnelResponsibilityDoc1="";
String personnelResponsibilityDocUrl1="";
String determinationCompetenceDoc="";
String determinationCompetenceDocUrl="";
String monitoringPersonnelDoc="";
String monitoringPersonnelDocUrl="";
String handlingTransportDoc1="";
String handlingTransportDocUrl1="";
String calibrationProgrammeDoc1="";
String calibrationProgrammeDocUrl1="";
String reviewingApprovingDoc1="";
String reviewingApprovingDocUrl1="";
String selectionEvaluationDoc1="";
String selectionEvaluationDocUrl1="";
String ensuringExternallyDoc="";
String ensuringExternallyDocUrl="";
String tendersContractsDoc1="";
String tendersContractsDocUrl1="";
String proceduresLaboratoryDoc1="";
String proceduresLaboratoryDocUrl1="";
String methodsValidationDoc="";
String methodsValidationDocUrl="";
String referenceSamplingDoc="";
String referenceSamplingDocUrl="";
String transportationReceiptDoc="";
String transportationReceiptDocUrl="";
String uncertaintyMeasurementDoc1="";
String uncertaintyMeasurementDocUrl1="";
String monitoringValidityDoc="";
String monitoringValidityDocUrl="";
String complaintsLaboratoryDoc="";
String complaintsLaboratoryDocUrl="";
String nonconformingWorkDoc1="";
String nonconformingWorkDocUrl1="";
String uniqueIdentificationDoc1="";
String uniqueIdentificationDocUrl1="";
String identificationCurrentDoc="";
String identificationCurrentDocUrl="";
String identificationChangesDoc1="";
String identificationChangesDocUrl1="";
String controlRecordsDoc1="";
String controlRecordsDocUrl1="";
String addressRisksDoc="";
String addressRisksDocUrl="";
String improvementOpportunitiesDoc="";
String improvementOpportunitiesDocUrl="";
String correctiveActionActivitiesDoc1="";
String correctiveActionActivitiesDocUrl1="";
String internalAuditsDoc1="";
String internalAuditsDocUrl1="";
String managementReviewsDoc1="";
String managementReviewsDocUrl1="";
//sign testing lab
String signAuthPersonnelTest="";
String companyStampTest="";
String testingSign="";


AccMediLabTestStructural tesStructural=null;
AccMediLabTestResourceReq testResouceData=null;
if(janaacApplicationId>0){
try{
	tesStructural=AccMediLabTestStructuralLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){	
}
try{
	testResouceData=AccMediLabTestResourceReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){
	
}
//Upload Documents:
//sign
try{
	testingSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Test representative signature", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	companyStampTest=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accer Test Company Stamp", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	signAuthPersonnelTest=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accer Test Signature of Authorized Personnel", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
//attach
try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "Normatives Documents", themeDisplay.getScopeGroupId(), janaacApplicationId);
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	normatDoc = fileDetailsTest.getString("fileName");
	normatDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}
try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	PoliciesObjectivesDoc = fileDetailsTest.getString("fileName");
	PoliciesObjectivesDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	ProvisionsImpartialityDoc = fileDetailsTest.getString("fileName");
	ProvisionsImpartialityDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	ProvisionsConfidentialityDoc = fileDetailsTest.getString("fileName");
	ProvisionsConfidentialityDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	developmentImplementDoc = fileDetailsTest.getString("fileName");
	developmentImplementDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	evidenceReferencesDoc1 = fileDetailsTest.getString("fileName");
	evidenceReferencesDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	laboratoryActivitiesTestDoc = fileDetailsTest.getString("fileName");
	laboratoryActivitiesTestDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	personnelResponsibilityDoc1 = fileDetailsTest.getString("fileName");
	personnelResponsibilityDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	determinationCompetenceDoc = fileDetailsTest.getString("fileName");
	determinationCompetenceDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	monitoringPersonnelDoc = fileDetailsTest.getString("fileName");
	monitoringPersonnelDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	handlingTransportDoc1 = fileDetailsTest.getString("fileName");
	handlingTransportDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	calibrationProgrammeDoc1 = fileDetailsTest.getString("fileName");
	calibrationProgrammeDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	reviewingApprovingDoc1 = fileDetailsTest.getString("fileName");
	reviewingApprovingDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	selectionEvaluationDoc1 = fileDetailsTest.getString("fileName");
	selectionEvaluationDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Res seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	ensuringExternallyDoc = fileDetailsTest.getString("fileName");
	ensuringExternallyDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	tendersContractsDoc1 = fileDetailsTest.getString("fileName");
	tendersContractsDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	proceduresLaboratoryDoc1 = fileDetailsTest.getString("fileName");
	proceduresLaboratoryDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	methodsValidationDoc = fileDetailsTest.getString("fileName");
	methodsValidationDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	referenceSamplingDoc = fileDetailsTest.getString("fileName");
	referenceSamplingDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	transportationReceiptDoc = fileDetailsTest.getString("fileName");
	transportationReceiptDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	uncertaintyMeasurementDoc1 = fileDetailsTest.getString("fileName");
	uncertaintyMeasurementDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	monitoringValidityDoc = fileDetailsTest.getString("fileName");
	monitoringValidityDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	complaintsLaboratoryDoc = fileDetailsTest.getString("fileName");
	complaintsLaboratoryDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc Pro nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	nonconformingWorkDoc1 = fileDetailsTest.getString("fileName");
	nonconformingWorkDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	uniqueIdentificationDoc1 = fileDetailsTest.getString("fileName");
	uniqueIdentificationDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	identificationCurrentDoc = fileDetailsTest.getString("fileName");
	identificationCurrentDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	identificationChangesDoc1 = fileDetailsTest.getString("fileName");
	identificationChangesDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	controlRecordsDoc1 = fileDetailsTest.getString("fileName");
	controlRecordsDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	addressRisksDoc = fileDetailsTest.getString("fileName");
	addressRisksDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	improvementOpportunitiesDoc = fileDetailsTest.getString("fileName");
	improvementOpportunitiesDocUrl = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	correctiveActionActivitiesDoc1 = fileDetailsTest.getString("fileName");
	correctiveActionActivitiesDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	internalAuditsDoc1 = fileDetailsTest.getString("fileName");
	internalAuditsDocUrl1= fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

try{
	fileDetailsJsonTest=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "lab test Doc manage nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	JSONObject fileDetailsTest = JSONFactoryUtil.createJSONObject(fileDetailsJsonTest);
	managementReviewsDoc1 = fileDetailsTest.getString("fileName");
	managementReviewsDocUrl1 = fileDetailsTest.getString("downloadLink");
}catch(Exception e){}

}
/* calibration */
String fileDetailsJsonCaliber="";
String normatDocCaliber="";
String normatDocCaliberUrl="";
String fulfillingRequirementsDoc="";
String impartialityProvisionsDoc="";
String provisionsConfidentialityDoc="";
String implementationContinuousDoc="";
String evidenceReferencesDoc="";
String responsibilitiesInterrelationshipDoc="";
String personnelResponsibilityDoc="";
String competenceRequirementsDoc="";
String trainingSupervisionDoc="";
String laboratoryRequirementsDoc="";
String calibrationMethodsDoc="";
String referenceSamplingPlanDoc="";
String disposalCalibrationItemsDoc="";
String validityCalibrationResultsDoc="";
String complaintsReferenceLaboratoryDoc="";
String identificationCurrentRevisionDoc="";
String referenceRecordsDoc="";
String plannedActionsRisksDoc="";
String improvementsOpportunitiesDoc="";
String internalReferenceAuditsDoc="";
String signAuthPersonnelCaliber="";
String companyStampCaliber="";
String caliberSign="";
String handlingTransportDoc="";
String calibrationProgrammeDoc="";
String reviewingApprovingDoc="";
String selectionEvaluationDoc="";
String tendersContractsDoc="";
String proceduresLaboratoryDoc="";
String uncertaintyMeasurementDoc="";
String nonconformingWorkDoc="";
String uniqueIdentificationDoc="";
String identificationChangesDoc="";
String correctiveActionActivitiesDoc="";
String managementReviewsDoc="";

if(janaacApplicationId>0){
	//sign
	try{
		signAuthPersonnelCaliber=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Lab Signature of Authorized Personnel", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		companyStampCaliber=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Lab Company Stamp", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		caliberSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Cal representative signature", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	//attach
	try{
		fileDetailsJsonCaliber=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "Normatives Documents Caliber", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetailsCaliber = JSONFactoryUtil.createJSONObject(fileDetailsJsonCaliber);
		normatDocCaliber = fileDetailsCaliber.getString("fileName");
		normatDocCaliberUrl = fileDetailsCaliber.getString("downloadLink");
	
	}catch(Exception e){}
	try{
		fulfillingRequirementsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		impartialityProvisionsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		provisionsConfidentialityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		implementationContinuousDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		evidenceReferencesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		responsibilitiesInterrelationshipDoc=GettingUploadDoccumentData.getDocName(themeDisplay,  "lab Cali Doc Ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		personnelResponsibilityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		competenceRequirementsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		trainingSupervisionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		handlingTransportDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		calibrationProgrammeDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		reviewingApprovingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		selectionEvaluationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		laboratoryRequirementsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Res seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		tendersContractsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		proceduresLaboratoryDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		calibrationMethodsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		referenceSamplingPlanDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		disposalCalibrationItemsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		uncertaintyMeasurementDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		validityCalibrationResultsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		complaintsReferenceLaboratoryDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		nonconformingWorkDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc Pro nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	
	try{
		uniqueIdentificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		identificationCurrentRevisionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		identificationChangesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		referenceRecordsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		plannedActionsRisksDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		improvementsOpportunitiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		correctiveActionActivitiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		internalReferenceAuditsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		managementReviewsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "lab Cali Doc manage nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}

}
/* certification management */
String impartialityPolicyDoc="";
String impartialityMitigationDoc="";
String keyCertificationPersonnelDoc="";
String committeesInvolvedDoc="";
String partnershipsAgentsDoc="";
String criteriaRequiredKnowledgeDoc="";
String nitialCompetenceEvaluationDoc="";
String authorizingAuditorsDoc="";
String monitoringCompetenceDoc="";
String technicalExpertsDoc="";
String outsourcingCertificationDoc="";
String outsourcedServicesDoc="";
String publiclyAvailableAccessibleDoc="";
String maintainingRenewingSuspendingDoc="";
String managementSystemsCertificationDoc="";
String certificationMarkLogoDoc="";
String handlingRequestInformationDoc="";
String ImpartialityPoliciesDoc="";
String provisionsInformingDoc="";
String certificationDocumentsDoc="";
String productPackagingDoc="";
String legallyEnforceableArrangementsDoc="";
String ensuringConfidentialityDoc="";
String mechanismsInformingClientsDoc="";
String applicationProcessDoc="";
String processApplicationReviewDoc1="";
String cycleAuditProgrammeDoc="";
String determiningAuditTimeDoc="";
String samplingProgrammePlanDoc="";
String auditPlanningIncludeDoc="";
String selectingAppointingDoc="";
String processConductingDoc="";
String auditReportSampleDoc="";
String auditNonConformitiesDoc="";
String auditResultsPriorDoc="";
String transferCertificationDoc="";
String withdrawalReductionDoc="";
String suspensionWithdrawalDoc="";
String decisionsAppealsDoc="";
String procedureHandlingComplaintsDoc="";
String recordRetentionPolicyDoc="";
String recordRetentionProcedureDoc="";
String managementSystemPoliciesDoc="";
String managementSystemObjectivesDoc="";
String manualEquivalentDoc="";
String procedureDocumentControlDoc="";
String procedureRecordControlDoc="";
String managementReviewDoc1="";
String internauditsDoc="";
String managementCorrectiveActionsDoc="";
String ScopeQmsDoc="";
String planningInputsControlsDoc="";
String needsInterestedPartiesDoc="";
String managementDoc="";
String CertioneSign="";
String companyStampCerti="";
String signAuthPersonnelCerti="";
//sign
 try{
	 signAuthPersonnelCerti=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Signature of Authorized Personnel Certfi Bodies", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		companyStampCerti=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Company Seals Certfi Bodies", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		CertioneSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Certi Bodies 17021 representative signature", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
AccCerBodyApplicantInfo applicantInfo=null;
AccCerBodyScope cerBodyScope=null;
AccCerBodyManageReq applicationCerSec=null;
if(janaacApplicationId > 0) {
try{
	applicantInfo=AccCerBodyApplicantInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){
}
try{
	cerBodyScope=AccCerBodyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){
}
try{
	applicationCerSec=AccCerBodyManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){
}

try{
	impartialityPolicyDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	impartialityMitigationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	keyCertificationPersonnelDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man struc one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	committeesInvolvedDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man struc two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	partnershipsAgentsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man struc three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	criteriaRequiredKnowledgeDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	nitialCompetenceEvaluationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	authorizingAuditorsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	monitoringCompetenceDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	technicalExpertsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	outsourcingCertificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	outsourcedServicesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man resource seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	publiclyAvailableAccessibleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	maintainingRenewingSuspendingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	managementSystemsCertificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	certificationMarkLogoDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	handlingRequestInformationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	ImpartialityPoliciesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	provisionsInformingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	certificationDocumentsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	productPackagingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	legallyEnforceableArrangementsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	ensuringConfidentialityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	mechanismsInformingClientsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man info twelev", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	applicationProcessDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	processApplicationReviewDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	cycleAuditProgrammeDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	determiningAuditTimeDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	samplingProgrammePlanDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditPlanningIncludeDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	selectingAppointingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	processConductingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditReportSampleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditNonConformitiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	auditResultsPriorDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	transferCertificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	withdrawalReductionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process thirteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	suspensionWithdrawalDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process fourteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	decisionsAppealsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process fivteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureHandlingComplaintsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process sixteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	recordRetentionPolicyDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process seventeen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	recordRetentionProcedureDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man process eighteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementSystemPoliciesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementSystemObjectivesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	manualEquivalentDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureDocumentControlDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	procedureRecordControlDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementReviewDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	internauditsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}


try{
	managementCorrectiveActionsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	ScopeQmsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system bref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	planningInputsControlsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system bref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	needsInterestedPartiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system bref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	managementDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17021 man system bref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

}
%>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyMngReqTwoLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo"%>
<% 
String certificationAgreementDoc1="";
String impartialityMitigationMeasuresDoc1="";
String confidentialityQualityManualDoc="";
String publiclyAvailableInformationDoc1="";
String financialSupportFeesDoc="";
String rightsDutiesApplicantsDoc="";
String handlingComplaintsAppealsDoc="";
String dutiesResponsibilitiesAuthoritiesDoc="";
String termsReferenceOperationDoc="";
String mechanismSafeguardingImpartialityDoc1="";
String competenciesPersonnelInvolvedDoc="";
String contractPersonnelSampleDoc="";
String outsourcedServiceDoc="";
String qualificationAssessingDoc="";
String normativeDocumentsDoc="";
String applicationTemplateDoc="";
String processApplicationReviewDoc17065="";
String certificationIncludesProductDoc="";
String planEvaluationActivitiesDoc="";
String evaluationReviewSampleDoc="";
String certificationDecisionDoc="";
String certificationDocumentationSampleDoc="";
String directoryCertifiedClientsDoc="";
String decisionsComplaintsAppealsDoc="";
String generalManagementSystemDoc="";
String controlDocumentsDoc1="";
String controlRecordsDoc17065="";
String managementReviewDoc2="";
String internalAuditManageDoc="";
String correctiveManageActionDoc="";
String preventiveManageActionDoc="";
String keepingRequirementsDoc="";
String signAuthPersonnelCerti17065="";
String companyStampCerti17065="";
String CertiTwoSign="";
AccCerBodyMngReqTwo manReqTwoInfo=null;

try{
	manReqTwoInfo=AccCerBodyMngReqTwoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
}catch(Exception e){}

if(janaacApplicationId>0){
	//sign
	 try{
		 signAuthPersonnelCerti17065=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Certi 17065 Signature Authorized Personnel", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		}catch(Exception e){}
		try{
			companyStampCerti17065=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Certi 17065 Company Stamp", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		}catch(Exception e){}
		try{
			CertiTwoSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Certi 17065 Applicant Representative Signature", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		}catch(Exception e){}
	
	try{
		certificationAgreementDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		impartialityMitigationMeasuresDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		confidentialityQualityManualDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		publiclyAvailableInformationDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		financialSupportFeesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		rightsDutiesApplicantsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		handlingComplaintsAppealsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		dutiesResponsibilitiesAuthoritiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man struct one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		termsReferenceOperationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man struct two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		mechanismSafeguardingImpartialityDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man struct three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		competenciesPersonnelInvolvedDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		contractPersonnelSampleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		outsourcedServiceDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		qualificationAssessingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		normativeDocumentsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		applicationTemplateDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processApplicationReviewDoc17065=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationIncludesProductDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		planEvaluationActivitiesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		evaluationReviewSampleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDecisionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDocumentationSampleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		directoryCertifiedClientsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		decisionsComplaintsAppealsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		generalManagementSystemDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlDocumentsDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlRecordsDoc17065=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		managementReviewDoc2=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		internalAuditManageDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		correctiveManageActionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		preventiveManageActionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man system seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		keepingRequirementsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17065 man require one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	
}

%>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%
 String certificationAgreementDoc="";
String impartialityMitigationMeasuresDoc="";
String confidentialityDoc="";
String securityDoc="";
String publiclyAvailableInformationDoc="";
String certificationExaminersDoc="";
String PreRequisitesCertificationDoc="";
String bodyIncludingAdvertisingDoc="";
String policiesProceduresHandlingDoc="";
String proceduresHandlingComplaintsDoc="";
String authoritiesManagementDoc="";
String operationCommitteesDoc="";
String mechanismSafeguardingImpartialityDoc="";
String competenciesExaminersDoc="";
String contractExaminerSampleDoc="";
String providesOutsourcedServiceDoc="";
String recordsQualificationDoc="";
String otherNormativeDocumentsDoc="";
String applicationSampleTemplateDoc="";
String processApplicationReviewDoc="";
String processIncludingRecertificationDoc="";
String examinationProcessDoc="";
String certificationsDecisionDoc="";
String certificationDocumentationDoc="";
String certificatesLogosMarksDoc="";
String suspensionsDoc="";
String decisionsAppealsComplaintsDoc="";
String generalManagementSystemDocumentationDoc="";
String controlDocumentsDoc="";
String controlRecordsDoc="";
String managementReviewDoc3="";
String internalAuditsDoc17024="";
String correctiveActionsDoc1="";
String preventiveActionsDoc1="";
String keepingRequirementsIsoDoc="";
String signAuthPersonnelCerti17024="";
String companyStampCerti17024="";
String CertiThreeSign="";

if(janaacApplicationId>0){
	//sign
		 try{
			 signAuthPersonnelCerti17024=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Cert 17024 Signature of Authorized", themeDisplay.getScopeGroupId(), janaacApplicationId);	
			}catch(Exception e){}
			try{
				companyStampCerti17024=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Accre Cert 17024 Company Stamp", themeDisplay.getScopeGroupId(), janaacApplicationId);	
			}catch(Exception e){}
			try{
				CertiThreeSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "cert 17024 second cat rep sign", themeDisplay.getScopeGroupId(), janaacApplicationId);	
			}catch(Exception e){}

	try{
		certificationAgreementDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		impartialityMitigationMeasuresDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		confidentialityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		securityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		publiclyAvailableInformationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationExaminersDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		PreRequisitesCertificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		bodyIncludingAdvertisingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struct eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		policiesProceduresHandlingDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struct nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		proceduresHandlingComplaintsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struct ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		authoritiesManagementDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struc one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		operationCommitteesDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struc two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		mechanismSafeguardingImpartialityDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man struc three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		competenciesExaminersDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		contractExaminerSampleDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		providesOutsourcedServiceDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		recordsQualificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		otherNormativeDocumentsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		applicationSampleTemplateDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processApplicationReviewDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		processIncludingRecertificationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		examinationProcessDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationsDecisionDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificationDocumentationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		certificatesLogosMarksDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		suspensionsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		decisionsAppealsComplaintsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man process ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		generalManagementSystemDocumentationDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlDocumentsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		controlRecordsDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		managementReviewDoc3=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		internalAuditsDoc17024=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		correctiveActionsDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		preventiveActionsDoc1=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man system seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	
	try{
		keepingRequirementsIsoDoc=GettingUploadDoccumentData.getDocName(themeDisplay, "cert 17024 man requirement one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}


}

%>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page
	import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<% 
String fileDetailsJsonIns="";
String resumeHumanIns="";
String resumeHumanInsUrl="";
String manualApprovalDoc="";
String relevantPoliciesDoc="";
String overallObjectivesDoc="";
String supportingProcedureDoc="";
String technicalManagementDoc="";
String inspectionActivitieDoc="";
String documentControlProcedureDoc="";
String documentChangesDoc="";
String inspectionRecordsDoc="";
String managementReviewDoc="";
String internalAuditsDoc="";
String correctiveActionsDoc="";
String preventiveActionsDoc="";
String personnelTrainingDoc="";
String equipmentDoc="";
String inspectionBodiesProcessDoc="";
String contractualArrangementsDoc="";
String handlingInspectionDoc="";
String complaintsAppealsDoc="";
String fileUrlOfAuthorizedPersonnel = "";
String fileUrlOfCompanyStamp = "";
String fileUrlOfRepresentativeSignature = "";
//attach
String manualApprovalDocUrl = "";
String relevantPoliciesDocUrl = "";
String overallObjectivesDocUrl = "";
String supportingProcedureDocUrl = "";
String technicalManagementDocUrl = "";
String inspectionActivitieDocUrl = "";
String documentControlProcedureDocUrl = "";
String documentChangesDocUrl = "";
String inspectionRecordsDocUrl = "";
String managementReviewDocUrl = "";
String internalAuditsDocUrl = "";
String correctiveActionsDocUrl = "";
String preventiveActionsDocUrl = "";
String personnelTrainingDocUrl = "";
String equipmentDocUrl = "";
String inspectionBodiesProcessDocUrl = "";
String contractualArrangementsDocUrl = "";
String handlingInspectionDocUrl = "";
String complaintsAppealsDocUrl = "";
if(janaacApplicationId>0){
	try{
		fileDetailsJsonIns=GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "Resume Human Resource Ins", themeDisplay.getScopeGroupId(), janaacApplicationId);	
		JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
		resumeHumanIns = fileDetailsIns.getString("fileName");
		resumeHumanInsUrl = fileDetailsIns.getString("downloadLink");
	}catch(Exception e){}
	try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    manualApprovalDoc = fileDetailsIns.getString("fileName");
    manualApprovalDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    relevantPoliciesDoc = fileDetailsIns.getString("fileName");
    relevantPoliciesDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    overallObjectivesDoc = fileDetailsIns.getString("fileName");
    overallObjectivesDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    supportingProcedureDoc = fileDetailsIns.getString("fileName");
    supportingProcedureDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    technicalManagementDoc = fileDetailsIns.getString("fileName");
    technicalManagementDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies manual ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    inspectionActivitieDoc = fileDetailsIns.getString("fileName");
    inspectionActivitieDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req one", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    documentControlProcedureDoc = fileDetailsIns.getString("fileName");
    documentControlProcedureDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req two", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    documentChangesDoc = fileDetailsIns.getString("fileName");
    documentChangesDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req three", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    inspectionRecordsDoc = fileDetailsIns.getString("fileName");
    inspectionRecordsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req four", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    managementReviewDoc = fileDetailsIns.getString("fileName");
    managementReviewDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req five", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    internalAuditsDoc = fileDetailsIns.getString("fileName");
    internalAuditsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req six", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    correctiveActionsDoc = fileDetailsIns.getString("fileName");
    correctiveActionsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system req seven", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    preventiveActionsDoc = fileDetailsIns.getString("fileName");
    preventiveActionsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    personnelTrainingDoc = fileDetailsIns.getString("fileName");
    personnelTrainingDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies system resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    equipmentDoc = fileDetailsIns.getString("fileName");
    equipmentDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies process resource one", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    inspectionBodiesProcessDoc = fileDetailsIns.getString("fileName");
    inspectionBodiesProcessDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies process resource two", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    contractualArrangementsDoc = fileDetailsIns.getString("fileName");
    contractualArrangementsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies process resource three", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    handlingInspectionDoc = fileDetailsIns.getString("fileName");
    handlingInspectionDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
try{
    fileDetailsJsonIns = GettingUploadDoccumentData.getSignaturePreviewUrl(themeDisplay, "inspection bodies process resource four", themeDisplay.getScopeGroupId(), janaacApplicationId);  
    JSONObject fileDetailsIns = JSONFactoryUtil.createJSONObject(fileDetailsJsonIns);
    complaintsAppealsDoc = fileDetailsIns.getString("fileName");
    complaintsAppealsDocUrl = fileDetailsIns.getString("downloadLink");
}catch(Exception e){}
	List<DLFileEntry> fileEntry = new ArrayList<DLFileEntry>();
	DLFolder supportingDocumentsParentFolder = null;
	DLFolder supportingDocumentsFolder = null;
	DLFolder supportingDocumentSubFolderManagment = null;
	try {
		supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
		supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
				supportingDocumentsParentFolder.getFolderId(), String.valueOf(janaacApplicationId));
	} catch (Exception e) {
	}
	
	try {
		supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
				"Signature of Third Cat Authorized");
		fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocumentSubFolderManagment.getFolderId());
		for (DLFileEntry dlFileEntry : fileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			fileUrlOfAuthorizedPersonnel=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			
		}
	} catch (Exception e) {
	}
	
	try {
		supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
				"Signature of Third Cat Company stamps");
		fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocumentSubFolderManagment.getFolderId());
		for (DLFileEntry dlFileEntry : fileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			fileUrlOfCompanyStamp=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			
		}
	} catch (Exception e) {
	}

	try {
		supportingDocumentSubFolderManagment = DLFolderLocalServiceUtil.getFolder(
				themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),
				"Signature of Third Cat Applicant representative");
		fileEntry = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
				supportingDocumentSubFolderManagment.getFolderId());
		for (DLFileEntry dlFileEntry : fileEntry) {
			attachDocFE = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			fileUrlOfRepresentativeSignature=DLURLHelperUtil.getDownloadURL(attachDocFE,
					attachDocFE.getFileVersion(), themeDisplay, StringPool.BLANK, false, true);
			
		}
	} catch (Exception e) {
	}
	
}
%>
<%@page import="com.nbp.janaac.upload.document.commands.GettingUploadDoccumentData"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccCerBodyManageReqLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccCerBodyManageReq"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccThirdPartyScopeLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccThirdPartyScope"%>
<%@page import="com.nbp.janaac.application.form.service.service.AccThirdPartyAppliInfoLocalServiceUtil"%>
<% 
AccThirdPartyAppliInfo accThirdPartyAppliInfo=null;
AccCerBodyManageReq cerBodyManReqInfo=null;
String impartialityQualityOne="";
String impartialityQualityTwo="";
String impartialityQualityThree="";
String impartialityQualityFour="";
String orgStruFirst="";
String orgStruSec="";
String orgStruFirstThree="";
String approvalFirst="";
String approvalSec="";
String approvalThird="";
String approvalFour="";
String approvalFive="";
String approvalSix="";
String approvalSeven="";
String approvalEight="";
String approvalInfOne="";
String approvalInfoTwo="";
String approvalInfoThree="";
String approvalInfoFour="";
String approvalInfoFive="";
String approvalInfoSix="";
String approvalInfoSeven="";
String approvalInfoEight="";
String approvalInfoNine="";
String approvalInfoTen="";
String approvalInfoEleven="";
String approvalInfTwelve="";
String approvalProOne="";
String approvalProTwo="";
String approvalProThree="";
String approvalProfour="";
String approvalProFive="";
String approvalProSix="";
String approvalProSeven="";
String approvalProEight="";
String approvalProNine="";
String approvalProTen="";
String approvalProEleven="";
String approvalProTwelve="";
String approvalProThirteen="";
String approvalProFourteen="";
String approvalProFiveteen="";
String approvalProSixteen="";
String approvalProSeventeen="";
String approvalManOne="";
String approvalManTwo="";
String approvalManThree="";
String approvalManFour="";
String approvalManFive="";
String approvalManSix="";
String approvalManSeven="";
String approvalManEight="";
String approvalManNine="";
String signAuthPersonnelFda="";
String companyStampFda="";
String fdaSign="";
String accFdaScheme="";
String supplementCerti="";
if (janaacApplicationId > 0) {
	try{
		accThirdPartyAppliInfo=	AccThirdPartyAppliInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		if(Validator.isNotNull(accThirdPartyAppliInfo.getAccFdaScheme())){
			accFdaScheme=accThirdPartyAppliInfo.getAccFdaScheme();
		}
		if(Validator.isNotNull(accThirdPartyAppliInfo.getSupplementaryCertificate())){
			supplementCerti=accThirdPartyAppliInfo.getSupplementaryCertificate();
		}
	}catch(Exception e){
	}
	try{
		cerBodyManReqInfo=	AccCerBodyManageReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
//sign
	try{
		signAuthPersonnelFda=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Signature of Authorized Personnel Fda", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		companyStampFda=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Application Company Stamp Fda", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
	try{
		fdaSign=GettingUploadDoccumentData.getSignPreviewUrl(themeDisplay, "Signature of Applicant Representive Fda", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
try{
impartialityQualityOne=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval impartiality first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityTwo=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval impartiality second", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityThree=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval impartiality third", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
impartialityQualityFour=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval impartiality four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
orgStruFirst=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval org structure first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
orgStruSec=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval org structure two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	orgStruFirstThree=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval org structure three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFirst=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party first", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSec=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party second", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalThird=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party third", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFour=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalFive=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSix=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalSeven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalEight=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval third party eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfOne=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoTwo=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoThree=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoFour=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoFive=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoSix=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoSeven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoEight=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoNine=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoTen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfoEleven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalInfTwelve=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval info ref twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
	}catch(Exception e){}
try{
	approvalProOne=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTwo=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProThree=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProfour=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFive=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSix=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSeven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProEight=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProNine=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref ten", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProEleven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref eleven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProTwelve=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref twelve", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProThirteen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref thirteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFourteen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref fourteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProFiveteen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref fivteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSixteen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref sixteen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalProSeventeen=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval cer pro ref seventeen", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManOne=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys one", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManTwo=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys two", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManThree=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys three", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManFour=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys four", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManFive=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys five", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManSix=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys six", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManSeven=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys seven", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}

try{
	approvalManEight=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys eight", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
try{
	approvalManNine=GettingUploadDoccumentData.getDocName(themeDisplay, "fda approval man sys nine", themeDisplay.getScopeGroupId(), janaacApplicationId);	
}catch(Exception e){}
}
%>