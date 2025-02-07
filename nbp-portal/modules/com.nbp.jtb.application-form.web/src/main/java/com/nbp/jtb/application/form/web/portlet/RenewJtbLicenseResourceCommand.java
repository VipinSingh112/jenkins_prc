package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
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
import com.nbp.jtb.application.form.service.model.AccoHomeStay;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;
import com.nbp.jtb.application.form.service.model.AttractionBikeRentalInfo;
import com.nbp.jtb.application.form.service.model.AttractionCarRentCondition;
import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;
import com.nbp.jtb.application.form.service.model.AttractionConCarriageInfo;
import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;
import com.nbp.jtb.application.form.service.model.AttractionDomesticService;
import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;
import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;
import com.nbp.jtb.application.form.service.model.AttractionWaterGenDeclare;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;
import com.nbp.jtb.application.form.service.model.AttractionWaterSport;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBCurrentStage;
import com.nbp.jtb.application.form.service.model.JTBPaymentMethod;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo;
import com.nbp.jtb.application.form.service.model.JtbAddListVehicleRegst;
import com.nbp.jtb.application.form.service.service.AccoHomeStayLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractDetailFormInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionBikeRentalInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionCarRentConditionLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionCarRentalLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionConCarriageInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionCraftTraderLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionDomesticServiceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionDomesticTourLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionPlaceOfInterestLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionTravelAgencyLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionTravelHaltAppLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterEmployeeLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterGenDeclareLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterRequiredLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionWaterSportLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBCurrentStageLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBPaymentMethodLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddBranchDetailInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddListDriverInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddListVehicleRegstLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import com.nbp.jtb.application.form.web.constants.JtbApplicationWorkflowConstant;
import com.nbp.jtb.application.stage.services.model.JTBLicenceCertificate;
import com.nbp.jtb.application.stage.services.service.JTBLicenceCertificateLocalServiceUtil;
import com.nbp.jtb.application.util.JtbApplicationDataCreationUtil;
import com.nbp.jtb.application.util.JtbApplicationDocumentsCopyUtil;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/renew/license" }, service = MVCResourceCommand.class)

