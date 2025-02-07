package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeMultFloorInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/multiple/floor/structure/info" }, service = MVCResourceCommand.class)
public class FireBrigadeMultipleFloorStructureResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String floorAlternateExist = ParamUtil.getString(resourceRequest, "floorAlternateExist");
		String buildingRisingMain = ParamUtil.getString(resourceRequest, "buildingRisingMain");
		String equipmentConnection = ParamUtil.getString(resourceRequest, "equipmentConnection");
		String buildingParkingGarage = ParamUtil.getString(resourceRequest, "buildingParkingGarage");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadeMultFloorInfo multipleFloorInfo = null;
		try {
			multipleFloorInfo = FireBrigadeMultFloorInfoLocalServiceUtil
					.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (multipleFloorInfo == null) {
			multipleFloorInfo = FireBrigadeMultFloorInfoLocalServiceUtil
					.createFireBrigadeMultFloorInfo(CounterLocalServiceUtil.increment());
		}
		multipleFloorInfo.setFloorAlternateExist(floorAlternateExist);
		multipleFloorInfo.setBuildingRisingMain(buildingRisingMain);
		multipleFloorInfo.setEquipmentConnection(equipmentConnection);
		multipleFloorInfo.setBuildingParkingGarage(buildingParkingGarage);
		multipleFloorInfo.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeMultFloorInfoLocalServiceUtil.updateFireBrigadeMultFloorInfo(multipleFloorInfo);
		return false;
	}
}