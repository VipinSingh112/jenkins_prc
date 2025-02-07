package com.nbp.jtb.application.util;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.security.SecureRandom;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBCurrentStage;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBCurrentStageLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JtbApplicationWorkflowConstant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JtbApplicationDataCreationUtil {
	public static String getApplicationData(ThemeDisplay themeDisplay,String licenseNumber,String typeOfApplication, String accommodationCategoryTypeValAccomodation,String otherCategoryTypeVal,String result,String attractionCategoryTypeVal) {
		JTBApplication jtbApplicationRenewalProcess = null;
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
		jtbApplicationRenewalProcess.setTypeOfApplication(typeOfApplication);
		jtbApplicationRenewalProcess.setCategoryTypeValAccomo(accommodationCategoryTypeValAccomodation);
		jtbApplicationRenewalProcess.setOtherCategories(otherCategoryTypeVal);
		jtbApplicationRenewalProcess.setAttractionCategoryTypeVal(attractionCategoryTypeVal);
	
		JTBApplicationLocalServiceUtil.updateJTBApplication(jtbApplicationRenewalProcess);
		JTBCurrentStage renewCurrentStage=null;
		renewCurrentStage= JTBCurrentStageLocalServiceUtil.createJTBCurrentStage(CounterLocalServiceUtil.increment());
		renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
		renewCurrentStage.setLastFormStep("childStep1");
//		if(typeOfApplication=="Accommodations Licence") {
//		renewCurrentStage.setCurrentStage("TYPE OF TRANSACTION");
//		renewCurrentStage.setLastFormStep("childStep1");
//		}
//		else if(typeOfApplication=="Attractions") {
//		renewCurrentStage.setLastFormStep("childStep7");
//		}
//		else if(typeOfApplication=="Other Tourism Related Licences") {
//		  if(otherCategoryTypeVal=="Car Rentals") {
//			  renewCurrentStage.setLastFormStep("childStep9");
//		  }
//		  if(otherCategoryTypeVal=="Domestic Tours") {
//			  renewCurrentStage.setLastFormStep("childStep11");
//		  }
//		  if(otherCategoryTypeVal=="Travel Agencies") {
//			  renewCurrentStage.setLastFormStep("childStep13");
//		  }
//		  if(otherCategoryTypeVal=="Water Sports Operators") {
//			  renewCurrentStage.setLastFormStep("childStep14");
//		  }
//		  if(otherCategoryTypeVal=="Contract Carriage") {
//			  renewCurrentStage.setLastFormStep("childStep17");
//		  }
//		  if(otherCategoryTypeVal=="Travel Halts") {
//			  renewCurrentStage.setLastFormStep("childStep19");
//		  }
//		  if(otherCategoryTypeVal=="Water Sports Employees") {
//			  renewCurrentStage.setLastFormStep("childStep21");
//		  }
//		  if(otherCategoryTypeVal=="Bike Rental") {
//			  renewCurrentStage.setLastFormStep("childStep23");
//		  }
//		  if(otherCategoryTypeVal=="Craft Traders") {
//			  renewCurrentStage.setLastFormStep("childStep27");
//		  }
//			
//		}

		renewCurrentStage.setJtbApplicationId(jtbApplicationRenewalProcess.getJtbApplicationId());
		JTBCurrentStageLocalServiceUtil.updateJTBCurrentStage(renewCurrentStage);
		System.out.println("renewCurrentStage in random number --------"+renewCurrentStage);
		System.out.println("typeOfApplication************************"+typeOfApplication);
		String renewLicenseUrl="";
		if(typeOfApplication.equals("Accommodations Licence")){
			System.out.println("-----------INSIDE URL------------");
		renewLicenseUrl =  "/group/guest/tpdco-accommodation-application-form?jtbApplicationId="
				+jtbApplicationRenewalProcess.getJtbApplicationId()+"&_permitNumber="+licenseNumber+"&result="+result;
		}
		else if(typeOfApplication.equals("Attractions")||typeOfApplication.equals("Other Tourism Related Licences")){
	    renewLicenseUrl =  "/group/guest/tpdco-attraction-application-form?jtbApplicationId="
					+jtbApplicationRenewalProcess.getJtbApplicationId()+"&_permitNumber="+licenseNumber+"&result="+result;		
		}
		return renewLicenseUrl;
	
	}
	}

		
	
	
