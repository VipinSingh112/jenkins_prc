
package com.nbp.factories.registration.application.form.web.portlet;

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
import com.nbp.factories.registration.application.form.services.model.FactoriesAppPayment;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.service.FactoriesAppPaymentLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesApplicationRegistrationLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesProductDetailsAddLocalServiceUtil;
import com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationWorkFlowConstants;

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

		property = {
				"javax.portlet.name="
						+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
				"mvc.command.name=submit/Factories/Application" }, service = MVCResourceCommand.class)

public class FactoriesRegistrationApplicationSubmitResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationApplicationSubmitResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			_log.info("FACTORIES APPLICATION STARTED");
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

			String typeOfTransaction = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "typeOfTransaction"));
			String productCategories = HtmlUtil.unescape(ParamUtil.getString(resourceRequest, "productCategories"));
			String factoriesApplicationType = ParamUtil.getString(resourceRequest, "factoriesApplicationType");
			long factoriesApplicationId = ParamUtil.getLong(resourceRequest, "factoriesApplicationId");
			DateFormat bpmDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			String checkPdfDownloadWithoutDocument = "false";
			FactoriesApplicationRegistration factoriesApplication = null;
			try {
				factoriesApplication = FactoriesApplicationRegistrationLocalServiceUtil
						.getFactoriesApplicationRegistration(factoriesApplicationId);
			} catch (Exception e) {
			}
			if (factoriesApplication == null) {
				factoriesApplication = FactoriesApplicationRegistrationLocalServiceUtil
						.createFactoriesApplicationRegistration(CounterLocalServiceUtil.increment());
			}
			if (factoriesApplication.getApplicationNumber() != null) {
				DateFormat df = new SimpleDateFormat("yy"); // Just the year, with 2 digits
				String formattedDate = df.format(Calendar.getInstance().getTime());
				SecureRandom random = new SecureRandom();
				int num = random.nextInt(100000);
				String formatted = String.format("%05d", num);
				factoriesApplication.setApplicationNumber(formatted + "/" + formattedDate);
			}
			factoriesApplication.setCompanyId(themeDisplay.getCompanyId());
			factoriesApplication.setAreYouProcessing(factoriesApplicationType);
			factoriesApplication.setCreateDate(new Date());
			factoriesApplication.setUserId(themeDisplay.getUserId());
			factoriesApplication.setGroupId(themeDisplay.getScopeGroupId());
			factoriesApplication.setUserName(themeDisplay.getUser().getFullName());
			factoriesApplication.setStatus(FactoriesRegistrationApplicationWorkFlowConstants.DRAFT);
			factoriesApplication.setTypeOfTransaction(typeOfTransaction);
			factoriesApplication.setProductCategory(productCategories);
			FactoriesApplicationRegistrationLocalServiceUtil.updateFactoriesApplicationRegistration(factoriesApplication);
			
			FactoriesApplicationRegistration submittedApplication=null;
			jsonOBJ.put("factoriesApplicationId", factoriesApplication.getFactoriesApplicationId());
			jsonOBJ.put("factoriesAppNo", factoriesApplication.getApplicationNumber());
			jsonOBJ.put("category", factoriesApplication.getTypeOfTransaction());
			jsonOBJ.put("appStatus", FactoriesRegistrationApplicationWorkFlowConstants.DRAFT_Label);
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
				JSONObject jsonObject = new JSONFactoryUtil().createJSONObject();
				
				submittedApplication= FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesApplicationRegistration(factoriesApplicationId);
				System.out.println("submittedApplication.get--------------"+submittedApplication.getTypeOfTransaction());
				
				jsonObject.put("solutionType", "NCRAF_RegistrationofFoodProcessingEstablishments");
				if(Validator.isNotNull(submittedApplication.getTypeOfTransaction())) {
					if (submittedApplication.getTypeOfTransaction().equals("New Application")) {
						propertiesObject8.put("value", "New Registration");
						propertiesObject8.put("key", "NCRAF_TypeofTransaction");
						jsonArray.put(propertiesObject8);
					} else if (submittedApplication.getTypeOfTransaction().equals("Re-Registration")) {
						propertiesObject8.put("value", "Re-Registration");
						propertiesObject8.put("key", "NCRAF_TypeofTransaction");
						jsonArray.put(propertiesObject8);
					}
				}
				if(Validator.isNotNull(submittedApplication.getAreYouProcessing())) {
					if (submittedApplication.getAreYouProcessing().equals("Prescribed Foods")) {
						propertiesObject9.put("value", "Prescribed");
						propertiesObject9.put("key", "NCRAF_TypeofFood");
						jsonArray.put(propertiesObject9);
					} else if (submittedApplication.getAreYouProcessing().equals("Non-Prescribed Foods")) {
						propertiesObject9.put("value", "Non-Prescribed");
						propertiesObject9.put("key", "NCRAF_TypeofFood");
						jsonArray.put(propertiesObject9);
					}
				}
				
				if(Validator.isNotNull(submittedApplication.getApplicationNumber())) {
				propertiesObject24.put("key", "NCRAF_TransactionNumber");
				propertiesObject24.put("value",submittedApplication.getApplicationNumber());
				jsonArray.put(propertiesObject24);
				}
				//multiple-select
				if(Validator.isNotNull(productCategories)) {
					propertiesObject10.put("key", "NCRAF_ProductCategories");
					String []categoryProduct=productCategories.split(";");
					JSONArray categoryProducts=new JSONFactoryUtil().createJSONArray();
					for(String str :categoryProduct ) {
					if (str.contains("Acidified Foods")) {
						categoryProducts.put("Acidified Foods");
					}else if (str.contains("Processed Ackees")){
						categoryProducts.put("Processed Ackees");
					}else if (str.contains("Packaged water")) {
						categoryProducts.put("Packaged water");
					}else if (str.contains("Sauces")) {
						categoryProducts.put("Sauces");
					}else if (str.contains("Sugar")) {
						categoryProducts.put("Sugar");
					}else if (str.contains("Coconut Water")) {
						categoryProducts.put("Coconut Water");
					}else if (str.contains("Juices")) {
						categoryProducts.put("Juices");
					}else if (str.contains("Preserves (Jams Jellies, Marmalades)")) {
						categoryProducts.put("Preserves - Jams Jellies Marmalades");
					}else if (str.contains("Roots Wine/ Herbal Wine")) {
						categoryProducts.put("Roots Wine/Herbal Wine");
					}else if (str.contains("Baked Products")) {
						categoryProducts.put("Baked Products");
					}else if (str.contains("pastries")) {
						categoryProducts.put("pastries");
					}else if (str.contains("Meat & Meat Products")) {
						categoryProducts.put("Meat & Meat Products");
					}else if (str.contains("Honey")) {
						categoryProducts.put("Honey");
					}else if (str.contains("Nuts")) {
						categoryProducts.put("Nuts");
					}else if (str.contains("Fat & Oils")) {
						categoryProducts.put("fats & oats");
					}else if (str.contains("Margarines & Butter")) {
						categoryProducts.put("Margarine & Butter");
					}else if (str.contains("Coffee")) {
						categoryProducts.put("Coffee");
					}else if (str.contains("Confectionaries")) {
						categoryProducts.put("Confectionaries");
					}else if (str.contains("Local Snacks")) {
						categoryProducts.put("Local Snacks");
					}else if (str.contains("Low Acid Canned Foods")) {
						categoryProducts.put("Low Acid Canned Foods");
					}
				  }
					propertiesObject10.put("value",categoryProducts );
					jsonArray.put(propertiesObject10);
				}
				
				
				/*propertiesObject53.put("key", "JBGNC_EntityApplicant");
				propertiesObject53.put("value",themeDisplay.getUser().getFullName());
				jsonArray.put(propertiesObject53);*/
				
				FactoriesAppPayment applicationPayment = null;
				try {
					applicationPayment= FactoriesAppPaymentLocalServiceUtil.
					getFactoriesRegistrationById(submittedApplication.getFactoriesApplicationId());
				} catch (Exception e) {
					// TODO: handle exception
				}

				
				propertiesObject49.put("key", "NCRAF_PaymentMethod");
				System.out.println("NCRAF_PaymentMethod************" + applicationPayment.getPaymentMethod());
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
				
				propertiesObject54.put("key", "NCRAF_AmountDue");
				propertiesObject54.put("value", "5000");
				jsonArray.put(propertiesObject54);

				String factoryDashboarUrl = PortalUtil.getPortalURL(resourceRequest) + "/group/guest"
						+ "/factories-registration-dashboard?factoriesApplicationId=";
				factoryDashboarUrl = factoryDashboarUrl
						+ String.valueOf(submittedApplication.getFactoriesApplicationId());

				propertiesObject50.put("key", "NCRAF_DashboardURL");
				propertiesObject50.put("value", factoryDashboarUrl);
				jsonArray.put(propertiesObject50);
				
				propertiesObject51.put("key", "NCRAF_CaseOrigin");
				propertiesObject51.put("value", "Portal");
				jsonArray.put(propertiesObject51);
				
				/*if(Validator.isNotNull(factoriesApplication.getEntityId())) {
				propertiesObject52.put("key", "JBGNC_EntityApplicant");
				propertiesObject52.put("value",factoriesApplication.getEntityId());
				jsonArray.put(propertiesObject52);
				}*/
				
			/* Applicant Details */
				FactoriesStandardActInfo standardActInfo = null;
			
			  List<FactoriesProductDetailsAdd> productDetailAdd=null;
			  // NcraVerifyWeighingDate weightDate=null; 
				
				try {
					standardActInfo=FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
				} catch (Exception e) {
				}
				if (Validator.isNotNull(standardActInfo)) {
					propertiesObject1.put("key", "NCRAF_NameofEstablishment");
					propertiesObject1.put("value", standardActInfo!=null?standardActInfo.getStandardsActEstablishmentName():"");
					jsonArray.put(propertiesObject1);

					if(Validator.isNotNull(standardActInfo.getStandardsActAddParish())) {
						propertiesObject2.put("key", "NCRAF_Parish");
						if (standardActInfo.getStandardsActAddParish().equals("Kingston")) {
							propertiesObject2.put("value", "Kingston");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. Andrew")) {
							propertiesObject2.put("value", "St Andrew");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Manchester")) {
							propertiesObject2.put("value", "Manchester");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. Catherine")) {
							propertiesObject2.put("value", "St Catherine");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. Thomas")) {
							propertiesObject2.put("value", "St Thomas");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St Mary")) {
							propertiesObject2.put("value", "St Mary");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Portland")) {
							propertiesObject2.put("value", "Portland");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. Ann")) {
							propertiesObject2.put("value", "St Ann");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Trelawny")) {
							propertiesObject2.put("value", "Trelawny");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. James")) {
							propertiesObject2.put("value", "St James");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Hanover")) {
							propertiesObject2.put("value", "Hanover");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Westmoreland")) {
							propertiesObject2.put("value", "Westmoreland");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("St. Elizabeth")) {
							propertiesObject2.put("value", "St Elizabeth");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("Clarendon")) {
							propertiesObject2.put("value", "Clarendon");
							jsonArray.put(propertiesObject2);
						} else if (standardActInfo.getStandardsActAddParish().equals("")) {
							propertiesObject2.put("value", "");
							jsonArray.put(propertiesObject2);
						}
						
					}
					

					propertiesObject3.put("key", "NCRAF_Address");
					propertiesObject3.put("value", standardActInfo!=null?standardActInfo.getStandardsActAddress():"");
					jsonArray.put(propertiesObject3);

					propertiesObject4.put("key", "NCRAF_TelephoneNumber");
					propertiesObject4.put("value", standardActInfo!=null?standardActInfo.getStandardsActTel():"");
					jsonArray.put(propertiesObject4);

					/*propertiesObject5.put("key", "");
					propertiesObject5.put("value", standardActInfo!=null?standardActInfo.getStandardsActWhatsAppNum():"");
					jsonArray.put(propertiesObject5);*/
					
					propertiesObject6.put("key", "NCRAF_EmailAddress");
					propertiesObject6.put("value", standardActInfo!=null?standardActInfo.getStandardsActEmail():"");
					jsonArray.put(propertiesObject6);
					
					/*propertiesObject7.put("key", "");
					propertiesObject7.put("value", standardActInfo!=null?standardActInfo.getStandardsActFaxNum():"");
					jsonArray.put(propertiesObject7);*/
					
					propertiesObject11.put("key", "NCRAF_FullNameofOperator");
					propertiesObject11.put("value", standardActInfo!=null?standardActInfo.getStandardsActOperatorName():"");
					jsonArray.put(propertiesObject11);
					
					propertiesObject12.put("key", "NCRAF_AddressofEstablishment");
					propertiesObject12.put("value", standardActInfo!=null?standardActInfo.getStandardsActOperatorAddress():"");
					jsonArray.put(propertiesObject12);
					
					if(Validator.isNotNull(standardActInfo.getStandardsActParish())) {
						propertiesObject13.put("key", "NCRAF_RegistrationParish");
						if (standardActInfo.getStandardsActParish().equals("Kingston")) {
							propertiesObject13.put("value", "Kingston");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. Andrew")) {
							propertiesObject13.put("value", "St Andrew");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Manchester")) {
							propertiesObject13.put("value", "Manchester");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. Catherine")) {
							propertiesObject13.put("value", "St Catherine");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. Thomas")) {
							propertiesObject13.put("value", "St Thomas");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St Mary")) {
							propertiesObject13.put("value", "St Mary");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Portland")) {
							propertiesObject13.put("value", "Portland");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. Ann")) {
							propertiesObject13.put("value", "St Ann");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Trelawny")) {
							propertiesObject13.put("value", "Trelawny");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. James")) {
							propertiesObject13.put("value", "St James");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Hanover")) {
							propertiesObject13.put("value", "Hanover");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Westmoreland")) {
							propertiesObject13.put("value", "Westmoreland");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("St. Elizabeth")) {
							propertiesObject13.put("value", "St Elizabeth");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("Clarendon")) {
							propertiesObject13.put("value", "Clarendon");
							jsonArray.put(propertiesObject13);
						} else if (standardActInfo.getStandardsActParish().equals("")) {
							propertiesObject13.put("value", "");
							jsonArray.put(propertiesObject13);
						}
						
					}
					
					
					propertiesObject14.put("key", "NCRAF_TelephonenumberofOperator");
					propertiesObject14.put("value", standardActInfo!=null?standardActInfo.getStandardsActOperatorTel():"");
					jsonArray.put(propertiesObject14);
					
					if(Validator.isNotNull(standardActInfo.getEstablishmentBefore())) {
						propertiesObject15.put("key", "NCRFA_IsEstablishmentbeeninOperationBefore");
						if (standardActInfo.getEstablishmentBefore().equals("Yes")) {
							propertiesObject15.put("value", "Yes");
							jsonArray.put(propertiesObject15);
						} else if (standardActInfo.getEstablishmentBefore().equals("No")) {
							propertiesObject15.put("value", "No");
							jsonArray.put(propertiesObject15);
						} else if (standardActInfo.getEstablishmentBefore().equals("")) {
							propertiesObject15.put("value", "");
							jsonArray.put(propertiesObject15);
						}
					}
					
					
					
					if (Validator.isNotNull(standardActInfo.getStandardsActLastDate())) {
						propertiesObject16.put("key", "NCRFA_LastDateofOperation");
						propertiesObject16.put("value", bpmDateFormat.format(standardActInfo.getStandardsActLastDate()));
						jsonArray.put(propertiesObject16);
					}
					
					propertiesObject17.put("key", "NCRFA_ForwhatPurpose");
					propertiesObject17.put("value", standardActInfo!=null?standardActInfo.getStandardsActPurpose():"");
					jsonArray.put(propertiesObject17);
					
					/*if (Validator.isNotNull(standardActInfo.getStandardsActDate())) {
						propertiesObject18.put("key", "");
						propertiesObject18.put("value", standardActInfo!=null?standardActInfo.getStandardsActDate():"");
						jsonArray.put(propertiesObject18);
					}*/
					
				}
				/* Information for Weighing Device */
				
				try {
					productDetailAdd= FactoriesProductDetailsAddLocalServiceUtil.getFactoriesById(factoriesApplicationId);
				
				JSONObject infoForprodDetailJsonObj = new JSONFactoryUtil().createJSONObject();
				infoForprodDetailJsonObj.put("key", "NCRAF_ProductDetails");
				JSONObject detailProductsJsonObj = new JSONFactoryUtil().createJSONObject();
				JSONArray jsonArrayObjects = new JSONFactoryUtil().createJSONArray();
				if (productDetailAdd != null) {
					for (FactoriesProductDetailsAdd detailsList :productDetailAdd) {
						JSONObject productBrandJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject productJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject productSizeJsonOBJ = new JSONFactoryUtil().createJSONObject();
			    		JSONObject productMeasurementJsonOBJ = new JSONFactoryUtil().createJSONObject();
						JSONArray jsonArrayProp = new JSONFactoryUtil().createJSONArray();
						JSONObject prodDetailsListObjValueJsonObject = new JSONFactoryUtil().createJSONObject();
						productBrandJsonOBJ.put("name", "NCRFA_Brand");
						productBrandJsonOBJ.put("value", detailsList.getProductBrand());
						jsonArrayProp.put(productBrandJsonOBJ);
						
						productJsonOBJ.put("name", "NCRFA_ProductName");
						productJsonOBJ.put("value", detailsList.getProduct());
						jsonArrayProp.put(productJsonOBJ);
						
						productSizeJsonOBJ.put("name", "NCRFA_ProductSize");
						productSizeJsonOBJ.put("value", detailsList.getProductSize());
						jsonArrayProp.put(productSizeJsonOBJ);
						
						if(Validator.isNotNull(detailsList.getProductMeasurementVal())) {
							productMeasurementJsonOBJ.put("name", "NCRFA_MeasurementValue");
							if(detailsList.getProductMeasurementVal().equals("Kilogram (kg)")) {
								productMeasurementJsonOBJ.put("value", "Kilogram (kg)");
								jsonArrayProp.put(productMeasurementJsonOBJ);
							}else if (detailsList.getProductMeasurementVal().equals("Gram (g))")) {
								productMeasurementJsonOBJ.put("value", "Gram (g)");
								jsonArrayProp.put(productMeasurementJsonOBJ);
							}else if (detailsList.getProductMeasurementVal().equals("Milligram (mg)")) {
								productMeasurementJsonOBJ.put("value", "Milligram (mg)");
								jsonArrayProp.put(productMeasurementJsonOBJ);
							}else if (detailsList.getProductMeasurementVal().equals("Microgram (�g)")) {
								productMeasurementJsonOBJ.put("value", "Microgram (Mg)");
								jsonArrayProp.put(productMeasurementJsonOBJ);
							}
						}
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
			
					/*propertiesObject13.put("key", "JBGNC_Locationofpetroltobeverified");
					propertiesObject13.put("value", detailsList.get);
					jsonArray.put(propertiesObject13);*/
				jsonObject.put("properties", jsonArray);
					_log.info("Request json--------------" + jsonObject.toString());
					String launchCaseUrl = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("icm-launch-case-url");
					_log.info("*************launchCaseUrl in NCRA FOOD************" + launchCaseUrl);
					String createCaseEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("create-case-endpoint");
					_log.info("*************createCaseEndPoint in NCRA FOOD************" + createCaseEndPoint);
					Boolean isBPMEnabled = (Boolean) themeDisplay.getScopeGroup().getExpandoBridge()
							.getAttribute("bpm-enabled");
					_log.info("*************isBPMEnabled in NCRA FOOD************" + isBPMEnabled);
//					String objectStore=(String) themeDisplay.getScopeGroup().getExpandoBridge()
//							.getAttribute("object-store");
//					_log.info("*************Object Store Called in NCRA FOOD************" + objectStore);
					
					String token = null;
					String objectStoreValue = null;
					try {
						token = commonsUtil.getToken(themeDisplay, launchCaseUrl);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					try {
						objectStoreValue = commonsUtil.getBpmObjectData(themeDisplay, token, "109", launchCaseUrl);
					} catch (Exception e2) {
					}
					_log.info("*************Object Store Called in NCRA FOOD************" + objectStoreValue);
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
							FactoriesApplicationRegistration subNcraApplication = null;
							try {
								subNcraApplication = FactoriesApplicationRegistrationLocalServiceUtil.getFactoriesApplicationRegistration(factoriesApplicationId);
							} catch (PortalException e1) {
							}
							subNcraApplication.setCaseId(caseId);
							subNcraApplication.setIcmDocumentPath(path);
							subNcraApplication.setStatus(FactoriesRegistrationApplicationWorkFlowConstants.SUBMITTED);
							FactoriesApplicationRegistrationLocalServiceUtil.updateFactoriesApplicationRegistration(subNcraApplication);
							
							jsonOBJ.put("factoriesAppNo", subNcraApplication.getApplicationNumber());
							jsonOBJ.put("appStatus", FactoriesRegistrationApplicationWorkFlowConstants.SUBMITTED_Label);
							jsonOBJ.put("category", subNcraApplication.getTypeOfTransaction());
							jsonOBJ.put("factoriesApplicationId", subNcraApplication.getFactoriesApplicationId());
							jsonFeed.put("APP_DATA", jsonOBJ);
							DLFolder supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), DLFolderConstants.DEFAULT_PARENT_FOLDER_ID,
									"Factories Supported Documents");
							DLFolder supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(
									themeDisplay.getScopeGroupId(), supportingDocumentsParentFolder.getFolderId(),
									String.valueOf(subNcraApplication.getFactoriesApplicationId()));
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
								if(!allSupportingFolder.getName().equals("NCRA Food Processing Form PDF")&&!allSupportingFolder.getName().equals("Standard Act Signature")&&!allSupportingFolder.getName().equals("Processed Food Act Signature")) {
									specificFolder=DLAppLocalServiceUtil.getFolder(allSupportingFolder.getFolderId());
									fileEntries= DLFileEntryLocalServiceUtil
											.getFileEntries(themeDisplay.getScopeGroupId(), specificFolder.getFolderId());
								for(DLFileEntry dlfile :fileEntries  ) {
									filez.add(generateFileByInputStream(dlfile));
							}}}
							File pdfFile = null;
							try {
								String pdfTemplate = "";
								pdfTemplate = commonsUtil.replaceFactoriesRegistrationAppPdfVar(subNcraApplication.getAreYouProcessing(), subNcraApplication.getFactoriesApplicationId(), themeDisplay, checkPdfDownloadWithoutDocument);
								if (subNcraApplication.getAreYouProcessing().equals("Prescribed Foods")) {
								File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"factories-prescribed-food-1",pdfTemplate);
								filez.add(file);
								}
								else if(subNcraApplication.getAreYouProcessing().equals("Non-Prescribed Foods")) {
									File file = commonsUtil.getPreviewFileDownloadPdf(resourceRequest, resourceResponse,"factories-non-prescribed-food-1",pdfTemplate);
									filez.add(file);
								}
								
							} catch (Exception e) {
								_log.error(e.getMessage());
							}
							 //Sending Email After Form Submission
		    				try {
		    					String CategoryTypeUpperCase = subNcraApplication.getTypeOfTransaction().toUpperCase();
		    					String subcategoryUpperCase = subNcraApplication.getAreYouProcessing().toUpperCase();
		    					String childcategoryUpperCase = subNcraApplication.getProductCategory().toUpperCase();

		    					String body = commonsUtil.getTemplateFromJournalArticle(themeDisplay.getScopeGroupId(),
		    							"successful-application-submission-email-template");
		    					if (Validator.isNotNull(body)) {
		    						body = StringUtil.replace(body,
		    								new String[] { "[$username$]", "[$applicationName$]", "[$entityName$]", "[$Category$]",
		    										"[$subCategory$]", "[$childCategory$]", "[$transactionNo$]", "[$dashboardURL$]" },

		    								new String[] { themeDisplay.getUser().getFullName(), "NCRA - Food Processing Establishment", "entityName",
		    										CategoryTypeUpperCase, subcategoryUpperCase, childcategoryUpperCase,
		    										subNcraApplication.getApplicationNumber(), factoryDashboarUrl });
		    					}
		    					commonsUtil.sendMailToUsers("Your Application Submitted", "customer-service@dobusinessjamaica.com",
		    							themeDisplay.getUser().getEmailAddress(), body);
		    					_log.info("Mail Sent To Address ----------------" + themeDisplay.getUser().getEmailAddress());
		    			}catch(Exception e) 
		    				{
		    				e.printStackTrace();
		    			}
		    				
							String uploadFilesEndPoint = (String) themeDisplay.getScopeGroup().getExpandoBridge().getAttribute("upload-files-api-endpoint");
							_log.info("path--------------" + path);
							for (File supportingDocs : filez) {
								HttpResponse<String> documentUploadresponse = Unirest.post(launchCaseUrl + uploadFilesEndPoint+ "?tos="+objectStoreValue)
										.field("path", path).field("files", supportingDocs).asString();
								_log.info("document service resonse ----------------" + documentUploadresponse.getCode());
								
								}
							}catch (Exception e) {}
						}
					}//bpm enabled closed
				

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
			_log.info("FACTORIES APPLICATION ENDED");

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