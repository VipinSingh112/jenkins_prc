
package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(

		property = {
				"javax.portlet.name="
						+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
				"mvc.command.name=factories/Standard/Act/Info" }, service = MVCResourceCommand.class)

public class FactoriesRegistrationApplicationStandardActInfoResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationApplicationStandardActInfoResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			_log.info("STANDARD ACT INFO STARTED");
				String standardsActEstablishmentName = ParamUtil.getString(resourceRequest, "standardsActEstablishmentName");
		        String standardsActAddParish = ParamUtil.getString(resourceRequest, "standardsActAddParish");
		        String standardsActAddress = ParamUtil.getString(resourceRequest, "standardsActAddress");
		        String standardsActTel = ParamUtil.getString(resourceRequest, "standardsActTel");
		        String standardsActWhatsAppNum = ParamUtil.getString(resourceRequest, "standardsActWhatsAppNum");
		        String standardsActEmail = ParamUtil.getString(resourceRequest, "standardsActEmail");
		        String standardsActFaxNum = ParamUtil.getString(resourceRequest, "standardsActFaxNum");
		        String standardsActOperatorName = ParamUtil.getString(resourceRequest, "standardsActOperatorName");
		        String standardsActOperatorAddress = ParamUtil.getString(resourceRequest, "standardsActOperatorAddress");
		        String standardsActParish = ParamUtil.getString(resourceRequest, "standardsActParish");
		        String standardsActOperatorTel = ParamUtil.getString(resourceRequest, "standardsActOperatorTel");
		        String standardActProductManufactured = ParamUtil.getString(resourceRequest, "standardActProductManufactured");
		        String standardActBrandManufactured = ParamUtil.getString(resourceRequest, "standardActBrandManufactured");
		        String standardsActProductSize = ParamUtil.getString(resourceRequest, "standardsActProductSize");
		        String standardsActLastDate = ParamUtil.getString(resourceRequest, "standardsActLastDate");
		        String standardsActPurpose = ParamUtil.getString(resourceRequest, "standardsActPurpose");
		        String standardsActDate = ParamUtil.getString(resourceRequest, "standardsActDate");
		        String establishmentBefore = ParamUtil.getString(resourceRequest, "establishmentBefore");
		        long factoriesApplicationId=ParamUtil.getLong(resourceRequest,"factoriesApplicationId");
		        
		        FactoriesStandardActInfo factoriesStandardActInfo = null;
		        try {
		        	factoriesStandardActInfo=FactoriesStandardActInfoLocalServiceUtil.getFactoryStandardActBy_Id(factoriesApplicationId);
				} catch (Exception e) {}
		        if(factoriesStandardActInfo==null) {
		        	factoriesStandardActInfo = FactoriesStandardActInfoLocalServiceUtil.createFactoriesStandardActInfo(CounterLocalServiceUtil.increment());
		        }
		        factoriesStandardActInfo.setFactoriesApplicationId(factoriesApplicationId);
		        factoriesStandardActInfo.setStandardsActEstablishmentName(standardsActEstablishmentName);
		        factoriesStandardActInfo.setStandardsActAddParish(standardsActAddParish);
		        factoriesStandardActInfo.setStandardsActAddress(standardsActAddress);
		        factoriesStandardActInfo.setStandardsActTel(standardsActTel);
		        factoriesStandardActInfo.setStandardsActWhatsAppNum(standardsActWhatsAppNum);
		        factoriesStandardActInfo.setStandardsActEmail(standardsActEmail);
		        factoriesStandardActInfo.setStandardsActFaxNum(standardsActFaxNum);
		        factoriesStandardActInfo.setStandardsActOperatorName(standardsActOperatorName);
		        factoriesStandardActInfo.setStandardsActOperatorAddress(standardsActOperatorAddress);
		        factoriesStandardActInfo.setStandardsActParish(standardsActParish);
		        factoriesStandardActInfo.setStandardsActOperatorTel(standardsActOperatorTel);
		        factoriesStandardActInfo.setStandardActProductManufactured(standardActProductManufactured);
		        factoriesStandardActInfo.setStandardActBrandManufactured(standardActBrandManufactured);
		        factoriesStandardActInfo.setStandardsActProductSize(standardsActProductSize);
		        try {
		        	factoriesStandardActInfo.setStandardsActLastDate(new SimpleDateFormat("yyyy-MM-dd").parse(standardsActLastDate));
				}
				catch(ParseException e){
					e.printStackTrace();
				}
		        factoriesStandardActInfo.setStandardsActPurpose(standardsActPurpose);
		        try {
		        	factoriesStandardActInfo.setStandardsActDate(new SimpleDateFormat("yyyy-MM-dd").parse(standardsActDate));
				}
				catch(ParseException e){
					e.printStackTrace();
				}
		        factoriesStandardActInfo.setEstablishmentBefore(establishmentBefore);
		        factoriesStandardActInfo.setFactoriesApplicationId(factoriesApplicationId);
		        FactoriesStandardActInfoLocalServiceUtil.updateFactoriesStandardActInfo(factoriesStandardActInfo);


			
			_log.info("STANDARD ACT INFO ENDED");
		// TODO Auto-generated method stub

		return false;
	}
}