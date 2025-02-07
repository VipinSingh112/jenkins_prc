package com.nbp.jadsc.application.form.web.portlet;

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
import com.nbp.jadsc.application.documents.util.JadscTransactionApplicationDocumentsCopyUtil;
import com.nbp.jadsc.application.documents.util.JdscTransactionApplicationDataUtil;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfServiceAddForm;
import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfVeracity;
import com.nbp.jadsc.application.form.service.model.JADSCChecklist;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;
import com.nbp.jadsc.application.form.service.model.JADSCNoticeOfAppearance;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceAddFormLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfServiceLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCertificateOfVeracityLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistAddLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCCurrentStageLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCInformationRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCNoticeOfAppearanceLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=transtion/Number", }, service = MVCResourceCommand.class)
public class RenewJadscTransactionResourceCommand implements MVCResourceCommand {

	static Log _log = LogFactoryUtil.getLog(RenewJadscTransactionResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "JADSC Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String transactionNumber = ParamUtil.getString(resourceRequest, "transactionNumber");
		JADSCApplication jadscApplication = null;
		JADSCApplication transationjadscApplication = null;
		String typeofApplicant = "";

		long jadscApplicationId = 0;
		try {
			try {
				if (Validator.isNotNull(transactionNumber)) {
					jadscApplication = JADSCApplicationLocalServiceUtil.getFireBrigadeByAppNo(transactionNumber);
				}
				jadscApplicationId = jadscApplication.getJadscApplicationId();
				typeofApplicant = jadscApplication.getTypeOfApplicant();

			} catch (Exception e) {
				_log.error(e.getMessage());
			}
			if (Validator.isNull(jadscApplication)) {
				if (Validator.isNull(transactionNumber)) {
					_log.info("Renewal data [STARTED]--->1");
					jsonOBJ.put("registrationNumCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}

				else {
					_log.info("Renewal data [STARTED]--->2");
					String renewUrl = JdscTransactionApplicationDataUtil
							.createJadscRegistrationApplication(themeDisplay, transactionNumber);
					jsonOBJ.put("renewLicenseUrl", renewUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().print(jsonFeed.toString());

				}
			} else {
				if (jadscApplication.getStatus() == JADSCApplicationWorkFlowConstants.SUBMITTED) {
					if (Validator.isNotNull(transactionNumber)) {
						_log.info("Renewal Process-->>");
						try {
							transationjadscApplication = JADSCApplicationLocalServiceUtil.getJADSCRegstByAT_AppNo(
									JADSCApplicationWorkFlowConstants.RENEW, transactionNumber);

						} catch (Exception e) {
						}
					}
					if (transationjadscApplication == null) {
						transationjadscApplication = JADSCApplicationLocalServiceUtil
								.createJADSCApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						transationjadscApplication.setGroupId(themeDisplay.getScopeGroupId());
						transationjadscApplication.setCompanyId(themeDisplay.getCompanyId());
						transationjadscApplication.setUserId(themeDisplay.getUserId());
						transationjadscApplication.setUserName(themeDisplay.getUser().getFullName());
						transationjadscApplication.setCreateDate(new Date());
						transationjadscApplication.setExpiredLicenseAppNumber(transactionNumber);
						transationjadscApplication.setTypeOfApplicant(typeofApplicant);
						transationjadscApplication.setApplicationNumber(formatted + "/" + formattedDate);
						transationjadscApplication
								.setBreachOfConfidentiality(JADSCApplicationWorkFlowConstants.REGISTRATION_APPLICATION);
						transationjadscApplication.setStatus(JADSCApplicationWorkFlowConstants.DRAFT);
						JADSCApplicationLocalServiceUtil.updateJADSCApplication(transationjadscApplication);

						JADSCCurrentStage jadscCurrentStage = JADSCCurrentStageLocalServiceUtil
								.createJADSCCurrentStage(CounterLocalServiceUtil.increment());

						jadscCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
						jadscCurrentStage.setLastFormStep("childStep1");
						jadscCurrentStage.setJadscApplicationId(transationjadscApplication.getJadscApplicationId());
						JADSCCurrentStageLocalServiceUtil.updateJADSCCurrentStage(jadscCurrentStage);

						copyingDataFromOriginalApplication(jadscApplication.getJadscApplicationId(),
								transationjadscApplication.getJadscApplicationId());

						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						List<DLFileEntry> originalFolderFileEntry = null;
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);

						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

						} catch (PortalException e) {
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(jadscApplicationId));

							originalFolderFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(
									themeDisplay.getScopeGroupId(), supportingDocsMainFolder.getFolderId());

						} catch (PortalException e) {
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(),
									String.valueOf(transationjadscApplication.getJadscApplicationId()));
						} catch (Exception e) {
						}
						if (copiedDlFolder == null) {
							JadscTransactionApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(transationjadscApplication.getJadscApplicationId()),
									supportingDocsMainFolder.getDescription(), serviceContext,
									supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									transationjadscApplication.getJadscApplicationId());

						}
					}
					String renewLicenseUrl = "/group/guest/adsc-application-from?jadscApplicationId="
							+ transationjadscApplication.getJadscApplicationId();
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				} else {
					jsonOBJ.put("registrationNumCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}

			}

		} catch (Exception e) {
		}
		return false;

	}

