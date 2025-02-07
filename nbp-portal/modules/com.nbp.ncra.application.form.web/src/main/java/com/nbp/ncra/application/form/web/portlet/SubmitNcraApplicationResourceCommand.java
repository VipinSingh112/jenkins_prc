package com.nbp.ncra.application.form.web.portlet;

import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
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
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.ncra.application.form.service.model.NcraApplicantDetailInfo;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraApplicantDetailInfoLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraApplicationLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraFeeSubmissionLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;
import com.nbp.ncra.application.form.web.constants.NcraApplicationWorkflowConstants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

@Component(
		immediate = true,
		property = {
		"javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=/ncra/submit" }, service = MVCResourceCommand.class)

public class SubmitNcraApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(SubmitNcraApplicationResourceCommand.class);
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String verificationOption= ParamUtil.getString(resourceRequest, "verificationOption");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String checkPdfDownloadWithoutDocument="false";
		String entityId = (String) themeDisplay.getUser().getExpandoBridge()
				.getAttribute(NCRAApplicationFormPortletKeys.ENTITY_ID);
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		NcraApplication ncraApplication=null;
		System.out.println("Called");
		if (ncraApplicationId > 0) {
		try {
			ncraApplication= NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
			} catch (Exception e) {}
		}
		else {
			ncraApplicationId = CounterLocalServiceUtil.increment(NcraApplication.class.getName());
			ncraApplication = NcraApplicationLocalServiceUtil.createNcraApplication(ncraApplicationId) ;
		}
			ncraApplication.setDoYouWant(verificationOption);
			ncraApplication.setTypeOfTransaction(typeOfTransaction);
			ncraApplication.setEntityId((String) themeDisplay.getUser().getExpandoBridge()
					.getAttribute(NCRAApplicationFormPortletKeys.ENTITY_ID));
			ncraApplication.setCompanyId(themeDisplay.getCompanyId());
			ncraApplication.setGroupId(themeDisplay.getScopeGroupId());
			ncraApplication.setCreateDate(new Date());
			ncraApplication.setUserId(themeDisplay.getUserId());
			ncraApplication.setUserName(themeDisplay.getUser().getFullName());
			if (Validator.isNotNull(entityId)) {
				ncraApplication.setEntityId(entityId);
			}
			ncraApplication.setStatus(NcraApplicationWorkflowConstants.DRAFT);
			if (Validator.isNull(ncraApplication.getApplicationNumber())) {
				_log.info("&&&&&&-------inside draft-------&&&&&");
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				ncraApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplication);
			NcraApplication submittedApplication = null;
			try {
				submittedApplication = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
			} catch (PortalException e2) {
			}
			NcraApplicationLocalServiceUtil.updateNcraApplication(ncraApplication);
			jsonOBJ.put("ncraAppNo", submittedApplication.getApplicationNumber());
			jsonOBJ.put("appStatus", NcraApplicationWorkflowConstants.DRAFT_Label);
			jsonOBJ.put("categories", submittedApplication.getDoYouWant());
			jsonOBJ.put("ncraApplicationId", submittedApplication.getNcraApplicationId());
			jsonFeed.put("APP_DATA", jsonOBJ);
			// ------------------------------------------Launch
						// Case-----------------------------
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
				JSONObject propertiesObject35 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject36 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject42 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject43 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject44 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject45 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject46 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject47 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject48 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject49 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject50 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject51 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject52 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject53 = new JSONFactoryUtil().createJSONObject();
				JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
				System.out.println("submittedApplication.getDoYouWant()--------------"+submittedApplication.getDoYouWant());
				if (submittedApplication.getDoYouWant().equals("Weighing Device")) {
					jsonObject.put("solutionType", "JBGNC_ApplicationforVerificationofScales");
				} else if (submittedApplication.getDoYouWant().equals("Imported Petrol Sample")) {
					jsonObject.put("solutionType", "JBGNC_ApplicationforCertificateofQualityforImportedPetrol");
				}
				if(Validator.isNotNull(ncraApplication.getApplicationNumber())) {
				propertiesObject24.put("key", "JBGNC_Transaction");
				propertiesObject24.put("value",ncraApplication.getApplicationNumber());
				jsonArray.put(propertiesObject24);
				}
				
				propertiesObject53.put("key", "JBGNC_EntityApplicant");
				propertiesObject53.put("value",themeDisplay.getUser().getFullName());
				jsonArray.put(propertiesObject53);
				
				
				NcraFeeSubmission feeSubmission=null;
				try {
					feeSubmission=NcraFeeSubmissionLocalServiceUtil.getNcraFee_By_NCRA_Id(ncraApplication.getNcraApplicationId());
				} catch (Exception e) {
				}
				
				if(Validator.isNotNull(feeSubmission.getCreditStatus())){
				if(feeSubmission.getCreditStatus().equals("30 Days Credit")) {
					propertiesObject49.put("value",
							"Applicant afforded Credit");
					propertiesObject49.put("key", "JBGNC_CreditStatus");
					jsonArray.put(propertiesObject49);
				}
				else if(feeSubmission.getCreditStatus().equals("Payment Upfront")) {
					propertiesObject49.put("value",
							 "Applicant does not have Credit");
					propertiesObject49.put("key", "JBGNC_CreditStatus");
					jsonArray.put(propertiesObject49);
				}else if(feeSubmission.getCreditStatus().equals("")) {
						propertiesObject49.put("value","");
						propertiesObject49.put("key", "JBGNC_CreditStatus");
						jsonArray.put(propertiesObject49);
					}
				}

				String ncraDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest/"
						+ "ncra-dashboard?ncraApplicationId=";
				ncraDashboarUrl = ncraDashboarUrl
						+ String.valueOf(ncraApplication.getNcraApplicationId());

				propertiesObject50.put("key", "JBGNC_DashboardURL");
				propertiesObject50.put("value", ncraDashboarUrl);
				jsonArray.put(propertiesObject50);
				
				propertiesObject51.put("key", "JBGNC_CaseOrigin");
				propertiesObject51.put("value", "Portal");
				jsonArray.put(propertiesObject51);
				
				if(Validator.isNotNull(ncraApplication.getEntityId())) {
				propertiesObject52.put("key", "JBGNC_EntityApplicant");
				propertiesObject52.put("value",ncraApplication.getEntityId());
				jsonArray.put(propertiesObject52);
				}
				
			/* Applicant Details */
				NcraApplicantDetailInfo applicantDetail=null;
				List<NcraVerifyWeighingDeviceInfo> weighDeviceInfo=null;
				NcraVerifyWeighingDate weightDate=null;
				
				try {
					applicantDetail= NcraApplicantDetailInfoLocalServiceUtil.getNcraDetail_By_App_Id(ncraApplicationId);
				} catch (Exception e) {
				}
				if (Validator.isNotNull(applicantDetail)) {
					propertiesObject1.put("key", "JBGNC_NameofBusiness");
					propertiesObject1.put("value", applicantDetail!=null?applicantDetail.getApplicantBusinessName():"");
					jsonArray.put(propertiesObject1);

					propertiesObject2.put("key", "JBGNC_Address");
					propertiesObject2.put("value", applicantDetail!=null?applicantDetail.getApplicantAddress():"");
					jsonArray.put(propertiesObject2);

					propertiesObject3.put("key", "JBGNC_ContactPerson");
					propertiesObject3.put("value", applicantDetail!=null?applicantDetail.getApplicantContact():"");
					jsonArray.put(propertiesObject3);

					/*if (Validator.isNotNull(applicantDetail.getDate())) {
						propertiesObject4.put("key", "JFBAF_DateofApplication");
						propertiesObject4.put("value", bpmDateFormat.format(applicantDetail.getDate()));
						jsonArray.put(propertiesObject4);
					}*/

					propertiesObject4.put("key", "JBGNC_TelephoneNo");
					propertiesObject4.put("value", applicantDetail!=null?applicantDetail.getApplicantTeleNum():"");
					jsonArray.put(propertiesObject4);

					propertiesObject5.put("key", "JBGNC_FaxNo");
					propertiesObject5.put("value", applicantDetail!=null?applicantDetail.getApplicantFaxNo():"");
					jsonArray.put(propertiesObject5);
					
					propertiesObject6.put("key", "JBGNC_Email");
					propertiesObject6.put("value", applicantDetail!=null?applicantDetail.getApplicantEmailAddr():"");
					jsonArray.put(propertiesObject6);
					
					propertiesObject7.put("key", "JBGNC_Locationofpetroltobeverified");
					propertiesObject7.put("value", applicantDetail!=null?applicantDetail.getApplicantLocation():"");
					jsonArray.put(propertiesObject7);
					
				}
				/* Information for Weighing Device */
			/*
			 * try { verificationDevice=
			 * NcraVerifyWeighingDeviceInfoLocalServiceUtil.getNcraVerify_By_NCRA_Id(
			 * ncraApplicationId); } catch (Exception e) { // TODO: handle exception }
			 */
				
				try {
					weighDeviceInfo= NcraVerifyWeighingDeviceInfoLocalServiceUtil.getNcraVerify_By_DataList(ncraApplicationId);
				
				JSONObject infoForWeighdeviceJsonObj = new JSONFactoryUtil().createJSONObject();
				infoForWeighdeviceJsonObj.put("key", "JBGNC_WeighingDeviceInformation");
				JSONObject verifyDeviceJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				if (weighDeviceInfo != null) {
					for (NcraVerifyWeighingDeviceInfo verificationDevice :weighDeviceInfo) {
						JSONObject typeOfDeviceJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject manufacturerJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject serialNumJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject quantityJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject maxCapacityJsonOBJ = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject weighDeviceListObjValueJsonObject = new JSONFactoryUtil().createJSONObject();
						typeOfDeviceJsonOBJ.put("name", "JBGNC_TypeofDevice");
						typeOfDeviceJsonOBJ.put("value", verificationDevice.getTypeofDevice());
						jsonArrayProp.put(typeOfDeviceJsonOBJ);
						
						manufacturerJsonOBJ.put("name", "JBGNC_Manufacturer");
						manufacturerJsonOBJ.put("value", verificationDevice.getManufacturer());
						jsonArrayProp.put(manufacturerJsonOBJ);
						
						serialNumJsonOBJ.put("name", "JBGNC_SerialNumber");
						serialNumJsonOBJ.put("value", verificationDevice.getSerialNumber());
						jsonArrayProp.put(serialNumJsonOBJ);
						
						quantityJsonOBJ.put("name", "JBGNC_Quantity");
						quantityJsonOBJ.put("value", verificationDevice.getQuantity());
						jsonArrayProp.put(quantityJsonOBJ);
						
						maxCapacityJsonOBJ.put("name", "JBGNC_MaximumCapacity");
						maxCapacityJsonOBJ.put("value", verificationDevice.getMaximumCapacity());
						jsonArrayProp.put(maxCapacityJsonOBJ);

						weighDeviceListObjValueJsonObject.put("properties", jsonArrayProp);
						jsonArrayObjects.put(weighDeviceListObjValueJsonObject);
					}
					verifyDeviceJsonObj.put("objects", jsonArrayObjects);
				}
				infoForWeighdeviceJsonObj.put("value", verifyDeviceJsonObj);
				jsonArray.put(infoForWeighdeviceJsonObj);
				} catch (Exception e) {
					// TODO: handle exception
				}
			
					/*propertiesObject13.put("key", "JBGNC_Locationofpetroltobeverified");
					propertiesObject13.put("value", verificationDevice.get);
					jsonArray.put(propertiesObject13);*/
				jsonObject.put("properties", jsonArray);
					_log.info("Request json--------------" + jsonObject.toString());
					String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("icm-launch-case-url");
					_log.info("*************launchCaseUrl in NCRA************" + launchCaseUrl);
					String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("create-case-endpoint");
					_log.info("*************createCaseEndPoint in NCRA************" + createCaseEndPoint);
					Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("bpm-enabled");
					_log.info("*************isBPMEnabled in NCRA************" + isBPMEnabled);