public class RenewJtbLicenseResourceCommand implements MVCResourceCommand{
	static Log _log = LogFactoryUtil.getLog(RenewJtbLicenseResourceCommand.class);
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static String ROOT_FOLDER_NAME = "JTB Supported Documents";

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("-------------------inside resource command renew---------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String licenseNumber = ParamUtil.getString(resourceRequest, "licenseNumber");
		String typeOfApplication=ParamUtil.getString(resourceRequest, "typeOfApplication");
		System.out.println("----------Type of application--------"+typeOfApplication);
		String accommodationCategoryTypeValAccomodation=ParamUtil.getString(resourceRequest, "accommodationCategoryTypeValAccomodation");
		String otherCategoryTypeVal =ParamUtil.getString(resourceRequest, "otherCategoryTypeVal");
		String attractionCategoryTypeVal =ParamUtil.getString(resourceRequest, "attractionCategoryTypeVal");
		System.out.println("--------------licence no. "+licenseNumber);
		JTBApplication jtbApplication=null;
		JTBApplication jtbApplicationRenewalProcess = null;
		JTBLicenceCertificate licenceCertificate=null;
		JTBPaymentMethod jtbPayment = null;
		String result=null;
		
		long jtbApplicationId=0;
		try {
			try {
				if (Validator.isNotNull(licenseNumber)) {
					System.out.println("-------------if licence no is not null-----------------");
					jtbApplication =JTBApplicationLocalServiceUtil.getJTB_By_AppNum(licenseNumber);
				}
				try {
			        if(jtbApplication.getCaseId()!=null) {
			                licenceCertificate=JTBLicenceCertificateLocalServiceUtil.getJtbLicenceCertiBy_CI(jtbApplication.getCaseId());
			}}catch(Exception e) {}
 
				jtbApplicationId=jtbApplication.getJtbApplicationId();
			}catch (Exception e) {
			}
			try {
				jtbPayment=JTBPaymentMethodLocalServiceUtil.getJTBById(jtbApplicationId);
			}catch(Exception e) {}
			if(Validator.isNull(jtbApplication)) {
				System.out.println("--------------inside jtb application if it is  null -----------------");
				if (Validator.isNull(licenseNumber)){
					System.out.println("---------------------if licence no. not written-----------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
				    resourceResponse.getWriter().write(jsonFeed.toString());
				}else {
					result="false";
			
				String renewUrl = JtbApplicationDataCreationUtil.getApplicationData(themeDisplay, licenseNumber,typeOfApplication,accommodationCategoryTypeValAccomodation,otherCategoryTypeVal,result,attractionCategoryTypeVal);
				jsonOBJ.put("renewLicenseUrl", renewUrl);
				jsonFeed.put("APP_DATA", jsonOBJ);
				resourceResponse.setContentType("application/json");
				resourceResponse.getWriter().print(jsonFeed.toString());
				}
			}else {
				if(jtbApplication.getStatus()==JtbApplicationWorkflowConstant.SUBMITTED) {
					result="true";
					System.out.println("---------------------------after successfully submitted-----------------------");
					if (Validator.isNotNull(licenseNumber)) {  
						try {
							jtbApplicationRenewalProcess = JTBApplicationLocalServiceUtil.getJTB_By_RT_AppNo(JtbApplicationWorkflowConstant.RENEW_APPLICATION,licenseNumber);			
						} catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
					}if(jtbApplicationRenewalProcess==null) {
						JTBCurrentStage renewCurrentStage=null;
						renewCurrentStage= JTBCurrentStageLocalServiceUtil.createJTBCurrentStage(CounterLocalServiceUtil.increment());
						renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
						renewCurrentStage.setLastFormStep("childStep1");
						
		
						System.out.println("---------------------after application form detail----------------");
						
//						if(jtbApplication.getTypeOfApplication().equals("Accommodations Licence")) {
//							if(jtbApplication.getCategoryTypeValAccomo().equals("Home Stay")) {
//							 renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
//							 renewCurrentStage.setLastFormStep("childStep1");
//						}
//						}
//
//						if(jtbApplication.getTypeOfApplication().equals("Attractions")) {
//							 renewCurrentStage.setLastFormStep("childStep7");
//						}
//						
//						if(jtbApplication.getTypeOfApplication().equals("Other Tourism Related Licences")) {
//							 if(jtbApplication.getOtherCategories().equals("Car Rentals")) {
//							      renewCurrentStage.setLastFormStep("childStep9");
//							 }
//							 if(jtbApplication.getOtherCategories().equals("Domestic Tours")) {
//								  renewCurrentStage.setLastFormStep("childStep11");
//							 }
//							 if(jtbApplication.getOtherCategories().equals("Travel Agencies")) {
//								 renewCurrentStage.setLastFormStep("childStep13");
//							 }
//							 if(jtbApplication.getOtherCategories().equals("Water Sports Operators")) {
//								 renewCurrentStage.setLastFormStep("childStep14");
//							 }
//					         if(jtbApplication.getOtherCategories().equals("Contract Carriage")) {
//					        	 renewCurrentStage.setLastFormStep("childStep17");
//					         }
//					         if(jtbApplication.getOtherCategories().equals("Travel Halts")) {
//					        	 renewCurrentStage.setLastFormStep("childStep19");
//					         }
//					         if(jtbApplication.getOtherCategories().equals("Water Sports Employees")) {
//					        	 renewCurrentStage.setLastFormStep("childStep21");
//					         }
//					         if(jtbApplication.getOtherCategories().equals("Bike Rental")) {
//					        	 renewCurrentStage.setLastFormStep("childStep23");
//					         }
//					         if(jtbApplication.getOtherCategories().equals("Craft Traders")) {
//					        	 renewCurrentStage.setLastFormStep("childStep27");
//					         }
//					         
//						}
						
						
							
						jtbApplicationRenewalProcess =JTBApplicationLocalServiceUtil.createJTBApplication(CounterLocalServiceUtil.increment());
						DateFormat df = new SimpleDateFormat("yy");
						String formattedDate = df.format(Calendar.getInstance().getTime());
						SecureRandom random = new SecureRandom();
						int num = random.nextInt(100000);
						String formatted = String.format("%05d", num);
						jtbApplicationRenewalProcess.setCompanyId(themeDisplay.getCompanyId());
						jtbApplicationRenewalProcess.setGroupId(themeDisplay.getScopeGroupId());
						jtbApplicationRenewalProcess.setCreateDate(new Date());
						jtbApplicationRenewalProcess.setUserId(themeDisplay.getUserId());
						jtbApplicationRenewalProcess.setUserName(themeDisplay.getUser().getFullName());
						jtbApplicationRenewalProcess.setExpiredLicenseAppNumber(licenseNumber);
						jtbApplicationRenewalProcess.setApplicationNumber(formatted + "/" + formattedDate);
						jtbApplicationRenewalProcess.setJtbTransactionTypeVal(JtbApplicationWorkflowConstant.RENEW_APPLICATION);
						jtbApplicationRenewalProcess.setStatus(JtbApplicationWorkflowConstant.DRAFT);
						jtbApplicationRenewalProcess.setTypeOfApplication(jtbApplication.getTypeOfApplication());
						jtbApplicationRenewalProcess.setCategoryTypeValAccomo(jtbApplication.getCategoryTypeValAccomo());
						jtbApplicationRenewalProcess.setOtherCategories(jtbApplication.getOtherCategories());
						jtbApplicationRenewalProcess.setAttractionCategoryTypeVal(jtbApplication.getAttractionCategoryTypeVal());
					
						JTBApplicationLocalServiceUtil.updateJTBApplication(jtbApplicationRenewalProcess);
						renewCurrentStage.setJtbApplicationId(jtbApplicationRenewalProcess.getJtbApplicationId());
						JTBCurrentStageLocalServiceUtil.updateJTBCurrentStage(renewCurrentStage);
		
						
						
						copyingDataFromOriginalApplication(jtbApplication.getJtbApplicationId(), jtbApplicationRenewalProcess.getJtbApplicationId());
						ServiceContext serviceContext = new ServiceContext();
						DLFolder originalRootDlFolder = null;
						DLFolder supportingDocsMainFolder = null;
						
						serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), resourceRequest);
						try {
							originalRootDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
							System.out.println("-------------------originalRootDlFolder------------------------"+originalRootDlFolder);

						} catch (PortalException e) {
							_log.error("Error---->>" + e.getMessage());
						}
						try {
							supportingDocsMainFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), originalRootDlFolder.getFolderId(),
									String.valueOf(jtbApplicationId));
                     System.out.println("----------supportingDocsMainFolder--------------"+supportingDocsMainFolder);
							

						} catch (PortalException e) {
							_log.error("Error----->>" + e.getMessage());
						}
						DLFolder copiedDlFolder = null;
						try {
							copiedDlFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
									originalRootDlFolder.getFolderId(), String.valueOf(
											jtbApplicationRenewalProcess.getJtbApplicationId()));
							System.out.println("-----------copiedDlFolder--------------"+copiedDlFolder);
						} catch (Exception e) {
							_log.error("Error----->>" + e.getMessage());
						}
						if (copiedDlFolder == null) {
							System.out.println("-------------inside ---copiedDlFolder------------");
							JtbApplicationDocumentsCopyUtil.copyFolder(themeDisplay.getScopeGroupId(),
									supportingDocsMainFolder.getFolderId(), originalRootDlFolder.getFolderId(),
									String.valueOf(
										 jtbApplicationRenewalProcess.getJtbApplicationId()),
									     supportingDocsMainFolder.getDescription(), serviceContext,
									     supportingDocsMainFolder.getFolderId(), themeDisplay.getUserId(),
									     jtbApplicationRenewalProcess.getJtbApplicationId());

						}
					}
					String expirationDate =Validator.isNotNull(licenceCertificate)&&Validator.isNotNull(licenceCertificate.getExpirationDate())?
							 new SimpleDateFormat("yyyy-MM-dd").format(licenceCertificate.getExpirationDate()):"";
					String issueDate =Validator.isNotNull(licenceCertificate)&&Validator.isNotNull(licenceCertificate.getIssueDate())?
							 new SimpleDateFormat("yyyy-MM-dd").format(licenceCertificate.getIssueDate()):"";
					String paymentMethod=Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getPaymentMethod())?jtbPayment.getPaymentMethod():"";
					System.out.println("--------------paymentMethod--------------------"+paymentMethod);
					String currency=Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getAmountCurrency())?jtbPayment.getAmountCurrency():"";
					System.out.println("--------------currency--------------------"+currency);
					String amount=Validator.isNotNull(jtbPayment)&&Validator.isNotNull(jtbPayment.getAmountPaid())?jtbPayment.getAmountPaid():"";
					System.out.println("--------------amount--------------------"+amount);
					
					if(jtbApplication.getTypeOfApplication().equals("Accommodations Licence")) {
					String renewLicenseUrl = 
							 "/group/guest/tpdco-accommodation-application-form?jtbApplicationId="+jtbApplicationRenewalProcess.getJtbApplicationId()+"&expiration_date="+expirationDate+"&issued_date="+issueDate+"&result="+result;
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
					}
					else if(jtbApplication.getTypeOfApplication().equals("Attractions")||jtbApplication.getTypeOfApplication().equals("Other Tourism Related Licences")){
					String renewLicenseUrl = 
							 "/group/guest/tpdco-attraction-application-form?jtbApplicationId="
									+jtbApplicationRenewalProcess.getJtbApplicationId()+"&expiration_date="+expirationDate+"&issued_date="+issueDate+"&result="+result+"&paymentMethod="+paymentMethod+"&currency="+currency+"&amount="+amount;
					jsonOBJ.put("renewLicenseUrl", renewLicenseUrl);
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
					}
				} else {
					System.out.println("-------------------form not submitted----------------going in else-------------------");
					jsonOBJ.put("licenseNumberCheck", "0");
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					resourceResponse.getWriter().write(jsonFeed.toString());
				}
				}
			
		}
			
		  catch (Exception e) {
			_log.error("Error****************" + e.getMessage());
			_log.error("Error****************" + e.getCause());
		}
		return false;
	}

