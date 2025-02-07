package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupantInvestAndFinanceInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantInvestAndFinanceInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/investment/info" }, service = MVCResourceCommand.class)
public class SezOccupantInvestmentAndFinancialInfoResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantInvestmentAndFinancialInfoResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		  String occInfraBuilding = ParamUtil.getString(resourceRequest, "occInfraBuilding");
	        String occInfraEquipment = ParamUtil.getString(resourceRequest, "occInfraEquipment");
	        String occInfraMachines = ParamUtil.getString(resourceRequest, "occInfraMachines");
	        String occInfraTotal = ParamUtil.getString(resourceRequest, "occInfraTotal");
	        String occInfraFinanceSource = ParamUtil.getString(resourceRequest, "occInfraFinanceSource");
	        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	        SezOccupantInvestAndFinanceInfo investAndFinanceInfo =null;
	        try {
	        	investAndFinanceInfo =	SezOccupantInvestAndFinanceInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			} catch (Exception e) {
				_log.error(e.getMessage());
			}
	        if(Validator.isNull(investAndFinanceInfo)) {
	        	investAndFinanceInfo =	SezOccupantInvestAndFinanceInfoLocalServiceUtil.
	        			createSezOccupantInvestAndFinanceInfo(CounterLocalServiceUtil.increment());
	        }
	        // Set all variables to their corresponding database values
	        investAndFinanceInfo.setOccInfraBuilding(occInfraBuilding);
	        investAndFinanceInfo.setOccInfraEquipment(occInfraEquipment);
	        investAndFinanceInfo.setOccInfraMachines(occInfraMachines);
	        investAndFinanceInfo.setOccInfraTotal(occInfraTotal);
	        investAndFinanceInfo.setSezStatusApplicationId(sezStatusApplicationId);
	        investAndFinanceInfo.setOccInfraFinanceSource(occInfraFinanceSource);

	        // Update the database with the modified entity
	        SezOccupantInvestAndFinanceInfoLocalServiceUtil.updateSezOccupantInvestAndFinanceInfo(investAndFinanceInfo);
	        return false;
	    }
	}