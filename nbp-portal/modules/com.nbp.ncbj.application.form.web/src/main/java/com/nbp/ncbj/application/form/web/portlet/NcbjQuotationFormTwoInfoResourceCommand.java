package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/quotation/form/two/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjQuotationFormTwoInfoResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		Log _log=LogFactoryUtil.getLog(NcbjQuotationFormTwoInfoResourceCommand.class.getName());
		_log.info("[ISO 22000-2018 Certification-COMPANY DEL--- SAVE STARTED]");
		String nameOfOrganizationFo = ParamUtil.getString(resourceRequest, "nameOfOrganizationFo");
	    String addressFo = ParamUtil.getString(resourceRequest, "addressFo");
	    String telephoneNumberFo = ParamUtil.getString(resourceRequest, "telephoneNumberFo");
	    String faxNumberFo = ParamUtil.getString(resourceRequest, "faxNumberFo");
	    String emailAddressFo = ParamUtil.getString(resourceRequest, "emailAddressFo");
	    String positionFirstFo = ParamUtil.getString(resourceRequest, "positionFirstFo");
	    String contactPersonNameFo = ParamUtil.getString(resourceRequest, "contactPersonNameFo");
	    String positionSecondFo = ParamUtil.getString(resourceRequest, "positionSecondFo");
	    String managementSystemFo = ParamUtil.getString(resourceRequest, "managementSystemFo");
	    String orgDeterminedTheScopeFo = ParamUtil.getString(resourceRequest, "orgDeterminedTheScopeFo");
	    String productTypes = ParamUtil.getString(resourceRequest, "productTypes");
	    String productLine = ParamUtil.getString(resourceRequest, "productLine");
	    String haccpStudies = ParamUtil.getString(resourceRequest, "haccpStudies");
	    String criticalControlPoints = ParamUtil.getString(resourceRequest, "criticalControlPoints");
	    String operationalNumber = ParamUtil.getString(resourceRequest, "operationalNumber");
	    String productionSize = ParamUtil.getString(resourceRequest, "productionSize");
	    String warehouseSize = ParamUtil.getString(resourceRequest, "warehouseSize");
	    String warehouseDetailSize = ParamUtil.getString(resourceRequest, "warehouseDetailSize");
	    String seasonalProcess = ParamUtil.getString(resourceRequest, "seasonalProcess");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjOrganizationDetail quotationFormTwo=null;
		try {
			quotationFormTwo= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(quotationFormTwo==null) {
			  quotationFormTwo=NcbjOrganizationDetailLocalServiceUtil.createNcbjOrganizationDetail(CounterLocalServiceUtil.increment());
		  }
		_log.info("[SAVE STARTED--COMPANY DETAIL 22000]");
		quotationFormTwo.setNameOfOrganization(nameOfOrganizationFo);
		quotationFormTwo.setAddress(addressFo);
		quotationFormTwo.setTelephoneNumber(telephoneNumberFo);
		quotationFormTwo.setFaxNumber(faxNumberFo);
		quotationFormTwo.setEmailAddress(emailAddressFo);
		quotationFormTwo.setHeadOfOrganization(positionFirstFo);  
		quotationFormTwo.setPosition(positionFirstFo);  
		quotationFormTwo.setContactPersonName(contactPersonNameFo);
		quotationFormTwo.setPositionSecondFo(positionSecondFo);
		quotationFormTwo.setManagementSystemFo(managementSystemFo);
		quotationFormTwo.setProductTypes(productTypes);
		quotationFormTwo.setProductLine(productLine);
		quotationFormTwo.setHaccpStudies(haccpStudies);
		quotationFormTwo.setCriticalControlPoints(criticalControlPoints);
		quotationFormTwo.setOperationalNumber(operationalNumber);
		quotationFormTwo.setProductionSize(productionSize);
		quotationFormTwo.setWarehouseSize(warehouseSize);
		quotationFormTwo.setWarehouseDetailSize(warehouseDetailSize); 
		quotationFormTwo.setDeterminedTheScope(orgDeterminedTheScopeFo);
		quotationFormTwo.setSeasonalProcess(seasonalProcess);
	
		_log.info("[SAVE STARTED]");
		quotationFormTwo.setNcbjApplicationId(ncbjApplicationId);
		NcbjOrganizationDetailLocalServiceUtil.updateNcbjOrganizationDetail(quotationFormTwo);
		// TODO Auto-generated method stub
		return false;
	}

}
