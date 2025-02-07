package com.nbp.ncbj.application.form.web.portlet;

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
import com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.service.NcbjApplicantDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjApplicationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjOrgDetailInfoLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjPremisesLocationLocalServiceUtil;
import com.nbp.ncbj.application.form.service.service.NcbjSectionFourLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationWorkflowConstant;

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

@Component(immediate = true, property = { "javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/submit/ncbj/application" }, service = MVCResourceCommand.class)
public class SubmitNCBJApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitNCBJApplicationResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String typeOfCertification = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfCertification"));
		String typeOfTransaction = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
		String iso9001CertificationValue = HtmlUtil
				.escape(ParamUtil.getString(resourceRequest, "iso9001CertificationValue"));
		String numberOfSite = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "numberOfSite"));
		String ncbjServiceSurveillanceVal = ParamUtil.getString(resourceRequest, "ncbjServiceSurveillanceVal");
		String ncbjCertifiedClientServiceVal = HtmlUtil.escape(ParamUtil.getString(resourceRequest, "ncbjCertifiedClientServiceVal"));
		String iso22000CertificationValue = HtmlUtil
				.escape(ParamUtil.getString(resourceRequest, "iso22000CertificationValue"));
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");

		DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		NcbjApplication application = null;
		String checkPdfDownloadWithoutDocument = "false";
		if (ncbjApplicationId > 0) {
			try {
				application = NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
			} catch (PortalException e) {
			}
		} else {
			application = NcbjApplicationLocalServiceUtil
					.createNcbjApplication(CounterLocalServiceUtil.increment(NcbjApplication.class.getName()));
		}
		application.setTypeOfCertification(typeOfCertification);
		application.setTypeOfTransaction(typeOfTransaction);
		application.setIso9001CertificationValue(iso9001CertificationValue);
		application.setNumberOfSite(numberOfSite);
		application.setIso22000CertificationValue(iso22000CertificationValue);
		application.setTypeOfServices(ncbjCertifiedClientServiceVal);
		application.setSubCategoryServices(ncbjServiceSurveillanceVal);
		application.setStatus(NCBJApplicationWorkflowConstant.DRAFT);
		if (Validator.isNull(application.getApplicationNumber())) {
			_log.info("inside if--------------------------------");
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		NcbjApplicationLocalServiceUtil.updateNcbjApplication(application);
		jsonOBJ.put("NCBJApplicationId", application.getNcbjApplicationId());
		jsonOBJ.put("NCBJAppNum", application.getApplicationNumber());
		jsonOBJ.put("appStatus", NCBJApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", application.getTypeOfCertification());
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
			
			
			
			
			
			JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
			
			jsonObject.put("solutionType", "POAFN_ProcessingofApplicationsforISO9001and22000Certifications");
			propertiesObject1.put("key", "POAFN_CaseOrigination");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);
			propertiesObject9.put("key", "POAFN_Transaction");
			propertiesObject9.put("value", application.getApplicationNumber());
			jsonArray.put(propertiesObject9);
			propertiesObject7.put("key", "POAFN_TypeofCertification");
			if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
		    propertiesObject7.put("value", "ISO 9001-2015");
		    
			propertiesObject2.put("key", "POAFN_TypeofTransaction");
			if(typeOfTransaction.equals("New Client")) {
			   propertiesObject2.put("value", "New Client");
			   
				  propertiesObject3.put("key", "POAFN_TypeofTransactionNewClient");
				  if(iso9001CertificationValue.equals("ISO 9001")) {
					propertiesObject3.put("value", "New Certification");
					
					propertiesObject8.put("key", "POAFN_NumberofSites");
					if(numberOfSite.equals("Single Site/Location")) {
						propertiesObject8.put("value", "Single Site/Location");
					}else if(numberOfSite.equals("Multiple Sites more than one Location")) {
						propertiesObject8.put("value", "Multiple Sites more than one location");
					}
					
					jsonArray.put(propertiesObject8);
					
					
					
				  }else if(iso9001CertificationValue.equals("Transfer to NCBJ")) {
					propertiesObject3.put("key", "Transfer to NCBJ"); 
					
//					propertiesObject4.put("key", "POAFN_TransferReason");
//					propertiesObject4.put("value", "");
//					 jsonArray.put(propertiesObject4);
					
					
				  }
				  jsonArray.put(propertiesObject3);
				  
					//First BO
					
//					List<NcbjBusinessDetailAdd> businessDetail = null;
//					try {
//
//						businessDetail = NcbjBusinessDetailAddLocalServiceUtil.getNCBJById(ncbjApplicationId);
//						JSONObject businessDetailJsonObj = new JSONFactoryUtil().createJSONObject();
//						businessDetailJsonObj.put("key", "TPDCO_AttractionOperatorManagerBO");
//						JSONObject businessDetailValueJsonObj = new JSONFactoryUtil().createJSONObject();
//						JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
//						if (businessDetail != null) {
//							for (NcbjBusinessDetailAdd businessValues : businessDetail) {
//								JSONObject propertiesObject35 = new JSONFactoryUtil().createJSONObject();
//								JSONObject propertiesObject36 = new JSONFactoryUtil().createJSONObject();
//								JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
//								JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
//								JSONObject propertiesObject39 = new JSONFactoryUtil().createJSONObject();
//								JSONObject propertiesObject40 = new JSONFactoryUtil().createJSONObject();
//								JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
//								JSONObject businessDetailListObjectValueJsonObject = new JSONFactoryUtil()
//										.createJSONObject();
//								propertiesObject35.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_BusinessAddressandPhysicalLocationofPremises");
//								propertiesObject35.put("value", businessValues.getBusinessAddress());
//								jsonArrayProp.put(propertiesObject35);
//
//								propertiesObject36.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_HeadOffice");
//								propertiesObject36.put("value", businessValues.getHeadOffices());
//								jsonArrayProp.put(propertiesObject36);
//
//								propertiesObject37.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_Numberoffulltimeemployees");
//								propertiesObject37.put("value", businessValues.getNoOfFullTimeEmployees());
//								jsonArrayProp.put(propertiesObject37);
//
//								propertiesObject38.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_Numberofparttimeemployees");
//								propertiesObject38.put("value", businessValues.getNoOfPartTimeEmployees());
//								jsonArrayProp.put(propertiesObject38);
//								
//								propertiesObject39.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_Numberofcontractedworkers");
//								propertiesObject39.put("value", businessValues.getNoOfContractedWorkers());
//								jsonArrayProp.put(propertiesObject39);
//								
//								propertiesObject40.put("name", "POAFN_NumberofEffectivePersonnel.POAFN_Numberofcontractors");
//								propertiesObject40.put("value", businessValues.getNoOfContractors());
//								jsonArrayProp.put(propertiesObject40);
//
//								businessDetailListObjectValueJsonObject.put("properties", jsonArrayProp);
//								jsonArrayObjects.put(businessDetailListObjectValueJsonObject);
//							}
//							businessDetailValueJsonObj.put("objects", jsonArrayObjects);
//						}
//						businessDetailJsonObj.put("value", businessDetailValueJsonObj);
//						jsonArray.put(businessDetailJsonObj);
//					} catch (Exception e) {
//					}

					//second details stage
					
					NcbjApplicantDetail preferredDate=null;
					try {
						preferredDate=NcbjApplicantDetailLocalServiceUtil.getNCBJById(ncbjApplicationId);
					 
						
						propertiesObject11.put("key", "POAFN_Stage1");
						propertiesObject11.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getStageOne())
								? bpmDateFormat.format(preferredDate.getStageOne())
								: "");
						jsonArray.put(propertiesObject11);
						
						propertiesObject12.put("key", "POAFN_Stage2");
						propertiesObject12.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getStageTwo())
								? bpmDateFormat.format(preferredDate.getStageTwo())
										: "");
						jsonArray.put(propertiesObject12);
						
						propertiesObject13.put("key", "POAFN_Surveillanceaudit");
						propertiesObject13.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getSurveillanceAudit())
								? bpmDateFormat.format(preferredDate.getSurveillanceAudit())
										: "");
						jsonArray.put(propertiesObject13);
						
						propertiesObject14.put("key", "POAFN_Recertificationaudit");
						propertiesObject14.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getRecertificationAudit())
								? bpmDateFormat.format(preferredDate.getRecertificationAudit())
										: "");
						jsonArray.put(propertiesObject14);
						
						propertiesObject15.put("key", "POAFN_Preassessmentaudit");
						propertiesObject15.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getPreAassessmentAudit())
								? bpmDateFormat.format(preferredDate.getPreAassessmentAudit())
										: "");
						jsonArray.put(propertiesObject15);
						
						propertiesObject16.put("key", "POAFN_Anyotherservices");
						propertiesObject16.put("value", Validator.isNotNull(preferredDate)
								&& Validator.isNotNull(preferredDate.getAnyOtherService())
								? bpmDateFormat.format(preferredDate.getAnyOtherService())
										: "");
						
						jsonArray.put(propertiesObject16);
						
                  }catch(Exception e) {}
                	
					
					//second form  organisation
					
					NcbjOrgDetailInfo orgDetailInfo=null;
					
					try {
						orgDetailInfo= NcbjOrgDetailInfoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);	
						
						propertiesObject17.put("key", "POAFN_CompanyDetails.POAFN_CompanyName");
						propertiesObject17.put("value",orgDetailInfo.getNewCompanyName());
						jsonArray.put(propertiesObject17);
						
						propertiesObject18.put("key", "POAFN_CompanyDetails.POAFN_MailingAddress");
						propertiesObject18.put("value", orgDetailInfo.getMailingAddress());
						jsonArray.put(propertiesObject18);
						
						propertiesObject19.put("key", "POAFN_CompanyDetails.POAFN_Parish");
						propertiesObject19.put("value", orgDetailInfo.getCity());
						jsonArray.put(propertiesObject19);
						
						propertiesObject20.put("key","POAFN_CompanyDetails.POAFN_PostalCode");
						propertiesObject20.put("value",orgDetailInfo.getPostalCode());
						jsonArray.put(propertiesObject20);
						
						propertiesObject21.put("key","POAFN_CompanyDetails.POAFN_PhysicalAddress");
						propertiesObject21.put("value",orgDetailInfo.getPhysicalAddress());
						jsonArray.put(propertiesObject21);
						
						propertiesObject22.put("key","POAFN_CompanyDetails.POAFN_Country");
						propertiesObject22.put("value",orgDetailInfo.getCountry());
						jsonArray.put(propertiesObject22);
						
						propertiesObject23.put("key","POAFN_CompanyDetails.POAFN_HeadofCompany");
						propertiesObject23.put("value",orgDetailInfo.getCompanyHead());
						jsonArray.put(propertiesObject23);
						
						propertiesObject24.put("key","POAFN_CompanyDetails.POAFN_HeadofCompanyPosition");
						propertiesObject24.put("value",orgDetailInfo.getCompanyTitle());
						jsonArray.put(propertiesObject24);
						
						propertiesObject25.put("key","POAFN_CompanyDetails.POAFN_CompanyContactName");
						propertiesObject25.put("value",orgDetailInfo.getCompanyContact());
						jsonArray.put(propertiesObject25);
						
						propertiesObject26.put("key","POAFN_CompanyDetails.POAFN_CompanyContactPosition");
						propertiesObject26.put("value",orgDetailInfo.getCompanyContactTitle());
						jsonArray.put(propertiesObject26);
						
						propertiesObject27.put("key","POAFN_CompanyDetails.POAFN_TelephoneNumber");
						propertiesObject27.put("value",orgDetailInfo.getCompanyTelephone());
						jsonArray.put(propertiesObject27);
						
						propertiesObject28.put("key","POAFN_CompanyDetails.POAFN_FaxNumber");
						propertiesObject28.put("value",orgDetailInfo.getCompanyFax());
						jsonArray.put(propertiesObject28);
						
						propertiesObject29.put("key","POAFN_CompanyDetails.POAFN_EmailAddress");
						propertiesObject29.put("value",orgDetailInfo.getCompanyEmail());
						jsonArray.put(propertiesObject29);
						
						propertiesObject30.put("key","POAFN_CompanyDetails.POAFN_CompanyWebsite");
						propertiesObject30.put("value",orgDetailInfo.getCompanyWebsite());
						jsonArray.put(propertiesObject30);
						
