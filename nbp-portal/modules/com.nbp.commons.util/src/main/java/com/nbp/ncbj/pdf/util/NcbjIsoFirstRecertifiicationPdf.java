package com.nbp.ncbj.pdf.util;

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
import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.service.NcbjAddLocMultiSiteLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjBusinessDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NcbjIsoFirstRecertifiicationPdf {
	
	public static String getIsoFirstFormRecertificationPdf(long ncbjApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		NcbjApplication ncbjApplication=null;
		NcbjOrganizationDetail ncbjOrganizationDetail=null;
		List<NcbjBusinessDetail> quotationBusinDetail=null;
		
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		try {
			ncbjApplication= NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
		}catch (Exception e) {
		}
		try {
			ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			quotationBusinDetail= NcbjBusinessDetailLocalServiceUtil.getByNcbjBusiDetail(ncbjApplicationId);
		}catch (Exception e) {
		}
				
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "NCBJ Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(ncbjApplication.getNcbjApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"iso-9001-recertification-1");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"iso-9001-recertification");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, 
			new String[] {
			//Applicant details
					"[$OrganiZ$]", "[$Add$]","[$TeNum$]", "[$FNumber$]","[$EAdd$]", "[$HeadOrg$]","[$Pos2$]", "[$ContactName$]",
					"[$ContactEmail$]", "[$Posit$]","[$ProcessIn$]","[$HaveScope$]",
					
					"[$corporateGa$]",
					//45
					"[$PhysicalLoc1$]", "[$ProductsSer1$]", "[$ShiftsBusi1$]", "[$EmployeeNum1$]","[$HeadOff1$]", "[$NumTimeEm1$]", "[$PartTimeEmp1$]", "[$contractorsNum1$]", "[$workersNum1$]",
					"[$PhysicalLoc2$]", "[$ProductsSer2$]", "[$ShiftsBusi2$]", "[$EmployeeNum2$]","[$HeadOff2$]", "[$NumTimeEm2$]", "[$PartTimeEmp2$]", "[$contractorsNum2$]", "[$workersNum2$]",
					"[$PhysicalLoc3$]", "[$ProductsSer3$]", "[$ShiftsBusi3$]", "[$EmployeeNum3$]","[$HeadOff3$]", "[$NumTimeEm3$]", "[$PartTimeEmp3$]", "[$contractorsNum3$]", "[$workersNum3$]",
					"[$PhysicalLoc4$]", "[$ProductsSer4$]", "[$ShiftsBusi4$]", "[$EmployeeNum4$]","[$HeadOff4$]", "[$NumTimeEm4$]", "[$PartTimeEmp4$]", "[$contractorsNum4$]", "[$workersNum4$]",
					"[$PhysicalLoc5$]", "[$ProductsSer5$]", "[$ShiftsBusi5$]", "[$EmployeeNum5$]","[$HeadOff5$]", "[$NumTimeEm5$]", "[$PartTimeEmp5$]", "[$contractorsNum5$]", "[$workersNum5$]",
					
			},
			new String[] {
					        Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getNameOfOrganization())?ncbjOrganizationDetail.getNameOfOrganization():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getAddress())?ncbjOrganizationDetail.getAddress():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getTelephoneNumber())?ncbjOrganizationDetail.getTelephoneNumber():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getFaxNumber())?ncbjOrganizationDetail.getFaxNumber():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getEmailAddress())?ncbjOrganizationDetail.getEmailAddress():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getHeadOfOrganization())?ncbjOrganizationDetail.getHeadOfOrganization():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPosition())?ncbjOrganizationDetail.getPosition():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonName())?ncbjOrganizationDetail.getContactPersonName():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonEmailAddress())?ncbjOrganizationDetail.getContactPersonEmailAddress():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getContactPersonPosition())?ncbjOrganizationDetail.getContactPersonPosition():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getManagementSystem())?ncbjOrganizationDetail.getManagementSystem():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getDeterminedTheScope())?ncbjOrganizationDetail.getDeterminedTheScope():"",
							Validator.isNotNull(ncbjOrganizationDetail)&&Validator.isNotNull(ncbjOrganizationDetail.getPleaseStageTheScope())?ncbjOrganizationDetail.getPleaseStageTheScope():"",
							
							//45
									
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationAddressOne():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationProductTypes():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationApplicantShifts():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationEmpNum():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationHeadOffices():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationFullTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationPartTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationContractors():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>0)?quotationBusinDetail.get(0).getQuotationContractedWorker():"",

							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationAddressOne():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationProductTypes():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationApplicantShifts():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationEmpNum():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationHeadOffices():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationFullTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationPartTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationContractors():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>1)?quotationBusinDetail.get(1).getQuotationContractedWorker():"",
															
							
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationAddressOne():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationProductTypes():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationApplicantShifts():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationEmpNum():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationHeadOffices():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationFullTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationPartTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationContractors():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>2)?quotationBusinDetail.get(2).getQuotationContractedWorker():"",
											
							
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationAddressOne():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationProductTypes():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationApplicantShifts():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationEmpNum():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationHeadOffices():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationFullTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationPartTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationContractors():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>3)?quotationBusinDetail.get(3).getQuotationContractedWorker():"",
							
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationAddressOne():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationProductTypes():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationApplicantShifts():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationEmpNum():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationHeadOffices():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationFullTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationPartTimeEmploy():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationContractors():"",
							(quotationBusinDetail!=null)&&(quotationBusinDetail.size()>4)?quotationBusinDetail.get(4).getQuotationContractedWorker():"",
																									
									
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		/*if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String statementOfAffairs = "";
			String resolutionOfTheCorporation = "";
			String cojForm = "";
			
			
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Statement of Affairs (Form 3)")) {
					statementOfAffairs = fileName;
				}else if (title.equals("Resolution of the corporation authorizing the assignment")) {
					resolutionOfTheCorporation = fileName;
				}else if (title.equals("COJ’s Form 5 Notification Filing Receipt")) {
					cojForm = fileName;
				}
			}
			
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					"[$StatementAffairs$]","[$ResolutionCorporation$]","[$FilingReceipt$]"
				},
				new String[] {
						statementOfAffairs,	resolutionOfTheCorporation,cojForm
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
