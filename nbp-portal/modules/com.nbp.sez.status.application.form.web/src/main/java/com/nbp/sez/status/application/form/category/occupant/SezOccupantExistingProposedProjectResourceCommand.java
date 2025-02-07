package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/proposed/info" }, service = MVCResourceCommand.class)
public class SezOccupantExistingProposedProjectResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantExistingProposedProjectResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
	      String occBusinessDesc = ParamUtil.getString(resourceRequest, "occBusinessDesc");
	        String occDeniedFreeZoneAppr = ParamUtil.getString(resourceRequest, "occDeniedFreeZoneAppr");
	        String occDeniedFreeZoneApprDate = ParamUtil.getString(resourceRequest, "occDeniedFreeZoneApprDate");
	        String occDeniedFreeZoneApprType = ParamUtil.getString(resourceRequest, "occDeniedFreeZoneApprType");
	        String occFreeZoneLocation = ParamUtil.getString(resourceRequest, "occFreeZoneLocation");
	        String occSubConcessionBuilding = ParamUtil.getString(resourceRequest, "occSubConcessionBuilding");
	        String occSubConcessionTown = ParamUtil.getString(resourceRequest, "occSubConcessionTown");
	        String occSubConcessionParish = ParamUtil.getString(resourceRequest, "occSubConcessionParish");
	        String occCompleteSurveyTechDesc = ParamUtil.getString(resourceRequest, "occCompleteSurveyTechDesc");
	        String occNorthBoundaries = ParamUtil.getString(resourceRequest, "occNorthBoundaries");
	        String occEastBoundaries = ParamUtil.getString(resourceRequest, "occEastBoundaries");
	        String occWestBoundaries = ParamUtil.getString(resourceRequest, "occWestBoundaries");
	        String occSouthBoundaries = ParamUtil.getString(resourceRequest, "occSouthBoundaries");
	        String occOwnership = ParamUtil.getString(resourceRequest, "occOwnership");
	        String occLeaseYears = ParamUtil.getString(resourceRequest, "occLeaseYears");
	        String occVolume = ParamUtil.getString(resourceRequest, "occVolume");
	        String occFolio = ParamUtil.getString(resourceRequest, "occFolio");
	        String occFloorNum = ParamUtil.getString(resourceRequest, "occFloorNum");
	        String occUndertakenService = ParamUtil.getString(resourceRequest, "occUndertakenService");
	        String occUndertakenManufacturing = ParamUtil.getString(resourceRequest, "occUndertakenManufacturing");
	        String occSeaPortDistanceKM = ParamUtil.getString(resourceRequest, "occSeaPortDistanceKM");
	        String occSeaPortDistanceMI = ParamUtil.getString(resourceRequest, "occSeaPortDistanceMI");
	        String occAirportDistanceKM = ParamUtil.getString(resourceRequest, "occAirportDistanceKM");
	        String occAirportDistanceMI = ParamUtil.getString(resourceRequest, "occAirportDistanceMI");
	        String occRoadDistanceKM = ParamUtil.getString(resourceRequest, "occRoadDistanceKM");
	        String occRoadDistanceMI = ParamUtil.getString(resourceRequest, "occRoadDistanceMI");
	        String occRailDistanceKM = ParamUtil.getString(resourceRequest, "occRailDistanceKM");
	        String occRailDistanceMI = ParamUtil.getString(resourceRequest, "occRailDistanceMI");
	        String occCustomDistanceKM = ParamUtil.getString(resourceRequest, "occCustomDistanceKM");
	        String occCustomDistanceMI = ParamUtil.getString(resourceRequest, "occCustomDistanceMI");
	        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	        SezOccupantExistingProposedProjectBriefInfo briefInfo=null;
	        try {
	        	briefInfo=SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
	        }catch (Exception e) {
			}
	        if(Validator.isNull(briefInfo)) {
	        	briefInfo=SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.createSezOccupantExistingProposedProjectBriefInfo(CounterLocalServiceUtil.increment());
	        }
	        briefInfo.setOccBusinessDesc(occBusinessDesc);
	        briefInfo.setOccDeniedFreeZoneAppr(occDeniedFreeZoneAppr);
	        
	        try {
	        	briefInfo.setOccDeniedFreeZoneApprDate(new SimpleDateFormat("yyyy-MM-dd").parse(occDeniedFreeZoneApprDate));
			} catch (ParseException e) {
			}
	        briefInfo.setOccDeniedFreeZoneApprType(occDeniedFreeZoneApprType);
	        briefInfo.setOccFreeZoneLocation(occFreeZoneLocation);
	        briefInfo.setOccSubConcessionBuilding(occSubConcessionBuilding);
	        briefInfo.setOccSubConcessionTown(occSubConcessionTown);
	        briefInfo.setOccSubConcessionParish(occSubConcessionParish);
	        briefInfo.setOccCompleteSurveyTechDesc(occCompleteSurveyTechDesc);
	        briefInfo.setOccNorthBoundaries(occNorthBoundaries);
	        briefInfo.setOccEastBoundaries(occEastBoundaries);
	        briefInfo.setOccWestBoundaries(occWestBoundaries);
	        briefInfo.setOccSouthBoundaries(occSouthBoundaries);
	        briefInfo.setOccOwnership(occOwnership);
	        briefInfo.setOccLeaseYears(occLeaseYears);
	        briefInfo.setOccVolume(occVolume);
	        briefInfo.setOccFolio(occFolio);
	        briefInfo.setOccFloorNum(occFloorNum);
	        briefInfo.setOccUndertakenService(occUndertakenService);
	        briefInfo.setOccUndertakenManufacturing(occUndertakenManufacturing);
	        briefInfo.setOccSeaPortDistanceKM(occSeaPortDistanceKM);
	        briefInfo.setOccSeaPortDistanceMI(occSeaPortDistanceMI);
	        briefInfo.setOccAirportDistanceKM(occAirportDistanceKM);
	        briefInfo.setOccAirportDistanceMI(occAirportDistanceMI);
	        briefInfo.setOccRoadDistanceKM(occRoadDistanceKM);
	        briefInfo.setOccRoadDistanceMI(occRoadDistanceMI);
	        briefInfo.setOccRailDistanceKM(occRailDistanceKM);
	        briefInfo.setOccRailDistanceMI(occRailDistanceMI);
	        briefInfo.setOccCustomDistanceKM(occCustomDistanceKM);
	        briefInfo.setOccCustomDistanceMI(occCustomDistanceMI);
	        briefInfo.setSezStatusApplicationId(sezStatusApplicationId);

	        // Update the database with the modified entity
	        SezOccupantExistingProposedProjectBriefInfoLocalServiceUtil.updateSezOccupantExistingProposedProjectBriefInfo(briefInfo);
	        return false;
	    }
	}