package com.nbp.user.dashboard.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.model.AgriculturePermit;
import com.nbp.agriculture.stages.services.service.AgriculturePermitLocalServiceUtil;
import com.nbp.creative.stages.services.model.CreativePermit;
import com.nbp.creative.stages.services.service.CreativePermitLocalServiceUtil;
import com.nbp.explosives.competency.stages.service.model.ExplosiveIssuanceOfLicence;
import com.nbp.explosives.competency.stages.service.service.ExplosiveIssuanceOfLicenceLocalServiceUtil;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;
import com.nbp.factories.registration.stage.services.service.FactoriesCerticateOfRegisLocalServiceUtil;
import com.nbp.farm.application.stages.service.model.FarmPermit;
import com.nbp.farm.application.stages.service.service.FarmPermitLocalServiceUtil;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateLocalServiceUtil;
import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;
import com.nbp.hsra.stage.services.service.HSRAApplicationLicenseIssuanceLocalServiceUtil;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;
import com.nbp.manufacturing.application.stages.services.service.ManufacturingPermitLocalServiceUtil;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;
import com.nbp.medical.stages.service.service.MedicalCertificateIssuanceLocalServiceUtil;
import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;
import com.nbp.miic.stages.service.service.MiicCertificateOfIssuanceLocalServiceUtil;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;
import com.nbp.mining.stage.service.service.MiningApplicationCertificateIssuanceLocalServiceUtil;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;
import com.nbp.ncbj.stages.services.service.NcbjLicenceCertificateLocalServiceUtil;
import com.nbp.ncra.stages.services.model.CertificateOfVerification;
import com.nbp.ncra.stages.services.service.CertificateOfVerificationLocalServiceUtil;
import com.nbp.osi.stages.services.model.OsiApplicationPermit;
import com.nbp.osi.stages.services.service.OsiApplicationPermitLocalServiceUtil;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;
import com.nbp.pharmaceutical.stages.services.service.PharmaApplicationFullLicenseLocalServiceUtil;
import com.nbp.tourism.application.stages.services.model.TourismPermit;
import com.nbp.tourism.application.stages.services.service.TourismPermitLocalServiceUtil;
import com.npm.cannabis.application.stages.services.model.CannabisLicense;
import com.npm.cannabis.application.stages.services.service.CannabisLicenseLocalServiceUtil;

import java.util.Date;
import java.util.List;

import javax.portlet.PortletRequest;

public class DashboardUtil {
	private static Log _log = LogFactoryUtil.getLog(DashboardUtil.class);
	
