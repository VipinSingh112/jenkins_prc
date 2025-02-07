package com.nbp.miic.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;
import com.nbp.miic.application.form.web.constants.MIICApplicationWorkflowConstant;
import com.nbp.miic.application.util.MIICDataCreationUtil;
import com.nbp.miic.application.util.MIICDocumentCopyUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		property = { 
			"javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		    "mvc.command.name=/renewLicenseUrl/miic" 
			}, 
	service = MVCResourceCommand.class
	)

public class RenewMiicLicenseResourceCommand implements MVCResourceCommand{
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Miic Supported Documents";
	static Log _log = LogFactoryUtil.getLog(RenewMiicLicenseResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String transactionNumber = ParamUtil.getString(resourceRequest, "transactionNumber");
		String certificateNumber = ParamUtil.getString(resourceRequest, "certificateNumber");
		MiicApplication miicApplication=null;
		MiicApplication miicApplicationRenewalProcess=null;
		long miicApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(transactionNumber)) {
					miicApplication = MiicApplicationLocalServiceUtil.getMIICByAppNo(transactionNumber);
				}
				miicApplicationId= miicApplication.getMiicApplicationId();
			}catch (Exception e) {
			}
			if(Validator.isNull(miicApplication)) {
				if (Validator.isNull(transactionNumber)&&(Validator.isNull(certificateNumber))){
					jsonOBJ.put("transactionNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}else if (Validator.isNotNull(transactionNumber)) {
					jsonOBJ.put("transactionNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
				String renewUrl = MIICDataCreationUtil.getApplicationData(themeDisplay, certificateNumber);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(miicApplication.getStatus()==MIICApplicationWorkflowConstant.SUBMITTED) {
					if (Validator.isNotNull(transactionNumber)) {
						try {
							MiicApplicationLocalServiceUtil
									.getMIICByAT_AppNo(MIICApplicationWorkflowConstant.RENEW,
											transactionNumber);
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}
					if(miicApplicationRenewalProcess == null) {
						miicApplicationRenewalProcess = MiicApplicationLocalServiceUtil.createMiicApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						miicApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						miicApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						miicApplicationRenewalProcess.setCreateDate(new Date());
						miicApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						miicApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						miicApplicationRenewalProcess.setExpiredLicenseAppNumber(transactionNumber);
						miicApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						miicApplicationRenewalProcess.setTypeOfTransaction(MIICApplicationWorkflowConstant.RENEW);
						miicApplicationRenewalProcess.setStatus(MIICApplicationWorkflowConstant.DRAFT);
						MiicApplicationLocalServiceUtil.updateMiicApplication(miicApplicationRenewalProcess);
						copyingDataFromOriginalApplication(miicApplication.getMiicApplicationId(), miicApplicationRenewalProcess.getMiicApplicationId());
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						java.util.List<DLFileEntry> originalFolderFileEntry = null;
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

						} catch (PortalException e) {
							_log.error("Error---->>" + e.getMessage());
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(miicApplicationId));

							originalFolderFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(
									themeDisplay.getScopeGroupId(), supportingDocsMainFolder.getFolderId());

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											miicApplicationRenewalProcess.getMiicApplicationId()));
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							MIICDocumentCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
											miicApplicationRenewalProcess.getMiicApplicationId()),
									supportingDocsMainFolder.getDescription(), serviceContext,
									supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									miicApplicationRenewalProcess.getMiicApplicationId());

						}
					}
					String renewLicenseUrl = "/group/guest/miic-application-form?miicApplicationId="
							+ miicApplicationRenewalProcess.getMiicApplicationId();
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				} else {
					jsonOBJ.put("transactionNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
			}
		} catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}

	public static void copyingDataFromOriginalApplication(long miicApplicationId,
			long miicRenewalApplicationId) {
	 System.out.println("MIIC RENEWAL APPLICATION ID*****"+miicRenewalApplicationId);
	 MiicApplicantDetails applicantDetail=null;
	 MiicApplicantDetails ciApplicant = null;
		try {
			applicantDetail = MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		
		try {
			ciApplicant = MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
		}catch(Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		if(applicantDetail != null) {
			ciApplicant.setNatureOfApplicant(applicantDetail.getNatureOfApplicant());
			ciApplicant.setApplicantName(applicantDetail.getApplicantName());
			ciApplicant.setNameOfProducer(applicantDetail.getNameOfProducer());
			ciApplicant.setCompanyName(applicantDetail.getCompanyName());
			ciApplicant.setFirstName(applicantDetail.getFirstName());
			ciApplicant.setLastName(applicantDetail.getLastName());
			ciApplicant.setAddress(applicantDetail.getAddress());
			ciApplicant.setEmail(applicantDetail.getEmail());
			ciApplicant.setTelephone(applicantDetail.getTelephone());
			ciApplicant.setDateOfApplication(applicantDetail.getDateOfApplication());
			ciApplicant.setTrnNumber(applicantDetail.getTrnNumber());
			ciApplicant.setMiicApplicationId(miicRenewalApplicationId);
			MiicApplicantDetailsLocalServiceUtil.updateMiicApplicantDetails(ciApplicant);
		}
		
		/* SuspensionOfCet form add */
		java.util.List<MiicSuspensionOfCetAdd>  miicSuspensionCet = null;
		MiicSuspensionOfCetAdd ciSuspensionOfCetAdd = null;
		try {
			miicSuspensionCet = MiicSuspensionOfCetAddLocalServiceUtil.getMiicById(miicApplicationId);
		}catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		if(miicSuspensionCet != null){
			for (MiicSuspensionOfCetAdd suspensionOfCet : miicSuspensionCet) {
				ciSuspensionOfCetAdd= MiicSuspensionOfCetAddLocalServiceUtil.createMiicSuspensionOfCetAdd(CounterLocalServiceUtil.increment());
				ciSuspensionOfCetAdd.setTariffHeadingNum(suspensionOfCet.getTariffHeadingNum());
				ciSuspensionOfCetAdd.setDescription(suspensionOfCet.getDescription());
				ciSuspensionOfCetAdd.setAmountQuantity(suspensionOfCet.getAmountQuantity());
				ciSuspensionOfCetAdd.setAmountEstimateInUs(suspensionOfCet.getAmountEstimateInUs());
				ciSuspensionOfCetAdd.setTechnologySpecification(suspensionOfCet.getTechnologySpecification());
				ciSuspensionOfCetAdd.setCetRate(suspensionOfCet.getCetRate());
				ciSuspensionOfCetAdd.setRateProposed(suspensionOfCet.getRateProposed());
				//ciSuspensionOfCetAdd.setPeriodOfRateChange(suspensionOfCet.getPeriodOfRateChange());
				ciSuspensionOfCetAdd.setMiicApplicationId(miicRenewalApplicationId);
				MiicSuspensionOfCetAddLocalServiceUtil.updateMiicSuspensionOfCetAdd(ciSuspensionOfCetAdd);
			}	
		}
		
		/* suspension cet */
		MiicSuspensionOfCet suspensionOfCet = null;
		MiicSuspensionOfCet ciSuspensionOfCet = null;
			try {
				suspensionOfCet = MiicSuspensionOfCetLocalServiceUtil.getMiicById(miicApplicationId);
			}catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
			
			try {
				ciSuspensionOfCet = MiicSuspensionOfCetLocalServiceUtil.getMiicById(miicApplicationId);
			}catch(Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
			if(applicantDetail != null) {
				ciSuspensionOfCet.setIndicationOfUrgency(suspensionOfCet.getIndicationOfUrgency());
				ciSuspensionOfCet.setRequestForSuspension(suspensionOfCet.getRequestForSuspension());
				ciSuspensionOfCet.setEvidenceOfInability(suspensionOfCet.getEvidenceOfInability());
				ciSuspensionOfCet.setEvidenceOfConsultation(suspensionOfCet.getEvidenceOfConsultation());
				ciSuspensionOfCet.setMiicApplicationId(miicRenewalApplicationId);
				MiicSuspensionOfCetLocalServiceUtil.updateMiicSuspensionOfCet(ciSuspensionOfCet);
			}
		
		/*OsiCurrentStage originalCurrentStage=null;
		try {
			originalCurrentStage=OsiCurrentStageLocalServiceUtil.getOsiCurrentStageById(miicApplicationId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(originalCurrentStage)) {
			OsiCurrentStage renewCurrentStage=OsiCurrentStageLocalServiceUtil.createOsiCurrentStage(CounterLocalServiceUtil.increment());
			renewCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
			renewCurrentStage.setLastFormStep("childStep1");
			renewCurrentStage.setOsiApplicationId(miicRenewalApplicationId);
			OsiCurrentStageLocalServiceUtil.updateOsiCurrentStage(renewCurrentStage);
		}*/
	}
	@Reference
	private CommonsUtil commonsUtil;
}