	private static void copyingDataFromOriginalApplication(long jadscApplicationId, long transationjadscApplicationId) {

		// original
		JADSCInformationRequest informationRequest = null;
		// renewal
		JADSCInformationRequest renewInformationRequest = null;

		try {
			informationRequest = JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		try {
			renewInformationRequest = JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}
		if (informationRequest != null) {
			renewInformationRequest.setCompanyName(informationRequest.getCompanyName());
			renewInformationRequest.setAddress(informationRequest.getAddress());
			renewInformationRequest.setMainTelephone(informationRequest.getMainTelephone());
			renewInformationRequest.setOfficeTelephone(informationRequest.getOfficeTelephone());
			renewInformationRequest.setCellTelephone(informationRequest.getCellTelephone());
			renewInformationRequest.setOtherContact(informationRequest.getOtherContact());
			renewInformationRequest.setWhatsappTelephone(informationRequest.getWhatsappTelephone());
			renewInformationRequest.setEmailContact(informationRequest.getEmailContact());
			renewInformationRequest.setContactPerName(informationRequest.getContactPerName());
			renewInformationRequest.setContactPerPosition(informationRequest.getContactPerPosition());
			renewInformationRequest.setContactPerPhone(informationRequest.getContactPerPhone());
			renewInformationRequest.setContactPerEmail(informationRequest.getContactPerEmail());
			renewInformationRequest.setAltContactPerName(informationRequest.getAltContactPerName());
			renewInformationRequest.setAltContactPerPosition(informationRequest.getAltContactPerPosition());
			renewInformationRequest.setAltContactPerPhone(informationRequest.getAltContactPerPhone());
			renewInformationRequest.setAltContactPerEmail(informationRequest.getAltContactPerEmail());
			renewInformationRequest.setComOperationYear(informationRequest.getComOperationYear());
			renewInformationRequest.setProducts(informationRequest.getProducts());
			renewInformationRequest.setMarketSharePer(informationRequest.getMarketSharePer());
			renewInformationRequest.setTradeRemedyMeasure(informationRequest.getTradeRemedyMeasure());
			renewInformationRequest.setFiveYearsInvestment(informationRequest.getFiveYearsInvestment());
			renewInformationRequest.setPlanCapacity(informationRequest.getPlanCapacity());
			renewInformationRequest.setGrowthProjection(informationRequest.getGrowthProjection());
			renewInformationRequest.setJadscApplicationId(transationjadscApplicationId);
			JADSCInformationRequestLocalServiceUtil.updateJADSCInformationRequest(renewInformationRequest);
		}

		// Oath:

		JADSCOathRequest jadscOathRequest = null;
		JADSCOathRequest renewJadscOathRequest = null;

		try {
			jadscOathRequest = JADSCOathRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}
		try {
			renewJadscOathRequest = JADSCOathRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		if (jadscOathRequest != null) {
			renewJadscOathRequest.setInvestigationType(jadscOathRequest.getInvestigationType());
			renewJadscOathRequest.setPartyName(jadscOathRequest.getPartyName());
			renewJadscOathRequest.setRequestReason(jadscOathRequest.getRequestReason());
			renewJadscOathRequest.setComOfficial(jadscOathRequest.getComOfficial());
			renewJadscOathRequest.setSignatureDate(jadscOathRequest.getSignatureDate());
			renewJadscOathRequest.setJadscApplicationId(transationjadscApplicationId);
			JADSCOathRequestLocalServiceUtil.updateJADSCOathRequest(renewJadscOathRequest);
		}

		// service form:

		JADSCCertificateOfService certificateOfService = null;
		JADSCCertificateOfService renewcertificateOfService = null;
		try {
			certificateOfService = JADSCCertificateOfServiceLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		try {
			renewcertificateOfService = JADSCCertificateOfServiceLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		if (certificateOfService != null) {
			renewcertificateOfService.setDocSubmitDate(certificateOfService.getDocSubmitDate());
			renewcertificateOfService.setSignatoryName(certificateOfService.getSignatoryName());
			renewcertificateOfService.setSignatoryDate(certificateOfService.getSignatoryDate());
			renewcertificateOfService.setSignatoryTelephone(certificateOfService.getSignatoryTelephone());
			renewcertificateOfService.setSignatoryFax(certificateOfService.getSignatoryFax());
			renewcertificateOfService.setJadscApplicationId(transationjadscApplicationId);
			JADSCCertificateOfServiceLocalServiceUtil.updateJADSCCertificateOfService(renewcertificateOfService);
		}

		// service form:
		// Add form:
		List<JADSCCertificateOfServiceAddForm> certificateOfServiceAddForm = null;
		JADSCCertificateOfServiceAddForm renewcertificateOfServiceAddForm = null;

		try {
			certificateOfServiceAddForm = JADSCCertificateOfServiceAddFormLocalServiceUtil
					.getJADSCDataListBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		if (certificateOfServiceAddForm != null) {

			for (JADSCCertificateOfServiceAddForm jadsc : certificateOfServiceAddForm) {

				renewcertificateOfServiceAddForm = JADSCCertificateOfServiceAddFormLocalServiceUtil
						.createJADSCCertificateOfServiceAddForm(CounterLocalServiceUtil.increment());
				renewcertificateOfServiceAddForm.setDocServeName(jadsc.getDocServeName());
				renewcertificateOfServiceAddForm.setDocServeCom(jadsc.getDocServeCom());
				renewcertificateOfServiceAddForm.setDocServeAddress(jadsc.getDocServeAddress());
				renewcertificateOfServiceAddForm.setJadscApplicationId(transationjadscApplicationId);
				JADSCCertificateOfServiceAddFormLocalServiceUtil
						.updateJADSCCertificateOfServiceAddForm(renewcertificateOfServiceAddForm);
			}
		}

		// veracity form:
		JADSCCertificateOfVeracity certificateOfVeracity = null;
		JADSCCertificateOfVeracity renewcertificateOfVeracity = null;

		try {
			certificateOfVeracity = JADSCCertificateOfVeracityLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		try {
			renewcertificateOfVeracity = JADSCCertificateOfVeracityLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		if (certificateOfVeracity != null) {
			renewcertificateOfVeracity.setVeracityComName(certificateOfVeracity.getVeracityComName());
			renewcertificateOfVeracity.setVeracityComPosition(certificateOfVeracity.getVeracityComPosition());
			renewcertificateOfVeracity.setVeracityComCompany(certificateOfVeracity.getVeracityComCompany());
			renewcertificateOfVeracity.setVeracitySignedDate(certificateOfVeracity.getVeracitySignedDate());
			renewcertificateOfVeracity.setVeracitySignedTelephone(certificateOfVeracity.getVeracitySignedTelephone());
			renewcertificateOfVeracity.setVeracitySignedFax(certificateOfVeracity.getVeracitySignedFax());
			renewcertificateOfVeracity.setVeracitySignedAddress(certificateOfVeracity.getVeracitySignedAddress());
			renewcertificateOfVeracity.setJadscApplicationId(transationjadscApplicationId);
			JADSCCertificateOfVeracityLocalServiceUtil.updateJADSCCertificateOfVeracity(renewcertificateOfVeracity);
		}
		// checklist
		List<JADSCChecklist> information = null;
		JADSCChecklist renewinformation = null;

		try {
			information = JADSCChecklistLocalServiceUtil.getJADSC_ByAppId(jadscApplicationId);
			System.out.println("information of checklist--------" + information);

		} catch (Exception e) {
		}
		if (information != null) {
		    for (JADSCChecklist infoAdd : information) {
		        renewinformation = JADSCChecklistLocalServiceUtil
		                .createJADSCChecklist(CounterLocalServiceUtil.increment());
		        renewinformation.setInformationRegComplaint(infoAdd.getInformationRegComplaint());
		        renewinformation.setDescription(infoAdd.getDescription());
		        renewinformation.setSelectedChecklistValues(infoAdd.getSelectedChecklistValues());
		        renewinformation.setJadscApplicationId(transationjadscApplicationId);
		        JADSCChecklistLocalServiceUtil.updateJADSCChecklist(renewinformation);
		        _log.info("-----------------------------renewinformation-------------------" + renewinformation);
		    }
		}

		// checklist item:
		List<JADSCChecklistAdd> jadscChecklistadd = null;
		JADSCChecklistAdd renewjadscChecklistadd = null;

		try {
			jadscChecklistadd = JADSCChecklistAddLocalServiceUtil.getAppIdJADSC(jadscApplicationId);
		} catch (Exception e) {
		}
		if (jadscChecklistadd != null) {

			for (JADSCChecklistAdd itemAdd : jadscChecklistadd) {
				renewjadscChecklistadd = JADSCChecklistAddLocalServiceUtil
						.createJADSCChecklistAdd(CounterLocalServiceUtil.increment());
				renewjadscChecklistadd.setAddItem(itemAdd.getAddItem());
				renewjadscChecklistadd.setCounter(itemAdd.getCounter());
				renewjadscChecklistadd.setJadscApplicationId(transationjadscApplicationId);
				JADSCChecklistAddLocalServiceUtil.updateJADSCChecklistAdd(renewjadscChecklistadd);
			}
		}

		// Notice of appearance:
		JADSCNoticeOfAppearance jadscNoticeOfAppearance = null;
		JADSCNoticeOfAppearance renewjadscNoticeOfAppearance = null;
		try {
			jadscNoticeOfAppearance = JADSCNoticeOfAppearanceLocalServiceUtil
					.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		try {
			renewjadscNoticeOfAppearance = JADSCNoticeOfAppearanceLocalServiceUtil
					.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
		} catch (Exception e) {
		}

		if (jadscNoticeOfAppearance != null) {
			renewjadscNoticeOfAppearance.setFullName(jadscNoticeOfAppearance.getFullName());
			renewjadscNoticeOfAppearance.setAddressOne(jadscNoticeOfAppearance.getAddressOne());
			renewjadscNoticeOfAppearance.setDate(jadscNoticeOfAppearance.getDate());
			renewjadscNoticeOfAppearance.setName(jadscNoticeOfAppearance.getName());
			renewjadscNoticeOfAppearance.setFirm(jadscNoticeOfAppearance.getFirm());
			renewjadscNoticeOfAppearance.setAddress(jadscNoticeOfAppearance.getAddress());
			renewjadscNoticeOfAppearance.setTelephone(jadscNoticeOfAppearance.getTelephone());
			renewjadscNoticeOfAppearance.setJadscApplicationId(transationjadscApplicationId);
			JADSCNoticeOfAppearanceLocalServiceUtil.updateJADSCNoticeOfAppearance(renewjadscNoticeOfAppearance);
		}

	}

	@Reference
	private CommonsUtil commonsUtil;
}
