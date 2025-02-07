package com.nbp.jadsc.pdf.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.model.JournalArticleDisplay;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCChecklist;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistAddLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

public class JadscThirdTransationPublicVersionPdf {
	
	public static String jadscThirdTransationPublicVersionPdf(long jadscApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
		String pdfTemplate = StringPool.BLANK;
		JADSCApplication jadscApplication=null;
		List<JADSCChecklistAdd> jadscChecklistAdd=null;
		List<JADSCChecklist> checklist = null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;

		
		try {
			jadscApplication= JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);	
		}catch (Exception e) {
		}
		try {
			jadscChecklistAdd=JADSCChecklistAddLocalServiceUtil.getAppIdJADSC(jadscApplicationId);
		}catch (Exception e) {
		}
		try {
			checklist=JADSCChecklistLocalServiceUtil.getJADSC_ByAppId(jadscApplicationId);
		}catch (Exception e) {
		}
	
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JADSC Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(jadscApplication.getJadscApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();}
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"adsc-public-version-1");
				} else {
					try {
						pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"adsc-public-version");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate =  
					StringUtil.replace(pdfTemplate, 
			new String[] {
			
			
//			//Specific Activities
			"[$JamaicanProducer$]","[$Description$]",
			"[$Producergood$]","[$DescriptionId$]",
			"[$DomesticValue$]","[$DescriptionValue$]",
			"[$Consideration$]","[$DescriptionUnder$]",
			"[$ExportUnder$]","[$DescriptionOrigin$]",
			"[$ForProducer$]","[$DescriptionExporter$]",
			"[$InformationPrices$]","[$DescriptionInfo$]",
			"[$Appropriate$]","[$DescriptionPrices$]",
			"[$ImportedVolume$]","[$DescriptionJamaica$]",
			"[$EffecctsGood$]","[$DescriptionEffect$]",
			"[$ConsequentImports$]","[$DescriptionImpact$]",
			"[$FactorsDomestic$]","[$DescriptionOther$]",
			"[$InformationVolume$]","[$DescriptionFores$]",
			"[$Industry$]","[$DescriptionAdjust$]",
			"[$Duties$]","[$DescriptionSeeking$]",
			
//			//Add Items to the Checklist:
      		"[$Item1$]","[$Item2$]","[$Item3$]","[$Item4$]","[$Item5$]",
		
			
	},
			new String[] {
			//checklist
								 		 
		(checklist!=null)&&(checklist.size()>14)?checklist.get(14).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>14)?checklist.get(14).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>13)?checklist.get(13).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>13)?checklist.get(13).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>12)?checklist.get(12).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>12)?checklist.get(12).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>11)?checklist.get(11).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>11)?checklist.get(11).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>10)?checklist.get(10).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>10)?checklist.get(10).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>9)?checklist.get(9).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>9)?checklist.get(9).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>8)?checklist.get(8).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>8)?checklist.get(8).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>7)?checklist.get(7).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>7)?checklist.get(7).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>6)?checklist.get(6).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>6)?checklist.get(6).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>5)?checklist.get(5).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>5)?checklist.get(5).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>4)?checklist.get(4).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>4)?checklist.get(4).getDescription():"",	
		
		(checklist!=null)&&(checklist.size()>3)?checklist.get(3).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>3)?checklist.get(3).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>2)?checklist.get(2).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>2)?checklist.get(2).getDescription():"",
		
		(checklist!=null)&&(checklist.size()>1)?checklist.get(1).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>1)?checklist.get(1).getDescription():"",
		
		 (checklist!=null)&&(checklist.size()>0)?checklist.get(0).getSelectedChecklistValues():"",	
		(checklist!=null)&&(checklist.size()>0)?checklist.get(0).getDescription():"",
		
				
			//Add Items to the Checklist:
				 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>0)?jadscChecklistAdd.get(0).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>1)?jadscChecklistAdd.get(1).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>2)?jadscChecklistAdd.get(2).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>3)?jadscChecklistAdd.get(3).getAddItem():"",
			 
			 (jadscChecklistAdd!=null)&&(jadscChecklistAdd.size()>4)?jadscChecklistAdd.get(4).getAddItem():"",
			 
							 
							 
							 
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
		
		
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String title = "";
			String fileName = "";
			if (Validator.isNotNull(supportingDocumentsFolder)) {
			String proposal = "";
			for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
				try {
					fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
					fileName = fileEntry.getFileName();
					title=fileEntry.getTitle();
				} catch (Exception e) {}
				if(title.equals("Application Proposal Document")) {
					proposal = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
				"[$ApplicationProposalDocument$]",
				},
				new String[] {
						proposal, 
					});
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

