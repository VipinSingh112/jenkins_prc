package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.FitPropFinancialProfile;
import com.nbp.hsra.application.service.service.FitPropFinancialProfileLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/hsra/fit/prop/financial/profile" }, service = MVCResourceCommand.class)

public class HsraRadiationFitPropFinancialProfileResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(HsraRadiationFitPropFinancialProfileResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("------calling Radiation Fit Pro Financial Profile-------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		 String financialInstitution = ParamUtil.getString(resourceRequest, "financialInstitution");
	        String creditfacility = ParamUtil.getString(resourceRequest, "creditfacility");
	        String surroundingAction = ParamUtil.getString(resourceRequest, "surroundingAction");
	        String jamaicaInstitution = ParamUtil.getString(resourceRequest, "jamaicaInstitution");
		
	    FitPropFinancialProfile financialInfo=null;
		try {
			financialInfo= FitPropFinancialProfileLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		if(Validator.isNull(financialInfo)){
			financialInfo=FitPropFinancialProfileLocalServiceUtil.createFitPropFinancialProfile(CounterLocalServiceUtil.increment());
		}
		financialInfo.setFinancialInstitution(financialInstitution);
        financialInfo.setCreditfacility(creditfacility);
        financialInfo.setSurroundingAction(surroundingAction);
        financialInfo.setJamaicaInstitution(jamaicaInstitution);
		financialInfo.setHsraApplicationId(hsraApplicationId);
		FitPropFinancialProfileLocalServiceUtil.updateFitPropFinancialProfile(financialInfo);
		return false;
	}
}