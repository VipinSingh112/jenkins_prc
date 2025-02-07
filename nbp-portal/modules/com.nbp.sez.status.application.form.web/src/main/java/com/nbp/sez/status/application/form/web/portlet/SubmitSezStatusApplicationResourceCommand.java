package com.nbp.sez.status.application.form.web.portlet;


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
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevGeneralBusinessIfoException;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.*;
import com.nbp.sez.status.application.form.service.service.*;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationWorkflowConstant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpStatus;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/final/submit" }, service = MVCResourceCommand.class)
public class SubmitSezStatusApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitSezStatusApplicationResourceCommand.class.getName());
	public static DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		String typeOfApplication = ParamUtil.getString(resourceRequest, "typeOfSezStatus");
		String typeOfIndustry = ParamUtil.getString(resourceRequest, "typeOfIndustry");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String specialEconomicZoneCheckBoxInfo = ParamUtil.getString(resourceRequest,
				"specialEconomicZoneCheckBoxInfo");
		String zoningClassificationCheckBoxInfo = ParamUtil.getString(resourceRequest,
				"zoningClassificationCheckBoxInfo");
		String sezApplicationParish = ParamUtil.getString(resourceRequest, "sezApplicationParish");
		String checkPdfSendingInLaunchCaseWithoutDoc="false";
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		String doYouWantTo = ParamUtil.getString(resourceRequest, "doYouWantTo");
		String applicantWorkOfHomeStatus = ParamUtil.getString(resourceRequest, "applicantWorkOfHomeStatus");
		SezStatusApplication seStatusAplication = null;
		SezStatusApplicationCurrentStage currentStage=null;
		try {
			seStatusAplication = SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			currentStage=SezStatusApplicationCurrentStageLocalServiceUtil.getSEZ_Stage_SAI(sezStatusApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(currentStage==null) {
			currentStage=SezStatusApplicationCurrentStageLocalServiceUtil.createSezStatusApplicationCurrentStage(CounterLocalServiceUtil.increment());
		}
		seStatusAplication.setStatus(SezStatusApplicationWorkflowConstant.DRAFT);
		seStatusAplication.setEntityId((String)themeDisplay.getUser().getExpandoBridge().getAttribute(SezStatusApplicationFormPortletKeys.ENTITY_ID));
		SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(seStatusAplication);
		// setting current stage if sez application in draft during summit
		currentStage.setCurrentStage("SEZ STATUS PREVIEW FORM");
		currentStage.setLastFormStep(lastFormDetailsStep);
		currentStage.setSezStatusApplicationId(sezStatusApplicationId);
		SezStatusApplicationCurrentStageLocalServiceUtil.updateSezStatusApplicationCurrentStage(currentStage);
		jsonOBJ.put("sezStatusAppNo", seStatusAplication.getApplicationNumber());
		jsonOBJ.put("status", SezStatusApplicationWorkflowConstant.DRAFT_Label);
		if(seStatusAplication.getDoYouWantTo().equals("Submit an Application for A Work From Home Certificate")) {
		jsonOBJ.put("sezStatus","Work From Home Certificate");
		}else {
			jsonOBJ.put("sezStatus", seStatusAplication.getSezStatus());
		}
		jsonFeed.put("APP_DATA", jsonOBJ);
		try {
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject5 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject6 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject7 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject17 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject8 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject9 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject10 = new JSONFactoryUtil().createJSONObject();
			JSONArray jsonArray= new JSONFactoryUtil().createJSONArray();
			if(doYouWantTo.contains("Submit an Application for A Work From Home Certificate")) {
				jsonObject.put("solutionType", "JSEZA_ApplicationforAWorkFromHomeCertificate");	
			}else {
			jsonObject.put("solutionType", "JSEZA_ApplicationforSEZStatus");
			}
			SezStatusApplication sezStatusApplication=null;
			try {
				sezStatusApplication= SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			propertiesObject1.put("key", "JSEZA_ApplicationforSEZStatus");
			propertiesObject1.put("value", sezStatusApplication.getSezStatus());
			//jsonArray.put(propertiesObject1);
			propertiesObject5.put("key", "JSEZA_CaseOrigination");
			propertiesObject5.put("value", "Portal");
			
			jsonArray.put(propertiesObject5);
			
			propertiesObject17.put("key", "JSEZA_Transaction");
			propertiesObject17.put("value", sezStatusApplication.getApplicationNumber());
			jsonArray.put(propertiesObject17);
			
			propertiesObject6.put("key", "JSEZA_SEZStatus");
			if(sezStatusApplication.getSezStatus().equals("SEZ Developer")) {
				propertiesObject6.put("value", "Developer");
			}
			else if(sezStatusApplication.getSezStatus().equals("SEZ Occupant")) {
				propertiesObject6.put("value", "Occupant");
			}
			else if(sezStatusApplication.getSezStatus().equals("SEZ Zone User")) {
				propertiesObject6.put("value", "Zone User");
			}
			else if(sezStatusApplication.getSezStatus().equals("MSME Occupant")) {
				propertiesObject6.put("value", "MSME Occupants");
			}
			else if(sezStatusApplication.getSezStatus().equals("")) {
				propertiesObject6.put("value", "");
			}
			jsonArray.put(propertiesObject6);
			
			propertiesObject2.put("key", "JSEZA_TypeofTransaction");
			if((sezStatusApplication.getTypeOfTransaction().equals("New Application for SEZ Developer Status"))||sezStatusApplication.getTypeOfTransaction().equals("New Application for SEZ Occupant Status")||sezStatusApplication.getTypeOfTransaction().equals("New Application for SEZ Occupant Status")||sezStatusApplication.getTypeOfTransaction().equals("New Application for SEZ Zone User Status")) {
				propertiesObject2.put("value", "New");
			}else if((sezStatusApplication.getTypeOfTransaction().equals("Application for Renewal of SEZ Developer Status"))||sezStatusApplication.getTypeOfTransaction().equals("Application for Renewal of SEZ Occupant Status")||sezStatusApplication.getTypeOfTransaction().equals("Application for Re-authorization SEZ Zone User Status")) {
				propertiesObject2.put("value", "Renewal");
			}else if((sezStatusApplication.getTypeOfTransaction().equals("Application to Expand SEZ Developer Status"))||sezStatusApplication.getTypeOfTransaction().equals("Application to Expand SEZ Occupant Status")) {
				propertiesObject2.put("value", "Expansion");
			}else if(sezStatusApplication.getTypeOfTransaction().equals("")) {
				propertiesObject2.put("value", "");
			}				
			jsonArray.put(propertiesObject2);
			//		WE NOT HAVE A CHOICE LIST FOR ZONING CLASSIFICATION IN SHEET ZONING CLASSIFICATION ASSIGN  SPECIAL ECONOMIC ZONE
			propertiesObject3.put("key", "JSEZA_ZoningClassification");
			JSONArray zoneValue= new JSONFactoryUtil().createJSONArray();
			String[] sezClassification =sezStatusApplication.getZoningClassification().split(",");
			for (String string : sezClassification) {
				if(string.equals("Industrial")) {
					zoneValue.put("Industrial");
				}
				else if(string.equals("Agricultural")) {
					zoneValue.put( "Agricultural");
				}
				else if(string.equals("Residential")) {
					zoneValue.put("Residential");
				}
				else if(string.equals("Commercial")) {
					zoneValue.put("Commercial");
				}
				else if(string.equals("")) {
					zoneValue.put("");
				}	
			}
		
			propertiesObject3.put("value", zoneValue);
			jsonArray.put(propertiesObject3);
			
			
			propertiesObject4.put("key", "JSEZA_Special Economic Zone");
			String string = sezStatusApplication.getSpecialEconomicZone();
			if (string.equals("Multi-Purpose Zone")) {
				propertiesObject4.put("value", "Multi-Purpose Zone");
			}
			if (string.equals("Single-Entity Zone")) {
				propertiesObject4.put("value", "Single-Entity Zone");
			}
			if (string.equals("Multi-Purpose Integrated Zone (Includes residential areas)")) {
				propertiesObject4.put("value", "Multi-Purpose Integrated Zone (Includes residential areas)");
			}
			if (string.equals("Specialised Zone")) {
				propertiesObject4.put("value", "Specialized Zone");
			}
			if (string.equals("")) {
				propertiesObject4.put("value", "");
			}
			jsonArray.put(propertiesObject4);
			
			/*propertiesObject7.put("key", "JSEZA_Parish");
			propertiesObject7.put("value", sezStatusApplication.getParish());
//			jsonArray.put(propertiesObject7);*/
			propertiesObject7.put("key", "JSEZA_Parish");
			if (sezStatusApplication.getParish().equals("Kingston")) {
				propertiesObject7.put("value", "Kingston");
			} else if (sezStatusApplication.getParish().equals("St. Andrew")) {
				propertiesObject7.put("value", "St. Andrew");
			} else if (sezStatusApplication.getParish().equals("Manchester")) {
				propertiesObject7.put("value", "Manchester");
			}  else if (sezStatusApplication.getParish().equals("Portland")) {
				propertiesObject7.put("value", "Portland");
			} else if (sezStatusApplication.getParish().equals("St. Catherine")) {
				propertiesObject7.put("value", "St. Catherine");
			} else if (sezStatusApplication.getParish().equals("St. Thomas")) {
				propertiesObject7.put("value", "St. Thomas");
			} else if (sezStatusApplication.getParish().equals("St. Mary")) {
				propertiesObject7.put("value", "St. Mary");
			} else if (sezStatusApplication.getParish().equals("Portland")) {
				propertiesObject7.put("value", "Portland");
			} else if (sezStatusApplication.getParish().equals("St. Ann")) {
				propertiesObject7.put("value", "St. Ann");
			} else if (sezStatusApplication.getParish().equals("Trelawny")) {
				propertiesObject7.put("value", "Trelawny");
			} else if (sezStatusApplication.getParish().equals("St. James")) {
				propertiesObject7.put("value", "St. James");
			} else if (sezStatusApplication.getParish().equals("Hanover")) {
				propertiesObject7.put("value", "Hanover");
			} else if (sezStatusApplication.getParish().equals("Westmoreland")) {
				propertiesObject7.put("value", "Westmoreland");
			} else if (sezStatusApplication.getParish().equals("St. Elizabeth")) {
				propertiesObject7.put("value", "St. Elizabeth");
			} else if (sezStatusApplication.getParish().equals("Clarendon")) {
				propertiesObject7.put("value", "Clarendon");
			}else if (sezStatusApplication.getParish().equals("")) {
				propertiesObject7.put("value", "");
			}
			jsonArray.put(propertiesObject7);
			
			String dashboardURL=PortalUtil.getPortalURL(resourceRequest)+"/group/guest"+"/sez-status-dashboard?sezStatusApplicationId=";
			dashboardURL = dashboardURL+String.valueOf(sezStatusApplication.getSezStatusApplicationId());
			propertiesObject8.put("key", "JSEZA_DashboardURL");
			propertiesObject8.put("value", dashboardURL);
			jsonArray.put(propertiesObject8);
			
			SezStatusAppPayment appPayment=null;
			try {
				appPayment = SezStatusAppPaymentLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			} catch (Exception e) {
			}
			
			propertiesObject9.put("key", "JSEZA_PaymentMethod");
			propertiesObject9.put("value", appPayment!=null?appPayment.getPaymentMethod():"");
			jsonArray.put(propertiesObject9);
			
			if (appPayment != null) {
				propertiesObject10.put("key", "JSEZA_AmountDue");
				//Sez Develpoer Form Application Fee
				if (sezStatusApplication.getSezStatus().equals("SEZ Developer")) {
					propertiesObject10.put("value", "3000");
				}
				// Sez Occupant Form Application Fee
				else if (sezStatusApplication.getSezStatus().equals("SEZ Occupant")) {
					propertiesObject10.put("value", "1500");
				}
				// Sez ZONE USER Form Application Fee
				else if (sezStatusApplication.getSezStatus().equals("SEZ Zone User")) {
					propertiesObject10.put("value", "100");
				} else if (sezStatusApplication.getSezStatus().equals("MSME Occupant")) {
					// propertiesObject10.put("value", "");
				}else if (sezStatusApplication.getSezStatus().equals("")) {
					 propertiesObject10.put("value", "");
				}
				jsonArray.put(propertiesObject10);
			}
			
			// KEY FOR INDUSTRIES NOT AVAILABLE
			//  Sez Developer Form Fields Integration
			if(sezStatusApplication.getSezStatus().equals("SEZ Developer")) {
				launchCaseForDeveloperCategory(sezStatusApplicationId, jsonArray);
			}
			//  Sez Occupant Form Fields Integration
			else if(sezStatusApplication.getSezStatus().equals("SEZ Occupant")) {
				launchCaseForSezOccupant(sezStatusApplicationId, jsonArray);
			}
			//  Sez ZONE USER Form Fields Integration
			else if(sezStatusApplication.getSezStatus().equals("SEZ Zone User")) {
				launchCaseForZoneUser(sezStatusApplicationId, jsonArray);
			}
			else if(sezStatusApplication.getSezStatus().equals("MSME Occupant")) {
				//NOT AVAILABLE
			}else if(sezStatusApplication.getDoYouWantTo().contains("Submit an Application for A Work From Home Certificate")){
				launchCaseWorkFromHome(sezStatusApplicationId,jsonArray,sezStatusApplication,applicantWorkOfHomeStatus);
			}
			
			
			
			
			_log.info("*************isBPMEnabled in SEZ Status***********method*");
			jsonObject.put("properties", jsonArray);
			_log.info("Request json--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in SEZ Status************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in SEZ Status************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in SEZ Status************" + isBPMEnabled);
//			String objectStore=(String) themeDisplay.getScopeGroup().getExpandoBridge()
//					.getAttribute("object-store");
//			_log.info("*************Object Store Called in SEZ Status************" + objectStore);
			
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"106",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in SEZ Status************" + objectStoreValue);
			
			if (isBPMEnabled) {
				System.out.println("--------------inside BPMEnabled------------------"+sezStatusApplicationId);
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
						.header("Accept", "application/json")
						.header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");
				//String documentClass  = responseJsonObj.getString("JSEZA_ApplicationFormforSEZStatus");
				//_log.info("documentClass retrieved---->>>> " + documentClass);
				if (response.getCode() == HttpStatus.SC_OK) {
					System.out.println("--------------Inside response code ------------------");
					SezStatusApplication sezApplicationForSubmitted = null;
					System.out.println("--------------sezStatusApplicationId------------------"+sezStatusApplicationId);
					try {
						sezApplicationForSubmitted = SezStatusApplicationLocalServiceUtil.getSezStatusApplication(sezStatusApplicationId);
						System.out.println("--------------sezStatusApplicationId------------------"+sezStatusApplicationId);
						System.out.println("--------------sezApplication------------------"+sezApplicationForSubmitted.getSezStatusApplicationId());
					} catch (PortalException e1) {
						e1.printStackTrace();
					}
					System.out.println("--------------caseId------------------"+caseId);
					sezApplicationForSubmitted.setStatus(SezStatusApplicationWorkflowConstant.SUBMITTED);
					sezApplicationForSubmitted.setCaseId(caseId);
					System.out.println("--------------caseId------------------"+caseId);
					sezApplicationForSubmitted.setIcmDocumentsPath(path);
					sezApplicationForSubmitted.setStatus(SezStatusApplicationWorkflowConstant.SUBMITTED);
					sezApplicationForSubmitted.setEntityId((String)themeDisplay.getUser().getExpandoBridge().getAttribute(SezStatusApplicationFormPortletKeys.ENTITY_ID));
					SezStatusApplicationLocalServiceUtil.updateSezStatusApplication(sezApplicationForSubmitted);
					jsonOBJ.put("sezStatusAppNo", seStatusAplication.getApplicationNumber());
					jsonOBJ.put("status", SezStatusApplicationWorkflowConstant.SUBMITTED_Label);
					jsonFeed.put("APP_DATA", jsonOBJ);
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Sez Status Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(sezStatusApplicationId));
					List<DLFileEntry> supportinfDocFileEntries = DLFileEntryLocalServiceUtil
							.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId());
					ArrayList<File> filez = new ArrayList<File>();
					for (DLFileEntry dlEntry : supportinfDocFileEntries) {
						filez.add(generateFileByInputStream(dlEntry));
					}
					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");
					_log.info("path--------------" + path);
					 for (File supportingDocs : filez) {
						
						   HttpResponse<String>
						  documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+
						  "?tos="+objectStoreValue) .
						  field("path", "JSEZA_SupportingDocuments")
						  .field("files", supportingDocs)
						  .asString();

                         _log.info("document service resonse JSEZA_SupportingDocuments ----------------" +
						  documentUploadresponse.getCode()); }
					/* Clear the array list */
					 //filez.clear();
					 filez=null;
					 
					List<Folder> folder=null;
					Folder specificFolder=null;
					List<DLFileEntry> fileEntries=null;
					try {
				folder=	_dlAppLocalService.getFolders(themeDisplay.getScopeGroupId(), supportingDocumentsFolder.getFolderId(),true);
					for(Folder allSupportingFolder :folder) {
					if(
							(!allSupportingFolder.getName().equals("Signature of Developer Submission Checklist"))||(!allSupportingFolder.getName().equals("Signature of Developer Public Notary"))||(!allSupportingFolder.getName().equals("Signature of Occupant Declarant"))
							||(!allSupportingFolder.getName().equals("Signature of Zone User Submission"))||(!allSupportingFolder.getName().equals("Signature Of Zone User Developer Notary"))||(!allSupportingFolder.getName().equals("Signature of Zone User Developer Declarant"))
							||(!allSupportingFolder.getName().equals("Signature Of Zone User Undertaking Notary"))||(!allSupportingFolder.getName().equals("Signature Of Zone User Undertaking Declerant"))
							||(!allSupportingFolder.getName().equals("Signature of Occupant Developer Undertaking Stamp"))
							||(!allSupportingFolder.getName().equals("Signature of Occupant Zone Undertaking Notary"))
							||(!allSupportingFolder.getName().equals("Signature of Occupant Zone Undertaking"))
							) {
						
						specificFolder=DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
						fileEntries= DLFileEntryLocalServiceUtil
								.getFileEntries(themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
						for(DLFileEntry dlfile :fileEntries  ) {
							filez.add(generateFileByInputStream(dlfile));
							}
						}
					}
					/*for (File supportingDocs : filez) {
						
						   HttpResponse<String>
						  documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+
						  "?tos="+objectStore) .
						  field("path", "JSEZA_SupportingDocuments")
						  .field("files", supportingDocs)
						  .asString();

                      _log.info("document service resonse ----------------" +
						  documentUploadresponse.getCode()); }*/
					
					try {

						String CategoryTypeUpperCase = seStatusAplication.getSezStatus().toUpperCase();
						String subcategoryUpperCase = seStatusAplication.getTypeOfTransaction().toUpperCase();
						String childcategoryUpperCase = seStatusAplication.getIndustries().toUpperCase();

						String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"successful-application-submission-email-template");
						if (Validator.isNotNull(body)) {
							body = StringUtil.replace(body,
									new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
											"[$subCategory$]", "[$childCategory$]", "[$transactionNo$]" },

									new String[] { themeDisplay.getUser().getFullName(), "SEZ-STATUS", "entityName",
											CategoryTypeUpperCase, subcategoryUpperCase, childcategoryUpperCase,
											seStatusAplication.getApplicationNumber() });
						}
						commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
								themeDisplay.getUser().getEmailAddress(), body);
						_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

					} catch (Exception e) {
						e.printStackTrace();
					}
					
//					sending PDF in the lanch case without document 
						try {
							String pdfTemplate = "";
							pdfTemplate = commonsUtil.replaceSEZApplicationPdfVar(seStatusAplication.getSezStatus(),seStatusAplication.getSezStatusApplicationId(),
									themeDisplay, checkPdfSendingInLaunchCaseWithoutDoc);
							System.out.println("pdf templet in launch case is ------------"+pdfTemplate);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
									"sez_status_application_form", pdfTemplate);
							filez.add(file);
						} catch (Exception e) {
							_log.error(e.getMessage());
						}
					
					
					_log.info("path--------------" + path);
							
					for (File supportingDocs : filez) {
						
						   HttpResponse<String>
						  documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+
						  "?tos="+objectStoreValue).field("path", "JSEZA_ApplicationFormforSEZStatus")
						  .field("files", supportingDocs).asString();

                      _log.info("document service resonse JSEZA_ApplicationFormforSEZStatus ----------------" +documentUploadresponse.getCode());
                      }
					filez=null;
					
						/* For PAyment Reciept */
					DLFolder paymentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(), "Fee Reciept");
					List<DLFileEntry> supportingDocFileEntries =DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), paymentFolder.getFolderId());
					for (DLFileEntry dlFileEntry : supportingDocFileEntries) {
						FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(dlFileEntry.getFileEntryId());
					}
					for (File supportingDocs : filez) {
						
						   HttpResponse<String>
						  documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+
						  "?tos="+objectStoreValue).field("path", "JSEZA_PaymentReceipt")
						  .field("files", supportingDocs).asString();

                   _log.info("document service resonse -------------JSEZA_PaymentReceipt---" +
						  documentUploadresponse.getCode()); }
					
				
					}catch (Exception e) {
				}
				}
			}
		} catch (Exception e) {				
		}
		_log.info("Sez Status Application Submit End--------------");
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
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
	private static File createPDFFile(String fileName) {
		File reportFile = null;
		File exportDir = getExportDirectory();
		StringBuffer reportFileName = new StringBuffer(exportDir.getAbsolutePath()).append("//").append(fileName);
		reportFile = new File(reportFileName.toString());
		return reportFile;
	}
	private static File getExportDirectory() {
		String exportDirPath = System.getProperty("catalina.base") + "//temp//supporting-documents";
		File exportDir = new File(exportDirPath);

		if (!exportDir.exists()) {
			exportDir.mkdir();
		}
		return exportDir;
	}

	@Reference
	private CommonsUtil commonsUtil;
	@Reference
	private DLAppService _dlAppLocalService;

	public void launchCaseForDeveloperCategory(long sezStatusApplicationId, JSONArray jsonArray) {
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo = null;
		try {
			sezDevGeneralBusinessIfo = SezDevGeneralBusinessIfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (NoSuchSezDevGeneralBusinessIfoException e) {
			e.printStackTrace();
		}
		JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
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
		try {
			try {
			propertiesObject1.put("key", "JSEZA_DateofApplicationReceived");
			propertiesObject1.put("value", bpmDateFormat.format(sezDevGeneralBusinessIfo.getApplicationDate()));
			jsonArray.put(propertiesObject1);
			}catch (Exception e) {
				// TODO: handle exception
			}
			propertiesObject2.put("key", "JSEZA_NameofApplicant");
			propertiesObject2.put("value", sezDevGeneralBusinessIfo.getApplicantName());
			jsonArray.put(propertiesObject2);
			propertiesObject3.put("key", "JSEZA_CompanyName");
			propertiesObject3.put("value", sezDevGeneralBusinessIfo.getCompanyName());
			jsonArray.put(propertiesObject3);
			propertiesObject4.put("key", "JSEZA_Address");
			propertiesObject4.put("value", sezDevGeneralBusinessIfo.getBuildingNum());
			jsonArray.put(propertiesObject4);
			propertiesObject5.put("key", "JSEZA_TownCity");
			propertiesObject5.put("value", sezDevGeneralBusinessIfo.getTownCity());
			jsonArray.put(propertiesObject5);
			/*propertiesObject6.put("key", "JSEZA_Parish");
			propertiesObject6.put("value", sezDevGeneralBusinessIfo.getParish());
			jsonArray.put(propertiesObject6);*/
			propertiesObject6.put("key", "JSEZA_Parish");
			if (sezDevGeneralBusinessIfo.getParish().equals("Kingston")) {
				propertiesObject6.put("value", "Kingston");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Andrew")) {
				propertiesObject6.put("value", "St. Andrew");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Manchester")) {
				propertiesObject6.put("value", "Manchester");
			}  else if (sezDevGeneralBusinessIfo.getParish().equals("Portland")) {
				propertiesObject6.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Catherine")) {
				propertiesObject6.put("value", "St. Catherine");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Thomas")) {
				propertiesObject6.put("value", "St. Thomas");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Mary")) {
				propertiesObject6.put("value", "St. Mary");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Portland")) {
				propertiesObject6.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Ann")) {
				propertiesObject6.put("value", "St. Ann");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Trelawny")) {
				propertiesObject6.put("value", "Trelawny");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. James")) {
				propertiesObject6.put("value", "St. James");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Hanover")) {
				propertiesObject6.put("value", "Hanover");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Westmoreland")) {
				propertiesObject6.put("value", "Westmoreland");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("St. Elizabeth")) {
				propertiesObject6.put("value", "St. Elizabeth");
			} else if (sezDevGeneralBusinessIfo.getParish().equals("Clarendon")) {
				propertiesObject6.put("value", "Clarendon");
			}else if (sezDevGeneralBusinessIfo.getParish().equals("")) {
				propertiesObject6.put("value", "");
			}
			jsonArray.put(propertiesObject6);
			
			propertiesObject7.put("key", "JSEZA_Country");
			propertiesObject7.put("value", sezDevGeneralBusinessIfo.getCountry());
			jsonArray.put(propertiesObject7);
			propertiesObject8.put("key", "JSEZA_Telephone");
			propertiesObject8.put("value", sezDevGeneralBusinessIfo.getTelephoneNum());
			jsonArray.put(propertiesObject8);
			propertiesObject9.put("key", "JSEZA_EmailAddress");
			propertiesObject9.put("value", sezDevGeneralBusinessIfo.getEmailAddress());
			jsonArray.put(propertiesObject9);
			propertiesObject10.put("key", "JSEZA_Website");
			propertiesObject10.put("value", sezDevGeneralBusinessIfo.getWebsite());
			jsonArray.put(propertiesObject10);
			propertiesObject11.put("key", "JSEZA_Address");
			propertiesObject11.put("value", sezDevGeneralBusinessIfo.getHeadOfficeBuildingNum());
			jsonArray.put(propertiesObject11);
			propertiesObject12.put("key", "JSEZA_TownCity");
			propertiesObject12.put("value", sezDevGeneralBusinessIfo.getHeadOfficeTown());
			jsonArray.put(propertiesObject12);
			/*propertiesObject13.put("key", "JSEZA_Parish");
			propertiesObject13.put("value", sezDevGeneralBusinessIfo.getHeadOfficeParish());
			jsonArray.put(propertiesObject13);*/
			propertiesObject13.put("key", "JSEZA_ParishofLocalHeadOffice");
			if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Kingston")) {
				propertiesObject13.put("value", "Kingston");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Andrew")) {
				propertiesObject13.put("value", "St. Andrew");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Manchester")) {
				propertiesObject13.put("value", "Manchester");
			}  else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Portland")) {
				propertiesObject13.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Catherine")) {
				propertiesObject13.put("value", "St. Catherine");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Thomas")) {
				propertiesObject13.put("value", "St. Thomas");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Mary")) {
				propertiesObject13.put("value", "St. Mary");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Portland")) {
				propertiesObject13.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Ann")) {
				propertiesObject13.put("value", "St. Ann");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Trelawny")) {
				propertiesObject13.put("value", "Trelawny");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. James")) {
				propertiesObject13.put("value", "St. James");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Hanover")) {
				propertiesObject13.put("value", "Hanover");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Westmoreland")) {
				propertiesObject13.put("value", "Westmoreland");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("St. Elizabeth")) {
				propertiesObject13.put("value", "St. Elizabeth");
			} else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("Clarendon")) {
				propertiesObject13.put("value", "Clarendon");
			}else if (sezDevGeneralBusinessIfo.getHeadOfficeParish().equals("")) {
				propertiesObject13.put("value", "");
			}
			jsonArray.put(propertiesObject13);
			
			propertiesObject14.put("key", "JSEZA_Country");
			propertiesObject14.put("value", sezDevGeneralBusinessIfo.getCountry());
			jsonArray.put(propertiesObject14);
			propertiesObject50.put("key", "JSEZA_Address");
			propertiesObject50.put("value", sezDevGeneralBusinessIfo.getAuthRepBuildingNum());
			jsonArray.put(propertiesObject50);
			propertiesObject15.put("key", "JSEZA_TownCity");
			propertiesObject15.put("value", sezDevGeneralBusinessIfo.getAuthRepTown());
			jsonArray.put(propertiesObject15);
			/*propertiesObject16.put("key", "JSEZA_Parish");
			propertiesObject16.put("value", sezDevGeneralBusinessIfo.getAuthRepParish());
			jsonArray.put(propertiesObject16);*/
			propertiesObject16.put("key", "JSEZA_AuthorizedRepresentativeParish");
			if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Kingston")) {
				propertiesObject16.put("value", "Kingston");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Andrew")) {
				propertiesObject16.put("value", "St. Andrew");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Manchester")) {
				propertiesObject16.put("value", "Manchester");
			}  else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Portland")) {
				propertiesObject16.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Catherine")) {
				propertiesObject16.put("value", "St. Catherine");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Thomas")) {
				propertiesObject16.put("value", "St. Thomas");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Mary")) {
				propertiesObject16.put("value", "St. Mary");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Portland")) {
				propertiesObject16.put("value", "Portland");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Ann")) {
				propertiesObject16.put("value", "St. Ann");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Trelawny")) {
				propertiesObject16.put("value", "Trelawny");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. James")) {
				propertiesObject16.put("value", "St. James");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Hanover")) {
				propertiesObject16.put("value", "Hanover");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Westmoreland")) {
				propertiesObject16.put("value", "Westmoreland");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("St. Elizabeth")) {
				propertiesObject16.put("value", "St. Elizabeth");
			} else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("Clarendon")) {
				propertiesObject16.put("value", "Clarendon");
			}else if (sezDevGeneralBusinessIfo.getAuthRepParish().equals("")) {
				propertiesObject16.put("value", "");
			}
			jsonArray.put(propertiesObject16);
			propertiesObject17.put("key", "JSEZA_Country");
			propertiesObject17.put("value", sezDevGeneralBusinessIfo.getAuthRepCountry());
			jsonArray.put(propertiesObject17);
			propertiesObject18.put("key", "JSEZA_Telephone");
			propertiesObject18.put("value", sezDevGeneralBusinessIfo.getAuthReptelephoneNum());
			jsonArray.put(propertiesObject18);
			propertiesObject19.put("key", "JSEZA_EmailAddress");
			propertiesObject19.put("value", sezDevGeneralBusinessIfo.getAutheEmailAddress());
			jsonArray.put(propertiesObject19);
			propertiesObject21.put("key", "JSEZA_CompanyName");
			propertiesObject21.put("value", sezDevGeneralBusinessIfo.getCompanyName());
			jsonArray.put(propertiesObject21);
			propertiesObject51.put("key", "JSEZA_Question1");
			propertiesObject51.put("value", sezDevGeneralBusinessIfo.getJoinVenture());
			jsonArray.put(propertiesObject51);
			try {
				List<SezDevGenBusinessInfoAdd> sezDevGenBusInfoAdd= SezDevGenBusinessInfoAddLocalServiceUtil.getSezById(sezStatusApplicationId);
				JSONObject sezDevGenVentureInfoJsonObj = new JSONFactoryUtil().createJSONObject();
				sezDevGenVentureInfoJsonObj.put("key", "JSEZA_JointVentureDetails");
				JSONObject sezDevGenAddValueJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				if (sezDevGenVentureInfoJsonObj != null) {
					for (SezDevGenBusinessInfoAdd jointVentureState : sezDevGenBusInfoAdd) {
						JSONObject propertiesObject60 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject61 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject62 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject63 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject64 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject65 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject66 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject67 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject stateCompanyInfoValueJsonObj = new JSONFactoryUtil().createJSONObject();
						
						propertiesObject60.put("name", "JSEZA_CompanyName");
						propertiesObject60.put("value", jointVentureState.getCompanyName());
						jsonArrayProp.put(propertiesObject60);
						
						propertiesObject61.put("name", "JSEZA_Address");
						propertiesObject61.put("value", jointVentureState.getBuildingNum());
						jsonArrayProp.put(propertiesObject61);

						propertiesObject62.put("name", "JSEZA_TownCity");
						propertiesObject62.put("value", jointVentureState.getTownCity());
						jsonArrayProp.put(propertiesObject62);
				
						propertiesObject63.put("name", "JSEZA_JointVentureParish");
						propertiesObject63.put("value", jointVentureState.getParish());
						jsonArrayProp.put(propertiesObject63);

						propertiesObject64.put("name", "JSEZA_Country");
						propertiesObject64.put("value", jointVentureState.getCountry());
						jsonArrayProp.put(propertiesObject64);

						propertiesObject65.put("name", "JSEZA_Telephone");
						propertiesObject65.put("value", jointVentureState.getTelephoneNum());
						jsonArrayProp.put(propertiesObject65);
						
						/*propertiesObject66.put("name", "JSEZA_Telephone");
						propertiesObject66.put("value", jointVentureState.getFaxNum());
						jsonArrayProp.put(propertiesObject66);
						
						propertiesObject67.put("name", "JSEZA_Telephone");
						propertiesObject67.put("value", jointVentureState.getEmailAddress());
						jsonArrayProp.put(propertiesObject67);*/
						
						
						stateCompanyInfoValueJsonObj.put("properties", jsonArrayProp);
							jsonArrayObjects.put(stateCompanyInfoValueJsonObj);
					}
					sezDevGenAddValueJsonObj.put("objects", jsonArrayObjects);
				}
				sezDevGenVentureInfoJsonObj.put("value", sezDevGenAddValueJsonObj);
				jsonArray.put(sezDevGenVentureInfoJsonObj);
				} catch (Exception e) {
					_log.error("error********************" + e.getMessage());
					_log.error("cause********************" + e.getCause());
				
				}
			propertiesObject22.put("key", "JSEZA_Question2");
			propertiesObject22.put("value", sezDevGeneralBusinessIfo.getExistingJamicanCom());
			jsonArray.put(propertiesObject22);
			propertiesObject23.put("key", "JSEZA_Question3");
			propertiesObject23.put("value", sezDevGeneralBusinessIfo.getCompanyClassified());
			jsonArray.put(propertiesObject23);
			propertiesObject24.put("key", "JSEZA_TaxpayerRegistrationNumber");
			propertiesObject24.put("value", sezDevGeneralBusinessIfo.getTaxRegisNum());
			jsonArray.put(propertiesObject24);
			propertiesObject25.put("key", "JSEZA_GeneralConsumptionTaxNumber");
			propertiesObject25.put("value", sezDevGeneralBusinessIfo.getGenConsumptionNum());
			jsonArray.put(propertiesObject25);
			propertiesObject26.put("key", "JSEZA_TaxComplianceCertificateNumber");
			propertiesObject26.put("value", sezDevGeneralBusinessIfo.getTaxComplianceCertificateNum());
			jsonArray.put(propertiesObject26);

			if (sezDevGeneralBusinessIfo != null && sezDevGeneralBusinessIfo.getExistingJamicanCom().equals("Yes")) {
				propertiesObject49.put("key", "JSEZA_FormOfTheArticlesOfIncorporation");
				String existingInfoJamaicanComValues=sezDevGeneralBusinessIfo.getArticleOfIncorporation();
					if(existingInfoJamaicanComValues.equals("A company limited by shares")) {
						propertiesObject49.put("value", "A Company Limited By Shares");
					}
					else if(existingInfoJamaicanComValues.equals("A company limited by guarantee and not having a share capital")) {
						propertiesObject49.put("value", "A Company Limited By Guarantee And Not Having A Share Capital");
					}
					else if(existingInfoJamaicanComValues.equals("An unlimited company having a share capital")) {
						propertiesObject49.put("value", "A Company Limited By Guarantee And Not Having A Share Capital");
					}
					else if(existingInfoJamaicanComValues.equals("Partnership")) {
						propertiesObject49.put("value", "Partnership");
					}
					else if(existingInfoJamaicanComValues.equals("Sole Proprietor")) {
						propertiesObject49.put("value", "Sole Proprietor");
					}
					else if(existingInfoJamaicanComValues.equals("Other")) {
						propertiesObject49.put("value", "Other");
					}
					else if(existingInfoJamaicanComValues.equals("")) {
						propertiesObject49.put("value", "");
					}
					jsonArray.put(propertiesObject49);
				}
				
				
				if (sezDevGeneralBusinessIfo.getArticleOfIncorporation().equals("Other")){
					propertiesObject48.put("key", "JSEZA_FormOfTheArticlesOfIncorporationOther");
					propertiesObject48.put("value", sezDevGeneralBusinessIfo.getPleaseSpecify());
					jsonArray.put(propertiesObject48);
				}

		} catch (Exception e) {
		}
		SezDevProposedProject devProposedProject = null;
		try {
			devProposedProject = SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);

			propertiesObject27.put("key", "JSEZA_SeaPort");
			propertiesObject27.put("value", devProposedProject.getSeaPortKm());
			jsonArray.put(propertiesObject27);
			propertiesObject28.put("key", "JSEZA_Airport");
			propertiesObject28.put("value", devProposedProject.getAirportKm());
			jsonArray.put(propertiesObject28);
			propertiesObject50.put("key", "JSEZA_Road");
			propertiesObject50.put("value", devProposedProject.getRoadKm());
			jsonArray.put(propertiesObject50);
			propertiesObject29.put("key", "JSEZA_Rail");
			propertiesObject29.put("value", devProposedProject.getRailKm());
			jsonArray.put(propertiesObject29);
			propertiesObject30.put("key", "JSEZA_Volume");
			propertiesObject30.put("value", devProposedProject.getRailKm());
			// jsonArray.put(propertiesObject30);
			propertiesObject31.put("key", "JSEZA_CustomsProcessingArea");
			propertiesObject31.put("value", devProposedProject.getCustomProcessingKm());
			jsonArray.put(propertiesObject31);
		} catch (Exception e) {
		}
		SezDevPropDevelopmentPlan developmentPlan = null;
		try {
			developmentPlan = SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);

			propertiesObject32.put("key", "JSEZA_Volume");
			propertiesObject32.put("value", developmentPlan.getVolume());
			jsonArray.put(propertiesObject32);
			propertiesObject33.put("key", "JSEZA_Folio");
			propertiesObject33.put("value", developmentPlan.getFolio());
			jsonArray.put(propertiesObject33);
			propertiesObject34.put("key", "JSEZA_Address");
			propertiesObject34.put("value", developmentPlan.getBuildingNum());
			jsonArray.put(propertiesObject34);
			propertiesObject35.put("key", "JSEZA_TownCity");
			propertiesObject35.put("value", developmentPlan.getTownCity());
			jsonArray.put(propertiesObject35);
