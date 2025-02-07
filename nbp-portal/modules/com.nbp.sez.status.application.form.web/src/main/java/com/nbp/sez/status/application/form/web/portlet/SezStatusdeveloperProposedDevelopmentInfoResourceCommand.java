package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;
import com.nbp.sez.status.application.form.service.service.SezDevPropDevelopmentPlanLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/proposed/Development/Info" }, service = MVCResourceCommand.class)
public class SezStatusdeveloperProposedDevelopmentInfoResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String existingBuildingForBusi = ParamUtil.getString(resourceRequest, "existingBuildingForBusi");
		String existingBuildingForBusiDetailing = ParamUtil.getString(resourceRequest, "existingBuildingForBusiDetailing");
		String activitiesForSingleEntity = ParamUtil.getString(resourceRequest, "activitiesForSingleEntity");
		String sezDevelopmentVolume = ParamUtil.getString(resourceRequest, "sezDevelopmentVolume");
		String sezDevelopmentFolio = ParamUtil.getString(resourceRequest, "sezDevelopmentFolio");
		String sezDevelopmentStreetAddress = ParamUtil.getString(resourceRequest, "sezDevelopmentStreetAddress");
		String sezDevelopmentTown = ParamUtil.getString(resourceRequest, "sezDevelopmentTown");
		String sezDevelopmentZipCode = ParamUtil.getString(resourceRequest, "sezDevelopmentZipCode");
		String zoningClassification = ParamUtil.getString(resourceRequest, "zoningClassification");
		String sezDevelopmentLandUse = ParamUtil.getString(resourceRequest, "sezDevelopmentLandUse");
		String sezAreaDevelopmentHectareArea = ParamUtil.getString(resourceRequest, "sezAreaDevelopmentHectareArea");
		String sezAreaDevelopmentAcresArea = ParamUtil.getString(resourceRequest, "sezAreaDevelopmentAcresArea");
		String sezCustomsDevelopmentHectareArea = ParamUtil.getString(resourceRequest, "sezCustomsDevelopmentHectareArea");
		String sezCustomsDevelopmentAcresArea = ParamUtil.getString(resourceRequest, "sezCustomsDevelopmentAcresArea");
		String topography = ParamUtil.getString(resourceRequest, "topography");
		String northBoundaries = ParamUtil.getString(resourceRequest, "northBoundaries");
		String eastBoundaries = ParamUtil.getString(resourceRequest, "eastBoundaries");
		String westBoundaries = ParamUtil.getString(resourceRequest, "westBoundaries");
		String southBoundaries = ParamUtil.getString(resourceRequest, "southBoundaries");
		String customLandMeasurement = ParamUtil.getString(resourceRequest, "customLandMeasurement");
		String customPercent = ParamUtil.getString(resourceRequest, "customPercent");
		String commonLandMeasurement = ParamUtil.getString(resourceRequest, "commonLandMeasurement");
		String commonPercent = ParamUtil.getString(resourceRequest, "commonPercent");
		String bufferLandMeasurement = ParamUtil.getString(resourceRequest, "bufferLandMeasurement");
		String bufferPercent = ParamUtil.getString(resourceRequest, "bufferPercent");
		String zoneLandMeasurement = ParamUtil.getString(resourceRequest, "zoneLandMeasurement");
		String zonePercent = ParamUtil.getString(resourceRequest, "zonePercent");
		String residentialLandMeasurement = ParamUtil.getString(resourceRequest, "residentialLandMeasurement");
		String residentialPercent = ParamUtil.getString(resourceRequest, "residentialPercent");
		String totalLandMeasurement = ParamUtil.getString(resourceRequest, "totalLandMeasurement");
		String totalPercent = ParamUtil.getString(resourceRequest, "totalPercent");
		String industrialWaterReq = ParamUtil.getString(resourceRequest, "industrialWaterReq");
		String drinkingWaterReq = ParamUtil.getString(resourceRequest, "drinkingWaterReq");
		String otherWaterReq = ParamUtil.getString(resourceRequest, "otherWaterReq");
		String totalWaterReq = ParamUtil.getString(resourceRequest, "totalWaterReq");
		String disposalMode = ParamUtil.getString(resourceRequest, "disposalMode");
		String wasteWaterTreatment = ParamUtil.getString(resourceRequest, "wasteWaterTreatment");
		String powerReqirement = ParamUtil.getString(resourceRequest, "powerReqirement");
		String mainRoadWidth = ParamUtil.getString(resourceRequest, "mainRoadWidth");
		String mainRoadPavement = ParamUtil.getString(resourceRequest, "mainRoadPavement");
		String secondaryRoadWidth = ParamUtil.getString(resourceRequest, "secondaryRoadWidth");
		String secondaryRoadPavement = ParamUtil.getString(resourceRequest, "secondaryRoadPavement");
		String tertiaryRoadWidth = ParamUtil.getString(resourceRequest, "tertiaryRoadWidth");
		String tertiaryRoadPavement = ParamUtil.getString(resourceRequest, "tertiaryRoadPavement");
		String waterInstallationReq = ParamUtil.getString(resourceRequest, "waterInstallationReq");
		String powerInstallationReq = ParamUtil.getString(resourceRequest, "powerInstallationReq");
		String teleComInstallationReq = ParamUtil.getString(resourceRequest, "teleComInstallationReq");
		String cctvInstallationReq = ParamUtil.getString(resourceRequest, "cctvInstallationReq");
		String securityInterconnection = ParamUtil.getString(resourceRequest, "securityInterconnection");
		String fireFightingInstallationReq = ParamUtil.getString(resourceRequest, "fireFightingInstallationReq");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezDevPropDevelopmentPlan proposedDevelopmentPlan=null;
		try {
			proposedDevelopmentPlan=SezDevPropDevelopmentPlanLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(proposedDevelopmentPlan==null) {		
		proposedDevelopmentPlan=SezDevPropDevelopmentPlanLocalServiceUtil.
				createSezDevPropDevelopmentPlan(CounterLocalServiceUtil.increment());
		}
		proposedDevelopmentPlan.setExistingBuilding(existingBuildingForBusi);
		proposedDevelopmentPlan.setExistingBuildingForBusiDetail(existingBuildingForBusiDetailing);
		proposedDevelopmentPlan.setActivitiesForSingleEntity(activitiesForSingleEntity);
		proposedDevelopmentPlan.setVolume(sezDevelopmentVolume);
		proposedDevelopmentPlan.setFolio(sezDevelopmentFolio);
		proposedDevelopmentPlan.setBuildingNum(sezDevelopmentStreetAddress);
		proposedDevelopmentPlan.setTownCity(sezDevelopmentTown);
//		proposedDevelopmentPlan.setTownCity();
		proposedDevelopmentPlan.setZoningClassification(zoningClassification);
		proposedDevelopmentPlan.setLandUse(sezDevelopmentLandUse);
		proposedDevelopmentPlan.setSezAreaHectares(sezAreaDevelopmentHectareArea);
		proposedDevelopmentPlan.setSezAreaAcres(sezAreaDevelopmentAcresArea);
		proposedDevelopmentPlan.setCustomsHectares(sezCustomsDevelopmentHectareArea);
		proposedDevelopmentPlan.setCustomsAcres(sezCustomsDevelopmentAcresArea);
		proposedDevelopmentPlan.setTopography(topography);
		proposedDevelopmentPlan.setNorthBoundaries(northBoundaries);
		proposedDevelopmentPlan.setEastBoundaries(eastBoundaries);
		proposedDevelopmentPlan.setWestBoundaries(westBoundaries);
		proposedDevelopmentPlan.setSouthBoundaries(southBoundaries);
		proposedDevelopmentPlan.setCustomLandMeasurement(customLandMeasurement);
		proposedDevelopmentPlan.setCustomPercent(customPercent);
		proposedDevelopmentPlan.setCommonLandMeasurement(commonLandMeasurement);
		proposedDevelopmentPlan.setCommonPercent(commonPercent);
		proposedDevelopmentPlan.setBufferLandMeasurement(bufferLandMeasurement);
		proposedDevelopmentPlan.setBufferPercent(bufferPercent);
		proposedDevelopmentPlan.setZoneLandMeasurement(zoneLandMeasurement);
		proposedDevelopmentPlan.setZonePercent(zonePercent);
		proposedDevelopmentPlan.setResidentialLandMeasurement(residentialLandMeasurement);
		proposedDevelopmentPlan.setResidentialPercent(residentialPercent);
		proposedDevelopmentPlan.setTotalLandMeasurement(totalLandMeasurement);
		proposedDevelopmentPlan.setTotalPercent(totalPercent);
		proposedDevelopmentPlan.setIndustrialProcess(industrialWaterReq);
		proposedDevelopmentPlan.setDrinkingPurpose(drinkingWaterReq);
		proposedDevelopmentPlan.setOtherSpecify(otherWaterReq);
		proposedDevelopmentPlan.setTotalRequirement(totalWaterReq);
		proposedDevelopmentPlan.setQuantumAndNature(disposalMode);
		proposedDevelopmentPlan.setSpecifyWhetherOwn(wasteWaterTreatment);
		proposedDevelopmentPlan.setReqOfPower(powerReqirement);
		proposedDevelopmentPlan.setMainRoadRowWidth(mainRoadWidth);
		proposedDevelopmentPlan.setMainRoadTypeOfPavement(mainRoadPavement);
		proposedDevelopmentPlan.setSecondRowWidhth(secondaryRoadWidth);
		proposedDevelopmentPlan.setSecondTypeOfPavement(secondaryRoadPavement);
		proposedDevelopmentPlan.setTertiaryRowWidhth(tertiaryRoadWidth);
		proposedDevelopmentPlan.setTertiaryTypeOfPavement(tertiaryRoadPavement);
		proposedDevelopmentPlan.setWaterInstallationReq(waterInstallationReq);
		proposedDevelopmentPlan.setPowerInstallationReq(powerInstallationReq);
		proposedDevelopmentPlan.setTeleComInstallationReq(teleComInstallationReq);
		proposedDevelopmentPlan.setCctvInstallationReq(cctvInstallationReq);
		proposedDevelopmentPlan.setSecurityInterconnection(securityInterconnection);
		proposedDevelopmentPlan.setFireFightingInstallationReq(fireFightingInstallationReq);
		proposedDevelopmentPlan.setZipCode(sezDevelopmentZipCode);
		proposedDevelopmentPlan.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevPropDevelopmentPlanLocalServiceUtil.updateSezDevPropDevelopmentPlan(proposedDevelopmentPlan);
		return false;
	}
}