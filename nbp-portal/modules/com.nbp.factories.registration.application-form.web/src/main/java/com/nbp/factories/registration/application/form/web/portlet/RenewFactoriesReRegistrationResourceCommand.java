package com.nbp.factories.registration.application.form.web.portlet;


import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.service.FactoriesAppPaymentLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesProcessedFoodActLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationWorkFlowConstants;
import com.nbp.factories.registration.application.util.FactoriesRegApplicationDocumentsCopyUtil;
import com.nbp.factories.registration.application.util.FactoriesRegistrationApplicationDataUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name="
				+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
		"mvc.command.name=re/Registration" }, service = MVCResourceCommand.class)

public class RenewFactoriesReRegistrationResourceCommand implements MVCResourceCommand{
	static Log _log = LogFactoryUtil.getLog(RenewFactoriesReRegistrationResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "Factories Supported Documents";

	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String registrationNum = ParamUtil.getString(resourceRequest, "registrationNum");
		
		FactoriesApplicationRegistration factoriresApplication= null;
		FactoriesApplicationRegistration reRegFactoriesApplication=null;
		FactoriesAppPayment factoriesPayment = null;
		
		long factoriesApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(registrationNum)) {
				factoriresApplication=FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesRegstBy_AppNo(registrationNum);
			}
				factoriesApplicationId=factoriresApplication.getFactoriesApplicationId();
			
		} catch (Exception e) {
			_log.error(e.getMessage());
		}
			try {
				factoriesPayment=FactoriesAppPaymentLocalServiceUtil.getFactoriesRegistrationById(factoriesApplicationId);
			}catch (Exception e) {}
			if (Validator.isNull(factoriresApplication)) {
				if (Validator.isNull(registrationNum)) {
					jsonOBJ.put("registrationNumCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());	
				}
	//	            else if(Validator.isNotNull(registrationNum)) {
//					jsonOBJ.put("registrationNumCheck", "0");
//					jsonFeed.put("APP_DATA", jsonOBJ);
//					resourceResponse.setContentType("application/json");
//					resourceResponse.getWriter().write(jsonFeed.toString());
//				}
					else {
					String renewUrl = FactoriesRegistrationApplicationDataUtil.createRegistrationApplication(themeDisplay, registrationNum);
					jsonOBJ.put("renewLicenseUrl", renewUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().print(jsonFeed.toString());
					
					}
			}
			else {
				if(factoriresApplication.getStatus() == FactoriesRegistrationApplicationWorkFlowConstants.SUBMITTED) {
					if(Validator.isNotNull(registrationNum)) {
					try {
						reRegFactoriesApplication = FactoriesApplicationRegistrationLocalServiceUtil
								.getFactoriesRegstByAT_AppNo(FactoriesRegistrationApplicationWorkFlowConstants.RENEW, registrationNum);
						
					} catch (Exception e) {
						_log.error("Error****************" + e.getMessage());
					}
				}
					if (reRegFactoriesApplication==null) {
					reRegFactoriesApplication=FactoriesApplicationRegistrationLocalServiceUtil.createFactoriesApplicationRegistration(CounterLocalServiceUtil.increment());
					DateFormat df = new SimpleDateFormat("yy");
					String formattedDate = df.format(Calendar.getInstance().getTime());
					SecureRandom random = new SecureRandom();
					int num = random.nextInt(100000);
					String formatted = String.format("%05d", num);
					reRegFactoriesApplication.setGroupId(themeDisplay.getScopeGroupId());
					reRegFactoriesApplication.setCompanyId(themeDisplay.getCompanyId());
					reRegFactoriesApplication.setUserId(themeDisplay.getUserId());
					reRegFactoriesApplication.setUserName(themeDisplay.getUser().getFullName());
					reRegFactoriesApplication.setCreateDate(new Date());
					reRegFactoriesApplication.setExpiredLicenseAppNumber(registrationNum);
					reRegFactoriesApplication.setApplicationNumber(formatted + "/" + formattedDate); 
					reRegFactoriesApplication.setTypeOfTransaction(FactoriesRegistrationApplicationWorkFlowConstants.REGISTRATION_APPLICATION);
					reRegFactoriesApplication.setAreYouProcessing(factoriresApplication.getAreYouProcessing());
					reRegFactoriesApplication.setStatus(FactoriesRegistrationApplicationWorkFlowConstants.DRAFT);
					FactoriesApplicationRegistrationLocalServiceUtil.updateFactoriesApplicationRegistration(reRegFactoriesApplication);
					
					
					FactoriesRegstCurrentStage RegstCurrentStage=FactoriesRegstCurrentStageLocalServiceUtil.createFactoriesRegstCurrentStage(CounterLocalServiceUtil.increment());
					
					RegstCurrentStage.setCurrentStage("APPLICATION FORM DETAILS");
					RegstCurrentStage.setLastFormStep("childStep1");
					RegstCurrentStage.setFactoriesApplicationId(reRegFactoriesApplication.getFactoriesApplicationId());
					FactoriesRegstCurrentStageLocalServiceUtil.updateFactoriesRegstCurrentStage(RegstCurrentStage);
					copyingDataFromOriginalApplication(factoriresApplication.getFactoriesApplicationId(), reRegFactoriesApplication.getFactoriesApplicationId());
					
					ServiceContext serviceContext = new ServiceContext();
					DLFolder originalRootDlFolder = null;
					DLFolder supportingDocsMainFolder = null;
					List<DLFileEntry> originalFolderFileEntry = null;
					serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(),resourceRequest);
					
					try {
						originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
								PARENT_FOLDER_ID, ROOT_FOLDER_NAME);

					} catch (PortalException e) {
						_log.error("Error---->>" + e.getMessage());
					}
					try {
						supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
								themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
								String.valueOf(factoriesApplicationId));

						originalFolderFileEntry = DLFileEntryLocalServiceUtil.getFileEntries(
								themeDisplay.getScopeGroupId(), supportingDocsMainFolder.getFolderId());

					} catch (PortalException e) {
						_log.error("Error----->>" + e.getMessage());
					}
					DLFolder copiedDlFolder = null;
					try {
						copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
								originalRootDlFolder.getFolderId(), String.valueOf(
										reRegFactoriesApplication.getFactoriesApplicationId()));
					} catch (Exception e) {
						_log.error("Error----->>" + e.getMessage());
					}
					if (copiedDlFolder == null) {
						FactoriesRegApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
								supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),String.valueOf(reRegFactoriesApplication.getFactoriesApplicationId()),
								supportingDocsMainFolder.getDescription(), serviceContext,
								supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
								reRegFactoriesApplication.getFactoriesApplicationId());
						

					}
				}
				String paymentMethod=Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getPaymentMethod())?factoriesPayment.getPaymentMethod():"";
				String amount=Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getAmountPaid())?factoriesPayment.getAmountPaid():"";
				String currency=Validator.isNotNull(factoriesPayment)&&Validator.isNotNull(factoriesPayment.getAmountCurrency())?factoriesPayment.getAmountCurrency():"";
				String renewLicenseUrl = "/group/guest/factories-registration-application-form?factoriesApplicationId="
						+ reRegFactoriesApplication.getFactoriesApplicationId()+"&paymentMethod="+paymentMethod+"&amount="+amount+"&currency="+currency;
				jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().write(jsonFeed.toString());
			} else {
				jsonOBJ.put("registrationNumCheck", "0");
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().write(jsonFeed.toString());
			}
				
			}
			
		}
		catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
		}
		return false;
		
		}




	private static void copyingDataFromOriginalApplication(long factoriesApplicationId, long reRegFactoriesApplicationId) {
		 
		 FactoriesStandardActInfo factoriesStandardActInfo = null;
		 FactoriesStandardActInfo renewFactoriesStandardActInfo = null;
		 
		 try {
			 factoriesStandardActInfo =FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
			}catch (Exception e) {
			}
			
			try {
				renewFactoriesStandardActInfo = FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
			}catch(Exception e) {
				_log.error("Error****************" + e.getMessage());
			}
			if(factoriesStandardActInfo != null) {
			renewFactoriesStandardActInfo.setStandardsActEstablishmentName(factoriesStandardActInfo.getStandardsActEstablishmentName());
	        renewFactoriesStandardActInfo.setStandardsActAddParish(factoriesStandardActInfo.getStandardsActAddParish());
	        renewFactoriesStandardActInfo.setStandardsActAddress(factoriesStandardActInfo.getStandardsActAddress());
	        renewFactoriesStandardActInfo.setStandardsActTel(factoriesStandardActInfo.getStandardsActTel());
	        renewFactoriesStandardActInfo.setStandardsActWhatsAppNum(factoriesStandardActInfo.getStandardsActWhatsAppNum());
	        renewFactoriesStandardActInfo.setStandardsActEmail(factoriesStandardActInfo.getStandardsActEmail());
	        renewFactoriesStandardActInfo.setStandardsActFaxNum(factoriesStandardActInfo.getStandardsActFaxNum());
	        renewFactoriesStandardActInfo.setStandardsActOperatorName(factoriesStandardActInfo.getStandardsActOperatorName());
	        renewFactoriesStandardActInfo.setStandardsActOperatorAddress(factoriesStandardActInfo.getStandardsActOperatorAddress());
	        renewFactoriesStandardActInfo.setStandardsActParish(factoriesStandardActInfo.getStandardsActAddParish());
	        renewFactoriesStandardActInfo.setStandardsActOperatorTel(factoriesStandardActInfo.getStandardsActOperatorTel());
	        renewFactoriesStandardActInfo.setStandardsActLastDate(factoriesStandardActInfo.getStandardsActLastDate());
	        renewFactoriesStandardActInfo.setStandardsActPurpose(factoriesStandardActInfo.getStandardsActPurpose());
	        renewFactoriesStandardActInfo.setStandardsActDate(factoriesStandardActInfo.getStandardsActDate());
	        renewFactoriesStandardActInfo.setEstablishmentBefore(factoriesStandardActInfo.getEstablishmentBefore());
	        renewFactoriesStandardActInfo.setFactoriesApplicationId(reRegFactoriesApplicationId);
	        FactoriesStandardActInfoLocalServiceUtil.updateFactoriesStandardActInfo(renewFactoriesStandardActInfo);
			}
			 
			//add more
		List<FactoriesProductDetailsAdd> productDetail = null;
			FactoriesProductDetailsAdd renewProductDetail = null;
			
			try {
				productDetail = FactoriesProductDetailsAddLocalServiceUtil.getFactoriesById(factoriesApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
				
			if(productDetail!=null) {
				
			for(FactoriesProductDetailsAdd factories:productDetail) {
				renewProductDetail = FactoriesProductDetailsAddLocalServiceUtil.createFactoriesProductDetailsAdd(CounterLocalServiceUtil.increment());
				renewProductDetail.setProductBrand(factories.getProductBrand());
				renewProductDetail.setProduct(factories.getProduct());
				renewProductDetail.setProductSize(factories.getProductSize());
				renewProductDetail.setProductMeasurementVal(factories.getProductMeasurementVal());
				renewProductDetail.setFactoriesApplicationId(reRegFactoriesApplicationId);
				FactoriesProductDetailsAddLocalServiceUtil.updateFactoriesProductDetailsAdd(renewProductDetail);
			  }
			}
			
	        //Form A
	        FactoriesProcessedFoodAct factoriesProcessedFoodActInfo = null;
	        FactoriesProcessedFoodAct renewFactoriesProcessedFoodActInfo = null;

	        try {
	        	factoriesProcessedFoodActInfo = FactoriesProcessedFoodActLocalServiceUtil.getFactoriesById(factoriesApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
				
				
				_log.error("---------------------------------Form A---------------------"+factoriesProcessedFoodActInfo);
			if(factoriesProcessedFoodActInfo != null) {
				_log.error("--------------------------------under factoriesProcessedFoodActInfo ---------------------");
			renewFactoriesProcessedFoodActInfo=FactoriesProcessedFoodActLocalServiceUtil.createFactoriesProcessedFoodAct(CounterLocalServiceUtil.increment());
	        renewFactoriesProcessedFoodActInfo.setProcessedActEstablishmentName(factoriesProcessedFoodActInfo.getProcessedActEstablishmentName());
	        renewFactoriesProcessedFoodActInfo.setProcessedActParishAddress(factoriesProcessedFoodActInfo.getProcessedActParishAddress());
	        renewFactoriesProcessedFoodActInfo.setProcessedActAddress(factoriesProcessedFoodActInfo.getProcessedActAddress());
	        renewFactoriesProcessedFoodActInfo.setProcessedActOperatorName(factoriesProcessedFoodActInfo.getProcessedActOperatorName());
	        renewFactoriesProcessedFoodActInfo.setProcessedActOperatorAddress(factoriesProcessedFoodActInfo.getProcessedActOperatorAddress());
	        renewFactoriesProcessedFoodActInfo.setProcessedActParish(factoriesProcessedFoodActInfo.getProcessedActParish());
	        renewFactoriesProcessedFoodActInfo.setProcessedActDescription(factoriesProcessedFoodActInfo.getProcessedActDescription());
	        renewFactoriesProcessedFoodActInfo.setEstablishmentOperated(factoriesProcessedFoodActInfo.getEstablishmentOperated());
	        renewFactoriesProcessedFoodActInfo.setProcessedActLastDate(factoriesProcessedFoodActInfo.getProcessedActLastDate());
	        renewFactoriesProcessedFoodActInfo.setProcessedActManufactured(factoriesProcessedFoodActInfo.getProcessedActManufactured());   
	        renewFactoriesProcessedFoodActInfo.setProcessedActDate(factoriesProcessedFoodActInfo.getProcessedActDate());
			renewFactoriesProcessedFoodActInfo.setFactoriesApplicationId(reRegFactoriesApplicationId);
			FactoriesProcessedFoodActLocalServiceUtil.updateFactoriesProcessedFoodAct(renewFactoriesProcessedFoodActInfo);
			}
			_log.error("--------------------------------outer factoriesProcessedFoodActInfo ---------------------");
		
	}		

@Reference
private CommonsUtil commonsUtil;
}
	
