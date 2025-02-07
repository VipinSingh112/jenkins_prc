package com.nbp.jtb.application.form.web.portlet;
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
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;
import com.nbp.jtb.application.form.service.model.AccoHotelLicence;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JtbAddCraftApplicantInfo;
import com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AccoHotelLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractDetailFormInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil;
import com.nbp.jtb.application.form.service.service.JtbAddCraftApplicantInfoLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import com.nbp.jtb.application.form.web.constants.JtbApplicationWorkflowConstant;

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
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/submit/Applicaiton/Url" }, service = MVCResourceCommand.class)
public class SubmitApplicationResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SubmitApplicationResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("submit application  started--------------------------------");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();

		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String typeOfLicenceApplied = ParamUtil.getString(resourceRequest, "typeOfApplication");
		String accommodationCategoryTypeValAccomodation = ParamUtil.getString(resourceRequest,
				"accommodationCategoryTypeValAccomodation");
		String nonHotelsCategoryTypeValAccomodation = ParamUtil.getString(resourceRequest,
				"nonHotelsCategoryTypeValAccomodation");
		String attractionCategoryTypeVal = ParamUtil.getString(resourceRequest, "attractionCategoryTypeVal");
		String domesticToursTypeVal = ParamUtil.getString(resourceRequest, "domesticToursTypeVal");
		String operatorName=ParamUtil.getString(resourceRequest, "operatorName");
		String issueDate=ParamUtil.getString(resourceRequest, "issueDate");
		String expirationDate=ParamUtil.getString(resourceRequest, "expirationDate");
		String jtbTransactionTypeValAccomodation = ParamUtil.getString(resourceRequest,
				"jtbTransactionTypeValAccomodation");
		String otherCategories = ParamUtil.getString(resourceRequest, "otherCategoryTypeVal");

		DateFormat tpdcoDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		JTBApplication application = null;
		String checkPdfDownloadWithoutDocument = "false";
		try {
			application = JTBApplicationLocalServiceUtil.getJTBApplication(jtbApplicationId);
		} catch (Exception e) {
		}
		if (application == null) {
			application = JTBApplicationLocalServiceUtil.createJTBApplication(CounterLocalServiceUtil.increment());
		}
		application.setCompanyId(themeDisplay.getCompanyId());
		application.setGroupId(themeDisplay.getScopeGroupId());
		application.setUserId(themeDisplay.getUserId());
		application.setUserName(themeDisplay.getUser().getFullName());
		application.setStatus(JTBApplicationFormWebPortletKeys.DRAFT);

		application.setTypeOfApplication(typeOfLicenceApplied);
		application.setCategoryTypeValAccomo(accommodationCategoryTypeValAccomodation);
		application.setNonHotelSubCategory(nonHotelsCategoryTypeValAccomodation);
		application.setAttractionCategoryTypeVal(attractionCategoryTypeVal);
		application.setDomesticToursType(domesticToursTypeVal);
		application.setOperatorName(operatorName);
		try {
			if (Validator.isNotNull(issueDate)) {
				application.setDateOfIssue(new SimpleDateFormat("yyyy-MM-dd").parse(issueDate));
			}
		} catch (Exception e) {
		}
		try {
			if (Validator.isNotNull(expirationDate)) {
				application.setDateOfExp(new SimpleDateFormat("yyyy-MM-dd").parse(expirationDate));
			}
		} catch (Exception e) {
		}
		
		
		application.setOtherCategories(otherCategories);
		application.setJtbTransactionTypeVal(jtbTransactionTypeValAccomodation);
		if (Validator.isNull(application.getApplicationNumber())) {
			DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
			String formattedDate = df.format(Calendar.getInstance().getTime());
			SecureRandom random = new SecureRandom();
			int num = random.nextInt(100000);
			String formatted = String.format("%05d", num);
			application.setApplicationNumber(formatted + "/" + formattedDate);
		}
		JTBApplicationLocalServiceUtil.updateJTBApplication(application);
		jsonOBJ.put("jtbApplicationId", application.getJtbApplicationId());
		jsonOBJ.put("jtbAppNo", application.getApplicationNumber());
		jsonOBJ.put("appStatus", JtbApplicationWorkflowConstant.DRAFT_Label);
		jsonOBJ.put("category", application.getTypeOfApplication());
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
             
			propertiesObject23.put("key", "TPDCO_ApplicationType");
			propertiesObject1.put("key", "TPDCO_CaseOrigin");
			propertiesObject1.put("value", "Portal");
			jsonArray.put(propertiesObject1);
			// accomodation category
			if (typeOfLicenceApplied.equals("Accommodations Licence")) {
				jsonObject.put("solutionType", "TPDCO_AccommodationsLicence");
                
				propertiesObject23.put("value","Accommodations Licence");
				propertiesObject2.put("key", "TPDCO_TypeCategoryofAccommodation");
				if (accommodationCategoryTypeValAccomodation.equals("Hotels")) {
					propertiesObject2.put("value", "Hotels");
					

					AccoHotelLicence hotel =null;
					try {
						hotel=AccoHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
						
						propertiesObject24.put("key", "TPDCO_NameofOwner");
						propertiesObject24.put("value", hotel.getNameOfOwner());
						jsonArray.put(propertiesObject24);

						propertiesObject25.put("key", "TPDCO_NameofHotelAccommodationa");
						propertiesObject25.put("value", hotel.getNameOfHotel());
						jsonArray.put(propertiesObject25);

						propertiesObject26.put("key", "TPDCO_TelephoneNumber");
						propertiesObject26.put("value", hotel.getTelephoneNo());
						jsonArray.put(propertiesObject26);

						propertiesObject27.put("key", "TPDCO_EmailAddress");
						propertiesObject27.put("value", hotel.getEmailAddress());
						jsonArray.put(propertiesObject27);
						
						
						if (hotel.getParish().equals("Kingston")) {
							propertiesObject28.put("value", "Kingston");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Andrew")) {
							propertiesObject28.put("value", "St Andrew");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Manchester")) {
							propertiesObject28.put("value", "Manchester");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Catherine")) {
							propertiesObject28.put("value", "St Catherine");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Thomas")) {
							propertiesObject28.put("value", "St Thomas");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Mary")) {
							propertiesObject28.put("value", "St Mary");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Portland")) {
							propertiesObject28.put("value", "Portland");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Ann")) {
							propertiesObject28.put("value", "St Ann");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Trelawny")) {
							propertiesObject28.put("value", "Trelawny");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. James")) {
							propertiesObject28.put("value", "St James");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Hanover")) {
							propertiesObject28.put("value", "Hanover");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Westmoreland")) {
							propertiesObject28.put("value", "Westmoreland");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("St. Elizabeth")) {
							propertiesObject28.put("value", "St Elizabeth");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("Clarendon")) {
							propertiesObject28.put("value", "Clarendon");
							propertiesObject28.put("key", "TPDCO_Parish");
						} else if (hotel.getParish().equals("")) {
							propertiesObject28.put("value", "");
							propertiesObject28.put("key", "TPDCO_Parish");
						}
						
						jsonArray.put(propertiesObject28);
						
						propertiesObject29.put("key", "TPDCO_AddressofHotelAccommodation");
						propertiesObject29.put("value", hotel.getAddress());
						jsonArray.put(propertiesObject29);
						
					} catch (Exception e) {}
					
					AccoGenDeclaration GenDeclare = null;
					try {
						GenDeclare = AccoGenDeclarationLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
						
						propertiesObject30.put("key", "TPDCO_NumberofBedrooms");
						propertiesObject30.put("value", GenDeclare.getNoOfBedroom());
						jsonArray.put(propertiesObject30);
						
						propertiesObject31.put("key", "TPDCO_CompanyIncorporatedunderthelaws");
						propertiesObject31.put("value", GenDeclare.getCompIncorporatedOne());
						jsonArray.put(propertiesObject31);
						
						propertiesObject32.put("key", "TPDCO_DateofIncorporation");
						propertiesObject32.put("value", Validator.isNotNull(GenDeclare)
								&& Validator.isNotNull(GenDeclare.getCompanyDate())
								? tpdcoDateFormat.format(GenDeclare.getCompanyDate())
								: "");
						jsonArray.put(propertiesObject32);

						
					} catch (Exception e) {
					}
					
				} 
				else if (accommodationCategoryTypeValAccomodation.equals("Resort Cottages")) {
					propertiesObject2.put("value", "Resort Cottages");
					propertiesObject3.put("key", "TPDCO_ResortCottages");
                    if(nonHotelsCategoryTypeValAccomodation.equals("Apartments")) {
					propertiesObject3.put("value", "Apartments");
                    }else if(nonHotelsCategoryTypeValAccomodation.equals("Guests Houses")) {
                    propertiesObject3.put("value", "Guests Houses");
                    }else if(nonHotelsCategoryTypeValAccomodation.equals("Villas")) {
                    propertiesObject3.put("value", "Villas");	
                    }
					jsonArray.put(propertiesObject3);
				} 
				
				
				else if (accommodationCategoryTypeValAccomodation.equals("Home Stay")) {
					propertiesObject2.put("value", "Home Stay");
					
					propertiesObject4.put("key", "TPDCO_TypeOfTransaction");
					if (jtbTransactionTypeValAccomodation.equals("New")) {
						propertiesObject4.put("value", "New");
					} else if (jtbTransactionTypeValAccomodation.equals("Renewal")) {
						propertiesObject4.put("value", "Renewal");
						
						propertiesObject17.put("key", "TPDCO_NameofOperator");
						propertiesObject17.put("value",operatorName);
						jsonArray.put(propertiesObject17);
					}
					jsonArray.put(propertiesObject4);

				}
				
				jsonArray.put(propertiesObject2);
			}

			// attraction and other tourism related licence

			else if ((typeOfLicenceApplied.equals("Attractions"))) {
				jsonObject.put("solutionType", "TPDCO_AccommodationsLicence");
                
				if(typeOfLicenceApplied.equals("Attractions")) {
				propertiesObject23.put("value","Attractions Licence");
				
				propertiesObject33.put("key", "TPDCO_CategoryofAttraction");
				if(attractionCategoryTypeVal.equals("Nature Based")) {
				propertiesObject33.put("value", "Nature Based");
				}else if(attractionCategoryTypeVal.equals("Water Based")) {
				propertiesObject33.put("value", "Water Based");	
				}else if(attractionCategoryTypeVal.equals("Heritage")) {
				propertiesObject33.put("value", "Heritage");		
				}
				jsonArray.put(propertiesObject33);
						
				}else if(typeOfLicenceApplied.equals("Other Tourism Related Licences")) {
				propertiesObject23.put("value","Other Types of Licences");
				
				
				propertiesObject34.put("key", "TPDCO_TypeCategoryofOtherLicences");
				if(otherCategories.equals("Car Rentals")) {
				    propertiesObject34.put("value", "Car Rentals");	
				}else if(otherCategories.equals("Domestic Tours")) {
					propertiesObject34.put("value", "Domestic Tours");	
				}else if(otherCategories.equals("Travel Halts")) {
					propertiesObject34.put("value", "Travel Halts");	
				}else if(otherCategories.equals("Water Sports Operators")) {
					propertiesObject34.put("value", "Water Sports Operators");	
				}else if(otherCategories.equals("Water Sports Employees")) {
					propertiesObject34.put("value", "Water Sports Employees");	
				}else if(otherCategories.equals("Bike Rental")) {
					propertiesObject34.put("value", "Bike Rental");	
				}else if(otherCategories.equals("Places of Interest/Worship")) {
					propertiesObject34.put("value", "Places of Interest/Worship");	
				}else if(otherCategories.equals("Craft Traders")) {
					propertiesObject34.put("value", "Craft Traders");	
				}else if(otherCategories.equals("Contract Carriage")) {
					propertiesObject34.put("value", "Contract Carriage");	
				}		
			}

				
				if(!otherCategories.equals("Places of Interest/Worship")) {
				propertiesObject5.put("key", "TPDCO_TypeOfTransaction");
				if (jtbTransactionTypeValAccomodation.equals("New")) {
					propertiesObject5.put("value", "New");
				} else if (jtbTransactionTypeValAccomodation.equals("Renewal")) {
					propertiesObject5.put("value", "Renewal");
					try {
					propertiesObject18.put("key", "TPDCO_ATTRACTIONSOperatorName");
					propertiesObject18.put("value", operatorName);
					jsonArray.put(propertiesObject18);
					
					propertiesObject19.put("key", "TPDCO_ATTRACTIONSJTBLicencenumber");
					propertiesObject19.put("value", application.getExpiredLicenseAppNumber());
					jsonArray.put(propertiesObject19);
					
					propertiesObject20.put("key", "TPDCO_ATTRACTIONSDateofIssue");
					propertiesObject20.put("value", Validator.isNotNull(application)
							&& Validator.isNotNull(application.getDateOfIssue())
							? tpdcoDateFormat.format(application.getDateOfIssue())
							: "");
					jsonArray.put(propertiesObject20);
					
					propertiesObject21.put("key", "TPDCO_ATTRACTIONSDateofExpiration");
					propertiesObject21.put("value", Validator.isNotNull(application)
							&& Validator.isNotNull(application.getDateOfExp())
							? tpdcoDateFormat.format(application.getDateOfExp())
							: "");
					jsonArray.put(propertiesObject21);
					propertiesObject22.put("key", "TPDCO_OtherCategoriesofAttraction");
					if(typeOfLicenceApplied.equals("Attractions")) {
					propertiesObject22.put("value", attractionCategoryTypeVal);
					}else if(typeOfLicenceApplied.equals("Other Tourism Related Licences")) {
					propertiesObject22.put("value", otherCategories);
					}
					jsonArray.put(propertiesObject22);
					
					}catch(Exception e) {}
				}
				jsonArray.put(propertiesObject5);
				}
				AttractDetailFormInfo applicantDetail = null;
				try {
					applicantDetail = AttractDetailFormInfoLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);

					propertiesObject6.put("key", "TPDCO_AttractionsOwnerName");
					propertiesObject6.put("value", applicantDetail.getNewAttractionsOwnerName());
					jsonArray.put(propertiesObject6);

					propertiesObject7.put("key", "TPDCO_AttractionMailingAddress");
					propertiesObject7.put("value", applicantDetail.getNewAttractionsMailing());
					jsonArray.put(propertiesObject7);

					propertiesObject8.put("key", "TPDCO_AttractionNumberofEmployees");
					propertiesObject8.put("value", applicantDetail.getNewAttractionsEmpNum());
					jsonArray.put(propertiesObject8);

					
					
					if (applicantDetail.getNewAttractionsParish().equals("Kingston")) {
						propertiesObject9.put("value", "Kingston");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Andrew")) {
						propertiesObject9.put("value", "St Andrew");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Manchester")) {
						propertiesObject9.put("value", "Manchester");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Catherine")) {
						propertiesObject9.put("value", "St Catherine");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Thomas")) {
						propertiesObject9.put("value", "St Thomas");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Mary")) {
						propertiesObject9.put("value", "St Mary");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Portland")) {
						propertiesObject9.put("value", "Portland");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Ann")) {
						propertiesObject9.put("value", "St Ann");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Trelawny")) {
						propertiesObject9.put("value", "Trelawny");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. James")) {
						propertiesObject9.put("value", "St James");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Hanover")) {
						propertiesObject9.put("value", "Hanover");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Westmoreland")) {
						propertiesObject9.put("value", "Westmoreland");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("St. Elizabeth")) {
						propertiesObject9.put("value", "St Elizabeth");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("Clarendon")) {
						propertiesObject9.put("value", "Clarendon");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					} else if (applicantDetail.getNewAttractionsParish().equals("")) {
						propertiesObject9.put("value", "");
						propertiesObject9.put("key", "TPDCO_AttractionParish");
					}
					jsonArray.put(propertiesObject9);

				} catch (Exception e) {
				}

				List<JtbAddCraftApplicantInfo> operatinManager = null;
				try {

					operatinManager = JtbAddCraftApplicantInfoLocalServiceUtil.getByJtbAppId(jtbApplicationId);
					JSONObject operatinManagerJsonObj = new JSONFactoryUtil().createJSONObject();
    				operatinManagerJsonObj.put("key", "TPDCO_AttractionOperatorManagerBO");
					JSONObject operatinManagerValueJsonObj = new JSONFactoryUtil().createJSONObject();
					JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
					if (operatinManager != null) {
						for (JtbAddCraftApplicantInfo operatingValues : operatinManager) {
							JSONObject propertiesObject35 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject36 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject37 = new JSONFactoryUtil().createJSONObject();
							JSONObject propertiesObject38 = new JSONFactoryUtil().createJSONObject();
							JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
							JSONObject operatinManagerListObjectValueJsonObject = new JSONFactoryUtil()
									.createJSONObject();
							propertiesObject35.put("name", "TPDCO_AttractionNameofOperatorManager");
							propertiesObject35.put("value", operatingValues.getOwnerName());
							jsonArrayProp.put(propertiesObject35);

							propertiesObject36.put("name", "TPDCO_AttractionAddressLocation");
							propertiesObject36.put("value", operatingValues.getOwnerAddress());
							jsonArrayProp.put(propertiesObject36);

							propertiesObject37.put("name", "TPDCO_AttractionEmailAddress");
							propertiesObject37.put("value", operatingValues.getOperatingEmail());
							jsonArrayProp.put(propertiesObject37);

							propertiesObject38.put("name", "TPDCO_AttractionTelephoneNumber");
							propertiesObject38.put("value", operatingValues.getOwnerPhoneNo());
							jsonArrayProp.put(propertiesObject38);

							operatinManagerListObjectValueJsonObject.put("properties", jsonArrayProp);
							jsonArrayObjects.put(operatinManagerListObjectValueJsonObject);
						}
						operatinManagerValueJsonObj.put("objects", jsonArrayObjects);
					}
					operatinManagerJsonObj.put("value", operatinManagerValueJsonObj);
					jsonArray.put(operatinManagerJsonObj);
				} catch (Exception e) {
				}

				AttractionGenDeclareInfo attractiongenDec = null;
				try {
					attractiongenDec = AttractionGenDeclareInfoLocalServiceUtil
							.getJTB_ByApplicationId(jtbApplicationId);

					propertiesObject10.put("key", "TPDCO_AttractionsOwnerName");
					propertiesObject10.put("value", attractiongenDec.getNewAttractionsGenOwnerName());
					jsonArray.put(propertiesObject10);

					propertiesObject11.put("key", "TPDCO_CompanyIncorporatedunderthelaws");
					propertiesObject11.put("value", attractiongenDec.getNewAttractionsCompanyLaw());
					jsonArray.put(propertiesObject11);

					propertiesObject12.put("key", "TPDCO_DateofIncorporation");
					propertiesObject12.put("value",
							Validator.isNotNull(attractiongenDec)
									&& Validator.isNotNull(attractiongenDec.getNewAttractionsDate())
											? tpdcoDateFormat.format(attractiongenDec.getNewAttractionsDate())
											: "");
					jsonArray.put(propertiesObject12);

					propertiesObject13.put("key", "TPDCO_NameofAttraction");
					propertiesObject13.put("value", attractiongenDec.getNewAttractionsName());
					jsonArray.put(propertiesObject13);

					propertiesObject14.put("key", "TPDCO_OperatingSinceDate");
					propertiesObject14.put("value",
							Validator.isNotNull(attractiongenDec)
									&& Validator.isNotNull(attractiongenDec.getNewAttractionsStartDate())
											? tpdcoDateFormat.format(attractiongenDec.getNewAttractionsStartDate())
											: "");
					jsonArray.put(propertiesObject14);

					propertiesObject15.put("key", "TPDCO_AcresofLandSituatedon");
					propertiesObject15.put("value", attractiongenDec.getNewAttractionsSituatedLand());
					jsonArray.put(propertiesObject15);

				} catch (Exception e) {
				}
			} else if((typeOfLicenceApplied.equals("Other Tourism Related Licences"))) {
				jsonObject.put("solutionType", "TPDCO_AccommodationsLicence");
				propertiesObject23.put("value","Other Types of Licences");
			}

			jsonArray.put(propertiesObject23); 
			String jtbDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
					+ "/jtb-dashboard?jtbApplicationId=";
			jtbDashboarUrl = jtbDashboarUrl + String.valueOf(application.getJtbApplicationId());

			propertiesObject16.put("key", "TPDCO_TransactionNumber");
			propertiesObject16.put("value", application.getApplicationNumber());
			jsonArray.put(propertiesObject16);
			jsonObject.put("properties", jsonArray);

			_log.info("Requesut body--------------" + jsonObject.toString());
			String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("icm-launch-case-url");
			_log.info("*************launchCaseUrl in tpdco************" + launchCaseUrl);
			String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("create-case-endpoint");
			_log.info("*************createCaseEndPoint in tpdco************" + createCaseEndPoint);
			Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
					.getAttribute("bpm-enabled");
			_log.info("*************isBPMEnabled in tpdco************" + isBPMEnabled);
