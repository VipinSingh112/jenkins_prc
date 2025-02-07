
package com.nbp.janaac.pdf.util;

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
import com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;
import com.nbp.janaac.application.form.service.model.AccInsBodiesOtherReq;
import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;
import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddInsApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoFirst;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;
import com.nbp.janaac.application.form.service.model.AddPhyResourceFirst;
import com.nbp.janaac.application.form.service.model.AddPhyResourceSec;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;
import com.nbp.janaac.application.form.service.service.AccInsBodiesManageSysLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOrganizationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesOtherReqLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccInsBodiesPhyResourceLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AccMediLabApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddInsApplicationInfoLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoSecondLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddInsOrgInfoThirdLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddPhyResourceFirstLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.AddPhyResourceSecLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationLocalServiceUtil;
import com.nbp.janaac.application.form.service.service.JanaacApplicationPaymentLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AccreditationInspectionBodiesPdf {
	
	public static String replaceSignatureAuthorizedJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Third Cat Authorized");
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
	public static String replaceCompanySealJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Third Cat Company stamps");
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
	
	
	public static String replacerepresentativeSignatureJanaac(long janaacApplicationId, String folderName, long groupId,
			long supportingDocumentsFolderId, ThemeDisplay themeDisplay) throws PortalException {
		DLFolder signatureFolder = DLFolderLocalServiceUtil.getFolder(groupId, supportingDocumentsFolderId,
				"Signature of Third Cat Applicant representative");
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
	


	
public static String janaacAccreditationInspectionCatPdf(long janaacApplicationId, ThemeDisplay themeDisplay,
			String checkPdfDownloadWithoutDocument) {
	
	
		String pdfTemplate = StringPool.BLANK;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		
		JanaacApplication janaacApplication=null;
		AccMediLabApplicationInfo mediLabApplicationInfo = null;
		List<AddInsApplicationInfo> inspApplicationInfo = null;
		AccInsBodiesOrganization insBodiesOrganization=null;
		List<AddInsOrgInfoFirst> organFirst = null;
		List<AddInsOrgInfoSecond> OrgInfoSecond = null;
		List<AddInsOrgInfoThird> orgInfoThird = null;
		List<AddPhyResourceFirst> phyResourceFirst = null;
		List<AddPhyResourceSec> phyResourceSecond = null;
		AccInsBodiesPhyResource InsBodiesPhyResource=null;
		AccInsBodiesManageSys InsBodiesManageSys=null;
		AccInsBodiesOtherReq insBodiesOtherReq=null;
		JanaacApplicationPayment payment=null;
		
		//folder
		List<DLFileEntry> supportinfDocFileEntries = new ArrayList<DLFileEntry>();
		DLFolder supportingDocumentsFolder = null;
		DLFolder supportingDocumentsParentFolder = null;
		FileEntry fileEntry = null;
		
		 //Signatures 
		String signatureForAuthorizedPersonnel = null;
		String signaturecompanySeal=null;
		String signaturerepresentative=null;
	
		try {
			janaacApplication=JanaacApplicationLocalServiceUtil.getJanaacApplication(janaacApplicationId);
		}catch (Exception e) {
		}
		try {
			mediLabApplicationInfo= AccMediLabApplicationInfoLocalServiceUtil.getApplicantInfo(janaacApplicationId);            
		}catch (Exception e) {
		}
		try {
			inspApplicationInfo= AddInsApplicationInfoLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);          
		}catch (Exception e) {
		}
		try {
			insBodiesOrganization=AccInsBodiesOrganizationLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);          
		}catch (Exception e) {
		}
		try {
			organFirst=AddInsOrgInfoFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);        
		}catch (Exception e) {
		}
		
		try {
			OrgInfoSecond=AddInsOrgInfoSecondLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);        
		}catch (Exception e) {
		}
		try {
			orgInfoThird=AddInsOrgInfoThirdLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);       
		}catch (Exception e) {
		}
		try {
			phyResourceFirst=AddPhyResourceFirstLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);       
		}catch (Exception e) {
		}
		
		try {
			phyResourceSecond=AddPhyResourceSecLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);     
		}catch (Exception e) {
		}
		try {
			InsBodiesPhyResource=AccInsBodiesPhyResourceLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);    
		}catch (Exception e) {
		}
		try {
			InsBodiesManageSys=AccInsBodiesManageSysLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);   
		}catch (Exception e) {
		}
		try {
			insBodiesOtherReq=AccInsBodiesOtherReqLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);  
		}catch (Exception e) {
		}
		try {
			payment =JanaacApplicationPaymentLocalServiceUtil.getJanaacById(janaacApplicationId);
		}catch (Exception e) {
		}
	
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "JANAAC Supported Documents");
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(janaacApplication.getJanaacApplicationId()));
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		 //signatures
		  try { 
			  signatureForAuthorizedPersonnel =replaceSignatureAuthorizedJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Third Cat Authorized", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturecompanySeal =replaceCompanySealJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Third Cat Company stamps", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}
		  
		  try { 
			  signaturerepresentative =replacerepresentativeSignatureJanaac(janaacApplication.getJanaacApplicationId(), "Signature of Third Cat Applicant representative", themeDisplay.getScopeGroupId(),
				  supportingDocumentsFolder.getFolderId(),themeDisplay);
		  } catch (Exception e) {}

		 
		
		//pdf go in launch case
				if (checkPdfDownloadWithoutDocument.equals("false")) {
					pdfTemplate = getTemplateFromJournalArticlePDF(themeDisplay.getScopeGroupId(),
							"weighing-device");
				} else {
					try {
					pdfTemplate = getTemplateFromJournalArticlePDF
							(themeDisplay.getScopeGroupId(),
							"inspection-bodies");
					}catch (Exception e) {
						
					}
				}
		try {
			pdfTemplate = 
					StringUtil.replace(pdfTemplate, new String[] {
					
					
			//Application Information 2
					
			"[$bodyName$]","[$Addressbody$]",
			
			//Contact Information 22
			
			"[$TelenoConbody$]","[$FaxOConbody$]","[$webConbody$]","[$bodycertificatesCon$]","[$Accredibody$]","[$personCon$]","[$emailConbody$]",
			
			
			
			"[$NameTechbody1$]","[$EMailTechbody1$]",
			"[$NameTechbody2$]","[$EMailTechbody2$]",
			"[$NameTechbody3$]","[$EMailTechbody3$]",
			"[$NameTechbody4$]","[$EMailTechbody4$]",
			"[$NameTechbody5$]","[$EMailTechbody5$]",
			
			"[$ConNamebody$]","[$ConEmailPerbody$]","[$FinancialManNamebody$]","[$FinancialManEmailbody$]","[$RequesrtApporiatebody$]",
			
			//We acknowledge the fact that the application fee (paid for the initial assessment) is non-refundable 3
			"[$NameAuthorizedbody$]","[$PositionAckbody$]","[$dateAckbody$]",
			
			//first signature:1
			"[$SignAuthorizedbody$]",
			//Second Signature:1
			"[$CompanySealSignbody$]",
			
			//The Organization 3
			
			"[$LegalEnBody$]","[$StatusaLeBody$]","[$InspeOtherBody$]",
			
			//State the Names and Position of the key personnel of the organization that have responsibility for, involvement in or influence on inspection activities 10
			"[$NameBody1$]","[$PosiTiBody1$]",
			"[$NameBody2$]","[$PosiTiBody2$]",
			"[$NameBody3$]","[$PosiTiBody3$]",
			"[$NameBody4$]","[$PosiTiBody4$]",
			"[$NameBody5$]","[$PosiTiBody5$]",
			//Indicate size of staff 1
			"[$SizeSt$]",
			
			//Staff Detail 20
			"[$NameSt1$]","[$TitleB1$]","[$ResponM1$]","[$IndicateAc1$]",                            
			"[$NameSt2$]","[$TitleB2$]","[$ResponM2$]","[$IndicateAc2$]",
			"[$NameSt3$]","[$TitleB3$]","[$ResponM3$]","[$IndicateAc3$]",
			"[$NameSt4$]","[$TitleB4$]","[$ResponM4$]","[$IndicateAc4$]",
			"[$NameSt5$]","[$TitleB5$]","[$ResponM5$]","[$IndicateAc5$]",
		
			//Clearly define the scope for which accreditation is being sought (including limits of capability where applicable) 32
			
			"[$NameActBody1$]","[$FieldCttBody1$]","[$TypeRBody1$]","[$MethodProBody1$]","[$EquipMtBody1$]","[$LimtCaBody1$]",                           
			"[$NameActBody2$]","[$FieldCttBody2$]","[$TypeRBody2$]","[$MethodProBody2$]","[$EquipMtBody2$]","[$LimtCaBody2$]",
			"[$NameActBody3$]","[$FieldCttBody3$]","[$TypeRBody3$]","[$MethodProBody3$]","[$EquipMtBody3$]","[$LimtCaBody3$]",
			"[$NameActBody4$]","[$FieldCttBody4$]","[$TypeRBody4$]","[$MethodProBody4$]","[$EquipMtBody4$]","[$LimtCaBody4$]",
			"[$NameActBody5$]","[$FieldCttBody5$]","[$TypeRBody5$]","[$MethodProBody5$]","[$EquipMtBody5$]","[$LimtCaBody5$]",
			//
			"[$MajorIncome$]","[$TypeR$]",
			//Who are the clients for which the inspection body provides services (CLAUSE 4.1.6) 2
			"[$ParentOrBody$]","[$otherBody$]",
			
			
			//new form
			//Physical Resources - Facilities, Equipment List the major equipment used in the inspection30
			"[$InNumberBody1$]","[$ItemBody1$]","[$ManufaTureBody1$]","[$MoNumbBody1$]","[$CalibInterBody1$]","[$CalibBody1$]",                           
			"[$InNumberBody2$]","[$ItemBody2$]","[$ManufaTureBody2$]","[$MoNumbBody2$]","[$CalibInterBody2$]","[$CalibBody2$]",
			"[$InNumberBody3$]","[$ItemBody3$]","[$ManufaTureBody3$]","[$MoNumbBody3$]","[$CalibInterBody3$]","[$CalibBody3$]",
			"[$InNumberBody4$]","[$ItemBody4$]","[$ManufaTureBody4$]","[$MoNumbBody4$]","[$CalibInterBody4$]","[$CalibBody4$]",
			"[$InNumberBody5$]","[$ItemBody5$]","[$ManufaTureBody5$]","[$MoNumbBody5$]","[$CalibInterBody5$]","[$CalibBody5$]",
			
			//If your application covers activities performed at more than one location (including virtual sites if applicable), provide details in the table below:23
			
			"[$No1$]","[$LocationRe1$]","[$ActiveLo1$]","[$ContD1$]",                            
			"[$No2$]","[$LocationRe2$]","[$ActiveLo2$]","[$ContD2$]",
			"[$No3$]","[$LocationRe3$]","[$ActiveLo3$]","[$ContD3$]",
			"[$No4$]","[$LocationRe4$]","[$ActiveLo4$]","[$ContD4$]",
			"[$No5$]","[$LocationRe5$]","[$ActiveLo5$]","[$ContD5$]",
			
			"[$FaciliTies$]","[$PersonalE$]","[$securityUn$]",
			
			//Management System Requirements 1
			"[$ManageSystem$]",
			
			//Management System Manual 12
			"[$ManualAutho$]","[$AuthorizationQuali$]",
			"[$PolicieLe$]","[$ManagementRelevant$]",
			"[$OverallObj$]","[$ManualMana$]",
			"[$References$]","[$ReferencesSupporting$]",
			"[$ResponsibilitiesRole$]","[$TechnicalRole$]",
			"[$DocumentationJob$]","[$InspectionActivities$]",
			
			//Management System Procedures - Management Requirements 14
			"[$ControlProcedure$]","[$ProcedureDoc$]",
			"[$ChangesDoc$]","[$ChangesDocument$]",
			"[$QualityInspection$]","[$QualityInsRecords$]",
			"[$ManagementReview$]","[$QualityManual$]",
			"[$AuditsInternal$]","[$AuditsOther$]",
			"[$CorrectiveAct$]","[$CorrectiveActions$]",
			"[$PreventiveAc$]","[$ActionPre$]",
			
			//Management System Procedures - Resource Requirements 4
			"[$PoliciePe$]","[$PolicieSection$]",
			"[$EquipmentDe$]","[$EquipmentDate$]",
			
			//Management System Procedures - Process Requirements 8
			
			"[$InspectionDetails$]","[$DetailsIns$]",
			"[$ContractualArrangement$]","[$ArrangementsClients$]",
			"[$HandlingInspect$]","[$InspectionItems$]",
			"[$Complaints$]","[$AppealsComplaints$]",
			
			//Other Requirements 6
			"[$FeesSubmitted$]","[$paymentMethod$]","[$RepresentativeNam$]","[$PositionApplicant$]","[$DateApplicant$]", 
			
			//Third Signature: 1
			
			"[$representativeSign$]"
			},
			new String[] {
		    //Application Information 2
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfApplicant())?mediLabApplicationInfo.getNameOfApplicant():"",
    		Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getApplicantAddress())?mediLabApplicationInfo.getApplicantAddress():"",
    			
    		//Contact Information 7
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliTelephoneNo())?mediLabApplicationInfo.getAppliTelephoneNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliFaxNo())?mediLabApplicationInfo.getAppliFaxNo():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAppliWebsite())?mediLabApplicationInfo.getAppliWebsite():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryName())?mediLabApplicationInfo.getLaboratoryName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getLaboratoryAddress())?mediLabApplicationInfo.getLaboratoryAddress():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getNameOfIncharge())?mediLabApplicationInfo.getNameOfIncharge():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getEmailOfIncharge())?mediLabApplicationInfo.getEmailOfIncharge():"",
				
			//Name & Email Address of Person Responsible for Technical Management 10
            (inspApplicationInfo!=null)&&(inspApplicationInfo.size()>0)?inspApplicationInfo.get(0).getName():"",
		    (inspApplicationInfo!=null)&&(inspApplicationInfo.size()>0)?inspApplicationInfo.get(0).getEmail():"",
		    
					    				
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>1)?inspApplicationInfo.get(1).getName():"",
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>1)?inspApplicationInfo.get(1).getEmail():"",
			
								
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>2)?inspApplicationInfo.get(2).getName():"",
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>2)?inspApplicationInfo.get(2).getEmail():"",
			
			
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>3)?inspApplicationInfo.get(3).getName():"",
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>3)?inspApplicationInfo.get(3).getEmail():"",
			

			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>4)?inspApplicationInfo.get(4).getName():"",
			(inspApplicationInfo!=null)&&(inspApplicationInfo.size()>4)?inspApplicationInfo.get(4).getEmail():"",
					
					
			//other remaining  8
					
					
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMName())?mediLabApplicationInfo.getPersonnelQMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelQMEmail())?mediLabApplicationInfo.getPersonnelQMEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMName())?mediLabApplicationInfo.getPersonnelFMName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getPersonnelFMEmail())?mediLabApplicationInfo.getPersonnelFMEmail():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAccRequestType())?mediLabApplicationInfo.getAccRequestType():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelName())?mediLabApplicationInfo.getAuthorizedPersonnelName():"",
			Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPosition())?mediLabApplicationInfo.getAuthorizedPosition():"",
		    Validator.isNotNull(mediLabApplicationInfo)&&Validator.isNotNull(mediLabApplicationInfo.getAuthorizedPersonnelDate())?dateFormat.format(mediLabApplicationInfo.getAuthorizedPersonnelDate()):"",

			//Signature of Authorized Personnel 1
		    signatureForAuthorizedPersonnel,
		    
		    
		    //Company Seal/ Company Stamp 1
		    signaturecompanySeal,
		    
		    //The Organization 3
    		Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsLegalEntity())?insBodiesOrganization.getInsLegalEntity():"",
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsLegalStatusEntity())?insBodiesOrganization.getInsLegalStatusEntity():"",
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsBodyOrgPart())?insBodiesOrganization.getInsBodyOrgPart():"",
					
			//State the Names and Position of the key personnel of the organization that have responsibility for, involvement in or influence on inspection activities 10			
			(organFirst!=null)&&(organFirst.size()>0)?organFirst.get(0).getName():"",
			(organFirst!=null)&&(organFirst.size()>0)?organFirst.get(0).getPosition():"",
			
					    				
			(organFirst!=null)&&(organFirst.size()>1)?organFirst.get(1).getName():"",
			(organFirst!=null)&&(organFirst.size()>1)?organFirst.get(1).getPosition():"",
			
								
			(organFirst!=null)&&(organFirst.size()>2)?organFirst.get(2).getName():"",
			(organFirst!=null)&&(organFirst.size()>2)?organFirst.get(2).getPosition():"",
			
			
			(organFirst!=null)&&(organFirst.size()>3)?organFirst.get(3).getName():"",
			(organFirst!=null)&&(organFirst.size()>3)?organFirst.get(3).getPosition():"",
			
			
			(organFirst!=null)&&(organFirst.size()>4)?organFirst.get(4).getName():"",
			(organFirst!=null)&&(organFirst.size()>4)?organFirst.get(4).getPosition():"",		
					
		    //Indicate size of staff	1	
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsStaffSize())?insBodiesOrganization.getInsStaffSize():"",
					
		    //Staff Detail 20
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>0)?OrgInfoSecond.get(0).getNameOfStaff():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>0)?OrgInfoSecond.get(0).getJobTitle():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>0)?OrgInfoSecond.get(0).getMajorResponsibilities():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>0)?OrgInfoSecond.get(0).getIndexInspector():"",
				
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>1)?OrgInfoSecond.get(1).getNameOfStaff():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>1)?OrgInfoSecond.get(1).getJobTitle():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>1)?OrgInfoSecond.get(1).getMajorResponsibilities():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>1)?OrgInfoSecond.get(1).getIndexInspector():"",

			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>2)?OrgInfoSecond.get(2).getNameOfStaff():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>2)?OrgInfoSecond.get(2).getJobTitle():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>2)?OrgInfoSecond.get(2).getMajorResponsibilities():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>2)?OrgInfoSecond.get(2).getIndexInspector():"",
					
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>3)?OrgInfoSecond.get(3).getNameOfStaff():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>3)?OrgInfoSecond.get(3).getJobTitle():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>3)?OrgInfoSecond.get(3).getMajorResponsibilities():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>3)?OrgInfoSecond.get(3).getIndexInspector():"",
					
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>4)?OrgInfoSecond.get(4).getNameOfStaff():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>4)?OrgInfoSecond.get(4).getJobTitle():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>4)?OrgInfoSecond.get(4).getMajorResponsibilities():"",
			(OrgInfoSecond!=null)&&(OrgInfoSecond.size()>4)?OrgInfoSecond.get(4).getIndexInspector():"",
			
			//Clearly define the scope for which accreditation is being sought (including limits of capability where applicable) 34
					
					
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getInspectionActivity():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getFieldOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getTypeOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getMethod():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getEqipment():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>0)?orgInfoThird.get(0).getLimitsOfCapabilities():"",
				
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getInspectionActivity():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getFieldOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getTypeOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getMethod():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getEqipment():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>1)?orgInfoThird.get(1).getLimitsOfCapabilities():"",
			
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getInspectionActivity():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getFieldOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getTypeOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getMethod():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getEqipment():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>2)?orgInfoThird.get(2).getLimitsOfCapabilities():"",
					
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getInspectionActivity():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getFieldOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getTypeOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getMethod():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getEqipment():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>3)?orgInfoThird.get(3).getLimitsOfCapabilities():"",
					
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getInspectionActivity():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getFieldOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getTypeOfInspection():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getMethod():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getEqipment():"",
			(orgInfoThird!=null)&&(orgInfoThird.size()>4)?orgInfoThird.get(4).getLimitsOfCapabilities():"",

					
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsIncomeSource())?insBodiesOrganization.getInsIncomeSource():"",
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsOrgBodyType())?insBodiesOrganization.getInsOrgBodyType():"",
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsBodyOwnOrgClient())?insBodiesOrganization.getInsBodyOwnOrgClient():"",
			Validator.isNotNull(insBodiesOrganization)&&Validator.isNotNull(insBodiesOrganization.getInsBodyOtherOrgClient())?insBodiesOrganization.getInsBodyOtherOrgClient():"",

					
					
			//new form	
			//Physical Resources - Facilities, Equipment List the major equipment used in the inspection		30
			
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getInventoryNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getItem():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getManufacturer():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getModelNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getCalibrationInterval():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>0)?phyResourceFirst.get(0).getCalibratedBy():"",
				
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getInventoryNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getItem():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getManufacturer():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getModelNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getCalibrationInterval():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>1)?phyResourceFirst.get(1).getCalibratedBy():"",
			
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getInventoryNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getItem():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getManufacturer():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getModelNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getCalibrationInterval():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>2)?phyResourceFirst.get(2).getCalibratedBy():"",
					
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getInventoryNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getItem():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getManufacturer():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getModelNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getCalibrationInterval():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>3)?phyResourceFirst.get(3).getCalibratedBy():"",
					
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getInventoryNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getItem():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getManufacturer():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getModelNumber():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getCalibrationInterval():"",
			(phyResourceFirst!=null)&&(phyResourceFirst.size()>4)?phyResourceFirst.get(4).getCalibratedBy():"",	
			
			//If your application covers activities performed at more than one location (including virtual sites if applicable), provide details in the table below: 23
					
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>0)?phyResourceSecond.get(0).getNumber():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>0)?phyResourceSecond.get(0).getLocation():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>0)?phyResourceSecond.get(0).getActivitiesPerformed():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>0)?phyResourceSecond.get(0).getContactDetails():"",
				
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>1)?phyResourceSecond.get(1).getNumber():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>1)?phyResourceSecond.get(1).getLocation():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>1)?phyResourceSecond.get(1).getActivitiesPerformed():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>1)?phyResourceSecond.get(1).getContactDetails():"",
			
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>2)?phyResourceSecond.get(2).getNumber():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>2)?phyResourceSecond.get(2).getLocation():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>2)?phyResourceSecond.get(2).getActivitiesPerformed():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>2)?phyResourceSecond.get(2).getContactDetails():"",
					
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>3)?phyResourceSecond.get(3).getNumber():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>3)?phyResourceSecond.get(3).getLocation():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>3)?phyResourceSecond.get(3).getActivitiesPerformed():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>3)?phyResourceSecond.get(3).getContactDetails():"",
					
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>4)?phyResourceSecond.get(4).getNumber():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>4)?phyResourceSecond.get(4).getLocation():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>4)?phyResourceSecond.get(4).getActivitiesPerformed():"",
			(phyResourceSecond!=null)&&(phyResourceSecond.size()>4)?phyResourceSecond.get(4).getContactDetails():"",

			
			Validator.isNotNull(InsBodiesPhyResource)&&Validator.isNotNull(InsBodiesPhyResource.getInsBodiesfacilities())?InsBodiesPhyResource.getInsBodiesfacilities():"",
			Validator.isNotNull(InsBodiesPhyResource)&&Validator.isNotNull(InsBodiesPhyResource.getInsSafetyFeatures())?InsBodiesPhyResource.getInsSafetyFeatures():"",
			Validator.isNotNull(InsBodiesPhyResource)&&Validator.isNotNull(InsBodiesPhyResource.getInsSecurityArrangements())?InsBodiesPhyResource.getInsSecurityArrangements():"",		
			   
			//Management System Requirements		1
					
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getOptionFollow())?InsBodiesManageSys.getOptionFollow():"",		
					
			//Management System Manual	12
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getManualApproval())?InsBodiesManageSys.getManualApproval():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefManual())?InsBodiesManageSys.getQMRefManual():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getRelevantPolicies())?InsBodiesManageSys.getRelevantPolicies():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefRelevant())?InsBodiesManageSys.getQMRefRelevant():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getOverallObj())?InsBodiesManageSys.getOverallObj():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefOverallObj())?InsBodiesManageSys.getQMRefOverallObj():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getSupportingProcedure())?InsBodiesManageSys.getSupportingProcedure():"",		
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefSupporting())?InsBodiesManageSys.getQMRefSupporting():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getTechnicalMangmnt())?InsBodiesManageSys.getTechnicalMangmnt():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefTechnical())?InsBodiesManageSys.getQMRefTechnical():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getDocumentation())?InsBodiesManageSys.getDocumentation():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefDocumentation())?InsBodiesManageSys.getQMRefDocumentation():"",
			
			//Management System Procedures - Management Requirements	14	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getDocContolProc())?InsBodiesManageSys.getDocContolProc():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefDocControl())?InsBodiesManageSys.getQMRefDocControl():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getDocumntChanges())?InsBodiesManageSys.getDocumntChanges():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefDocumntChanges())?InsBodiesManageSys.getQMRefDocumntChanges():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getControlOfQuality())?InsBodiesManageSys.getControlOfQuality():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefControl())?InsBodiesManageSys.getQMRefControl():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getManagementReview())?InsBodiesManageSys.getManagementReview():"",		
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefManage())?InsBodiesManageSys.getQMRefManage():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getInsInternalAudits())?InsBodiesManageSys.getInsInternalAudits():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefInternalAudit())?InsBodiesManageSys.getQMRefInternalAudit():"",
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getInsCorrectiveAction())?InsBodiesManageSys.getInsCorrectiveAction():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefCorrect())?InsBodiesManageSys.getQMRefCorrect():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getInsPreventiveAction())?InsBodiesManageSys.getInsPreventiveAction():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefPreventive())?InsBodiesManageSys.getQMRefPreventive():"",	
					
			//Management System Procedures - Resource Requirements		4
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getPersonnel())?InsBodiesManageSys.getPersonnel():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefPersonnel())?InsBodiesManageSys.getQMRefPersonnel():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getEquipment())?InsBodiesManageSys.getEquipment():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefEquip())?InsBodiesManageSys.getQMRefEquip():"",		

			//Management System Procedures - Process Requirements 8	
					
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getInspection())?InsBodiesManageSys.getInspection():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefInspection())?InsBodiesManageSys.getQMRefInspection():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getContractualArrange())?InsBodiesManageSys.getContractualArrange():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefContractual())?InsBodiesManageSys.getQMRefContractual():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getHandlingInsItem())?InsBodiesManageSys.getHandlingInsItem():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefHandling())?InsBodiesManageSys.getQMRefHandling():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getComplaintsAppeals())?InsBodiesManageSys.getComplaintsAppeals():"",	
			Validator.isNotNull(InsBodiesManageSys)&&Validator.isNotNull(InsBodiesManageSys.getQMRefComplaints())?InsBodiesManageSys.getQMRefComplaints():"",	

			//Other Requirements	6
			Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getApplicationFees())?insBodiesOtherReq.getApplicationFees():"",	
			Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getInsPaymentMethod())?insBodiesOtherReq.getInsPaymentMethod():"",	
			Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getApplicantRepName())?insBodiesOtherReq.getApplicantRepName():"",	
			Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getApplicantRepPosition())?insBodiesOtherReq.getApplicantRepPosition():"",	
			Validator.isNotNull(insBodiesOtherReq)&&Validator.isNotNull(insBodiesOtherReq.getSignatureDate())?dateFormat.format(insBodiesOtherReq.getSignatureDate()):"",
					
			signaturerepresentative		
					
			});
				    }catch (Exception e) {
						// TODO: handle exception
					}
			
		
	
		 if (!checkPdfDownloadWithoutDocument.equals("false")) {
		String title = "";
		String fileName = "";
		if (Validator.isNotNull(supportingDocumentsFolder)) {
		String proofOfLegal = "";
		String genericCertificate = "";
		String authorizedPolicy="";
		String policyProcedure="";
		String policyPotential="";
		String authorizedCopy="";
		String evidenceQualification="";
		String certificateOfQualification="";
		
		
		
		
		for (DLFileEntry dlFileEntry : supportinfDocFileEntries) {
			try {
				fileEntry= DLAppLocalServiceUtil.getFileEntry(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(), dlFileEntry.getTitle());
				fileName = fileEntry.getFileName();
				title=fileEntry.getTitle();
			} catch (Exception e) {}
			if(title.equals("Proof of legal status of the inspection body (CLAUSE 5.1)")) {
				proofOfLegal = fileName;
			}else if (title.equals("A copy of approved plans (if premises are owned by the inspection body) or lease/rental contract for the inspection body (if applicable) (CLAUSE 6.2.1)")) {
				genericCertificate = fileName;
			}else if(title.equals("The layout of the inspection body indicating equipment placement (if applicable)")) {
				authorizedPolicy=fileName;
			}else if(title.equals("Quality manual")) {
				policyProcedure=fileName;
			}else if(title.equals("Procedures manual (management resource and process requirements procedures)")) {
				policyPotential=fileName;
			}else if(title.equals("A copy of each inspection method/procedure (and reference method(s) if applicable) for which accreditation is being sought as well as copies of the relevant regulation(s) standard(s) or other documentation as is permissible")) {
				authorizedCopy=fileName;
			}else if(title.equals("Copies of certificates of qualification of the head and deputy head of the inspection body as well as any other person(s) with signatory authority (include specimen signatures)")) {
				evidenceQualification=fileName;
			}else if(title.equals("Evidence of adequate provisions to cover liabilities arising from its operations e.g. insurance (CLAUSE 5.1.4)")) {
				certificateOfQualification=fileName;
			}
			
		}
		
		pdfTemplate = StringUtil.replace(pdfTemplate, new String[] {
			"[$ProofSt$]","[$InspecB$]","[$LayoutBl$]","[$ManualQ$]","[$ManagePr$]","[$EachStandard$]","[$SignHead$]","[$CoverArising$]",
			
			},
			new String[] {
					proofOfLegal, genericCertificate,authorizedPolicy,policyProcedure,policyPotential,authorizedCopy,evidenceQualification,certificateOfQualification,
				});
		}
		try {
			pdfTemplate = StringUtil.replace(pdfTemplate, new String[] { "[$MethodPaym$]" },
					new String[] { 
							  Validator.isNotNull(payment)&&Validator.isNotNull(payment.getPaymentMethod())?payment.getPaymentMethod():"",

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

