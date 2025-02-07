package com.nbp.jtb.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=getting/Document/List/Url" }, service = MVCResourceCommand.class)
public class GettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(GettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		_log.info("[Getting Document List]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String typeOfLicenceApplied=ParamUtil.getString(resourceRequest, "typeOfApplication");
		String accommodationCategoryTypeValAccomodation=ParamUtil.getString(resourceRequest, "accommodationCategoryTypeValAccomodation");
		String attractionCategoryTypeVal=ParamUtil.getString(resourceRequest, "attractionCategoryTypeVal");
		String otherCarRentalDomesticToursTypeVal=ParamUtil.getString(resourceRequest, "otherCarRentalDomesticToursTypeVal");
		String jtbTransactionTypeVal=ParamUtil.getString(resourceRequest, "jtbTransactionTypeVal");
		String otherCategories=ParamUtil.getString(resourceRequest, "otherCategories");
		String subCategoryValuesAttraction=ParamUtil.getString(resourceRequest, "subCategoryValuesAttraction");
		String nonHotelsCategoryTypeValAccomodation=ParamUtil.getString(resourceRequest, "nonHotelsCategoryTypeValAccomodation");
		String waterBasedDocument="";
		System.out.println("subCategoryValuesAttraction----"+subCategoryValuesAttraction);
		String typeOfTransaction="";
		if((typeOfLicenceApplied.contains("Accommodations Licence")&&accommodationCategoryTypeValAccomodation.equals("Hotels"))) {
			System.out.println("******************************Inside Hotels ");
			typeOfTransaction="Accomodation New";
		}
	
		if((typeOfLicenceApplied.contains("Accommodations Licence")&&accommodationCategoryTypeValAccomodation.equals("Home Stay"))) {
			typeOfTransaction="Accomodation Home Stay";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Car Rentals")) {
			typeOfTransaction="Other Car Rental New";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Car Rentals")) {
			typeOfTransaction="Other Car Rental Renew";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Bike Rental")) {
			typeOfTransaction="Other Bike Rental New";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Bike Rental")) {
			typeOfTransaction="Other Bike Rental Renew";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&otherCategories.contains("Places of Interest")) {
			typeOfTransaction="Other Places of Interest";
		}
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Water Sports Employees")) {
			typeOfTransaction="Other Water Sport Employee New";
		}
		
	
		
		//Domestic tour new
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Domestic Tours")) {
			typeOfTransaction="Domestic Tour New";
		}
		//Domestic tour renew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Domestic Tours")) {
			typeOfTransaction="Domestic Tour Renew";
		}
		//Travel Agencies new
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Travel Agencies")) {
			typeOfTransaction="Other Travel Agency New";
		}
		//Travel Agencies renew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Travel Agencies")) {
			typeOfTransaction="Other Travel Agency New";
		}
		//Water Sports Operators new
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Water Sports Operators")) {
			typeOfTransaction="Other Water Sport Operatoer New";
		}
		//Water Sports Operators renew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Water Sports Operators")) {
			System.out.println("---------inside renew water sport operator------------------------");
			typeOfTransaction="Other Water Sport  Operator Renew";
		}
		//Water Sports Employee renew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Water Sports Employees")) {
			System.out.println("---------inside renew water employee operator------------------------");
			typeOfTransaction="Other Water Sports Employee Renew";
		}
		
		//Contract Carriage New
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Contract Carriage")) {
			typeOfTransaction="Other Contract Carriage New";
		}
		//Contract Carriage ReNew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Contract Carriage")) {
			typeOfTransaction="Other Contract Carriage Renew";
		}
		// Travel Hault New
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Travel Halts")) {
			typeOfTransaction="Travel Halt New";
		}
		// Travel Hault ReNew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Travel Halts")) {
			typeOfTransaction="Travel Halt New";
		}
		// Craft Trader New
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("New")&&otherCategories.contains("Craft Traders")) {
			typeOfTransaction="Other Craft Traders New";
		}
		// Craft Trader Renew
		if(typeOfLicenceApplied.contains("Other Tourism Related Licences")&&jtbTransactionTypeVal.contains("Renewal")&&otherCategories.contains("Craft Traders")) {
			typeOfTransaction="Other Craft Traders Renew";
		}
		
		//"tpdcsupportingdocumentses"
		String docType="tpdcsupportingdocuments";
		String url = (String) themeDisplay.getScopeGroup().getExpandoBridge()
				.getAttribute("get-document-url");
		if(url.equals("https://jamaicabusinessgateway.com/")) {
			docType="tpdcsupportingdocumentses";
		}else{
			docType="tpdcsupportingdocuments";
		}
		JSONObject gettingSupportingDocumentArray = null;
		
		if(typeOfLicenceApplied.contains("Attractions")&&jtbTransactionTypeVal.contains("New")) {
			if(subCategoryValuesAttraction.contains("Water Based")) {
				gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArrayJtb(resourceRequest,
						 "Attraction New",	"Attraction Water Based",docType);
				 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
								
			}
			else {
				 gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
							(resourceRequest, "Attraction New", docType);
					System.out.println("---------------------gettingSupportingDocumentArray"+gettingSupportingDocumentArray);

			}
		}
		else if(typeOfLicenceApplied.contains("Attractions")&&jtbTransactionTypeVal.contains("Renewal")) {
			if(subCategoryValuesAttraction.contains("Water Based Renewal")) {
				gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArrayJtb(resourceRequest,
						 "Attractions Renew",	"Attractions Renew Waterbased ",docType);
				 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
			}
			else {
				gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
						(resourceRequest, "Attractions Renew", docType);
				System.out.println("---------------------gettingSupportingDocumentArray"+gettingSupportingDocumentArray);
			}
		}else if((typeOfLicenceApplied.contains("Accommodations Licence")&&accommodationCategoryTypeValAccomodation.equals("Resort Cottages"))) {
			if((nonHotelsCategoryTypeValAccomodation.contains("Apartments"))||(nonHotelsCategoryTypeValAccomodation.contains("Villas"))) {
				gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
						"Resort Cottage Villa",docType);
				 System.out.println("gettingSupportingDocumentArray---"+gettingSupportingDocumentArray);
								
			}
			else {
				gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
						(resourceRequest, "Accomodation Resort", docType);
				System.out.println("---------------------gettingSupportingDocumentArray"+gettingSupportingDocumentArray);
				
			}
		
		}else {
			System.out.println("-------typeOfTransaction------------------------------"+typeOfTransaction);
	      gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray
				(resourceRequest, typeOfTransaction, docType);
		System.out.println("---------------------gettingSupportingDocumentArray"+gettingSupportingDocumentArray);
		}
		resourceRequest.setAttribute("documentListJsonArray",gettingSupportingDocumentArray);
		resourceRequest.setAttribute("jtbApplicationId",String.valueOf(jtbApplicationId));
		resourceRequest.setAttribute("waterBasedDocument",waterBasedDocument);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher
			("/supporting-documents/jtb-documents-list.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;
	}
	@Reference
	private CommonsUtil commonsUtil;
}
