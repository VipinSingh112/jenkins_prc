package com.nbp.hsra.application.launch.api.util;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.QualityApplicantDetail;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.model.QualityProficiencyDetail;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.service.BrokerRegistrationInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityApplicantDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil;
import com.nbp.hsra.application.service.service.QualityProficiencyDetailLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;
import com.nbp.hsra.application.service.service.RadiationSafetyProgramLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HSRALaunchCase {
	private static DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	private static Log _log = LogFactoryUtil.getLog(HSRALaunchCase.class);

	public static void launchCaseForUserRadiation(JSONArray launchCasePropertiesArray,
			HsraApplication hsraApplication) {
		_log.info("[USER RADIATION-PROPERTY----MAPPING STARTRD]");
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
			try {

				JSONObject highJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONObject objectField = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject = new JSONFactoryUtil().createJSONObject();
				JSONArray objectArray = new JSONFactoryUtil().createJSONArray();
				JSONArray propertiesArray = new JSONFactoryUtil().createJSONArray();
				if (Validator.isNotNull(hsraApplication.getHighOne())) {
					String[] highOne = hsraApplication.getHighOne().split(",");
					for (String listValues : highOne) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category1");
						propertiesObject1.put("value", "1");
						propertiesArray.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice1");
						propertiesObject2.put("value", listValues);
						propertiesArray.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD1");
						propertiesObject3.put("value", "A/D ≥ 1000 or Personally extremely dangerous");
						propertiesArray.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk1");
						propertiesObject4.put("value", "High");
						propertiesArray.put(propertiesObject4);
						propertiesObject.put("properties", propertiesArray);

					}
					objectArray.put(propertiesObject);
					objectField.put("object", objectArray);
					highJsonObj.put("value", objectField);
					highJsonObj.put("key", "POHSR_Category1BO");
				}
			} catch (Exception e) {
			}

			try {

				JSONObject highJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONObject objectField = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject = new JSONFactoryUtil().createJSONObject();
				JSONArray objectArray = new JSONFactoryUtil().createJSONArray();
				JSONArray propertiesArray = new JSONFactoryUtil().createJSONArray();
				if (Validator.isNotNull(hsraApplication.getHighTwo())) {
					String[] hightwW = hsraApplication.getHighTwo().split(",");
					for (String listValues : hightwW) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category2");
						propertiesObject1.put("value", "2");
						propertiesArray.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice2");
						propertiesObject2.put("value", listValues);
						propertiesArray.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD2");
						propertiesObject3.put("value", "1000 > A/D≥ 10 or Personally very dangerous");
						propertiesArray.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk2");
						propertiesObject4.put("value", "High");
						propertiesArray.put(propertiesObject4);
						propertiesObject.put("properties", propertiesArray);

					}
					objectArray.put(propertiesObject);
					objectField.put("object", objectArray);
					highJsonObj.put("value", objectField);
					highJsonObj.put("key", "POHSR_Category2BO");
				}
			} catch (Exception e) {
			}

			try {

				JSONObject highJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONObject objectField = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject = new JSONFactoryUtil().createJSONObject();
				JSONArray objectArray = new JSONFactoryUtil().createJSONArray();
				JSONArray propertiesArray = new JSONFactoryUtil().createJSONArray();
				if (Validator.isNotNull(hsraApplication.getMedium())) {
					String[] medium = hsraApplication.getMedium().split(",");
					for (String listValues : medium) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category3");
						propertiesObject1.put("value", "3");
						propertiesArray.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice3");
						propertiesObject2.put("value", listValues);
						propertiesArray.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD3");
						propertiesObject3.put("value", "10 >A/D≥ 1 or Personally dangerous");
						propertiesArray.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk3");
						propertiesObject4.put("value", "Medium");
						propertiesArray.put(propertiesObject4);
						propertiesObject.put("properties", propertiesArray);

					}
					objectArray.put(propertiesObject);
					objectField.put("object", objectArray);
					highJsonObj.put("value", objectField);
					highJsonObj.put("key", "POHSR_Category3BO");
				}
			} catch (Exception e) {
			}

			try {

				JSONObject highJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONObject objectField = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject = new JSONFactoryUtil().createJSONObject();
				JSONArray objectArray = new JSONFactoryUtil().createJSONArray();
				JSONArray propertiesArray = new JSONFactoryUtil().createJSONArray();
				if (Validator.isNotNull(hsraApplication.getLowOne())) {
					String[] low = hsraApplication.getLowOne().split(",");
					for (String listValues : low) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category4");
						propertiesObject1.put("value", "4");
						propertiesArray.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice4");
						propertiesObject2.put("value", listValues);
						propertiesArray.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD4");
						propertiesObject3.put("value", "1 >A/D≥ 0.01 or Unlikely to be dangerous");
						propertiesArray.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk4");
						propertiesObject4.put("value", "Low");
						propertiesArray.put(propertiesObject4);
						propertiesObject.put("properties", propertiesArray);

					}
					objectArray.put(propertiesObject);
					objectField.put("object", objectArray);
					highJsonObj.put("value", objectField);
					highJsonObj.put("key", "POHSR_Category4BO");
				}
			} catch (Exception e) {
			}

			try {

				JSONObject highJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONObject objectField = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject = new JSONFactoryUtil().createJSONObject();
				JSONArray objectArray = new JSONFactoryUtil().createJSONArray();
				JSONArray propertiesArray = new JSONFactoryUtil().createJSONArray();
				if (Validator.isNotNull(hsraApplication.getLowTwo())) {
					String[] low2 = hsraApplication.getLowTwo().split(",");
					for (String listValues : low2) {
						JSONObject propertiesObject1 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject2 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject3 = new JSONFactoryUtil().createJSONObject();
						JSONObject propertiesObject4 = new JSONFactoryUtil().createJSONObject();
						propertiesObject1.put("name", "POHSR_Category5");
						propertiesObject1.put("value", "5");
						propertiesArray.put(propertiesObject1);

						propertiesObject2.put("name", "POHSR_SourceandPractice5");
						propertiesObject2.put("value", listValues);
						propertiesArray.put(propertiesObject2);

						propertiesObject3.put("name", "POHSR_ActivityRatioAD5");
						propertiesObject3.put("value", "0.01 >and A≥ exempt or Not dangerous");
						propertiesArray.put(propertiesObject3);
						propertiesObject4.put("name", "POHSR_Risk5");
						propertiesObject4.put("value", "Low");
						propertiesArray.put(propertiesObject4);
						propertiesObject.put("properties", propertiesArray);

					}
					objectArray.put(propertiesObject);
					objectField.put("object", objectArray);
					highJsonObj.put("value", objectField);
					highJsonObj.put("key", "POHSR_Category5BO");
				}
			} catch (Exception e) {
			}

		}
		JSONArray activityArray = JSONFactoryUtil.createJSONArray();
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfActivities())) {
			String[] forStrings = hsraApplication.getTypeOfActivities().split(",");
			for (String string : forStrings) {
				if (string.equals("")) {
						
				} else if (string.equals("")) {

				} else if (string.equals("")) {

				} else if (string.equals("")) {

				} else if (string.equals("")) {

				} else if (string.equals("")) {

				} else if (string.equals("")) {

				}
			}
		}

		typeofActivityObj.put("key", "POHSR_TypeofActivity");
		typeofActivityObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfActivities())
						? hsraApplication.getTypeOfActivities()
						: "");
		activityArray.put(activityArray);
		launchCasePropertiesArray.put(activityArray);
		typeofApplicationObj.put("key", "POHSR_TypeofApplication");
		typeofApplicationObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfActivities())
						? hsraApplication.getTypeOfActivities()
						: "");
		launchCasePropertiesArray.put(typeofApplicationObj);

		typeofTransactionObj.put("key", "POHSR_TypeofTransaction");
		typeofTransactionObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getTypeOfTransaction())
						? hsraApplication.getTypeOfTransaction()
						: "");
		launchCasePropertiesArray.put(typeofTransactionObj);
		String specific = "";
		if (Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getSpecificApplicable())) {
			String[] split = hsraApplication.getSpecificApplicable().split(",");
			for (String string : split) {
				if (string.equals("(a)Medical Practices")) {
					specific = "(a)Medical Practices";
				} else if (string.equals("(b)Industrial Radiography")) {
					specific = "(b)Industrial Radiography";
				} else if (string.equals("(c)Veterinary Nuclear Medicine")) {
					specific = "(c)Veterinary Nuclear Medicine";
				} else if (string.equals("(d)Other Industries that use Nuclear Material")) {
					specific = "(d)Other Industries that use Nuclear Material";
				} else if (string.equals("(e)Gauges (Fixed &amp; Portable)")) {
					specific = "(e)Gauges (Fixed & Portable)";
				} else if (string.equals("(f)Petroleum Exploration (Well Logging)")) {
					specific = "(f)Petroleum Exploration (Well Logging)";
				} else if (string.equals("(g)Servicing")) {
					specific = "(g)Servicing";
				} else if (string.equals("(h)Manufacturing")) {
					specific = "(h)Manufacturing";
				}
			}
		}
		licenceRegistrationPracticesActivityObj.put("key", "POHSR_LicenceRegistrationPracticesActivity");
		licenceRegistrationPracticesActivityObj.put("value",
				Validator.isNotNull(hsraApplication) && Validator.isNotNull(hsraApplication.getSpecificApplicable())
						? hsraApplication.getSpecificApplicable()
						: "");
		launchCasePropertiesArray.put(licenceRegistrationPracticesActivityObj);
		// For radiation protection section 1
		RadiationProtectionSecOne radSectionOne = null;
		try {
			radSectionOne = RadiationProtectionSecOneLocalServiceUtil
					.getHsraById(hsraApplication.getHsraApplicationId());
		} catch (Exception e) {
		}
		caseProperty1.put("key", "POHSR_TypeofApplicant");
		caseProperty1.put("value",
				Validator.isNotNull(radSectionOne) && Validator.isNotNull(radSectionOne.getTypeOfApplication())
						? radSectionOne.getTypeOfApplication()
						: "");
		launchCasePropertiesArray.put(caseProperty1);
		caseProperty2.put("key", "POHSR_Authorization");
		caseProperty2.put("value",
				Validator.isNotNull(radSectionOne) && Validator.isNotNull(radSectionOne.getTypeOfApplication())
						? radSectionOne.getTypeOfApplication()
						: "");
		launchCasePropertiesArray.put(caseProperty2);
		caseProperty3.put("key", "POHSR_Authorization");
		caseProperty3.put("value",
				Validator.isNotNull(radSectionOne) && Validator.isNotNull(radSectionOne.getTypeOfApplication())
						? radSectionOne.getTypeOfApplication()
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
		caseProperty11.put("key", "POHSR_BusinessNumber");
		caseProperty11.put("value",
				Validator.isNotNull(detailOfBusiness) && Validator.isNotNull(detailOfBusiness.getBusinessType())
						? detailOfBusiness.getBusinessType()
						: "");
		launchCasePropertiesArray.put(caseProperty11);
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
		launchCasePropertiesArray.put(caseProperty14);
		caseProperty15.put("key", "POHSR_ForPublicInstitutionsspecifytheenablinglegislationAct");
		caseProperty15.put("value",
				Validator.isNotNull(detailOfBusiness) && Validator.isNotNull(detailOfBusiness.getNuclearPublicAct())
						? detailOfBusiness.getNuclearPublicAct()
						: "");
		launchCasePropertiesArray.put(caseProperty15);
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
		launchCasePropertiesArray.put(caseProperty16);
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
		} catch (Exception e) {
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
	}

}
