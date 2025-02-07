package com.nbp.medical.facilities.pdf.util;

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
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppliInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesComDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeTwoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesMaterHomeLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseStaffLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesQNurseLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesSignInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalNurseStaffPremisesLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LongTermIndiResidentialCareFacilitiesPdf {
	public static String replaceSignatureForComMedical(long medicalApplicationId, String folderName, long groupId,
	long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
	DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
			"Signature of Applicant Employee");
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
	public static String getResidentialCareFacilitiesPdf(long medicalApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		System.out.println("checkPdfDownloadWithoutDocument*******************"+checkPdfDownloadWithoutDocument);
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		MedicalFacilitiesApp medicalApplication=null;
		List<MedicalFacilitiesAppliInfo> applicantDetails=null;
		List<MedicalFacilitiesComDetail> companyDetails=null;
		MedicalFacilitiesHomeInfo homeCarriedName=null;
		List<MedicalFacilitiesHomeTwo> patientCount=null;
		List<MedicalFacilitiesNurseStaff> nursingStaff=null;
		List<MedicalFacilitiesMaterHome> maternityHome=null;
		MedicalFacilitiesSignInfo signatureInfoCom=null;
		MedicalFaciltiesPayment medicalPayment=null;
		List<MedicalFacilitiesNurseStaff> medicalFacilitiesNurseStaff = null;
		MedicalFacilitiesQNurse medicalFacilitiesQNurse=null;
		List<MedicalFacilitiesMaterHome> maternityHomeInfo = null;
		MedicalNurseStaffPremises medStaffPremises=null;

		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		//Signatures
		String signatureForComMedical = null;

		try {
			medicalApplication= MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesApp(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			applicantDetails= MedicalFacilitiesAppliInfoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			companyDetails= MedicalFacilitiesComDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			homeCarriedName= MedicalFacilitiesHomeInfoLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			patientCount= MedicalFacilitiesHomeTwoLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			nursingStaff= MedicalFacilitiesNurseStaffLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			maternityHome= MedicalFacilitiesMaterHomeLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			signatureInfoCom = MedicalFacilitiesSignInfoLocalServiceUtil.getMedicalFacilitiesById(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			medicalPayment = MedicalFaciltiesPaymentLocalServiceUtil.getMedicalAppById(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			medicalFacilitiesNurseStaff = MedicalFacilitiesNurseStaffLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		}catch (Exception e) {
		}
		try {
			medicalFacilitiesQNurse=MedicalFacilitiesQNurseLocalServiceUtil.getMedicalFacilitiesById(medicalApplicationId);
		} catch (Exception e) {
		}
		try {
			maternityHomeInfo= MedicalFacilitiesMaterHomeLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
		} catch (Exception e) {
		}
		try {
			medStaffPremises=MedicalNurseStaffPremisesLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
		} catch (Exception e) {
		}

		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Medical Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(medicalApplication.getMedicalFacilitiesAppId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//signatures
		
		  try { 
			  signatureForComMedical =replaceSignatureForComMedical(signatureInfoCom.getMedicalFacilitiesAppId(), "Signature of Applicant Employee", themeDisplay.getScopeGroupId(), 
				  supportingDocumentsFolder.getFolderId(),  themeDisplay); 
		  } catch (Exception e) {}
		 

		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"residential-care-facilities-company-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"medical-facilities-residential-care-facilities");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
					"[$ApplicantNameD1$]","[$Telephone1$]","[$EmailAdd1$]","[$Address1$]","[$Nationality1$]",
					"[$ApplicantNameD2$]","[$Telephone2$]","[$EmailAdd2$]","[$Address2$]","[$Nationality2$]",
					"[$ApplicantNameD3$]","[$Telephone3$]","[$EmailAdd3$]","[$Address3$]","[$Nationality3$]",
					"[$ApplicantNameD4$]","[$Telephone4$]","[$EmailAdd4$]","[$Address4$]","[$Nationality4$]",
					"[$ApplicantNameD5$]","[$Telephone5$]","[$EmailAdd5$]","[$Address5$]","[$Nationality5$]",
					
					"[$HomeTitle$]","[$AddHome$]","[$TelNumHome$]","[$EmailAddressT$]","[$DescriptionBrief$]","[$BusinessOther$]",
					"[$MaternityNumO$]","[$PatientOther$]",
					
					"[$StaffName1$]","[$Qualifications1$]",
					"[$StaffName2$]","[$Qualifications2$]",
					"[$StaffName3$]","[$Qualifications3$]",
					"[$StaffName4$]","[$Qualifications4$]",
					"[$StaffName5$]","[$Qualifications5$]",
					
					"[$StaffLive$]",
					
					"[$NumberEm$]","[$ParticularsEM$]","[$FeesChargedPa$]","[$ApplicantAddressHomeNur$]",
					"[$MedicalDate$]","[$SignatureMed$]"
					
			},
			new String[] {
			//Applicant details
				(applicantDetails!=null)&&(applicantDetails.size()>0)?applicantDetails.get(0).getApplicantName():"",
				(applicantDetails!=null)&&(applicantDetails.size()>0)?applicantDetails.get(0).getAppliTelephoneNumber():"",
				(applicantDetails!=null)&&(applicantDetails.size()>0)?applicantDetails.get(0).getAppliEmailAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>0)?applicantDetails.get(0).getAppliAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>0)?applicantDetails.get(0).getAppliNationality():"",
						
				(applicantDetails!=null)&&(applicantDetails.size()>1)?applicantDetails.get(1).getApplicantName():"",
				(applicantDetails!=null)&&(applicantDetails.size()>1)?applicantDetails.get(1).getAppliTelephoneNumber():"",
				(applicantDetails!=null)&&(applicantDetails.size()>1)?applicantDetails.get(1).getAppliEmailAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>1)?applicantDetails.get(1).getAppliAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>1)?applicantDetails.get(1).getAppliNationality():"",
						
				(applicantDetails!=null)&&(applicantDetails.size()>2)?applicantDetails.get(2).getApplicantName():"",
				(applicantDetails!=null)&&(applicantDetails.size()>2)?applicantDetails.get(2).getAppliTelephoneNumber():"",
				(applicantDetails!=null)&&(applicantDetails.size()>2)?applicantDetails.get(2).getAppliEmailAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>2)?applicantDetails.get(2).getAppliAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>2)?applicantDetails.get(2).getAppliNationality():"",
				
				(applicantDetails!=null)&&(applicantDetails.size()>3)?applicantDetails.get(3).getApplicantName():"",
				(applicantDetails!=null)&&(applicantDetails.size()>3)?applicantDetails.get(3).getAppliTelephoneNumber():"",
				(applicantDetails!=null)&&(applicantDetails.size()>3)?applicantDetails.get(3).getAppliEmailAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>3)?applicantDetails.get(3).getAppliAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>3)?applicantDetails.get(3).getAppliNationality():"",
				
				(applicantDetails!=null)&&(applicantDetails.size()>4)?applicantDetails.get(4).getApplicantName():"",
				(applicantDetails!=null)&&(applicantDetails.size()>4)?applicantDetails.get(4).getAppliTelephoneNumber():"",
				(applicantDetails!=null)&&(applicantDetails.size()>4)?applicantDetails.get(4).getAppliEmailAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>4)?applicantDetails.get(4).getAppliAddress():"",
				(applicantDetails!=null)&&(applicantDetails.size()>4)?applicantDetails.get(4).getAppliNationality():"",
						
						
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getNameOfOwner())?homeCarriedName.getNameOfOwner():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getHomeAddress())?homeCarriedName.getHomeAddress():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getHomeTelephoneNumber())?homeCarriedName.getHomeTelephoneNumber():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getHomeEmailAddress())?homeCarriedName.getHomeEmailAddress():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getDescription())?homeCarriedName.getDescription():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getOtherBusinessDetails())?homeCarriedName.getOtherBusinessDetails():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getMaternityPatients())?homeCarriedName.getMaternityPatients():"",
				Validator.isNotNull(homeCarriedName)&&Validator.isNotNull(homeCarriedName.getOtherPatients())?homeCarriedName.getOtherPatients():"",
																								
				(nursingStaff!=null)&&(nursingStaff.size()>0)?nursingStaff.get(0).getNStaffName():"",
				(nursingStaff!=null)&&(nursingStaff.size()>0)?nursingStaff.get(0).getNStaffQualification():"",
				
				(nursingStaff!=null)&&(nursingStaff.size()>1)?nursingStaff.get(1).getNStaffName():"",
				(nursingStaff!=null)&&(nursingStaff.size()>1)?nursingStaff.get(1).getNStaffQualification():"",
						
				(nursingStaff!=null)&&(nursingStaff.size()>2)?nursingStaff.get(2).getNStaffName():"",
				(nursingStaff!=null)&&(nursingStaff.size()>2)?nursingStaff.get(2).getNStaffQualification():"",
				
				(nursingStaff!=null)&&(nursingStaff.size()>3)?nursingStaff.get(3).getNStaffName():"",
				(nursingStaff!=null)&&(nursingStaff.size()>3)?nursingStaff.get(3).getNStaffQualification():"",
				
				(nursingStaff!=null)&&(nursingStaff.size()>4)?nursingStaff.get(4).getNStaffName():"",
				(nursingStaff!=null)&&(nursingStaff.size()>4)?nursingStaff.get(4).getNStaffQualification():"",
						
				Validator.isNotNull(medStaffPremises)&&Validator.isNotNull(medStaffPremises.getNursingStaffCategory())?medStaffPremises.getNursingStaffCategory():"",
						
				Validator.isNotNull(signatureInfoCom)&&Validator.isNotNull(signatureInfoCom.getNumber())?signatureInfoCom.getNumber():"",		
				Validator.isNotNull(signatureInfoCom)&&Validator.isNotNull(signatureInfoCom.getParticulars())?signatureInfoCom.getParticulars():"",		
				Validator.isNotNull(signatureInfoCom)&&Validator.isNotNull(signatureInfoCom.getChargedFees())?signatureInfoCom.getChargedFees():"",		
				Validator.isNotNull(signatureInfoCom)&&Validator.isNotNull(signatureInfoCom.getAddressOfOtherNHome())?signatureInfoCom.getAddressOfOtherNHome():"",
						Validator.isNotNull(signatureInfoCom)&&Validator.isNotNull(signatureInfoCom.getEnteredDate())?dateFormat.format(signatureInfoCom.getEnteredDate()):"",
				signatureForComMedical
			
				//(applicantDetails!=null)&&(applicantDetails.size()>1)?dateFormat.format(applicantDetails.get(1).getPeriodOfImportationFrom()):"",
				//(applicantDetails!=null)&&(applicantDetails.size()>0)?dateFormat.format(applicantDetails.get(0).getPeriodOfImportationTo()):"",
			
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		if(!checkPdfDownloadWithoutDocument.equals("false")){
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String proofPayment = "";
			String tcc = "";
			String trn = "";
			String comResgt = "";
			String comLetter = "";
			String comFloor = "";
			String comMunicipal = "";
			String comConstruct = "";
			String comFire = "";
			String comFees = "";
			String comConnect = "";
			String comEmp = "";
			String comNationality = "";
			String comRnRm = "";
			String comQuali = "";
			String comCertifiedCopy = "";
			String comPhysician = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					
				} catch (Exception e) {}
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
				if(title.equals("Proof of Payment Application Fee receipt")) {
					proofPayment = fileName;
				}else if (title.equals("Tax Compliance Certificate (TCC)")) {
					tcc = fileName;
				}else if (title.equals("Tax Registration Number (TRN)")) {
					trn = fileName;
				}else if (title.equals("Business Registration Documents From The Companies Office Of Jamaica")) {
					comResgt = fileName;
				}else if (title.equals("Letter Of Good Standing Companies Office")) {
					 comLetter = fileName;
				}else if (title.equals("Floor Plan of The Facility")) {
					comFloor = fileName;
				}else if (title.equals("Local Municipal Corporation Approval For Change Of Building Use Or No Objection Letter Or Building Permit For Intended Facility")) {
					comMunicipal = fileName;
				}else if (title.equals("Description of situation construction accommodation and any other business transacted on the premises")) {
					comConstruct = fileName;
				}else if (title.equals("Fire Safety Certificate From The Jamaica Fire Brigade")) {
					comFire = fileName;
				}else if (title.equals("Fees charged to patients")) {
					comFees = fileName;
				}else if (title.equals("Number And Particulars Of Any Person Of Alien Nationality Employed In Connection With The Home")) {
					comConnect = fileName;
				}else if (title.equals("Category Of Staff Being Employed To Facility")) {
					comEmp = fileName;
				}else if (title.equals("Number And Nationality Of Any Alien Employed To Facility")) {
					comNationality = fileName;
				}else if (title.equals("Name And Qualification Of Registered Nurse (RN) And Or Midwife (Rm) Supervising Patient Care")) {
					comRnRm = fileName;
				}else if (title.equals("Qualification licence And Registration licence Of Supervising Registered Nurse If The Home Is Under The Charge Of A Qualification Medical Practitioner Or Qualified Registered Nurse RN")) {
					comQuali = fileName;
				}else if (title.equals("Certified Copy Of The Resolution Authorizing A Matron Superintendent Or Other Responsibility Person To Act On Its Behalf. (Only Required For Non - Incorporated Society Association Or Body)")) {
					comCertifiedCopy = fileName;
				}else if (title.equals("Qualification Licence And Registration Licence Of Resident Physician (Only Required For Non-Residential care facilities)")) {
					comPhysician = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$PaymentRecipt$]","[$ComplianceTcc$]","[$TaxTrn$]","[$BusinessFrom$]","[$CompaniesOffice$]",
					"[$FacilityPlan$]","[$MunicipalCorporation$]","[$ConstructionDescription$]","[$SafetyCertificateOf$]",
					"[$CertificateOf$]","[$AlienNationality$]","[$CategoryStaff$]","[$NationalityEmployed$]","[$QualificationOfRn$]",
					"[$QualificationLicence$]","[$ResolutionCopy$]","[$ResidentPhysician$]",

				},
				new String[] {
						proofPayment,tcc,trn,comResgt,comLetter,comFloor,comMunicipal,comConstruct, comFire,comFees,
						 comConnect,comEmp,comNationality,comRnRm,comQuali,comCertifiedCopy,comPhysician,
						 
					});
			}
			try {
				pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {"[$PaymentMethodMh$]" },
						new String[] { 
			Validator.isNotNull(medicalPayment)&&Validator.isNotNull(medicalPayment.getPaymentMethod())?medicalPayment.getPaymentMethod():""
						});
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
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
