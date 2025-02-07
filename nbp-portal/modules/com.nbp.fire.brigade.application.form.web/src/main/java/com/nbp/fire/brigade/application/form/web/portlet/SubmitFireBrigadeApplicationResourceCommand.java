package com.nbp.fire.brigade.application.form.web.portlet;

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
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppPaymentLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationWorkflowConstant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/sbmit/fire/brigade/application" }, service = MVCResourceCommand.class)
public class SubmitFireBrigadeApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitFireBrigadeApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String certificateType = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "certificateType"));
		String typeOfTransaction = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		String applicantType = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "applicantType"));
		String premisesType = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "premisesType"));
		String certificatePurpose = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "certificatePurpose"));
		String parish = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "parish"));
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		String checkPdfDownloadWithoutDocument = "false";
		String entityId = (String) themeDisplay.getUser().getExpandoBridge()
				.getAttribute(FireBrigadeApplicationFormPortletKeys.ENTITY_ID);
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		FireBrigadeApplication firebrigadeApplication = null;
		if (fireBrigadeApplicationId > 0) {
			try {
				firebrigadeApplication = FireBrigadeApplicationLocalServiceUtil
						.getFireBrigadeApplication(fireBrigadeApplicationId);
			} catch (PortalException e) {
			}
		} else {
			fireBrigadeApplicationId = CounterLocalServiceUtil.increment(FireBrigadeApplication.class.getName());
		}
		try {
			firebrigadeApplication.setCertificateType(certificateType);
			firebrigadeApplication.setTypeOfTransaction(typeOfTransaction);
			firebrigadeApplication.setTypeOfApplicant(applicantType);
			firebrigadeApplication.setTypeOfPermises(premisesType);
			firebrigadeApplication.setPurposeOfCertificate(certificatePurpose);
			firebrigadeApplication.setParish(parish);
			firebrigadeApplication.setEntityId((String) themeDisplay.getUser().getExpandoBridge()
					.getAttribute(FireBrigadeApplicationFormPortletKeys.ENTITY_ID));
			if (Validator.isNotNull(entityId)) {
				firebrigadeApplication.setEntityId(entityId);
			}
			firebrigadeApplication.setStatus(FireBrigadeApplicationWorkflowConstant.DRAFT);
			if (Validator.isNull(firebrigadeApplication.getApplicationNumber())) {
				_log.info("inside if--------------------------------");
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				firebrigadeApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			FireBrigadeApplicationLocalServiceUtil.updateFireBrigadeApplication(firebrigadeApplication);
			FireBrigadeApplication submittedApplication = null;
			try {
				submittedApplication = FireBrigadeApplicationLocalServiceUtil
						.getFireBrigadeApplication(fireBrigadeApplicationId);
			} catch (PortalException e2) {
			}
			jsonOBJ.put("fireBrigadeAppNo", submittedApplication.getApplicationNumber());
			jsonOBJ.put("appStatus", FireBrigadeApplicationWorkflowConstant.DRAFT_Label);
			jsonOBJ.put("category", submittedApplication.getTypeOfPermises());
			jsonOBJ.put("fireBrigadeAppicationId", submittedApplication.getFireBrigadeApplicationId());
			jsonFeed.put("APP_DATA", jsonOBJ);
			// ------------------------------------------Launch
			// Case-----------------------------
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
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			jsonObject.put("solutionType", "JFBAF_ApplicationforaStatusVerificationReport");

			if (submittedApplication.getCertificateType().equals("Apply for a Fire Safety Certificate")) {
				propertiesObject5.put("key", "JFBAF_TypeofApplication");
				propertiesObject5.put("value", "Fire Certificate");
			} else if (submittedApplication.getCertificateType().equals("Apply for an Occupancy Certificate")) {
				propertiesObject5.put("key", "JFBAF_TypeofApplication");
				propertiesObject5.put("value", "Occupancy Certificate");
			} else if (submittedApplication.getCertificateType().equals("")) {
				propertiesObject5.put("key", "JFBAF_TypeofApplication");
				propertiesObject5.put("value", "");
			}
			jsonArray.put(propertiesObject5);

			if (submittedApplication.getTypeOfTransaction().equals("New Application for a Certificate")) {
				propertiesObject1.put("key", "JFBAF_TypeofTransaction");
				propertiesObject1.put("value", "New");
			} else if (submittedApplication.getTypeOfTransaction().equals("Application for Recertification")) {
				propertiesObject1.put("key", "JFBAF_TypeofTransaction");
				propertiesObject1.put("value", "Recertification");
			} else if (submittedApplication.getTypeOfTransaction().equals("")) {
				propertiesObject1.put("key", "JFBAF_TypeofTransaction");
				propertiesObject1.put("value", "");
			}
			jsonArray.put(propertiesObject1);

			if (submittedApplication.getTypeOfApplicant().equals("Applicant")) {
				propertiesObject2.put("key", "JFBAF_TypeofApplicant");
				propertiesObject2.put("value", "Applicant");
			} else if (submittedApplication.getTypeOfApplicant().equals("Acting on Behalf of Owner/Occupier")) {
				propertiesObject2.put("key", "JFBAF_TypeofApplicant");
				propertiesObject2.put("value", "Acting on Behalf of Owner/Occupier");
			} else if (submittedApplication.getTypeOfApplicant().equals("")) {
				propertiesObject2.put("key", "JFBAF_TypeofApplicant");
				propertiesObject2.put("value", "");
			}
			jsonArray.put(propertiesObject2);

			if (submittedApplication.getTypeOfPermises().equals("Commercial")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "Commercial");
			} else if (submittedApplication.getTypeOfPermises().equals("Office")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "Office");
			} else if (submittedApplication.getTypeOfPermises().equals("School")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "School");
			} else if (submittedApplication.getTypeOfPermises().equals("Institution")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "Institution");
			} else if (submittedApplication.getTypeOfPermises().equals("Basic School")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "Basic School");
			} else if (submittedApplication.getTypeOfPermises().equals("")) {
				propertiesObject3.put("key", "JFBAF_TypeofPremises");
				propertiesObject3.put("value", "");
			}
			jsonArray.put(propertiesObject3);

			if (submittedApplication.getPurposeOfCertificate().equals("Event Hosting")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "Event hosting");
			} else if (submittedApplication.getPurposeOfCertificate().equals("Demolition")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "Demolition");
			} else if (submittedApplication.getPurposeOfCertificate().equals("Operation of Premises")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "Operation of Premises");
			} else if (submittedApplication.getPurposeOfCertificate().equals("Fire-works Displays")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "Fire-works Display");
			} else if (submittedApplication.getPurposeOfCertificate().equals("General Building Certification")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "General Building Certification");
			} else if (submittedApplication.getPurposeOfCertificate().equals("Other")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "Other");
			} else if (submittedApplication.getPurposeOfCertificate().equals("")) {
				propertiesObject4.put("key", "JFBAF_PurposeofCertificate");
				propertiesObject4.put("value", "");
			}
			jsonArray.put(propertiesObject4);

			propertiesObject19.put("key", "JFBAF_Parish");
			if (submittedApplication.getParish().equals("Kingston")) {
				propertiesObject19.put("value", "Kingston");
			} else if (submittedApplication.getParish().equals("St. Andrew")) {
				propertiesObject19.put("value", "St. Andrew");
			} else if (submittedApplication.getParish().equals("Manchester")) {
				propertiesObject19.put("value", "Manchester");
			} else if (submittedApplication.getParish().equals("St. Catherine")) {
				propertiesObject19.put("value", "St. Catherine");
			} else if (submittedApplication.getParish().equals("St. Thomas")) {
				propertiesObject19.put("value", "St. Thomas");
			} else if (submittedApplication.getParish().equals("St Mary")) {
				propertiesObject19.put("value", "St Mary");
			} else if (submittedApplication.getParish().equals("Portland")) {
				propertiesObject19.put("value", "Portland");
			} else if (submittedApplication.getParish().equals("St. Ann")) {
				propertiesObject19.put("value", "St. Ann");
			} else if (submittedApplication.getParish().equals("Trelawny")) {
				propertiesObject19.put("value", "Trelawny");
			} else if (submittedApplication.getParish().equals("St. James")) {
				propertiesObject19.put("value", "St. James");
			} else if (submittedApplication.getParish().equals("Hanover")) {
				propertiesObject19.put("value", "Hanover");
			} else if (submittedApplication.getParish().equals("Westmoreland")) {
				propertiesObject19.put("value", "Westmoreland");
			} else if (submittedApplication.getParish().equals("St. Elizabeth")) {
				propertiesObject19.put("value", "St. Elizabeth");
			} else if (submittedApplication.getParish().equals("Clarendon")) {
				propertiesObject19.put("value", "Clarendon");
			} else if (submittedApplication.getParish().equals("")) {
				propertiesObject19.put("value", "");
			}
			jsonArray.put(propertiesObject19);

			FireBrigadeSignatureInfo fireBrigadeSignatureInfo = null;
			try {
				fireBrigadeSignatureInfo = FireBrigadeSignatureInfoLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}

			if (Validator.isNotNull(fireBrigadeSignatureInfo)) {
				propertiesObject6.put("key", "JFBAF_NameofApplicant");
				propertiesObject6.put("value", fireBrigadeSignatureInfo.getName());
				jsonArray.put(propertiesObject6);

				propertiesObject36.put("key", "JFBAF_Telephone");
				propertiesObject36.put("value", fireBrigadeSignatureInfo.getTelephone());
				jsonArray.put(propertiesObject36);

				propertiesObject7.put("key", "JFBAF_EmailAddress");
				propertiesObject7.put("value", fireBrigadeSignatureInfo.getEmail());
				jsonArray.put(propertiesObject7);

				if (Validator.isNotNull(fireBrigadeSignatureInfo.getDate())) {
					propertiesObject8.put("key", "JFBAF_DateofApplication");
					propertiesObject8.put("value", bpmDateFormat.format(fireBrigadeSignatureInfo.getDate()));
					jsonArray.put(propertiesObject8);
				}

				propertiesObject9.put("key", "JFBAF_Address");
				propertiesObject9.put("value", fireBrigadeSignatureInfo.getAddress());
				jsonArray.put(propertiesObject9);

				propertiesObject42.put("key", "JFBAF_TRN");
				propertiesObject42.put("value", fireBrigadeSignatureInfo.getTrn());
				jsonArray.put(propertiesObject42);
			}

			FireBrigadePremisesInfo premisesInfo = null;
			try {
				premisesInfo = FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}

			if (Validator.isNotNull(premisesInfo)) {
				propertiesObject10.put("key", "JFBAF_Isthepremises");
				if (premisesInfo.getPremises().equals("Owned")) {
					propertiesObject10.put("value", "Owned");
				} else if (premisesInfo.getPremises().equals("Leased")) {
					propertiesObject10.put("value", "Leased");
				} else if (premisesInfo.getPremises().equals("")) {
					propertiesObject10.put("value", "");
				}
				jsonArray.put(propertiesObject10);

				propertiesObject11.put("key", "JFBAF_CertifiedBefore");
				if (premisesInfo.getPremisesCertified().equals("Yes")) {
					propertiesObject11.put("value", "Yes");
				} else if (premisesInfo.getPremisesCertified().equals("No")) {
					propertiesObject11.put("value", "No");
				} else if (premisesInfo.getPremisesCertified().equals("")) {
					propertiesObject11.put("value", "");
				}
				jsonArray.put(propertiesObject11);

				if (Validator.isNotNull(premisesInfo.getExpirationDate())) {
					propertiesObject12.put("key", "JFBAF_Expirationdate");
					propertiesObject12.put("value", bpmDateFormat.format(premisesInfo.getExpirationDate()));
					jsonArray.put(propertiesObject12);
				}

				propertiesObject13.put("key", "JFBAF_Certificate");
				propertiesObject13.put("value", premisesInfo.getCertificateNumber());
				jsonArray.put(propertiesObject13);

				propertiesObject14.put("key", "JFBAF_NameOfPremises");
				propertiesObject14.put("value", premisesInfo.getName());
				jsonArray.put(propertiesObject14);

				propertiesObject15.put("key", "JFBAF_AddressofPremises");
				propertiesObject15.put("value", premisesInfo.getAddress());
				jsonArray.put(propertiesObject15);
			}

			FireBrigadeOperatorDetail operatorDetail = null;
			try {
				operatorDetail = FireBrigadeOperatorDetailLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}

			if (Validator.isNotNull(operatorDetail)) {
				propertiesObject16.put("key", "JFBAF_OperatorsName");
				propertiesObject16.put("value", operatorDetail.getOperatorName());
				jsonArray.put(propertiesObject16);

				propertiesObject17.put("key", "JFBAF_BusinessName");
				propertiesObject17.put("value", operatorDetail.getBusinessName());
				jsonArray.put(propertiesObject17);

				propertiesObject18.put("key", "JFBAF_AddressofPremises");
				propertiesObject18.put("value", operatorDetail.getAddress());
				jsonArray.put(propertiesObject18);

//				propertiesObject37.put("key", "JFBAF_Usestowhichpremisesisput");
//				propertiesObject37.put("value", operatorDetail.getPremisesUses());
//				jsonArray.put(propertiesObject37);

				propertiesObject20.put("key", "JFBAF_UseofPremises");
				if (operatorDetail.getPremisesOccupancy().equals("Single floor structure occupancy")) {
					propertiesObject20.put("value", "Single floor structure occupancy");
				} else if (operatorDetail.getPremisesOccupancy().equals("Multiple floor structure occupancy")) {
					propertiesObject20.put("value", "Multiple floor structure occupancy");
				} else if (operatorDetail.getPremisesOccupancy().equals("")) {
					propertiesObject20.put("value", "");
				}
				jsonArray.put(propertiesObject20);

				propertiesObject21.put("key", "JFBAF_OtherPremises");
				propertiesObject21.put("value", operatorDetail.getPremisesBusiness());
				jsonArray.put(propertiesObject21);

				propertiesObject22.put("key", "JFBAF_Maximumnumberofpersonstoworkonthepremises");
				propertiesObject22.put("value", operatorDetail.getMaxWorkingPersons());
				jsonArray.put(propertiesObject22);

				propertiesObject23.put("key", "JFBAF_Maximumnumberofpersonsotherthanworkersthatarelikelyto");
				propertiesObject23.put("value", operatorDetail.getMaxNumPersonsAtAnyOneTime());
				jsonArray.put(propertiesObject23);
			}

			FireBrigadeMultFloorInfo multFloorInfo = null;
			try {
				multFloorInfo = FireBrigadeMultFloorInfoLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
			if (Validator.isNotNull(multFloorInfo)) {
				propertiesObject24.put("key", "JFBAF_AlternateExists");
				propertiesObject24.put("value", multFloorInfo.getFloorAlternateExist());
				jsonArray.put(propertiesObject24);

				propertiesObject25.put("key", "JFBAF_RisingMain");
				propertiesObject25.put("value", multFloorInfo.getBuildingRisingMain());
				jsonArray.put(propertiesObject25);

				propertiesObject26.put("key", "JFBAF_FireBrigadeEquipment");
				propertiesObject26.put("value", multFloorInfo.getEquipmentConnection());
				jsonArray.put(propertiesObject26);

				propertiesObject27.put("key", "JFBAF_ParkingGarage");
				propertiesObject27.put("value", multFloorInfo.getBuildingParkingGarage());
				jsonArray.put(propertiesObject27);
			}
			FireBrigadeProEquipmentInfo protectionEquipment = null;
			try {
				protectionEquipment = FireBrigadeProEquipmentInfoLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			JSONObject factoryPlantAddressJsonObj = new JSONFactoryUtil().createJSONObject();
			try {
				factoryPlantAddressJsonObj.put("key", "JFBAF_FireProtectionEquipment");
				JSONObject propertiesObject110 = new JSONFactoryUtil().createJSONObject();
				JSONObject factoryPlantAddressValueJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				JSONArray jsonArrayPr = new JSONFactoryUtil().createJSONArray();
				if (protectionEquipment != null) {
					String[] otherEquipment = protectionEquipment.getEquipmentProtectionPre().split(",");

					for (String info : otherEquipment) {

						JSONObject purposeOfCertificateArray = new JSONFactoryUtil().createJSONObject();
						JSONObject jsonRadioButton = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject203 = new JSONFactoryUtil().createJSONObject();
						if (info.equals("Hose Reels")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Hose Reels");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionOne());
						} else if (info.equals("Portable Fire Extinguishers")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Portable Fire Extinguishers");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionTwo());
						} else if (info.equals("Fire Alarm")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Fire Alarm");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionThree());
						} else if (info.equals("Smoke/Heat detectors")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Smoke/Heat detectors");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionFour());
						} else if (info.equals("Sprinkler System")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Sprinkler System");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionFive());
						} else if (info.equals("Hydrant")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Hydrant");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getEquipmentProtectionSix());
						} else if (info.equals("Other")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "Other (specify type e.g. fire blanket)");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", protectionEquipment.getOtherEquipment());
						} else if (info.equals("")) {
							purposeOfCertificateArray.put("name", "JFBAF_FireProtectionEquipmenttype");
							purposeOfCertificateArray.put("value", "");
							jsonRadioButton.put("name", "JFBAF_Istheequipmentregularlymaintained");
							jsonRadioButton.put("value", "");
						}
						jsonArrayPr.put(purposeOfCertificateArray);
						jsonArrayPr.put(jsonRadioButton);

					}

					propertiesObject110.put("properties", jsonArrayPr);
					jsonArrayObjects.put(propertiesObject110);
					factoryPlantAddressValueJsonObj.put("objects", jsonArrayObjects);
				}
				factoryPlantAddressJsonObj.put("value", jsonArrayObjects);
				jsonArray.put(factoryPlantAddressJsonObj);
			} catch (Exception e) {
			}
//			FireBrigadeProEquipmentInfo protectionEquipment=null;
//			try {
//				protectionEquipment=FireBrigadeProEquipmentInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
//			JSONObject factoryPlantAddressJsonObj = new JSONFactoryUtil().createJSONObject();
//			factoryPlantAddressJsonObj.put("key", "JFBAF_FireProtectionEquipment");
//			JSONObject factoryPlantAddressValueJsonObj = new JSONFactoryUtil().createJSONObject();
//			JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
//			if (protectionEquipment != null) {
//					JSONObject propertiesObject45 = new JSONFactoryUtil().createJSONObject();
//					JSONObject propertiesObject46 = new JSONFactoryUtil().createJSONObject();
//					JSONObject propertiesObject47 = new JSONFactoryUtil().createJSONObject();
//					JSONObject propertiesObject203 = new JSONFactoryUtil().createJSONObject();
//					JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
//					JSONObject factoryPlantAddressListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
//					try {
//					if (Validator.isNotNull(protectionEquipment)) {
//						propertiesObject45.put("key", "JFBAF_FireProtectionEquipmenttype");
//						String[] purposeOfCertificate = protectionEquipment.getEquipmentProtectionPre().split(",");
//						JSONArray purposeOfCertificateArray = JSONFactoryUtil.createJSONArray();
//						for (String info : purposeOfCertificate) {
//							if (info.equals("Event hosting")) {
//								purposeOfCertificateArray.put("Event hosting");
//							} else if (info.equals("Demolition")) {
//								purposeOfCertificateArray.put("Demolition");
//							} else if (info.equals("Operation of Premises")) {
//								purposeOfCertificateArray.put("Operation of Premises");
//							} else if (info.equals("Fire-works Display")) {
//								purposeOfCertificateArray.put("Fire-works Display");
//							} else if (info.equals("General Building Certification")) {
//								purposeOfCertificateArray.put("General Building Certification");
//							} else if (info.equals("Other")) {
//								purposeOfCertificateArray.put("Other");
//							}else if (info.equals("")) {
//								purposeOfCertificateArray.put("");
//							}
//						}
//						propertiesObject45.put("value", purposeOfCertificateArray);// ---has to be set
//						jsonArray.put(propertiesObject45);
//					}}catch (Exception e) {
//					}
//					factoryPlantAddressListObjectValueJsonObject.put("properties", jsonArrayProp);
//					jsonArrayObjects.put(factoryPlantAddressListObjectValueJsonObject);
//				
//				factoryPlantAddressValueJsonObj.put("objects", jsonArrayObjects);
//			}
//			factoryPlantAddressJsonObj.put("value", factoryPlantAddressValueJsonObj);
//			jsonArray.put(factoryPlantAddressJsonObj);
//			} catch (Exception e) {
//			}

			FireBrigadeHazardousSubInfo hazardousSubInfo = null;
			try {
				hazardousSubInfo = FireBrigadeHazardousSubInfoLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
			if (Validator.isNotNull(hazardousSubInfo)) {
				propertiesObject28.put("key", "JFBAF_LPGCylinder");
				propertiesObject28.put("value", hazardousSubInfo.getLpgCylinder());
				jsonArray.put(propertiesObject28);

				propertiesObject29.put("key", "JFBAF_FlammableGases");
				propertiesObject29.put("value", hazardousSubInfo.getFlammableGases());
				jsonArray.put(propertiesObject29);

				propertiesObject30.put("key", "JFBAF_FlammableCombustibleLiquid");
				propertiesObject30.put("value", hazardousSubInfo.getFlammableCombustibleLiquid());
				jsonArray.put(propertiesObject30);

				propertiesObject31.put("key", "JFBAF_Chemicalsliquid");
				propertiesObject31.put("value", hazardousSubInfo.getChemicalsLiquid());
				jsonArray.put(propertiesObject31);

				propertiesObject32.put("key", "JFBAF_Chemicalspowder");
				propertiesObject32.put("value", hazardousSubInfo.getChemicalsPowder());
				jsonArray.put(propertiesObject32);

				propertiesObject33.put("key", "JFBAF_Explosives");
				propertiesObject33.put("value", hazardousSubInfo.getExplosives());
				jsonArray.put(propertiesObject33);

				propertiesObject34.put("key", "JFBAF_Otherhazardoussubstancematerialpleasespecify");
				propertiesObject34.put("value", hazardousSubInfo.getOtherHazardousSubstance());
				jsonArray.put(propertiesObject34);
			}

			propertiesObject43.put("key", "JFBAF_Transaction");
			propertiesObject43.put("value", submittedApplication.getApplicationNumber());
			jsonArray.put(propertiesObject43);

			FireBrigadeAppPayment fireBrigadePayment = null;
			try {
				fireBrigadePayment = FireBrigadeAppPaymentLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
			}
			if (Validator.isNotNull(fireBrigadePayment)) {
				propertiesObject44.put("key", "JFBAF_AmountPaid");
				propertiesObject44.put("value", fireBrigadePayment.getAmountPaid());
				jsonArray.put(propertiesObject44);

//				propertiesObject45.put("key", "JFBAF_PaymentDateReceived");
//				propertiesObject45.put("value", fireBrigadePayment.getCreateDate());
//				jsonArray.put(propertiesObject45);

				propertiesObject46.put("key", "JFBAF_PaymentMethod");
				if (fireBrigadePayment.getPaymentMethod().equals("Direct Deposit")) {
					propertiesObject46.put("value", "Direct Deposit");
				} else if (fireBrigadePayment.getPaymentMethod().equals("Bank Draft")) {
					propertiesObject46.put("value", "Bank Draft");
				} else if (fireBrigadePayment.getPaymentMethod().equals("Credit Card")) {
					propertiesObject46.put("value", "Credit Card");
				} else if (fireBrigadePayment.getPaymentMethod().equals("Other")) {
					propertiesObject46.put("value", "Other");
				} else if (fireBrigadePayment.getPaymentMethod().equals("Cash")) {
					propertiesObject46.put("value", "Cash");
				} else if (fireBrigadePayment.getPaymentMethod().equals("Cheque")) {
					propertiesObject46.put("value", "Cheque");
				} else if (fireBrigadePayment.getPaymentMethod().equals("")) {
					propertiesObject46.put("value", "");
				}
				jsonArray.put(propertiesObject46);
			}

//			FireBrigadeCerPurposeInfo cerPurpose = null;
//			try {
//				cerPurpose = FireBrigadeCerPurposeInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
//			} catch (Exception e) {
//			}
//			
//			propertiesObject35.put("key", "ROFCP_AdditionalPermitsRequired");
//			String[] permit = cerPurpose.getCertificatePurposePre().split(",");
//			JSONArray permitValueArray = JSONFactoryUtil.createJSONArray();
//			for (String certificatePurposeVal : permit) {
//				if (certificatePurposeVal.equals("Event hosting")) {
//					permitValueArray.put("Event hosting");
//				} else if (certificatePurposeVal.equals("Demolition")) {
//					permitValueArray.put("Demolition");
//				} else if (certificatePurposeVal.equals("Operation of Premises")) {
//					permitValueArray.put("Operation of Premises");
//				} else if (certificatePurposeVal.equals("Fire-works Display")) {
//					permitValueArray.put("Fire-works Display");
//				} else if (certificatePurposeVal.equals("General Building Certification")) {
//					permitValueArray.put("General Building Certification");
//				} else if (certificatePurposeVal.equals("Other")) {
//					permitValueArray.put("Other");
//				}else if (certificatePurposeVal.equals("")) {
//					permitValueArray.put("");
//				}
//			}
//			propertiesObject35.put("value", permitValueArray);// ---has to be set
//			jsonArray.put(propertiesObject35);

//			try {
//			if (Validator.isNotNull(cerPurpose)) {
//				propertiesObject35.put("key", "JFBAF_PurposeofCertificate");
//				String[] purposeOfCertificate = cerPurpose.getCertificatePurposePre().split(",");
//				JSONArray purposeOfCertificateArray = JSONFactoryUtil.createJSONArray();
//				for (String info : purposeOfCertificate) {
//					if (info.equals("Event hosting")) {
//						purposeOfCertificateArray.put("Event hosting");
//					} else if (info.equals("Demolition")) {
//						purposeOfCertificateArray.put("Demolition");
//					} else if (info.equals("Operation of Premises")) {
//						purposeOfCertificateArray.put("Operation of Premises");
//					} else if (info.equals("Fire-works Display")) {
//						purposeOfCertificateArray.put("Fire-works Display");
//					} else if (info.equals("General Building Certification")) {
//						purposeOfCertificateArray.put("General Building Certification");
//					} else if (info.equals("Other")) {
//						purposeOfCertificateArray.put("Other");
//					} else if (info.equals("")) {
//						purposeOfCertificateArray.put("");
//					}
//				}
//				propertiesObject41.put("value", purposeOfCertificateArray);
//				jsonArray.put(propertiesObject35);
//			}}catch (Exception e) {
//			}
			String firebrigadeDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/fire-brigade-dashboard?fireBrigadeApplicationId=";
			firebrigadeDashboarUrl = firebrigadeDashboarUrl
					+ String.valueOf(submittedApplication.getFireBrigadeApplicationId());

			propertiesObject35.put("key", "JFBAF_DashboardURL");
			propertiesObject35.put("value", firebrigadeDashboarUrl);
			jsonArray.put(propertiesObject35);
			jsonObject.put("properties", jsonArray);
			_log.info("Request json--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in Fire Brigade************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in  Fire Brigade************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in  Fire Brigade************" + isBPMEnabled);
//			String objectStore=(String) themeDisplay.getScopeGroup().getExpandoBridge()
//					.getAttribute("object-store");
//			_log.info("*************Object Store Called in Fire Brigade************" + objectStore);
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"105",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in Fire Brigade************" + objectStoreValue);
			
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
					FireBrigadeApplication subAppli = null;
					try {
						subAppli = FireBrigadeApplicationLocalServiceUtil
								.getFireBrigadeApplication(fireBrigadeApplicationId);
					} catch (PortalException e1) {
					}
					subAppli.setCaseId(caseId);
					subAppli.setIcmDocumentsPath(path);
					subAppli.setStatus(FireBrigadeApplicationWorkflowConstant.SUBMITTED);
					FireBrigadeApplicationLocalServiceUtil.updateFireBrigadeApplication(subAppli);
					jsonOBJ.put("fireBrigadeAppNo", subAppli.getApplicationNumber());
					jsonOBJ.put("appStatus", FireBrigadeApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", subAppli.getTypeOfPermises());
					jsonOBJ.put("fireBrigadeAppicationId", subAppli.getFireBrigadeApplicationId());
					jsonFeed.put("APP_DATA", jsonOBJ);
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Fire Brigade Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(subAppli.getFireBrigadeApplicationId()));
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
							if (!allSupportingFolder.getName().equals("Signature")&&!allSupportingFolder.getName().equals("Fire Brigade Appliaction Form PDF")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						File pdfFile = null;
						try {
							String pdfTemplate = "";
							pdfTemplate = commonsUtil.replaceFireBirgadeApplicationPdfVar(subAppli.getFireBrigadeApplicationId(), themeDisplay,checkPdfDownloadWithoutDocument);
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"fire-brigade",pdfTemplate);
							filez.add(file);
						} catch (Exception e) {
							_log.error(e.getMessage());
						}
						// Sending Email After Form Submission
						try {

							String CategoryTypeUpperCase = subAppli.getTypeOfTransaction().toUpperCase();
							String subcategoryUpperCase = subAppli.getTypeOfApplicant().toUpperCase();
							String childcategoryUpperCase = subAppli.getTypeOfPermises().toUpperCase();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
												"[$Category$]", "[$subCategory$]", "[$childCategory$]",
												"[$transactionNo$]", "[$dashboardURL$]" },

										new String[] { themeDisplay.getUser().getFullName(), "Fire Brigade",
												"entityName", CategoryTypeUpperCase, subcategoryUpperCase,
												childcategoryUpperCase, subAppli.getApplicationNumber(),
												firebrigadeDashboarUrl });
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
									.post(launchCaseUrl + uploadFilesEndPoint + "?tos="+objectStoreValue).field("path", path)
									.field("files", supportingDocs).asString();
							_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
						}
					} catch (Exception e) {
					}
				}
			}
		} catch (IOException e) {
		} catch (UnirestException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (PortalException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		_log.info("submit application  ended--------------------------------");
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (java.io.IOException e) {
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