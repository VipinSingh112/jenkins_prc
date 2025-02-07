package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppService;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationWorkflowConstant;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil;
import com.nbp.hsra.application.service.service.HsraApplicationPaymentLocalServiceUtil;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpStatus;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/submit/application" }, service = MVCResourceCommand.class)

public class SubmitHSRAApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitHSRAApplicationResourceCommand.class);
	private static DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String typeOfActivities = ParamUtil.getString(resourceRequest, "typeOfActivities");
		String categoryOne = ParamUtil.getString(resourceRequest, "categoryOne");
		String categoryTwo = ParamUtil.getString(resourceRequest, "categoryTwo");
		String categoryThree = ParamUtil.getString(resourceRequest, "categoryThree");
		String categoryFour = ParamUtil.getString(resourceRequest, "categoryFour");
		String categoryFive = ParamUtil.getString(resourceRequest, "categoryFive");
		String riskLevel = ParamUtil.getString(resourceRequest, "riskLevel");
		String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfApplication");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String brokerTransactionType = ParamUtil.getString(resourceRequest, "brokerTransactionType");
		String specificApplicable = ParamUtil.getString(resourceRequest, "specificApplicable");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String saveAndContinue = ParamUtil.getString(resourceRequest, "saveAndContinue");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String qualifiedArea = ParamUtil.getString(resourceRequest, "qualifiedArea");
		String checkForSendingPdfInTheLanchCaseWithOutdOC = "false";
		HsraApplication hsraApplication = null;
		try {
			hsraApplication = HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(hsraApplication)) {
			hsraApplication = HsraApplicationLocalServiceUtil
					.createHsraApplication(CounterLocalServiceUtil.increment(HsraApplication.class.getName()));
		}
		hsraApplication.setGroupId(themeDisplay.getScopeGroupId());
		hsraApplication.setCompanyId(themeDisplay.getCompanyId());
		hsraApplication.setCreateDate(new Date());
		hsraApplication.setUserId(themeDisplay.getUserId());
		hsraApplication.setUserName(themeDisplay.getUser().getFullName());
		hsraApplication.setStatus(HSRAApplicationWorkflowConstant.DRAFT);
		hsraApplication.setCompanyId(themeDisplay.getCompanyId());
		if (Validator.isNull(hsraApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			hsraApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		HsraApplicationLocalServiceUtil.updateHsraApplication(hsraApplication);
		jsonOBJ.put("hsraAppNo", hsraApplication.getApplicationNumber());
		jsonOBJ.put("appStatus", HSRAApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", hsraApplication.getTypeOfApplicant());
		_log.info("Category is " + hsraApplication.getTypeOfApplicant());
		jsonOBJ.put("categoryOfSources", hsraApplication.getCategoryOfSources());
		_log.info("Category of source is " + hsraApplication.getCategoryOfSources());
		jsonOBJ.put("hsraApplicationId", hsraApplication.getHsraApplicationId());

		JSONObject launchCaseObject = JSONFactoryUtil.createJSONObject();
		// launchCaseArrayObject use to put launcCaseObject to complete array
		JSONArray launchCaseArrayObject = JSONFactoryUtil.createJSONArray();
		int amountDue = 0;
		int totalAmount = 0;
		JSONObject transactionNumJsonObject = JSONFactoryUtil.createJSONObject();
		JSONObject typeofApplicantObj = JSONFactoryUtil.createJSONObject();
		JSONObject paymentMethodObj = JSONFactoryUtil.createJSONObject();
		JSONObject amountDueObj = JSONFactoryUtil.createJSONObject();
		JSONObject dashboardUrlObj = JSONFactoryUtil.createJSONObject();
		JSONObject caseOriginObj = JSONFactoryUtil.createJSONObject();
		JSONObject typeOfAppOb = JSONFactoryUtil.createJSONObject();
		JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
		jsonObj.put("solutionType", "POHSR_ProcessingofApplicationsforGrantsofAuthorizations");
		// Property That Are Common For All Categories
		// Application Type---based on applicant type categories are devided for launch
		String typeOfApp = "";
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())) {
			if (hsraApplication.getTypeOfApplicant().equals("Service Providers")) {
				typeOfApp = "Services Providers";
			} else {
				typeOfApp = hsraApplication.getTypeOfApplicant();
			}
		}
		typeofApplicantObj.put("key", "POHSR_TypeofApplicant");
		typeofApplicantObj.put("value", typeOfApp);
		launchCaseArrayObject.put(typeofApplicantObj);
		transactionNumJsonObject.put("key", "POHSR_Transaction");
		transactionNumJsonObject.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getApplicationNumber())
						? hsraApplication.getApplicationNumber()
						: "");
		launchCaseArrayObject.put(transactionNumJsonObject);
		caseOriginObj.put("key", "POHSR_CaseOrigin");
		caseOriginObj.put("value", "Portal");
		launchCaseArrayObject.put(caseOriginObj);
		// Paymnet
		HsraApplicationPayment applicationPayment = null;
		try {
			applicationPayment = HsraApplicationPaymentLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		paymentMethodObj.put("key", "POHSR_PaymentMethod");
		paymentMethodObj.put("value",
				Validator.isNotNull(applicationPayment) && Validator.isNotNull(applicationPayment.getPaymentMethod())
						? applicationPayment.getPaymentMethod()
						: "");
		launchCaseArrayObject.put(paymentMethodObj);

		// Applicant type ---User Radiation
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
				&& hsraApplication.getTypeOfApplicant().equals("Users of Radiation Sources")) {

			launchCaseForUserRadiation(launchCaseArrayObject, hsraApplication);

			// USER Radiation ----50,000 totalFee-totalFee to calculate amount due
			totalAmount = 50000;
			typeOfAppOb.put("key", "POHSR_TypeofApplication");
			typeOfAppOb.put("value", "Application for Licence");
			launchCaseArrayObject.put(typeOfAppOb);
		}
		// Applicant type ---Brokers
		else if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
				&& hsraApplication.getTypeOfApplicant().equals("Brokers")) {
			launchCaseForBroker(launchCaseArrayObject, hsraApplication);
			// Broker ----20,000 -totalFee to calculate amount due
			totalAmount = 20000;
		}
		// Applicant type ---Qualified
		else if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
				&& hsraApplication.getTypeOfApplicant().equals("Qualified Experts")) {
			launchCaseForQualifiedExpert(launchCaseArrayObject, hsraApplication);
			// Qualified ----50,000 totalFee totalFee to calculate amount due

			totalAmount = 50000;
		}
		// Applicant type ---Service
		else if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
				&& hsraApplication.getTypeOfApplicant().equals("Service Providers")) {
			launchCaseForUserRadiation(launchCaseArrayObject, hsraApplication);// Radiation and service
																				// share common forms
																				// and properties
			// Service Provider ----20,000 totalFee totalFee to calculate amount due
			totalAmount = 20000;
			typeOfAppOb.put("key", "POHSR_TypeofApplication");
			typeOfAppOb.put("value", "Application for Licence");
			launchCaseArrayObject.put(typeOfAppOb);
		}

		String paidAmount = Validator.isNotNull(applicationPayment)
				&& Validator.isNotNull(applicationPayment.getAmountPaid()) ? applicationPayment.getAmountPaid() : "";
		amountDueObj.put("key", "POHSR_AmountDue");
		amountDueObj.put("value", totalAmount);
		launchCaseArrayObject.put(amountDueObj);
		String dashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
				+ "/hsra-application-form?hsraApplicationId=";
		dashboarUrl = dashboarUrl + String.valueOf(hsraApplication.getHsraApplicationId());
		dashboardUrlObj.put("key", "POHSR_DashboardURL");
		dashboardUrlObj.put("value", dashboarUrl);
		launchCaseArrayObject.put(dashboardUrlObj);
		jsonObj.put("properties", launchCaseArrayObject);
		_log.info("Request json--------------" + jsonObj.toString());
		String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("icm-launch-case-url");
		_log.info("*************launchCaseUrl in HSRA************" + launchCaseUrl);
		String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("create-case-endpoint");
		_log.info("*************createCaseEndPoint in HSRA************" + createCaseEndPoint);
		Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("bpm-enabled");
		_log.info("*************isBPMEnabled in HSRA************" + isBPMEnabled);
		String token = null;
		String objectStoreValue = null;
		try {
			token = commonsUtil.getToken(themeDisplay, launchCaseUrl);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay, token, "114", launchCaseUrl);
		} catch (Exception e2) {
		}
		if (isBPMEnabled) {
			try {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObj.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");
				if (response.getCode() == HttpStatus.SC_OK) {
					HsraApplication subiApplications = HsraApplicationLocalServiceUtil
							.getHsraApplication(hsraApplication.getHsraApplicationId());
					subiApplications.setCaseId(caseId);
					subiApplications.setIcmDocumentsPath(path);
					subiApplications.setStatus(HSRAApplicationWorkflowConstant.SUBMITTED);
					jsonOBJ.put("hsraAppNo", hsraApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", HSRAApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", hsraApplication.getTypeOfApplicant());
					jsonOBJ.put("categoryOfSources", hsraApplication.getCategoryOfSources());
					jsonOBJ.put("hsraApplicationId", hsraApplication.getHsraApplicationId());
					HsraApplicationLocalServiceUtil.updateHsraApplication(subiApplications);
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"HSRA Supporting Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(hsraApplication.getHsraApplicationId()));
					ArrayList<File> filez = new ArrayList<File>();
					List<Folder> folder = null;
					Folder specificFolder = null;
					List<DLFileEntry> fileEntries = null;
					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");
					System.out.println("uploadFilesEndPoint----------" + uploadFilesEndPoint);
					try {
						// sending all documents
						folder = _dlAppLocalService.getFolders(themeDisplay.getScopeGroupId(),
								supportingDocumentsFolder.getFolderId(), true);
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("Hsra Application Form PDF")
									&& !allSupportingFolder.getName().equals("Signature of Representative")
									&& !allSupportingFolder.getName().contains("Signature of Acknowledgement Medical")
									&& !allSupportingFolder.getName().contains("Signature of Applicant Medical")
									&& !allSupportingFolder.getName().contains("Signature of Equip")
									&& !allSupportingFolder.getName().contains("Signature of Broker")
									&& !allSupportingFolder.getName().contains("Signature of Declaration")
									&& !allSupportingFolder.getName().contains("Signature of Quality Expert")
									&& !allSupportingFolder.getName().contains("Signature of Service Declaration")
									&& !allSupportingFolder.getName().contains("Signature")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									System.out.println("Added----------" + dlfile.getName());
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						for (File supportingDocs : filez) {
							HttpResponse<String> documentUploadresponse = Unirest
									.post(launchCaseUrl + uploadFilesEndPoint
											+ "?classList=POHSR_SupportingDocuments&tos="+objectStoreValue)
									.field("path", path + "/01.Application Submission-Creation")
									.field("files", supportingDocs).asString();
							_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
						}
						filez.clear();
						DLFolder paymentFee = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
								supportingDocumentsParentFolder.getFolderId(), "Fee Reciept");
						List<DLFileEntry> payEntries = DLFileEntryLocalServiceUtil
								.getFileEntries(themeDisplay.getScopeGroupId(), paymentFee.getFolderId());
						for (DLFileEntry dlFileEntry : payEntries) {
							filez.add(generateFileByInputStream(dlFileEntry));
						}
						for (File supportingDocs : filez) {
							HttpResponse<String> documentUploadresponse = Unirest
									.post(launchCaseUrl + uploadFilesEndPoint
											+ "?tos="+objectStoreValue+"&classList=POHSR_PaymentReceipt")
									.field("path", path + "/01.Application Submission-Creation")
									.field("files", supportingDocs).asString();
							_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
						}
						fileEntries.clear();
					} catch (Exception e) {
					}

					try {
						String pdfTemplate = "";
						if (hsraApplication.getTypeOfApplicant().equals("Qualified Experts")) {
							pdfTemplate = commonsUtil.replaceHsraApplicationPdfVar("Qualified Experts",
									hsraApplication.getHsraApplicationId(), themeDisplay,
									checkForSendingPdfInTheLanchCaseWithOutdOC);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"qualified-experts-1", pdfTemplate);
							filez.add(file);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest
										.post(launchCaseUrl + uploadFilesEndPoint
												+ "?tos="+objectStoreValue+"&classList=POHSR_QEApplicationForm")
										.field("path", path + "/01.Application Submission-Creation")
										.field("files", supportingDocs).asString();
								_log.info(
										"document service resonse ----------------" + documentUploadresponse.getCode());
							}

						} else if (hsraApplication.getTypeOfApplicant().equals("Brokers")) {
							pdfTemplate = commonsUtil.replaceHsraApplicationPdfVar("Brokers",
									hsraApplication.getHsraApplicationId(), themeDisplay,
									checkForSendingPdfInTheLanchCaseWithOutdOC);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"brokers-1", pdfTemplate);
							filez.add(file);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest
										.post(launchCaseUrl + uploadFilesEndPoint
												+ "?tos="+objectStoreValue+"&classList=POHSR_NSRPApplicationForm")
										.field("path", path + "/01.Application Submission-Creation")
										.field("files", supportingDocs).asString();
								_log.info(
										"document service resonse ----------------" + documentUploadresponse.getCode());
							}
						} else if (hsraApplication.getTypeOfApplicant().equals("Service Providers")) {
							pdfTemplate = commonsUtil.replaceHsraApplicationPdfVar("Service Providers",
									hsraApplication.getHsraApplicationId(), themeDisplay,
									checkForSendingPdfInTheLanchCaseWithOutdOC);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"services-1", pdfTemplate);
							filez.add(file);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest
										.post(launchCaseUrl + uploadFilesEndPoint
												+ "?tos="+objectStoreValue+"&classList=POHSR_NSRPApplicationForm")
										.field("path", path + "/01.Application Submission-Creation")
										.field("files", supportingDocs).asString();
								_log.info(
										"document service resonse ----------------" + documentUploadresponse.getCode());
							}
						} else if (hsraApplication.getTypeOfApplicant().equals("Users of Radiation Sources")) {
							pdfTemplate = commonsUtil.replaceHsraApplicationPdfVar("Users of Radiation Sources",
									hsraApplication.getHsraApplicationId(), themeDisplay,
									checkForSendingPdfInTheLanchCaseWithOutdOC);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"users-of-radiation-sources-1", pdfTemplate);
							filez.add(file);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest
										.post(launchCaseUrl + uploadFilesEndPoint
												+ "?tos="+objectStoreValue+"&classList=POHSR_NSRPApplicationForm")
										.field("path", path + "/01.Application Submission-Creation")
										.field("files", supportingDocs).asString();
								_log.info(
										"document service resonse ----------------" + documentUploadresponse.getCode());
							}
						}

					} catch (Exception e) {
						_log.error(e.getMessage());
					}
					_log.info("path--------------" + path);
					// Sending Email After Form Submission
					try {
						String CategoryTypeUpperCase = hsraApplication.getTypeOfApplicant().toUpperCase();
						String subcategoryUpperCase = hsraApplication.getTypeOfActivities().toUpperCase();
						String childcategoryUpperCase = hsraApplication.getTypeOfTransaction().toUpperCase();

						String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"successful-application-submission-email-template");
						if (Validator.isNotNull(body)) {
							body = StringUtil.replace(body,
									new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
											"[$Category$]", "[$subCategory$]", "[$childCategory$]", "[$transactionNo$]",
											"[$dashboardURL$]" },

									new String[] { themeDisplay.getUser().getFullName(),
											"HSRA - Grants of Authorizations", "entityName", CategoryTypeUpperCase,
											subcategoryUpperCase, childcategoryUpperCase,
											hsraApplication.getApplicationNumber(), dashboarUrl });
						}
						commonsUtil.sendMailToUsers("Your Application Submitted",
								"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
								body);
						_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

					} catch (Exception e) {
						e.printStackTrace();
					}
					_log.info("submit application end--------------------------------");
				}
			} catch (Exception e) {
			}
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");
			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (java.io.IOException e) {
			}

		}
		return false;
	}

	public File generateFileByInputStream(DLFileEntry dlFileEntry) throws PortalException {
		InputStream inputStream = DLFileEntryLocalServiceUtil.getFileAsStream(dlFileEntry.getFileEntryId(),
				dlFileEntry.getVersion());
		File file = createPDFFile(dlFileEntry.getFileName());
		try (OutputStream outputStream = new FileOutputStream(file)) {
			IOUtils.copy(inputStream, outputStream);
		} catch (FileNotFoundException e) {
			// handle exception here
		} catch (IOException e) {
			// handle exception here
		}
		return file;
	}

	private static File getExportDirectory() {
		String exportDirPath = System.getProperty("catalina.base") + "//temp//supporting-documents";
		File exportDir = new File(exportDirPath);

		if (!exportDir.exists()) {
			exportDir.mkdir();
		}
		return exportDir;
	}

	private static File createPDFFile(String fileName) {
		File reportFile = null;
		File exportDir = getExportDirectory();
		StringBuffer reportFileName = new StringBuffer(exportDir.getAbsolutePath()).append("//").append(fileName);
		reportFile = new File(reportFileName.toString());

		return reportFile;
	}

	public static JSONArray launchCaseForUserRadiation(JSONArray launchCasePropertiesArray,
			HsraApplication hsraApplication) {
		_log.info("[USER RADIATION-PROPERTY----MAPPING STARTRD]");
		System.out.println("Application--------------------" + hsraApplication);
		/**
		 * properties that are related to only usereRadiation Category are integrated in
		 * it
		 * 
		 * @param launchCasePropertiesObj: object that contain all the properties for
		 *                                 posting data inside array
		 * @param hsraApplicationObj:      object that contain all the data for specific
		 *                                 user
		 */
		JSONObject typeofActivityObj = JSONFactoryUtil.createJSONObject();
		JSONObject typeofApplicationObj = JSONFactoryUtil.createJSONObject();
		JSONObject typeofTransactionObj = JSONFactoryUtil.createJSONObject();
		JSONObject licenceRegistrationPracticesActivityObj = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty1 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty2 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty3 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty4 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty5 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty6 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty7 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty8 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty9 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty10 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty11 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty12 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty13 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty14 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty15 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty16 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty17 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty18 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty19 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty20 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty21 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty22 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty23 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty24 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty25 = JSONFactoryUtil.createJSONObject();
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
				&& hsraApplication.getTypeOfApplicant().equals("Users of Radiation Sources")) {
			_log.info("[USER RADIATION-PROPERTY----MAPPING STARTRD]");
			try {
				if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getHighOne())) {
					JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
					equipmentListJsonObj.put("key", "POHSR_Category1BO");
					JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();

					String[] highOne = hsraApplication.getHighOne().split(",");
					for (String string : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
						if (string.equals("High energy accelerators (Linacs Cyclotron)")) {
							string = "High energy accelerators (Linacs Cyclotron)";
						}
						propertiesObject1.put("name", "POHSR_Category1");
						propertiesObject1.put("value", "1");
						jsonArrayProp.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice1");
						propertiesObject2.put("value", string);
						jsonArrayProp.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD1");
						propertiesObject3.put("value", "A/D \u2265 1000 or Personally extremely dangerous");
						jsonArrayProp.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk1");
						propertiesObject4.put("value", "High");
						jsonArrayProp.put(propertiesObject4);
						equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
						jsonArrayObjects.put(equipmentListObjectValueJsonObj);

					}
					equipmentListValueJsonObj.put("objects", jsonArrayObjects);

					equipmentListJsonObj.put("value", equipmentListValueJsonObj);
					launchCasePropertiesArray.put(equipmentListJsonObj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getHighTwo())) {
					JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
					equipmentListJsonObj.put("key", "POHSR_Category2BO");
					JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
					String[] highOne = hsraApplication.getHighTwo().split(",");
					for (String string : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category2");
						propertiesObject1.put("value", "2");
						jsonArrayProp.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice2");
						propertiesObject2.put("value", string);
						jsonArrayProp.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD2");
						propertiesObject3.put("value", "1000 > A/D\u2265 10 or Personally very dangerous");
						jsonArrayProp.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk2");
						propertiesObject4.put("value", "High");
						jsonArrayProp.put(propertiesObject4);
						equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
						jsonArrayObjects.put(equipmentListObjectValueJsonObj);

					}
					equipmentListValueJsonObj.put("objects", jsonArrayObjects);

					equipmentListJsonObj.put("value", equipmentListValueJsonObj);
					launchCasePropertiesArray.put(equipmentListJsonObj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getMedium())) {
					JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
					equipmentListJsonObj.put("key", "POHSR_Category3BO");
					JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
					String[] highOne = hsraApplication.getMedium().split(",");
					for (String string : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category3");
						propertiesObject1.put("value", "3");
						jsonArrayProp.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice3");
						propertiesObject2.put("value", string);
						jsonArrayProp.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD3");
						propertiesObject3.put("value", "10 >A/D\u2265 1 or Personally dangerous");
						jsonArrayProp.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk3");
						propertiesObject4.put("value", "High");
						jsonArrayProp.put(propertiesObject4);
						equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
						jsonArrayObjects.put(equipmentListObjectValueJsonObj);

					}
					equipmentListValueJsonObj.put("objects", jsonArrayObjects);

					equipmentListJsonObj.put("value", equipmentListValueJsonObj);
					launchCasePropertiesArray.put(equipmentListJsonObj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getLowOne())) {
					JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
					equipmentListJsonObj.put("key", "POHSR_Category4BO");
					JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
					String[] highOne = hsraApplication.getLowOne().split(",");
					for (String string : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category4");
						propertiesObject1.put("value", "4");
						jsonArrayProp.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice4");
						propertiesObject2.put("value", string);
						jsonArrayProp.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD4");
						propertiesObject3.put("value", "1 >A/D\u2265 0.01 or Unlikely to be dangerous");
						jsonArrayProp.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk4");
						propertiesObject4.put("value", "High");
						jsonArrayProp.put(propertiesObject4);
						equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
						jsonArrayObjects.put(equipmentListObjectValueJsonObj);

					}
					equipmentListValueJsonObj.put("objects", jsonArrayObjects);
					equipmentListJsonObj.put("value", equipmentListValueJsonObj);
					launchCasePropertiesArray.put(equipmentListJsonObj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getLowTwo())) {
					JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
					equipmentListJsonObj.put("key", "POHSR_Category5BO");
					JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
					String[] highOne = hsraApplication.getLowTwo().split(",");
					for (String string : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category5");
						propertiesObject1.put("value", "5");
						jsonArrayProp.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice5");
						propertiesObject2.put("value", string);
						jsonArrayProp.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD5");
						propertiesObject3.put("value", "0.01 >and A\u2265 exempt or Not dangerous");
						jsonArrayProp.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk5");
						propertiesObject4.put("value", "High");
						jsonArrayProp.put(propertiesObject4);
						equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
						jsonArrayObjects.put(equipmentListObjectValueJsonObj);

					}
					equipmentListValueJsonObj.put("objects", jsonArrayObjects);
					equipmentListJsonObj.put("value", equipmentListValueJsonObj);
					launchCasePropertiesArray.put(equipmentListJsonObj);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		_log.info("[USER RADIATION-PROPERTY----MAPPING STARTRD]");
		if (hsraApplication.getTypeOfActivities().equals("Manufacturer")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Manufacturer");
			launchCasePropertiesArray.put(typeofActivityObj);
		} else if (hsraApplication.getTypeOfActivities().equals("Service Provider")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Service Provider");
			launchCasePropertiesArray.put(typeofActivityObj);
		} else if (hsraApplication.getTypeOfActivities().equals("Possess and Use")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Possess and Use");
			launchCasePropertiesArray.put(typeofActivityObj);
		} else if (hsraApplication.getTypeOfActivities().equals("Possess and Store")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Possess and Store");
			launchCasePropertiesArray.put(typeofActivityObj);
		} else if (hsraApplication.getTypeOfActivities().equals("Decommissioning")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Decommissioning");
			launchCasePropertiesArray.put(typeofActivityObj);
		} else if (hsraApplication.getTypeOfActivities().equals("Possess and Handle")) {
			typeofActivityObj.put("key", "POHSR_TypeofActivity");
			typeofActivityObj.put("value", "Possess and Handle");
			launchCasePropertiesArray.put(typeofActivityObj);
		}
		_log.info("[USER RADIATION-PROPERTY----MAPPING STARTRD]");
		typeofTransactionObj.put("key", "POHSR_TypeofTransaction");
		typeofTransactionObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfTransaction())
						? hsraApplication.getTypeOfTransaction()
						: "");
		launchCasePropertiesArray.put(typeofTransactionObj);

		String specific = "";
		JSONArray specificJsonArray = JSONFactoryUtil.createJSONArray();
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getSpecificApplicable())) {
			String[] split = hsraApplication.getSpecificApplicable().split(",");
			for (String string : split) {
				if (string.equals("(a)Medical Practices")) {
					specific = "(a)Medical Practices";
					System.out.println("Putting Values----------------" + specific);

					specificJsonArray.put(specific);
				} else if (string.equals("(b)Industrial Radiography")) {
					specific = "(b)Industrial Radiography";
					specificJsonArray.put(specific);
				} else if (string.equals("(c)Veterinary Nuclear Medicine")) {
					specific = "(c)Veterinary Nuclear Medicine";
					specificJsonArray.put(specific);
				} else if (string.equals("(d)Other Industries that use Nuclear Material")) {
					specific = "(d)Other Industries that use Nuclear Material";
					specificJsonArray.put(specific);
				} else if (string.equals("(e)Gauges (Fixed &amp; Portable)")) {
					specific = "(e)Gauges (Fixed & Portable)";
					specificJsonArray.put(specific);
				} else if (string.equals("(f)Petroleum Exploration (Well Logging)")) {
					specific = "(f)Petroleum Exploration (Well Logging)";
					specificJsonArray.put(specific);
				} else if (string.equals("(g)Servicing")) {
					specific = "(g)Servicing";
					specificJsonArray.put(specific);
				} else if (string.equals("(h)Manufacturing")) {
					specific = "(h)Manufacturing";
					specificJsonArray.put(specific);
				}
			}
		}
		if (Validator.isNotNull(specificJsonArray)) {
			licenceRegistrationPracticesActivityObj.put("key", "POHSR_LicenceRegistrationPracticesActivity");
			licenceRegistrationPracticesActivityObj.put("value", specificJsonArray);
			launchCasePropertiesArray.put(licenceRegistrationPracticesActivityObj);
		}
		// For radiation protection section 1
		RadiationProtectionSecOne radSectionOne = null;
		try {
			radSectionOne = RadiationProtectionSecOneLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty1.put("key", "POHSR_TypeofApplicant");
		caseProperty1.put("value",
				Validator.isNotNull(radSectionOne) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
						? hsraApplication.getTypeOfApplicant()
						: "");
		// launchCasePropertiesArray.put(caseProperty1);
		caseProperty3.put("key", "POHSR_Authorization");
		caseProperty3.put("value",
				Validator.isNotNull(radSectionOne) && Validator.isNotNull(radSectionOne.getCurrentAuthNum())
						? radSectionOne.getCurrentAuthNum()
						: "");
		launchCasePropertiesArray.put(caseProperty3);
		// section II
		DetailOfApplicantSecTwo applicantDetail = null;
		try {
			applicantDetail = DetailOfApplicantSecTwoLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty4.put("key", "POHSR_NameofOrganization");
		caseProperty4.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getOrganizationName())
						? applicantDetail.getOrganizationName()
						: "");
		launchCasePropertiesArray.put(caseProperty4);
		caseProperty5.put("key", "POHSR_MailingAddressPrincipalPlaceofBusiness");
		caseProperty5.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNuclearMailingAddr())
						? applicantDetail.getNuclearMailingAddr()
						: "");
		launchCasePropertiesArray.put(caseProperty5);
		caseProperty6.put("key", "POHSR_OrganizationsTRN");
		caseProperty6.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNuclearTrnNumber())
						? applicantDetail.getNuclearTrnNumber()
						: "");
		launchCasePropertiesArray.put(caseProperty6);
		caseProperty7.put("key", "POHSR_ApplicantEmailAddress");
		caseProperty7.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNuclearEmailAddr())
						? applicantDetail.getNuclearEmailAddr()
						: "");
		launchCasePropertiesArray.put(caseProperty7);
		caseProperty8.put("key", "POHSR_OrganizationFaxNumber");
		caseProperty8.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNuclearFaxNo())
						? applicantDetail.getNuclearFaxNo()
						: "");
		launchCasePropertiesArray.put(caseProperty8);
		caseProperty9.put("key", "POHSR_OrganizationTelephoneNumber");
		caseProperty9.put("value",
				Validator.isNotNull(applicantDetail) && Validator.isNotNull(applicantDetail.getNuclearTelephoneNo())
						? applicantDetail.getNuclearTelephoneNo()
						: "");
		launchCasePropertiesArray.put(caseProperty9);
		// section III
		DetailOfBusinessSecThree detailOfBusiness = null;
		try {
			detailOfBusiness = DetailOfBusinessSecThreeLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty10.put("key", "POHSR_TypeofBusiness");
		caseProperty10.put("value",
				Validator.isNotNull(detailOfBusiness) && Validator.isNotNull(detailOfBusiness.getBusinessType())
						? detailOfBusiness.getBusinessType()
						: "");
		launchCasePropertiesArray.put(caseProperty10);
		caseProperty12.put("key", "POHSR_BusinessNumber");
		caseProperty12.put("value",
				Validator.isNotNull(detailOfBusiness)
						&& Validator.isNotNull(detailOfBusiness.getNuclearBusinessNumber())
								? detailOfBusiness.getNuclearBusinessNumber()
								: "");
		launchCasePropertiesArray.put(caseProperty12);
		caseProperty13.put("key", "POHSR_CorporationNumber");
		caseProperty13.put("value",
				Validator.isNotNull(detailOfBusiness)
						&& Validator.isNotNull(detailOfBusiness.getNuclearCorporationNum())
								? detailOfBusiness.getNuclearCorporationNum()
								: "");
		launchCasePropertiesArray.put(caseProperty13);
		caseProperty14.put("key", "POHSR_ForPublicInstitutionsspecifytheenablinglegislationAct");
		caseProperty14.put("value",
				Validator.isNotNull(detailOfBusiness) && Validator.isNotNull(detailOfBusiness.getNuclearPublicAct())
						? detailOfBusiness.getNuclearPublicAct()
						: "");
		// SECTION IV
		PurposeOfPropLicence purposeLicence = null;
		try {
			purposeLicence = PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}

		caseProperty16.put("key", "POHSR_LicenceRegistrationPracticesActivity");
		caseProperty16.put("value",
				Validator.isNotNull(purposeLicence) && Validator.isNotNull(purposeLicence.getNuclearRegstLic())
						? purposeLicence.getNuclearRegstLic()
						: "");
		// launchCasePropertiesArray.put(caseProperty16);
		caseProperty17.put("key", "POHSR_AddressofPlaceofBusiness");
		caseProperty17.put("value",
				Validator.isNotNull(purposeLicence) && Validator.isNotNull(purposeLicence.getNuclearBusinessPlace())
						? purposeLicence.getNuclearBusinessPlace()
						: "");
		launchCasePropertiesArray.put(caseProperty17);
		caseProperty18.put("key", "POHSR_Mainaddressofstorageandoruseoranyotheractivity");
		caseProperty18.put("value",
				Validator.isNotNull(purposeLicence) && Validator.isNotNull(purposeLicence.getNuclearActivityMainAdd())
						? purposeLicence.getNuclearActivityMainAdd()
						: "");
		String address = "";
		if (Validator.isNotNull(purposeLicence) && Validator.isNotNull(purposeLicence.getApplicationType())) {
			if (purposeLicence.getApplicationType().equals("Used at")) {
				address = "Used at";
			} else if (purposeLicence.getApplicationType().equals("Stored at")) {
				address = "Stored at";
			} else if (purposeLicence.getApplicationType().equals("Both")) {
				address = "Both";
			}

		}
		if (Validator.isNotNull(address)) {
			launchCasePropertiesArray.put(caseProperty18);
			caseProperty19.put("key", "POHSR_MainAddressSelection");
			caseProperty19.put("value", address);
			launchCasePropertiesArray.put(caseProperty19);
		}
		// i. Qualified Expert Details

		RadiationSafetyProgram radiationSafetyProgram = null;
		try {
			radiationSafetyProgram = RadiationSafetyProgramLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
			System.out.println("radiation safety-------------------" + radiationSafetyProgram.getQualifiedExpertName());
			System.out.println("radiation safety-------------------" + radiationSafetyProgram.getQualifiedExpertTele());

		} catch (Exception e) {
			System.out.println("radiation safety-------------------");
			e.printStackTrace();
		}
		// caseProperty20.put("key", "POHSR_ID");
		// caseProperty20.put("value",
		// Validator.isNotNull(radiationSafetyProgram)&&Validator.isNotNull(radiationSafetyProgram.getApplicationType())?purposeLicence.getApplicationType():"");
		// launchCasePropertiesArray.put(caseProperty20);
		caseProperty21.put("key", "POHSR_FirstName");
		caseProperty21.put("value",
				Validator.isNotNull(radiationSafetyProgram)
						&& Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertName())
								? radiationSafetyProgram.getQualifiedExpertName()
								: "");
		launchCasePropertiesArray.put(caseProperty21);
		caseProperty22.put("key", "POHSR_Surname");
		caseProperty22.put("value",
				Validator.isNotNull(radiationSafetyProgram)
						&& Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertName())
								? radiationSafetyProgram.getQualifiedExpertName()
								: "");
		// launchCasePropertiesArray.put(caseProperty22);
		caseProperty23.put("key", "POHSR_Position");
		caseProperty23.put("value",
				Validator.isNotNull(radiationSafetyProgram)
						&& Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertTitle())
								? radiationSafetyProgram.getQualifiedExpertTitle()
								: "");
		launchCasePropertiesArray.put(caseProperty23);
		caseProperty24.put("key", "POHSR_TelephoneNumber");
		caseProperty24.put("value",
				Validator.isNotNull(radiationSafetyProgram)
						&& Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertTele())
								? radiationSafetyProgram.getQualifiedExpertTele()
								: "");
		launchCasePropertiesArray.put(caseProperty24);
		caseProperty25.put("key", "POHSR_ApplicantEmailAddress");
		caseProperty25.put("value",
				Validator.isNotNull(radiationSafetyProgram)
						&& Validator.isNotNull(radiationSafetyProgram.getQualifiedExpertEmail())
								? radiationSafetyProgram.getQualifiedExpertEmail()
								: "");
		launchCasePropertiesArray.put(caseProperty25);
		_log.info("[USER RADIATION-PROPERTY----MAPPING END]");
		return launchCasePropertiesArray;
	}

	public static void launchCaseForBroker(JSONArray launchCasePropertiesArray, HsraApplication hsraApplication) {
		_log.info("[BROKER-PROPERTY----MAPPING START]");
		/**
		 * properties that are related to only broker Category are integrated in it
		 * 
		 * @param launchCasePropertiesObj: object that contain all the properties for
		 *                                 posting data inside array
		 * @param hsraApplicationObj:      object that contain all the data for specific
		 *                                 user
		 */
		JSONObject typeofTransactionObj = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty1 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty2 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty3 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty4 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty5 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty6 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty7 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty8 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty9 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty10 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty11 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty12 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty13 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty14 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty15 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty16 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty17 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty18 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty19 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty20 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty21 = JSONFactoryUtil.createJSONObject();
		typeofTransactionObj.put("key", "POHSR_TypeofTransaction2");
		typeofTransactionObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getBrokerTransactionType())
						? hsraApplication.getBrokerTransactionType()
						: "");
		launchCasePropertiesArray.put(typeofTransactionObj);
		BrokerRegistrationInfo brokerRegst = null;
		try {
			brokerRegst = BrokerRegistrationInfoLocalServiceUtil.getHsraById(hsraApplication.getHsraApplicationId());
			System.out.println("brokerRegst------------------" + brokerRegst);
		} catch (Exception e) {
			System.out.println("System.out.println(\"brokerRegst------------------\"+brokerRegst);------------------"
					+ hsraApplication.getHsraApplicationId());
			e.printStackTrace();
		}
		caseProperty1.put("key", "POHSR_TypeofApplicant");
		caseProperty1.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfApplicant())
						? hsraApplication.getTypeOfApplicant()
						: "");
		launchCasePropertiesArray.put(caseProperty1);
		caseProperty2.put("key", "POHSR_NameofOrganization");
		caseProperty2.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getOrganizationNameD())
						? brokerRegst.getOrganizationNameD()
						: "");
		launchCasePropertiesArray.put(caseProperty2);
		caseProperty3.put("key", "POHSR_MailingAddressPrincipalPlaceofBusiness");
		caseProperty3.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getBusinessPlace())
						? brokerRegst.getBusinessPlace()
						: "");
		launchCasePropertiesArray.put(caseProperty3);
		caseProperty4.put("key", "POHSR_OrganizationsTRN");
		caseProperty4.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getOrganizationTrn())
						? brokerRegst.getOrganizationTrn()
						: "");
		launchCasePropertiesArray.put(caseProperty4);
		caseProperty5.put("key", "POHSR_OrganizationTelephoneNumber");
		caseProperty5.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getOrganizationTeleNum())
						? brokerRegst.getOrganizationTeleNum()
						: "");
		launchCasePropertiesArray.put(caseProperty5);
		caseProperty6.put("key", "POHSR_OrganizationFaxNumber");
		caseProperty6.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getOrganizationFaxNum())
						? brokerRegst.getOrganizationFaxNum()
						: "");
		launchCasePropertiesArray.put(caseProperty6);
		caseProperty7.put("key", "POHSR_ApplicantEmailAddress");
		caseProperty7.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getOrganizationEmailAdd())
						? brokerRegst.getOrganizationEmailAdd()
						: "");
		launchCasePropertiesArray.put(caseProperty7);
		caseProperty8.put("key", "POHSR_TypeofBusiness");
		caseProperty8.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getBusinessTypeBroker())
						? brokerRegst.getBusinessTypeBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty8);
		caseProperty9.put("key", "POHSR_BusinessNumber");
		caseProperty9.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getBusinessNumberBroker())
						? brokerRegst.getBusinessNumberBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty9);
		caseProperty10.put("key", "POHSR_CorporationNumber");
		caseProperty10.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getCorporationNumberBroker())
						? brokerRegst.getCorporationNumberBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty10);
		caseProperty21.put("key", "POHSR_ForPublicInstitutionsspecifytheenablinglegislationAct");
		caseProperty21.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getPublicActBroker())
						? brokerRegst.getPublicActBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty21);
		caseProperty11.put("key", "POHSR_PreviousLicenceRegistration");
		caseProperty11.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getLicenceNumberBroker())
						? brokerRegst.getLicenceNumberBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty11);

		caseProperty12.put("key", "POHSR_PreviousLicenceRegistration");
		caseProperty12.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getLicenceNumberBroker())
						? brokerRegst.getLicenceNumberBroker()
						: "");
		launchCasePropertiesArray.put(caseProperty12);

		caseProperty13.put("key", "POHSR_PreviousLicenceRegistrationExpirationDate");
		caseProperty13.put("value",
				Validator.isNotNull(brokerRegst) && Validator.isNotNull(brokerRegst.getExpirationDateBroker())
						? bpmDateFormat.format(brokerRegst.getExpirationDateBroker())
						: "");
		launchCasePropertiesArray.put(caseProperty13);
		_log.info("[BROKER-PROPERTY----MAPPING END]");

	}

	public static void launchCaseForQualifiedExpert(JSONArray launchCasePropertiesArray,
			HsraApplication hsraApplication) {
		_log.info("[QUALIFIED-PROPERTY----MAPPING START]");
		/**
		 * properties that are related to only Qualified Category are integrated in it
		 * 
		 * @param launchCasePropertiesObj: object that contain all the properties for
		 *                                 posting data inside array
		 * @param hsraApplicationObj:      object that contain all the data for specific
		 *                                 user
		 */
		JSONObject caseProperty1 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty2 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty3 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty4 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty5 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty6 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty7 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty8 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty9 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty10 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty11 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty12 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty13 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty14 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty15 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty16 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty17 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty18 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty19 = JSONFactoryUtil.createJSONObject();
		JSONObject caseProperty20 = JSONFactoryUtil.createJSONObject();
		QualityApplicantDetail qualityApplicant = null;
		try {
			qualityApplicant = QualityApplicantDetailLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty1.put("key", "POHSR_FirstName");
		caseProperty1.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertFirstName())
						? qualityApplicant.getExpertFirstName()
						: "");
		launchCasePropertiesArray.put(caseProperty1);
		caseProperty2.put("key", "POHSR_Surname");
		caseProperty2.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertSurname())
						? qualityApplicant.getExpertSurname()
						: "");
		launchCasePropertiesArray.put(caseProperty2);
		caseProperty3.put("key", "POHSR_Position");
		caseProperty3.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertPosition())
						? qualityApplicant.getExpertPosition()
						: "");
		launchCasePropertiesArray.put(caseProperty3);
		caseProperty4.put("key", "POHSR_TelephoneNumber");
		caseProperty4.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertTelephone())
						? qualityApplicant.getExpertTelephone()
						: "");
		launchCasePropertiesArray.put(caseProperty4);
		caseProperty5.put("key", "POHSR_MobileNumber");
		caseProperty5.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertMobile())
						? qualityApplicant.getExpertMobile()
						: "");
		launchCasePropertiesArray.put(caseProperty5);
		caseProperty6.put("key", "POHSR_ApplicantEmailAddress");
		caseProperty6.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertEmail())
						? qualityApplicant.getExpertEmail()
						: "");
		launchCasePropertiesArray.put(caseProperty6);
		caseProperty7.put("key", "POHSR_DateApplicationReceived");
		caseProperty7.put("value",
				Validator.isNotNull(qualityApplicant) && Validator.isNotNull(qualityApplicant.getExpertDate())
						? bpmDateFormat.format(qualityApplicant.getExpertDate())
						: "");
		launchCasePropertiesArray.put(caseProperty7);

		QualityEmploymentInfo employmentDetails = null;
		try {
			employmentDetails = QualityEmploymentInfoLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty8.put("key", "POHSR_CompanyName");
		caseProperty8.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getCompanyName())
						? employmentDetails.getCompanyName()
						: "");
		launchCasePropertiesArray.put(caseProperty8);
		caseProperty9.put("key", "POHSR_CompanyPhone");
		caseProperty9.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getTeleNo())
						? employmentDetails.getTeleNo()
						: "");
		launchCasePropertiesArray.put(caseProperty9);
		caseProperty11.put("key", "POHSR_CompanyAddress");
		caseProperty11.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getAddress())
						? employmentDetails.getAddress()
						: "");
		launchCasePropertiesArray.put(caseProperty11);
		caseProperty12.put("key", "POHSR_CompanyMobileNumber");
		caseProperty12.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getMobileNo())
						? employmentDetails.getMobileNo()
						: "");
		launchCasePropertiesArray.put(caseProperty12);
		caseProperty13.put("key", "POHSR_CompanyEmailAddress");
		caseProperty13.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getEmailAddress())
						? employmentDetails.getEmailAddress()
						: "");
		launchCasePropertiesArray.put(caseProperty13);
		caseProperty14.put("key", "POHSR_CompanyEmailAddress");
		caseProperty14.put("value",
				Validator.isNotNull(employmentDetails) && Validator.isNotNull(employmentDetails.getEmailAddress())
						? employmentDetails.getEmailAddress()
						: "");
		launchCasePropertiesArray.put(caseProperty14);
		QualityProficiencyDetail proficiencyDetail = null;
		try {
			proficiencyDetail = QualityProficiencyDetailLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}

		try {
			String trueValue="true"; 
			String falseValue="false"; 
			JSONObject equipmentListJsonObj = new JSONFactoryUtil().createJSONObject();
			equipmentListJsonObj.put("key", "POHSR_ProficiencyDetailsBO");
			JSONObject equipmentListValueJsonObj = new JSONFactoryUtil().createJSONObject();
			JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
			String[] highOne = hsraApplication.getLowTwo().split(",");
			JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
			JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
			JSONObject equipmentListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
			propertiesObject1.put("name", "POHSR_Checkbox");
			propertiesObject1.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
			        ? (proficiencyDetail.getProficiencyDetails().contains("Diagnostic Radiology") ? trueValue : falseValue)
			                : falseValue
			        );
			jsonArrayProp.put(propertiesObject1);
			propertiesObject2.put("name", "POHSR_QualifiedExpertArea");// choicelist
			propertiesObject2.put("value", "Diagnostic Radiology");
			jsonArrayProp.put(propertiesObject2);

			propertiesObject3.put("name", "POHSR_Durationofworkexperience");
			propertiesObject3.put("value",
					Validator.isNotNull(proficiencyDetail)
							&& Validator.isNotNull(proficiencyDetail.getWorkDurationOne())
									? proficiencyDetail.getWorkDurationOne()
									: "");
			jsonArrayProp.put(propertiesObject3);
			propertiesObject4.put("name", "POHSR_Capacity");
			propertiesObject4.put("value",
					Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityOne())
							? proficiencyDetail.getCapacityOne()
							: "");
			jsonArrayProp.put(propertiesObject4);
			equipmentListObjectValueJsonObj.put("properties", jsonArrayProp);
			jsonArrayObjects.put(equipmentListObjectValueJsonObj);
			try {
			JSONObject propertiesObject5 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject6 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject7 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject8 = new JSONFactoryUtil().createJSONObject();
			JSONArray jsonArrayProp1 = new JSONFactoryUtil().createJSONArray();
			JSONObject equipmentListObjectValueJsonObj2 = new JSONFactoryUtil().createJSONObject();
			propertiesObject5.put("name", "POHSR_Checkbox");
			propertiesObject5.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
					? (proficiencyDetail.getProficiencyDetails().contains("Radiotherapy") ? trueValue : falseValue)
							: falseValue
					);
			jsonArrayProp1.put(propertiesObject5);
			propertiesObject6.put("name", "POHSR_QualifiedExpertArea");// choicelist
			propertiesObject6.put("value", "Radiotherapy");
			jsonArrayProp1.put(propertiesObject6);
			
			propertiesObject7.put("name", "POHSR_Durationofworkexperience");
			propertiesObject7.put("value",
					Validator.isNotNull(proficiencyDetail)
					&& Validator.isNotNull(proficiencyDetail.getWorkDurationTwo())
					? proficiencyDetail.getWorkDurationTwo()
							: "");
			jsonArrayProp1.put(propertiesObject7);
			propertiesObject8.put("name", "POHSR_Capacity");
			propertiesObject8.put("value",
					Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityTwo())
					? proficiencyDetail.getCapacityTwo()
							: "");
			jsonArrayProp1.put(propertiesObject8);
			equipmentListObjectValueJsonObj2.put("properties", jsonArrayProp1);
			jsonArrayObjects.put(equipmentListObjectValueJsonObj2);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject9 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject10 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject11= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject12= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp2 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj3 = new JSONFactoryUtil().createJSONObject();
				propertiesObject9.put("name", "POHSR_Checkbox");
				propertiesObject9.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Nuclear Medicine") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp2.put(propertiesObject9);
				propertiesObject10.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject10.put("value", "Nuclear Medicine");
				jsonArrayProp2.put(propertiesObject10);
				
				propertiesObject11.put("name", "POHSR_Durationofworkexperience");
				propertiesObject11.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationThree())
						? proficiencyDetail.getWorkDurationThree()
								: "");
				jsonArrayProp2.put(propertiesObject11);
				propertiesObject12.put("name", "POHSR_Capacity");
				propertiesObject12.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityThree())
						? proficiencyDetail.getCapacityThree()
								: "");
				jsonArrayProp2.put(propertiesObject12);
				equipmentListObjectValueJsonObj3.put("properties", jsonArrayProp2);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj3);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject13 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject14 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject15= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject16= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp3 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj13 = new JSONFactoryUtil().createJSONObject();
				propertiesObject13.put("name", "POHSR_Checkbox");
				propertiesObject13.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Dentistry") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp3.put(propertiesObject13);
				propertiesObject14.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject14.put("value", "Dentistry");
				jsonArrayProp3.put(propertiesObject14);
				
				propertiesObject15.put("name", "POHSR_Durationofworkexperience");
				propertiesObject15.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationFour())
						? proficiencyDetail.getWorkDurationFour()
								: "");
				jsonArrayProp3.put(propertiesObject15);
				propertiesObject16.put("name", "POHSR_Capacity");
				propertiesObject16.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityFour())
						? proficiencyDetail.getCapacityFour()
								: "");
				jsonArrayProp3.put(propertiesObject16);
				equipmentListObjectValueJsonObj13.put("properties", jsonArrayProp3);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj13);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject17 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject18 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject19= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject20= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp4 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj4 = new JSONFactoryUtil().createJSONObject();
				propertiesObject17.put("name", "POHSR_Checkbox");
				propertiesObject17.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Veterinary Radiography") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp4.put(propertiesObject17);
				propertiesObject18.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject18.put("value", "Veterinary Radiography");
				jsonArrayProp4.put(propertiesObject18);
				
				propertiesObject19.put("name", "POHSR_Durationofworkexperience");
				propertiesObject19.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationFive())
						? proficiencyDetail.getWorkDurationFive()
								: "");
				jsonArrayProp4.put(propertiesObject19);
				propertiesObject20.put("name", "POHSR_Capacity");
				propertiesObject20.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityFive())
						? proficiencyDetail.getCapacityFive()
								: "");
				jsonArrayProp4.put(propertiesObject20);
				equipmentListObjectValueJsonObj4.put("properties", jsonArrayProp4);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj4);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject21 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject22 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject23= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject24= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp5 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj5 = new JSONFactoryUtil().createJSONObject();
				propertiesObject21.put("name", "POHSR_Checkbox");
				propertiesObject21.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Non-Destructive Testing") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp5.put(propertiesObject21);
				propertiesObject22.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject22.put("value", "Non-Destructive Testing");
				jsonArrayProp5.put(propertiesObject22);
				
				propertiesObject23.put("name", "POHSR_Durationofworkexperience");
				propertiesObject23.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationSix())
						? proficiencyDetail.getWorkDurationSix()
								: "");
				jsonArrayProp5.put(propertiesObject23);
				propertiesObject24.put("name", "POHSR_Capacity");
				propertiesObject24.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacitySix())
						? proficiencyDetail.getCapacitySix()
								: "");
				jsonArrayProp5.put(propertiesObject24);
				equipmentListObjectValueJsonObj5.put("properties", jsonArrayProp5);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj5);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject25 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject26 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject27= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject28= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp6 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj6 = new JSONFactoryUtil().createJSONObject();
				propertiesObject25.put("name", "POHSR_Checkbox");
				propertiesObject25.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Fixed Gauges and Fixed Screening Devices") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp6.put(propertiesObject25);
				propertiesObject26.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject26.put("value", "Fixed Gauges and Fixed Screening Devices");
				jsonArrayProp6.put(propertiesObject26);
				
				propertiesObject27.put("name", "POHSR_Durationofworkexperience");
				propertiesObject27.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationSeven())
						? proficiencyDetail.getWorkDurationSeven()
								: "");
				jsonArrayProp6.put(propertiesObject27);
				propertiesObject28.put("name", "POHSR_Capacity");
				propertiesObject28.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacitySeven())
						? proficiencyDetail.getCapacitySeven()
								: "");
				jsonArrayProp6.put(propertiesObject28);
				equipmentListObjectValueJsonObj6.put("properties", jsonArrayProp6);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj6);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject29 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject30 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject31= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject32= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp7 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj8 = new JSONFactoryUtil().createJSONObject();
				propertiesObject29.put("name", "POHSR_Checkbox");
				propertiesObject29.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Mobile Gauges and Mobile Screening Devices") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp7.put(propertiesObject29);
				propertiesObject30.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject30.put("value", "Mobile Gauges and Mobile Screening Devices");
				jsonArrayProp7.put(propertiesObject30);
				
				propertiesObject31.put("name", "POHSR_Durationofworkexperience");
				propertiesObject31.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationEight())
						? proficiencyDetail.getWorkDurationEight()
								: "");
				jsonArrayProp7.put(propertiesObject31);
				propertiesObject32.put("name", "POHSR_Capacity");
				propertiesObject32.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityEight())
						? proficiencyDetail.getCapacityEight()
								: "");
				jsonArrayProp7.put(propertiesObject32);
				equipmentListObjectValueJsonObj8.put("properties", jsonArrayProp7);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj8);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject33 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject34 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject35= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject36= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp8 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj9 = new JSONFactoryUtil().createJSONObject();
				propertiesObject33.put("name", "POHSR_Checkbox");
				propertiesObject33.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Research with Un-Sealed Sources") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp8.put(propertiesObject33);
				propertiesObject34.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject34.put("value", "Research with Un-Sealed Sources");
				jsonArrayProp8.put(propertiesObject34);
				
				propertiesObject35.put("name", "POHSR_Durationofworkexperience");
				propertiesObject35.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationNine())
						? proficiencyDetail.getWorkDurationNine()
								: "");
				jsonArrayProp8.put(propertiesObject35);
				propertiesObject36.put("name", "POHSR_Capacity");
				propertiesObject36.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityNine())
						? proficiencyDetail.getCapacityNine()
								: "");
				jsonArrayProp8.put(propertiesObject36);
				equipmentListObjectValueJsonObj9.put("properties", jsonArrayProp8);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj9);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject42= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject43= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp9 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj10 = new JSONFactoryUtil().createJSONObject();
				propertiesObject40.put("name", "POHSR_Checkbox");
				propertiesObject40.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Research with X-Ray Equipment and Sealed Sources") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp9.put(propertiesObject40);
				propertiesObject41.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject41.put("value", "Research with X-Ray Equipment and Sealed Sources");
				jsonArrayProp9.put(propertiesObject41);
				
				propertiesObject42.put("name", "POHSR_Durationofworkexperience");
				propertiesObject42.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationTen())
						? proficiencyDetail.getWorkDurationTen()
								: "");
				jsonArrayProp9.put(propertiesObject42);
				propertiesObject43.put("name", "POHSR_Capacity");
				propertiesObject43.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityTen())
						? proficiencyDetail.getCapacityTen()
								: "");
				jsonArrayProp9.put(propertiesObject43);
				equipmentListObjectValueJsonObj10.put("properties", jsonArrayProp9);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj10);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject44 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject45 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject46= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject47= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp10 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj11 = new JSONFactoryUtil().createJSONObject();
				propertiesObject44.put("name", "POHSR_Checkbox");
				propertiesObject44.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Nuclear Reactor") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp10.put(propertiesObject44);
				propertiesObject45.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject45.put("value", "Nuclear Reactor");
				jsonArrayProp10.put(propertiesObject45);
				
				propertiesObject46.put("name", "POHSR_Durationofworkexperience");
				propertiesObject46.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationEleven())
						? proficiencyDetail.getWorkDurationEleven()
								: "");
				jsonArrayProp10.put(propertiesObject46);
				propertiesObject47.put("name", "POHSR_Capacity");
				propertiesObject47.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityEleven())
						? proficiencyDetail.getCapacityEleven()
								: "");
				jsonArrayProp10.put(propertiesObject47);
				equipmentListObjectValueJsonObj11.put("properties", jsonArrayProp10);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj11);
			}catch (Exception e) {
				// TODO: handle exception
			}
			try {
				JSONObject propertiesObject48 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject49 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject50= new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject51= new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp11 = new JSONFactoryUtil().createJSONArray();
				JSONObject equipmentListObjectValueJsonObj12 = new JSONFactoryUtil().createJSONObject();
				propertiesObject48.put("name", "POHSR_Checkbox");
				propertiesObject48.put("value",  Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getProficiencyDetails())
						? (proficiencyDetail.getProficiencyDetails().contains("Other Application") ? trueValue : falseValue)
								: falseValue
						);
				jsonArrayProp11.put(propertiesObject48);
				propertiesObject49.put("name", "POHSR_QualifiedExpertArea");// choicelist
				propertiesObject49.put("value", "Other Application");
				jsonArrayProp11.put(propertiesObject49);
				
				propertiesObject50.put("name", "POHSR_Durationofworkexperience");
				propertiesObject50.put("value",
						Validator.isNotNull(proficiencyDetail)
						&& Validator.isNotNull(proficiencyDetail.getWorkDurationTwelve())
						? proficiencyDetail.getWorkDurationTwelve()
								: "");
				jsonArrayProp11.put(propertiesObject50);
				propertiesObject51.put("name", "POHSR_Capacity");
				propertiesObject51.put("value",
						Validator.isNotNull(proficiencyDetail) && Validator.isNotNull(proficiencyDetail.getCapacityTwelve())
						? proficiencyDetail.getCapacityTwelve()
								: "");
				jsonArrayProp11.put(propertiesObject51);
				equipmentListObjectValueJsonObj12.put("properties", jsonArrayProp11);
				jsonArrayObjects.put(equipmentListObjectValueJsonObj12);
			}catch (Exception e) {
				// TODO: handle exception
			}
			equipmentListValueJsonObj.put("objects", jsonArrayObjects);
			equipmentListJsonObj.put("value", equipmentListValueJsonObj);
			launchCasePropertiesArray.put(equipmentListJsonObj);
		} catch (Exception e) {
			e.printStackTrace();
		}


		_log.info("[QUALIFIED-PROPERTY----MAPPING END]");
	}

	@Reference
	private CommonsUtil commonsUtil;
	@Reference
	private DLAppService _dlAppLocalService;
}