//						propertiesObject31.put("key","POAFN_ScopeofCertificationMulti");
//						propertiesObject31.put("value",orgDetailInfo.getCertificationScope());
//						jsonArray.put(propertiesObject31);
						
						
						if (orgDetailInfo.getCertifiedManagement().equals("Yes")) {
							propertiesObject34.put("key","POAFN_ExistingCertifiedManagementSystem");
							propertiesObject34.put("value", "Yes");
						} else if (orgDetailInfo.getCertifiedManagement().equals("No")) {
							propertiesObject34.put("key","POAFN_ExistingCertifiedManagementSystem");
							propertiesObject34.put("value", "No");
						} else if (orgDetailInfo.getCertifiedManagement().equals("")) {
							propertiesObject34.put("key","POAFN_ExistingCertifiedManagementSystem");
							propertiesObject34.put("value", "");
						}
						jsonArray.put(propertiesObject34);
						
						propertiesObject33.put("key","POAFN_IndicateStandard");
						propertiesObject33.put("value",orgDetailInfo.getIndicateStandard());
						jsonArray.put(propertiesObject33);
						
						propertiesObject41.put("key", "POAFN_HasItBeen");
						if (orgDetailInfo.getCertifiedAccreditedCerti().equals("Yes")) {
							propertiesObject41.put("value", "Yes");
						} else if (orgDetailInfo.getCertifiedAccreditedCerti().equals("No")) {
							propertiesObject41.put("value", "No");
						} else if (orgDetailInfo.getCertifiedAccreditedCerti().equals("")) {
							propertiesObject41.put("value", "");
						}
						jsonArray.put(propertiesObject41);
						
						
						propertiesObject42.put("key", "POAFN_NameofCertificationBody");
						propertiesObject42.put("value", orgDetailInfo.getCeritificationBodyName());
						jsonArray.put(propertiesObject42);
						
						propertiesObject43.put("key", "POAFN_HasYourCompany");
						if (orgDetailInfo.getCompanyUsedConsulting().equals("Yes")) {
							propertiesObject43.put("value", "Yes");
							
							propertiesObject44.put("key", "POAFN_NameofConsultingFirm");
							propertiesObject44.put("value",orgDetailInfo.getConsultingFirm());
							jsonArray.put(propertiesObject44);
							
//							propertiesObject45.put("key", "POAFN_ConsultantsName");
//							propertiesObject45.put("value",orgDetailInfo.getConsultant());
//							jsonArray.put(propertiesObject45);
							
							propertiesObject46.put("key", "POAFN_FirmTelephoneNumber");
							propertiesObject46.put("value",orgDetailInfo.getTelephone());
							jsonArray.put(propertiesObject46);
							
							propertiesObject47.put("key", "POAFN_EmailAddressofFirm");
							propertiesObject47.put("value",orgDetailInfo.getConsultant());
							jsonArray.put(propertiesObject47);
							
							
							
							
						} else if (orgDetailInfo.getCompanyUsedConsulting().equals("No")) {
							propertiesObject43.put("value", "No");
						} else if (orgDetailInfo.getCompanyUsedConsulting().equals("")) {
							propertiesObject43.put("value", "");
						}
						jsonArray.put(propertiesObject43);
						
					}catch(Exception e) {}
				
            }else if(typeOfTransaction.equals("NCBJ Certified Clients")) {
			      propertiesObject2.put("value", "NCBJ Certified Client");	
			      
			      propertiesObject5.put("key", "POAFN_TypeofTransactionNCBJCertifiedClient");
			      if(ncbjCertifiedClientServiceVal.equals("Recertification")) {
			      propertiesObject5.put("value", "Recertification");
			      
			      propertiesObject10.put("key", "POAFN_NCBJCertification");
			      propertiesObject10.put("value", application.getExpiredLicenseAppNumber());
			      jsonArray.put(propertiesObject10); 
			      
			      }else if(ncbjCertifiedClientServiceVal.equals("Surveillance")) {
			      propertiesObject5.put("value", "Surveillance");  
			         
			           propertiesObject6.put("key", "POAFN_Surveillance");
			         if(ncbjServiceSurveillanceVal.equals("First Surveillance")) {
			           propertiesObject6.put("value", "First Surveillance"); 
			         }else if(ncbjServiceSurveillanceVal.equals("Second Surveillance")) {
			           propertiesObject6.put("value", "Second Surveillance"); 
			         }else if(ncbjServiceSurveillanceVal.equals("Third Surveillance")) {
			           propertiesObject6.put("value", "Third Surveillance"); 
			         }else if(ncbjServiceSurveillanceVal.equals("Fourth Surveillance")) {
			           propertiesObject6.put("value", "Fourth Surveillance"); 
			         }
			         jsonArray.put(propertiesObject6); 

			      }
			      jsonArray.put(propertiesObject5); 
			      
			      
			  }
			  jsonArray.put(propertiesObject2);
			
		
			}else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
				propertiesObject7.put("value", "ISO 22000- 2018");
				
				propertiesObject48.put("key", "POAFN_TypeofTransaction");
				if(typeOfTransaction.equals("New Client")) {
					propertiesObject48.put("value", "New Client");
					
					propertiesObject49.put("key", "POAFN_NumberofSites");
					if(numberOfSite.equals("Single Site/Location")) {
						propertiesObject49.put("value", "Single Site/Location");
					}else if(numberOfSite.equals("Multiple Sites more than one Location")) {
						propertiesObject49.put("value", "Multiple Sites more than one location");
					}
					 jsonArray.put(propertiesObject49);
					 
					 
//					 propertiesObject58.put("key", "POAFN_ISO22000Certification");
//					 
//					 String[] iso22000 = iso22000CertificationValue.split(";");
//						JSONArray certificationValue = new JSONFactoryUtil().createJSONArray();
//						for (String str : iso22000) {
//							if (str.contains("CII - Perishable Animal Products E.g Production of Animal Products including Fish, Seafood, Meat, Eggs, Dairy, Fish Products ")) {
//								certificationValue.put("CI – Processing of perishable animal products");
//							} else if (str.contains("CII - Perishable Plant Produce E,g. Fruits, Fresh Juices, Vegetables, Grains, Nuts and Pulses ")) {
//								certificationValue.put("CII – Processing of perishable plant products");
//							} else if (str.contains("CIII - Perishable Animal & Plant Products (Mixed Products) E,g. Pizza, Patty, Sandwich, Ready-to-eat Meals ")) {
//								certificationValue.put("CIII – Processing of perishable animal and plant products (mixed products)");
//							} else if (str.contains("CIII - Ambient Stable Products E,g. Pizza, Patty, Sandwich, Ready-to-eat Meals Production of food products from any source that are stored and sold at ambient temperature, including canned foods, biscuits, snacks, oil, drinking water, beverages, pasta, flour, sugar, food-grade salt.")) {
//							    certificationValue.put(" CIV – Processing of ambient stable products");
//						} 
//							propertiesObject58.put("value", certificationValue);
//						}
//						jsonArray.put(propertiesObject58);
//					 
//					 

					//second details stage
						
						NcbjSectionFour consultService=null;
						try {
							consultService= NcbjSectionFourLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
							
							propertiesObject50.put("key", "POAFN_Stage1");
							propertiesObject50.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultStageOne())
									? bpmDateFormat.format(consultService.getConsultStageOne())
									: "");
							jsonArray.put(propertiesObject50);
							
							propertiesObject51.put("key", "POAFN_Stage2");
							propertiesObject51.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultStageTwo())
									? bpmDateFormat.format(consultService.getConsultStageTwo())
											: "");
							jsonArray.put(propertiesObject51);
							
							propertiesObject52.put("key", "POAFN_Surveillanceaudit");
							propertiesObject52.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultSurveillanceAudit())
									? bpmDateFormat.format(consultService.getConsultSurveillanceAudit())
											: "");
							jsonArray.put(propertiesObject52);
							
							propertiesObject53.put("key", "POAFN_Recertificationaudit");
							propertiesObject53.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultRecertificationAudit())
									? bpmDateFormat.format(consultService.getConsultRecertificationAudit())
											: "");
							jsonArray.put(propertiesObject53);
							
							propertiesObject54.put("key", "POAFN_Preassessmentaudit");
							propertiesObject54.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultPreassessmentAudit())
									? bpmDateFormat.format(consultService.getConsultPreassessmentAudit())
											: "");
							jsonArray.put(propertiesObject54);
							
							propertiesObject55.put("key", "POAFN_Anyotherservices");
							propertiesObject55.put("value", Validator.isNotNull(consultService)
									&& Validator.isNotNull(consultService.getConsultOtherService())
									? bpmDateFormat.format(consultService.getConsultOtherService())
											: "");
							
							jsonArray.put(propertiesObject55);
							
							
							propertiesObject59.put("key","POAFN_HasYourCompany");
							if (consultService.getConsultService().equals("Yes")) {
								propertiesObject59.put("value", "Yes");
								
								propertiesObject60.put("key", "POAFN_FirmTelephoneNumber");
								propertiesObject60.put("value", consultService.getConsultTelephone());
								jsonArray.put(propertiesObject60);
								
								propertiesObject61.put("key", "POAFN_EmailAddressofFirm");
								propertiesObject61.put("value", consultService.getConsultEmail());
								jsonArray.put(propertiesObject61);
								
							} else if (consultService.getConsultService().equals("No")) {
								propertiesObject59.put("value", "No");
							} else if (consultService.getConsultService().equals("")) {
								propertiesObject59.put("value", "");
							}
							jsonArray.put(propertiesObject59);
							
					
							
	                    }catch(Exception e) {}
						
						NcbjPremisesLocation premisesLocation=null;
						try {
							premisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
							
							propertiesObject56.put("key","POAFN_Question4");
							if (premisesLocation.getActivityExclusion().equals("Yes")) {
								propertiesObject56.put("value", "Yes");
								
								propertiesObject57.put("key", "POAFN_ExclusionDescription");
								propertiesObject57.put("value", premisesLocation.getTransferReasonAct());
								jsonArray.put(propertiesObject57);
								
							} else if (premisesLocation.getActivityExclusion().equals("No")) {
								propertiesObject56.put("value", "No");
							} else if (premisesLocation.getActivityExclusion().equals("")) {
								propertiesObject56.put("value", "");
							}
							jsonArray.put(propertiesObject56);
							
							
							propertiesObject62.put("key", "POAFN_DraftScope");
							propertiesObject62.put("value", premisesLocation.getTransferReasonDraft());
							jsonArray.put(propertiesObject62);
				
						} catch (Exception e) {
						}
					
				}else if(typeOfTransaction.equals("NCBJ Certified Clients")) {
					propertiesObject48.put("value", "NCBJ Certified Client");	
				}
				
				 jsonArray.put(propertiesObject48);
				

			}
			
			jsonArray.put(propertiesObject7);
			jsonObject.put("properties", jsonArray);
		
		String ncbjDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
				+ "/ncbj-dashboard?ncbjApplicationId=";
		ncbjDashboarUrl = ncbjDashboarUrl + String.valueOf(application.getNcbjApplicationId());
		
		_log.info("Requesut body--------------" + jsonObject.toString());
		String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("icm-launch-case-url");
		_log.info("*************launchCaseUrl in ncbj************" + launchCaseUrl);
		String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("create-case-endpoint");
		_log.info("*************createCaseEndPoint in ncbj************" + createCaseEndPoint);
		Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("bpm-enabled");
		_log.info("*************isBPMEnabled in ncbj************" + isBPMEnabled);