public static void copyingDataFromOriginalApplication(long jtbApplicationId,
		long jtbRenewalApplicationId) {
	
	 System.out.println("sez renew app id*****"+jtbRenewalApplicationId);
	 
		JTBApplication jtbApplication=null;
		
		try {
			jtbApplication = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		}catch(Exception e) {}
		
		
		//Accomodation Category
	if(jtbApplication.getTypeOfApplication().equals("Accommodations Licence")) {
	 
	 AccoHomeStay application=null;
	 AccoHomeStay renewApplication=null;
	 
	 
	 try {
		 application = AccoHomeStayLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewApplication =AccoHomeStayLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}			 

	 if(application!=null) {
		    renewApplication.setHomeAccoName(application.getHomeAccoName());
			renewApplication.setHomeOwnerName(application.getHomeOwnerName());
			renewApplication.setPropertyAddress(application.getPropertyAddress());
			renewApplication.setHomeTeleNo(application.getHomeTeleNo());
			renewApplication.setHomeMobile(application.getHomeMobile());
			renewApplication.setHomeEmail(application.getHomeEmail());
			renewApplication.setHomeEmployeeNo(application.getHomeEmployeeNo());
			renewApplication.setWebsite(application.getWebsite());
			renewApplication.setPropDirection(application.getPropDirection());
			renewApplication.setNumOfBedrooms(application.getNumOfBedrooms());
			renewApplication.setNumOfGuestBedroom(application.getNumOfGuestBedroom());
			renewApplication.setWithBathroom(application.getWithBathroom());
			renewApplication.setSharedBathroom(application.getSharedBathroom());
			renewApplication.setSignDate(application.getSignDate());
			renewApplication.setCertifiedBy(application.getCertifiedBy());
			renewApplication.setJtbApplicationId(jtbRenewalApplicationId);
			AccoHomeStayLocalServiceUtil.updateAccoHomeStay(renewApplication);
	 }
	}
	 
	 //attraction category----------------------------------
	 
	 if(jtbApplication.getTypeOfApplication().equals("Attractions")) {
	 AttractDetailFormInfo applicantDetail=null;
	 AttractDetailFormInfo renewApplicantDetail=null;
	 
	 try {
		 applicantDetail = AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 try {
				 renewApplicantDetail = AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch (Exception e) {
					_log.error("Error****************" + e.getMessage());
				}
			 
			 if(applicantDetail!=null) {
		
				 renewApplicantDetail.setNewAttractionsOwnerName(applicantDetail.getNewAttractionsOwnerName());
				 renewApplicantDetail.setNewAttractionsMailing(applicantDetail.getNewAttractionsMailing());
				 renewApplicantDetail.setNewAttractionsEmpNum(applicantDetail.getNewAttractionsEmpNum());
				 renewApplicantDetail.setNewAttractionsParish(applicantDetail.getNewAttractionsParish());
				 renewApplicantDetail.setJtbApplicationId(jtbRenewalApplicationId);
				 AttractDetailFormInfoLocalServiceUtil.updateAttractDetailFormInfo(renewApplicantDetail);
			 }

			 //ADDD MORE FIRST
	 
			List<JtbAddCraftApplicantInfo> operatinManager=null;
			 JtbAddCraftApplicantInfo RenewOperatinManager=null;
			 
			 try {
				 operatinManager =JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
						}catch (Exception e) {
							_log.error("Error****************" + e.getMessage());
						}
			 
			 
			 if(operatinManager != null){
					for (JtbAddCraftApplicantInfo jtbAddCraft : operatinManager) {
						RenewOperatinManager= JtbAddCraftApplicantInfoLocalServiceUtil.createJtbAddCraftApplicantInfo(CounterLocalServiceUtil.increment());
						RenewOperatinManager.setCounter(jtbAddCraft.getCounter());
						RenewOperatinManager.setOwnerName(jtbAddCraft.getOwnerName());
						RenewOperatinManager.setOwnerAddress(jtbAddCraft.getOwnerAddress());
						RenewOperatinManager.setOwnerPhoneNo(jtbAddCraft.getOwnerPhoneNo());
						RenewOperatinManager.setOperatingEmail(jtbAddCraft.getOperatingEmail());
						RenewOperatinManager.setJtbApplicationId(jtbRenewalApplicationId);
						JtbAddCraftApplicantInfoLocalServiceUtil.updateJtbAddCraftApplicantInfo(RenewOperatinManager);
	
}
}
	//FORM 2
			 
				AttractionGenDeclareInfo attractiongenDec=null;
				AttractionGenDeclareInfo renewAttractiongenDec=null;
				
				try {
					attractiongenDec=AttractionGenDeclareInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch(Exception e) {}
				try {
					renewAttractiongenDec=AttractionGenDeclareInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				}catch(Exception e) {}
			 
				
				if(attractiongenDec!=null) {
					renewAttractiongenDec.setNewAttractionsGenOwnerName(attractiongenDec.getNewAttractionsGenOwnerName());
					renewAttractiongenDec.setNewAttractionsCompanyLaw(attractiongenDec.getNewAttractionsCompanyLaw());
				    renewAttractiongenDec.setNewAttractionsDate(attractiongenDec.getNewAttractionsDate());
					renewAttractiongenDec.setNewAttractionsName(attractiongenDec.getNewAttractionsName());
					renewAttractiongenDec.setNewAttractionsStartDate(attractiongenDec.getNewAttractionsStartDate());
					renewAttractiongenDec.setNewAttractionsSituatedLand(attractiongenDec.getNewAttractionsSituatedLand());
					renewAttractiongenDec.setNewAttractionsActivities(attractiongenDec.getNewAttractionsActivities());
					renewAttractiongenDec.setAttractionNewDate(attractiongenDec.getAttractionNewDate());
					renewAttractiongenDec.setJtbApplicationId(jtbRenewalApplicationId);
					AttractionGenDeclareInfoLocalServiceUtil.updateAttractionGenDeclareInfo(renewAttractiongenDec);
				}
			 
}
	 
	 
	 
	 //Other Tourism Related Licences Category:-
	 
	 if(jtbApplication.getTypeOfApplication().equals("Other Tourism Related Licences")) {
		 
		 if(jtbApplication.getOtherCategories().equals("Car Rentals")) {
			 
			 //form 1
			 
			 AttractionCarRentalLicence carRentalLicence =null;
			 AttractionCarRentalLicence renewCarRentalLicence =null;
			 
			 try {
				   carRentalLicence=AttractionCarRentalLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {
				}
			 try {
				 renewCarRentalLicence=AttractionCarRentalLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {
				}
				
			 if(carRentalLicence!=null) {
				    renewCarRentalLicence.setNcrApplicantName(carRentalLicence.getNcrApplicantName());
				    renewCarRentalLicence.setNcrAddress(carRentalLicence.getNcrAddress());
				    renewCarRentalLicence.setNcrCompanyName(carRentalLicence.getNcrCompanyName());
				    renewCarRentalLicence.setNcrCompanyAddr(carRentalLicence.getNcrCompanyAddr());
				    renewCarRentalLicence.setNcrTelephone(carRentalLicence.getNcrTelephone());
				    renewCarRentalLicence.setNcrEmail(carRentalLicence.getNcrEmail());
				    renewCarRentalLicence.setNcrDate(carRentalLicence.getNcrDate());
				    renewCarRentalLicence.setNcrManagerName(carRentalLicence.getNcrManagerName());
				    renewCarRentalLicence.setNcrVehiclesNo(carRentalLicence.getNcrVehiclesNo());
				    renewCarRentalLicence.setNcrEmployeesNo(carRentalLicence.getNcrEmployeesNo());
				    renewCarRentalLicence.setNcrPosition(carRentalLicence.getNcrPosition());
		            renewCarRentalLicence.setNcrSignDate(carRentalLicence.getNcrSignDate());
					renewCarRentalLicence.setJtbApplicationId(jtbRenewalApplicationId);
					AttractionCarRentalLicenceLocalServiceUtil.updateAttractionCarRentalLicence(renewCarRentalLicence);	 
			 }
			 
			 //add more
		List<JtbAddBranchDetailInfo> branchDetails=null;
			 JtbAddBranchDetailInfo renewBranchDetails=null;
			 
			 try {
				  branchDetails= JtbAddBranchDetailInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
			  } catch (Exception e) {}
			 
			 
			 if(branchDetails!=null) {
				 
					for (JtbAddBranchDetailInfo addBranch : branchDetails) {
						renewBranchDetails= JtbAddBranchDetailInfoLocalServiceUtil.createJtbAddBranchDetailInfo(CounterLocalServiceUtil.increment());
						renewBranchDetails.setCounter(addBranch.getCounter());
						renewBranchDetails.setBranchOfficeDetails(addBranch.getBranchOfficeDetails());
						renewBranchDetails.setBranchOfficeLocation(addBranch.getBranchOfficeLocation());
						renewBranchDetails.setJtbApplicationId(jtbRenewalApplicationId);
						JtbAddBranchDetailInfoLocalServiceUtil.updateJtbAddBranchDetailInfo(renewBranchDetails);
	
                 }
			 }
			 
			 
			 
			 
			 //form 2
			 
			 AttractionCarRentCondition carRentalCondition =null;
			 AttractionCarRentCondition renewCarRentalCondition=null;
			 
			 try {
				 carRentalCondition=AttractionCarRentConditionLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {
				}
			 try {
				 renewCarRentalCondition=AttractionCarRentConditionLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {
				}
			 
			 if(carRentalCondition!=null) {
				 renewCarRentalCondition.setNcrConditionProp(carRentalCondition.getNcrConditionProp());
				 renewCarRentalCondition.setJtbApplicationId(jtbRenewalApplicationId);
				 AttractionCarRentConditionLocalServiceUtil.updateAttractionCarRentCondition(renewCarRentalCondition);
			 } 
		 }
		 
            if(jtbApplication.getOtherCategories().equals("Domestic Tours")) {
			 
			 //form 1
		 
            	AttractionDomesticTour domesticTour =null;
            	AttractionDomesticTour renewDomesticTour =null;
            	
            	try {
        			domesticTour=AttractionDomesticTourLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewDomesticTour=AttractionDomesticTourLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
		 
		 
		     if(domesticTour!=null) {
		    	    renewDomesticTour.setDomesticTourApplicantName(domesticTour.getDomesticTourApplicantName());
				    renewDomesticTour.setDomesticTourAddress(domesticTour.getDomesticTourAddress());
				    renewDomesticTour.setDomesticTourCompanyName(domesticTour.getDomesticTourCompanyName());
				    renewDomesticTour.setDomesticTourExactLocation(domesticTour.getDomesticTourExactLocation());
				    renewDomesticTour.setDomesticTourTelephone(domesticTour.getDomesticTourTelephone());
				    renewDomesticTour.setDomesticTourEmail(domesticTour.getDomesticTourEmail());
				    renewDomesticTour.setDomesticTourDate(domesticTour.getDomesticTourDate());
				    renewDomesticTour.setDomesticTourManagerName(domesticTour.getDomesticTourManagerName());
				    renewDomesticTour.setDomesticTourVehiclesNum(domesticTour.getDomesticTourVehiclesNum());
				    renewDomesticTour.setDomesticTourEmployeesNo(domesticTour.getDomesticTourEmployeesNo());
				    renewDomesticTour.setDomesticTourSignDate(domesticTour.getDomesticTourSignDate());	
					renewDomesticTour.setJtbApplicationId(jtbRenewalApplicationId);
					AttractionDomesticTourLocalServiceUtil.updateAttractionDomesticTour(renewDomesticTour);
		     }
		     
		     //ADD MORE
		     
		 
		     List<JtbAddBranchDetailInfo> branchDetails=null;
			 JtbAddBranchDetailInfo renewBranchDetails=null;
			 
			 try {
				  branchDetails= JtbAddBranchDetailInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
			  } catch (Exception e) {}
			 
			 
			 if(branchDetails!=null) {
				 
					for (JtbAddBranchDetailInfo addBranch : branchDetails) {
						renewBranchDetails= JtbAddBranchDetailInfoLocalServiceUtil.createJtbAddBranchDetailInfo(CounterLocalServiceUtil.increment());
						renewBranchDetails.setCounter(addBranch.getCounter());
						renewBranchDetails.setBranchOfficeDetails(addBranch.getBranchOfficeDetails());
						renewBranchDetails.setBranchOfficeLocation(addBranch.getBranchOfficeLocation());
						renewBranchDetails.setJtbApplicationId(jtbRenewalApplicationId);
						JtbAddBranchDetailInfoLocalServiceUtil.updateJtbAddBranchDetailInfo(renewBranchDetails);
	
                 }
			 }
			 
			 //FORM 2
			 AttractionDomesticService domesticService =null;
			 AttractionDomesticService renewDomesticService =null;
			 
			 try {
					domesticService=AttractionDomesticServiceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {}
				
			 try {
				 renewDomesticService=AttractionDomesticServiceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
				} catch (Exception e) {}
				
			 
		   if(domesticService!=null) {
			    renewDomesticService.setIndividualsApartment(domesticService.getIndividualsApartment());
		        renewDomesticService.setAirportAssistance(domesticService.getAirportAssistance());
		        renewDomesticService.setEntireTour(domesticService.getEntireTour());
		        renewDomesticService.setTransfersDeparture(domesticService.getTransfersDeparture());
		        renewDomesticService.setIndividualGroups(domesticService.getIndividualGroups());
		        renewDomesticService.setOrganizedconJunction(domesticService.getOrganizedconJunction());
		        renewDomesticService.setDailyTransportation(domesticService.getDailyTransportation());
		        renewDomesticService.setEntertainment(domesticService.getEntertainment());
			    renewDomesticService.setDomesticTourSealDate(domesticService.getDomesticTourSealDate());
			    renewDomesticService.setJtbApplicationId(jtbRenewalApplicationId);
			    AttractionDomesticServiceLocalServiceUtil.updateAttractionDomesticService(renewDomesticService);
		   }	 
	 }
            
            if(jtbApplication.getOtherCategories().equals("Travel Agencies")) {
            	
            	//form 1
            	
            	AttractionTravelAgency travelAgency =null;
            	AttractionTravelAgency renewTravelAgency =null;
            	
            	try {
        			travelAgency=AttractionTravelAgencyLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewTravelAgency=AttractionTravelAgencyLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	if(travelAgency!=null) {
            		renewTravelAgency.setApplicantName(travelAgency.getApplicantName());
            		renewTravelAgency.setAgencyAddress(travelAgency.getAgencyAddress());
                    renewTravelAgency.setAgencyTelephone(travelAgency.getAgencyTelephone());
                    renewTravelAgency.setAgencyName(travelAgency.getAgencyName());
                    renewTravelAgency.setAgencyAddressSec(travelAgency.getAgencyAddressSec());
                    renewTravelAgency.setAgencyTelephoneNum(travelAgency.getAgencyTelephoneNum());
                    renewTravelAgency.setIsRegistered(travelAgency.getIsRegistered());
                    renewTravelAgency.setRegstParticulars(travelAgency.getRegstParticulars());
                    renewTravelAgency.setProprietorName(travelAgency.getProprietorName());
                    renewTravelAgency.setManagerName(travelAgency.getManagerName());
                    renewTravelAgency.setManagerAddress(travelAgency.getManagerAddress());
                    renewTravelAgency.setSecretaryName(travelAgency.getSecretaryName());
                    renewTravelAgency.setSecretaryAddress(travelAgency.getSecretaryAddress());
                    renewTravelAgency.setBankerName(travelAgency.getBankerName());
                    renewTravelAgency.setBondingCompanyName(travelAgency.getBondingCompanyName());
                    renewTravelAgency.setBondingCompanyAddress(travelAgency.getBondingCompanyAddress());
                    renewTravelAgency.setAuditorsName(travelAgency.getAuditorsName());
                    renewTravelAgency.setAuditorsAddress(travelAgency.getAuditorsAddress());
                    renewTravelAgency.setNumberOfEmployees(travelAgency.getNumberOfEmployees());
                    renewTravelAgency.setSignDate(travelAgency.getSignDate());
                    renewTravelAgency.setJtbApplicationId(jtbRenewalApplicationId);
            		AttractionTravelAgencyLocalServiceUtil.updateAttractionTravelAgency(renewTravelAgency);
            	}
            }
            
            if(jtbApplication.getOtherCategories().equals("Water Sports Operators")) {
            	
            	//FORM 1
            	
            	AttractionWaterSport waterSport =null;
            	AttractionWaterSport renewWaterSport =null;
            	
            	try {
        			waterSport=AttractionWaterSportLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewWaterSport=AttractionWaterSportLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	
            	if(waterSport!=null) {
            		renewWaterSport.setWaterSportBusinessName(waterSport.getWaterSportBusinessName());
            	    renewWaterSport.setWaterSportMailingaAdd(waterSport.getWaterSportMailingaAdd());
            	    renewWaterSport.setWaterSportOpLocationAddr(waterSport.getWaterSportOpLocationAddr());
            	    renewWaterSport.setWaterSportOpPhone(waterSport.getWaterSportOpPhone());
            	    renewWaterSport.setWaterSportOpEmail(waterSport.getWaterSportOpEmail());
            	    renewWaterSport.setWaterSportOpOwnerName(waterSport.getWaterSportOpOwnerName());
            	    renewWaterSport.setWaterSportOpAddressOwner(waterSport.getWaterSportOpAddressOwner());
            	    renewWaterSport.setWaterSportOpManagerName(waterSport.getWaterSportOpManagerName());
            	    renewWaterSport.setWaterSportOpApplicantName(waterSport.getWaterSportOpApplicantName());
            	    renewWaterSport.setWaterSportOpNationality(waterSport.getWaterSportOpNationality());
            	    renewWaterSport.setWaterSportOpEmployeesNo(waterSport.getWaterSportOpEmployeesNo());
            	    renewWaterSport.setWaterSportOpActivityList(waterSport.getWaterSportOpActivityList());
            	    renewWaterSport.setOccupyLocation(waterSport.getOccupyLocation());
            	    renewWaterSport.setProposalSubmitted(waterSport.getProposalSubmitted());
            	    renewWaterSport.setForeignNationalsInvolved(waterSport.getForeignNationalsInvolved());
            	    renewWaterSport.setWorkPermitApplied(waterSport.getWorkPermitApplied());
            		renewWaterSport.setJtbApplicationId(jtbRenewalApplicationId);
            		AttractionWaterSportLocalServiceUtil.updateAttractionWaterSport(renewWaterSport);	
            	}
            	
            	
            	
            	//form 2
            	
            	
            	AttractionWaterGenDeclare generalDeclare =null;
            	AttractionWaterGenDeclare renewGeneralDeclare =null;
            	
            	try {
        			generalDeclare=AttractionWaterGenDeclareLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewGeneralDeclare=AttractionWaterGenDeclareLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	if(generalDeclare!=null) {
					
					renewGeneralDeclare.setCpr(generalDeclare.getCpr());
					renewGeneralDeclare.setDivingCertificate(generalDeclare.getDivingCertificate());
					renewGeneralDeclare.setRlss(generalDeclare.getRlss());
			        renewGeneralDeclare.setLifeguard(generalDeclare.getLifeguard());
			        renewGeneralDeclare.setBreathing(generalDeclare.getBreathing());
			        renewGeneralDeclare.setOperationName(generalDeclare.getOperationName());
			        renewGeneralDeclare.setOperationAddress(generalDeclare.getOperationAddress());
			        renewGeneralDeclare.setInsuranceAmount(generalDeclare.getInsuranceAmount());
			        renewGeneralDeclare.setManagerSignDate(generalDeclare.getManagerSignDate());
			        renewGeneralDeclare.setJtbApplicationId(jtbRenewalApplicationId);
				    AttractionWaterGenDeclareLocalServiceUtil.updateAttractionWaterGenDeclare(renewGeneralDeclare);
            	}
            	
            	
            	//form 3
            	
            	  AttractionWaterRequired waterRequirement =null;
            	  AttractionWaterRequired renewWaterRequirement =null;
            	  try {
          			waterRequirement=AttractionWaterRequiredLocalServiceUtil.getAttractionWaterRequired(jtbApplicationId);
          		} catch (Exception e) {}
            	  try {
            		renewWaterRequirement=AttractionWaterRequiredLocalServiceUtil.getAttractionWaterRequired(jtbApplicationId);
          		} catch (Exception e) {}
            	  
            	  
            	  if(waterRequirement!=null) {
            		  
            		  renewWaterRequirement.setGeneralOperator(waterRequirement.getGeneralOperator());
            		  renewWaterRequirement.setWaterCraft(waterRequirement.getWaterCraft());
            	      renewWaterRequirement.setWaterSki(waterRequirement.getWaterSki());
            	      renewWaterRequirement.setSunfishSail(waterRequirement.getSunfishSail());
            	      renewWaterRequirement.setParasail(waterRequirement.getParasail());
            	      renewWaterRequirement.setScubaDiving(waterRequirement.getScubaDiving());
            	      renewWaterRequirement.setGlassBoat(waterRequirement.getGlassBoat());
            	      renewWaterRequirement.setBananaBoat(waterRequirement.getBananaBoat());
            	      renewWaterRequirement.setJtbApplicationId(jtbRenewalApplicationId);
            		  AttractionWaterRequiredLocalServiceUtil.updateAttractionWaterRequired(renewWaterRequirement);
            	  }
            	
            	
            }
            
            if(jtbApplication.getOtherCategories().equals("Contract Carriage")) {
            	//FORM 1
            	
            	AttractionConCarriageInfo contractCarriage =null;
            	AttractionConCarriageInfo renewContractCarriage =null;
            	
            	try {
        			contractCarriage=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewContractCarriage=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	
            	if(contractCarriage!=null) {
            		renewContractCarriage.setOwnerName(contractCarriage.getOwnerName());
            		renewContractCarriage.setHomeAddress(contractCarriage.getHomeAddress());
            		renewContractCarriage.setEmail(contractCarriage.getEmail());
            		renewContractCarriage.setTelephone(contractCarriage.getTelephone());
            		renewContractCarriage.setParish(contractCarriage.getParish());
            		renewContractCarriage.setNewContractDate(contractCarriage.getNewContractDate());
            		renewContractCarriage.setNewContarctVehiclesNo(contractCarriage.getNewContarctVehiclesNo());
            		renewContractCarriage.setNewContractTrn(contractCarriage.getNewContractTrn());
            		renewContractCarriage.setContractOrganization(contractCarriage.getContractOrganization());
            		renewContractCarriage.setJtbApplicationId(jtbRenewalApplicationId);
            		AttractionConCarriageInfoLocalServiceUtil.updateAttractionConCarriageInfo(renewContractCarriage);	
            	}
            	
            	
            	//add more first
            	
            	
            List<JtbAddListVehicleRegst> vehicleRegistration=null;
            	JtbAddListVehicleRegst renewVehicleRegistration=null;
            	
            	 try {
       			  vehicleRegistration= JtbAddListVehicleRegstLocalServiceUtil.getByJtbAppId(jtbApplicationId);
       		  } catch (Exception e) {}
            	 
            	 if(vehicleRegistration!=null) {
            		 
            			for (JtbAddListVehicleRegst vehicleRegst : vehicleRegistration) {
            				renewVehicleRegistration= JtbAddListVehicleRegstLocalServiceUtil.createJtbAddListVehicleRegst(CounterLocalServiceUtil.increment());
            				renewVehicleRegistration.setCounter(vehicleRegst.getCounter());
            				renewVehicleRegistration.setVehicleRegstYear(vehicleRegst.getVehicleRegstYear());
            				renewVehicleRegistration.setVehicleRegstModel(vehicleRegst.getVehicleRegstModel());
            				renewVehicleRegistration.setVehicleRegstPlate(vehicleRegst.getVehicleRegstPlate());
            				renewVehicleRegistration.setVehicleRegstExpDate(vehicleRegst.getVehicleRegstExpDate());
            				renewVehicleRegistration.setVehicleRegstFitnessDate(vehicleRegst.getVehicleRegstFitnessDate());
            				renewVehicleRegistration.setVehicleRegstChassis(vehicleRegst.getVehicleRegstChassis());
            				renewVehicleRegistration.setVehicleRegstBased(vehicleRegst.getVehicleRegstBased());
            				renewVehicleRegistration.setVehicleRegstInsuranceCom(vehicleRegst.getVehicleRegstInsuranceCom());
            				renewVehicleRegistration.setVehicleRegstPolicyNum(vehicleRegst.getVehicleRegstPolicyNum());
            				renewVehicleRegistration.setVehicleRegstExpiryDate(vehicleRegst.getVehicleRegstExpiryDate());
            				renewVehicleRegistration.setJtbApplicationId(jtbRenewalApplicationId);
            				JtbAddListVehicleRegstLocalServiceUtil.updateJtbAddListVehicleRegst(renewVehicleRegistration);
                     }
            	 }
            	 
            	 //add more second
            	 
                   List<JtbAddListDriverInfo> driverList=null;
            		JtbAddListDriverInfo renewDriverList=null;
            		
            		 try {
           			  driverList= JtbAddListDriverInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
           		  } catch (Exception e) {}
            		 
            		 if(driverList!=null) {
            			 for (JtbAddListDriverInfo driverInfo : driverList) {
            				 renewDriverList= JtbAddListDriverInfoLocalServiceUtil.createJtbAddListDriverInfo(CounterLocalServiceUtil.increment());
            				 renewDriverList.setCounter(driverInfo.getCounter());
            				 renewDriverList.setDriverName(driverInfo.getDriverName());
            				 renewDriverList.setDriverLicence(driverInfo.getDriverLicence());
            				 renewDriverList.setDriverExpiryDate(driverInfo.getDriverExpiryDate());
            				 renewDriverList.setJtbApplicationId(jtbRenewalApplicationId);
	            			 JtbAddListDriverInfoLocalServiceUtil.updateJtbAddListDriverInfo(renewDriverList);
            		 }
            	 }
            		 
            		 
            		 //form 2
            		 
            		 AttractionConCarriageInfo contractCarriageGen =null;
            		 AttractionConCarriageInfo renewContractCarriageGen =null;
            			try {
            				contractCarriageGen=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
            			} catch (Exception e) {}
            			try {
            				renewContractCarriageGen=AttractionConCarriageInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
            			} catch (Exception e) {}
            			
            			
            			if(contractCarriageGen!=null) {
            				 renewContractCarriageGen.setOwnerSignDate(contractCarriageGen.getOwnerSignDate());
            				 renewContractCarriageGen.setJtbApplicationId(jtbRenewalApplicationId);
            				 AttractionConCarriageInfoLocalServiceUtil.updateAttractionConCarriageInfo(renewContractCarriageGen);
            					
            			}
            		 
            	
            }
            
            if(jtbApplication.getOtherCategories().equals("Travel Halts")) {
            	
            	//form 1
            	AttractionTravelHaltApp travelHalt =null;
            	AttractionTravelHaltApp renewTravelHalt =null;
            	
            	try {
        			travelHalt=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewTravelHalt=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	
            	if(travelHalt!=null) {
            		
            		renewTravelHalt.setTravelHaltApplicantName(travelHalt.getTravelHaltApplicantName());
            		renewTravelHalt.setTravelHaltAddress(travelHalt.getTravelHaltAddress());
            		renewTravelHalt.setTravelHaltTelephone(travelHalt.getTravelHaltTelephone());
            		renewTravelHalt.setTravelHaltEmail(travelHalt.getTravelHaltEmail());
            		renewTravelHalt.setTravelHaltName(travelHalt.getTravelHaltName());
            		renewTravelHalt.setTravelHaltLocation(travelHalt.getTravelHaltLocation());
                    renewTravelHalt.setTravelHaltTelephoneNum(travelHalt.getTravelHaltTelephoneNum());
                    renewTravelHalt.setTravelHaltEmployeesNo(travelHalt.getTravelHaltEmployeesNo());
                    renewTravelHalt.setTravelHaltSignDate(travelHalt.getTravelHaltSignDate());
                    renewTravelHalt.setJtbApplicationId(jtbRenewalApplicationId);
            		AttractionTravelHaltAppLocalServiceUtil.updateAttractionTravelHaltApp(renewTravelHalt);
            	}
            	
            	
            	//form 2
            	
            	 AttractionTravelHaltApp travelHaltApp =null;
            	 AttractionTravelHaltApp renewTravelHaltApp =null;
         		try {
         			travelHaltApp=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
         		try {
         			renewTravelHaltApp=AttractionTravelHaltAppLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
            	
            	
            	if(travelHaltApp!=null) {
            		
            		renewTravelHaltApp.setGasStation(travelHaltApp.getGasStation());
            		renewTravelHaltApp.setRefreshment(travelHaltApp.getRefreshment());
            		renewTravelHaltApp.setDrinks(travelHaltApp.getDrinks());
            		renewTravelHaltApp.setRestaurant(travelHaltApp.getRestaurant());
            		renewTravelHaltApp.setWirelessinternet(travelHaltApp.getWirelessinternet());
            		renewTravelHaltApp.setRestrooms(travelHaltApp.getRestrooms());
            		renewTravelHaltApp.setJtbApplicationId(jtbRenewalApplicationId);
            	    AttractionTravelHaltAppLocalServiceUtil.updateAttractionTravelHaltApp(renewTravelHaltApp);
            		
            	}
            	
            }
            
            if(jtbApplication.getOtherCategories().equals("Water Sports Employees")) {
            	
            	//form 1
            	 AttractionWaterEmployee waterEmpLic =null;
            	 AttractionWaterEmployee renewWaterEmpLic =null;
            	 
            	 try {
         			waterEmpLic=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
            	 try {
            		 renewWaterEmpLic=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
            	 
            	 if(waterEmpLic!=null) {
            		 renewWaterEmpLic.setApplicantName(waterEmpLic.getApplicantName());
            		 renewWaterEmpLic.setApplicantAddress(waterEmpLic.getApplicantAddress());
            	     renewWaterEmpLic.setApplicantAge(waterEmpLic.getApplicantAge());
            	     renewWaterEmpLic.setApplicantNationality(waterEmpLic.getApplicantNationality());
            	     renewWaterEmpLic.setWorkPermitApplied(waterEmpLic.getWorkPermitApplied());
            	     renewWaterEmpLic.setWorkPermitDate(waterEmpLic.getWorkPermitDate());
            	     renewWaterEmpLic.setQualification(waterEmpLic.getQualification());
            	     renewWaterEmpLic.setPlaceOfEmployment(waterEmpLic.getPlaceOfEmployment());
            	     renewWaterEmpLic.setOwnerName(waterEmpLic.getOwnerName());
            	     renewWaterEmpLic.setJtbApplicationId(jtbRenewalApplicationId);
            		 AttractionWaterEmployeeLocalServiceUtil.updateAttractionWaterEmployee(renewWaterEmpLic); 
            		 
            	 }
            	 
            	 
             //form 2
            	 AttractionWaterEmployee waterEmployee =null;
            	 AttractionWaterEmployee renewWaterEmployee =null;
         		try {
         			waterEmployee=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
         		try {
         			renewWaterEmployee=AttractionWaterEmployeeLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
         		} catch (Exception e) {}
            	
            	
              if(waterEmployee!=null) {
            	  
            	  renewWaterEmployee.setCpr(waterEmployee.getCpr());
            	  renewWaterEmployee.setFirstAid(waterEmployee.getFirstAid());
            	  renewWaterEmployee.setMedicFirstAid(waterEmployee.getMedicFirstAid());
            	  renewWaterEmployee.setLifeguard(waterEmployee.getLifeguard());
            	  renewWaterEmployee.setRescueDiver(waterEmployee.getRescueDiver());
            	  renewWaterEmployee.setOtherRescue(waterEmployee.getOtherRescue());
            	  renewWaterEmployee.setEmployeeSignatureDate(waterEmployee.getEmployeeSignatureDate());
            	  renewWaterEmployee.setTimePeriod(waterEmployee.getTimePeriod());
            	  renewWaterEmployee.setJtbApplicationId(jtbRenewalApplicationId);
	          	  AttractionWaterEmployeeLocalServiceUtil.updateAttractionWaterEmployee(renewWaterEmployee);
	          		
              }
            }		
         		
            if(jtbApplication.getOtherCategories().equals("Bike Rental")) {
            	//FORM 1
            	AttractionBikeRentalInfo bikeRentalInfo =null;
            	AttractionBikeRentalInfo renewBikeRentalInfo =null;
        		try {
        			bikeRentalInfo=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
        		try {
        			renewBikeRentalInfo=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	if(bikeRentalInfo!=null) {
            		
            		renewBikeRentalInfo.setApplicantName(bikeRentalInfo.getApplicantName());
            		renewBikeRentalInfo.setAddress(bikeRentalInfo.getAddress());
            		renewBikeRentalInfo.setCompanyName(bikeRentalInfo.getCompanyName());
            		renewBikeRentalInfo.setExactLocation(bikeRentalInfo.getExactLocation());
            		renewBikeRentalInfo.setTelephone(bikeRentalInfo.getTelephone());
            		renewBikeRentalInfo.setEmail(bikeRentalInfo.getEmail());
            		renewBikeRentalInfo.setRegistrationDate(bikeRentalInfo.getRegistrationDate());
            		renewBikeRentalInfo.setManagerName(bikeRentalInfo.getManagerName());
            		renewBikeRentalInfo.setNumberOfBikes(bikeRentalInfo.getNumberOfBikes());
            		renewBikeRentalInfo.setNumberOfHelmets(bikeRentalInfo.getNumberOfHelmets());
            		renewBikeRentalInfo.setNumberOfEmployees(bikeRentalInfo.getNumberOfEmployees());
            		renewBikeRentalInfo.setSignatureDate(bikeRentalInfo.getSignatureDate());
            		renewBikeRentalInfo.setJtbApplicationId(jtbRenewalApplicationId);
            	    AttractionBikeRentalInfoLocalServiceUtil.updateAttractionBikeRentalInfo(renewBikeRentalInfo);
            	}
            	
            	
            	//FORM 2
            	
            	AttractionBikeRentalInfo bikeRental =null;
            	AttractionBikeRentalInfo renewBikeRental =null;
            	
            	try {
        			bikeRental=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewBikeRental=AttractionBikeRentalInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	
            	if(bikeRental!=null) {
            		renewBikeRental.setMotorBikeIndustry(bikeRental.getMotorBikeIndustry());
            		renewBikeRental.setJtbApplicationId(jtbRenewalApplicationId);
            	    AttractionBikeRentalInfoLocalServiceUtil.updateAttractionBikeRentalInfo(renewBikeRental);
            		
            	}
            }  	
            	
            	
            if(jtbApplication.getOtherCategories().equals("Craft Traders")) {
            	//FORM 1
            	AttractionCraftTrader craftTrader =null;
            	AttractionCraftTrader renewCraftTrader =null;
            	
            	try {
        			craftTrader=AttractionCraftTraderLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
        		} catch (Exception e) {}
            	try {
            		renewCraftTrader=AttractionCraftTraderLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
            	}catch(Exception e) {}
        	
        		
            	if(craftTrader!=null) {
            		renewCraftTrader.setCraftTradersAppliOwner(craftTrader.getCraftTraderAddressOwner());
            		renewCraftTrader.setCraftTradersAppliAddress(craftTrader.getCraftTradersAppliAddress());
            		renewCraftTrader.setCraftTradersAppliPhoneNo(craftTrader.getCraftTradersAppliPhoneNo());
            		renewCraftTrader.setCraftTradersAppliEmail(craftTrader.getCraftTradersAppliEmail());
            		renewCraftTrader.setOccupyLocation(craftTrader.getOccupyLocation());
            		renewCraftTrader.setCraftTraderGoodsType(craftTrader.getCraftTraderGoodsType());
            		renewCraftTrader.setCraftTraderName(craftTrader.getCraftTraderName());
            		renewCraftTrader.setCraftTraderPosition(craftTrader.getCraftTraderPosition());
            		renewCraftTrader.setCraftTraderMinisterAddr(craftTrader.getCraftTraderMinisterAddr());
                    renewCraftTrader.setCraftTraderMinisterName(craftTrader.getCraftTraderMinisterName());
                    renewCraftTrader.setCraftTraderMinisterNamePos(craftTrader.getCraftTraderMinisterNamePos());
                    renewCraftTrader.setCraftTraderAddressOwner(craftTrader.getCraftTraderAddressOwner());
                    renewCraftTrader.setCraftTraderSignDate(craftTrader.getCraftTraderSignDate());
                    renewCraftTrader.setCraftTraderAssistSiDate(craftTrader.getCraftTraderAssistSiDate());
                    renewCraftTrader.setJtbApplicationId(jtbRenewalApplicationId);
            	    AttractionCraftTraderLocalServiceUtil.updateAttractionCraftTrader(renewCraftTrader);
            	}
            	
            	
            	//add more first
            List<JtbAddCraftApplicantInfo> applicant=null;
            	JtbAddCraftApplicantInfo renewApplicant=null;
            	
            	 try {
       			  applicant= JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
       		  } catch (Exception e) {}
            	
            	 if(applicant!=null) {
            		 
         			for (JtbAddCraftApplicantInfo craftApplicant : applicant) {
         				renewApplicant= JtbAddCraftApplicantInfoLocalServiceUtil.createJtbAddCraftApplicantInfo(CounterLocalServiceUtil.increment());
         				renewApplicant.setCounter(craftApplicant.getCounter());
         				renewApplicant.setSellingLocation(craftApplicant.getSellingLocation());
         				renewApplicant.setJtbApplicationId(jtbRenewalApplicationId);
         				JtbAddCraftApplicantInfoLocalServiceUtil.updateJtbAddCraftApplicantInfo(renewApplicant);
         			}
            	 
         		}
            	 
            	 
            //add more second
            List<JtbAddCraftEmployeeInfo> employee=null;
            	 JtbAddCraftEmployeeInfo renewEmployee=null;
            	 
            	  try {
        			  employee= JtbAddCraftEmployeeInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
        		  } catch (Exception e) {}
            	 
            	 if(employee!=null) {
            		 for (JtbAddCraftEmployeeInfo craftApplicant : employee) {
            			 renewEmployee= JtbAddCraftEmployeeInfoLocalServiceUtil.createJtbAddCraftEmployeeInfo(CounterLocalServiceUtil.increment());
            			 renewEmployee.setCounter(craftApplicant.getCounter());
            			 renewEmployee.setEmpName(craftApplicant.getEmpName());
            			 renewEmployee.setEmpAddress(craftApplicant.getEmpAddress());
            			 renewEmployee.setEmpPhoneNo(craftApplicant.getEmpPhoneNo());
            			 renewEmployee.setJtbApplicationId(jtbRenewalApplicationId);
            			 JtbAddCraftEmployeeInfoLocalServiceUtil.updateJtbAddCraftEmployeeInfo(renewEmployee);
            		 
            		 }
            	 }
            	 
            	 
            	 
            	 
            	 
            	
            }
            
            
//            if(jtbApplication.getOtherCategories().equals("Places of Interest/Worship")) {
//            	//form1
//            	AttractionPlaceOfInterest placeOfInterest=null;
//            	AttractionPlaceOfInterest renewPlaceOfInterest=null;
//            	
//            	try {
//            		placeOfInterest=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
//        		} catch (Exception e) {}
//            	try {
//            		renewPlaceOfInterest=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
//        		} catch (Exception e) {}
//            	
//
//            	if(placeOfInterest!=null) {
//            		
//            		renewPlaceOfInterest.setPlaceOfInterest(placeOfInterest.getPlaceOfInterest());
//            		renewPlaceOfInterest.setTypeOfRole(placeOfInterest.getTypeOfRole());
//            		renewPlaceOfInterest.setPlaceInterestOwnerName(placeOfInterest.getPlaceInterestOwnerName());
//            		renewPlaceOfInterest.setNameOfInterestLocation(placeOfInterest.getNameOfInterestLocation());
//            		renewPlaceOfInterest.setPlaceOfInterestLocation(placeOfInterest.getPlaceOfInterestLocation());
//            		renewPlaceOfInterest.setPlaceOfInterestMailing(placeOfInterest.getPlaceOfInterestMailing());
//            		renewPlaceOfInterest.setPlaceOfInterestTelephone(placeOfInterest.getPlaceOfInterestTelephone());
//            		renewPlaceOfInterest.setPlaceOfInterestEmail(placeOfInterest.getPlaceOfInterestEmail());
//            		renewPlaceOfInterest.setPlaceOfInterestEmployeesNo(placeOfInterest.getPlaceOfInterestEmployeesNo());
//            		renewPlaceOfInterest.setPlaceOfInterestParish(placeOfInterest.getPlaceOfInterestParish());
//            	    renewPlaceOfInterest.setJtbApplicationId(jtbRenewalApplicationId);	
//            	    AttractionPlaceOfInterestLocalServiceUtil.updateAttractionPlaceOfInterest(renewPlaceOfInterest);
//            	}
//            	
//            	//form2
//            	 AttractionPlaceOfInterest placeOfInterestGen =null;
//            	 AttractionPlaceOfInterest renewPlaceOfInterestGen =null;
//            	 
//            	 try {
//         			placeOfInterestGen=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
//         		} catch (Exception e) {}
//            	 try {
//            		 renewPlaceOfInterestGen=AttractionPlaceOfInterestLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
//         		} catch (Exception e) {}
//            	
//            	
//            	 if(placeOfInterestGen!=null) {
//            		    renewPlaceOfInterestGen.setPlaceOfInterestHotelLaws(placeOfInterestGen.getPlaceOfInterestHotelLaws());
//            		    renewPlaceOfInterestGen.setPlaceOfInterestDate(placeOfInterestGen.getPlaceOfInterestDate());
//                        renewPlaceOfInterestGen.setPlaceOfInterestName(placeOfInterestGen.getPlaceOfInterestName());
//            			renewPlaceOfInterestGen.setPlaceOfInterestOperating(placeOfInterestGen.getPlaceOfInterestOperating());
//            		    renewPlaceOfInterestGen.setPlaceOfInterestOwnerGenDec(placeOfInterestGen.getPlaceOfInterestOwnerGenDec());
//            			renewPlaceOfInterestGen.setPlaceOfInterestAcresLand(placeOfInterestGen.getPlaceOfInterestAcresLand());
//            			renewPlaceOfInterestGen.setWalkingTour(placeOfInterestGen.getWalkingTour());
//            			renewPlaceOfInterestGen.setCemeteryTour(placeOfInterestGen.getCemeteryTour());
//            			renewPlaceOfInterestGen.setGardenTour(placeOfInterestGen.getGardenTour());
//            			renewPlaceOfInterestGen.setPlaceOfInterestRooms(placeOfInterestGen.getPlaceOfInterestRooms());
//            			renewPlaceOfInterestGen.setPlaceOfInterestTentSpace(placeOfInterestGen.getPlaceOfInterestTentSpace());
//            			renewPlaceOfInterestGen.setPlaceOfInterestShowers(placeOfInterestGen.getPlaceOfInterestShowers());
//            			renewPlaceOfInterestGen.setPlaceOfInterestSanitary(placeOfInterestGen.getPlaceOfInterestSanitary());
//            			renewPlaceOfInterestGen.setPlaceOfInterestSignDate(placeOfInterestGen.getPlaceOfInterestDate());
//            		    renewPlaceOfInterestGen.setJtbApplicationId(jtbRenewalApplicationId);
//            		    AttractionPlaceOfInterestLocalServiceUtil.updateAttractionPlaceOfInterest(renewPlaceOfInterestGen);
//            	 }
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            	 
//            }
//            	
            
            
            
            	
            	
	    }    	
}}       	
            	
            
         		
         		
         		
         		
         		
         		
            	
            
            	
            	
            	
            	
            	
            	
            	
            	
            	
            
            
            	
            	
            	
            	
            	
            	
            	
            	
            	
            
            
            
            
	 
	 
	 
           
	 
	 
	 
	 
	 
	 
     

