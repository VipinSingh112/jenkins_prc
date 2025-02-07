package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeHazardousSubInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/hazardous/substance/info" }, service = MVCResourceCommand.class)
public class FireBrigadeHazardousSubstanceResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String lpgCylinder = ParamUtil.getString(resourceRequest, "lpgCylinder");
		String flammableGases = ParamUtil.getString(resourceRequest, "flammableGases");
		String flammableCombustibleLiquid = ParamUtil.getString(resourceRequest, "flammableCombustibleLiquid");
		String chemicalsLiquid = ParamUtil.getString(resourceRequest, "chemicalsLiquid");
		String chemicalsPowder = ParamUtil.getString(resourceRequest, "chemicalsPowder");
		String explosives = ParamUtil.getString(resourceRequest, "explosives");
		String otherHazardousSubstance = ParamUtil.getString(resourceRequest, "otherHazardousSubstance");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadeHazardousSubInfo hazardousSubstance = null;
		try {
			hazardousSubstance = FireBrigadeHazardousSubInfoLocalServiceUtil
					.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (hazardousSubstance == null) {
			hazardousSubstance = FireBrigadeHazardousSubInfoLocalServiceUtil
					.createFireBrigadeHazardousSubInfo(CounterLocalServiceUtil.increment());
		}
		hazardousSubstance.setLpgCylinder(lpgCylinder);
		hazardousSubstance.setFlammableGases(flammableGases);
		hazardousSubstance.setFlammableCombustibleLiquid(flammableCombustibleLiquid);
		hazardousSubstance.setChemicalsLiquid(chemicalsLiquid);
		hazardousSubstance.setChemicalsPowder(chemicalsPowder);
		hazardousSubstance.setExplosives(explosives);
		hazardousSubstance.setOtherHazardousSubstance(otherHazardousSubstance);
		hazardousSubstance.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeHazardousSubInfoLocalServiceUtil.updateFireBrigadeHazardousSubInfo(hazardousSubstance);
		return false;
	}
}