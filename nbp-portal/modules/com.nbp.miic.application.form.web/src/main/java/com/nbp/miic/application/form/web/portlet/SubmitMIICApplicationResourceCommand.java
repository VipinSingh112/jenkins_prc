	package com.nbp.miic.application.form.web.portlet;

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
import com.nbp.miic.application.form.services.model.MiicApplicantDetails;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;
import com.nbp.miic.application.form.services.model.MiicSafeguardMaterialAdd;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCetAdd;
import com.nbp.miic.application.form.services.service.MiicApplicantDetailsLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicApplicationLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSafeguardGoodAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSafeguardMaterialAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetAddLocalServiceUtil;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;
import com.nbp.miic.application.form.web.constants.MIICApplicationWorkflowConstant;

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

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
"mvc.command.name=/submit/miic/application" }, service = MVCResourceCommand.class)
public class SubmitMIICApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitMIICApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String miicAppilcation = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "miicApplciation"));
		String typeOfManufacturer = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfManufacturer"));
		String typeOfTransaction = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
		
		
		String checkPdfDownloadWithoutDocument="false";
		String entityId = (String) themeDisplay.getUser().getExpandoBridge()
				.getAttribute(MIICApplicationFormPortletKeys.ENTITY_ID);
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		MiicApplication application=null;
		if (miicApplicationId > 0) {
			try {
				application = MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
			} catch (PortalException e) {
			}
		} else {
			miicApplicationId = CounterLocalServiceUtil.increment(MiicApplication.class.getName());
			application = MiicApplicationLocalServiceUtil.createMiicApplication(miicApplicationId);
		}
		try {
			application.setMiicApplication(miicAppilcation);
			application.setTypeOfManufacturer(typeOfManufacturer);
			application.setTypeOfTransaction(typeOfTransaction);
			application.setEntityId((String) themeDisplay.getUser().getExpandoBridge()
					.getAttribute(MIICApplicationFormPortletKeys.ENTITY_ID));
			if (Validator.isNotNull(entityId)) {
				application.setEntityId(entityId);
			}
			application.setStatus(MIICApplicationWorkflowConstant.DRAFT);
			if (Validator.isNull(application.getApplicationNumber())) {
				_log.info("inside if--------------------------------");
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				application.setApplicationNumber(formatted + "/" + formattedDate);
			}
			MiicApplicationLocalServiceUtil.updateMiicApplication(application);
			MiicApplication submittedApplication = null;
			try {
				submittedApplication = MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
			} catch (PortalException e2) {
			}
			jsonOBJ.put("miicAppNo", submittedApplication.getApplicationNumber());
			jsonOBJ.put("appStatus", MIICApplicationWorkflowConstant.DRAFT_Label);
			jsonOBJ.put("category", submittedApplication.getMiicApplication());
			jsonOBJ.put("dashboardUrl", "/group/guest"+"/miic-dashboard?miicApplicationId="+submittedApplication.getMiicApplicationId());
			jsonOBJ.put("miicAppicationId", submittedApplication.getMiicApplicationId());
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
			JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject23 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject24 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject25 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject26 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject100 = new JSONFactoryUtil().createJSONObject();
			
			if(submittedApplication.getMiicApplication().equals("Suspension of CET")) {
			jsonObject.put("solutionType", "JBGMI_ApplicationforSuspensionofCETCertificate");
			}else if(submittedApplication.getMiicApplication().equals("Safeguard Certification")){
		     jsonObject.put("solutionType", "JBGMI_REQUESTFORTHEINVOKINGOFTHESAFEGUARDMECHANISM");
			}

			if(submittedApplication.getMiicApplication().equals("Suspension of CET")) {
			if (submittedApplication.getTypeOfManufacturer().equals("Registered Manufacturer")) {
				propertiesObject1.put("key", "JBGMI_TypeofManufacturer");
				propertiesObject1.put("value", "Registered");
			} else if (submittedApplication.getTypeOfManufacturer().equals("Unregistered Manufacturer")) {
				propertiesObject1.put("key", "JBGMI_TypeofManufacturer");
				propertiesObject1.put("value", "Unregistered");
			}else if(submittedApplication.getTypeOfManufacturer().equals("")){
				propertiesObject1.put("key", "JBGMI_TypeofManufacturer");
				propertiesObject1.put("value", "");
			}
			jsonArray.put(propertiesObject1);
		}
			
			if (submittedApplication.getTypeOfTransaction().equals("New")) {
				propertiesObject2.put("key", "JBGMI_TypeofTransaction");
				propertiesObject2.put("value", "New or");
			} else if (submittedApplication.getTypeOfTransaction().equals("Renewal")) {
				propertiesObject2.put("key", "JBGMI_TypeofTransaction");
				propertiesObject2.put("value", "Renewal");
			} else if (submittedApplication.getTypeOfTransaction().equals("")) {
				propertiesObject2.put("key", "JBGMI_TypeofTransaction");
				propertiesObject2.put("value", "");
			}
			jsonArray.put(propertiesObject2);

			MiicApplicantDetails applicantDetail=null;
			try {
				applicantDetail=MiicApplicantDetailsLocalServiceUtil.getMiicById(miicApplicationId);
			}catch (Exception e) {
				e.printStackTrace();
			}
			if(Validator.isNotNull(applicantDetail)) {
				
				propertiesObject3.put("key", "JBGMI_NatureofApplicant");
				if (applicantDetail.getNatureOfApplicant().equals("Individual")) {
					propertiesObject3.put("value", "Individual or");
				}else if (applicantDetail.getNatureOfApplicant().equals("Company")) {
					propertiesObject3.put("value", "Company");
				}else if (applicantDetail.getNatureOfApplicant().equals("")) {
					propertiesObject3.put("value", "");
				}
				jsonArray.put(propertiesObject3);
				
				
		if(applicantDetail.getNatureOfApplicant().equals("Individual")){
			propertiesObject4.put("key", "JBGMI_FirstName");
			propertiesObject4.put("value", applicantDetail.getFirstName());
			jsonArray.put(propertiesObject4);
			
			propertiesObject5.put("key", "JBGMI_LastName");
			propertiesObject5.put("value", applicantDetail.getLastName());
			jsonArray.put(propertiesObject5);
		}
		
		if(applicantDetail.getNatureOfApplicant().equals("Company")) {
			propertiesObject6.put("key", "JBGMI_CompanyName");
			propertiesObject6.put("value", applicantDetail.getCompanyName());
			jsonArray.put(propertiesObject6);
		}
		
		if(submittedApplication.getMiicApplication().equals("Suspension of CET")) {
			propertiesObject8.put("key", "JBGMI_ApplicantName");
			propertiesObject8.put("value", applicantDetail.getApplicantName());
			jsonArray.put(propertiesObject8);
		}
		
		if(submittedApplication.getMiicApplication().equals("Safeguard Certification")) {
			propertiesObject9.put("key", "JBGMI_ApplicantName");
			propertiesObject9.put("value", applicantDetail.getNameOfProducer());
			jsonArray.put(propertiesObject9);
		}
		
		propertiesObject10.put("key", "JBGMI_ApplicantAddress");
		propertiesObject10.put("value", applicantDetail.getAddress());
		jsonArray.put(propertiesObject10);
		
		propertiesObject11.put("key", "JBGMI_EmailAddress");
		propertiesObject11.put("value", applicantDetail.getEmail());
		jsonArray.put(propertiesObject11);
		
		propertiesObject12.put("key", "JBGMI_Telephone");
		propertiesObject12.put("value", applicantDetail.getTelephone());
		jsonArray.put(propertiesObject12);
		
		if(Validator.isNotNull(applicantDetail.getDateOfApplication())){
		propertiesObject13.put("key", "JBGMI_DateofApplication");
		propertiesObject13.put("value",bpmDateFormat.format(applicantDetail.getDateOfApplication()));
		jsonArray.put(propertiesObject13);
		}
		
		propertiesObject14.put("key", "JBGMI_TRN");
		propertiesObject14.put("value", applicantDetail.getTrnNumber());
		jsonArray.put(propertiesObject14);
}
			
		if(submittedApplication.getMiicApplication().equals("Suspension of CET")) {
		List<MiicSuspensionOfCetAdd> suspensionOfCet=null;
		try {
			suspensionOfCet=MiicSuspensionOfCetAddLocalServiceUtil.getMiicById(miicApplicationId);	
			System.out.println("suspension------"+suspensionOfCet);
		}catch (Exception e) {
		}
		if(Validator.isNotNull(suspensionOfCet)) {
			JSONObject suspensionOfCetJsonObj = new JSONFactoryUtil().createJSONObject();
			suspensionOfCetJsonObj.put("key", "JBGMI_GoodsToBeImported");
			JSONObject suspensionOfCetValueJsonObj = new JSONFactoryUtil().createJSONObject();
			JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
			if (suspensionOfCet != null) {
				for (MiicSuspensionOfCetAdd suspensionOfCets : suspensionOfCet) {
					System.out.println("suspension------BO"+suspensionOfCets);
					JSONObject propertiesObject15 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject16 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject17 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject18 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject19 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject20 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject21 = new JSONFactoryUtil().createJSONObject();
					JSONObject propertiesObject22 = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
					JSONObject factoryPlantAddressListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
					propertiesObject15.put("name", "JBGMI_TariffHeadingNo");
					propertiesObject15.put("value", suspensionOfCets.getTariffHeadingNum());
					jsonArrayProp.put(propertiesObject15);
					
					propertiesObject16.put("name", "JBGMI_GoodsDescription");
					propertiesObject16.put("value", suspensionOfCets.getDescription());
					jsonArrayProp.put(propertiesObject16);
					
					propertiesObject17.put("name", "JBGMI_Qty");
					propertiesObject17.put("value", suspensionOfCets.getAmountQuantity());
					jsonArrayProp.put(propertiesObject17);
					
					propertiesObject18.put("name", "JBGMI_ESTVALUEUS");
					propertiesObject18.put("value", suspensionOfCets.getAmountEstimateInUs());
					jsonArrayProp.put(propertiesObject18);
					
					propertiesObject19.put("name", "JBGMI_TechSpecs");
					propertiesObject19.put("value", suspensionOfCets.getTechnologySpecification());
					jsonArrayProp.put(propertiesObject19);
					
					propertiesObject20.put("name", "JBGMI_CetRate");
					propertiesObject20.put("value", suspensionOfCets.getCetRate());
					jsonArrayProp.put(propertiesObject20);
					
					propertiesObject21.put("name", "JBGMI_RateProposed");
					propertiesObject21.put("value", suspensionOfCets.getRateProposed());
					jsonArrayProp.put(propertiesObject21);
					
					if(Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeFrom())){
					propertiesObject22.put("name", "JBGMI_fromPeriod");
					propertiesObject22.put("value", bpmDateFormat.format(suspensionOfCets.getPeriodOfRateChangeFrom()));
					jsonArrayProp.put(propertiesObject22);
					}
					
					if(Validator.isNotNull(suspensionOfCets.getPeriodOfRateChangeTo())){
					propertiesObject40.put("name", "JBGMI_toPeriod");
					propertiesObject40.put("value", bpmDateFormat.format(suspensionOfCets.getPeriodOfRateChangeTo()));
					jsonArrayProp.put(propertiesObject40);
					}
					
					factoryPlantAddressListObjectValueJsonObject.put("properties", jsonArrayProp);
					jsonArrayObjects.put(factoryPlantAddressListObjectValueJsonObject);
				}
				suspensionOfCetValueJsonObj.put("objects", jsonArrayObjects);
			}
			suspensionOfCetJsonObj.put("value", suspensionOfCetValueJsonObj);
			System.out.println("suspension of cet----"+suspensionOfCetJsonObj);
			jsonArray.put(suspensionOfCetJsonObj);
			} 
		
		MiicSuspensionOfCet SusOfCet=null;
		try {
			SusOfCet=	MiicSuspensionOfCetLocalServiceUtil.getMiicById(miicApplicationId);
		}catch (Exception e) {
		}
		if(Validator.isNotNull(SusOfCet)) {
			propertiesObject23.put("name", "JBGMI_IndicationofUrgency");
			propertiesObject23.put("value", SusOfCet.getIndicationOfUrgency());
					/* jsonArray.put(propertiesObject23); */
			
			propertiesObject24.put("name", "JBGMI_ReasonForRequestForSuspensionOfRate");
			if(SusOfCet.getRequestForSuspension().contains("Not being produced regionally")) {
				propertiesObject24.put("value", "Not being produced regionally");
			}
			else if(SusOfCet.getRequestForSuspension().contains("Does not satisfy demand")) {
				propertiesObject24.put("value", "Does not satisfy demand");
			}
			else if(SusOfCet.getRequestForSuspension().contains("Quality below regional standard")) {
				propertiesObject24.put("value", "Quality below regional standard");
			}
			else if(SusOfCet.getRequestForSuspension().contains("")) {
				propertiesObject24.put("value", "");
			}
					/* jsonArray.put(propertiesObject24); */
			
			propertiesObject25.put("key", "JBGMI_EvidenceOfInabilityToSupply");
			String info = SusOfCet.getEvidenceOfInability();
				if (info.contains("Unfulfilled Orders")) {
				
					propertiesObject25.put("value","Unfulfilled Orders");
				} else if (info.contains("Transportation Logistics")) {
					propertiesObject25.put("value","Transportation Logistics");
				} else if (info.contains("Efforts made to obtain regional supplies")) {
					propertiesObject25.put("value","Efforts made to obtain regional supplies");
				}else if (info.contains("")) {
					propertiesObject25.put("value","");
				}
//			jsonArray.put(propertiesObject25);
			
			String infos= SusOfCet.getEvidenceOfConsultation();
				if (infos.contains("Local")) {
					propertiesObject26.put("value","LOCAL");
				} else if (infos.contains("Regional")) {
					propertiesObject26.put("value","REGIONAL");
				}else if (infos.contains("")) {
					propertiesObject26.put("value","");
				}
			propertiesObject26.put("key", "JBGMI_EvidenceOfConsultation");
//			jsonArray.put(propertiesObject26);
		}
	}
		if(submittedApplication.getMiicApplication().equals("Safeguard Certification")){
		List<MiicSafeguardMaterialAdd> safeguardMaterial=null;
		try {
			safeguardMaterial=MiicSafeguardMaterialAddLocalServiceUtil.getMiicById(miicApplicationId);	
		}catch (Exception e) {
		}
		if(Validator.isNotNull(safeguardMaterial)) {
		JSONObject miicSafeguardMaterialJsonObj = new JSONFactoryUtil().createJSONObject();
		miicSafeguardMaterialJsonObj.put("key", "JBGMI_GoodsToBeImported");
		JSONObject miicSafeguardMateriValueJsonObj = new JSONFactoryUtil().createJSONObject();
		JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
		if (safeguardMaterial != null) {
			for (MiicSafeguardMaterialAdd listValues : safeguardMaterial) {
				JSONObject propertiesObject27 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject28 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject29 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject30 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject31 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject32 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject33 = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
				JSONObject factoryPlantAddressListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
				propertiesObject27.put("name", "JBGMI_GoodsDescription");
				propertiesObject27.put("value", listValues.getDescription());
				jsonArrayProp.put(propertiesObject27);
				
				propertiesObject28.put("name", "JBGMI_TariffHeadingNo");
				propertiesObject28.put("value", listValues.getTariffHeadingNum());
				jsonArrayProp.put(propertiesObject28);
				
				propertiesObject29.put("name", "JBGMI_Amount");
				propertiesObject29.put("value", listValues.getAmount());
				jsonArrayProp.put(propertiesObject29);
				
				propertiesObject30.put("name", "JBGMI_Qty");
				propertiesObject30.put("value", listValues.getQuantity());
				jsonArrayProp.put(propertiesObject30);
				
				propertiesObject31.put("name", "JBGMI_TechSpecs");
				propertiesObject31.put("value", listValues.getTechnologySpecification());
				jsonArrayProp.put(propertiesObject31);
				
				if(Validator.isNotNull(listValues.getPeriodOfImportationFrom())){
				propertiesObject32.put("name", "JBGMI_fromPeriod");
				propertiesObject32.put("value",bpmDateFormat.format(listValues.getPeriodOfImportationFrom()));
				jsonArrayProp.put(propertiesObject32);
				}	
				
				if(Validator.isNotNull(listValues.getPeriodOfImportationTo())){
				propertiesObject33.put("name", "JBGMI_toPeriod");
				propertiesObject33.put("value", bpmDateFormat.format(listValues.getPeriodOfImportationTo()));
				jsonArrayProp.put(propertiesObject33);
				}

				factoryPlantAddressListObjectValueJsonObject.put("properties", jsonArrayProp);
				jsonArrayObjects.put(factoryPlantAddressListObjectValueJsonObject);
			}
			miicSafeguardMateriValueJsonObj.put("objects", jsonArrayObjects);
		}
		miicSafeguardMaterialJsonObj.put("value", miicSafeguardMateriValueJsonObj);
		jsonArray.put(miicSafeguardMaterialJsonObj);
}
			
		List<MiicSafeguardGoodAdd> safeguardGood=null;
		try {
			safeguardGood=MiicSafeguardGoodAddLocalServiceUtil.getMiicById(miicApplicationId);	
		}catch (Exception e) {
		}
		if(Validator.isNotNull(safeguardGood)) {
		JSONObject miicSafeguardGoodJsonObj = new JSONFactoryUtil().createJSONObject();
		miicSafeguardGoodJsonObj.put("key", "JBGMI_Goodstobeproduced");
		JSONObject miicSafeguardGoodValueJsonObj = new JSONFactoryUtil().createJSONObject();
		JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
		if (safeguardGood != null) {
			for (MiicSafeguardGoodAdd listValues : safeguardGood) {
				JSONObject propertiesObject34 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject35 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject36 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
				JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
				JSONObject factoryPlantAddressListObjectValueJsonObject = new JSONFactoryUtil().createJSONObject();
				propertiesObject34.put("name", "JBGMI_TariffHeadingNo");
				propertiesObject34.put("value", listValues.getTariffHeadingNum());
				jsonArrayProp.put(propertiesObject34);
				
				propertiesObject35.put("name", "JBGMI_GoodsDescription");
				propertiesObject35.put("value", listValues.getDescription());
				jsonArrayProp.put(propertiesObject35);
				
				propertiesObject36.put("name", "JBGMI_Qty");
				propertiesObject36.put("value", listValues.getAmountQuantity());
				jsonArrayProp.put(propertiesObject36);
				
				propertiesObject37.put("name", "JBGMI_ESTVALUEUS");
				propertiesObject37.put("value", listValues.getAmountEstimate());
				jsonArrayProp.put(propertiesObject37);
				
				propertiesObject38.put("name", "JBGMI_ReasonforRequestfortheinvokingoftheSafeguardMechanism");
				propertiesObject38.put("value", listValues.getResonForRequest());
				jsonArrayProp.put(propertiesObject38);
				
				factoryPlantAddressListObjectValueJsonObject.put("properties", jsonArrayProp);
				jsonArrayObjects.put(factoryPlantAddressListObjectValueJsonObject);
			}
			miicSafeguardGoodValueJsonObj.put("objects", jsonArrayObjects);
		}
		miicSafeguardGoodJsonObj.put("value", miicSafeguardGoodValueJsonObj);
		jsonArray.put(miicSafeguardGoodJsonObj);
     }
}		
		
		    propertiesObject100.put("key", "JBGMI_TransactionNumber");
			propertiesObject100.put("value", submittedApplication.getApplicationNumber());
			jsonArray.put(propertiesObject100);
		
			String miicDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"+"/miic-dashboard?miicApplicationId=";
			miicDashboarUrl = miicDashboarUrl+ String.valueOf(submittedApplication.getMiicApplicationId());

			propertiesObject39.put("key", "JBGMI_dashboardUrl");
			propertiesObject39.put("value", miicDashboarUrl);
			jsonArray.put(propertiesObject39);
			
			jsonObject.put("properties", jsonArray);
			_log.info("Request json--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in MIIC************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in MIIC************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in MIIC************" + isBPMEnabled);