//			String objectStore = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("object-store");
			String token = null;
			String objectStoreValue= null;
			try {
				token = commonsUtil.getToken(themeDisplay,launchCaseUrl);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay,token,"107",launchCaseUrl);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			_log.info("*************Object Store Called in tpdco************" + objectStoreValue);
			if (isBPMEnabled) {
				Unirest.setTimeouts(20000, 120000);
				HttpResponse<String> response = Unirest.post(launchCaseUrl + createCaseEndPoint + "?tos="+objectStoreValue)
						.header("Accept", "application/json").header("Content-Type", "application/json")
						.body(jsonObject.toString()).asString();
				_log.info("Response body--------------" + response.getBody());
				_log.info("Response code--------------" + response.getCode());
//				_log.info("*************Object Store Called in tpdco Status************" + objectStore);
				JSONObject responseJsonObj = new JSONFactoryUtil().createJSONObject(response.getBody());
				String caseId = responseJsonObj.getString("caseid");
				String path = responseJsonObj.getString("path");

				if (response.getCode() == HttpStatus.SC_OK) {
					JTBApplication submitJtbApplication = JTBApplicationLocalServiceUtil
							.getJTBApplication(jtbApplicationId);
					submitJtbApplication.setCaseId(caseId);
					submitJtbApplication.setIcmDocumentsPath(path);
					submitJtbApplication.setStatus(JtbApplicationWorkflowConstant.SUBMITTED);
					JTBApplicationLocalServiceUtil.updateJTBApplication(submitJtbApplication);
					jsonOBJ.put("jtbApplicationId", application.getJtbApplicationId());
					jsonOBJ.put("jtbAppNo", submitJtbApplication.getApplicationNumber());
					jsonOBJ.put("appStatus", JtbApplicationWorkflowConstant.SUBMITTED_Label);
					jsonOBJ.put("category", application.getTypeOfApplication());
					jsonFeed.put("APP_DATA", jsonOBJ);

					DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
							"JTB Supported Documents");
					DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
							themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
							String.valueOf(submitJtbApplication.getJtbApplicationId()));
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
						if(submitJtbApplication.getTypeOfApplication().equals("Accommodations Licence")) {
							if(submitJtbApplication.getCategoryTypeValAccomo().equals("Hotels")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Hotel Signature Of Applicant")
									&& !allSupportingFolder.getName().equals("Hotel Signature Of Manager")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
					}else if(submitJtbApplication.getCategoryTypeValAccomo().equals("Resort Cottages")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Resort Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
					}else if(submitJtbApplication.getCategoryTypeValAccomo().equals("Home Stay")) {
						
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Home Stay Signature Of Applicant")
									&& !allSupportingFolder.getName().equals("Home Stay Applicant Seal")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}	
							
					}
						
						
						
					
				}else if(submitJtbApplication.getTypeOfApplication().equals("Attractions")) {
					for (Folder allSupportingFolder : folder) {
						if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
								&& !allSupportingFolder.getName().equals("Attraction Signature of Applicant")) {
							specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
							fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
									specificFolder.getFolderId());
							for (DLFileEntry dlfile : fileEntries) {
								filez.add(generateFileByInputStream(dlfile));
							}
						}
					}
					
				}else if(submitJtbApplication.getTypeOfApplication().equals("Other Tourism Related Licences")) {
					if(submitJtbApplication.getOtherCategories().equals("Car Rentals")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Car Rental Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
						
						
					}else if(submitJtbApplication.getOtherCategories().equals("Domestic Tours")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Domestic Signature of Applicant")
									&& !allSupportingFolder.getName().equals("Domestic Signature Service")
									&& !allSupportingFolder.getName().equals("Domestic Company Seal")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
					}else if(submitJtbApplication.getOtherCategories().equals("Travel Agencies")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Travel Agency Applicant Sign")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
						
					}else if(submitJtbApplication.getOtherCategories().equals("Water Sports Operators")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Watersports Signature of Owner")
									&& !allSupportingFolder.getName().equals("Manager Signature Water")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
					}else if(submitJtbApplication.getOtherCategories().equals("Contract Carriage")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Carriage Signature of Owner Operator")
							    	&& !allSupportingFolder.getName().startsWith("Driver's Signature")) {
								System.out.println("-------------------inside not going sign bpm-------------");
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
					}else if(submitJtbApplication.getOtherCategories().equals("Travel Halts")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Travel Halt Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
					}else if(submitJtbApplication.getOtherCategories().equals("Water Sports Employees")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Water Sport Signature of Employee")
									&& !allSupportingFolder.getName().equals("Superintendent of Police")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
						
					}else if(submitJtbApplication.getOtherCategories().equals("Bike Rental")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Bike Rental Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
						
					}else if(submitJtbApplication.getOtherCategories().equals("Places of Interest/Worship")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Place Signature of Applicant")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
							
						
					}else if(submitJtbApplication.getOtherCategories().equals("Craft Traders")) {
						for (Folder allSupportingFolder : folder) {
							if (!allSupportingFolder.getName().equals("JTB Application Form PDF")
									&& !allSupportingFolder.getName().equals("Craft Vendor's Signature")
									&& !allSupportingFolder.getName().equals("Craft Vendor's Assistant Signature")) {
								specificFolder = DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
								fileEntries = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
										specificFolder.getFolderId());
								for (DLFileEntry dlfile : fileEntries) {
									filez.add(generateFileByInputStream(dlfile));
								}
							}
						}
						
					}	
				}
					} catch (Exception e) {
					}

					// pdf going across the BPM
					String pdfTemplate = "";
					pdfTemplate = commonsUtil.replaceJtbPdfVar(submitJtbApplication.getTypeOfApplication(),submitJtbApplication.getOtherCategories(),
					submitJtbApplication.getCategoryTypeValAccomo(),jtbApplicationId, themeDisplay, checkPdfDownloadWithoutDocument);

					System.out.println("TPDCO LAUNCH CASE TEMPLATE******" + pdfTemplate);
					//accomodation
					if (accommodationCategoryTypeValAccomodation.equals("Hotels")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Accomodation Hotel Pdf", pdfTemplate);
						filez.add(file);
					} else if (accommodationCategoryTypeValAccomodation.equals("Resort Cottages")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Accomodation Resort Cottage Pdf", pdfTemplate);
						filez.add(file);
					} else if (accommodationCategoryTypeValAccomodation.equals("Home Stay")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Accomodation Home Stay Pdf ", pdfTemplate);
						filez.add(file);
					} 
					//attraction
					else if (typeOfLicenceApplied.equals("Attractions")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Attraction Pdf ", pdfTemplate);
						filez.add(file);
					}
					//other category pdf
					else if (otherCategories.equals("Car Rentals")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Car Rental Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Domestic Tours")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Domestic Tour Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Travel Agencies")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Travel Agencies Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Water Sports Operators")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Water Sports Operators Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Contract Carriage")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Contract Carriage Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Travel Halts")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Travel Halts Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Water Sports Employees")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Water Sports Employees Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Bike Rental")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Bike Rental Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Places of Interest/Worship")) {
						System.out.println("inside other place of tourism in launch case");
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Places of Interest/Worship Pdf ", pdfTemplate);
						filez.add(file);
					}else if (otherCategories.equals("Craft Traders")) {
						File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,
								"Craft Traders Pdf ", pdfTemplate);
						filez.add(file);
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
					if (application.getTypeOfApplication().contains("Accommodations Licence")) {
						try {
							String CategoryTypeUpperCase = application.getTypeOfApplication().toUpperCase();
							String childcategoryUpperCase = application.getAttractionCategoryTypeVal();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
												"[$Category$]", "[$subCategory$]", "[$childCategory$]",
												"[$transactionNo$]", "[$dashboardURL$]" },

										new String[] { themeDisplay.getUser().getFullName(), "Accommodations",
												"entityName", CategoryTypeUpperCase, "NA", childcategoryUpperCase,
												application.getApplicationNumber(), jtbDashboarUrl });
							}
							commonsUtil.sendMailToUsers("Your Application Submitted",
									"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
									body);
							_log.info(
									"Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

						} catch (Exception e) {
							_log.error("An Error Has Occured", e);
						}
					}else if (application.getTypeOfApplication().contains("Attractions")
							|| application.getTypeOfApplication().contains("Other Tourism Related Licences")) {
						try {
							String CategoryTypeUpperCase = application.getTypeOfApplication().toUpperCase();
							String childcategoryUpperCase = application.getAttractionCategoryTypeVal();

							String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
									"successful-application-submission-email-template");
							if (Validator.isNotNull(body)) {
								body = StringUtil.replace(body,
										new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]",
												"[$Category$]", "[$subCategory$]", "[$childCategory$]",
												"[$transactionNo$]", "[$dashboardURL$]" },

										new String[] { themeDisplay.getUser().getFullName(), "Attractions and Others",
												"entityName", CategoryTypeUpperCase, "NA", childcategoryUpperCase,
												application.getApplicationNumber(), jtbDashboarUrl });
							}
							commonsUtil.sendMailToUsers("Your Application Submitted",
									"customer-service@dobusinessjamaica.com", themeDisplay.getUser().getEmailAddress(),
									body);
							_log.info(
									"Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());

						} catch (Exception e) {
							_log.error("An Error Has Occured", e);
						}
					}
				}else {

					jsonOBJ.put("jtbApplicationId", application.getJtbApplicationId());
					jsonOBJ.put("jtbAppNo", application.getApplicationNumber());
					jsonOBJ.put("appStatus", JtbApplicationWorkflowConstant.DRAFT_Label);
					jsonOBJ.put("category", application.getTypeOfApplication());
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
			_log.info("*******************Documents Not Upload***************************");
		}
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		_log.info("submit  TPDCO application  Ended--------------------------------");

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