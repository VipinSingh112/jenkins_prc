package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;
import com.nbp.jtb.application.form.service.service.AttractionWaterRequiredLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/water/sport/requirements/info" }, service = MVCResourceCommand.class)
public class JtbWaterSportRequirementsResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(JtbWaterSportRequirementsResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Attraction WATER REQUIREMENTS Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String generalOperator = ParamUtil.getString(resourceRequest, "generalOperator");
        String waterCraft = ParamUtil.getString(resourceRequest, "waterCraft");
        String waterSki = ParamUtil.getString(resourceRequest, "waterSki");
        String sunfishSail = ParamUtil.getString(resourceRequest, "sunfishSail");
        String parasail = ParamUtil.getString(resourceRequest, "parasail");
        String scubaDiving = ParamUtil.getString(resourceRequest, "scubaDiving");
        String glassBoat = ParamUtil.getString(resourceRequest, "glassBoat");
        String bananaBoat = ParamUtil.getString(resourceRequest, "bananaBoat");

        AttractionWaterRequired waterRequirement =null;
		try {
			waterRequirement=AttractionWaterRequiredLocalServiceUtil.getAttractionWaterRequired(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(waterRequirement)) {
			waterRequirement = AttractionWaterRequiredLocalServiceUtil.createAttractionWaterRequired(CounterLocalServiceUtil.increment());
		}
        waterRequirement.setGeneralOperator(generalOperator);
        waterRequirement.setWaterCraft(waterCraft);
        waterRequirement.setWaterSki(waterSki);
        waterRequirement.setSunfishSail(sunfishSail);
        waterRequirement.setParasail(parasail);
        waterRequirement.setScubaDiving(scubaDiving);
        waterRequirement.setGlassBoat(glassBoat);
        waterRequirement.setBananaBoat(bananaBoat);
        waterRequirement.setJtbApplicationId(jtbApplicationId);
		AttractionWaterRequiredLocalServiceUtil.updateAttractionWaterRequired(waterRequirement);
		
		return false;
	}

}