//			String objectStore=(String) themeDisplay.getScopeGroup().getExpandoBridge()
//					.getAttribute("object-store");
//			_log.info("*************Object Store Called in MIIC************" + objectStore);
			
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"103",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in MIIC************" + objectStoreValue);
			
			
			
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
					MiicApplication subMiicApplication = null;
					try {
						subMiicApplication = MiicApplicationLocalServiceUtil.getMiicApplication(miicApplicationId);
					} catch (PortalException e1) {
					}
					subMiicApplication.setCaseId(caseId);
					subMiicApplication.setIcmDocumentPath(path);
					subMiicApplication.setStatus(MIICApplicationWorkflowConstant.SUBMITTED);
					MiicApplicationLocalServiceUtil.updateMiicApplication(subMiicApplication);
					
					jsonOBJ.put("miicAppNo", subMiicApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", MIICApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", subMiicApplication.getMiicApplication());
					jsonOBJ.put("miicAppicationId", subMiicApplication.getMiicApplicationId());
					jsonOBJ.put("dashboardUrl", miicDashboarUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"Miic Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(subMiicApplication.getMiicApplicationId()));
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
					if(!allSupportingFolder.getName().equals("Signature") && !allSupportingFolder.getName().equals("MIIC Form PDF")) {
						specificFolder=DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
						fileEntries= DLFileEntryLocalServiceUtil
								.getFileEntries(themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
						for(DLFileEntry dlfile :fileEntries  ) {
							filez.add(generateFileByInputStream(dlfile));
					}}}
					File pdfFile = null;
					try {
						String pdfTemplate = "";
						pdfTemplate = commonsUtil.replaceMIICApplicationPdfVar(subMiicApplication.getMiicApplication(), subMiicApplication.getMiicApplicationId(), themeDisplay,checkPdfDownloadWithoutDocument);
						if (application.getMiicApplication().equals("Suspension of CET")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"suspension-of-cet-1",pdfTemplate);
						filez.add(file);
						}
						
						else if(application.getMiicApplication().equals("Safeguard Certification")) {
							File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"safeguard-mechanism-1",pdfTemplate);
							filez.add(file);
						}
					} catch (Exception e) {
						_log.error(e.getMessage());
					}
					 //Sending Email After Form Submission
    				try {
    					
    					  String CategoryTypeUpperCase=subMiicApplication.getMiicApplication().toUpperCase();
    					  String subcategoryUpperCase=subMiicApplication.getTypeOfManufacturer().toUpperCase();
    					  String childcategoryUpperCase=subMiicApplication.getTypeOfTransaction().toUpperCase();
    				String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),"successful-application-submission-email-template");
    						if (Validator.isNotNull(body)) {
    					body = StringUtil.replace(body,
    							new String[] { "[$username$]","[$applicationName$]", "[$entityName$]", "[$Category$]","[$subCategory$]" ,"[$childCategory$]","[$transactionNo$]", "[$dashboardURL$]"},
    							
    							new String[] { themeDisplay.getUser().getFullName(),"MIIC","entityName",CategoryTypeUpperCase,subcategoryUpperCase,childcategoryUpperCase,submittedApplication.getApplicationNumber(),
    									miicDashboarUrl});
    						}	
    					 commonsUtil.sendMailToUsers("Your Application Submitted",
    							"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(), body);
    					 _log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());
 			}catch(Exception e) 
    				{
				_log.error("An Error Has Occured", e);
    			}
    				
					String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("upload-files-api-endpoint");
					_log.info("path--------------" + path);
					for (File supportingDocs : filez) {
						HttpResponse<String> documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+ "?tos="+objectStoreValue)
								.field("path", path).field("files", supportingDocs).asString();
						_log.info("document service resonse ----------------" + documentUploadresponse.getCode());}}catch (Exception e) {
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