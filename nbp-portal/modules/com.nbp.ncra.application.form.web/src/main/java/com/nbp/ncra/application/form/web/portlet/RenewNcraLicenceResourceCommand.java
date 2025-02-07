package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppService;
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
import com.nbp.ncra.application.form.service.exception.NoSuchNcraFeeSubmissionException;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraCurrentStage;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraCurrentStageLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraFeeSubmissionLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDateLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;
import com.nbp.ncra.application.form.web.constants.NcraApplicationWorkflowConstants;
import com.nbp.ncra.application.upload.documents.util.NcraApplicationDocumentsCopyUtil;
import com.nbp.ncra.application.upload.documents.util.NcraRenewAppDataUtil;

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

@Component(immediate = true, property = { "javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=renewLicenseUrl" }, service = MVCResourceCommand.class)
public class RenewNcraLicenceResourceCommand implements MVCResourceCommand {
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "NCRA Supported Documents";
	private static Log _log = LogFactoryUtil.getLog(RenewNcraLicenceResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String permitNumber = ParamUtil.getString(resourceRequest, "permitNumber");
		NcraApplication ncraApplication = null;
		NcraApplication ncraApplicationRenewalProcess = null;
		long ncraApplicationId = 0;

		/* ManufacturingPermit manufacturingPermit=null; */

		try {

			try {
				if (Validator.isNotNull(licenseNumber)) {
					ncraApplication = NcraApplicationLocalServiceUtil.getNcraByAppNum(licenseNumber);
				}
				/*
				 * else if (Validator.isNotNull(permitNumber)) {
				 * manufacturingPermit=ManufacturingPermitLocalServiceUtil.
				 * getManufacturingPermitBY_Permit(permitNumber); manufacturingApplication =
				 * ManufacturingApplicationLocalServiceUtil
				 * .getManufacturingByCaseId(manufacturingPermit.getCaseId()); }
				 */
				ncraApplicationId = ncraApplication.getNcraApplicationId();
			} catch (Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
			if(permitNumber!=null&&licenseNumber=="") {
				String renewApplicationDataId = NcraRenewAppDataUtil.createApplicationData(themeDisplay, permitNumber);
				jsonOBJ.put("renewLicenseUrl", renewApplicationDataId);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().write(jsonFeed.toString());
			}else if (Validator.isNull(ncraApplication)) {
				String renewApplicationDataId = NcraRenewAppDataUtil.createApplicationData(themeDisplay, licenseNumber);
				jsonOBJ.put("renewLicenseUrl", renewApplicationDataId);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().write(jsonFeed.toString());
			} else {
				if (ncraApplication.getUserId() == themeDisplay.getUserId()) {
					if (ncraApplication.getStatus() == NcraApplicationWorkflowConstants.SUBMITTED
							|| ncraApplication.getStatus() == NcraApplicationWorkflowConstants.DRAFT) {
						if (Validator.isNotNull(licenseNumber)) {
							try {
								ncraApplicationRenewalProcess = NcraApplicationLocalServiceUtil.getNcraByRT_AppNo(
										NcraApplicationWorkflowConstants.RENEW_APPLICATION, licenseNumber);
							} catch (Exception e) {
								_log.error("Error****************" + e.getMessage());
							}
						}
						if (ncraApplicationRenewalProcess == null) {
							ncraApplicationRenewalProcess = NcraApplicationLocalServiceUtil
									.createNcraApplication(CounterLocalServiceUtil.increment());
							DateFormat df = new SimpleDateFormat("yy");
							String formattedDate = df.format(Calendar.getInstance().getTime());
							SecureRandom random = new SecureRandom();
							int num = random.nextInt(100000);
							String formatted = String.format("%05d", num);
							ncraApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
							ncraApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
							ncraApplicationRenewalProcess.setCreateDate(new Date());
							ncraApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
							ncraApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
							ncraApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
							ncraApplicationRenewalProcess.setDoYouWant(ncraApplication.getDoYouWant());
							ncraApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
							ncraApplicationRenewalProcess
									.setTypeOfTransaction(NcraApplicationWorkflowConstants.RENEW_APPLICATION);
							ncraApplicationRenewalProcess.setStatus(NcraApplicationWorkflowConstants.DRAFT);
							NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplicationRenewalProcess);
							NcraCurrentStage currentStage = null;
							currentStage = NcraCurrentStageLocalServiceUtil
									.createNcraCurrentStage(CounterLocalServiceUtil.increment());
							currentStage.setCurrentStage("APPLICATION FORM DETAILS");
							currentStage.setLastFormStepDetails("childStep1");
							currentStage.setNcraApplicationId(ncraApplicationRenewalProcess.getNcraApplicationId());
							NcraCurrentStageLocalServiceUtil.updateNcraCurrentStage(currentStage);
							copyingDataFromOriginalApplication(ncraApplication.getNcraApplicationId(),
									ncraApplicationRenewalProcess.getNcraApplicationId());
							ServiceContext serviceContext = new ServiceContext();
							DLFolder originalRootDlFolder = null;
							DLFolder supportingDocsMainFolder = null;
							serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(),
									resourceRequest);
							try {
								originalRootDlFolder = DLFolderLocalServiceUtil
										.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
							} catch (PortalException e) {
								_log.error("Error---->>" + e.getMessage());
							}
							try {
								supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
										themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
										String.valueOf(ncraApplicationId));
							} catch (PortalException e) {
								_log.error("Error----->>" + e.getMessage());
							}
							DLFolder copiedDlFolder = null;
							try {
								copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
										originalRootDlFolder.getFolderId(),
										String.valueOf(ncraApplicationRenewalProcess.getNcraApplicationId()));
							} catch (Exception e) {
								_log.error("Error----->>" + e.getMessage());
							}
							if (copiedDlFolder == null) {
								NcraApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
										supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
										String.valueOf(ncraApplicationRenewalProcess.getNcraApplicationId()),
										supportingDocsMainFolder.getDescription(), serviceContext,
										supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
										ncraApplicationRenewalProcess.getNcraApplicationId());
							}
						}
						String renewLicenseUrl = "/group/guest/ncra-application-form?ncraApplicationId="
								+ ncraApplicationRenewalProcess.getNcraApplicationId();
						jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
						jsonFeed.put("APP_DATA", jsonOBJ);
						resourceResponse.setContentType("application/json");
						resourceResponse.getWriter().write(jsonFeed.toString());
					}
				} else {
					jsonOBJ.put("licenseNumberCheck", "0");
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

	public static void copyingDataFromOriginalApplication(long ncraApplicationId, long ncraRenewalApplicationId) {
		NcraApplicantDetailInfo originalApplication = null;
		try {
			originalApplication = NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
		} catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		NcraApplicantDetailInfo applicantDetail = null;
		try {
			applicantDetail = NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraRenewalApplicationId);
		} catch (Exception e) {
			_log.error("Error*************************" + e.getMessage());
		}
		if (applicantDetail == null) {
			applicantDetail = NcraApplicantDetailInfoLocalServiceUtil
					.createNcraApplicantDetailInfo(CounterLocalServiceUtil.increment());
		}
		if (originalApplication != null) {
			applicantDetail.setApplicantLocation(originalApplication.getApplicantLocation());
			applicantDetail.setApplicantEmailAddr(originalApplication.getApplicantEmailAddr());
			applicantDetail.setApplicantFaxNo(originalApplication.getApplicantFaxNo());
			applicantDetail.setApplicantTeleNum(originalApplication.getApplicantTeleNum());
			applicantDetail.setApplicantContact(originalApplication.getApplicantContact());
			applicantDetail.setApplicantAddress(originalApplication.getApplicantAddress());
			applicantDetail.setApplicantBusinessName(originalApplication.getApplicantBusinessName());
			applicantDetail.setNcraApplicationId(ncraRenewalApplicationId);
			NcraApplicantDetailInfoLocalServiceUtil.updateNcraApplicantDetailInfo(applicantDetail);
		}
		NcraFeeSubmission originalFeeSubmission = null;
		NcraFeeSubmission newFeeSubmission = null;
		try {
			originalFeeSubmission = NcraFeeSubmissionLocalServiceUtil.getNcraFee_By_NCRA_Id(ncraApplicationId);
		} catch (Exception e) {
		}

		try {
			newFeeSubmission = NcraFeeSubmissionLocalServiceUtil.getNcraFee_By_NCRA_Id(ncraApplicationId);
		} catch (NoSuchNcraFeeSubmissionException e) {
		}
		if (newFeeSubmission == null) {
			newFeeSubmission = NcraFeeSubmissionLocalServiceUtil
					.createNcraFeeSubmission(CounterLocalServiceUtil.increment());
		}
		newFeeSubmission.setCreditStatus(originalFeeSubmission.getCreditStatus());
		newFeeSubmission.setNcraApplicationId(ncraRenewalApplicationId);
		NcraFeeSubmissionLocalServiceUtil.updateNcraFeeSubmission(newFeeSubmission);

		List<NcraVerifyWeighingDeviceInfo> newWeighingDeviceinfo = null;
		try {
			newWeighingDeviceinfo = NcraVerifyWeighingDeviceInfoLocalServiceUtil
					.getNcraVerify_By_DataList(ncraApplicationId);
		} catch (Exception e) {
		}
		if (newWeighingDeviceinfo != null) {
			for (NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo : newWeighingDeviceinfo) {
				NcraVerifyWeighingDeviceInfo newWeigh = NcraVerifyWeighingDeviceInfoLocalServiceUtil
						.createNcraVerifyWeighingDeviceInfo(CounterLocalServiceUtil.increment());
				newWeigh.setCounter(ncraVerifyWeighingDeviceInfo.getCounter());
				newWeigh.setTypeofDevice(ncraVerifyWeighingDeviceInfo.getTypeofDevice());
				newWeigh.setManufacturer(ncraVerifyWeighingDeviceInfo.getManufacturer());
				newWeigh.setSerialNumber(ncraVerifyWeighingDeviceInfo.getSerialNumber());
				newWeigh.setQuantity(ncraVerifyWeighingDeviceInfo.getQuantity());
				newWeigh.setMaximumCapacity(ncraVerifyWeighingDeviceInfo.getMaximumCapacity());
				newWeigh.setNcraApplicationId(ncraRenewalApplicationId);
				NcraVerifyWeighingDeviceInfoLocalServiceUtil.updateNcraVerifyWeighingDeviceInfo(newWeigh);
			}
		}
		NcraVerifyWeighingDate originalWeightDate = null;
		NcraVerifyWeighingDate newWeightDate = null;
		try {
			originalWeightDate = NcraVerifyWeighingDateLocalServiceUtil.getNcraVerify_By_Date(ncraApplicationId);
		} catch (Exception e) {
		}
		try {
			newWeightDate = NcraVerifyWeighingDateLocalServiceUtil.getNcraVerify_By_Date(ncraRenewalApplicationId);
		} catch (Exception e) {
		}
		if (newWeightDate == null) {
			newWeightDate = NcraVerifyWeighingDateLocalServiceUtil
					.createNcraVerifyWeighingDate(CounterLocalServiceUtil.increment());
		}
		try {
			newWeightDate.setWeighingDate(originalWeightDate.getWeighingDate());
		} catch (Exception e) {
			// TODO: handle exception
		}
		newWeightDate.setNcraApplicationId(ncraRenewalApplicationId);
		NcraVerifyWeighingDateLocalServiceUtil.updateNcraVerifyWeighingDate(newWeightDate);

	}

	@Reference
	DLAppService _dlAppService;
}