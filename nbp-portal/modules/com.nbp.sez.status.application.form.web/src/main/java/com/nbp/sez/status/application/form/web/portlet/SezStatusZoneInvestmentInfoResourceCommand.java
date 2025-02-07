package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneFinancialInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/investment"
		},
		service = MVCResourceCommand.class
		)
public class SezStatusZoneInvestmentInfoResourceCommand implements MVCResourceCommand{
@Override
public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
	// TODO Auto-generated method stub
	String buildingInfrastructure = ParamUtil.getString(resourceRequest, "zoneUserInfraBuilding");
	String equipmentInfrastructure = ParamUtil.getString(resourceRequest, "zoneUserInfraEquipment");
	String machinesInfrastructure = ParamUtil.getString(resourceRequest, "zoneUserInfraMachines");
	String totalInfrastructure = ParamUtil.getString(resourceRequest, "zoneUserInfraTotal");
	String financeSource = ParamUtil.getString(resourceRequest, "financeSource");
	String otherFinanceSource = ParamUtil.getString(resourceRequest, "zoneUserOtherFinanceSource");
	Long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	
	SezZoneFinancialInfo sezZoneFinancialInfo = null;
	try {
		sezZoneFinancialInfo = SezZoneFinancialInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
	}catch (Exception e) {
		// TODO: handle exception
	}
	if(sezZoneFinancialInfo==null) {
		sezZoneFinancialInfo = SezZoneFinancialInfoLocalServiceUtil.createSezZoneFinancialInfo(CounterLocalServiceUtil.increment());	
	}
	sezZoneFinancialInfo.setBuildingInfrastructure(buildingInfrastructure);
	sezZoneFinancialInfo.setEquipmentInfrastructure(equipmentInfrastructure);
	sezZoneFinancialInfo.setMachinesInfrastructure(machinesInfrastructure);
	sezZoneFinancialInfo.setTotalInfrastructure(totalInfrastructure);
	sezZoneFinancialInfo.setFinanceSource(financeSource);
	sezZoneFinancialInfo.setOtherFinanceSource(otherFinanceSource);
	sezZoneFinancialInfo.setSezStatusApplicationId(sezStatusApplicationId);
	SezZoneFinancialInfoLocalServiceUtil.updateSezZoneFinancialInfo(sezZoneFinancialInfo);
	return false;
}
}
