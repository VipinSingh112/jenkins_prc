package com.nbp.tpdco.pdf.util;

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
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;
import com.nbp.jtb.application.form.service.service.AttractionConCarriageInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddListDriverInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddListVehicleRegstLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JtbContractCarriage {
	public static String replaceSignatureForCarriage(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Carriage Signature of Owner Operator");
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
	public static String replaceSignatureForDriver(long jtbApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay, String counter) throws PortalException {
			DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
					"Driver's Signature"+counter);
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
	public static String getJtbOtherContractPdf(long jtbApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {

		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		JTBApplication jtbApplication = null;
		AttractionConCarriageInfo attractionCarriageInfo = null;
		List<JtbAddListVehicleRegst> listVehicleRegst = null;
		List<JtbAddListDriverInfo> listDriverInfo = null;
		JTBPaymentMethod jtbPayment=null;
		try{
			jtbPayment= JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
		}catch(Exception e){}
		String signatureOfOwnerOperator = null;
		String signatureDriver1 = null;
		String signatureDriver2 = null;
		String signatureDriver3 = null;
		String signatureDriver4 = null;
		String signatureDriver5 = null;

		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			attractionCarriageInfo = AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			listVehicleRegst = JtbAddListVehicleRegstLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
		}
		try {
			listDriverInfo = JtbAddListDriverInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
		} catch (Exception e) {
		}
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JTB Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(),
					String.valueOf(jtbApplication.getJtbApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
		}
		
		//signatures

		  try { 
			  signatureOfOwnerOperator=replaceSignatureForCarriage
					  (attractionCarriageInfo.getJtbApplicationId(), "Carriage Signature of Owner Operator", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay); 
			  } catch (Exception e) {}
		  try { 
			  signatureDriver1=replaceSignatureForDriver
					  (attractionCarriageInfo.getJtbApplicationId(), "Driver's Signature1", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"1"); 
		  } catch (Exception e) {}
		  try { 
			  signatureDriver2=replaceSignatureForDriver
					  (attractionCarriageInfo.getJtbApplicationId(), "Driver's Signature2", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"2"); 
		  } catch (Exception e) {}
		  try { 
			  signatureDriver3=replaceSignatureForDriver
					  (attractionCarriageInfo.getJtbApplicationId(), "Driver's Signature3", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"3"); 
		  } catch (Exception e) {}
		  try { 
			  signatureDriver4=replaceSignatureForDriver
					  (attractionCarriageInfo.getJtbApplicationId(), "Driver's Signature4", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"4"); 
		  } catch (Exception e) {}
		  try { 
			  signatureDriver5=replaceSignatureForDriver
					  (attractionCarriageInfo.getJtbApplicationId(), "Driver's Signature5", themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),themeDisplay,"5"); 
		  } catch (Exception e) {}
//pdf go in launch case
		if (checkPdfDownloadWithoutDocument.equals("false")) {
			pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-contractcarriage-1");
		} else {
			try {
				pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(), "other-contractcarriage");
			} catch (Exception e) {

			}
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
					// Contract Carriage Operator
					"[$CarriageOwnerName$]", "[$CarriageHomeAdd$]", "[$EmailCon$]", "[$TeleConNo$]", "[$ParishCon$]",
					"[$DateCon$]", "[$VehiclesFleetCon$]", "[$Organization$]",

//		List Vehicle Registration Information Being Applied
					"[$Year1$]", "[$Model1$]", "[$Plate1$]", "[$RegisExp1$]", "[$FitnessExp1$]", "[$Chassis1$]",
					"[$VehicleBased1$]", "[$InsuranceCom1$]", "[$PolicyNol$]", "[$ExpiryDate1$]",
					"[$Year2$]", "[$Model2$]", "[$Plate2$]", "[$RegisExp2$]", "[$FitnessExp2$]", "[$Chassis2$]",
					"[$VehicleBased2$]", "[$InsuranceCom2$]", "[$PolicyNo2$]", "[$ExpiryDate2$]", 
					"[$Year3$]", "[$Model3$]", "[$Plate3$]", "[$RegisExp3$]", "[$FitnessExp3$]", "[$Chassis3$]",
					"[$VehicleBased3$]", "[$InsuranceCom3$]", "[$PolicyNo3$]", "[$ExpiryDate3$]", 
					"[$Year4$]", "[$Model4$]", "[$Plate4$]", "[$RegisExp4$]", "[$FitnessExp4$]", "[$Chassis4$]",
					"[$VehicleBased4$]", "[$InsuranceCom4$]", "[$PolicyNo4$]", "[$ExpiryDate4$]",
					"[$Year5$]", "[$Model5$]", "[$Plate5$]", "[$RegisExp5$]", "[$FitnessExp5$]", "[$Chassis5$]",
					"[$VehicleBased5$]", "[$InsuranceCom5$]", "[$PolicyNo5$]", "[$ExpiryDate5$]", 
//List of Driver
					"[$DriverName1$]", "[$DriverLicence1$]", "[$ListExpiryDate1$]","[$Signature1$]",
					"[$DriverName2$]", "[$DriverLicence2$]","[$ListExpiryDate2$]", "[$Signature2$]",
					"[$DriverName3$]", "[$DriverLicence3$]", "[$ListExpiryDate3$]","[$Signature3$]",
					"[$DriverName4$]", "[$DriverLicence4$]", "[$ListExpiryDate4$]","[$Signature4$]",
					"[$DriverName5$]", "[$DriverLicence5$]", "[$ListExpiryDate5$]","[$Signature5$]",
					"[$ContractSign$]",
					"[$ConDate$]",
					},

					new String[] {
//							Contract Carriage Operator

							// Applicant details
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getOwnerName())? attractionCarriageInfo.getOwnerName(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getHomeAddress())? attractionCarriageInfo.getHomeAddress(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getEmail())? attractionCarriageInfo.getEmail(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getTelephone())? attractionCarriageInfo.getTelephone(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getParish())? attractionCarriageInfo.getParish(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getNewContractDate())? dateFormat.format(attractionCarriageInfo.getNewContractDate()): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getNewContarctVehiclesNo())? attractionCarriageInfo.getNewContarctVehiclesNo(): "",
			Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getContractOrganization())? attractionCarriageInfo.getContractOrganization(): "",
					
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstYear(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstModel(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstPlate(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? dateFormat.format(listVehicleRegst.get(0).getVehicleRegstExpDate()): "",	
			listVehicleRegst != null && listVehicleRegst.size() > 0? dateFormat.format(listVehicleRegst.get(0).getVehicleRegstFitnessDate()): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstChassis(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstBased(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstInsuranceCom(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? listVehicleRegst.get(0).getVehicleRegstPolicyNum(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 0? dateFormat.format(listVehicleRegst.get(0).getVehicleRegstExpiryDate()): "",	
		
					
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstYear(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstModel(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstPlate(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? dateFormat.format(listVehicleRegst.get(1).getVehicleRegstExpDate()): "",	
			listVehicleRegst != null && listVehicleRegst.size() > 1? dateFormat.format(listVehicleRegst.get(1).getVehicleRegstFitnessDate()): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstChassis(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstBased(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstInsuranceCom(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? listVehicleRegst.get(1).getVehicleRegstPolicyNum(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 1? dateFormat.format(listVehicleRegst.get(1).getVehicleRegstExpiryDate()): "",	
		
					
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstYear(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstModel(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstPlate(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? dateFormat.format(listVehicleRegst.get(2).getVehicleRegstExpDate()): "",	
			listVehicleRegst != null && listVehicleRegst.size() > 2? dateFormat.format(listVehicleRegst.get(2).getVehicleRegstFitnessDate()): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstChassis(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstBased(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstInsuranceCom(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? listVehicleRegst.get(2).getVehicleRegstPolicyNum(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 2? dateFormat.format(listVehicleRegst.get(2).getVehicleRegstExpiryDate()): "",
		
					
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstYear(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstModel(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstPlate(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? dateFormat.format(listVehicleRegst.get(3).getVehicleRegstExpDate()): "",	
			listVehicleRegst != null && listVehicleRegst.size() > 3? dateFormat.format(listVehicleRegst.get(3).getVehicleRegstFitnessDate()): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstChassis(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstBased(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstInsuranceCom(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? listVehicleRegst.get(3).getVehicleRegstPolicyNum(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 3? dateFormat.format(listVehicleRegst.get(3).getVehicleRegstExpiryDate()): "",
		
					
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstYear(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstModel(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstPlate(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? dateFormat.format(listVehicleRegst.get(4).getVehicleRegstExpDate()): "",	
			listVehicleRegst != null && listVehicleRegst.size() > 4? dateFormat.format(listVehicleRegst.get(4).getVehicleRegstFitnessDate()): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstChassis(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstBased(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4	? listVehicleRegst.get(4).getVehicleRegstInsuranceCom(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? listVehicleRegst.get(4).getVehicleRegstPolicyNum(): "",
			listVehicleRegst != null && listVehicleRegst.size() > 4? dateFormat.format(listVehicleRegst.get(4).getVehicleRegstExpiryDate()): "",
			
					
					
			listDriverInfo != null && listDriverInfo.size() > 0 ? listDriverInfo.get(0).getDriverName(): "",
			listDriverInfo != null && listDriverInfo.size() > 0? listDriverInfo.get(0).getDriverLicence(): "",
			listDriverInfo != null && listDriverInfo.size() > 0? dateFormat.format(listDriverInfo.get(0).getDriverExpiryDate()): "",
			signatureDriver1,
			
			listDriverInfo != null && listDriverInfo.size() > 1 ? listDriverInfo.get(1).getDriverName(): "",
			listDriverInfo != null && listDriverInfo.size() > 1? listDriverInfo.get(1).getDriverLicence(): "",
			listDriverInfo != null && listDriverInfo.size() > 1? dateFormat.format(listDriverInfo.get(1).getDriverExpiryDate()): "",	
			signatureDriver2,
			
			listDriverInfo != null && listDriverInfo.size() > 2 ? listDriverInfo.get(2).getDriverName(): "",
			listDriverInfo != null && listDriverInfo.size() > 2? listDriverInfo.get(2).getDriverLicence(): "",
			listDriverInfo != null && listDriverInfo.size() > 2? dateFormat.format(listDriverInfo.get(2).getDriverExpiryDate()): "",	
			signatureDriver3,
			
			listDriverInfo != null && listDriverInfo.size() > 3 ? listDriverInfo.get(3).getDriverName(): "",
			listDriverInfo != null && listDriverInfo.size() > 3? listDriverInfo.get(3).getDriverLicence(): "",
			listDriverInfo != null && listDriverInfo.size() > 3? dateFormat.format(listDriverInfo.get(3).getDriverExpiryDate()): "",	
			signatureDriver4,
			
			listDriverInfo != null && listDriverInfo.size() > 4 ? listDriverInfo.get(4).getDriverName(): "",
			listDriverInfo != null && listDriverInfo.size() > 4? listDriverInfo.get(4).getDriverLicence(): "",
			listDriverInfo != null && listDriverInfo.size() > 4? dateFormat.format(listDriverInfo.get(4).getDriverExpiryDate()): "",
			signatureDriver5,
			
	     signatureOfOwnerOperator,
         Validator.isNotNull(attractionCarriageInfo)&& Validator.isNotNull(attractionCarriageInfo.getOwnerSignDate())? dateFormat.format(attractionCarriageInfo.getOwnerSignDate()): "",
		
		});
		} catch (Exception e) {
		}
		
		if (!checkPdfDownloadWithoutDocument.equals("false")) {
			String fileName = null;
			String title = null;
			String copyOfCurrent = null;
			String copyRoad = null;
			String copyOfCurrentFitness = null;
			String copyOfDriver = null;
			String allOwnersAndDrivers = null;
			String oneRecent = null;
			String policeRecommendation = null;
			String membershipLetter = null;
			String independentOperators = null;
			String transportAuthority = null;
			String proofOfPayment = null;
			
			String TrnNo=null;
			String jamaicaList=null;
			String fleetList=null;
			String backPage=null;
			
			
			for (DLFileEntry supportDocEntry : supportinfDocFileEntries) {
				try {
					fileEntry = DLAppLocalServiceUtil.getFileEntry(supportDocEntry.getFileEntryId());
				} catch (PortalException e) {
					e.printStackTrace();
				}
				fileName = fileEntry.getFileName();
				title = fileEntry.getTitle();
				if (title.equals("Copy of Current Vehicle Insurance.")) {
					copyOfCurrent = fileName;
				} else if (title.equals("Copy Road Licence for vehicle.")) {
					copyRoad = fileName;
				} else if (title.equals("Copy of Current Fitness certificate and Motor Vehicle registration.")) {
					copyOfCurrentFitness = fileName;
				} else if (title.equals("Copy of Driver’s Licence (front page)")) {
					copyOfDriver = fileName;
				} else if (title.equals(
						"All Owners and Drivers MUST be Team Jamaica Certified (if owner does not drive then letter must be submitted stating the same and the letter is to be certified by a JP/Attorney-At-Law).")) {
					allOwnersAndDrivers = fileName;
				} else if (title.equals("One (1) recent Passport size photograph (For Owner and Driver (s)")) {
					oneRecent = fileName;
				} else if (title.equals(
						"Police recommendation letter (Inspector and above) or Police Report (Owner / Driver)")) {
					policeRecommendation = fileName;
				} else if (title.equals(
						"Membership letter from Association for owner and driver stating membership number (JUTA JCAL MAXI) for all applicants who are members of an Association.")) {
					membershipLetter = fileName;
				} else if (title
						.equals("Independent Operators must submit current contract from JTB licensed entity")) {
					independentOperators = fileName;
				} else if (title.equals("Transport Authority of Jamaica /TPDCo’s recommended assessment report")) {
					transportAuthority = fileName;
				} else if (title.equals("Proof of payment for licence (e.g. bank voucher or payment receipt)")) {
					proofOfPayment = fileName;
				} else if (title.equals("Tax Registration Number (TRN)")) {
					TrnNo = fileName;
				}else if (title.equals("Team Jamaica Certification (List)")) {
					jamaicaList = fileName;
				}else if (title.equals("FLEET LISTING")) {
					fleetList = fileName;
				}else if (title.equals("Copy of Driver’s Licence (back page)")) {
					backPage = fileName;
				}
			}
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
//for the document 
					"[$VehicleInsurance$]", "[$RoadLicence$]", "[$MotorVehicle$]", "[$DriverCopy$]",
					"[$JamaicaCertified$]", "[$PhotographSize$]", "[$PoliceReport$]", "[$Membership$]",
					"[$IndependentLicence$]", "[$TransportReport$]", "[$PaymentProof$]",
					
					"[$NoTrn$]","[$ListJamaica$]", "[$ListFleet$]",
					"[$BackPage$]",
					"[$PaymentMethCarR$]",},
					new String[] { copyOfCurrent, copyRoad, copyOfCurrentFitness, copyOfDriver, allOwnersAndDrivers,
							oneRecent, policeRecommendation, membershipLetter, independentOperators, transportAuthority,
							proofOfPayment,TrnNo,jamaicaList,fleetList,
							backPage,
							Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"",
					});
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