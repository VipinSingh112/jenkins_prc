package com.nbp.ncra.pdf.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDateLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NcraApplicationPdf {
	public static String replaceSignatureForNCRA(long ncraApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature");
		List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(groupId,
				signatureFolder.getFolderId());
		String previewUrl = "";
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
			previewUrl = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, true);
		}
		return previewUrl;
	}

	
public static String ncraAppPdf(long ncraApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		NcraApplication ncraApplication=null;
		NcraApplicantDetailInfo applicantDetail=null;
		List<NcraVerifyWeighingDeviceInfo> weighingDeviceInfo=null;
		NcraVerifyWeighingDate dateWeighInfo=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForNcraApp = null;
		
		try {
			applicantDetail= NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
		}catch (Exception e) {
		}
		try {
			ncraApplication= NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
		}catch (Exception e) {
		}
		try {
			weighingDeviceInfo= NcraVerifyWeighingDeviceInfoLocalServiceUtil.getNcraVerify_By_DataList(ncraApplicationId);
			dateWeighInfo= NcraVerifyWeighingDateLocalServiceUtil.getNcraVerify_By_Date(ncraApplicationId);
		} catch (Exception e) {}
		
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCRA Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(ncraApplication.getNcraApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		try {
			signatureForNcraApp =replaceSignatureForNCRA(dateWeighInfo.getNcraApplicationId(), "Signature",
					themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), themeDisplay);
		} catch (Exception e) {}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"weighing-device");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"weighing-device-1");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
			"[$NameBusiness$]","[$Address$]","[$ContactPerson$]","[$TelephoneNumber$]","[$FaxNo$]","[$Email$]","[$Location$]",
			
			//Verification for Weighing Device
			"[$Device1$]","[$Manufacturer1$]","[$Serial1$]","[$Quantity1$]","[$Capacity1$]",
			"[$Device2$]","[$Manufacturer2$]","[$Serial2$]","[$Quantity2$]","[$Capacity2$]",
			"[$Device3$]","[$Manufacturer3$]","[$Serial3$]","[$Quantity3$]","[$Capacity3$]",
			"[$Device4$]","[$Manufacturer4$]","[$Serial4$]","[$Quantity4$]","[$Capacity4$]",
			"[$Device5$]","[$Manufacturer5$]","[$Serial5$]","[$Quantity5$]","[$Capacity5$]",
			
			//signature
			"[$SignatureSi$]","[$WeighingDate$]",
			
			},
			new String[] {
    		//Applicant details
    		Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantBusinessName())?applicantDetail.getApplicantBusinessName():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantAddress())?applicantDetail.getApplicantAddress():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantContact())?applicantDetail.getApplicantContact():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantTeleNum())?applicantDetail.getApplicantTeleNum():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantFaxNo())?applicantDetail.getApplicantFaxNo():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantEmailAddr())?applicantDetail.getApplicantEmailAddr():"",
			Validator.isNotNull(applicantDetail)&&Validator.isNotNull(applicantDetail.getApplicantLocation())?applicantDetail.getApplicantLocation():"",
					
			//Verification for Weighing Device
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>0)?weighingDeviceInfo.get(0).getTypeofDevice():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>0)?weighingDeviceInfo.get(0).getManufacturer():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>0)?weighingDeviceInfo.get(0).getSerialNumber():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>0)?weighingDeviceInfo.get(0).getQuantity():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>0)?weighingDeviceInfo.get(0).getMaximumCapacity():"",
					
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>1)?weighingDeviceInfo.get(1).getTypeofDevice():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>1)?weighingDeviceInfo.get(1).getManufacturer():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>1)?weighingDeviceInfo.get(1).getSerialNumber():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>1)?weighingDeviceInfo.get(1).getQuantity():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>1)?weighingDeviceInfo.get(1).getMaximumCapacity():"",
			
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>2)?weighingDeviceInfo.get(2).getTypeofDevice():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>2)?weighingDeviceInfo.get(2).getManufacturer():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>2)?weighingDeviceInfo.get(2).getSerialNumber():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>2)?weighingDeviceInfo.get(2).getQuantity():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>2)?weighingDeviceInfo.get(2).getMaximumCapacity():"",
			
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>3)?weighingDeviceInfo.get(3).getTypeofDevice():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>3)?weighingDeviceInfo.get(3).getManufacturer():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>3)?weighingDeviceInfo.get(3).getSerialNumber():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>3)?weighingDeviceInfo.get(3).getQuantity():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>3)?weighingDeviceInfo.get(3).getMaximumCapacity():"",
					
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>4)?weighingDeviceInfo.get(4).getTypeofDevice():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>4)?weighingDeviceInfo.get(4).getManufacturer():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>4)?weighingDeviceInfo.get(4).getSerialNumber():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>4)?weighingDeviceInfo.get(4).getQuantity():"",
			(weighingDeviceInfo!=null)&&(weighingDeviceInfo.size()>4)?weighingDeviceInfo.get(4).getMaximumCapacity():"",
					
			//signature Detail
					signatureForNcraApp,	
			Validator.isNotNull(dateWeighInfo)&&Validator.isNotNull(dateWeighInfo.getWeighingDate())?dateFormat.format(dateWeighInfo.getWeighingDate()):"",		
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		/*if (checkPdfDownloadWithoutDocument.equals("true")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String accoCertificate = "";
			String accoName = "";
			String accoStanding = "";
			String accoTax = "";
			String accoList = "";
			String accoLease = "";
			String accoInsurance = "";
			String accoApproval = "";
			String accoPublic = "";
			String accoPermit = "";
			String accoCopyFire = "";
			String accoSwimming = "";
			String accoArrangement = "";
			String accoSecurity = "";
			String accoResort = "";
			String accoBeach = "";
			String accoAid = "";
			String accoWork = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Copy of Certificate of Incorporation")) {
					accoCertificate = fileName;
				}else if (title.equals("Copy of Registration of Business Name(where applicable i.e. if Business Name is different from the name of the Company)")) {
					accoName = fileName;
				}else if (title.equals("Letter of Good Standing - Companies Office of Jamaica ")) {
					accoStanding = fileName;
				}else if (title.equals("Copy of Tax Registration Number (TRN)")) {
					accoTax = fileName;
				}else if (title.equals("List of Directors")) {
					accoList = fileName;
				}else if (title.equals("Copy of Title/Lease Agreement")) {
					accoLease = fileName;
				}else if (title.equals("Copy of Public Liability Insurance")) {
					accoInsurance = fileName;
				}else if (title.equals("Approval from local planning authority (e.g. KSAMC, St. James Municipal Corporation)")) {
					accoApproval = fileName;
				}else if (title.equals("Copy of Public Health Certificate")) {
					accoPublic = fileName;
				}else if (title.equals("Copy of Valid Food Handler's permit(s)")) {
					accoPermit = fileName;
				}else if (title.equals("Copy of Fire Certificate")) {
					accoCopyFire = fileName;
				}else if (title.equals("Copy of Public Health Swimming Pool Permit")) {
					accoSwimming = fileName;
				}else if (title.equals("Proper Security arrangements (Copy Security Contract/ Certified Personnel)")) {
					accoArrangement = fileName;
				}else if (title.equals("Copy of PSRA Certification for security company/ personnel contracted")) {
					accoSecurity = fileName;
				}else if (title.equals("Security Approval From Resort Area Division of the Jamaica Constabulary Force")) {
					accoResort = fileName;
				}else if (title.equals("Copy of Beach Licence from NEPA")) {
					accoBeach = fileName;
				}else if (title.equals("Copy of CPR, First Aid certificates and Lifeguard licences for employees assigned as Lifeguards")) {
					accoAid = fileName;
				}else if (title.equals("Copy of Work Permit")) {
					accoWork = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$AccommodationCertificate$]","[$AccommodationName$]","[$AccommodationStanding$]","[$AccommodationTax$]",
				"[$AccommodationList$]","[$AccommodationLease$]","[$AccommodationInsurance$]","[$AccommodationApproval$]",
				"[$AccommodationPublic$]","[$AccommodationPermit$]","[$AccommodationCopyFire$]","[$AccommodationSwimming$]",
				"[$AccommodationArrangement$]","[$AccommodationSecurity$]","[$AccommodationResort$]","[$AccommodationBeach$]",
				"[$AccommodationAid$]","[$AccommodationWork$]",
				},
				new String[] {
						accoCertificate, accoName, accoStanding,accoTax, accoList,accoLease,
						 accoInsurance,accoApproval,accoPublic,accoPermit,accoCopyFire,accoSwimming,
						 accoArrangement, accoSecurity, accoResort, accoBeach,accoAid,accoWork,
					});
			}
		}*/
		return pdfTemplate;
	}
	public static String getTemplateFromJournalArticlePDF(long groupId, String urlTitle) {
		JournalArticle journalArticle = null;
		String contentBody = StringPool.BLANK;
		try {
			journalArticle = JournalArticleLocalServiceUtil.getArticleByUrlTitle(groupId, urlTitle);
			JournalArticleDisplay articleDisplay = JournalArticleLocalServiceUtil.getArticleDisplay(groupId,
					journalArticle.getArticleId(), null, "en_US", null);
			if (Validator.isNotNull(articleDisplay)) {
				contentBody = articleDisplay.getContent();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return contentBody;
	}
}

