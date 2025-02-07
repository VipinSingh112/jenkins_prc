
package com.nbp.factories.registration.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;
import com.nbp.factories.registration.application.form.services.service.FactoriesProcessedFoodActLocalServiceUtil;
import com.nbp.factories.registration.application.form.web.constants.FactoriesRegistrationApplicationFormWebPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(

		property = {
				"javax.portlet.name="
						+ FactoriesRegistrationApplicationFormWebPortletKeys.FACTORIESREGISTRATIONAPPLICATIONFORMWEB,
				"mvc.command.name=processed/Food/Act/Info" }, service = MVCResourceCommand.class)

public class FactoriesRegistrationProcessedFoodActInfoResourceCommand implements MVCResourceCommand {

	private static Log _log = LogFactoryUtil.getLog(FactoriesRegistrationProcessedFoodActInfoResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			_log.info("---PROCESSED FOOD ACT INFO STARTED");
				long factoriesApplicationId=ParamUtil.getLong(resourceRequest,"factoriesApplicationId");
				String processedActEstablishmentName = ParamUtil.getString(resourceRequest, "processedActEstablishmentName");
		        String processedActParishAddress = ParamUtil.getString(resourceRequest, "processedActParishAddress");
		        String processedActAddress = ParamUtil.getString(resourceRequest, "processedActAddress");
		        String processedActOperatorName = ParamUtil.getString(resourceRequest, "processedActOperatorName");
		        String processedActOperatorAddress = ParamUtil.getString(resourceRequest, "processedActOperatorAddress");
		        String processedActParish = ParamUtil.getString(resourceRequest, "processedActParish");
		        String processedActDescription = ParamUtil.getString(resourceRequest, "processedActDescription");
		        String establishmentOperated = ParamUtil.getString(resourceRequest, "establishmentOperated");
		        String processedActLastDate = ParamUtil.getString(resourceRequest, "processedActLastDate");
		        String processedActManufactured = ParamUtil.getString(resourceRequest, "processedActManufactured");
		        String processedActDate = ParamUtil.getString(resourceRequest, "processedActDate");
		        
		        
		        FactoriesProcessedFoodAct factoriesProcessedFoodActInfo = null;
		        try {
		        	factoriesProcessedFoodActInfo=FactoriesProcessedFoodActLocalServiceUtil.getFactoriesById(factoriesApplicationId);
				} catch (Exception e) {}
		        if(factoriesProcessedFoodActInfo==null) {
		        	factoriesProcessedFoodActInfo = FactoriesProcessedFoodActLocalServiceUtil.createFactoriesProcessedFoodAct(CounterLocalServiceUtil.increment());
		        }
		        factoriesProcessedFoodActInfo.setProcessedActEstablishmentName(processedActEstablishmentName);
		        factoriesProcessedFoodActInfo.setProcessedActParishAddress(processedActParishAddress);
		        factoriesProcessedFoodActInfo.setProcessedActAddress(processedActAddress);
		        factoriesProcessedFoodActInfo.setProcessedActOperatorName(processedActOperatorName);
		        factoriesProcessedFoodActInfo.setProcessedActOperatorAddress(processedActOperatorAddress);
		        factoriesProcessedFoodActInfo.setProcessedActParish(processedActParish);
		        factoriesProcessedFoodActInfo.setProcessedActDescription(processedActDescription);
		        factoriesProcessedFoodActInfo.setEstablishmentOperated(establishmentOperated);
		        try {
		        	factoriesProcessedFoodActInfo.setProcessedActLastDate(new SimpleDateFormat("yyyy-MM-dd").parse(processedActLastDate));
		        }catch (Exception e) {}
		        factoriesProcessedFoodActInfo.setProcessedActManufactured(processedActManufactured);
		        try {
		        	factoriesProcessedFoodActInfo.setProcessedActDate(new SimpleDateFormat("yyyy-MM-dd").parse(processedActDate));
		        }catch (Exception e) {}
		        factoriesProcessedFoodActInfo.setFactoriesApplicationId(factoriesApplicationId);
		        FactoriesProcessedFoodActLocalServiceUtil.updateFactoriesProcessedFoodAct(factoriesProcessedFoodActInfo);


			
			_log.info("<<----PROCESSED FOOD ACT INFO ENDED---->>");
		// TODO Auto-generated method stub

		return false;
	}
}