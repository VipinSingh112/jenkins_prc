package com.nbp.medical.facilities.application.form.web.portlet;

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
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;
import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesAppliInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesComDetailLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalServiceUtil;
import com.nbp.medical.facilities.application.form.service.service.MedicalFaciltiesPaymentLocalServiceUtil;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationFormPortletKeys;
import com.nbp.medical.facilities.application.form.web.constants.MedicalFacilitiesApplicationWorkflowConstant;

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
		"javax.portlet.name=" + MedicalFacilitiesApplicationFormPortletKeys.MEDICALFACILITIESAPPLICATIONFORM,
		"mvc.command.name=submit/medical/facilities/application" }, service = MVCResourceCommand.class)
public class SubmitMedicalFacilitiesApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitMedicalFacilitiesApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started of medical Facilities--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String natureOfApplicant = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "natureOfApplicant"));
		String typeOfTransaction = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		String medicalFacilitiesCategory = HtmlUtil
				.escape(ParamUtil.getString(resourceRequest, "medicalFacilitiesCategory"));
		String longTermCareFacilities = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "longTermCareFacilities"));
		String nursingHomeCategoryVal = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "nursingHomeCategoryVal"));
		String medicalFacilitiesSubCategoryTypeVal = ParamUtil.getString(resourceRequest,
				"medicalFacilitiesSubCategoryTypeVal");
		String residentsFacility = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "residentsFacility"));
		String nursingHomesSubCategoryVal = ParamUtil.getString(resourceRequest, "nursingHomesSubCategoryVal");
		long medicalApplicationId = ParamUtil.getLong(resourceRequest, "medicalApplicationId");
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String checkPdfDownloadWithoutDocument = "false";
		MedicalFacilitiesApp application = null;
		if (medicalApplicationId > 0) {
			try {
				application = MedicalFacilitiesAppLocalServiceUtil.getMedicalFacilitiesApp(medicalApplicationId);
			} catch (PortalException e) {
			}
		} else {
			application = MedicalFacilitiesAppLocalServiceUtil.createMedicalFacilitiesApp(
					CounterLocalServiceUtil.increment(MedicalFacilitiesApp.class.getName()));
		}
		application.setNatureOfApplicant(natureOfApplicant);
		application.setTypeOfTransaction(typeOfTransaction);
		application.setMedicalCategory(medicalFacilitiesCategory);
		if (medicalFacilitiesCategory.equals("Long Term Care Facilities")) {
			application.setSubCategory(longTermCareFacilities);
		} else if (medicalFacilitiesCategory.equals("Hospitals")
				|| medicalFacilitiesCategory.equals("Ambulatory Facilities")) {
			application.setSubCategory(medicalFacilitiesSubCategoryTypeVal);
		}
		application.setNumberOfBeds(residentsFacility);
		application.setNursingHomesCategory(nursingHomeCategoryVal);
		application.setNursingSubCategoryVal(nursingHomesSubCategoryVal);
		application.setStatus(MedicalFacilitiesApplicationWorkflowConstant.DRAFT);
		if (Validator.isNull(application.getApplicationNumber())) {
			_log.info("inside if--------------------------------");
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		MedicalFacilitiesAppLocalServiceUtil.updateMedicalFacilitiesApp(application);
		jsonOBJ.put("medicalFacilitiesAppNum", application.getApplicationNumber());
		jsonOBJ.put("appStatus", MedicalFacilitiesApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", application.getMedicalCategory());
		jsonOBJ.put("applicationlicationId", application.getMedicalFacilitiesAppId());
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

			jsonObject.put("solutionType", "ROMF_RegistrationofMedicalFacilities");

			propertiesObject1.put("key", "ROMF_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);

			propertiesObject2.put("key", "ROMF_Transaction");
			propertiesObject2.put("value", application.getApplicationNumber());
			jsonArray.put(propertiesObject2);

			MedicalFaciltiesPayment payment = null;
			try {
				payment = MedicalFaciltiesPaymentLocalServiceUtil.getMedicalAppById(medicalApplicationId);
				propertiesObject24.put("key", "ROMF_PaymentMethod");
				propertiesObject24.put("value", payment.getPaymentMethod());
				jsonArray.put(propertiesObject24);

				if (payment.getPaymentMethod().equals("Other")) {
					propertiesObject25.put("key", "ROMF_OtherPaymentMethod");
					propertiesObject25.put("value", payment.getPaymentMethod());
					jsonArray.put(propertiesObject25);
				}
				if (application.getNumberOfBeds().equals("Less than 25 Beds")) {
					propertiesObject26.put("key", "ROMF_AmountDue");
					propertiesObject26.put("value", "5,000.00");
					jsonArray.put(propertiesObject26);
				} else if (application.getNumberOfBeds().equals("25 or more Beds")) {
					propertiesObject26.put("key", "ROMF_AmountDue");
					propertiesObject26.put("value", "10,000.00");
					jsonArray.put(propertiesObject26);
				}
			} catch (Exception e) {
			}

			propertiesObject3.put("key", "ROMF_NatureofApplicant");
			if (application.getNatureOfApplicant().equals("Individual")) {
				propertiesObject3.put("value", "Individual");
				jsonArray.put(propertiesObject3);
			} else if (application.getNatureOfApplicant().equals("Company/Society/Association")) {
				propertiesObject3.put("value", "Company/Society/Association");
				jsonArray.put(propertiesObject3);
			}

			propertiesObject4.put("key", "ROMF_TypeofTransaction");
			if (application.getTypeOfTransaction().equals("New")) {
				propertiesObject4.put("value", "New");
				jsonArray.put(propertiesObject4);
			} else if (application.getTypeOfTransaction().equals("Renewal")) {
				propertiesObject4.put("value", "Renewal");
				jsonArray.put(propertiesObject4);
			}

			propertiesObject5.put("key", "ROMF_FacilityCategory");
			if (application.getMedicalCategory().equals("Hospitals")) {
				propertiesObject5.put("value", "Hospitals");
				jsonArray.put(propertiesObject5);
			} else if (application.getMedicalCategory().equals("Ambulatory Facilities")) {
				propertiesObject5.put("value", "Ambulatory Facilities");
				jsonArray.put(propertiesObject5);
			} else if (application.getMedicalCategory().equals("Long Term Care Facilities")) {
				propertiesObject5.put("value", "Long Term care Facilities");
				jsonArray.put(propertiesObject5);
			}

			if (application.getMedicalCategory().equals("Long Term Care Facilities")) {
				propertiesObject6.put("key", "ROMF_LongTermcareFacilitiesSubCategories");
				if (application.getSubCategory().equals("Residential Care Facilities")) {
					propertiesObject6.put("value", "Residential Care Facilities");
					jsonArray.put(propertiesObject6);
				} else if (application.getSubCategory().equals("Nursing Homes")) {
					propertiesObject6.put("value", "Nursing Homes");
					jsonArray.put(propertiesObject6);
				}
			}

//				if(application.getMedicalCategory().equals("Ambulatory Facilities")) {
//					propertiesObject7.put("key", "ROMF_LongTermcareFacilitiesSubCategories");
//					if (application.getSubCategory().equals("Maternity")) {
//						propertiesObject7.put("value", "");
//						jsonArray.put(propertiesObject7);
//					} else if(application.getSubCategory().equals("Non-Maternity")) {
//						propertiesObject7.put("value", "");
//						jsonArray.put(propertiesObject7);
//					}else if(application.getSubCategory().equals("Mixed")) {
//						propertiesObject7.put("value", "");
//						jsonArray.put(propertiesObject7);
//					}
//				}

			if (application.getSubCategory().equals("Nursing Homes")) {
				propertiesObject7.put("key", "ROMF_NursingHomesSubcategories");
				String[] categoryOfNursingHome = nursingHomeCategoryVal.split(",");
				JSONArray categoryOfNursingHomes = new JSONFactoryUtil().createJSONArray();
				for (String str : categoryOfNursingHome) {
					if (str.contains("Maternity Homes")) {
						categoryOfNursingHomes.put("Maternity Homes");
					} else if (str.contains("Convalescent Homes")) {
						categoryOfNursingHomes.put("Convalescent Homes");
					} else if (str.contains("Hospices")) {
						categoryOfNursingHomes.put("Hospices");
					} else if (str.contains("Palliative Care Facilities")) {
						categoryOfNursingHomes.put("Palliative Care Facilities");
					} else if (str.contains("Traditional")) {
						categoryOfNursingHomes.put("Traditional");
					} else if (str.contains("")) {
						categoryOfNursingHomes.put("");
					}
				}
				propertiesObject7.put("value", categoryOfNursingHomes);
				jsonArray.put(propertiesObject7); 
				
				propertiesObject8.put("key", "ROMF_HospitalsAmbulatorySubCategories");
				if (application.getNursingSubCategoryVal().equals("Maternity Only")) {
					propertiesObject8.put("value", "Maternity");
					jsonArray.put(propertiesObject8);
				} else if (application.getSubCategory().equals("Mixed")) {
					propertiesObject8.put("value", "Mixed");
					jsonArray.put(propertiesObject8);
				}else if (application.getSubCategory().equals("Non-Maternity")) {
					propertiesObject8.put("value", "Non-Maternity");
					jsonArray.put(propertiesObject8);
				}
			}
			if (application.getMedicalCategory().equals("Hospitals")
					|| application.getMedicalCategory().equals("Ambulatory Facilities")) {
				propertiesObject8.put("key", "ROMF_HospitalsAmbulatorySubCategories");
				if (application.getSubCategory().equals("Maternity")) {
					propertiesObject8.put("value", "Maternity");
					jsonArray.put(propertiesObject8);
				} else if (application.getSubCategory().equals("Non-Maternity")) {
					propertiesObject8.put("value", "Non-Maternity");
					jsonArray.put(propertiesObject8);
				} else if (application.getSubCategory().equals("Mixed")) {
					propertiesObject8.put("value", "Mixed");
					jsonArray.put(propertiesObject8);
				}
			}

			propertiesObject9.put("key", "ROMF_BedCapacity");
			if (application.getNumberOfBeds().equals("Less than 25 Beds")) {
				propertiesObject9.put("value", "Less than 25 Beds");
				jsonArray.put(propertiesObject9);
			} else if (application.getNumberOfBeds().equals("25 or more Beds")) {
				propertiesObject9.put("value", "25 or more Beds");
				jsonArray.put(propertiesObject9);
			}

			List<MedicalFacilitiesAppliInfo> applicantInfoList = null;
			try {
				applicantInfoList = MedicalFacilitiesAppliInfoLocalServiceUtil
						.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
				JSONObject applicantInfoJsonObj = new JSONFactoryUtil().createJSONObject();
				applicantInfoJsonObj.put("key", "ROMF_ApplicantInformation");
				JSONObject applicantInfoValueJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				if (applicantInfoList != null) {
					for (MedicalFacilitiesAppliInfo applicantValues : applicantInfoList) {
						JSONObject propertiesObject35 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject36 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject applicantInfoListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
						propertiesObject35.put("name", "ROMF_FullName");
						propertiesObject35.put("value", applicantValues.getApplicantName());
						jsonArrayProp.put(propertiesObject35);

						propertiesObject36.put("name", "ROMF_TelephoneNumber");
						propertiesObject36.put("value", applicantValues.getAppliTelephoneNumber());
						jsonArrayProp.put(propertiesObject36);

						propertiesObject37.put("name", "ROMF_EmailAddress");
						propertiesObject37.put("value", applicantValues.getAppliEmailAddress());
						jsonArrayProp.put(propertiesObject37);

						propertiesObject38.put("name", "ROMF_PrivateAddress");
						propertiesObject38.put("value", applicantValues.getAppliAddress());
						jsonArrayProp.put(propertiesObject38);

						propertiesObject39.put("name", "ROMF_Nationality");
						propertiesObject39.put("value", applicantValues.getAppliNationality());
						jsonArrayProp.put(propertiesObject39);

						applicantInfoListObjectValueJsonObject.put("properties", jsonArrayProp);
						jsonArrayObjects.put(applicantInfoListObjectValueJsonObject);
					}
					applicantInfoValueJsonObj.put("objects", jsonArrayObjects);
				}
				applicantInfoJsonObj.put("value", applicantInfoValueJsonObj);
				jsonArray.put(applicantInfoJsonObj);
			} catch (Exception e) {
			}

			if (application.getNatureOfApplicant().equals("Company/Society/Association")) {
				List<MedicalFacilitiesComDetail> medicalComDetail = null;
				try {
					medicalComDetail = MedicalFacilitiesComDetailLocalServiceUtil
							.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
					for (MedicalFacilitiesComDetail medicalFacilitiesComDetail : medicalComDetail) {
						if (medicalFacilitiesComDetail.getCounter().equals("1")) {
							JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject42 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject43 = new JSONFactoryUtil().createJSONObject();
							propertiesObject40.put("key", "ROMF_CompanyName");
							propertiesObject40.put("value", medicalFacilitiesComDetail.getFullName());
							jsonArray.put(propertiesObject40);

							propertiesObject41.put("key", "ROMF_FullnameofIndividualResponsible");
							propertiesObject41.put("value", medicalFacilitiesComDetail.getFullName());
							jsonArray.put(propertiesObject41);

							propertiesObject42.put("key", "ROMF_PrivateAddress");
							propertiesObject42.put("value", medicalFacilitiesComDetail.getPrivateAddress());
							jsonArray.put(propertiesObject42);

							propertiesObject43.put("key", "ROMF_RegisteredAddressofCompanySociety");
							propertiesObject43.put("value", medicalFacilitiesComDetail.getRegisteredOffice());
							jsonArray.put(propertiesObject43);
						}

					}
				} catch (Exception e) {
				}
			}
			
			MedicalFacilitiesHomeInfo facilitiesHome=null;
			try {
				facilitiesHome=	MedicalFacilitiesHomeInfoLocalServiceUtil.getMedicalFacilities_ByAppId(medicalApplicationId);
				
				propertiesObject10.put("key", "ROMF_FacilityName");
				propertiesObject10.put("value",facilitiesHome.getNameOfOwner());
				jsonArray.put(propertiesObject10);
				
				propertiesObject11.put("key", "ROMF_FacilityAddress");
				propertiesObject11.put("value",facilitiesHome.getHomeAddress());
				jsonArray.put(propertiesObject11);
				
				propertiesObject12.put("key", "ROMF_FacilityTelephone");
				propertiesObject12.put("value",facilitiesHome.getHomeTelephoneNumber());
				jsonArray.put(propertiesObject12);
				
				propertiesObject13.put("key", "ROMF_FacilityEmailAddress");
				propertiesObject13.put("value",facilitiesHome.getHomeEmailAddress());
				jsonArray.put(propertiesObject13);
			}catch (Exception e) {
			}
			

//			
//			if() {
//			List<MedicalFacilitiesComDetail> medicalComDetail = null;
//			try {
//				medicalComDetail = MedicalFacilitiesComDetailLocalServiceUtil.getMedicalFacilitiesAppliInfoBy_Id(medicalApplicationId);
//				JSONObject companyDetailJsonObj = new JSONFactoryUtil().createJSONObject();
//				companyDetailJsonObj.put("key", "ROMF_CompanyName");
//				JSONObject companyDetailValueJsonObj = new JSONFactoryUtil().createJSONObject();
//				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
//				if (applicantInfoList != null) {
//					for (MedicalFacilitiesComDetail applicantValues : medicalComDetail) {
//						JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
//						JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
//						JSONObject propertiesObject42 = new JSONFactoryUtil().createJSONObject();
//						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
//						JSONObject comDetailListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
//						propertiesObject40.put("name", "ROMF_FullnameofIndividualResponsible");
//						propertiesObject40.put("value", applicantValues.getFullName());
//						jsonArrayProp.put(propertiesObject40);
//
//						propertiesObject41.put("name", "ROMF_PrivateAddressofIndividual");
//						propertiesObject41.put("value", applicantValues.getPrivateAddress());
//						jsonArrayProp.put(propertiesObject41);
//
//						propertiesObject42.put("name", "ROMF_RegisteredAddressofCompanySociety");
//						propertiesObject42.put("value", applicantValues.getRegisteredOffice());
//						jsonArrayProp.put(propertiesObject42);
//						comDetailListObjectValueJsonObject.put("properties", jsonArrayProp);
//						jsonArrayObjects.put(comDetailListObjectValueJsonObject);
//					}
//					companyDetailValueJsonObj.put("objects", jsonArrayObjects);
//				}
//				companyDetailJsonObj.put("value",companyDetailValueJsonObj );
//				jsonArray.put(companyDetailJsonObj);
//			} catch (Exception e) {
//			}
//		}	
			String medicalDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/medical-facilities-dashboard?medicalApplicationId=";
			medicalDashboarUrl = medicalDashboarUrl + String.valueOf(application.getMedicalFacilitiesAppId());
			propertiesObject32.put("key", "ROMF_DashboardURL");
			propertiesObject32.put("value", medicalDashboarUrl);
			jsonArray.put(propertiesObject32);

			jsonObject.put("properties", jsonArray);

			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in Medical Facilities************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in Medical Facilities************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in Medical Facilities************" + isBPMEnabled);
//			String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
//			_log.info("*************Object Store Called in Medical Facilities Status************" + objectStore);
			
			
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"102",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in Medical Facilities Status************" + objectStoreValue);
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
					MedicalFacilitiesApp submiMedicalFacilitiesApplication = MedicalFacilitiesAppLocalServiceUtil
							.getMedicalFacilitiesApp(medicalApplicationId);
					submiMedicalFacilitiesApplication.setCaseId(caseId);
					submiMedicalFacilitiesApplication.setIcmDocumentPath(path);
					submiMedicalFacilitiesApplication.setStatus(MedicalFacilitiesApplicationWorkflowConstant.SUBMITTED);
					MedicalFacilitiesAppLocalServiceUtil.updateMedicalFacilitiesApp(submiMedicalFacilitiesApplication);
					jsonOBJ.put("medicalFacilitiesAppNum", application.getApplicationNumber());
					jsonOBJ.put("appStatus", MedicalFacilitiesApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", application.getMedicalCategory());
					jsonOBJ.put("applicationlicationId", application.getMedicalFacilitiesAppId());
					jsonFeed.put("APP_DATA", jsonOBJ);

					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Medical Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(submiMedicalFacilitiesApplication.getMedicalFacilitiesAppId()));
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
							if (!allSupportingFolder.getName().equals("Medical Application Form PDF")
									&& !allSupportingFolder.getName().equals("Signature of Applicant Employee")) {
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
					try {
						String pdfTemplate = "";
						pdfTemplate = commonsUtil.replaceMedicalFaciltiesPdfVar(
								submiMedicalFacilitiesApplication.getNatureOfApplicant(),
								submiMedicalFacilitiesApplication.getMedicalCategory(),
								submiMedicalFacilitiesApplication.getSubCategory(),
								submiMedicalFacilitiesApplication.getNursingHomesCategory(), medicalApplicationId,
								themeDisplay, checkPdfDownloadWithoutDocument);
						System.out.println("MEDICAL LAUNCH CASE TEMPLATE******" + pdfTemplate);
						if (submiMedicalFacilitiesApplication.getNatureOfApplicant().equals("Individual")) {
							if (submiMedicalFacilitiesApplication.getMedicalCategory().contains("Hospitals")
									|| submiMedicalFacilitiesApplication.getMedicalCategory()
											.contains("Ambulatory Facilities")) {
								if (submiMedicalFacilitiesApplication.getSubCategory().equals("Maternity")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"medical-facilities-maternity", pdfTemplate);
									filez.add(file);

								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Non-Maternity")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"medical-facilities-non-maternity", pdfTemplate);
									filez.add(file);

								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Mixed")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"medical-facilities-mixed", pdfTemplate);
									filez.add(file);

								}
							} else if (submiMedicalFacilitiesApplication.getMedicalCategory()
									.contains("Long Term Care Facilities")) {
								if (submiMedicalFacilitiesApplication.getSubCategory()
										.equals("Residential Care Facilities")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"medical-facilities-residential-care-facilities-1", pdfTemplate);
									filez.add(file);

								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Nursing Homes")) {
									if (submiMedicalFacilitiesApplication.getNursingHomesCategory()
											.equals("Maternity Homes")) {
										if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Maternity Only")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-maternity", pdfTemplate);
											filez.add(file);

										} else if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Mixed")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-mixed", pdfTemplate);
											filez.add(file);

										}
									} else {
										if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Maternity Only")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-maternity", pdfTemplate);
											filez.add(file);
										} else if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Mixed")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-mixed", pdfTemplate);
											filez.add(file);

										}
									}
								}
							}
						} else if (submiMedicalFacilitiesApplication.getNatureOfApplicant()
								.equals("Company/Society/Association")) {
							if (submiMedicalFacilitiesApplication.getMedicalCategory().contains("Hospitals")
									|| submiMedicalFacilitiesApplication.getMedicalCategory()
											.contains("Ambulatory Facilities")) {
								if (submiMedicalFacilitiesApplication.getSubCategory().equals("Maternity")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"medical-facilities-maternity-company-1", pdfTemplate);
									filez.add(file);
								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Non-Maternity")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"company-non-maternity-medical-1", pdfTemplate);
									filez.add(file);
								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Mixed")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"company-mixed-med-facilties-1", pdfTemplate);
									filez.add(file);
								}
							} else if (submiMedicalFacilitiesApplication.getMedicalCategory()
									.contains("Long Term Care Facilities")) {
								if (submiMedicalFacilitiesApplication.getSubCategory()
										.equals("Residential Care Facilities")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
											"residential-care-facilities-company-1", pdfTemplate);
									filez.add(file);
								} else if (submiMedicalFacilitiesApplication.getSubCategory().equals("Nursing Homes")) {
									if (submiMedicalFacilitiesApplication.getNursingHomesCategory()
											.equals("Maternity Homes")) {
										if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Maternity Only")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-maternity-company-1",
													pdfTemplate);
											filez.add(file);
										} else if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Mixed")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "company-mixed-med-facilties-1", pdfTemplate);
											filez.add(file);
										}
									} else {
										if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Maternity Only")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "medical-facilities-maternity-company-1",
													pdfTemplate);
											filez.add(file);
										} else if (submiMedicalFacilitiesApplication.getNursingSubCategoryVal()
												.equals("Mixed")) {
											File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest,
													resourceResponse, "company-mixed-med-facilties-1", pdfTemplate);
											filez.add(file);
										}
									}
								}
							}
						}

					} catch (Exception e) {
						_log.error(e.getMessage());
					}

					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");

					_log.info("path--------------" + path);
					for (File supportingDocs : filez) {
						HttpResponse<String> documentUploadresponse = Unirest
								.post(launchCaseUrl + uploadFilesEndPoint + "?tos="+objectStoreValue).field("path", path+ "/Application Documentation")
								.field("files", supportingDocs).asString();
						_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
					}

					// Sending Email After Form Submission
					try {
						String CategoryTypeUpperCase = submiMedicalFacilitiesApplication.getNatureOfApplicant().toUpperCase();
						String subcategoryUpperCase = submiMedicalFacilitiesApplication.getTypeOfTransaction().toUpperCase();
						String childcategoryUpperCase = submiMedicalFacilitiesApplication.getMedicalCategory().toUpperCase();

						String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
								"successful-application-submission-email-template");
						if (Validator.isNotNull(body)) {
							body = StringUtil.replace(body,
									new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
											"[$Category$]", "[$subCategory$]", "[$childCategory$]", "[$transactionNo$]",
											"[$dashboardURL$]" },

									new String[] { themeDisplay.getUser().getFullName(), "Medical Facilities",
											"entityName", CategoryTypeUpperCase, subcategoryUpperCase,
											childcategoryUpperCase, application.getApplicationNumber(),
											medicalDashboarUrl });
						}
						commonsUtil.sendMailToUsers("Your Application Submitted",
								"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
								body);
						_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());
					} catch (Exception e) {
						_log.error("An Error Has Occured", e);
					}
				} else {
					jsonOBJ.put("medicalFacilitiesAppNum", application.getApplicationNumber());
					jsonOBJ.put("appStatus", MedicalFacilitiesApplicationWorkflowConstant.DRAFT_Label);
					jsonOBJ.put("category", application.getMedicalCategory());
					jsonOBJ.put("applicationlicationId", application.getMedicalFacilitiesAppId());
					jsonFeed.put("APP_DATA", jsonOBJ);
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

		_log.info("submit Medical Facilities application  Ended--------------------------------");

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