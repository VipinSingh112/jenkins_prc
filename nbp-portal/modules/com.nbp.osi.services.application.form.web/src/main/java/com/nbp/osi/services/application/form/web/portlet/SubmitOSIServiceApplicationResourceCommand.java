package com.nbp.osi.services.application.form.web.portlet;

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
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesInsolventPersoninfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;
import com.nbp.osi.services.application.form.service.service.OSIServiceCurrentStageLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicantinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesApplicationLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesInsolventPersoninfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeCompanyinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServiceApplicationWorkflowConstant;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

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

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
			"mvc.command.name=/osi/submit"
		},
		service = MVCResourceCommand.class
	)
public class SubmitOSIServiceApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitOSIServiceApplicationResourceCommand.class.getName());
	public static DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String certificateTypeVal = ParamUtil.getString(resourceRequest, "certificateTypeVal");
		String trusteeLicenceTypeVal = ParamUtil.getString(resourceRequest, "trusteeLicenceTypeVal");
		String trusteeTransactionTypeVal = ParamUtil.getString(resourceRequest, "trusteeTransactionTypeVal");
		String assignmentCertificateTypeVal = ParamUtil.getString(resourceRequest, "assignmentCertificateTypeVal");
		String lastFormDetailsStep = ParamUtil.getString(resourceRequest, "lastFormDetailsStep");
		long osiServiceApplicationId = ParamUtil.getLong(resourceRequest, "osiServiceApplicationId");
		OSIServiceCurrentStage currentStageSubmit = null;
		try {
			currentStageSubmit = OSIServiceCurrentStageLocalServiceUtil.getOsiServiceCS_By_CI(osiServiceApplicationId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (currentStageSubmit == null) {
			currentStageSubmit = OSIServiceCurrentStageLocalServiceUtil
					.createOSIServiceCurrentStage(CounterLocalServiceUtil.increment());
		}
		currentStageSubmit.setCurrentStage("OSI SERVICES FORM PREVIEW");
		currentStageSubmit.setLastFormDetailsStep(lastFormDetailsStep);
		currentStageSubmit.setOsiServicesApplicationId(osiServiceApplicationId);
		OSIServiceCurrentStageLocalServiceUtil.updateOSIServiceCurrentStage(currentStageSubmit);
		OsiServicesApplication osiServicesApplication = null;

		try {
			osiServicesApplication = OsiServicesApplicationLocalServiceUtil
					.getOsiServicesApplication(osiServiceApplicationId);
		} catch (PortalException e1) {
		}
		osiServicesApplication.setDoYouWant(certificateTypeVal);
		osiServicesApplication.setTypeOfApplicant(assignmentCertificateTypeVal);
		osiServicesApplication.setNatureOfApplicant(trusteeLicenceTypeVal);
		osiServicesApplication.setTypeOfTransaction(trusteeTransactionTypeVal);
		osiServicesApplication.setTypeOfTransaction(trusteeTransactionTypeVal);
		osiServicesApplication.setStatus(OSIServiceApplicationWorkflowConstant.DRAFT);
		osiServicesApplication.setOsiServicesApplicationId(osiServiceApplicationId);
		osiServicesApplication.setCreateDate(new Date());
		if (Validator.isNull(osiServicesApplication.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			osiServicesApplication.setApplicationNumber(formatted + "/" + formattedDate);
		}
		OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServicesApplication);
		jsonOBJ.put("osiServiceApplicationId", osiServicesApplication.getOsiServicesApplicationId());
		jsonOBJ.put("status", OSIServiceApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("applicationNumber", osiServicesApplication.getApplicationNumber());
		jsonOBJ.put("categories", osiServicesApplication.getDoYouWant());
		try {
			osiServicesApplication.setCompanyId(themeDisplay.getCompanyId());
			osiServicesApplication.setGroupId(themeDisplay.getScopeGroupId());
			osiServicesApplication.setCreateDate(new Date());
			osiServicesApplication.setUserId(themeDisplay.getUserId());
			osiServicesApplication.setUserName(themeDisplay.getUser().getFullName());
			OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServicesApplication);
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
			JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject41 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject42 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject43 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject44 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject45 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject46 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject50 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject51 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject52 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject53 = new JSONFactoryUtil().createJSONObject();
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			if (osiServicesApplication.getDoYouWant().equals("Certificate of Assignment")) {
				jsonObject.put("solutionType", "OOSOI_OSICertificateofAssignment");
			} else if (osiServicesApplication.getDoYouWant().equals("Trustee Licence")) {
				jsonObject.put("solutionType", "OOSOI_OSITrusteeLicence");
			} else {
				jsonObject.put("solutionType", "OOSOI_OSICertificateofAssignment");
			}
			propertiesObject24.put("key", "OOSOI_Transaction");
			propertiesObject24.put("value",
					osiServicesApplication != null ? osiServicesApplication.getApplicationNumber() : "");
			jsonArray.put(propertiesObject24);

			String osiServiceDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/osi-service-dashboard?osiServicesApplicationId=";
			osiServiceDashboarUrl = osiServiceDashboarUrl
					+ String.valueOf(osiServicesApplication.getOsiServicesApplicationId());

			propertiesObject50.put("key", "OOSOI_DashboardURL");
			propertiesObject50.put("value", osiServiceDashboarUrl);
			jsonArray.put(propertiesObject50);

			if (osiServicesApplication.getDoYouWant().equals("Certificate of Assignment")) {
				propertiesObject52.put("value", "Insolvent Person");
			} else if (osiServicesApplication.getDoYouWant().equals("Trustee Licence")) {
				propertiesObject52.put("value", "Licensed Trustee");
			} else if (osiServicesApplication.getDoYouWant().equals("")) {
				propertiesObject52.put("value", "");
			}
			propertiesObject52.put("key", "OOSOI_TypeofApplicantCertficate");
			jsonArray.put(propertiesObject52);

			OsiServicesApplicantinfo applicantinfo = null;
			OsiServicesTrusteeIndividualDetailinfo detailinfo = null;
			OsiServicesTrusteeCompanyinfo companyinfo = null;

			try {
				applicantinfo = OsiServicesApplicantinfoLocalServiceUtil
						.getOsiServiceApplicantInfoById(osiServiceApplicationId);
			
			// Certificate --- sub category
			if (osiServicesApplication.getTypeOfApplicant().equals("Insolvent Person")
					|| osiServicesApplication.getTypeOfApplicant().equals("Licensed Insolvency Practitioner")) {
				propertiesObject1.put("value", "Insolvent Person");
			} else if (osiServicesApplication.getTypeOfApplicant().equals("Licensed Trustee")) {
				propertiesObject1.put("value", "Licensed Trustee");
			} else if (osiServicesApplication.getTypeOfApplicant().equals("")) {
				propertiesObject1.put("value", "");
			}
			propertiesObject1.put("key", "OOSOI_TypeofApplicant");
			//jsonArray.put(propertiesObject1);

			if (Validator.isNotNull(osiServicesApplication.getNatureOfApplicant())) {
				if (osiServicesApplication.getNatureOfApplicant().equals("Individual")) {
					propertiesObject51.put("value", "Individual/ Natural Person");
				} else if (osiServicesApplication.getNatureOfApplicant().equals("Company")) {
					propertiesObject51.put("value", "Company/Legal Person");
				} else if (osiServicesApplication.getNatureOfApplicant().equals("")) {
					propertiesObject51.put("value", "");
				}
				propertiesObject51.put("key", "OOSOI_TypeofApplicant");
				jsonArray.put(propertiesObject51);
			}

			if (Validator.isNotNull(applicantinfo)) {
				if (applicantinfo.getApplicantNature().equals("Individual")) {
					propertiesObject53.put("value", "Individual/ Natural Person");
				} else if (applicantinfo.getApplicantNature().equals("Company")) {
					propertiesObject53.put("value", "Company/Legal Person");
				} else if (applicantinfo.getApplicantNature().equals("")) {
					propertiesObject53.put("value", "");
				}
				propertiesObject53.put("key", "OOSOI_TypeofApplicant");
				jsonArray.put(propertiesObject53);
				propertiesObject2.put("key", "OOSOI_FirstName");
				propertiesObject2.put("value", applicantinfo != null ? applicantinfo.getIndiFirstName() : "");
				jsonArray.put(propertiesObject2);
				propertiesObject3.put("key", "OOSOI_LastName");
				propertiesObject3.put("value", applicantinfo != null ? applicantinfo.getIndiLastName() : "");
				jsonArray.put(propertiesObject3);
				propertiesObject4.put("key", "OOSOI_Address");
				propertiesObject4.put("value", applicantinfo != null ? applicantinfo.getAddress() : "");
				jsonArray.put(propertiesObject4);
				propertiesObject5.put("key", "OOSOI_Email");
				propertiesObject5.put("value", applicantinfo != null ? applicantinfo.getEmailAddress() : "");
				jsonArray.put(propertiesObject5);
				propertiesObject6.put("key", "OOSOI_Tel");
				propertiesObject6.put("value", applicantinfo != null ? applicantinfo.getTelephone() : "");
				jsonArray.put(propertiesObject6);

				propertiesObject7.put("key", "OOSOI_TRN");
				propertiesObject7.put("value", applicantinfo != null ? applicantinfo.getTrnNumber() : "");
				jsonArray.put(propertiesObject7);

				propertiesObject8.put("key", "OOSOI_CompanyName");
				propertiesObject8.put("value", applicantinfo != null ? applicantinfo.getCompanyName() : "");
				jsonArray.put(propertiesObject8);

				if (applicantinfo.getApplicationDate() != null) {
				}
				propertiesObject9.put("value",
						applicantinfo != null ? bpmDateFormat.format(new SimpleDateFormat().format(applicantinfo.getApplicationDate()))
								: "");
				jsonArray.put(propertiesObject9);
			}
			} catch (Exception e) {
			}
			OsiServicesInsolventPersoninfo insolventInfo = null;

			try {
				insolventInfo = OsiServicesInsolventPersoninfoLocalServiceUtil
						.getOsiServicesInsolventPersoninfoById(osiServiceApplicationId);
			
			if (Validator.isNotNull(insolventInfo)) {
				propertiesObject10.put("key", "OOSOI_NatureofInsolventPerson");
				if (insolventInfo.getInsolventPersonNature().equals("Individual")) {
					propertiesObject10.put("value", "Individual/ Natural Person");
				} else if (osiServicesApplication.getNatureOfApplicant().equals("Company")) {
					propertiesObject10.put("value", "Company/Legal Person");
				} else if (insolventInfo.getInsolventPersonNature().equals("Individual")) {
					propertiesObject10.put("value", "");
				}

				propertiesObject11.put("key", "OOSOI_FirstNameIndividual");
				propertiesObject11.put("value", insolventInfo != null ? insolventInfo.getInsolventIndiFirstName() : "");
				jsonArray.put(propertiesObject11);

				propertiesObject12.put("key", "OOSOI_Lastname_Individual");
				propertiesObject12.put("value", insolventInfo != null ? insolventInfo.getInsolventIndiLastName() : "");
				jsonArray.put(propertiesObject12);

				propertiesObject13.put("key", "OOSOI_Company_OSI");
				propertiesObject13.put("value", insolventInfo != null ? insolventInfo.getInsolventCompanyName() : "");
				jsonArray.put(propertiesObject13);

				propertiesObject14.put("key", "OOSOI_Address_Emergency");
				propertiesObject14.put("value", insolventInfo != null ? insolventInfo.getInsolventAddress() : "");
				jsonArray.put(propertiesObject14);

				jsonArray.put(propertiesObject15);
				propertiesObject15.put("key", "OOSOI_Parish");
				propertiesObject15.put("value", insolventInfo != null ? insolventInfo.getInsolventParish() : "");
				jsonArray.put(propertiesObject15);

				propertiesObject16.put("key", "OOSOI_Email_Emergency");
				propertiesObject16.put("value", insolventInfo != null ? insolventInfo.getInsolventEmailAddress() : "");
				jsonArray.put(propertiesObject16);

				propertiesObject17.put("key", "OOSOI_TelNo_Emergency");
				propertiesObject17.put("value", insolventInfo != null ? insolventInfo.getInsolventTelephone() : "");
				jsonArray.put(propertiesObject17);

				propertiesObject18.put("key", "OOSOI_TaxRegistrationNumberTRN");
				propertiesObject18.put("value", insolventInfo != null ? insolventInfo.getInsolventTrnNumber() : "");
				jsonArray.put(propertiesObject18);
			}
			} catch (Exception e) {
			}
			try {
				detailinfo = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil
						.getOsiServicesTrusteeIndividualDetailinfoById(osiServiceApplicationId);
			
			if (detailinfo != null) {
				propertiesObject26.put("key", "OOSOI_FirstNameIndividual");
				propertiesObject26.put("value", detailinfo != null ? detailinfo.getIndiFamilyName() : "");
				jsonArray.put(propertiesObject26);

				propertiesObject27.put("key", "OOSOI_GivenNames_Ind");
				propertiesObject27.put("value", detailinfo != null ? detailinfo.getIndiGivenName() : "");
				jsonArray.put(propertiesObject27);
				try {

					propertiesObject28.put("value",
							detailinfo != null && detailinfo.getIndiDateOfBirth() != null && detailinfo.getIndiDateOfBirth() != null
									? bpmDateFormat.format(detailinfo.getIndiDateOfBirth())
									: "");
					propertiesObject28.put("key", "OOSOI_DateofBirth_Individual");
					jsonArray.put(propertiesObject28);
				} catch (Exception e) {
				}
				propertiesObject29.put("key", "OOSOI_OtherPreviousLegalNamesorAliases");
				propertiesObject29.put("value",
						detailinfo != null && detailinfo.getIndiOtherLegalNames() != null
								? detailinfo.getIndiOtherLegalNames()
								: "");
				jsonArray.put(propertiesObject29);

				propertiesObject30.put("key", "OOSOI_Address");
				propertiesObject30.put("value",
						detailinfo != null && detailinfo.getIndiBusinessAddress() != null
								? detailinfo.getIndiBusinessAddress()
								: "");
				jsonArray.put(propertiesObject30);

				propertiesObject31.put("key", "OOSOI_Telephone_Indvidual");
				propertiesObject31.put("value",
						detailinfo != null && detailinfo.getIndiBusinessTeleNo() != null
								? detailinfo.getIndiBusinessTeleNo()
								: "");
				jsonArray.put(propertiesObject31);

				propertiesObject32.put("key", "OOSOI_Fax");
				propertiesObject32.put("value",
						detailinfo != null && detailinfo.getIndiBusinessTeleNo() != null
								? detailinfo.getIndiBusinessTeleNo()
								: "");
				jsonArray.put(propertiesObject32);

				propertiesObject33.put("key", "OOSOI_EmailAddress_Individual");
				propertiesObject33.put("value",
						detailinfo != null && detailinfo.getIndiBusinessEmail() != null
								? detailinfo.getIndiBusinessEmail()
								: "");
				jsonArray.put(propertiesObject33);

				propertiesObject34.put("key", "OOSOI_HomeAddress");
				propertiesObject34.put("value",
						detailinfo != null && detailinfo.getIndiHomeAddress() != null ? detailinfo.getIndiHomeAddress()
								: "");
				jsonArray.put(propertiesObject34);

				propertiesObject35.put("key", "OOSOI_CurrentEmployer");
				propertiesObject35.put("value",
						detailinfo != null && detailinfo.getIndiCurrentEmployer() != null
								? detailinfo.getIndiCurrentEmployer()
								: "");
				jsonArray.put(propertiesObject35);
				try {
					propertiesObject36.put("value",
							detailinfo != null && detailinfo.getIndiDateOfEmployment() != null && detailinfo.getIndiDateOfEmployment() != null
									? bpmDateFormat.format(detailinfo.getIndiDateOfEmployment())
									: "");
					propertiesObject36.put("key", "OOSOI_DateofEmployment");
					jsonArray.put(propertiesObject36);
				} catch (Exception e) {
				}
				propertiesObject37.put("key", "OOSOI_ProfessionalOrganizationsofwhichIamcurrentlyamember");
				JSONArray array = JSONFactoryUtil.createJSONArray();
				array.put(detailinfo != null && detailinfo.getIndiProfessionalOrg() != null
						? detailinfo.getIndiProfessionalOrg()
						: "");
				propertiesObject37.put("value", array);
				jsonArray.put(propertiesObject37);
			}
			} catch (Exception e) {
			}
			try {
				companyinfo = OsiServicesTrusteeCompanyinfoLocalServiceUtil
						.getOsiServicesTrusteeCompanyinfoById(osiServiceApplicationId);
			
			if (companyinfo != null) {
				propertiesObject39.put("key", "OOSOI_NameofCorporationpreapprovedbytheRegistrar");
				propertiesObject39.put("value",
						companyinfo != null && companyinfo.getComCorporationName() != null
								? companyinfo.getComCorporationName()
								: "");
				jsonArray.put(propertiesObject39);
				propertiesObject40.put("key", "OOSOI_Address_Emergency");
				propertiesObject40.put("value",
						companyinfo != null && companyinfo.getComHeadOfficeAddress() != null
								? companyinfo.getComHeadOfficeAddress()
								: "");
				jsonArray.put(propertiesObject40);
				propertiesObject41.put("key", "OOSOI_Tel");
				propertiesObject41.put("value",
						companyinfo != null && companyinfo.getComTeleNo() != null ? companyinfo.getComTeleNo() : "");
				jsonArray.put(propertiesObject41);
				propertiesObject42.put("key", "OOSOI_FaxNo");
				propertiesObject42.put("value",
						companyinfo != null && companyinfo.getComFaxNo() != null ? companyinfo.getComFaxNo() : "");
				jsonArray.put(propertiesObject42);
				propertiesObject43.put("key", "OOSOI_Email");
				propertiesObject43.put("value",
						companyinfo != null && companyinfo.getComEmail() != null ? companyinfo.getComEmail() : "");
				jsonArray.put(propertiesObject43);

				propertiesObject44.put("key", "OOSOI_Othercountriesinwhichthecorporationregistered");
				JSONArray stringArray = JSONFactoryUtil.createJSONArray();
				stringArray.put(companyinfo != null && companyinfo.getOtherCountry() != null
						? companyinfo.getOtherCountry()
						: "");
				propertiesObject44.put("value", stringArray);
				jsonArray.put(propertiesObject44);
				try {
					propertiesObject45.put("key", "OOSOI_DateofIncorporation");
					propertiesObject45.put("value",
							companyinfo != null && companyinfo.getComIncorporationDate() != null
									? bpmDateFormat.format(companyinfo.getComIncorporationDate())
									: "");
					jsonArray.put(propertiesObject45);
				} catch (Exception e) {
				}
				propertiesObject46.put("key", "OOSOI_YEARmonthdayforwhichLicenceisrequested");
				propertiesObject46.put("value",
						companyinfo != null && companyinfo.getComLicenceRequest() != null
								? companyinfo.getComLicenceRequest()
								: "");
				jsonArray.put(propertiesObject46);
			}
			} catch (Exception e) {
			}
			jsonObject.put("properties", jsonArray);
			_log.info("Request json--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in OSI Services Status************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in OSI Services Status************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in OSI Services Status************" + isBPMEnabled);
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");
				if (response.getCode() == HttpStatus.SC_OK) {
					OsiServicesApplication osiServicesApplications = null;
					try {
						osiServicesApplications = OsiServicesApplicationLocalServiceUtil
								.getOsiServicesApplication(osiServiceApplicationId);
					} catch (PortalException e1) {
					}
					osiServicesApplications.setStatus(OSIServiceApplicationWorkflowConstant.SUBMITTED);
					osiServicesApplications.setCaseId(caseId);
					osiServicesApplications.setIcmDocumentPath(path);
					OsiServicesApplicationLocalServiceUtil.updateOsiServicesApplication(osiServicesApplications);

					jsonOBJ.put("osiServiceApplicationId", osiServicesApplications.getOsiServicesApplicationId());
					jsonOBJ.put("status", OSIServiceApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("applicationNumber", osiServicesApplication.getApplicationNumber());
					jsonOBJ.put("categories", osiServicesApplication.getDoYouWant());
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"OSI Services Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(osiServicesApplications.getOsiServicesApplicationId()));
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
							if ((!allSupportingFolder.getName().equals("Signature Assignment"))
									|| (!allSupportingFolder.getName().equals("Signature General Benefit Creditors"))
									|| (!allSupportingFolder.getName().equals("Signature Trustee Qualification"))
									|| (!allSupportingFolder.getName().equals("Signature Trustee Undersigned"))
									|| (!allSupportingFolder.getName().equals("Signature of Applicant"))
									|| (!allSupportingFolder.getName().equals("Signature of Trustee"))
									|| (!allSupportingFolder.getName().equals("Signature of Trustee"))) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}

						try {

							String CategoryTypeUpperCase = osiServicesApplication.getDoYouWant().toUpperCase();
							String subcategoryUpperCase = osiServicesApplication.getTypeOfTransaction().toUpperCase();
							String childcategoryUpperCase = osiServicesApplication.getTypeOfApplicant().toUpperCase();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							_log.info("path--------------email call");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
												"[$Category$]", "[$subCategory$]", "[$childCategory$]",
												"[$transactionNo$]" },

										new String[] { themeDisplay.getUser().getFullName(), "OSI-Services",
												"entityName", CategoryTypeUpperCase, subcategoryUpperCase,
												childcategoryUpperCase,
												osiServicesApplication.getApplicationNumber() });
							}
							commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
									themeDisplay.getUser().getEmailAddress(), body);
							_log.info(
									"Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

						} catch (Exception e) {
							e.printStackTrace();
						}
						String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
								.getAttribute("upload-files-api-endpoint");
						_log.info("path--------------" + path);

						for (File supportingDocs : filez) {
							HttpResponse<String> documentUploadresponse = Unirest
									.post(launchCaseUrl + uploadFilesEndPoint).field("path", path)
									.field("files", supportingDocs).asString();
							_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
						}

					} catch (Exception e) {
					}
				}

			}//bpm enabled closed
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");

		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
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
}