//					String objectStore=(String) themeDisplay.getScopeGroup().getExpandoBridge()
//							.getAttribute("object-store");
//					_log.info("*************Object Store Called in NCRA************" + objectStore);
					
					String token = null;
					String objectStoreValue= null;
					try {
						token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"104",launchCaseUrl);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					_log.info("*************Object Store Called in NCRA************" + objectStoreValue);
					
					if (isBPMEnabled) {
						Unirest.setTimeouts(20000, 120000);
						HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
								.header("Accept", "application/json").header("Content-Type", "application/json")
								.body(jsonObject.toString()).asString();
						System.out.println("response***" + response);
						_log.info("Response body--------------" + response.getBody());
						_log.info("Response code--------------" + response.getCode());

						JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
						String caseId = responseJsonObj.getString("caseid");
						String path = responseJsonObj.getString("path");
						if (response.getCode() == HttpStatus.SC_OK) {
							NcraApplication subNcraApplication = null;
							try {
								subNcraApplication = NcraApplicationLocalServiceUtil.getNcraApplication(ncraApplicationId);
							} catch (PortalException e1) {
							}
							subNcraApplication.setCaseId(caseId);
							subNcraApplication.setIcmDocumentsPath(path);
							subNcraApplication.setStatus(NcraApplicationWorkflowConstants.SUBMITTED);
							NcraApplicationLocalServiceUtil.updateNcraApplication(subNcraApplication);
							jsonOBJ.put("ncraAppNo", subNcraApplication.getApplicationNumber());
							jsonOBJ.put("appStatus", NcraApplicationWorkflowConstants.SUBMITTED_Label);
							jsonOBJ.put("categories", subNcraApplication.getDoYouWant());
							jsonOBJ.put("ncraApplicationId", subNcraApplication.getNcraApplicationId());
							jsonFeed.put("APP_DATA", jsonOBJ);
							DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
									"NCRA Supported Documents");
							DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
									String.valueOf(subNcraApplication.getNcraApplicationId()));
							List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
									.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
							ArrayList<File> filez = new ArrayList<File>();
							for (DLFileEntry dlEntry : supportinfDocFileEntries) {
								filez.add(generateFileByInputStream(dlEntry));
							}
							List<Folder> folder=null;
							Folder specificFolder=null;
							List<DLFileEntry> fileEntries=null;
							try {
							folder=	_dlAppLocalService.getFolders(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),true);
							for(Folder allSupportingFolder :folder) {
							if(!allSupportingFolder.getName().equals("NCRA Application Form PDF") && !allSupportingFolder.getName().equals("Signature")) {
								specificFolder=DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries= DLFileEntryLocalServiceUtil
										.getFileEntries(themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
								for(DLFileEntry dlfile :fileEntries  ) {
									filez.add(generateFileByInputStream(dlfile));
							}}}
							File pdfFile = null;
							try {
								String pdfTemplate = "";
								pdfTemplate = commonsUtil.replaceNCRAApplicationPdfVar(subNcraApplication.getDoYouWant(),subNcraApplication.getNcraApplicationId(), themeDisplay,checkPdfDownloadWithoutDocument);
								System.out.println("pdf template------"+pdfTemplate);
								
								if (ncraApplication.getDoYouWant().equals("Weighing Device")) {
								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"weighing-device",pdfTemplate);
								filez.add(file);
								}
								else if(ncraApplication.getDoYouWant().equals("Imported Petrol Sample")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"imported-petrol-sample-1",pdfTemplate);
									filez.add(file);
								}
							} catch (Exception e) {
								_log.error(e.getMessage());
							}
							 //Sending Email After Form Submission
		    				try {
		    					
		    					  String CategoryTypeUpperCase=submittedApplication.getTypeOfTransaction().toUpperCase();
		    					  String subcategoryUpperCase=subNcraApplication.getDoYouWant().toUpperCase();
		    				String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),"successful-application-submission-email-template");
		    						if (Validator.isNotNull(body)) {
		    					body = StringUtil.replace(body,
		    							new String[] { "[$username$]","[$applicationName$]", "[$entityName$]", "[$Category$]","[$subCategory$]", "[$childCategory$]" ,"[$transactionNo$]", "[$dashboardURL$]"},
		    							
		    							new String[] { themeDisplay.getUser().getFullName(),"NCRA","entityName",CategoryTypeUpperCase,subcategoryUpperCase,"",subNcraApplication.getApplicationNumber(),
		    									ncraDashboarUrl});
		    						}	
		    					 commonsUtil.sendMailToUsers("Your Application Submitted",
		    							"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(), body);
		    					 _log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());
		    			}catch(Exception e) 
		    				{
		    				e.printStackTrace();
		    			}
		    				
							String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("upload-files-api-endpoint");
							_log.info("path--------------" + path);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+ "?tos="+objectStoreValue)
										.field("path", path).field("files", supportingDocs).asString();
								_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
								
								}
							}catch (Exception e) {}
						}
					}//bpm enabled closed
				

			}catch (IOException e) {
				e.printStackTrace();
			} catch (UnirestException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jsonFeed.put("APP_DATA", jsonOBJ);
			resourceResponse.setContentType("application/json");

			try {
				resourceResponse.getWriter().write(jsonFeed.toString());
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
		
	}

	public File generateFileByInputStream(DLFileEntry dlFileEntry) throws PortalException, java.io.IOException {
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