	public static LiferayPortletURL getCollaborationDashboardUrl(long groupId, String dashboardFriendlyUrl, PortletRequest request,
			String portletName) {
		LiferayPortletURL dashboardRenderURL = null;
		try {
			Layout applicationFormLayout = LayoutLocalServiceUtil.getFriendlyURLLayout(groupId, true,
					dashboardFriendlyUrl);
			dashboardRenderURL = PortletURLFactoryUtil.create(request, portletName, applicationFormLayout.getPlid(),
					PortletRequest.RENDER_PHASE);
			dashboardRenderURL.setParameter("mvcPath", "/view.jsp");
			return dashboardRenderURL;
		} catch (PortalException e) {
		} catch (SystemException e) {
		}
		return null;
	}
	public static int getExpiredDocumentCount(long cannabisApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expiredDocumentCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Cannabis Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(cannabisApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expiredDocumentCount =expiredDocumentCount+1;
					}
				}
			
		}
		} catch (PortalException e) {
		}
		
		return expiredDocumentCount;
	}
	public static int getExpirationPharmaDocCount(long pharmApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationPharmaDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Pharmaceutical Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(pharmApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationPharmaDocCount =expirationPharmaDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationPharmaDocCount;
	}
	public static int getExpirationAcquireDocCount(long acquireApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationAcquireDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Acquire Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(acquireApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationAcquireDocCount =expirationAcquireDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationAcquireDocCount;
	}
	public static int getExpirationManufacturingDocCount(long manufacturingApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationManufacDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Manufacturing Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(manufacturingApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationManufacDocCount =expirationManufacDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationManufacDocCount;
	}
	public static int getExpirationTourismDocCount(long tourismApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationTourismDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Tourism Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(tourismApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationTourismDocCount =expirationTourismDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationTourismDocCount;
	}
	public static int getExpirationHealthDocCount(long healthApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationHealthDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"HealthCare Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(healthApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationHealthDocCount =expirationHealthDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationHealthDocCount;
	}
	public static int getExpirationAgricultureDocCount(long agricultureApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationAgricultureDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Agriculture Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(agricultureApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationAgricultureDocCount =expirationAgricultureDocCount+1;
					}
				}
			}
		} catch (PortalException e) {
		}
		
		return expirationAgricultureDocCount;
	}
	public static int getExpirationDocCount(long applicationId,ThemeDisplay themeDisplay,String parentFolderName) {
		DLFolder supportingDocumentsParentFolder;
		int expirationDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					parentFolderName);
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(applicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationDocCount =expirationDocCount+1;
					}
				}
			}
		} catch (PortalException e) {
		}
		
		return expirationDocCount;
	}
	public static int getExpirationCreativeDocCount(long creativeApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationCreativeDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Creative Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(creativeApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationCreativeDocCount =expirationCreativeDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationCreativeDocCount;
	}
	public static int getExpirationFilmDocCount(long filmApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationFilmDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Film Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(filmApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationFilmDocCount =expirationFilmDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationFilmDocCount;
	}
	public static int getExpirationFarmDocCount(long farmerAppicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationFarmDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Farmer Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(farmerAppicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationFarmDocCount =expirationFarmDocCount+1;
					}
				}
			}
		} catch (PortalException e) {
		}
		return expirationFarmDocCount;
	}
	public static int getExpirationOsiFinancialDocCount(long osiApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationOsiFinDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Osi Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(osiApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationOsiFinDocCount =expirationOsiFinDocCount+1;
					}
				}
			}
		} catch (PortalException e) {
		}
		return expirationOsiFinDocCount;
	}
	public static int getExpirationOsiInsolvencyDocCount(long osiInsolvencyApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationOsiInsolvDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"Osi Insolvency Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(osiInsolvencyApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationOsiInsolvDocCount =expirationOsiInsolvDocCount+1;
					}
				}
			}
		} catch (PortalException e) {
		}
		return expirationOsiInsolvDocCount;
	}

	public static String showExpiredLiceseNotification(String caseId){
		try {
			CannabisLicense cannabisLicenses = CannabisLicenseLocalServiceUtil.getCannabisLicenseByCaseId(caseId);
			if (!isDateGreaterThanOrEqual60Days(cannabisLicenses.getExpirationDate()))
				return isDateGreaterThanOrEqual30Days(cannabisLicenses.getExpirationDate()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showExplosiveExpiredLiceseNotification(String caseId){
		try {
			ExplosiveIssuanceOfLicence application = ExplosiveIssuanceOfLicenceLocalServiceUtil.getExplosiveLicIssBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showHsraExpiredLiceseNotification(String caseId){
		try {
			HSRAApplicationLicenseIssuance application = HSRAApplicationLicenseIssuanceLocalServiceUtil.getHSRAApplicationLicenseIssuanceByCI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiry()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiry()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showFactoriesExpiredLiceseNotification(String caseId){
		try {
			FactoriesCerticateOfRegis application = FactoriesCerticateOfRegisLocalServiceUtil.getFactoryCertifiResgiBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showMiicExpiredLiceseNotification(String caseId){
		try {
			MiicCertificateOfIssuance application = MiicCertificateOfIssuanceLocalServiceUtil.getMiic_RD_by_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showNcraExpiredLiceseNotification(String caseId){
		try {
			CertificateOfVerification application = CertificateOfVerificationLocalServiceUtil.getNcra_By_CaseId(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showMedicalExpiredLiceseNotification(String caseId){
		try {
			MedicalCertificateIssuance application = MedicalCertificateIssuanceLocalServiceUtil.getCertificateIssuance(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfLicenseExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfLicenseExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showQuarryExpiredLiceseNotification(String caseId){
		try {
			MiicCertificateOfIssuance application = MiicCertificateOfIssuanceLocalServiceUtil.getMiic_RD_by_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showNcbjExpiredLiceseNotification(String caseId){
		try {
			NcbjLicenceCertificate application = NcbjLicenceCertificateLocalServiceUtil.getNcbjLicenceCertiBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getExpirationDate()))
				return isDateGreaterThanOrEqual30Days(application.getExpirationDate()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showMiningExpiredLiceseNotification(String caseId){
		try {
			MiningApplicationCertificateIssuance application = MiningApplicationCertificateIssuanceLocalServiceUtil.getMiningApplicationCertificateIssuanceByCI(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(application.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showFireExpiredLiceseNotification(String caseId){
		try {
			FireBrigadeCertificate application = FireBrigadeCertificateLocalServiceUtil.getFireBrigadeCertificateByCaseId(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getExpirationDate()))
				return isDateGreaterThanOrEqual30Days(application.getExpirationDate()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	
	public static String showPharmaExpiredLiceseNotification(String caseId){
		try {
			PharmaApplicationFullLicense application = PharmaApplicationFullLicenseLocalServiceUtil.getPharmaFullLIcense(caseId);
			if (!isDateGreaterThanOrEqual60Days(application.getDueDate()))
				return isDateGreaterThanOrEqual30Days(application.getDueDate()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	
	public static String showManufacturingExpiredPermitNotification(String caseId){
		try {
			ManufacturingPermit manufacturingPermit= ManufacturingPermitLocalServiceUtil.getManufacturingPermitBY_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(manufacturingPermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(manufacturingPermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	
	public static String showTourismExpiredPermitNotification(String caseId){
		try {
			TourismPermit tourismPermit= TourismPermitLocalServiceUtil.getTourisPermitBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(tourismPermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(tourismPermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	/* public static String showHealthCareExpiredPermitNotification(String caseId){
		try {
			HealthCarePermit healthCarePermit= HealthCarePermitLocalServiceUtil.getHealthCareBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(healthCarePermit.get))
				return isDateGreaterThanOrEqual30Days(tourismPermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
			_log.error(e.getMessage());
		}
		return StringPool.BLANK;
	} */
	public static String showAgriultureExpiredPermitNotification(String caseId){
		try {
			AgriculturePermit agriculturePermit= AgriculturePermitLocalServiceUtil.getAgricultureBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(agriculturePermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(agriculturePermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showAcquireExpiredPermitNotification(String caseId){
		try {
			CreativePermit creativePermit=CreativePermitLocalServiceUtil.getCreativePermitBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(creativePermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(creativePermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showCreativeExpiredPermitNotification(String caseId){
		try {
			CreativePermit creativePermit=CreativePermitLocalServiceUtil.getCreativePermitBy_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(creativePermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(creativePermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showFarmExpiredPermitNotification(String caseId){
		try {
			FarmPermit farmPermit= FarmPermitLocalServiceUtil.getFarmBY_CI(caseId);
			if (!isDateGreaterThanOrEqual60Days(farmPermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(farmPermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static String showOsiFinanExpiredPermitNotification(String caseId){
		try {
			OsiApplicationPermit osiFcPermit= OsiApplicationPermitLocalServiceUtil.getOsiByCaseId(caseId);
			if (!isDateGreaterThanOrEqual60Days(osiFcPermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(osiFcPermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
		}
		return StringPool.BLANK;
	}
	public static int getExpirationSezStatusDocCount(long sezStatusApplicationId,ThemeDisplay themeDisplay) {
		DLFolder supportingDocumentsParentFolder;
		int expirationSezDocCount=0;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
					themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
					"SEZ Status Supported Documents");
			DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(sezStatusApplicationId));
			List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
			Date currentDate = new Date();
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				if(Validator.isNotNull(dlFileEntry.getExpirationDate())) {
					int result = currentDate.compareTo(dlFileEntry.getExpirationDate());
					if (result > 0) {
						expirationSezDocCount =expirationSezDocCount+1;
					}
				}
				
			}
		} catch (PortalException e) {
		}
		
		return expirationSezDocCount;
	}
	/*public static String showFilmExpiredPermitNotification(String caseId){
		try {
			Film
			if (!isDateGreaterThanOrEqual60Days(creativePermit.getDateOfExpiration()))
				return isDateGreaterThanOrEqual30Days(creativePermit.getDateOfExpiration()) ? "License expired in less than 30 Days" : "";
			else
				return "License expired in less than 60 Days";
		}catch (Exception e){
			_log.error(e.getMessage());
		}
		return StringPool.BLANK;
	}*/
	
	private static boolean isDateGreaterThanOrEqual60Days(Date inputDate) {
			// Get the current date
			Date currentDate = new Date();

			// Calculate the difference in milliseconds between the input date and the current date
			long differenceInMillis = inputDate.getTime() - currentDate.getTime();
			// Convert milliseconds to days
			long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
			// Check if the difference is less than or equal to 60 days
			return differenceInDays <= 60 && differenceInDays >30;
			
	}
	private static boolean isDateGreaterThanOrEqual30Days(Date inputDate) {
		// Get the current date
		Date currentDate = new Date();

		// Calculate the difference in milliseconds between the input date and the current date
		long differenceInMillis = inputDate.getTime() - currentDate.getTime();
		// Convert milliseconds to days
		long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
		// Check if the difference is less than or equal to 60 days
		return differenceInDays <= 30;
	}


}
