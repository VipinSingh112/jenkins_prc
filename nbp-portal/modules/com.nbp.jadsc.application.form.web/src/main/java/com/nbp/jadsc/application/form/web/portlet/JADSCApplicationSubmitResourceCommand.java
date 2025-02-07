package com.nbp.jadsc.application.form.web.portlet;

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
import com.liferay.portal.kernel.json.JSONException;
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
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;
import com.nbp.jadsc.application.form.service.service.JADSCApplicationLocalServiceUtil;
import com.nbp.jadsc.application.form.service.service.JADSCInformationRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationWorkFlowConstants;

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

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=/submit/Jadsc/Application" }, service = MVCResourceCommand.class)
public class JADSCApplicationSubmitResourceCommand implements MVCResourceCommand {
	Log _log = LogFactoryUtil.getLog(JADSCApplicationSubmitResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Submitted Started-----------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfApplication");
		String typeOfComplaint = ParamUtil.getString(resourceRequest, "typeOfComplaint");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String industriesImpactedValues = ParamUtil.getString(resourceRequest, "industriesImpactedValues");
		String breachOfConfidentiality = ParamUtil.getString(resourceRequest, "breachOfConfidentiality");
		String selectedInformation = ParamUtil.getString(resourceRequest, "selectedInformation");
		String confidentialStatusReason = ParamUtil.getString(resourceRequest, "confidentialStatusReason");
		String nonConfidentialSummary = ParamUtil.getString(resourceRequest, "nonConfidentialSummary");
		long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
		String checkPdfDownloadWithoutDocument = "false";
		JADSCApplication application = null;
		try {
			application = JADSCApplicationLocalServiceUtil.getJADSCApplication(jadscApplicationId);
		} catch (Exception e) {
		}
		if (application == null) {
			application = JADSCApplicationLocalServiceUtil.createJADSCApplication(CounterLocalServiceUtil.increment());
		}
		application.setTypeOfApplication(typeOfApplication);
		application.setTypeOfComplaint(typeOfComplaint);
		application.setTypeOfApplicant(typeOfApplicant);
		application.setIndustriesImpacted(industriesImpactedValues);
		application.setBreachOfConfidentiality(breachOfConfidentiality);
		application.setCategoriesOfConfidentialInfo(selectedInformation);
		application.setReasonForConfidentialStatus(confidentialStatusReason);
		application.setNonConfidentialSummary(nonConfidentialSummary);
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setCreateDate(new Date());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JADSCApplicationWorkFlowConstants.DRAFT);
		if (Validator.isNull(application.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		JADSCApplicationLocalServiceUtil.updateJADSCApplication(application);
		jsonOBJ.put("jadscApplicationId", application.getJadscApplicationId());
		jsonOBJ.put("category", application.getTypeOfComplaint());
		jsonOBJ.put("appStatus", JADSCApplicationWorkFlowConstants.DRAFT_Label);
		jsonOBJ.put("jadscApplicationNumber", application.getApplicationNumber());
		jsonFeed.put("APP_DATA", jsonOBJ);
		try {
			JSONArray jsonArray = new JSONFactoryUtil().createJSONArray();
			JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject5 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject6 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject7 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject8 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject9 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject10 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject11 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject12 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject13 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject14 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject15 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject16 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject17 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject18 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject19 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject20 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject21 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject22 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject23 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject24 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject25 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject26 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject27 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject28 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject29 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject30 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject31 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject32 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject33 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject34 = new JSONFactoryUtil().createJSONObject();
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();

			jsonObject.put("solutionType", "ADSCT_ApplicationforTradeRemedyInvestigations");
			propertiesObject1.put("key", "ADSCT_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);

			propertiesObject2.put("key", "ADSCT_TypeofApplication");
			if (application.getTypeOfApplication().equals("Prefiling Consultation")) {
				propertiesObject2.put("value", "Prefiling Consultation");
				jsonArray.put(propertiesObject2);
			} else if (application.getTypeOfApplication().equals("Request for Trade Remedy Investigations")) {
				propertiesObject2.put("value", "Request for Trade Remedy Investigations");
				jsonArray.put(propertiesObject2);
			}

			propertiesObject3.put("key", "ADSCT_TypeofComplaint");
			if (application.getTypeOfComplaint().equals("Anti-Dumping")) {
				propertiesObject3.put("value", "Anti-Dumping");
				jsonArray.put(propertiesObject3);
			} else if (application.getTypeOfComplaint().equals("Subsidies/Countervailing")) {
				propertiesObject3.put("value", "Subsidies/Countervailing");
				jsonArray.put(propertiesObject3);
			} else if (application.getTypeOfComplaint().equals("Safeguard")) {
				propertiesObject3.put("value", "Safeguard");
				jsonArray.put(propertiesObject3);
			}

			JSONArray typeOfTransactionArray = JSONFactoryUtil.createJSONArray();
			propertiesObject4.put("key", "ADSCT_VersionReceivedTypeofTransaction");
			if(application.getTypeOfTransaction().equals("Confidential Version")) {
				typeOfTransactionArray.put("Confidential Version");
				propertiesObject4.put("value", typeOfTransactionArray);
				jsonArray.put(propertiesObject4);
			}else if(application.getTypeOfTransaction().equals("Public Version")) {
				typeOfTransactionArray.put("Public Version");
				propertiesObject4.put("value", typeOfTransactionArray);
				jsonArray.put(propertiesObject4);
			}

			propertiesObject5.put("key", "ADSCT_Transaction");
			propertiesObject5.put("value", application.getApplicationNumber());
			jsonArray.put(propertiesObject5);

			propertiesObject6.put("key", "ADSCT_TypeofApplicant");
			if (application.getTypeOfTransaction().equals("Applicant/Company")) {
				propertiesObject6.put("value", "Applicant/Company");
				jsonArray.put(propertiesObject6);
			} else if (application.getTypeOfTransaction().equals("Acting on Behalf of Company E.g. Legal Council")) {
				propertiesObject6.put("value", "Acting on Behalf of Company");
				jsonArray.put(propertiesObject6);
			}

			String[] industryImpacted = application.getIndustriesImpacted().split(",");
			JSONArray industryImpactedArray = JSONFactoryUtil.createJSONArray();
			for (String industryImpactes : industryImpacted) {
				if (industryImpactes.equals("Agriculture Forestry and Fishing")) {
					industryImpactedArray.put("Agriculture, Forestry and Fishing");
				} else if (industryImpactes.equals("Mining and Quarrying")) {
					industryImpactedArray.equals("Mining and Quarrying");
				} else if (industryImpactes.equals("Manufacturing")) {
					industryImpactedArray.equals("Manufacturing");
				} else if (industryImpactes.equals("Electricity Gas Steam and Air conditioning supply")) {
					industryImpactedArray.equals("Electricity, Gas, Steam and Air conditioning supply");
				} else if (industryImpactes
						.equals("Water Supply Sewerage Waste management and Remediation activities")) {
					industryImpactedArray.equals("Water Supply; Sewerage, Waste management and Remediation activities");
				} else if (industryImpactes.equals("Construction")) {
					industryImpactedArray.equals("Construction");
				} else if (industryImpactes
						.equals("Wholesale and Retail trade repair of motor vehicles and motorcycles")) {
					industryImpactedArray
							.equals("Wholesale and Retail trade; repair of motor vehicles and motorcycles");
				} else if (industryImpactes.equals("Transport and Storage")) {
					industryImpactedArray.equals("Transport and Storage");
				} else if (industryImpactes.equals("Accomodation and Food service activities")) {
					industryImpactedArray.equals("Accommodation and Food service activities");
				} else if (industryImpactes.equals("Information and Communication")) {
					industryImpactedArray.equals("Information and Communication");
				} else if (industryImpactes.equals("Financial and Insurance activities")) {
					industryImpactedArray.equals("Financial and Insurance activities");
				} else if (industryImpactes.equals("Real Estate Activities")) {
					industryImpactedArray.equals("Real Estate Activities");
				} else if (industryImpactes.equals("Professional Scientific and Technical activities")) {
					industryImpactedArray.equals("Professional, Scientific and Technical activities");
				} else if (industryImpactes.equals("Administrative and Support service activities")) {
					industryImpactedArray.equals("Administrative and Support service activities");
				} else if (industryImpactes.equals("Public Administration and Defence Compulsory social security")) {
					industryImpactedArray.equals("Public Administration and Defence; Compulsory social security");
				} else if (industryImpactes.equals("Education")) {
					industryImpactedArray.equals("Education");
				} else if (industryImpactes.equals("Human Health and Social work activities")) {
					industryImpactedArray.put("Human Health and Social work activities");
				} else if (industryImpactes.equals("Arts Entertainment and Recreation")) {
					industryImpactedArray.put("Arts, Entertainment and Recreation");
				} else if (industryImpactes.equals("Other Service activities")) {
					industryImpactedArray.put("Other Service activities");
				} else if (industryImpactes.equals(
						"Activities of Households as employers undifferentiated goods and services-producing activities of households for own use")) {
					industryImpactedArray.put(
							"Activities of Households as employers; undifferentiated goods- and services-producing activities of households for own use");
				} else if (industryImpactes.equals("Activities of Extraterritorial organizations and bodies")) {
					industryImpactedArray.put("Activities of Extraterritorial organizations and bodies");
				} else if (industryImpactes.equals("")) {
					industryImpactedArray.put("");
				}
			}
			propertiesObject7.put("key", "ADSCT_IndustriesImpacted");
			propertiesObject7.put("value", industryImpactedArray);
			jsonArray.put(propertiesObject7);

			JADSCInformationRequest infoRequest = null;
			try {
				infoRequest = JADSCInformationRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
			} catch (Exception e) {
			}
			try {
				propertiesObject9.put("key", "ADSCT_CompanyName");
				propertiesObject9.put("value", infoRequest.getCompanyName());
				jsonArray.put(propertiesObject9);

				propertiesObject10.put("key", "ADSCT_Address");
				propertiesObject10.put("value", infoRequest.getAddress());
				jsonArray.put(propertiesObject10);

				propertiesObject11.put("key", "ADSCT_Phone_Main");
				propertiesObject11.put("value", infoRequest.getMainTelephone());
				jsonArray.put(propertiesObject11);

				propertiesObject12.put("key", "ADSCT_Phone_Office");
				propertiesObject12.put("value", infoRequest.getOfficeTelephone());
				jsonArray.put(propertiesObject12);

				propertiesObject13.put("key", "ADSCT_Phone_Cell");
				propertiesObject13.put("value", infoRequest.getCellTelephone());
				jsonArray.put(propertiesObject13);

				propertiesObject14.put("key", "ADSCT_Phone_Other");
				propertiesObject14.put("value", infoRequest.getOtherContact());
				jsonArray.put(propertiesObject14);

				propertiesObject15.put("key", "ADSCT_EmailAddress");
				propertiesObject15.put("value", infoRequest.getEmailContact());
				jsonArray.put(propertiesObject15);

				propertiesObject16.put("key", "ADSCT_ContactName");
				propertiesObject16.put("value", infoRequest.getContactPerName());
				jsonArray.put(propertiesObject16);

				propertiesObject17.put("key", "ADSCT_Position_Contact");
				propertiesObject17.put("value", infoRequest.getContactPerPosition());
				jsonArray.put(propertiesObject17);

				propertiesObject18.put("key", "ADSCT_Phone_Contact");
				propertiesObject18.put("value", infoRequest.getContactPerPhone());
				jsonArray.put(propertiesObject18);

				propertiesObject19.put("key", "ADSCT_EmailAddress_Contact");
				propertiesObject19.put("value", infoRequest.getContactPerEmail());
				jsonArray.put(propertiesObject19);

				propertiesObject20.put("key", "ADSCT_Name_Contact_Alternative");
				propertiesObject20.put("value", infoRequest.getAltContactPerName());
				jsonArray.put(propertiesObject20);

				propertiesObject21.put("key", "ADSCT_Position_Contact_Alternative");
				propertiesObject21.put("value", infoRequest.getAltContactPerPosition());
				jsonArray.put(propertiesObject21);

				propertiesObject22.put("key", "ADSCT_Phone_Contact_Alternative");
				propertiesObject22.put("value", infoRequest.getAltContactPerPhone());
				jsonArray.put(propertiesObject22);

				propertiesObject23.put("key", "ADSCT_EmailAddress_Contact_Alternative");
				propertiesObject23.put("value", infoRequest.getAltContactPerEmail());
				jsonArray.put(propertiesObject23);

				propertiesObject24.put("key", "ADSCT_NumberofyearsCompanyinOperation");
				propertiesObject24.put("value", infoRequest.getComOperationYear());
				jsonArray.put(propertiesObject24);

				propertiesObject25.put("key", "ADSCT_Products");
				JSONArray productArray = JSONFactoryUtil.createJSONArray();
				productArray.put(infoRequest.getProducts());
				propertiesObject25.put("value", productArray);
			    jsonArray.put(propertiesObject25);

				propertiesObject26.put("key", "ADSCT_ApproximateshareoftheJamaicaMarket");
				propertiesObject26.put("value", infoRequest.getMarketSharePer());
				jsonArray.put(propertiesObject26);

				propertiesObject27.put("key", "ADSCT_Investmentsinlastfiveyears");
				propertiesObject27.put("value", infoRequest.getFiveYearsInvestment());
				jsonArray.put(propertiesObject27);

				propertiesObject28.put("key", "ADSCT_PlanCapacity");
				propertiesObject28.put("value", infoRequest.getPlanCapacity());
				jsonArray.put(propertiesObject28);

				propertiesObject29.put("key", "ADSCT_GrowthProjection");
				propertiesObject29.put("value", infoRequest.getGrowthProjection());
				jsonArray.put(propertiesObject29);
			} catch (Exception e) {
			}
			String jadscDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/adsc-dashboard?jadscApplicationId=";
//		
			jadscDashboarUrl = jadscDashboarUrl + String.valueOf(application.getJadscApplicationId());
			propertiesObject30.put("key", "ADSCT_DashboardURL");
			propertiesObject30.put("value", jadscDashboarUrl);
			jsonArray.put(propertiesObject30);
			jsonObject.put("properties", jsonArray);

			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in adsc************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in adsc************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in adsc************" + isBPMEnabled);
			String token = null;
			String objectStoreValue = null;
			try {
				token = commonsUtil.getToken(themeDisplay, launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay, token, "112", launchCaseUrl);
			} catch (Exception e2) {
			}
			_log.info("*************Object Store Called in adsc application form************" + objectStoreValue);
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest
						.post(launchCaseUrl + createCaseEndPoint + "?tos=" + objectStoreValue)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");

				if (response.getCode() == HttpStatus.SC_OK) {
					JADSCApplication submitAdscApplication = null;
					try {
						submitAdscApplication = JADSCApplicationLocalServiceUtil
								.getJADSCApplication(jadscApplicationId);
					} catch (Exception e) {
					}
					if (Validator.isNotNull(submitAdscApplication)) {
						submitAdscApplication.setCaseId(caseId);
						submitAdscApplication.setIcmDocumentPath(path);
						submitAdscApplication.setStatus(JADSCApplicationWorkFlowConstants.SUBMITTED);
						JADSCApplicationLocalServiceUtil.updateJADSCApplication(submitAdscApplication);
						jsonOBJ.put("jadscApplicationId", submitAdscApplication.getJadscApplicationId());
						jsonOBJ.put("category", submitAdscApplication.getTypeOfComplaint());
						jsonOBJ.put("appStatus", JADSCApplicationWorkFlowConstants.SUBMITTED_Label);
						jsonOBJ.put("jadscApplicationNumber", submitAdscApplication.getApplicationNumber());
						jsonFeed.put("APP_DATA", jsonOBJ);
						DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
								themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
								"JADSC Supported Documents");
						DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
								themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
								String.valueOf(submitAdscApplication.getJadscApplicationId()));
						List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil.getFileEntries(
								themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
						ArrayList<File> filez = new ArrayList<File>();
						for (DLFileEntry dlEntry : supportinfDocFileEntries) {
							filez.add(generateFileByInputStream(dlEntry));
						}

						List<Folder> folder = null;
						Folder specificFolder = null;
						List<DLFileEntry> fileEntries = null;
						try {
							folder = _dlAppLocalService.getFolders(themeDisplay.getScopeGroupId(),
									supportingDocumentsFolder.getFolderId(), true);
							if (submitAdscApplication.getTypeOfApplicant().equals("Applicant/Company")) {
								System.out.println(
										"---------for the documents inside appicant company------------------");
								for (Folder allSupportingFolder : folder) {
									if (!allSupportingFolder.getName().equals("JADSC Application Form PDF")
											&& !allSupportingFolder.getName().equals("Oath Submitter Sign")
											&& !allSupportingFolder.getName().equals("Oath Justice Sign")
											&& !allSupportingFolder.getName().equals("Certificate of Service Sign")
											&& !allSupportingFolder.getName().equals("Certificate of Veracity Sign")
											&& !allSupportingFolder.getName()
													.equals("Certificate of Veracity Peace Justice")) {
										specificFolder = DLAppLocalServiceUtil
												.getFolder(allSupportingFolder.getFolderId());
										fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(
												themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
										for (DLFileEntry dlfile : fileEntries) {
											filez.add(generateFileByInputStream(dlfile));
										}
									}
								}
							} else if (submitAdscApplication.getTypeOfApplicant()
									.equals("Acting on Behalf of Company E.g. Legal Council")) {
								System.out.println(
										"---------for the documents inside Acting on Behalf of Company E.g. Legal Council------------------");
								for (Folder allSupportingFolder : folder) {
									if (!allSupportingFolder.getName().equals("JADSC Application Form PDF")
											&& !allSupportingFolder.getName().equals("Oath Submitter Sign")
											&& !allSupportingFolder.getName().equals("Oath Justice Sign")
											&& !allSupportingFolder.getName().equals("Certificate of Service Sign")
											&& !allSupportingFolder.getName().equals("Certificate of Veracity Sign")
											&& !allSupportingFolder.getName()
													.equals("Certificate of Veracity Peace Justice")
											&& !allSupportingFolder.getName().equals("Notice of Appearance Sign")) {
										specificFolder = DLAppLocalServiceUtil
												.getFolder(allSupportingFolder.getFolderId());
										fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(
												themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
										for (DLFileEntry dlfile : fileEntries) {
											filez.add(generateFileByInputStream(dlfile));
										}
									}
								}
							}
						} catch (Exception e) {
						}
						// pdf going across the BPM
						String pdfTemplate = "";
						pdfTemplate = commonsUtil.replaceJadscApplicationPdfVar(typeOfApplicant,
								submitAdscApplication.getTypeOfTransaction(), jadscApplicationId, themeDisplay,
								checkPdfDownloadWithoutDocument);
						System.out.println("Adsc LAUNCH CASE TEMPLATE******" + pdfTemplate);
						if (typeOfApplicant.equals("Applicant/Company")) {
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"applicant company pdf", pdfTemplate);
							filez.add(file);
						} else if (typeOfApplicant.equals("Acting on Behalf of Company E.g. Legal Council")) {
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"acting on behalf of company legal council pdf", pdfTemplate);
							filez.add(file);
						} else if (typeOfApplicant.equals("Public (Non-Confidential) Version")) {
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"public non confidential version pdf ", pdfTemplate);
							filez.add(file);
						}
						String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
								.getAttribute("upload-files-api-endpoint");

						_log.info("path--------------" + path);
						for (File supportingDocs : filez) {
							HttpResponse<String> documentUploadresponse = Unirest
									.post(launchCaseUrl + uploadFilesEndPoint + "?tos=" + objectStoreValue)
									.field("path", path).field("files", supportingDocs).asString();
							_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
						}
//					 Sending Email After Form Submission
						try {
							String CategoryTypeUpperCase = application.getTypeOfApplication().toUpperCase();
							String subcategoryUpperCase = application.getTypeOfComplaint().toUpperCase();
							String childcategoryUpperCase = application.getTypeOfApplicant().toUpperCase();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
												"[$Category$]", "[$subCategory$]", "[$childCategory$]",
												"[$transactionNo$]", "[$dashboardURL$]" },

										new String[] { themeDisplay.getUser().getFullName(),
												"ADSC - Anti- Dumping and Subsidies Commission", "entityName",
												CategoryTypeUpperCase, subcategoryUpperCase, childcategoryUpperCase,
												application.getApplicationNumber(), jadscDashboarUrl });
							}
							commonsUtil.sendMailToUsers("Your Application Submitted",
									"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
									body);
							_log.info(
									"Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

						} catch (Exception e) {
							_log.error("An Error Has Occured", e);
						}
					}
				}
			}
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			_log.info("*******************Documents Not Uploade***************************");
		}
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_log.info("submit  Adsc application  Ended--------------------------------");
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

	@Reference
	private CommonsUtil commonsUtil;
	@Reference
	private DLAppService _dlAppLocalService;
}