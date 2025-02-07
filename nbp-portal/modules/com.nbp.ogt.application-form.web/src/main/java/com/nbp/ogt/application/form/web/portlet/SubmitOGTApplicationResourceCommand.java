package com.nbp.ogt.application.form.web.portlet;
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
import com.nbp.ogt.application.form.services.model.OgtApplication;
import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;
import com.nbp.ogt.application.form.services.model.OgtSectionB;
import com.nbp.ogt.application.form.services.service.OgtApplicationLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailLocalServiceUtil;
import com.nbp.ogt.application.form.services.service.OgtSectionBLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OGTApplicationWorkflowConstant;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

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
@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=/submit/ogt/application" }, service = MVCResourceCommand.class)
public class SubmitOGTApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitOGTApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		String doYouWant = ParamUtil.getString(resourceRequest, "doYouWant");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String natureOfInsolvent = ParamUtil.getString(resourceRequest, "natureOfInsolvent");
		String typeOfMatter = ParamUtil.getString(resourceRequest, "typeOfMatter");
		String typeOfDebt = ParamUtil.getString(resourceRequest, "typeOfDebt");
		String registeredManufacturer = ParamUtil.getString(resourceRequest, "registeredManufacturer");
		String registrationLicenceNum = ParamUtil.getString(resourceRequest, "registrationLicenceNum");
		String typeOfBankruptcy = ParamUtil.getString(resourceRequest, "typeOfBankruptcy");
		String debtstatute = ParamUtil.getString(resourceRequest, "debtstatute");
		DateFormat ogtDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		OgtApplication ogtApplication = null;
		String checkPdfDownloadWithoutDocument = "false";
		try {
			ogtApplication = OgtApplicationLocalServiceUtil.getOgtApplication(ogtApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(ogtApplication)) {
			ogtApplication = OgtApplicationLocalServiceUtil
					.createOgtApplication(CounterLocalServiceUtil.increment(OgtApplication.class.getName()));
		}
		ogtApplication.setDoYouWant(doYouWant);
		ogtApplication.setTypeOfApplicant(typeOfApplicant);
		ogtApplication.setNatureOfApplicant(natureOfInsolvent);
		ogtApplication.setTypeOfMatter(typeOfMatter);
		ogtApplication.setTypeOfDebt(typeOfDebt);
		ogtApplication.setDebtStatute(debtstatute);
		ogtApplication.setRegisteredManufacturer(registeredManufacturer);
		ogtApplication.setProspectingRightsNum(registrationLicenceNum);
		ogtApplication.setTypeOfBankruptcy(typeOfBankruptcy);
		ogtApplication.setGroupId(themeDisplay.getScopeGroupId());
		ogtApplication.setGroupId(themeDisplay.getScopeGroupId());
		ogtApplication.setUserId(themeDisplay.getUserId());
		ogtApplication.setUserName(themeDisplay.getUser().getFullName());
		ogtApplication.setStatus(OGTApplicationWorkflowConstant.DRAFT);
		if (Validator.isNull(ogtApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			ogtApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		OgtApplicationLocalServiceUtil.updateOgtApplication(ogtApplication);
		jsonOBJ.put("ogtApplicationId", ogtApplication.getOgtApplicationId());
		jsonOBJ.put("ogtAppNo", ogtApplication.getApplicationNumber());
		jsonOBJ.put("appStatus", OGTApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", ogtApplication.getTypeOfMatter());
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

			jsonObject.put("solutionType", "OGTPO_ApplicationforaProofofClaim");

			propertiesObject1.put("key", "OGTPO_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);

			propertiesObject2.put("key", "OGTPO_TypeofApplicant");
			if (ogtApplication.getTypeOfApplicant().equals("Claimant")) {
				propertiesObject2.put("value", "Claimant");
				jsonArray.put(propertiesObject2);
			} else if (ogtApplication.getTypeOfApplicant().equals("Person Authorized by the Claimant")) {
				propertiesObject2.put("value", "Person Authorized by Claimant");
				jsonArray.put(propertiesObject2);
			}

			propertiesObject3.put("key", "OGTPO_NatureofInsolventPersonDebtor");
			if (ogtApplication.getNatureOfApplicant().equals("Individual")) {
				propertiesObject3.put("value", "Individual");
				jsonArray.put(propertiesObject3);
			} else if (ogtApplication.getNatureOfApplicant().equals("Company")) {
				propertiesObject3.put("value", "Company");
				jsonArray.put(propertiesObject3);
			}

			propertiesObject4.put("key", "OGTPO_ManufacturersRegistration");
			propertiesObject4.put("value", ogtApplication.getProspectingRightsNum());
			jsonArray.put(propertiesObject4);

			propertiesObject5.put("key", "OGTPO_TypeofMatter");
			if (ogtApplication.getTypeOfMatter().equals("Bankruptcy")) {
				propertiesObject5.put("value", "Bankruptcy");
				jsonArray.put(propertiesObject5);
			} else if (ogtApplication.getTypeOfMatter().equals("Proposal")) {
				propertiesObject5.put("value", "Proposal");
				jsonArray.put(propertiesObject5);
			} else if (ogtApplication.getTypeOfMatter().equals("Receivership")) {
				propertiesObject5.put("value", "Receivership");
				jsonArray.put(propertiesObject5);
			}

			propertiesObject6.put("key", "OGTPO_Bankruptcy");
			if (ogtApplication.getTypeOfBankruptcy().equals("Claim by Creditor")) {
				propertiesObject6.put("value", "Claim by Creditor");
				jsonArray.put(propertiesObject6);
			} else if (ogtApplication.getTypeOfBankruptcy().equals("Claim to Property")) {
				propertiesObject6.put("value", "Claim to Property");
				jsonArray.put(propertiesObject6);
			} else if (ogtApplication.getTypeOfBankruptcy().equals("Claim by Spouse")) {
				propertiesObject6.put("value", "Claim by Spouse");
				jsonArray.put(propertiesObject6);
			}

			propertiesObject7.put("key", "OGTPO_TypeofDebt");
			String[] debt = typeOfDebt.split(",");
			JSONArray debts = new JSONFactoryUtil().createJSONArray();
			for (String str : debt) {
				if (str.contains("Secured")) {
					debts.put("Secured");
				} else if (str.contains("Unsecured")) {
					debts.put("Unsecured");
				} else if (str.contains("Preferred")) {
					debts.put("Preferred");
				} else if (str.contains("")) {
					debts.put("");
				}
				propertiesObject7.put("value", debts);
				jsonArray.put(propertiesObject7);
			}

			propertiesObject8.put("key", "OGTPO_DebtStatuteBarred");
			if (ogtApplication.getDebtStatute().equals("Yes")) {
				propertiesObject8.put("value", "Yes");
				jsonArray.put(propertiesObject8);
			} else if (ogtApplication.getDebtStatute().equals("No")) {
				propertiesObject8.put("value", "No");
				jsonArray.put(propertiesObject8);
			}

			OgtClaimantDetail claimantDetail = null;
			try {
				claimantDetail = OgtClaimantDetailLocalServiceUtil.getOgtById(ogtApplicationId);

				propertiesObject9.put("key", "OGTPO_NatureofClaimant");
				propertiesObject9.put("value", claimantDetail.getClaimantName());
				jsonArray.put(propertiesObject9);

				propertiesObject10.put("key", "OGTPO_FirstNames_Claimant");
				propertiesObject10.put("value", claimantDetail.getClaimantFirstName());
				jsonArray.put(propertiesObject10);

				propertiesObject11.put("key", "OGTPO_FamilyLastName_Claimant");
				propertiesObject11.put("value", claimantDetail.getClaimantLastName());
				jsonArray.put(propertiesObject11);

				propertiesObject12.put("key", "OGTPO_NameofCompanyClaimant");
				propertiesObject12.put("value", claimantDetail.getClaimantCompanyName());
				jsonArray.put(propertiesObject12);

				propertiesObject13.put("key", "OGTPO_Address");
				propertiesObject13.put("value", claimantDetail.getClaimantAddress());
				jsonArray.put(propertiesObject13);

				propertiesObject14.put("key", "OGTPO_EmailAddress");
				propertiesObject14.put("value", claimantDetail.getClaimantEmailAddr());
				jsonArray.put(propertiesObject14);

				propertiesObject15.put("key", "OGTPO_Telephone");
				propertiesObject15.put("value", claimantDetail.getClaimantTeleNum());
				jsonArray.put(propertiesObject15);

				propertiesObject16.put("key", "OGTPO_Fax");
				propertiesObject16.put("value", claimantDetail.getClaimantFaxNo());
				jsonArray.put(propertiesObject16);

				propertiesObject17.put("key", "OGTPO_DateofApplication");
				propertiesObject17.put("value",
						Validator.isNotNull(claimantDetail) && Validator.isNotNull(claimantDetail.getClaimantDate())
								? ogtDateFormat.format(claimantDetail.getClaimantDate())
								: "");
				jsonArray.put(propertiesObject17);

				propertiesObject18.put("key", "OGTPO_TRN");
				propertiesObject18.put("value", claimantDetail.getClaimantTrn());
				jsonArray.put(propertiesObject18);
			} catch (Exception e) {
			}

			OgtInsolventPersonDetail personDetailInfo = null;
			try {
				personDetailInfo = OgtInsolventPersonDetailLocalServiceUtil.getOgtById(ogtApplicationId);
				propertiesObject19.put("key", "OGTPO_NatureofInsolventPersonDebtor");
				propertiesObject19.put("value", personDetailInfo.getNatureOfInsolvent());
				jsonArray.put(propertiesObject19);

				propertiesObject20.put("key", "OGTPO_FirstName");
				propertiesObject20.put("value", personDetailInfo.getInsolventFirstName());
				jsonArray.put(propertiesObject20);

				propertiesObject21.put("key", "OGTPO_LastName");
				propertiesObject21.put("value", personDetailInfo.getInsolventLastName());
				jsonArray.put(propertiesObject21);

				propertiesObject22.put("key", "OGTPO_CompanyName");
				propertiesObject22.put("value", personDetailInfo.getInsolventCompanyName());
				jsonArray.put(propertiesObject22);
			} catch (Exception e) {
			}

//			OgtProofOfClaim proofOfClaimData=null;
			try {
				propertiesObject23.put("key", "OGTPO_TypeofMatter");
				propertiesObject23.put("value", ogtApplication.getTypeOfMatter());
				jsonArray.put(propertiesObject23);
			} catch (Exception e) {
			}

			if (ogtApplication.getTypeOfBankruptcy().equals("Claim by Creditor")) {
				OgtSectionB sectionBData = null;
				try {
					sectionBData = OgtSectionBLocalServiceUtil.getOgtById(ogtApplicationId);

					propertiesObject24.put("key", "OGTPO_DateofInsolvencyofDebtor");
					propertiesObject24.put("value", sectionBData.getTheDebtor());
					jsonArray.put(propertiesObject24);

					if (sectionBData.getTheDebtor().equals("Date of Bankruptcy")) {
						propertiesObject25.put("key", "OGTPO_DateofBankruptcy");
						propertiesObject25.put("value",
								Validator.isNotNull(sectionBData)
										&& Validator.isNotNull(sectionBData.getDateOfInsolvencyOfDebtor())
												? ogtDateFormat.format(sectionBData.getDateOfInsolvencyOfDebtor())
												: "");
						jsonArray.put(propertiesObject25);
					}
					if (sectionBData.getTheDebtor().equals("Date of the Receivership")) {
						propertiesObject25.put("key", "OGTPO_DateoftheReceivership");
						propertiesObject25.put("value",
								Validator.isNotNull(sectionBData)
										&& Validator.isNotNull(sectionBData.getDateOfInsolvencyOfDebtor())
												? ogtDateFormat.format(sectionBData.getDateOfInsolvencyOfDebtor())
												: "");
						jsonArray.put(propertiesObject25);
					}
					if (sectionBData.getTheDebtor().equals("Date of the notice of intention")) {
						propertiesObject25.put("key", "OGTPO_Dateofthenoticeofintention");
						propertiesObject25.put("value",
								Validator.isNotNull(sectionBData)
										&& Validator.isNotNull(sectionBData.getDateOfInsolvencyOfDebtor())
												? ogtDateFormat.format(sectionBData.getDateOfInsolvencyOfDebtor())
												: "");
						jsonArray.put(propertiesObject25);
					}
					if (sectionBData.getTheDebtor().equals("Date of the Proposal")) {
						propertiesObject25.put("key", "OGTPO_DateoftheProposal");
						propertiesObject25.put("value",
								Validator.isNotNull(sectionBData)
										&& Validator.isNotNull(sectionBData.getDateOfInsolvencyOfDebtor())
												? ogtDateFormat.format(sectionBData.getDateOfInsolvencyOfDebtor())
												: "");
						jsonArray.put(propertiesObject25);
					}

					propertiesObject26.put("key", "OGTPO_TotalValueofClaim");
					propertiesObject26.put("value", sectionBData.getTotalValueOfClaim());
					jsonArray.put(propertiesObject26);

					propertiesObject27.put("key", "OGTPO_UnsecuredClaimAmount");
					propertiesObject27.put("value", sectionBData.getUnsecuredClaim());
					jsonArray.put(propertiesObject27);

					propertiesObject28.put("key", "OGTPO_SecuredClaimAmount");
					propertiesObject28.put("value", sectionBData.getSecuredClaim());
					jsonArray.put(propertiesObject28);

				} catch (Exception e) {
				}
			}

			String ogtDashboarUrl = PortalUtil.getPortalURL(resourceRequest)
					+ "/group/guest/ogt-application-form?ogtApplicationId=";
			ogtDashboarUrl = ogtDashboarUrl + String.valueOf(ogtApplication.getOgtApplicationId());
			propertiesObject29.put("key", "OGTPO_DashboardURL");
			propertiesObject29.put("value", ogtDashboarUrl);
			jsonArray.put(propertiesObject29);

			propertiesObject30.put("key", "OGTPO_Transaction");
			propertiesObject30.put("value", ogtApplication.getApplicationNumber());
			jsonArray.put(propertiesObject30);
			jsonObject.put("properties", jsonArray);

			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in Ogt************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in Ogt************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in Ogt************" + isBPMEnabled);
//			String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
//			_log.info("*************Object Store Called in Ogt Status************" + objectStore);
              
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"108",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in Ogt Status************" + objectStoreValue);
			
			
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());

				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");

				if (response.getCode() == HttpStatus.SC_OK) {
					OgtApplication submitOgtApplication = OgtApplicationLocalServiceUtil
							.getOgtApplication(ogtApplicationId);
					submitOgtApplication.setCaseId(caseId);
					submitOgtApplication.setIcmDocumentsPath(path);
					submitOgtApplication.setStatus(OGTApplicationWorkflowConstant.SUBMITTED);
					OgtApplicationLocalServiceUtil.updateOgtApplication(submitOgtApplication);
					jsonOBJ.put("ogtApplicationId", ogtApplication.getOgtApplicationId());
					jsonOBJ.put("ogtAppNo", submitOgtApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", OGTApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", ogtApplication.getTypeOfMatter());
					jsonFeed.put("APP_DATA", jsonOBJ);

					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"OGT Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(submitOgtApplication.getOgtApplicationId()));
					List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
							.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
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
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("OGT Application Form PDF")
									&& !allSupportingFolder.getName().equals("Signature of Person Completing Form")
									&& !allSupportingFolder.getName().equals("Signature of Justice Peace")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
					} catch (Exception e) {
					}

					// pdf going across the BPM
					String pdfTemplate = "";
					pdfTemplate = commonsUtil.replaceOgtApplicationPdfVar(submitOgtApplication.getTypeOfMatter(),
							ogtApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);

					System.out.println("Ogt LAUNCH CASE TEMPLATE******" + pdfTemplate);
					if (typeOfBankruptcy.equals("Claim by Creditor")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Ogt claim By creditor Pdf", pdfTemplate);
						filez.add(file);
					} else if (typeOfBankruptcy.equals("Claim to Property")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Ogt claim By Property Pdf", pdfTemplate);
						filez.add(file);
					} else if (typeOfBankruptcy.equals("Claim by Spouse")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Ogt claim By spouse Pdf ", pdfTemplate);
						filez.add(file);
					} else if (typeOfMatter.equals("Proposal") || typeOfMatter.equals("Receivership")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Ogt claim By Proposal and receivership Pdf ", pdfTemplate);
						filez.add(file);
					}
					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");

					_log.info("path--------------" + path);
					for (File supportingDocs : filez) {
						HttpResponse<String> documentUploadresponse = Unirest
								.post(launchCaseUrl + uploadFilesEndPoint + "?tos="+objectStoreValue).field("path", path)
								.field("files", supportingDocs).asString();
						_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
					}

					// Sending Email After Form Submission
					try {
						String CategoryTypeUpperCase = submitOgtApplication.getTypeOfApplicant().toUpperCase();
						String subcategoryUpperCase = submitOgtApplication.getNatureOfApplicant().toUpperCase();
						String childcategoryUpperCase = submitOgtApplication.getTypeOfMatter().toUpperCase();

						String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"successful-application-submission-email-template");
						if (Validator.isNotNull(body)) {
							body = StringUtil.replace(body,
									new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
											"[$Category$]", "[$subCategory$]", "[$childCategory$]", "[$transactionNo$]",
											"[$dashboardURL$]" },

									new String[] { themeDisplay.getUser().getFullName(),"OGT Application",
											"entityName", CategoryTypeUpperCase, subcategoryUpperCase,
											childcategoryUpperCase, submitOgtApplication.getApplicationNumber(),
											ogtDashboarUrl });
						}
						commonsUtil.sendMailToUsers("Your Application Submitted",
								"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
								body);
						_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

					} catch (Exception e) {
						_log.error("An Error Has Occured", e);
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
		_log.info("submit  Ogt application  Ended--------------------------------");

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