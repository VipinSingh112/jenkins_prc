package com.nbp.mining.lease.application.form.web.portlet;

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
import com.nbp.mining.lease.application.form.web.constants.MiningApplicationWorkflowConstant;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
import com.nbp.mining.lease.application.service.service.MiningLeaseApplicationLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingLicenseLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningProspectingRightsLocalServiceUtil;
import com.nbp.mining.lease.application.service.service.MiningRenewalLicenceLocalServiceUtil;
import com.nbp.mining.pdf.util.MiningLeaseNewTemporaryPermissionPdf;
import com.nbp.mining.pdf.util.MiningLeaseRenewPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicencePdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceRenewalPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceSurrenderPdf;
import com.nbp.mining.pdf.util.MiningProspectingLicenceTransferPdf;
import com.nbp.mining.pdf.util.MiningProspectingRightsPdf;

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
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpStatus;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=/submit/mining/application" }, service = MVCResourceCommand.class)

public class SubmitMiningApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitMiningApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String prospectingRightsTransactionType = ParamUtil.getString(resourceRequest,
				"prospectingRightsTransactionType");
		String miningLicenceTransactionType = ParamUtil.getString(resourceRequest, "miningLicenceTransactionType");
		String prospectingLicenceTransactionType = ParamUtil.getString(resourceRequest,
				"prospectingLicenceTransactionType");
		String currentStage = ParamUtil.getString(resourceRequest, "currentStage");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String areaDelinationTotalApprox = ParamUtil.getString(resourceRequest, "areaDelinationTotalApprox");
		String licenceExclusiveSpecialType = ParamUtil.getString(resourceRequest, "licenceExclusiveSpecialType");
		String miningMineralsTypeVal = ParamUtil.getString(resourceRequest, "miningMineralsTypeVal");
		String otherMineral = ParamUtil.getString(resourceRequest, "otherMineral");
		String areaDelination = ParamUtil.getString(resourceRequest, "areaDelination");
		String checkPdfDownloadWithoutDocument = "false";
		MiningLeaseApplication application = null;
		MiningAppCurrentStage miningAppCurrentStage = null;
		try {
			application = MiningLeaseApplicationLocalServiceUtil.getMiningLeaseApplication(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNull(application)) {
			application = MiningLeaseApplicationLocalServiceUtil
					.createMiningLeaseApplication(CounterLocalServiceUtil.increment());
		}
		application.setTypeOfApplicant(typeOfApplicant);
		application.setProspectingRightNumber(prospectingRightsTransactionType);
		application.setTypeOfTransaction(miningLicenceTransactionType);
		application.setTypeOfProspectingLicence(prospectingLicenceTransactionType);
		application.setAreaDelinationTotalApprox(areaDelinationTotalApprox);
		application.setAreaDelination(areaDelination);
		application.setLicenceExclusiveSpecial(licenceExclusiveSpecialType);
		application.setMiningMineralsTypeVal(miningMineralsTypeVal);
		application.setOtherMineralBox(otherMineral);
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setStatus(MiningApplicationWorkflowConstant.DRAFT);

		if (Validator.isNull(application.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(application);
		jsonOBJ.put("miningAppNo", application.getApplicationNumber());
		jsonOBJ.put("appStatus", MiningApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", application.getTypeOfApplicant());
		jsonOBJ.put("miningLeaseApplicationId", application.getMiningLeaseApplicationId());
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
			if (application.getTypeOfApplicant().equals("Prospecting Rights")) {
				jsonObject.put("solutionType", "MGDMA_ApplicationforProspectingRights");
			} else if (application.getTypeOfApplicant().equals("Prospecting Licence")) {
				jsonObject.put("solutionType", "MGDMA_ApplicationforProspectingLicence");
			} else if (application.getTypeOfApplicant().equals("Mining Lease")) {
				jsonObject.put("solutionType", "MGMDA_ApplicationforMiningLease");
			}

			propertiesObject1.put("key", "MGDMA_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);

			propertiesObject2.put("key", "MGDMA_Transaction");
			propertiesObject2.put("value", application.getApplicationNumber());
			jsonArray.put(propertiesObject2);
			
			propertiesObject12.put("key", "MGDMA_AmountDue");
			propertiesObject12.put("value","5,000.00");
			jsonArray.put(propertiesObject12);

			MiningProspectingRights rightData = null;
			try {
				rightData = MiningProspectingRightsLocalServiceUtil.getMiningById(miningLeaseApplicationId);
				propertiesObject3.put("key", "MGDMA_FullNameoftheApplicant");
				propertiesObject3.put("value", rightData.getNameOfApplicant());
				jsonArray.put(propertiesObject3);

				propertiesObject4.put("key", "MGDMA_TRN");
				propertiesObject4.put("value", rightData.getTrnNum());
				jsonArray.put(propertiesObject4);

				propertiesObject5.put("key", "MGDMA_TCC");
				propertiesObject5.put("value", rightData.getTrnNum());
				jsonArray.put(propertiesObject5);

				propertiesObject6.put("key", "MGDMA_NationalityofApplicant");
				propertiesObject6.put("value", rightData.getNationalityOfApplicant());
				jsonArray.put(propertiesObject6);

				propertiesObject7.put("key", "MGDMA_TelephonenumberofApplicant");
				propertiesObject7.put("value", rightData.getTelephoneNum());
				jsonArray.put(propertiesObject7);

				propertiesObject8.put("key", "MGDMA_EmailAddressofApplicant");
				propertiesObject8.put("value", rightData.getEmailAddr());
				jsonArray.put(propertiesObject8);

				propertiesObject9.put("key", "MGDMA_AddressofApplicant");
				propertiesObject9.put("value", rightData.getAddressInJamaica());
				jsonArray.put(propertiesObject9);

				propertiesObject10.put("key", "MGDMA_CompanyName");
				propertiesObject10.put("value", rightData.getOtherPersonName());
				jsonArray.put(propertiesObject10);

				propertiesObject11.put("key", "MGDMA_RegisteredAddressofCompany");
				propertiesObject11.put("value", rightData.getOtherPersonAddr());
				jsonArray.put(propertiesObject11);

			} catch (Exception e) {
			}
			
			if(application.getTypeOfApplicant().equals("Prospecting Licence")){
				if(application.getTypeOfProspectingLicence().equals("New")||application.getTypeOfProspectingLicence().equals("Additional Minerals")) {
				
				MiningProspectingLicense prospectiveLicenceData=null;
				try {
					prospectiveLicenceData=MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
					
					propertiesObject14.put("key", "MGDMA_FullNameoftheApplicant");
					propertiesObject14.put("value", prospectiveLicenceData.getNameOfApplicant());
					jsonArray.put(propertiesObject14);
					
					propertiesObject15.put("key", "MGDMA_TRN");
					propertiesObject15.put("value", prospectiveLicenceData.getTrnNumber());
					jsonArray.put(propertiesObject15);
					
					propertiesObject16.put("key", "MGDMA_TCC");
					propertiesObject16.put("value", prospectiveLicenceData.getTrnNumber());
					jsonArray.put(propertiesObject16);
					
					propertiesObject17.put("key", "MGDMA_NationalityofApplicant");
					propertiesObject17.put("value", prospectiveLicenceData.getNationalityOfApplicant());
					jsonArray.put(propertiesObject17);
				}catch (Exception e) {
				}
			}else if(application.getTypeOfProspectingLicence().equals("Renewal & Amendment")) {
				MiningRenewalLicence renewalData=null;
				try {
					renewalData=MiningRenewalLicenceLocalServiceUtil.getMiningById(miningLeaseApplicationId);
					propertiesObject18.put("key", "MGDMA_FullNameoftheApplicant");
					propertiesObject18.put("value", renewalData.getRenewApplicantName());
					jsonArray.put(propertiesObject18);
					
					propertiesObject19.put("key", "MGDMA_TRN");
					propertiesObject19.put("value", renewalData.getRenewTrnNum());
					jsonArray.put(propertiesObject19);
					
					
					propertiesObject20.put("key", "MGDMA_TCC");
					propertiesObject20.put("value", renewalData.getRenewTrnNum());
					jsonArray.put(propertiesObject20);
					
				}catch (Exception e) {
				}
				}else if(application.getTypeOfProspectingLicence().equals("Transfer")) {
					MiningProspectingLicense prospectiveData=null;
					prospectiveData=MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
					propertiesObject21.put("key", "MGDMA_FullNameoftheApplicant");
					propertiesObject21.put("value", prospectiveData.getNameOfApplicant());
					jsonArray.put(propertiesObject21);
					
					propertiesObject22.put("key", "MGDMA_TRN");
					propertiesObject22.put("value", prospectiveData.getTrnNumber());
					jsonArray.put(propertiesObject22);
					
					propertiesObject23.put("key", "MGDMA_TCC");
					propertiesObject23.put("value", prospectiveData.getTrnNumber());
					jsonArray.put(propertiesObject23);
					
					propertiesObject24.put("key", "MGDMA_NationalityofApplicant");
					propertiesObject24.put("value", prospectiveData.getNationalityOfApplicant());
					jsonArray.put(propertiesObject24);
					
					propertiesObject25.put("key", "MGDMA_TelephonenumberofApplicant");
					propertiesObject25.put("value", prospectiveData.getTelephoneNumber());
					jsonArray.put(propertiesObject25);
					
					propertiesObject26.put("key", "MGDMA_EmailAddressofApplicant");
					propertiesObject26.put("value", prospectiveData.getEmailAddress());
					jsonArray.put(propertiesObject26);
					
					propertiesObject27.put("key", "MGDMA_AddressofApplicant");
					propertiesObject27.put("value", prospectiveData.getAddressInJamaica());
					jsonArray.put(propertiesObject27);
					
				}else if(application.getTypeOfProspectingLicence().equals("Surrender")) {
					MiningProspectingLicense surrenderData=null;
					surrenderData=MiningProspectingLicenseLocalServiceUtil.getMinningById(miningLeaseApplicationId);
					propertiesObject28.put("key", "MGDMA_TelephonenumberofApplicant");
					propertiesObject28.put("value", surrenderData.getTelephoneNumber());
					jsonArray.put(propertiesObject28);
					
					
					propertiesObject29.put("key", "MGDMA_EmailAddressofApplicant");
					propertiesObject29.put("value", surrenderData.getEmailAddress());
					jsonArray.put(propertiesObject29);
				}
			}
			String miningDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/mining-dashboard?miningApplicationId=";
			miningDashboarUrl = miningDashboarUrl + String.valueOf(application.getMiningLeaseApplicationId());
			propertiesObject32.put("key", "MGDMA_DashboardURL");
			propertiesObject32.put("value", miningDashboarUrl);
			jsonArray.put(propertiesObject32);

			jsonObject.put("properties", jsonArray);

			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in Mining Lease************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in Mining Lease************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in Mining Lease************" + isBPMEnabled);
			String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
			_log.info("*************Object Store Called in Mining Lease Status************" + objectStore);
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos=TOS")
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());

				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");
				if (response.getCode() == HttpStatus.SC_OK) {
					MiningLeaseApplication submitApplication = MiningLeaseApplicationLocalServiceUtil
							.getMiningLeaseApplication(miningLeaseApplicationId);
					submitApplication.setCaseId(caseId);
					submitApplication.setIcmDocumentsPath(path);
					submitApplication.setStatus(MiningApplicationWorkflowConstant.SUBMITTED);
					MiningLeaseApplicationLocalServiceUtil.updateMiningLeaseApplication(submitApplication);
					jsonOBJ.put("miningAppNo", submitApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", MiningApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", submitApplication.getTypeOfApplicant());
					jsonOBJ.put("miningLeaseApplicationId", submitApplication.getMiningLeaseApplicationId());
					jsonFeed.put("APP_DATA", jsonOBJ);

					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Mining Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(submitApplication.getMiningLeaseApplicationId()));
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
							if (!allSupportingFolder.getName().equals("Mining Application Form PDF")
									&& !allSupportingFolder.getName().equals("Rights Signature of Applicant")) {
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
					
//					pdf going accross the BPM 
					
					// pdf going across the BPM
					try {
						String pdfTemplate = "";
						pdfTemplate = commonsUtil.replaceMiningApplicationPdfVar(submitApplication.getTypeOfApplicant(),
								submitApplication.getMiningLeaseApplicationId(), themeDisplay,
								checkPdfDownloadWithoutDocument);
						System.out.println("Minning LAUNCH CASE TEMPLATE******" + pdfTemplate);
						if (submitApplication.getTypeOfApplicant().equals("Prospecting Rights")) {
							System.out.println("----------------Inside prospecting Rights---------------------"
									+ submitApplication.getProspectingRightNumber());
							if (submitApplication.getProspectingRightNumber().equals("New") || submitApplication.getProspectingRightNumber().equals("Renewal")
									|| submitApplication.getProspectingRightNumber().equals("Surrender")) {
								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
										"prospecting-right", pdfTemplate);
								filez.add(file);
							}
						}
//						else if (submitApplication.getTypeOfApplicant().equals("Prospecting Licence")) {
//							System.out.println("----------------Inside prospecting Licence---------------------");
//							if (submitApplication.getTypeOfProspectingLicence().equals("New") || submitApplication.getTypeOfProspectingLicence().equals("Additional Minerals")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//							} else if (submitApplication.getTypeOfProspectingLicence().equals("Renewal &amp; Amendment")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//							}
//
//							else if (submitApplication.getTypeOfProspectingLicence().equals("Surrender")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//							}
//
//							else if (submitApplication.getTypeOfProspectingLicence().equals("Transfer")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//							}
//						}
//
//						else if (submitApplication.getTypeOfApplicant().equals("Mining Lease")) {
//							if (submitApplication.getTypeOfTransaction().equals("New") || submitApplication.getTypeOfTransaction().equals("Temporary Permission")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//;
//							}
//
//							else if (submitApplication.getTypeOfTransaction().equals("Renewal") || submitApplication.getTypeOfTransaction().equals("Amendment")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//
//							} else if (submitApplication.getTypeOfTransaction().equals("Surrender")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//							} else if (submitApplication.getTypeOfTransaction().equals("Transfer")) {
//								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
//										"minning-facilities-mixed", pdfTemplate);
//								filez.add(file);
//
//							}
//
//						}
					} catch (Exception e) {
						_log.error(e.getMessage());
					}

					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");

					_log.info("path--------------" + path);
					for (File supportingDocs : filez) {
						HttpResponse<String> documentUploadresponse = Unirest
								.post(launchCaseUrl + uploadFilesEndPoint + "?tos=TOS").field("path", path)
								.field("files", supportingDocs).asString();
						_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
					}

					// Sending Email After Form Submission
					try {

						String typeOfApplicantUpperCase = submitApplication.getTypeOfApplicant().toUpperCase();
						String typeOfTransactionUpperCase = submitApplication.getProspectingRightNumber().toUpperCase();

						String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"successful-application-submission-email-template");
						if (Validator.isNotNull(body)) {
							body = StringUtil.replace(body,
									new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
											"[$Category$]", "[$subCategory$]", "[$childCategory$]", "[$transactionNo$]",
											"[$dashboardURL$]" },

									new String[] { themeDisplay.getUser().getFullName(), "Film", "entityName",
											typeOfApplicantUpperCase, typeOfTransactionUpperCase, "NA",
											submitApplication.getApplicationNumber(), miningDashboarUrl });
						}
						commonsUtil.sendMailToUsers("Your Application Submitted",
								"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
								body);
						_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
		} catch (UnirestException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			_log.info("*******************Documents Not Uploade***************************");
		}
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		_log.info("submit Mining lease application  Ended--------------------------------");

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