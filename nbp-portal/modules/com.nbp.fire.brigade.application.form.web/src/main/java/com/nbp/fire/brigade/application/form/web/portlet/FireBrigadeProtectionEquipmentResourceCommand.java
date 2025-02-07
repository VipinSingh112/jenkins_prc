package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeProEquipmentInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/file/protection/equipment/info" }, service = MVCResourceCommand.class)
public class FireBrigadeProtectionEquipmentResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String equipmentProtectionPre = ParamUtil.getString(resourceRequest, "equipmentProtectionPre");
		String equipmentProtectionOne = ParamUtil.getString(resourceRequest, "equipmentProtectionOne");
		String equipmentProtectionTwo = ParamUtil.getString(resourceRequest, "equipmentProtectionTwo");
		String equipmentProtectionThree = ParamUtil.getString(resourceRequest, "equipmentProtectionThree");
		String equipmentProtectionFour = ParamUtil.getString(resourceRequest, "equipmentProtectionFour");
		String equipmentProtectionFive = ParamUtil.getString(resourceRequest, "equipmentProtectionFive");
		String equipmentProtectionSix = ParamUtil.getString(resourceRequest, "equipmentProtectionSix");
		String otherEquipment = ParamUtil.getString(resourceRequest, "otherEquipment");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		FireBrigadeProEquipmentInfo ProEquipmentInfo = null;
		try {
			ProEquipmentInfo = FireBrigadeProEquipmentInfoLocalServiceUtil
					.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (ProEquipmentInfo == null) {
			ProEquipmentInfo = FireBrigadeProEquipmentInfoLocalServiceUtil
					.createFireBrigadeProEquipmentInfo(CounterLocalServiceUtil.increment());
		}
		ProEquipmentInfo.setEquipmentProtectionPre(equipmentProtectionPre);
		ProEquipmentInfo.setEquipmentProtectionOne(equipmentProtectionOne);
		ProEquipmentInfo.setEquipmentProtectionTwo(equipmentProtectionTwo);
		ProEquipmentInfo.setEquipmentProtectionThree(equipmentProtectionThree);
		ProEquipmentInfo.setEquipmentProtectionFour(equipmentProtectionFour);
		ProEquipmentInfo.setEquipmentProtectionFive(equipmentProtectionFive);
		ProEquipmentInfo.setEquipmentProtectionSix(equipmentProtectionSix);
		ProEquipmentInfo.setOtherEquipment(otherEquipment);
		ProEquipmentInfo.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeProEquipmentInfoLocalServiceUtil.updateFireBrigadeProEquipmentInfo(ProEquipmentInfo);
		return false;
	}

}
