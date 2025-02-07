package com.nbp.explosives.competency.form.web.portlet;

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
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosiveAppPaymentLocalServiceUtil;
import com.nbp.explosives.competency.application.form.service.service.ExplosivesApplicationLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationWorkFlowConstant;

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
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=/add/submit/app/url" 
		}, 
service = MVCResourceCommand.class)

public class SubmitExplosiveApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(PendingExplosiveApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String explosivesApplicationType = ParamUtil.getString(resourceRequest, "explosivesApplicationType");
		String explosivesTransactionType = ParamUtil.getString(resourceRequest, "explosivesTransactionType");
		String competencyCertificateNum = ParamUtil.getString(resourceRequest, "competencyCertificateNum");
		String dateOfIssue = ParamUtil.getString(resourceRequest, "dateOfIssue");
		String dateOfExpiration = ParamUtil.getString(resourceRequest, "dateOfExpiration");
		long explosivesApplicationId = ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		
		DateFormat explosiveDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String checkPdfDownloadWithoutDocument = "false";
		
		ExplosivesApplication explosivesApplication = null;
		try {
			explosivesApplication=ExplosivesApplicationLocalServiceUtil.getExplosivesApplication(explosivesApplicationId);
		} catch (Exception e) {
		}
		if(Validator.isNull(explosivesApplication)) {
		explosivesApplication=ExplosivesApplicationLocalServiceUtil.createExplosivesApplication(CounterLocalServiceUtil.increment());
		}
		explosivesApplication.setTypeOfApplicant(explosivesApplicationType);
		explosivesApplication.setTypeOfTransaction(explosivesTransactionType);
		explosivesApplication.setCompetencyCertificateNumber(competencyCertificateNum);
		explosivesApplication.setTypeOfApplicant(explosivesApplicationType);
		try {
			if (Validator.isNotNull(explosivesApplication)) {
				explosivesApplication.setDateOfIssue(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfIssue));
			}
		} catch (Exception e) {
		}
		try {
			if (Validator.isNotNull(explosivesApplication)) {
				explosivesApplication.setDateOfExpiration(new SimpleDateFormat("yyyy-MM-dd").parse(dateOfExpiration));
			}
		} catch (Exception e) {
		}
	  
		explosivesApplication.setCompanyId(themeDisplay.getCompanyId());
		explosivesApplication.setGroupId(themeDisplay.getScopeGroupId());
		explosivesApplication.setCreateDate(new Date());
		explosivesApplication.setUserId(themeDisplay.getUserId());
		explosivesApplication.setUserName(themeDisplay.getUser().getFullName());
		explosivesApplication.setStatus(ExplosivesCompetencyApplicationWorkFlowConstant.DRAFT);
		
		if (Validator.isNull(explosivesApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			explosivesApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		
		ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(explosivesApplication);
            jsonOBJ.put("explosivesApplicationId", explosivesApplication.getExplosivesApplicationId());
			jsonOBJ.put("ExplosiveAppNum", explosivesApplication.getApplicationNumber());
			jsonOBJ.put("appStatus", ExplosivesCompetencyApplicationWorkFlowConstant.DRAFT_Label);
			jsonOBJ.put("category", explosivesApplication.getTypeOfApplicant());
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
			
			jsonObject.put("solutionType", "POAFE_ApplicationforExplosiveCompetencyCertification");
			
			propertiesObject1.put("key", "POAFE_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);
			
			BlasterCompetencyForm blaster=null;
			String fullName=null;
			String surName=null;
			String firstName=null;
			String middleName=null;
			
			try {
				blaster= BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
				
				propertiesObject2.put("key","POAFE_SurnameName");
				propertiesObject2.put("value", blaster.getSurName());
				jsonArray.put(propertiesObject2);
				
				propertiesObject3.put("key","POAFE_FirstName");
				propertiesObject3.put("value", blaster.getFirstName());
				jsonArray.put(propertiesObject3);
				
				propertiesObject4.put("key","POAFE_MiddleName");
				propertiesObject4.put("value", blaster.getMiddleName());
				jsonArray.put(propertiesObject4);
				
				surName=blaster.getSurName();
				firstName= blaster.getFirstName();
				middleName=blaster.getMiddleName();
				
				StringBuilder fullNameBuilder = new StringBuilder();

				if (firstName != null) {
				    fullNameBuilder.append(firstName).append(" ");
				}
				if (middleName != null) {
				    fullNameBuilder.append(middleName).append(" ");
				}
				if (surName != null) {
				    fullNameBuilder.append(surName);
				}

				fullName = fullNameBuilder.toString().trim();
				
				propertiesObject22.put("key", " POAFE_NameofApplicant");
				propertiesObject22.put("value", fullName);
				jsonArray.put(propertiesObject22);
				
				if(blaster.getGender().equals("Male")) {
				propertiesObject5.put("key","POAFE_Sex");
				propertiesObject5.put("value","Male");
				}else if(blaster.getGender().equals("Female")) {
				propertiesObject5.put("key","POAFE_Sex");
				propertiesObject5.put("value","Female");	
				}else {
				propertiesObject5.put("key","POAFE_Sex");
				propertiesObject5.put("value","");	
				}
				jsonArray.put(propertiesObject5);
				
				propertiesObject6.put("key","POAFE_AddressofApplicant");
				propertiesObject6.put("value", blaster.getAddress());
				jsonArray.put(propertiesObject6);
				
				propertiesObject7.put("key","POAFE_DateofBirth");
				propertiesObject7.put("value", Validator.isNotNull(blaster)
						&& Validator.isNotNull(blaster.getDateOfBirth())
						? explosiveDateFormat.format(blaster.getDateOfBirth())
						: "");
				jsonArray.put(propertiesObject7);
				
				propertiesObject8.put("key","POAFE_TelephonenumberofOffice");
				propertiesObject8.put("value", blaster.getOfficeNumber());
				jsonArray.put(propertiesObject8);
				
				propertiesObject9.put("key","POAFE_TelephoneNumberCell");
				propertiesObject9.put("value", blaster.getCellNum());
				jsonArray.put(propertiesObject9);
				
				propertiesObject10.put("key","POAFE_TRN Number");
				propertiesObject10.put("value", blaster.getTrnNum());
				jsonArray.put(propertiesObject10);
				
//				propertiesObject11.put("key","POAFE_EducationalBackground");
//				 String eduBackground=blaster.getEducationalBack();
//				 String[] education = eduBackground.split(",");
//					JSONArray eudBack = new JSONFactoryUtil().createJSONArray();
//					for (String str : education) {
//						if (str.contains("Primary")) {
//							eudBack.put("Primary");
//						} else if (str.contains("Secondary")) {
//							eudBack.put("Secondary");
//						} else if (str.contains("Tertiary")) {
//							eudBack.put("Tertiary");
//						} 
//						propertiesObject11.put("value", eudBack);
//					}
//					jsonArray.put(propertiesObject11);
//				 
				propertiesObject11.put("key","POAFE_EducationalBackground");
				propertiesObject11.put("value", blaster.getEducationalBack());
				jsonArray.put(propertiesObject11);
				

			} catch (Exception e) {}
			
			if(explosivesTransactionType.equals("New Competency Certificate")) {
			propertiesObject12.put("key","POAFE_TypeofTransaction");
			propertiesObject12.put("value", "New");
			}else if(explosivesTransactionType.equals("Renewal Competency Certificate")) {
			propertiesObject12.put("key","POAFE_TypeofTransaction");
			propertiesObject12.put("value", "Renewal");	
			}else {
			propertiesObject12.put("key","POAFE_TypeofTransaction");
			propertiesObject12.put("value", "");		
			}
			jsonArray.put(propertiesObject12);
			
			propertiesObject13.put("key","POAFE_TransactionNumber");
			propertiesObject13.put("value", explosivesApplication.getApplicationNumber());
			jsonArray.put(propertiesObject13);
			
			
			
			String explosiveDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/explosives-competency-certification-dashboard?explosivesApplicationId=";
			explosiveDashboarUrl = explosiveDashboarUrl + String.valueOf(explosivesApplication.getExplosivesApplicationId());
			propertiesObject14.put("key", "POAFE_dashboardUrl");
			propertiesObject14.put("value", explosiveDashboarUrl);
			jsonArray.put(propertiesObject14);
			
			propertiesObject15.put("key", "POAFE_EmailAddressofApplicant");
			propertiesObject15.put("value", themeDisplay.getUser().getEmailAddress());
			jsonArray.put(propertiesObject15);
			
			 ExplosiveAppPayment explosivePayment =null;
			 try {
				 explosivePayment= ExplosiveAppPaymentLocalServiceUtil.getExplosiveById(explosivesApplicationId);
				 System.out.println("Amount Paid"+explosivePayment.getAmountPaid());
			propertiesObject16.put("key", "POAFE_AmountDue");
			propertiesObject16.put("value", "6000");
			jsonArray.put(propertiesObject16);
			
			propertiesObject17.put("key", "POAFE_AmountReceived");
			propertiesObject17.put("value", explosivePayment.getAmountPaid());
			jsonArray.put(propertiesObject17);
			
			propertiesObject18.put("key", "POAFE_CertificateNumber");
			propertiesObject18.put("value", explosivesApplication.getExpiredLicenseAppNumber());
			jsonArray.put(propertiesObject18);
			
			propertiesObject19.put("key", "POAFE_DateofIssue");
			propertiesObject19.put("value", Validator.isNotNull(explosivesApplication)
					&& Validator.isNotNull(explosivesApplication.getDateOfIssue())
					? explosiveDateFormat.format(explosivesApplication.getDateOfIssue())
					: "");
			jsonArray.put(propertiesObject19);
			
			propertiesObject20.put("key", "POAFE_DateofExpiration");
			propertiesObject20.put("value", Validator.isNotNull(explosivesApplication)
					&& Validator.isNotNull(explosivesApplication.getDateOfExpiration())
					? explosiveDateFormat.format(explosivesApplication.getDateOfExpiration())
					: "");
			jsonArray.put(propertiesObject20);
		
			 }catch(Exception e) {}
			 
			 if(explosivesApplicationType.equals("Blaster's Competency Certificate")) {
			 propertiesObject21.put("key", "POAFE_TypeofApplication");
			 propertiesObject21.put("value", "Blaster Competency");
			 }else if(explosivesApplicationType.equals("Pyrotechnic Competency Certificate")) {
			 propertiesObject21.put("key", "POAFE_TypeofApplication");
			 propertiesObject21.put("value", "Pyrotechnic Competency");
			 }
			 jsonArray.put(propertiesObject21);
			 
			jsonObject.put("properties", jsonArray);
			
			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in explosive************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in explosive************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in explosive************" + isBPMEnabled);
//			String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"113",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in explosive************" + objectStoreValue);
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
//				_log.info("*************Object Store Called in explosive Status************" + objectStore);
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");

				if (response.getCode() == HttpStatus.SC_OK) {
					ExplosivesApplication submitExplosivesApplication  =ExplosivesApplicationLocalServiceUtil.getExplosivesApplication(explosivesApplicationId);
					submitExplosivesApplication.setCaseId(caseId);
					submitExplosivesApplication.setIcmDocumentPath(path);
					submitExplosivesApplication.setStatus(ExplosivesCompetencyApplicationWorkFlowConstant.SUBMITTED);
					ExplosivesApplicationLocalServiceUtil.updateExplosivesApplication(submitExplosivesApplication);
					jsonOBJ.put("explosivesApplicationId", explosivesApplication.getExplosivesApplicationId());
					jsonOBJ.put("ExplosiveAppNum", submitExplosivesApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", ExplosivesCompetencyApplicationWorkFlowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", submitExplosivesApplication.getTypeOfApplicant());
					jsonFeed.put("APP_DATA", jsonOBJ);
			
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Explosive Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(submitExplosivesApplication.getExplosivesApplicationId()));
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
							if (!allSupportingFolder.getName().equals("Explosive Application Form PDF")
									&& !allSupportingFolder.getName().equals("Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}	
			}catch(Exception e) {}
					
					// pdf going across the BPM
					String pdfTemplate = "";
					pdfTemplate = commonsUtil.replaceExplosivePdfVar(submitExplosivesApplication.getTypeOfApplicant(),
							explosivesApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);

					System.out.println("Explosive LAUNCH CASE TEMPLATE******" + pdfTemplate);
					if(explosivesApplicationType.equals("Blaster's Competency Certificate")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Explosive Blaster's Application Pdf ", pdfTemplate);
						filez.add(file);
					}if(explosivesApplicationType.equals("Pyrotechnic Competency Certificate")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Explosive Pyrotechnic Application Pdf ", pdfTemplate);
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
				String CategoryTypeUpperCase = explosivesApplication.getTypeOfApplicant().toUpperCase();
				String subcategoryUpperCase = explosivesApplication.getTypeOfTransaction().toUpperCase();

				String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
						"successful-application-submission-email-template");
				if (Validator.isNotNull(body)) {
					body = StringUtil.replace(body,
							new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
									"[$subCategory$]","[$childCategory$]","[$transactionNo$]", "[$dashboardURL$]" },

							new String[] { themeDisplay.getUser().getFullName(), "Explosives Competency Certification", "entityName",
									CategoryTypeUpperCase,subcategoryUpperCase ,"",
									explosivesApplication.getApplicationNumber(), explosiveDashboarUrl });
				}
				commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
						themeDisplay.getUser().getEmailAddress(), body);
				_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

			} catch (Exception e) {
				_log.error("An Error Has Occured", e);
			}}
			}else {
	      System.out.println("-------------if response 500 case fail------------------");
	        jsonOBJ.put("explosivesApplicationId", explosivesApplication.getExplosivesApplicationId());
			jsonOBJ.put("ExplosiveAppNum", explosivesApplication.getApplicationNumber());
			jsonOBJ.put("appStatus", ExplosivesCompetencyApplicationWorkFlowConstant.DRAFT_Label);
			jsonOBJ.put("category", explosivesApplication.getTypeOfApplicant());
			jsonFeed.put("APP_DATA", jsonOBJ);
			}
	} catch(UnirestException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch(PortalException e) {
		_log.info("*******************Documents Not Upload***************************");
	}
	resourceResponse.setContentType("application/json");
	try {
		resourceResponse.getWriter().write(jsonFeed.toString());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	_log.info("submit  Explosive application  Ended--------------------------------");

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