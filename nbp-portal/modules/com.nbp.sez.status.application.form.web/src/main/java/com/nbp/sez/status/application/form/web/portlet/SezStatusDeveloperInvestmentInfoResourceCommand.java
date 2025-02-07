package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;
import com.nbp.sez.status.application.form.service.service.SezDevInvestmentAndFinancialLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/Investment/Info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperInvestmentInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String landValue = ParamUtil.getString(resourceRequest, "landValue");
		String factoryDevCost = ParamUtil.getString(resourceRequest, "factoryDevCost");
		String onSiteInfrastructure = ParamUtil.getString(resourceRequest, "onSiteInfrastructure");
		String portInvestDetails = ParamUtil.getString(resourceRequest, "portInvestDetails");
		String airportInvestDetails = ParamUtil.getString(resourceRequest, "airportInvestDetails");
		String otherInvestDetails = ParamUtil.getString(resourceRequest, "otherInvestDetails");
		String totalInvestDetails = ParamUtil.getString(resourceRequest, "totalInvestDetails");
		String totalLDI = ParamUtil.getString(resourceRequest, "totalLDI");
		String totalFDI = ParamUtil.getString(resourceRequest, "totalFDI");
		String fdiComName = ParamUtil.getString(resourceRequest, "fdiComName");
		String fdiResidentAddr = ParamUtil.getString(resourceRequest, "fdiResidentAddr");
		String fundSources = ParamUtil.getString(resourceRequest, "fundSources");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezDevInvestmentAndFinancial devInvesAndFinancial = null;
		try {
			devInvesAndFinancial = SezDevInvestmentAndFinancialLocalServiceUtil.getSezById(sezStatusApplicationId);	
		} catch (Exception e){
		}
		if(devInvesAndFinancial==null) {
		devInvesAndFinancial = SezDevInvestmentAndFinancialLocalServiceUtil
				.createSezDevInvestmentAndFinancial(CounterLocalServiceUtil.increment());
		}
		devInvesAndFinancial.setValueOfLand(landValue);
		devInvesAndFinancial.setBuildingFactoryDevelop(factoryDevCost);
		devInvesAndFinancial.setOnSiteInfrastructure(onSiteInfrastructure);
		devInvesAndFinancial.setPort(portInvestDetails);
		devInvesAndFinancial.setAirPort(airportInvestDetails);
		devInvesAndFinancial.setOther(otherInvestDetails);
		devInvesAndFinancial.setTotal(totalInvestDetails);
		devInvesAndFinancial.setTotalLocalDirector(totalLDI);
		devInvesAndFinancial.setTotalForeignDirector(totalFDI);
		devInvesAndFinancial.setCompanyName(fdiComName);
		devInvesAndFinancial.setResisdentAddress(fdiResidentAddr);
		devInvesAndFinancial.setSourceOfFunds(fundSources);
		devInvesAndFinancial.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevInvestmentAndFinancialLocalServiceUtil.updateSezDevInvestmentAndFinancial(devInvesAndFinancial);
		return false;
	}

}