//			propertiesObject36.put("key", "JSEZA_Parish");
//			propertiesObject36.put("value", developmentPlan.getZipCode());
//			jsonArray.put(propertiesObject36);
			propertiesObject36.put("key", "JSEZA_Parish");
			if (developmentPlan.getZipCode().equals("Kingston")) {
				propertiesObject36.put("value", "Kingston");
			} else if (developmentPlan.getZipCode().equals("St. Andrew")) {
				propertiesObject36.put("value", "St. Andrew");
			} else if (developmentPlan.getZipCode().equals("Manchester")) {
				propertiesObject36.put("value", "Manchester");
			}  else if (developmentPlan.getZipCode().equals("Portland")) {
				propertiesObject36.put("value", "Portland");
			} else if (developmentPlan.getZipCode().equals("St. Catherine")) {
				propertiesObject36.put("value", "St. Catherine");
			} else if (developmentPlan.getZipCode().equals("St. Thomas")) {
				propertiesObject36.put("value", "St. Thomas");
			} else if (developmentPlan.getZipCode().equals("St. Mary")) {
				propertiesObject36.put("value", "St. Mary");
			} else if (developmentPlan.getZipCode().equals("Portland")) {
				propertiesObject36.put("value", "Portland");
			} else if (developmentPlan.getZipCode().equals("St. Ann")) {
				propertiesObject36.put("value", "St. Ann");
			} else if (developmentPlan.getZipCode().equals("Trelawny")) {
				propertiesObject36.put("value", "Trelawny");
			} else if (developmentPlan.getZipCode().equals("St. James")) {
				propertiesObject36.put("value", "St. James");
			} else if (developmentPlan.getZipCode().equals("Hanover")) {
				propertiesObject36.put("value", "Hanover");
			} else if (developmentPlan.getZipCode().equals("Westmoreland")) {
				propertiesObject36.put("value", "Westmoreland");
			} else if (developmentPlan.getZipCode().equals("St. Elizabeth")) {
				propertiesObject36.put("value", "St. Elizabeth");
			} else if (developmentPlan.getZipCode().equals("Clarendon")) {
				propertiesObject36.put("value", "Clarendon");
			}else if (developmentPlan.getZipCode().equals("")) {
				propertiesObject36.put("value", "");
			}
			jsonArray.put(propertiesObject36);
			propertiesObject37.put("key", "JSEZA_North");
			propertiesObject37.put("value", developmentPlan.getNorthBoundaries());
			jsonArray.put(propertiesObject37);
			propertiesObject38.put("key", "JSEZA_East");
			propertiesObject38.put("value", developmentPlan.getEastBoundaries());
			jsonArray.put(propertiesObject38);
			propertiesObject39.put("key", "JSEZA_West");
			propertiesObject39.put("value", developmentPlan.getWestBoundaries());
			jsonArray.put(propertiesObject39);
			propertiesObject40.put("key", "JSEZA_South");
			propertiesObject40.put("value", developmentPlan.getSouthBoundaries());
			jsonArray.put(propertiesObject40);
		} catch (Exception e) {
		}
		SezDevInvestmentAndFinancial sezDevFinancial = null;
		try {
			sezDevFinancial = SezDevInvestmentAndFinancialLocalServiceUtil.getSezById(sezStatusApplicationId);

			propertiesObject41.put("key", "JSEZA_CompanyName");
			propertiesObject41.put("value", sezDevFinancial.getCompanyName());
			jsonArray.put(propertiesObject41);
		} catch (Exception e) {
		}
	}
	public void launchCaseForSezOccupant(long sezApplicationId,JSONArray jsonArray) {
		JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject11= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject12 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject13= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject14= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject15= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject16= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject17= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject18= new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject54 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject55 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject56 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject57= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject58 = new JSONFactoryUtil().createJSONObject();
		 SezOccupantGeneralBussinessInfo bussinessInfo=null;
		 SezDeveloperDetails data=null;
		 SezOccupantGeneralBussinessAddress addressOfCompany=null;
		  try {
				addressOfCompany=SezOccupantGeneralBussinessAddressLocalServiceUtil.
						getSezStatusBy_AT_SAI(sezApplicationId, "Address of Applicant Firm/Company");
				propertiesObject3.put("key", "JSEZA_CompanyName");
	    		propertiesObject3.put("value", addressOfCompany.getOccName());
	    		jsonArray.put(propertiesObject3);
	    		
	    		propertiesObject4.put("key", "JSEZA_TownCity");
	    		propertiesObject4.put("value", addressOfCompany.getOccTown());
	    		jsonArray.put(propertiesObject4);
	    		
//	    		propertiesObject5.put("key", "JSEZA_Parish");
//	    		propertiesObject5.put("value", addressOfCompany.getOccParish());
//	    		jsonArray.put(propertiesObject5);
	    		propertiesObject5.put("key", "JSEZA_Parish");
				if (addressOfCompany.getOccParish().equals("Kingston")) {
					propertiesObject5.put("value", "Kingston");
				} else if (addressOfCompany.getOccParish().equals("St. Andrew")) {
					propertiesObject5.put("value", "St. Andrew");
				} else if (addressOfCompany.getOccParish().equals("Manchester")) {
					propertiesObject5.put("value", "Manchester");
				}  else if (addressOfCompany.getOccParish().equals("Portland")) {
					propertiesObject5.put("value", "Portland");
				} else if (addressOfCompany.getOccParish().equals("St. Catherine")) {
					propertiesObject5.put("value", "St. Catherine");
				} else if (addressOfCompany.getOccParish().equals("St. Thomas")) {
					propertiesObject5.put("value", "St. Thomas");
				} else if (addressOfCompany.getOccParish().equals("St. Mary")) {
					propertiesObject5.put("value", "St. Mary");
				} else if (addressOfCompany.getOccParish().equals("Portland")) {
					propertiesObject5.put("value", "Portland");
				} else if (addressOfCompany.getOccParish().equals("St. Ann")) {
					propertiesObject5.put("value", "St. Ann");
				} else if (addressOfCompany.getOccParish().equals("Trelawny")) {
					propertiesObject5.put("value", "Trelawny");
				} else if (addressOfCompany.getOccParish().equals("St. James")) {
					propertiesObject5.put("value", "St. James");
				} else if (addressOfCompany.getOccParish().equals("Hanover")) {
					propertiesObject5.put("value", "Hanover");
				} else if (addressOfCompany.getOccParish().equals("Westmoreland")) {
					propertiesObject5.put("value", "Westmoreland");
				} else if (addressOfCompany.getOccParish().equals("St. Elizabeth")) {
					propertiesObject5.put("value", "St. Elizabeth");
				} else if (addressOfCompany.getOccParish().equals("Clarendon")) {
					propertiesObject5.put("value", "Clarendon");
				}else if (addressOfCompany.getOccParish().equals("")) {
					propertiesObject5.put("value", "");
				}
				jsonArray.put(propertiesObject5);
			} catch (NoSuchSezOccupantGeneralBussinessAddressException e) {
			}
		 try {
			data=SezDeveloperDetailsLocalServiceUtil.getDeveloperDetailsBy_Id(sezApplicationId);
			propertiesObject2.put("key", "JSEZA_SEZControlNumber");
    		propertiesObject2.put("value", data.getDeveloperControl());
    		jsonArray.put(propertiesObject2);
		} catch (Exception e) {
		}
		 
	        try {
	        	bussinessInfo=	SezOccupantGeneralBussinessInfoLocalServiceUtil.getSezStatusBy_Id(sezApplicationId);
	        	propertiesObject12.put("key", "JSEZA_Question2");
	    		propertiesObject12.put("value", bussinessInfo.getOccExistingCom());
	    		jsonArray.put(propertiesObject12);

	    		propertiesObject13.put("key", "JSEZA_TaxpayerRegistrationNumber");
	    		propertiesObject13.put("value", bussinessInfo.getOccTRN());
	    		jsonArray.put(propertiesObject13);

	    		propertiesObject14.put("key", "JSEZA_GeneralConsumptionTaxNumber");
	    		propertiesObject14.put("value", bussinessInfo.getOccGCT());
	    		jsonArray.put(propertiesObject14);
	    		
	    		propertiesObject15.put("key", "JSEZA_TaxComplianceCertificateNumber");
	    		propertiesObject15.put("value", bussinessInfo.getOccTCC());
	    		jsonArray.put(propertiesObject15);
	        	try {
	    		propertiesObject1.put("key", "JSEZA_DateofApplicationReceived");
	    		propertiesObject1.put("value", bpmDateFormat.format(bussinessInfo.getOccAppDate()));
	    		jsonArray.put(propertiesObject1);}catch (Exception e) {}
	        	
	        	
	        	if(bussinessInfo!=null&&bussinessInfo.getOccExistingCom().equals("Yes")) {
	        		propertiesObject57.put("key", "JSEZA_FormOfTheArticlesOfIncorporation");
	        	String string=bussinessInfo.getOccFormArticle();
					if(string.equals("A company limited by shares")) {
						propertiesObject57.put("value", "A Company Limited By Shares");
					}
					else if(string.equals("A company limited by guarantee and not having a share capital")) {
						propertiesObject57.put("value", "A Company Limited By Guarantee And Not Having A Share Capital");
					}
					else if(string.equals("An unlimited company having a share capital")) {
						propertiesObject57.put("value", "An Unlimited Company Having A Share Capital");
					}
					else if(string.equals("Partnership")) {
						propertiesObject57.put("value", "Partnership");
					}
					else if(string.equals("Sole Proprietor")) {
						propertiesObject57.put("value", "Sole Proprietor");
					}
					else if(string.equals("Other")) {
						propertiesObject57.put("value", "Other");
					}
					else if(string.equals("")) {
						propertiesObject57.put("value", "");
					}
					jsonArray.put(propertiesObject57);
				}
	    		
	    		if(bussinessInfo.getOccFormArticle().equals("Other")) {
	    			propertiesObject58.put("key", "JSEZA_FormOfTheArticlesOfIncorporationOther");
		    		propertiesObject58.put("value", bussinessInfo.getOccFormArticleOther());
		    		jsonArray.put(propertiesObject58);	
	    		}
	    		
	    		 SezOccupantGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice=null;
	 	         SezOccupantGeneralBussinessAddress addressOfAuthorisedRepresentative=null;
	 	       try {
		        	addressOfAuthorisedRepresentative=SezOccupantGeneralBussinessAddressLocalServiceUtil.
							getSezStatusBy_AT_SAI(sezApplicationId, "Address of Authorised Representative");
		        	propertiesObject6.put("key", "JSEZA_Address");
		    		propertiesObject6.put("value", addressOfAuthorisedRepresentative.getOccStreetAddress());
		    		jsonArray.put(propertiesObject6);
		    		
		    		propertiesObject7.put("key", "JSEZA_TownCity");
		    		propertiesObject7.put("value", addressOfAuthorisedRepresentative.getOccTown());
		    		jsonArray.put(propertiesObject7);
		    		
//		    		propertiesObject50.put("key", "JSEZA_Parish");
//		    		propertiesObject50.put("value", addressOfAuthorisedRepresentative.getOccParish());
//		    		jsonArray.put(propertiesObject50);
		    		propertiesObject50.put("key", "JSEZA_Parish");
					if (addressOfAuthorisedRepresentative.getOccParish().equals("Kingston")) {
						propertiesObject50.put("value", "Kingston");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Andrew")) {
						propertiesObject50.put("value", "St. Andrew");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Manchester")) {
						propertiesObject50.put("value", "Manchester");
					}  else if (addressOfAuthorisedRepresentative.getOccParish().equals("Portland")) {
						propertiesObject50.put("value", "Portland");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Catherine")) {
						propertiesObject50.put("value", "St. Catherine");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Thomas")) {
						propertiesObject50.put("value", "St. Thomas");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Mary")) {
						propertiesObject50.put("value", "St. Mary");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Portland")) {
						propertiesObject50.put("value", "Portland");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Ann")) {
						propertiesObject50.put("value", "St. Ann");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Trelawny")) {
						propertiesObject50.put("value", "Trelawny");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. James")) {
						propertiesObject50.put("value", "St. James");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Hanover")) {
						propertiesObject50.put("value", "Hanover");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Westmoreland")) {
						propertiesObject50.put("value", "Westmoreland");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("St. Elizabeth")) {
						propertiesObject50.put("value", "St. Elizabeth");
					} else if (addressOfAuthorisedRepresentative.getOccParish().equals("Clarendon")) {
						propertiesObject50.put("value", "Clarendon");
					}else if (addressOfAuthorisedRepresentative.getOccParish().equals("")) {
						propertiesObject50.put("value", "");
					}
					jsonArray.put(propertiesObject50);
		    		
		    		propertiesObject51.put("key", "JSEZA_Country");
		    		propertiesObject51.put("value", addressOfAuthorisedRepresentative.getOccCountry());
		    		jsonArray.put(propertiesObject51);
		    		
				} catch (Exception e) {
				}
	    		
	    		  try {
	  	        	adddressSponsorOrRegisteredHeadOffice=SezOccupantGeneralBussinessAddressLocalServiceUtil.
	  						getSezStatusBy_AT_SAI(sezApplicationId, "Address of Sponsor/Registered Head Office");
	  	        	 propertiesObject8.put("key", "JSEZA_CompanyName");
			    		propertiesObject8.put("value", adddressSponsorOrRegisteredHeadOffice.getOccName());
			    		jsonArray.put(propertiesObject8);
			    		
			    		propertiesObject9.put("key", "JSEZA_Address");
			    		propertiesObject9.put("value", adddressSponsorOrRegisteredHeadOffice.getOccStreetAddress());
			    		jsonArray.put(propertiesObject9);
			    		
//			    		propertiesObject10.put("key", "JSEZA_Parish");
//			    		propertiesObject10.put("value", adddressSponsorOrRegisteredHeadOffice.getOccParish());
//			    		jsonArray.put(propertiesObject10);
			    		
			    		propertiesObject10.put("key", "JSEZA_Parish");
						if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Kingston")) {
							propertiesObject10.put("value", "Kingston");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Andrew")) {
							propertiesObject10.put("value", "St. Andrew");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Manchester")) {
							propertiesObject10.put("value", "Manchester");
						}  else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Portland")) {
							propertiesObject10.put("value", "Portland");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Catherine")) {
							propertiesObject10.put("value", "St. Catherine");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Thomas")) {
							propertiesObject10.put("value", "St. Thomas");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Mary")) {
							propertiesObject10.put("value", "St. Mary");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Portland")) {
							propertiesObject10.put("value", "Portland");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Ann")) {
							propertiesObject10.put("value", "St. Ann");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Trelawny")) {
							propertiesObject10.put("value", "Trelawny");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. James")) {
							propertiesObject10.put("value", "St. James");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Hanover")) {
							propertiesObject10.put("value", "Hanover");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Westmoreland")) {
							propertiesObject10.put("value", "Westmoreland");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("St. Elizabeth")) {
							propertiesObject10.put("value", "St. Elizabeth");
						} else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("Clarendon")) {
							propertiesObject10.put("value", "Clarendon");
						}else if (adddressSponsorOrRegisteredHeadOffice.getOccParish().equals("")) {
							propertiesObject10.put("value", "");
						}
						jsonArray.put(propertiesObject10);
			    		
			    		propertiesObject11.put("key", "JSEZA_Country");
			    		propertiesObject11.put("value", adddressSponsorOrRegisteredHeadOffice.getOccCountry());
			    		jsonArray.put(propertiesObject11);
	  			} catch (Exception e) {
	  			}
	    		 
		    		
		    	
		    		
		    		SezOccupantExistingProposedProjectBriefInfo briefInfo=null;
		    		try {
		    			briefInfo=	SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezApplicationId);
					
		    		propertiesObject16.put("key", "JSEZA_North");
		    		propertiesObject16.put("value", briefInfo.getOccNorthBoundaries());
		    		jsonArray.put(propertiesObject16);
		    		
		    		propertiesObject17.put("key", "JSEZA_East");
		    		propertiesObject17.put("value", briefInfo.getOccEastBoundaries());
		    		jsonArray.put(propertiesObject17);
		    		propertiesObject18.put("key", "JSEZA_West");
		    		propertiesObject18.put("value", briefInfo.getOccWestBoundaries());
		    		jsonArray.put(propertiesObject18);
		    		propertiesObject19.put("key", "JSEZA_South");
		    		propertiesObject19.put("value", briefInfo.getOccSouthBoundaries());
		    		jsonArray.put(propertiesObject19);
		    		
		    		propertiesObject20.put("key", "JSEZA_OwnershipRightofUse");
		    		propertiesObject20.put("value", briefInfo.getOccOwnership());
		    		jsonArray.put(propertiesObject20);
		    		
		    		propertiesObject21.put("key", "JSEZA_LeaseYears");
		    		propertiesObject21.put("value", briefInfo.getOccLeaseYears());
		    		jsonArray.put(propertiesObject21);
		    		
		    		propertiesObject22.put("key", "JSEZA_Folio");
		    		propertiesObject22.put("value", briefInfo.getOccFolio());
		    		jsonArray.put(propertiesObject22);
		    		propertiesObject23.put("key", "JSEZA_SEZDevelopersCodeLocation");
		    		propertiesObject23.put("value", briefInfo.getOccSezDevLoc());
		    		jsonArray.put(propertiesObject23);
		    		propertiesObject24.put("key", "JSEZA_DescriptionTypeofActivity");
		    		propertiesObject24.put("value", briefInfo.getOccSezDevLocDesc());
		    		jsonArray.put(propertiesObject24);
		    		
		    		propertiesObject25.put("key", "JSEZA_Address");
		    		propertiesObject25.put("value", briefInfo.getOccSubConcessionBuilding());
		    		jsonArray.put(propertiesObject25);
		    		propertiesObject26.put("key", "JSEZA_TownCity");
		    		propertiesObject26.put("value", briefInfo.getOccSubConcessionBuilding());
		    		jsonArray.put(propertiesObject26);
		    		} catch (Exception e) {
					}
		    		
	    		SezOccupanteDeveloperUndertakingInfo developerUndertakingInfo=null;
	    		try {
	    			developerUndertakingInfo=SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezApplicationId);
				
	    		propertiesObject50.put("key", "JSEZA_SEZControlNumber");
	    		propertiesObject50.put("value", developerUndertakingInfo.getOccUndertakingControlNum());
	    		jsonArray.put(propertiesObject50);
	    		} catch (Exception e) {
				}
	        }catch (Exception e) {
			}
	}
	public void launchCaseForZoneUser(long sezStatusApplicationId,JSONArray jsonArray) {
		JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject11= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject12 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject13= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject14= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject15= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject16= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject17= new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject18= new JSONFactoryUtil().createJSONObject();
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
		JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject50 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject51 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject52 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject53 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject54 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject55 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject60 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject61 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject62 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject63 = new JSONFactoryUtil().createJSONObject();
		JSONObject propertiesObject64 = new JSONFactoryUtil().createJSONObject();
		SezZoneGeneralBusinessInfo businessInfo=null;
		SezZoneGeneralBussinessAddress addressOfCompany = null;
		SezZoneGeneralBussinessAddress addressOfAuthorisedRepresentative = null;
		SezZoneGeneralBussinessAddress adddressSponsorOrRegisteredHeadOffice = null;
		try {
			addressOfCompany = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Applicant Firm/Company");
			propertiesObject3.put("key", "JSEZA_CompanyName");
			propertiesObject3.put("value", addressOfCompany.getZoneName());
			jsonArray.put(propertiesObject3);
			
			propertiesObject4.put("key", "JSEZA_TownCity");
			propertiesObject4.put("value", addressOfCompany.getZoneTown());
			jsonArray.put(propertiesObject4);
			
			propertiesObject5.put("key", "JSEZA_SEZ Status");
			propertiesObject5.put("value", addressOfCompany.getZoneParish());
			jsonArray.put(propertiesObject5);
//			propertiesObject36.put("key", "JSEZA_Parish");
//			propertiesObject36.put("value", addressOfCompany.getZoneParish());
//			jsonArray.put(propertiesObject36);
			propertiesObject36.put("key", "JSEZA_Parish");
			if (addressOfCompany.getZoneParish().equals("Kingston")) {
				propertiesObject36.put("value", "Kingston");
			} else if (addressOfCompany.getZoneParish().equals("St. Andrew")) {
				propertiesObject36.put("value", "St. Andrew");
			} else if (addressOfCompany.getZoneParish().equals("Manchester")) {
				propertiesObject36.put("value", "Manchester");
			}  else if (addressOfCompany.getZoneParish().equals("Portland")) {
				propertiesObject36.put("value", "Portland");
			} else if (addressOfCompany.getZoneParish().equals("St. Catherine")) {
				propertiesObject36.put("value", "St. Catherine");
			} else if (addressOfCompany.getZoneParish().equals("St. Thomas")) {
				propertiesObject36.put("value", "St. Thomas");
			} else if (addressOfCompany.getZoneParish().equals("St. Mary")) {
				propertiesObject36.put("value", "St. Mary");
			} else if (addressOfCompany.getZoneParish().equals("Portland")) {
				propertiesObject36.put("value", "Portland");
			} else if (addressOfCompany.getZoneParish().equals("St. Ann")) {
				propertiesObject36.put("value", "St. Ann");
			} else if (addressOfCompany.getZoneParish().equals("Trelawny")) {
				propertiesObject36.put("value", "Trelawny");
			} else if (addressOfCompany.getZoneParish().equals("St. James")) {
				propertiesObject36.put("value", "St. James");
			} else if (addressOfCompany.getZoneParish().equals("Hanover")) {
				propertiesObject36.put("value", "Hanover");
			} else if (addressOfCompany.getZoneParish().equals("Westmoreland")) {
				propertiesObject36.put("value", "Westmoreland");
			} else if (addressOfCompany.getZoneParish().equals("St. Elizabeth")) {
				propertiesObject36.put("value", "St. Elizabeth");
			} else if (addressOfCompany.getZoneParish().equals("Clarendon")) {
				propertiesObject36.put("value", "Clarendon");
			}else if (addressOfCompany.getZoneParish().equals("")) {
				propertiesObject36.put("value", "");
			}
			jsonArray.put(propertiesObject36);
			
		} catch (Exception e) {
		}
		try {
			addressOfAuthorisedRepresentative = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Authorised Representative");
			propertiesObject7.put("key", "JSEZA_Address");
			propertiesObject7.put("value", addressOfAuthorisedRepresentative.getZoneName());
			jsonArray.put(propertiesObject7);
			
			propertiesObject8.put("key", "JSEZA_TownCity");
			propertiesObject8.put("value", addressOfAuthorisedRepresentative.getZoneTown());
			jsonArray.put(propertiesObject8);
			
//			propertiesObject9.put("key", "JSEZA_Parish");
//			propertiesObject9.put("value", addressOfAuthorisedRepresentative.getZoneParish());
//			jsonArray.put(propertiesObject9);
			
			if (addressOfAuthorisedRepresentative.getZoneParish().equals("Kingston")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Kingston");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Andrew")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Andrew");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Manchester")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Manchester");
			}  else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Portland")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Portland");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Catherine")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Catherine");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Thomas")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Thomas");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Mary")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Mary");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Portland")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Portland");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Ann")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Ann");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Trelawny")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Trelawny");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. James")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. James");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Hanover")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Hanover");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Westmoreland")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Westmoreland");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("St. Elizabeth")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "St. Elizabeth");
			} else if (addressOfAuthorisedRepresentative.getZoneParish().equals("Clarendon")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "Clarendon");
			}else if (addressOfAuthorisedRepresentative.getZoneParish().equals("")) {
				propertiesObject9.put("key", "JSEZA_Parish");
				propertiesObject9.put("value", "");
			}
			jsonArray.put(propertiesObject9);
			
			propertiesObject10.put("key", "JSEZA_Country");
			propertiesObject10.put("value", addressOfAuthorisedRepresentative.getZoneCountry());
			jsonArray.put(propertiesObject10);
			
		} catch (Exception e) {
		}
		try {
			try {
			adddressSponsorOrRegisteredHeadOffice = SezZoneGeneralBussinessAddressLocalServiceUtil
					.getSezStatusBy_AT_SAI(sezStatusApplicationId, "Address of Sponsor/Registered Head Office");
			}catch (Exception e) {
				// TODO: handle exception
			}
			
//			propertiesObject64.put("key", "JSEZA_SEZDevelopersCodeLocation");
//			propertiesObject64.put("value", adddressSponsorOrRegisteredHeadOffice.getZoneParish());
//			jsonArray.put(propertiesObject64);
			
			
			propertiesObject38.put("key", "JSEZA_Address");
			propertiesObject38.put("value", adddressSponsorOrRegisteredHeadOffice.getZoneStreetAddress());
			jsonArray.put(propertiesObject38);
			
			propertiesObject11.put("key", "JSEZA_CompanyName");
			propertiesObject11.put("value", adddressSponsorOrRegisteredHeadOffice.getZoneName());
			jsonArray.put(propertiesObject11);
			propertiesObject39.put("key", "JSEZA_TownCity");
			propertiesObject39.put("value", adddressSponsorOrRegisteredHeadOffice.getZoneTown());
			jsonArray.put(propertiesObject39);
			
			propertiesObject50.put("key", "JSEZA_Country");
			propertiesObject50.put("value", adddressSponsorOrRegisteredHeadOffice.getZoneCountry());
			jsonArray.put(propertiesObject50);
			
			
		} catch (Exception e) {
		}
		try {
			businessInfo=SezZoneGeneralBusinessInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		
		propertiesObject2.put("key", "JSEZA_SEZControlNumber");
		propertiesObject2.put("value", businessInfo.getControlNum());
		jsonArray.put(propertiesObject2);
		propertiesObject12.put("key", "JSEZA_Question2");
		propertiesObject12.put("value", businessInfo.getExistingCompany());
		jsonArray.put(propertiesObject12);
		
			if (businessInfo != null && businessInfo.getExistingCompany().equals("Yes")) {
				propertiesObject60.put("key", "JSEZA_FormOfTheArticlesOfIncorporation");
				JSONArray array = new JSONFactoryUtil().createJSONArray();
				String existingCompany = businessInfo.getArticleForm();
					if (existingCompany.equals("A company limited by shares")) {
						propertiesObject60.put("value", "A Company Limited By Shares");
					} else if (existingCompany.equals("A company limited by guarantee and not having a share capital")) {
						propertiesObject60.put("value", "A Company Limited By Guarantee And Not Having A Share Capital");
					} else if (existingCompany.equals("An unlimited company having a share capital")) {
						propertiesObject60.put("value", "An Unlimited Company Having A Share Capital");
					} else if (existingCompany.equals("Partnership")) {
						propertiesObject60.put("value", "Partnership");
					} else if (existingCompany.equals("Sole Proprietor")) {
						array.put("Sole Proprietor");
						propertiesObject60.put("value", "Sole Proprietorl");
					} else if (existingCompany.equals("Other")) {
						propertiesObject60.put("value", "Other");
					} else if (existingCompany.equals("")) {
						propertiesObject60.put("value", "");
					}
				jsonArray.put(propertiesObject60);
			}
				
				
				if (businessInfo.getArticleForm().equals("Other")) {
					propertiesObject61.put("key", "JSEZA_FormOfTheArticlesOfIncorporationOther");
					propertiesObject61.put("value", businessInfo.getOtherArticleForm());
					jsonArray.put(propertiesObject61);
				}
			
		propertiesObject13.put("key", "JSEZA_Question3");
		propertiesObject13.put("value", businessInfo.getNonResidentCom());
		jsonArray.put(propertiesObject13);
		propertiesObject62.put("key", "JSEZA_TaxpayerRegistrationNumber");
		propertiesObject62.put("value", businessInfo.getTaxRegisNum());
		jsonArray.put(propertiesObject62);

		propertiesObject14.put("key", "JSEZA_GeneralConsumptionTaxNumber");
		propertiesObject14.put("value", businessInfo.getGenConsumptionNum());
		jsonArray.put(propertiesObject14);
		
		propertiesObject15.put("key", "JSEZA_TaxComplianceCertificateNumber");
		propertiesObject15.put("value", businessInfo.getTaxComplianceCertificateNum());
		jsonArray.put(propertiesObject15);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		SezZoneProposedProjectInfo info=null;
		try {
			info=SezZoneProposedProjectInfoLocalServiceUtil.getSezStatusById(sezStatusApplicationId);
		
		propertiesObject16.put("key", "JSEZA_Address");
		propertiesObject16.put("value", info.getLeasedBuildingNum());
		jsonArray.put(propertiesObject16);
		
		propertiesObject18.put("key", "JSEZA_TownCity");
		propertiesObject18.put("value", info.getLeasedTown());
		jsonArray.put(propertiesObject18);
		
//		propertiesObject19.put("key", "JSEZA_Parish");
//		propertiesObject19.put("value", info.getLeasedParish());
//		jsonArray.put(propertiesObject19);
		
		if (info.getLeasedParish().equals("Kingston")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Kingston");
		} else if (info.getLeasedParish().equals("St. Andrew")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Andrew");
		} else if (info.getLeasedParish().equals("Manchester")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Manchester");
		}  else if (info.getLeasedParish().equals("Portland")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Portland");
		} else if (info.getLeasedParish().equals("St. Catherine")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Catherine");
		} else if (info.getLeasedParish().equals("St. Thomas")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Thomas");
		} else if (info.getLeasedParish().equals("St. Mary")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Mary");
		} else if (info.getLeasedParish().equals("Portland")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Portland");
		} else if (info.getLeasedParish().equals("St. Ann")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Ann");
		} else if (info.getLeasedParish().equals("Trelawny")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Trelawny");
		} else if (info.getLeasedParish().equals("St. James")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. James");
		} else if (info.getLeasedParish().equals("Hanover")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Hanover");
		} else if (info.getLeasedParish().equals("Westmoreland")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Westmoreland");
		} else if (info.getLeasedParish().equals("St. Elizabeth")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "St. Elizabeth");
		} else if (info.getLeasedParish().equals("Clarendon")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "Clarendon");
		}else if (info.getLeasedParish().equals("")) {
			propertiesObject19.put("key", "JSEZA_Parish");
			propertiesObject19.put("value", "");
		}
		jsonArray.put(propertiesObject19);
		propertiesObject20.put("key", "JSEZA_LeaseYears");
		propertiesObject20.put("value", info.getLeaseYears());
		jsonArray.put(propertiesObject20);
		propertiesObject21.put("key", "JSEZA_Folio");
		propertiesObject21.put("value", info.getFolio());
		jsonArray.put(propertiesObject21);
		} catch (Exception e) {
			// TODO: handle exception
		}
		SezZoneDevUnderInfo devUnderInfo=null;
		try {
			devUnderInfo=SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		
		propertiesObject22.put("key", "JSEZA_SEZControlNumber");
		propertiesObject22.put("value", devUnderInfo.getDeveloperControlNum());
		jsonArray.put(propertiesObject22);
		} catch (Exception e) {
		}
	}
	public static void	launchCaseWorkFromHome(long sezApplicationId,JSONArray jsonArray,SezStatusApplication application, String applicantWorkOfHomeStatus){
		JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
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
		SezStatusWorkFromHome workFromHomeInfo=null;
		try {
			workFromHomeInfo= SezStatusWorkFromHomeLocalServiceUtil.getSezById(sezApplicationId);
		}catch (Exception e) {}
			String applicantStatus="";
		if(application!=null&&application.getTypeOfTransactionWFH()!=null){

		if (applicantWorkOfHomeStatus.contains("Occupancy")){
			applicantStatus="Occupancy";
        }
		else if (applicantWorkOfHomeStatus.contains("Developer")){
			applicantStatus="Developer";
		}
		else 	if (applicantWorkOfHomeStatus.contains("Single Entity Developer"))
		{
			applicantStatus="Single Entity Developer";
		}
		}
		propertiesObject1.put("key", "JSEZA_CompanyName");
		propertiesObject1.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getCompanyName())?workFromHomeInfo.getCompanyName() :"");
		jsonArray.put(propertiesObject1);
		propertiesObject2.put("key", "JSEZA_ApplicantStatus");
		propertiesObject2.put("value",Validator.isNotNull(applicantStatus)?applicantStatus:"");
		jsonArray.put(propertiesObject2);
		propertiesObject3.put("key", "JSEZA_CompanyAddress");
		propertiesObject3.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getCompanyName())?workFromHomeInfo.getCompanyName() :"");
		jsonArray.put(propertiesObject3);
		propertiesObject4.put("key", "JSEZA_ContactPersonName");
		propertiesObject4.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getContactPersonName())?workFromHomeInfo.getContactPersonName() :"");
		jsonArray.put(propertiesObject4);
		propertiesObject5.put("key", "JSEZA_ContactPersonEmailAddress");
		propertiesObject5.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getContactPersonEmail())?workFromHomeInfo.getContactPersonEmail() :"");
		jsonArray.put(propertiesObject5);
		propertiesObject6.put("key", "JSEZA_NumberofWorkers");
		propertiesObject6.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getWorkerUtilizingIncentive())?workFromHomeInfo.getWorkerUtilizingIncentive() :"");
		jsonArray.put(propertiesObject6);
		propertiesObject7.put("key", "JSEZA_NumberofMonths");
		propertiesObject7.put("value",Validator.isNotNull(workFromHomeInfo)&&Validator.isNotNull(workFromHomeInfo.getWorkerUtilizingIncentiveMonth())?workFromHomeInfo.getWorkerUtilizingIncentiveMonth() :"");
		jsonArray.put(propertiesObject7);

		List<SezStatusWFMLocationAdd> sezStatusWFMLocationAdd=null;
		try {
			sezStatusWFMLocationAdd=	SezStatusWFMLocationAddLocalServiceUtil.getSezStatusWFMLocationAddListById(sezApplicationId);
		}catch (Exception e){}
		JSONObject sezLocationJsonObj = new JSONFactoryUtil().createJSONObject();
		sezLocationJsonObj.put("key", "JSEZA_LocationDetails");
		JSONObject sezLocationValueJsonObj = new JSONFactoryUtil().createJSONObject();
		JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
			for (SezStatusWFMLocationAdd sezLocationListInfo : sezStatusWFMLocationAdd) {
				JSONObject propertiesObject60 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject61 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject62 = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
				JSONObject additionalListObjectValueJsonObj = new JSONFactoryUtil().createJSONObject();
				propertiesObject60.put("name", "JSEZA_LocationControlNumber");
				propertiesObject60.put("value", sezLocationListInfo.getControlNumber());
				jsonArrayProp.put(propertiesObject60);
				propertiesObject61.put("name", "JSEZA_LocationAddress");
				propertiesObject61.put("value", sezLocationListInfo.getLocation());
				jsonArrayProp.put(propertiesObject61);
				propertiesObject62.put("name", "JSEZA_LocationParish");
				propertiesObject62.put("value", sezLocationListInfo.getParish());
				jsonArrayProp.put(propertiesObject62);
				additionalListObjectValueJsonObj.put("properties", jsonArrayProp);
				jsonArrayObjects.put(additionalListObjectValueJsonObj);
			}
		sezLocationValueJsonObj.put("objects", jsonArrayObjects);
		sezLocationJsonObj.put("value", sezLocationValueJsonObj);
		jsonArray.put(sezLocationJsonObj);
	}
}
