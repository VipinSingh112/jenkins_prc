package com.nbp.wra.application.form.web.portlet;

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
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;
import com.nbp.wra.application.form.service.model.LicenceToWellDriller;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.service.LicenceToAbstractInfoLocalServiceUtil;
import com.nbp.wra.application.form.service.service.LicenceToWellDrillerLocalServiceUtil;
import com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil;
import com.nbp.wra.application.form.service.service.RenewLicAbstractAndWaterLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAAppPaymentLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAApplicationLocalServiceUtil;
import com.nbp.wra.application.form.service.service.WRAReqIrrigationLocalServiceUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

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
		"javax.portlet.name="  + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
		"mvc.command.name=/submit/Wra/Application/Url" }, service = MVCResourceCommand.class)
public class SubmitApplicationResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(SubmitApplicationResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[WRA APPLICATION Submitted START]");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long wraApplicationId = ParamUtil.getLong(resourceRequest, "wraApplicationId");
		String typeOfTransaction=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		String typeOfPermit=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfPermit"));
		String typeOfTransationPermit=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransationPermit"));
		String userWaterTypeCategories=ParamUtil.getString(resourceRequest, "userWaterTypeCategories");
		String consumptiveSubCategories=ParamUtil.getString(resourceRequest, "consumptiveSubCategories");
		String industrialTypeSubCategories=ParamUtil.getString(resourceRequest, "industrialTypeSubCategories");
		String nonConsumptiveSubCategories=ParamUtil.getString(resourceRequest, "nonConsumptiveSubCategories");
		String typeOfApplication=HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfApplication"));
		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		String checkPdfDownloadWithoutDocument ="false";
		WRAApplication application=null;
		try {
			application=WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(application==null) {
			application=WRAApplicationLocalServiceUtil.createWRAApplication(CounterLocalServiceUtil.increment(SubmitApplicationResourceCommand.class.getName()));
					
		}
		if (Validator.isNull(application.getApplicationNumber())) {
			  DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			  String formattedDate = df.format(Calendar.getInstance().getTime());
			  SecureRandom random = new SecureRandom(); int num = random.nextInt(100000);
			  String formatted = String.format("%05d", num);
			  application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(WRAApplicationFormPortletKeys.DRAFT);
		application.setTypeOfApplication(typeOfApplication);
		application.setTypeOfPermit(typeOfPermit);
		application.setTypeOfTransaction(typeOfTransaction);
		application.setTypeOfTransacPermit(typeOfTransationPermit);
		application.setUserWaterTypeCat(userWaterTypeCategories);
		application.setConsumptiveSubCat(consumptiveSubCategories);
		application.setNonConsumptiveSubCat(nonConsumptiveSubCategories);
		application.setIndustrialTypeSubCat(industrialTypeSubCategories);
		WRAApplicationLocalServiceUtil.updateWRAApplication(application);
		

		WRAApplication submittedApplication=null;
		jsonOBJ.put("wraApplicationId", application.getWraApplicationId());
		jsonOBJ.put("wraAppNo", application.getApplicationNumber());
		jsonOBJ.put("category", application.getTypeOfApplication());
		jsonOBJ.put("appStatus", WRAApplicationFormPortletKeys.DRAFT_Label);
		jsonOBJ.put("wraApplicationId", application.getWraApplicationId());
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
			JSONObject propertiesObject57 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject58 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject59 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject60 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject61 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject62 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject63 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject64 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject65 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject66 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject67 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject68 = new JSONFactoryUtil().createJSONObject();
			
			JSONObject propertiesObject69 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject70 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject71 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject72 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject73 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject74 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject75 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject76 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject77 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject78 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject79 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject80 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject81 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject82 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject83 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject84 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject85 = new JSONFactoryUtil().createJSONObject();
			JSONObject propertiesObject86 = new JSONFactoryUtil().createJSONObject();
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			
			submittedApplication= WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
			System.out.println("submittedApplication.get--------------"+submittedApplication.getTypeOfApplication());
			
			jsonObject.put("solutionType", "POAFW_ProcessingofApplicationsforWRALicences");
			if(Validator.isNotNull(submittedApplication.getTypeOfApplication())) {
				if (submittedApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water")) {
					propertiesObject8.put("value", "Application for a Licence to Abstract & Use Water");
					propertiesObject8.put("key", "POAFW_TypeofApplication");
					jsonArray.put(propertiesObject8);
				} else if (submittedApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
					propertiesObject8.put("value", "Application for a Permit to Drill a Well");
					propertiesObject8.put("key", "POAFW_TypeofApplication");
					jsonArray.put(propertiesObject8);
				} else if (submittedApplication.getTypeOfApplication().equals("Application for a Well Drillers Licence")) {
					propertiesObject8.put("value", "Application for a Well Drillers Licence");
					propertiesObject8.put("key", "POAFW_TypeofApplication");
					jsonArray.put(propertiesObject8);
				}
			}
			if(Validator.isNotNull(submittedApplication.getTypeOfTransaction())) {
				if (submittedApplication.getTypeOfTransaction().equals("New Licence")) {
					propertiesObject9.put("value", "New");
					propertiesObject9.put("key", "POAFW_TypeofTransaction");
					jsonArray.put(propertiesObject9);
				} else if (submittedApplication.getTypeOfTransaction().equals("Licence Renewal")) {
					propertiesObject9.put("value", "Licence Renewal");
					propertiesObject9.put("key", "POAFW_TypeofTransaction");
					jsonArray.put(propertiesObject9);
				}
			}
			//Licence abstract user
			if(Validator.isNotNull(submittedApplication.getUserWaterTypeCat())) {
				if (submittedApplication.getUserWaterTypeCat().equals("Consumptive")) {
					propertiesObject10.put("value", "Consumptive");
					propertiesObject10.put("key", "POAFW_PurposeUseofWater");
					jsonArray.put(propertiesObject10);
				} else if (submittedApplication.getUserWaterTypeCat().equals("Non-Consumptive")) {
					propertiesObject10.put("value", "Non-Consumptive");
					propertiesObject10.put("key", "POAFW_PurposeUseofWater");
					jsonArray.put(propertiesObject10);
				}
			}
			if(Validator.isNotNull(submittedApplication.getConsumptiveSubCat())) {
				if (submittedApplication.getConsumptiveSubCat().equals("Industrial")) {
					propertiesObject11.put("value", "Industrial");
					propertiesObject11.put("key", "POAFW_SubcategoriesofConsumptive");
					jsonArray.put(propertiesObject11);
				} else if (submittedApplication.getConsumptiveSubCat().equals("Domestic")) {
					propertiesObject11.put("value", "Domestic");
					propertiesObject11.put("key", "POAFW_SubcategoriesofConsumptive");
					jsonArray.put(propertiesObject11);
				} else if (submittedApplication.getConsumptiveSubCat().equals("Agriculture")) {
					propertiesObject11.put("value", "Agriculture");
					propertiesObject11.put("key", "POAFW_SubcategoriesofConsumptive");
					jsonArray.put(propertiesObject11);
				}
			}
			if(Validator.isNotNull(submittedApplication.getConsumptiveSubCat().equals("Industrial"))) {
				if (submittedApplication.getIndustrialTypeSubCat().equals("Commercial")) {
					propertiesObject12.put("value", "Commercial");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Aggregate Washing")) {
					propertiesObject12.put("value", "Aggregate Washing");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Manufacturing")) {
					propertiesObject12.put("value", "Manufacturing");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Bottling")) {
					propertiesObject12.put("value", "Bottling");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Cooling")) {
					propertiesObject12.put("value", "Cooling");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Tourism")) {
					propertiesObject12.put("value", "Tourism");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Other")) {
					propertiesObject12.put("value", "Other");
					propertiesObject12.put("key", "POAFW_SubcategoriesofUseofWaterforIndustrialCategory");
					jsonArray.put(propertiesObject12);
				}
			}else if(Validator.isNotNull(submittedApplication.getConsumptiveSubCat().equals("Domestic"))) {
				if (submittedApplication.getIndustrialTypeSubCat().equals("Public Supply")) {
					propertiesObject13.put("value", "Public Supply");
					propertiesObject13.put("key", "POAFW_SubcategoriesofUseofWaterforDomesticCategory");
					jsonArray.put(propertiesObject13);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Residential Water Supply")) {
					propertiesObject13.put("value", "Residential Water Supply");
					propertiesObject13.put("key", "POAFW_SubcategoriesofUseofWaterforDomesticCategory");
					jsonArray.put(propertiesObject13);
				}
			}else if(Validator.isNotNull(submittedApplication.getConsumptiveSubCat().equals("Agriculture"))) {
				if (submittedApplication.getIndustrialTypeSubCat().equals("Irrigation Crops")) {
					propertiesObject14.put("value", "Irrigation Crops");
					propertiesObject14.put("key", "POAFW_SubcategoriesofUseofWaterforAgricultureCategory");
					jsonArray.put(propertiesObject14);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Cattle Rearing")) {
					propertiesObject14.put("value", "Cattle Rearing");
					propertiesObject14.put("key", "POAFW_SubcategoriesofUseofWaterforAgricultureCategory");
					jsonArray.put(propertiesObject14);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Livestock")) {
					propertiesObject14.put("value", "Livestock");
					propertiesObject14.put("key", "POAFW_SubcategoriesofUseofWaterforAgricultureCategory");
					jsonArray.put(propertiesObject14);
				} else if (submittedApplication.getIndustrialTypeSubCat().equals("Irrigation Loans")) {
					propertiesObject14.put("value", "Irrigation Loans");
					propertiesObject14.put("key", "POAFW_SubcategoriesofUseofWaterforAgricultureCategory");
					jsonArray.put(propertiesObject14);
				}
			}
			if(Validator.isNotNull(submittedApplication.getNonConsumptiveSubCat())) {
				if (submittedApplication.getNonConsumptiveSubCat().equals("Hydropower")) {
					propertiesObject15.put("value", "Hydropower");
					propertiesObject15.put("key", "POAFW_SubcategoriesofNonConsumptive");
					jsonArray.put(propertiesObject15);
				} else if (submittedApplication.getNonConsumptiveSubCat().equals("Aquaculture")) {
					propertiesObject15.put("value", "Aquaculture");
					propertiesObject15.put("key", "POAFW_SubcategoriesofNonConsumptive");
					jsonArray.put(propertiesObject15);
				} else if (submittedApplication.getNonConsumptiveSubCat().equals("Recreational")) {
					propertiesObject15.put("value", "Recreational");
					propertiesObject15.put("key", "POAFW_SubcategoriesofNonConsumptive");
					jsonArray.put(propertiesObject15);
				} else if (submittedApplication.getNonConsumptiveSubCat().equals("Environmental")) {
					propertiesObject15.put("value", "Environmental");
					propertiesObject15.put("key", "POAFW_SubcategoriesofNonConsumptive");
					jsonArray.put(propertiesObject15);
				}
			}
			//Type of permit well
			if(Validator.isNotNull(submittedApplication.getTypeOfPermit())) {
				if (submittedApplication.getTypeOfPermit().equals("Permit to Access a New Well")) {
					propertiesObject16.put("value", "Permit to Access a New Well");
					propertiesObject16.put("key", "POAFW_TypeofPermit");
					jsonArray.put(propertiesObject16);
				} else if (submittedApplication.getTypeOfPermit().equals("Permit to Alter an Existing Well")) {
					propertiesObject16.put("value", "Permit to Alter an Existing Well");
					propertiesObject16.put("key", "POAFW_TypeofPermit");
					jsonArray.put(propertiesObject16);
				}
			}
			//need to clarify
			if(Validator.isNotNull(submittedApplication.getExpiredLicenseAppNumber())) {
			propertiesObject17.put("value", submittedApplication.getExpiredLicenseAppNumber());
			propertiesObject17.put("key", "POAFW_PermitNumber");
			jsonArray.put(propertiesObject17);
			}
		//Type of Transaction-permit
			if(submittedApplication.getTypeOfPermit().equals("Permit to Access a New Well")) {
				if (submittedApplication.getTypeOfTransacPermit().equals("New Permit")) {
					propertiesObject18.put("value", "New Permit");
					propertiesObject18.put("key", "POAFW_TypeofTransactionPermit");
					jsonArray.put(propertiesObject18);
				} else if (submittedApplication.getTypeOfTransacPermit().equals("Resubmission of Application")) {
					propertiesObject18.put("value", "Resubmission of Application");
					propertiesObject18.put("key", "POAFW_TypeofTransactionPermit");
					jsonArray.put(propertiesObject18);
				}
			}
			//type of trans-well driller-if needed
			
			
			//lic num- well drill need to clarify
			if(Validator.isNotNull(submittedApplication.getExpiredLicenseAppNumber())) {
				propertiesObject19.put("value", submittedApplication.getExpiredLicenseAppNumber());
				propertiesObject19.put("key", "POAFW_LicenceNumber");
				jsonArray.put(propertiesObject19);
				}
			
			
			if(Validator.isNotNull(submittedApplication.getApplicationNumber())) {
			propertiesObject24.put("key", "POAFW_Transaction");
			propertiesObject24.put("value",submittedApplication.getApplicationNumber());
			jsonArray.put(propertiesObject24);
			}
			//multiple-select
			
			
			
			/*propertiesObject53.put("key", "JBGNC_EntityApplicant");
			propertiesObject53.put("value",themeDisplay.getUser().getFullName());
			jsonArray.put(propertiesObject53);*/
			
			WRAAppPayment applicationPayment = null;
			try {
				applicationPayment= WRAAppPaymentLocalServiceUtil.getgetWRA_By_Id(wraApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}

			
			propertiesObject49.put("key", "POAFW_PaymentMethod");
			System.out.println("POAFW_PaymentMethod************" + applicationPayment.getPaymentMethod());
			if (applicationPayment.getPaymentMethod().equals("Credit Card")) {
				propertiesObject49.put("value", "Credit Card");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("Direct Deposit")) {
				propertiesObject49.put("value", "Direct Deposit");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("Bank Draft")) {
				propertiesObject49.put("value", "Bank Draft");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("Cash")) {
				propertiesObject49.put("value", "Cash");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("Cheque")) {
				propertiesObject49.put("value", "Cheque");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("Other")) {
				propertiesObject49.put("value", "Other");
				jsonArray.put(propertiesObject49);
			} else if (applicationPayment.getPaymentMethod().equals("")) {
				propertiesObject49.put("value", "");
				jsonArray.put(propertiesObject49);
			}
			try {
				if (submittedApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water")) {
					if(submittedApplication.getTypeOfTransaction().equals("New Licence")) {
						propertiesObject54.put("key", "POAFW_AmountDue");
						propertiesObject54.put("value", "15000");
						jsonArray.put(propertiesObject54);
					}else if(submittedApplication.getTypeOfTransaction().equals("Licence Renewal")) {
						propertiesObject54.put("key", "POAFW_AmountDue");
						propertiesObject54.put("value", "30000");
						jsonArray.put(propertiesObject54);
					}
				} else if (submittedApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
					propertiesObject54.put("key", "POAFW_AmountDue");
					propertiesObject54.put("value", "15000");
					jsonArray.put(propertiesObject54);
				} else if (submittedApplication.getTypeOfApplication().equals("Application for a Well Drillers Licence")) {
					propertiesObject54.put("key", "POAFW_AmountDue");
					propertiesObject54.put("value", "15000");
					jsonArray.put(propertiesObject54);
				}
			} catch (Exception e) {
			}

			String wraDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/wra-dashboard?wraApplicationId=";
			wraDashboarUrl = wraDashboarUrl + String.valueOf(submittedApplication.getWraApplicationId());

			propertiesObject50.put("key", "POAFW_DashboardURL");
			propertiesObject50.put("value", wraDashboarUrl);
			jsonArray.put(propertiesObject50);
			
			propertiesObject51.put("key", "POAFW_CaseOrigination");
			propertiesObject51.put("value", "Portal");
			jsonArray.put(propertiesObject51);
			
			
			
			/*if(Validator.isNotNull(factoriesApplication.getEntityId())) {
			propertiesObject52.put("key", "JBGNC_EntityApplicant");
			propertiesObject52.put("value",factoriesApplication.getEntityId());
			jsonArray.put(propertiesObject52);
			}*/
			
		/* Applicant Details */
			LicenceToAbstractInfo abstractInfo = null;
		    List<WRAReqIrrigation> wraReqIrr=null;
			
			try {
				abstractInfo=LicenceToAbstractInfoLocalServiceUtil.getLicenceToAbstract_By_Id(wraApplicationId);
			} catch (Exception e) {
			}
			if (Validator.isNotNull(abstractInfo)) {
				propertiesObject1.put("key", "POAFW_ApplicationNo");
				propertiesObject1.put("value", abstractInfo!=null?abstractInfo.getApplicationNum():"");
				jsonArray.put(propertiesObject1);
				
				propertiesObject2.put("key", "POAFW_NameofApplicant");
				propertiesObject2.put("value", abstractInfo!=null?abstractInfo.getNameOfApplicant():"");
				jsonArray.put(propertiesObject2);
				
				if(Validator.isNotNull(abstractInfo.getParishApplicant())) {
					propertiesObject20.put("key", "POAFW_Parish");
					if (abstractInfo.getParishApplicant().equals("Kingston")) {
						propertiesObject20.put("value", "Kingston");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Andrew")) {
						propertiesObject20.put("value", "St. Andrew");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Manchester")) {
						propertiesObject20.put("value", "Manchester");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Catherine")) {
						propertiesObject20.put("value", "St. Catherine");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Thomas")) {
						propertiesObject20.put("value", "St. Thomas");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Mary")) {
						propertiesObject20.put("value", "St. Mary");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Portland")) {
						propertiesObject20.put("value", "Portland");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Ann")) {
						propertiesObject20.put("value", "St. Ann");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Trelawny")) {
						propertiesObject20.put("value", "Trelawny");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. James")) {
						propertiesObject20.put("value", "St. James");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Hanover")) {
						propertiesObject20.put("value", "Hanover");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Westmoreland")) {
						propertiesObject20.put("value", "Westmoreland");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("St. Elizabeth")) {
						propertiesObject20.put("value", "St. Elizabeth");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("Clarendon")) {
						propertiesObject20.put("value", "Clarendon");
						jsonArray.put(propertiesObject20);
					} else if (abstractInfo.getParishApplicant().equals("")) {
						propertiesObject20.put("value", "");
						jsonArray.put(propertiesObject20);
					}
				}
				
				propertiesObject3.put("key", "POAFW_AddressofApplicant");
				propertiesObject3.put("value", abstractInfo!=null?abstractInfo.getMailingAddOfApplicant():"");
				jsonArray.put(propertiesObject3);

				propertiesObject4.put("key", "POAFW_EmailAddressofApplicant");
				propertiesObject4.put("value", abstractInfo!=null?abstractInfo.getEmailOfApplicant():"");
				jsonArray.put(propertiesObject4);

				propertiesObject5.put("key", "POAFW_OfficePhone");
				propertiesObject5.put("value", abstractInfo!=null?abstractInfo.getOfficePhone():"");
				jsonArray.put(propertiesObject5);
				
				propertiesObject6.put("key", "POAFW_MobilePhone");
				propertiesObject6.put("value", abstractInfo!=null?abstractInfo.getMobilePhone():"");
				jsonArray.put(propertiesObject6);
				
				propertiesObject7.put("key", "POAFW_HomePhone");
				propertiesObject7.put("value", abstractInfo!=null?abstractInfo.getHomePhone():"");
				jsonArray.put(propertiesObject7);
				
				/*propertiesObject21.put("key", "POAFW_LocationofProposedExistingWork");
				propertiesObject21.put("value", abstractInfo!=null?abstractInfo.getLocationOfProposedParish():"");
				jsonArray.put(propertiesObject21);*/
				if(Validator.isNotNull(abstractInfo.getLocationOfProposedParish())) {
					propertiesObject21.put("key", "POAFW_LocationofProposedExistingWork");
					if (abstractInfo.getLocationOfProposedParish().equals("Kingston")) {
						propertiesObject21.put("value", "Kingston");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Andrew")) {
						propertiesObject21.put("value", "St. Andrew");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Manchester")) {
						propertiesObject21.put("value", "Manchester");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Catherine")) {
						propertiesObject21.put("value", "St. Catherine");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Thomas")) {
						propertiesObject21.put("value", "St. Thomas");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Mary")) {
						propertiesObject21.put("value", "St. Mary");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Portland")) {
						propertiesObject21.put("value", "Portland");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Ann")) {
						propertiesObject21.put("value", "St. Ann");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Trelawny")) {
						propertiesObject21.put("value", "Trelawny");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. James")) {
						propertiesObject21.put("value", "St. James");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Hanover")) {
						propertiesObject21.put("value", "Hanover");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Westmoreland")) {
						propertiesObject21.put("value", "Westmoreland");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("St. Elizabeth")) {
						propertiesObject21.put("value", "St. Elizabeth");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("Clarendon")) {
						propertiesObject21.put("value", "Clarendon");
						jsonArray.put(propertiesObject21);
					} else if (abstractInfo.getLocationOfProposedParish().equals("")) {
						propertiesObject21.put("value", "");
						jsonArray.put(propertiesObject21);
					}
				}
				
				propertiesObject22.put("key", "POAFW_NameofContractor");
				propertiesObject22.put("value", abstractInfo!=null?abstractInfo.getNameOfContractor():"");
				jsonArray.put(propertiesObject22);

				if(Validator.isNotNull(abstractInfo.getParishContractor())) {
					propertiesObject23.put("key", "POAFW_ParishofContractor");
					if (abstractInfo.getParishContractor().equals("Kingston")) {
						propertiesObject23.put("value", "Kingston");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Andrew")) {
						propertiesObject23.put("value", "St. Andrew");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Manchester")) {
						propertiesObject23.put("value", "Manchester");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Catherine")) {
						propertiesObject23.put("value", "St. Catherine");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Thomas")) {
						propertiesObject23.put("value", "St. Thomas");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Mary")) {
						propertiesObject23.put("value", "St. Mary");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Portland")) {
						propertiesObject23.put("value", "Portland");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Ann")) {
						propertiesObject23.put("value", "St. Ann");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Trelawny")) {
						propertiesObject23.put("value", "Trelawny");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. James")) {
						propertiesObject23.put("value", "St. James");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Hanover")) {
						propertiesObject23.put("value", "Hanover");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Westmoreland")) {
						propertiesObject23.put("value", "Westmoreland");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("St. Elizabeth")) {
						propertiesObject23.put("value", "St. Elizabeth");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("Clarendon")) {
						propertiesObject23.put("value", "Clarendon");
						jsonArray.put(propertiesObject23);
					} else if (abstractInfo.getParishContractor().equals("")) {
						propertiesObject23.put("value", "");
						jsonArray.put(propertiesObject23);
					}
				}

				propertiesObject25.put("key", "POAFW_AddressofContractor");
				propertiesObject25.put("value", abstractInfo!=null?abstractInfo.getAddressOfContractor():"");
				jsonArray.put(propertiesObject25);
				/*propertiesObject26.put("key", "POAFW_SourceofWater");
				propertiesObject26.put("value", abstractInfo!=null?abstractInfo.getSourceOfWater():"");
				jsonArray.put(propertiesObject26);*/
				
				propertiesObject26.put("key", "POAFW_SourceofWater");
				String[] sourceOfWater = abstractInfo.getAddressOfContractor().split(" ");
				JSONArray arraySource = JSONFactoryUtil.createJSONArray();
				for (String waterSrc : sourceOfWater) {
					arraySource.put(waterSrc);
				}
				propertiesObject26.put("value", arraySource);
				jsonArray.put(propertiesObject26);
				
				/*propertiesObject27.put("key", "POAFW_PurposeofWater");
				propertiesObject27.put("value", abstractInfo!=null?abstractInfo.getPurposeWaterUse():"");
				jsonArray.put(propertiesObject27);*/
				
				propertiesObject27.put("key", "POAFW_PurposeofWater");
				String[] purposeOfWater = abstractInfo.getPurposeWaterUse().split(" ");
				JSONArray arrayPurpose = JSONFactoryUtil.createJSONArray();
				for (String purpose : purposeOfWater) {
					arrayPurpose.put(purpose);
				}
				propertiesObject27.put("value", arrayPurpose);
				jsonArray.put(propertiesObject27);
				
				try {
				wraReqIrr= WRAReqIrrigationLocalServiceUtil.getWaterRequired_BY_AppId(wraApplicationId);
			    System.out.println("WRA Required Irrigation*****"+wraReqIrr);
				JSONObject infoForprodDetailJsonObj = new JSONFactoryUtil().createJSONObject();
				infoForprodDetailJsonObj.put("key", "POAFW_WaterIrrigation");
				JSONObject detailProductsJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				if (wraReqIrr.size()>0) {
					propertiesObject86.put("key", "POAFW_WaterRequiredforIrrigation");
					propertiesObject86.put("value", "Yes");
					jsonArray.put(propertiesObject86);
					for (WRAReqIrrigation detailsList :wraReqIrr) {
					JSONObject areaCropTypeJsonOBJ = new JSONFactoryUtil().createJSONObject();
		    		JSONObject systemIrrigationJsonOBJ = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
					JSONObject prodDetailsListObjValueJsonObject = new JSONFactoryUtil().createJSONObject();
					areaCropTypeJsonOBJ.put("name", "POAFW_AreaandCrop");
					areaCropTypeJsonOBJ.put("value", detailsList.getAbstractAreaIrrigated());
					jsonArrayProp.put(areaCropTypeJsonOBJ);
					
					systemIrrigationJsonOBJ.put("name", "POAFW_SystemofIrrigation");
					systemIrrigationJsonOBJ.put("value", detailsList.getAbstractSystemIrrigated());
					jsonArrayProp.put(systemIrrigationJsonOBJ);
					
					prodDetailsListObjValueJsonObject.put("properties", jsonArrayProp);
					jsonArrayObjects.put(prodDetailsListObjValueJsonObject);
				}
				detailProductsJsonObj.put("objects", jsonArrayObjects);
			    }else{
				propertiesObject86.put("key", "POAFW_WaterRequiredforIrrigation");
				propertiesObject86.put("value", "No");
				jsonArray.put(propertiesObject86);
				for (WRAReqIrrigation detailsList :wraReqIrr) {
				JSONObject areaCropTypeJsonOBJ = new JSONFactoryUtil().createJSONObject();
	    		JSONObject systemIrrigationJsonOBJ = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
				JSONObject prodDetailsListObjValueJsonObject = new JSONFactoryUtil().createJSONObject();
				areaCropTypeJsonOBJ.put("name", "POAFW_AreaandCrop");
				areaCropTypeJsonOBJ.put("value", detailsList.getAbstractAreaIrrigated());
				jsonArrayProp.put(areaCropTypeJsonOBJ);
				
				systemIrrigationJsonOBJ.put("name", "POAFW_SystemofIrrigation");
				systemIrrigationJsonOBJ.put("value", detailsList.getAbstractSystemIrrigated());
				jsonArrayProp.put(systemIrrigationJsonOBJ);
				
				prodDetailsListObjValueJsonObject.put("properties", jsonArrayProp);
				jsonArrayObjects.put(prodDetailsListObjValueJsonObject);
				}
				detailProductsJsonObj.put("objects", jsonArrayObjects);
			   }
			infoForprodDetailJsonObj.put("value", detailProductsJsonObj);
			jsonArray.put(infoForprodDetailJsonObj);
			} catch (Exception e) {
				// TODO: handle exception
			}
				
				if (Validator.isNotNull(abstractInfo.getDateOfSign())) {
					propertiesObject28.put("key", "POAFW_DateofApplicationReceived");
					propertiesObject28.put("value", bpmDateFormat.format(abstractInfo.getDateOfSign()));
					jsonArray.put(propertiesObject28);
				}
			}
			/*Licence Renewal */
			RenewLicAbstractAndWater renewAbstractInfo = null;
			try {
				renewAbstractInfo= RenewLicAbstractAndWaterLocalServiceUtil.getWRA_By_Id(wraApplicationId);
			} catch (Exception e) { }

			if (Validator.isNotNull(renewAbstractInfo)) {
				propertiesObject29.put("key", "POAFW_NameofApplicant");
				propertiesObject29.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewName():"");
				jsonArray.put(propertiesObject29);
				
				propertiesObject30.put("key", "POAFW_ContactPerson");
				propertiesObject30.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewContact():"");
				jsonArray.put(propertiesObject30);
				
				propertiesObject31.put("key", "POAFW_JobTitle");
				propertiesObject31.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewJobTitle():"");
				jsonArray.put(propertiesObject31);
				
				propertiesObject32.put("key", "POAFW_HomePhone");
				propertiesObject32.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewTelephoneNum():"");
				jsonArray.put(propertiesObject32);
				
				propertiesObject33.put("key", "POAFW_FaxNumber");
				propertiesObject33.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewFaxNum():"");
				jsonArray.put(propertiesObject33);
				
				if(Validator.isNotNull(renewAbstractInfo.getRenewParishLocation())) {
					propertiesObject34.put("key", "POAFW_Parish");
					if (renewAbstractInfo.getRenewParishLocation().equals("Kingston")) {
						propertiesObject34.put("value", "Kingston");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Andrew")) {
						propertiesObject34.put("value", "St. Andrew");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Manchester")) {
						propertiesObject34.put("value", "Manchester");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Catherine")) {
						propertiesObject34.put("value", "St. Catherine");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Thomas")) {
						propertiesObject34.put("value", "St. Thomas");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Mary")) {
						propertiesObject34.put("value", "St. Mary");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Portland")) {
						propertiesObject34.put("value", "Portland");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Ann")) {
						propertiesObject34.put("value", "St. Ann");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Trelawny")) {
						propertiesObject34.put("value", "Trelawny");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. James")) {
						propertiesObject34.put("value", "St. James");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Hanover")) {
						propertiesObject34.put("value", "Hanover");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Westmoreland")) {
						propertiesObject34.put("value", "Westmoreland");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("St. Elizabeth")) {
						propertiesObject34.put("value", "St. Elizabeth");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("Clarendon")) {
						propertiesObject34.put("value", "Clarendon");
						jsonArray.put(propertiesObject34);
					} else if (renewAbstractInfo.getRenewParishLocation().equals("")) {
						propertiesObject34.put("value", "");
						jsonArray.put(propertiesObject34);
					}
				}
				
				propertiesObject35.put("key", "POAFW_AddressofApplicant");
				propertiesObject35.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewAddress():"");
				jsonArray.put(propertiesObject35);
				
				propertiesObject36.put("key", "POAFW_SourceName");
				propertiesObject36.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewSourceName():"");
				jsonArray.put(propertiesObject36);
				
				if(Validator.isNotNull(renewAbstractInfo.getRenewDetailsParishAdd())) {
					propertiesObject37.put("key", "POAFW_SourceParish");
					if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Kingston")) {
						propertiesObject37.put("value", "Kingston");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Andrew")) {
						propertiesObject37.put("value", "St. Andrew");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Manchester")) {
						propertiesObject37.put("value", "Manchester");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Catherine")) {
						propertiesObject37.put("value", "St. Catherine");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Thomas")) {
						propertiesObject37.put("value", "St. Thomas");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Mary")) {
						propertiesObject37.put("value", "St. Mary");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Portland")) {
						propertiesObject37.put("value", "Portland");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Ann")) {
						propertiesObject37.put("value", "St. Ann");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Trelawny")) {
						propertiesObject37.put("value", "Trelawny");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. James")) {
						propertiesObject37.put("value", "St. James");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Hanover")) {
						propertiesObject37.put("value", "Hanover");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Westmoreland")) {
						propertiesObject37.put("value", "Westmoreland");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("St. Elizabeth")) {
						propertiesObject37.put("value", "St. Elizabeth");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("Clarendon")) {
						propertiesObject37.put("value", "Clarendon");
						jsonArray.put(propertiesObject37);
					} else if (renewAbstractInfo.getRenewDetailsParishAdd().equals("")) {
						propertiesObject37.put("value", "");
						jsonArray.put(propertiesObject37);
					}
				}
				
				propertiesObject38.put("key", "POAFW_SourceLocation");
				propertiesObject38.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsLocation():"");
				jsonArray.put(propertiesObject38);
				
				propertiesObject39.put("key", "POAFW_AbstractionRate");
				propertiesObject39.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewAbstractionRate():"");
				jsonArray.put(propertiesObject39);
				
				propertiesObject40.put("key", "POAFW_Use");
				propertiesObject40.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewDetailsUse():"");
				jsonArray.put(propertiesObject40);
				
				propertiesObject41.put("key", "POAFW_MethodofAbstraction");
				propertiesObject41.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewAbstractionMethod():"");
				jsonArray.put(propertiesObject41);
				
				propertiesObject42.put("key", "POAFW_MeasuringDeviceAttached");
				propertiesObject42.put("value", renewAbstractInfo!=null?renewAbstractInfo.getAttachedDevice():"");
				jsonArray.put(propertiesObject42);
				
				propertiesObject43.put("key", "POAFW_StateTypeofDevice");
				propertiesObject43.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewStateDevice():"");
				jsonArray.put(propertiesObject43);
				
				propertiesObject44.put("key", "POAFW_AbstractionDateSubmitted");
				propertiesObject44.put("value", renewAbstractInfo!=null?renewAbstractInfo.getAbstractionData():"");
				jsonArray.put(propertiesObject44);
				
				propertiesObject45.put("key", "POAFW_NameofApplicant");
				propertiesObject45.put("value", renewAbstractInfo!=null?renewAbstractInfo.getRenewSignName():"");
				jsonArray.put(propertiesObject45);
				
				if(Validator.isNotNull(renewAbstractInfo.getRenewDate())) {
					propertiesObject46.put("key", "POAFW_DateofApplicationReceived");
					propertiesObject46.put("value", bpmDateFormat.format(renewAbstractInfo.getRenewDate()));
					jsonArray.put(propertiesObject46);
				}
			}
			
			//Permit to Drill a Well
			  PermitToDrillAWell permitToDrillAWell =null;
	    		try {
	    			permitToDrillAWell=PermitToDrillAWellLocalServiceUtil.getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
				} catch (Exception e) {
					// TODO: handle exception
				}
	    		if(Validator.isNotNull(permitToDrillAWell)) {
	    			propertiesObject47.put("key", "POAFW_ApplicationNo");
					propertiesObject47.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillApplicationNum():"");
					jsonArray.put(propertiesObject47);
					
					propertiesObject55.put("key", "POAFW_NameofApplicant");
					propertiesObject55.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingApplicantName():"");
					jsonArray.put(propertiesObject55);
					
					if(Validator.isNotNull(permitToDrillAWell.getPermitDrillingMailingAddParish())) {
						propertiesObject56.put("key", "POAFW_Parish");
						if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Kingston")) {
							propertiesObject56.put("value", "Kingston");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Andrew")) {
							propertiesObject56.put("value", "St. Andrew");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Manchester")) {
							propertiesObject56.put("value", "Manchester");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Catherine")) {
							propertiesObject56.put("value", "St. Catherine");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Thomas")) {
							propertiesObject56.put("value", "St. Thomas");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Mary")) {
							propertiesObject56.put("value", "St. Mary");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Portland")) {
							propertiesObject56.put("value", "Portland");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Ann")) {
							propertiesObject56.put("value", "St. Ann");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Trelawny")) {
							propertiesObject56.put("value", "Trelawny");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. James")) {
							propertiesObject56.put("value", "St. James");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Hanover")) {
							propertiesObject56.put("value", "Hanover");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Westmoreland")) {
							propertiesObject56.put("value", "Westmoreland");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Elizabeth")) {
							propertiesObject56.put("value", "St. Elizabeth");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Clarendon")) {
							propertiesObject56.put("value", "Clarendon");
							jsonArray.put(propertiesObject56);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("")) {
							propertiesObject56.put("value", "");
							jsonArray.put(propertiesObject56);
						}
					}
					
					propertiesObject57.put("key", "POAFW_AddressofApplicant");
					propertiesObject57.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMailingAddress():"");
					jsonArray.put(propertiesObject57);
					
					propertiesObject58.put("key", "POAFW_EmailAddressofApplicant");
					propertiesObject58.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingEmailAddress():"");
					jsonArray.put(propertiesObject58);
					
					propertiesObject59.put("key", "POAFW_OfficePhone");
					propertiesObject59.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingOfficePhone():"");
					jsonArray.put(propertiesObject59);
					
					propertiesObject60.put("key", "POAFW_MobilePhone");
					propertiesObject60.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingMobilePhone():"");
					jsonArray.put(propertiesObject60);
					
					propertiesObject61.put("key", "POAFW_HomePhone");
					propertiesObject61.put("value", permitToDrillAWell!=null?permitToDrillAWell.getWellDrillingHomePhone():"");
					jsonArray.put(propertiesObject61);
					
					if(Validator.isNotNull(permitToDrillAWell.getPermitDrillingWorkLocation())) {
						propertiesObject62.put("key", "POAFW_LocationofProposedExistingWork");
						if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Kingston")) {
							propertiesObject62.put("value", "Kingston");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Andrew")) {
							propertiesObject62.put("value", "St. Andrew");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Manchester")) {
							propertiesObject62.put("value", "Manchester");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Catherine")) {
							propertiesObject62.put("value", "St. Catherine");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Thomas")) {
							propertiesObject62.put("value", "St. Thomas");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Mary")) {
							propertiesObject62.put("value", "St. Mary");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Portland")) {
							propertiesObject62.put("value", "Portland");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Ann")) {
							propertiesObject62.put("value", "St. Ann");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Trelawny")) {
							propertiesObject62.put("value", "Trelawny");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. James")) {
							propertiesObject62.put("value", "St. James");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Hanover")) {
							propertiesObject62.put("value", "Hanover");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Westmoreland")) {
							propertiesObject62.put("value", "Westmoreland");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("St. Elizabeth")) {
							propertiesObject62.put("value", "St. Elizabeth");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("Clarendon")) {
							propertiesObject62.put("value", "Clarendon");
							jsonArray.put(propertiesObject62);
						} else if (permitToDrillAWell.getPermitDrillingWorkLocation().equals("")) {
							propertiesObject62.put("value", "");
							jsonArray.put(propertiesObject62);
						}
					}
					
					
					propertiesObject63.put("key", "POAFW_NatureofInterestofLand");
					propertiesObject63.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingLocation():"");
					jsonArray.put(propertiesObject63);
					
					propertiesObject64.put("key", "POAFW_NameofDrillingContractor");
					propertiesObject64.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingContractorName():"");
					jsonArray.put(propertiesObject64);
					
					/*propertiesObject65.put("key", "POAFW_ParishofDrillingContractor");
					propertiesObject65.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingContractorName():"");
					jsonArray.put(propertiesObject65);*/
					if(Validator.isNotNull(permitToDrillAWell.getPermitDrillingMailingAddParish())) {
						propertiesObject65.put("key", "POAFW_ParishofDrillingContractor");
						if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Kingston")) {
							propertiesObject65.put("value", "Kingston");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Andrew")) {
							propertiesObject65.put("value", "St. Andrew");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Manchester")) {
							propertiesObject65.put("value", "Manchester");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Catherine")) {
							propertiesObject65.put("value", "St. Catherine");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Thomas")) {
							propertiesObject65.put("value", "St. Thomas");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Mary")) {
							propertiesObject65.put("value", "St. Mary");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Portland")) {
							propertiesObject65.put("value", "Portland");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Ann")) {
							propertiesObject65.put("value", "St. Ann");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Trelawny")) {
							propertiesObject65.put("value", "Trelawny");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. James")) {
							propertiesObject65.put("value", "St. James");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Hanover")) {
							propertiesObject65.put("value", "Hanover");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Westmoreland")) {
							propertiesObject65.put("value", "Westmoreland");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("St. Elizabeth")) {
							propertiesObject65.put("value", "St. Elizabeth");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("Clarendon")) {
							propertiesObject65.put("value", "Clarendon");
							jsonArray.put(propertiesObject65);
						} else if (permitToDrillAWell.getPermitDrillingMailingAddParish().equals("")) {
							propertiesObject65.put("value", "");
							jsonArray.put(propertiesObject65);
						}
					}
					
					propertiesObject66.put("key", "POAFW_AddressofDrillingContractor");
					propertiesObject66.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillContractAddress():"");
					jsonArray.put(propertiesObject66);
					
					propertiesObject67.put("key", "POAFW_PurposeofDrlling");
					propertiesObject67.put("value", permitToDrillAWell!=null?permitToDrillAWell.getPermitDrillingContractorAdd():"");
					jsonArray.put(propertiesObject67);
					
					if(Validator.isNotNull(permitToDrillAWell.getPermitDrillingSignDate())) {
						propertiesObject68.put("key", "POAFW_DateofApplicationReceived");
						propertiesObject68.put("value", bpmDateFormat.format(permitToDrillAWell.getPermitDrillingSignDate()));
						jsonArray.put(propertiesObject68);
					}
					
	    		}
	    		
	    		//Well Drillers Licence
	    		LicenceToWellDriller wellDrillerLic = null;
	    		try {
	    			wellDrillerLic= LicenceToWellDrillerLocalServiceUtil.getLicenceToWellDriller_By_Id(wraApplicationId);
	    		} catch (Exception e) {
	    		}
	    		if(Validator.isNotNull(wellDrillerLic)) {
	    			propertiesObject69.put("key", "POAFW_ApplicationNo");
					propertiesObject69.put("value", wellDrillerLic!=null?wellDrillerLic.getWellDrillingApplicationNo():"");
					jsonArray.put(propertiesObject69);
					
					propertiesObject70.put("key", "POAFW_NameofApplicant");
					propertiesObject70.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingApplicantName():"");
					jsonArray.put(propertiesObject70);
					
					if(Validator.isNotNull(wellDrillerLic.getPermitDrillingAddressParish())) {
						propertiesObject71.put("key", "POAFW_Parish");
						if (wellDrillerLic.getPermitDrillingAddressParish().equals("Kingston")) {
							propertiesObject71.put("value", "Kingston");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Andrew")) {
							propertiesObject71.put("value", "St. Andrew");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Manchester")) {
							propertiesObject71.put("value", "Manchester");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Catherine")) {
							propertiesObject71.put("value", "St. Catherine");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Thomas")) {
							propertiesObject71.put("value", "St. Thomas");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Mary")) {
							propertiesObject71.put("value", "St. Mary");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Portland")) {
							propertiesObject71.put("value", "Portland");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Ann")) {
							propertiesObject71.put("value", "St. Ann");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Trelawny")) {
							propertiesObject71.put("value", "Trelawny");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. James")) {
							propertiesObject71.put("value", "St. James");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Hanover")) {
							propertiesObject71.put("value", "Hanover");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Westmoreland")) {
							propertiesObject71.put("value", "Westmoreland");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("St. Elizabeth")) {
							propertiesObject71.put("value", "St. Elizabeth");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("Clarendon")) {
							propertiesObject71.put("value", "Clarendon");
							jsonArray.put(propertiesObject71);
						} else if (wellDrillerLic.getPermitDrillingAddressParish().equals("")) {
							propertiesObject71.put("value", "");
							jsonArray.put(propertiesObject71);
						}
					}
					
					propertiesObject72.put("key", "POAFW_AddressofApplicant");
					propertiesObject72.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingApplicantAddress():"");
					jsonArray.put(propertiesObject72);
					
					if(Validator.isNotNull(wellDrillerLic.getPermitDrillingDOBDate())) {
					propertiesObject73.put("key", "POAFW_DateofBirth");
					propertiesObject73.put("value", bpmDateFormat.format(wellDrillerLic.getPermitDrillingDOBDate()));
					jsonArray.put(propertiesObject73);
					}
					
					propertiesObject74.put("key", "POAFW_EducationalBackground");
					propertiesObject74.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingEducational():"");
					jsonArray.put(propertiesObject74);
					
					propertiesObject75.put("key", "POAFW_SpecificTraining");
					propertiesObject75.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingSpecificTraining():"");
					jsonArray.put(propertiesObject75);
					
					propertiesObject76.put("key", "POAFW_SpecificExperience");
					propertiesObject76.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingSpecificExp():"");
					jsonArray.put(propertiesObject76);
					
					propertiesObject77.put("key", "POAFW_Areyouselfemployed");
					propertiesObject77.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingSelfEmployed():"");
					jsonArray.put(propertiesObject77);
					
					if(Validator.isNotNull(wellDrillerLic.getPermitDrillingSelfEmployed().equals("No"))) {
						propertiesObject78.put("key", "POAFW_NameofEmployer");
						propertiesObject78.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingName():"");
						jsonArray.put(propertiesObject78);
						
						propertiesObject79.put("key", "POAFW_LengthofTimeEmployed");
						propertiesObject79.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingPresentEmployer():"");
						jsonArray.put(propertiesObject79);
						
						propertiesObject80.put("key", "POAFW_AddressofEmployer");
						propertiesObject80.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingEmployerAddress():"");
						jsonArray.put(propertiesObject80);
					}
					
					
					propertiesObject81.put("key", "POAFW_References.POAFW_NameofReference");
					propertiesObject81.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingFirstRefName():"");
					jsonArray.put(propertiesObject81);
					
					propertiesObject82.put("key", "POAFW_References.POAFW_AddressofReference");
					propertiesObject82.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingFirstRefAdd():"");
					jsonArray.put(propertiesObject82);
					
					propertiesObject83.put("key", "POAFW_References.POAFW_NameofReference");
					propertiesObject83.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingSecondRefName():"");
					jsonArray.put(propertiesObject83);
					
					propertiesObject84.put("key", "POAFW_References.POAFW_AddressofReference");
					propertiesObject84.put("value", wellDrillerLic!=null?wellDrillerLic.getPermitDrillingSecondRefAdd():"");
					jsonArray.put(propertiesObject84);
					
					if(Validator.isNotNull(wellDrillerLic.getPermitDrillingSignatureDate())) {
						propertiesObject85.put("key", "POAFW_DateofApplicationReceived");
						propertiesObject85.put("value", bpmDateFormat.format(wellDrillerLic.getPermitDrillingSignatureDate()));
						jsonArray.put(propertiesObject85);
					}
					
	    		}
		
			jsonObject.put("properties", jsonArray);
				_log.info("Request json--------------" + jsonObject.toString());
				String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
						.getAttribute("icm-launch-case-url");
				_log.info("*************launchCaseUrl in WRA************" + launchCaseUrl);
				String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
						.getAttribute("create-case-endpoint");
				_log.info("*************createCaseEndPoint in WRA************" + createCaseEndPoint);
				Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
						.getAttribute("bpm-enabled");
				_log.info("*************isBPMEnabled in WRA************" + isBPMEnabled);
				String token = null;
				String objectStoreValue= null;
				try {
					token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"101",launchCaseUrl);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				_log.info("*************Object Store Called in WRA************" + objectStoreValue);
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
						WRAApplication subWraApplication = null;
						try {
							subWraApplication = WRAApplicationLocalServiceUtil.getWRAApplication(wraApplicationId);
						} catch (PortalException e1) {
						}
						subWraApplication.setStatus(WRAApplicationFormPortletKeys.SUBMITTED);
						subWraApplication.setCaseId(caseId);
						subWraApplication.setIcmDocumentPath(path);
						WRAApplicationLocalServiceUtil.updateWRAApplication(subWraApplication);
						
						jsonOBJ.put("wraAppNo", subWraApplication.getApplicationNumber());
						jsonOBJ.put("appStatus", WRAApplicationFormPortletKeys.SUBMITTED_Label);
						jsonOBJ.put("category", subWraApplication.getTypeOfApplication());
						jsonOBJ.put("wraApplicationId", subWraApplication.getWraApplicationId());
						jsonFeed.put("APP_DATA", jsonOBJ);
						DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
								themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
								"WRA Supported Documents");
						DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
								themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
								String.valueOf(subWraApplication.getWraApplicationId()));
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
							if(subWraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water")) {
								System.out.println("inside Application for a Licence to Abstract & User Water  --------");
								if(subWraApplication.getTypeOfTransaction().equals("New Licence")) {
									for (Folder allSupportingFolder : folder) {
										if (!allSupportingFolder.getName().equals("WRA Application Form PDF")&&!allSupportingFolder.getName().equals("Abstract Signature Applicant")) {
											specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
											fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
													specificFolder.getFolderId());
											for (DLFileEntry dlfile : fileEntries) {
												filez.add(generateFileByInputStream(dlfile));
											}
										}
									}
								}else if(subWraApplication.getTypeOfTransaction().equals("Licence Renewal")) {
									for (Folder allSupportingFolder : folder) {
									if (!allSupportingFolder.getName().equals("WRA Application Form PDF")&&!allSupportingFolder.getName().equals("Abstract Renew Signature Applicant")){
											specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
											fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
													specificFolder.getFolderId());
											for (DLFileEntry dlfile : fileEntries) {
												filez.add(generateFileByInputStream(dlfile));
											}
										}
									}
								}
							}else if(subWraApplication.getTypeOfApplication().equals("Application for a Permit to Drill a Well")) {
								System.out.println("inside Application for a Permit to Drill a Well--------");
								for (Folder allSupportingFolder : folder) {	
								if (!allSupportingFolder.getName().equals("WRA Application Form PDF")&&!allSupportingFolder.getName().equals("Permit Signature Applicant")) {
										specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
										fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
												specificFolder.getFolderId());
										for (DLFileEntry dlfile : fileEntries) {
											filez.add(generateFileByInputStream(dlfile));
										}
									 }
								  }
								}else if(subWraApplication.getTypeOfApplication().equals("Application for a Well Drillers Licence")) {
									System.out.println("inside Application for a Well Drillers Licence--------");
									for (Folder allSupportingFolder : folder) {
									if (!allSupportingFolder.getName().equals("WRA Application Form PDF")&&!allSupportingFolder.getName().equals("Well Drilling Signature Applicant")){
										specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
										fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
												specificFolder.getFolderId());
										for (DLFileEntry dlfile : fileEntries) {
											filez.add(generateFileByInputStream(dlfile));
										}
									}
								}
								
							}
						} catch (Exception e) {
						}
						try {
							String pdfTemplate = "";
							pdfTemplate = commonsUtil.replaceWraApplicationPdfVar(subWraApplication.getTypeOfApplication(), subWraApplication.getTypeOfTransaction(), subWraApplication.getTypeOfPermit(), subWraApplication.getWraApplicationId(), themeDisplay, checkPdfDownloadWithoutDocument);
							System.out.println("WRA LAUNCH CASE TEMPLATE*******"+pdfTemplate);
							
							if(subWraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract & User Water")
									||subWraApplication.getTypeOfApplication().equals("Application for a Licence to Abstract &amp; User Waters")) {
								System.out.println("pdf in bpm---abstract user water********");
								if(subWraApplication.getTypeOfTransaction().equals("New Licence")){
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"wra_new_licence",pdfTemplate);
									filez.add(file);
									System.out.println("pdf in bpm---abstract user water********wra_new_licence*"+file);
								}else if(subWraApplication.getTypeOfTransaction().equals("Licence Renewal")) {	
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"wra_renewal_licence",pdfTemplate);
									filez.add(file);
									System.out.println("pdf in bpm---abstract user water********wra_renewal_licence*"+file);
								}
							}else if(typeOfApplication.equals("Application for a Permit to Drill a Well")) {
								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"wra_new_permit",pdfTemplate);
								filez.add(file);
								System.out.println("pdf in bpm---permit to drill well********wra_new_permit*"+file);
							}else if(typeOfApplication.equals("Application for a Well Drillers Licence")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"wra_well_drillers",pdfTemplate);
									filez.add(file);
									System.out.println("pdf in bpm---well driller licence********wra_well_drillers*"+file);
							}
							
						} catch (Exception e) {
							_log.error(e.getMessage());
						}
						try {
							String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("upload-files-api-endpoint");
							_log.info("path--------------" + path);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+ "?tos="+objectStoreValue)
										.field("path", path + "/01.Applicant Documentation").field("files", supportingDocs).asString();
								_log.info("SUPPORTED DOCUMENT service resonse ----------------" + documentUploadresponse.getCode());
								
								}
						} catch (Exception e) {
							_log.info("SUPPORTED DOCUMENT service resonse catch block----------------" + e.getMessage());
							// TODO: handle exception
						}
						
						//PDF-->File pdfFile = null;
						 //Sending Email After Form Submission
						try {
							String CategoryTypeUpperCase = subWraApplication.getTypeOfApplication().toUpperCase();
							String subcategoryUpperCase = subWraApplication.getTypeOfTransaction().toUpperCase();
							String childcategoryUpperCase = subWraApplication.getUserWaterTypeCat().toUpperCase();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
												"[$subCategory$]", "[$childCategory$]", "[$transactionNo$]", "[$dashboardURL$]" },

										new String[] { themeDisplay.getUser().getFullName(), "WRA - Water Resources Authority Services",
												"entityName", CategoryTypeUpperCase, subcategoryUpperCase, childcategoryUpperCase,
												application.getApplicationNumber(), wraDashboarUrl });
							}
							commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
									themeDisplay.getUser().getEmailAddress(), body);
							_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

							
						} catch (Exception e) {
							_log.error("An Error Has Occured", e);
						}
//						String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("upload-files-api-endpoint");
//						_log.info("path--------------" + path);
//						for (File supportingDocs : filez) {
//							HttpResponse<String> documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+ "?tos=TOS3")
//									.field("path", path).field("files", supportingDocs).asString();
//							_log.info("SUPPORTED DOCUMENT service resonse ----------------" + documentUploadresponse.getCode());
//							
//							}
				     }
				}

		}catch (IOException e) {
			e.printStackTrace();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		_log.info("WRA APPLICATION Submitted END");
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