//		String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
		String token = null;
		String objectStoreValue= null;
		try {
			token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		try {
			objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"111",launchCaseUrl);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		_log.info("*************Object Store Called in ncbj************" + objectStoreValue);
		if (isBPMEnabled) {
			Unirest.setTimeouts(20000, 120000);
			HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
					.header("Accept", "application/json").header("Content-Type", "application/json")
					.body(jsonObject.toString()).asString();
			_log.info("Response body--------------" + response.getBody());
			_log.info("Response code--------------" + response.getCode());
//			_log.info("*************Object Store Called in ncbj Status************" + objectStore);
			JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
			String caseId = responseJsonObj.getString("caseid");
			String path = responseJsonObj.getString("path");

			if (response.getCode() == HttpStatus.SC_OK) {
				NcbjApplication submitNcbjApplication = NcbjApplicationLocalServiceUtil.getNcbjApplication(ncbjApplicationId);
				submitNcbjApplication.setCaseId(caseId);
				submitNcbjApplication.setIcmDocumentsPath(path);
				submitNcbjApplication.setStatus(NCBJApplicationWorkflowConstant.SUBMITTED);
				NcbjApplicationLocalServiceUtil.updateNcbjApplication(submitNcbjApplication);
				jsonOBJ.put("NCBJApplicationId", application.getNcbjApplicationId());
				jsonOBJ.put("NCBJAppNum", submitNcbjApplication.getApplicationNumber());
				jsonOBJ.put("appStatus", NCBJApplicationWorkflowConstant.SUBMITTED_Label);
				jsonOBJ.put("category", application.getTypeOfCertification());
				jsonFeed.put("APP_DATA", jsonOBJ);
		
				DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
						themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
						"NCBJ Supported Documents");
				DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
						themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
						String.valueOf(submitNcbjApplication.getNcbjApplicationId()));
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
					if(submitNcbjApplication.getTypeOfCertification().equals("ISO 9001-2015 Certification")) {
						if((submitNcbjApplication.getNumberOfSite().equals("Single Site/Location"))||submitNcbjApplication.getNumberOfSite().equals("Multiple Sites more than one Location"))  {
					    for (Folder allSupportingFolder : folder) {
						if (!allSupportingFolder.getName().equals("NCBJ Application Form PDF")
								&& !allSupportingFolder.getName().equals("Signature of Applicant")) {
							specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
							fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
									specificFolder.getFolderId());
							for (DLFileEntry dlfile : fileEntries) {
								filez.add(generateFileByInputStream(dlfile));
							}
						}
					}
				}
		    }else if(submitNcbjApplication.getTypeOfCertification().equals("ISO 22000-2018 Certification")) {
		    	for (Folder allSupportingFolder : folder) {
					if (!allSupportingFolder.getName().equals("NCBJ Application Form PDF")
							&& !allSupportingFolder.getName().equals("Signature")) {
						specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
						fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
								specificFolder.getFolderId());
						for (DLFileEntry dlfile : fileEntries) {
							filez.add(generateFileByInputStream(dlfile));
						}
					}
				}
		    }
					
					
					
					
					
		}catch(Exception e) {}
				
				// pdf going across the BPM
				String pdfTemplate = "";
				pdfTemplate = commonsUtil.replacNcbjAppPdfVar(submitNcbjApplication.getTypeOfCertification(),submitNcbjApplication.getNumberOfSite(),
						ncbjApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);

				System.out.println("NCBJ LAUNCH CASE TEMPLATE******" + pdfTemplate);
				//ISO 9001-2015 Certification
				if(typeOfCertification.equals("ISO 9001-2015 Certification")) {
					if(typeOfTransaction.equals("New Client")) {
				
					File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
							"New Client 9001 Pdf", pdfTemplate);
					filez.add(file);
				   }else if(typeOfTransaction.equals("NCBJ Certified Clients")) {
				    File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
							"NCBJ Certified Clients 9001 Pdf", pdfTemplate);
					filez.add(file);  
				   }
			}
				//ISO 22000-2018 Certification
				else if(typeOfCertification.equals("ISO 22000-2018 Certification")) {
					if(numberOfSite.equals("Single Site/Location")) {
					File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
							"Single Site 22000 Pdf ", pdfTemplate);
					filez.add(file);
					}else if(numberOfSite.equals("Multiple Sites more than one Location")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Multiple Sites 22000 Pdf ", pdfTemplate);
						filez.add(file);	
					}
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

				
		// Sending Email After Form Submission
		try {
			String CategoryTypeUpperCase = application.getTypeOfCertification().toUpperCase();
			String subcategoryUpperCase = application.getTypeOfTransaction().toUpperCase();
			String childcategoryUpperCase = application.getNumberOfSite().toUpperCase();

			String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
					"successful-application-submission-email-template");
			if (Validator.isNotNull(body)) {
				body = StringUtil.replace(body,
						new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
								"[$subCategory$]", "[$childCategory$]", "[$transactionNo$]", "[$dashboardURL$]" },

						new String[] { themeDisplay.getUser().getFullName(), "NCBJ Certifications", "entityName",
								CategoryTypeUpperCase,subcategoryUpperCase , childcategoryUpperCase,
								application.getApplicationNumber(), ncbjDashboarUrl });
			}
			commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
					themeDisplay.getUser().getEmailAddress(), body);
			_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

		} catch (Exception e) {
			_log.error("An Error Has Occured", e);
		}}
		}else {
      System.out.println("-------------if response 500 case fail------------------");
			jsonOBJ.put("NCBJApplicationId", application.getNcbjApplicationId());
			jsonOBJ.put("NCBJAppNum", application.getApplicationNumber());
			jsonOBJ.put("appStatus", NCBJApplicationWorkflowConstant.DRAFT_Label);
			jsonOBJ.put("category", application.getTypeOfCertification());
			jsonFeed.put("APP_DATA", jsonOBJ);
		}
} catch(UnirestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch(JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch(PortalException e) {
	_log.info("*******************Documents Not Upload***************************");
}
resourceResponse.setContentType("application/json");
try {
	resourceResponse.getWriter().write(jsonFeed.toString());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
_log.info("submit  NCBJ application  Ended--------------------------------");

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