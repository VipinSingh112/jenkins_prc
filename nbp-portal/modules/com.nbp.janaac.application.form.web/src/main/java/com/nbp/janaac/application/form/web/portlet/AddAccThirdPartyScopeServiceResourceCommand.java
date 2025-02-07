package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccThirdPartyScope;
import com.nbp.janaac.application.form.service.service.AccThirdPartyScopeLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/third/party/scope/service" }, service = MVCResourceCommand.class)
public class AddAccThirdPartyScopeServiceResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(AddAccThirdPartyScopeServiceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation FDA third party scope service info------ Started]");
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String accreditationCategory = ParamUtil.getString(resourceRequest, "accreditationCategory");
		String foodProduct1 = ParamUtil.getString(resourceRequest, "foodProduct1");
		String foodRegulation1 = ParamUtil.getString(resourceRequest, "foodRegulation1");
		String foodProduct2 = ParamUtil.getString(resourceRequest, "foodProduct2");
		String foodRegulation2 = ParamUtil.getString(resourceRequest, "foodRegulation2");
		String foodProduct3= ParamUtil.getString(resourceRequest, "foodProduct3");
		String foodRegulation3= ParamUtil.getString(resourceRequest, "foodRegulation3");
		String foodProduct4= ParamUtil.getString(resourceRequest, "foodProduct4");
		String foodRegulation4= ParamUtil.getString(resourceRequest, "foodRegulation4");
		String foodProduct5= ParamUtil.getString(resourceRequest, "foodProduct5");
		String foodRegulation5= ParamUtil.getString(resourceRequest, "foodRegulation5");
		String foodProduct6= ParamUtil.getString(resourceRequest, "foodProduct6");
		String foodRegulation6= ParamUtil.getString(resourceRequest, "foodRegulation6");
		String foodProduct7= ParamUtil.getString(resourceRequest, "foodProduct7");
		String foodRegulation7= ParamUtil.getString(resourceRequest, "foodRegulation7");
		String foodProduct8= ParamUtil.getString(resourceRequest, "foodProduct8");
		String foodRegulation8= ParamUtil.getString(resourceRequest, "foodRegulation8");
		String foodProduct9= ParamUtil.getString(resourceRequest, "foodProduct9");
		String foodRegulation9= ParamUtil.getString(resourceRequest, "foodRegulation9");
		String foodProduct10= ParamUtil.getString(resourceRequest, "foodProduct10");
		String foodRegulation10= ParamUtil.getString(resourceRequest, "foodRegulation10");
		String accCategoryOther= ParamUtil.getString(resourceRequest, "accCategoryOther");
		String foodProduct11= ParamUtil.getString(resourceRequest, "foodProduct11");
		String foodRegulation11= ParamUtil.getString(resourceRequest, "foodRegulation11");
		String accCategoryOther12= ParamUtil.getString(resourceRequest, "accCategoryOther12");
		String foodProduct12= ParamUtil.getString(resourceRequest, "foodProduct12");
		String foodRegulation12= ParamUtil.getString(resourceRequest, "foodRegulation12");
		String cerIntrestedParties= ParamUtil.getString(resourceRequest, "cerIntrestedParties");
		String otherServices= ParamUtil.getString(resourceRequest, "otherServices");
		String otherServicesDescribe= ParamUtil.getString(resourceRequest, "otherServicesDescribe");
		String establishedRelation= ParamUtil.getString(resourceRequest, "establishedRelation");
		String establishedRelDesc= ParamUtil.getString(resourceRequest, "establishedRelDesc");
		String clientService= ParamUtil.getString(resourceRequest, "clientService");
		String certificationCerBody= ParamUtil.getString(resourceRequest, "certificationCerBody");
		String orgAccredited= ParamUtil.getString(resourceRequest, "orgAccredited");
		String responsibleBody= ParamUtil.getString(resourceRequest, "responsibleBody");
		String accExpDate= ParamUtil.getString(resourceRequest, "accExpDate");		
		String certBodyScope= ParamUtil.getString(resourceRequest, "certBodyScope");
		AccThirdPartyScope application=null;
		try {
			application = AccThirdPartyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccThirdPartyScopeLocalServiceUtil.createAccThirdPartyScope(CounterLocalServiceUtil.increment(AddAccThirdPartyScopeServiceResourceCommand.class.getName()));
		}
		application.setAccreditationCategory(accreditationCategory);
		application.setFoodProduct1(foodProduct1);
		application.setFoodRegulation1(foodRegulation1);
		application.setFoodProduct2(foodProduct2);
		application.setFoodRegulation2(foodRegulation2);
		application.setFoodProduct3(foodProduct3);
		application.setFoodRegulation3(foodRegulation3);
		application.setFoodProduct4(foodProduct4);
		application.setFoodRegulation4(foodRegulation4);
		application.setFoodProduct5(foodProduct5);
		application.setFoodRegulation5(foodRegulation5);
		application.setFoodProduct6(foodProduct6);
		application.setFoodRegulation6(foodRegulation6);
		application.setFoodProduct7(foodProduct7);
		application.setFoodRegulation7(foodRegulation7);
		application.setFoodProduct8(foodProduct8);
		application.setFoodRegulation8(foodRegulation8);
		application.setFoodProduct9(foodProduct9);
		application.setFoodRegulation9(foodRegulation9);
		application.setFoodProduct10(foodProduct10);
		application.setFoodRegulation10(foodRegulation10);
		application.setFoodProduct11(foodProduct11);
		application.setFoodRegulation11(foodRegulation11);
		application.setFoodProduct12(foodProduct12);
		application.setFoodRegulation12(foodRegulation12);
		application.setAccCategoryOther(accCategoryOther);
		application.setAccCategoryOther12(accCategoryOther12);
		application.setCerIntrestedParties(cerIntrestedParties);
		application.setOtherServices(otherServices);
		application.setOtherServicesDescribe(otherServicesDescribe);
		application.setEstablishedRelation(establishedRelation);
		application.setEstablishedRelDesc(establishedRelDesc);
		application.setClientService(clientService);
		application.setCertificationCerBody(certificationCerBody);
		application.setOrgAccredited(orgAccredited);
		application.setResponsibleBody(responsibleBody);
		if (Validator.isNotNull(accExpDate)) {
			try {
				application.setAccExpDate(new SimpleDateFormat("yyyy-MM-dd").parse(accExpDate));
			} catch (Exception e) {
			}
		}
		application.setCertBodyScope(certBodyScope);
		application.setJanaacApplicationId(janaacApplicationId);
		AccThirdPartyScopeLocalServiceUtil.updateAccThirdPartyScope(application);
		return false;
	}

}
