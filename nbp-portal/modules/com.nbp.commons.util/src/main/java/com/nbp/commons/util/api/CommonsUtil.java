package com.nbp.commons.util.api;

import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.commons.documents.util.DocumentMetaData;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface CommonsUtil {
	public String getCollaborationDashboardUrl(long groupId, String dashboardFriendlyUrl,PortletRequest request,String portletName,long applicationId);
	public File getPreviewFileDownloadPdf(ResourceRequest resourceRequest, ResourceResponse resourceResponse,String fileName ,String ftlPath);
	public void sendMailToUsers(String subject,String fromAddress, String addresslist,String body);
	public String getTemplateFromJournalArticle(long groupId, String urlTitle);
	public boolean checkUserRoles(ThemeDisplay themeDisplay,String RoleName);
	public String replacePharmaPdfVar(long pharmaApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDoc)throws PortalException ;
	public String replaceAgriculturePdfVar(long agricultureApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceFarmerPdfVar(long farmerApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceCannabisPdfVar(long cannabisApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceAcquirePdfVar(long acquireApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceHealthCarePdfVar(long healthCareApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceFilmPdfVar(long filmApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceManufacturingPdfVar(long manufacturingApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceCreativePdfVar(long creativeApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceTourismPdfVar(long tourismApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceOsiPdfVar(long osiApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String replaceOsiInsolvencyPdfVar(long OsiInsolvencyApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public String filePermissionForDownload(FileEntry fileEntry) throws Exception;
	public void updateFolderPermission(DLFolder dlFolder) throws Exception;
	public List<DocumentMetaData> getFormsDocumentList(ThemeDisplay themeDisplay, long cannabisApplicationId,String folderName);
	public String replaceCannabisPdfVarForCompany(long cannabisApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public void updateFolderPermissionGuest(DLFolder dlFolder) throws Exception;
	public String replaceCannabisPdfVarForCompanyForResearchAndDevelopment(long cannabisApplicationId,ThemeDisplay themeDisplay,String checkPdfSendingInLaunchCaseWithoutDoc)throws PortalException ;
	public JSONObject gettingSupportingDocumentArray(ResourceRequest resourceRequest,String applicationCategory,String apiPathModuleName);
	public JSONObject gettingSupportingDocumentArrayQuarry(ResourceRequest resourceRequest,String applicationCategory,String catName,String apiPathModuleName);
	public JSONObject gettingSupportingDocumentArrayJtb(ResourceRequest resourceRequest,String applicationType,String catName,String apiPathModuleName);
	public String replaceSEZApplicationPdfVar(String category,long sezApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDoc)throws PortalException ;
	public String replaceFireBirgadeApplicationPdfVar(long fireBrigadeApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceNCRAApplicationPdfVar(String category,long ncraApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceMIICApplicationPdfVar(String category,long miicApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceOsiServicesPdfVar(String category,String subcategory,long osiServiceApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceJtbPdfVar(String typeOfApplication,String otherCategories,String accoCategory,long jtbApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceQuarryPdfVar(String typeOfApplication,long quarryApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceMedicalFaciltiesPdfVar(String natureOfApplicant,String medicalCategory,String subCategory,String nursingHomeCategory ,long medicalApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public JSONArray getDownloadUrlForPreview(FileEntry fileEntry,JSONArray jsonArray,ThemeDisplay themeDisplay,JSONObject propertiesObj);
	public String replaceFactoriesRegistrationAppPdfVar(String processingCategory,long factoriesApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replacNcbjAppPdfVar(String typeOfCertification,String numberOfSite,long ncbjApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceMiningApplicationPdfVar(String typeOfApplication,long miningApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceOgtApplicationPdfVar(String typeOfApplication,long ogtApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceWraApplicationPdfVar(String typeOfApplication, String typeOfTransaction, String typeOfPermit,long wraApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceHsraApplicationPdfVar(String typeOfApplication,long hsraApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceJadscApplicationPdfVar(String typeOfApplicant,String typeOfTransaction,long jadscApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String replaceJanaacApplicationPdfVar(String typeOfApplicant,String typeOfTransaction,long janaacApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
	public String getToken(ThemeDisplay themeDisplay,String url) throws Exception;
	public String getBpmObjectData(ThemeDisplay themeDisplay,String token,String moduleId,String url) throws Exception;
	public String replaceExplosivePdfVar(String typeOfApplication,long explosivesApplicationId,ThemeDisplay themeDisplay,String checkPdfDownloadWithoutDocument)throws PortalException ;
}


