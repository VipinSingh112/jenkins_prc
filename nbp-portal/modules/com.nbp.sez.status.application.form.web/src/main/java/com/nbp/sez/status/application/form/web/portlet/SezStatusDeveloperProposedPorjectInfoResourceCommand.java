package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;
import com.nbp.sez.status.application.form.service.service.SezDevProposedProjectLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/proposed/porject/info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperProposedPorjectInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String sezFreePreviousZone = ParamUtil.getString(resourceRequest, "sezFreePreviousZone");
		String sezFreeCurrentZone = ParamUtil.getString(resourceRequest, "sezFreeCurrentZone");
		String businessZoneNature = ParamUtil.getString(resourceRequest, "businessZoneNature");
		String distributedOutputPerLocal = ParamUtil.getString(resourceRequest, "distributedOutputPerLocal");
		String distributedOutputPerOverseas = ParamUtil.getString(resourceRequest, "distributedOutputPerOverseas");
		String sezProposedName = ParamUtil.getString(resourceRequest, "sezProposedName");
		String applicationEconomicZone = ParamUtil.getString(resourceRequest, "applicationEconomicZone");
		String applicationSpecialisedZoneDesc = ParamUtil.getString(resourceRequest, "applicationSpecialisedZoneDesc");
		String seaPortDistanceKM = ParamUtil.getString(resourceRequest, "seaPortDistanceKM");
		String seaPortDistanceMI = ParamUtil.getString(resourceRequest, "seaPortDistanceMI");
		String airportDistanceKM = ParamUtil.getString(resourceRequest, "airportDistanceKM");
		String airportDistanceMI = ParamUtil.getString(resourceRequest, "airportDistanceMI");
		String roadDistanceKM = ParamUtil.getString(resourceRequest, "roadDistanceKM");
		String roadDistanceMI = ParamUtil.getString(resourceRequest, "roadDistanceMI");
		String railDistanceKM = ParamUtil.getString(resourceRequest, "railDistanceKM");
		String railDistanceMI = ParamUtil.getString(resourceRequest, "railDistanceMI");
		String customDistanceKM = ParamUtil.getString(resourceRequest, "customDistanceKM");
		String customDistanceMI = ParamUtil.getString(resourceRequest, "customDistanceMI");
		String proposedLandMeasurement = ParamUtil.getString(resourceRequest, "proposedLandMeasurement");
		String buildingSquareFootage = ParamUtil.getString(resourceRequest, "buildingSquareFootage");
		String landSquareFootage = ParamUtil.getString(resourceRequest, "landSquareFootage");
		String landOwnership = ParamUtil.getString(resourceRequest, "landOwnership");
		String otherSpecifyLandOwnership = ParamUtil.getString(resourceRequest, "otherSpecifyLandOwnership");
		String landOwnerName = ParamUtil.getString(resourceRequest, "landOwnerName");
		String landOwnerAddrOne = ParamUtil.getString(resourceRequest, "landOwnerAddrOne");
		String landOwnerAddrTwo = ParamUtil.getString(resourceRequest, "landOwnerAddrTwo");
		String leaseAgreeTenure = ParamUtil.getString(resourceRequest, "leaseAgreeTenure");
		String stepToAcquireLand = ParamUtil.getString(resourceRequest, "stepToAcquireLand");
		String proposedAreaDesc = ParamUtil.getString(resourceRequest, "proposedAreaDesc");
		String freeZonePrmissionDenied = ParamUtil.getString(resourceRequest, "freeZonePrmissionDenied");
		String deniedPermissionDetail = ParamUtil.getString(resourceRequest, "deniedPermissionDetail");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezDevProposedProject devProposedProject = null;
		try {
			devProposedProject = SezDevProposedProjectLocalServiceUtil.getSezById(sezStatusApplicationId);	
		} catch (Exception e) {
		}
		if(devProposedProject==null) {
			devProposedProject = SezDevProposedProjectLocalServiceUtil
					.createSezDevProposedProject(CounterLocalServiceUtil.increment());	
		}
		devProposedProject.setPreviouslyFreeZone(sezFreePreviousZone);
		devProposedProject.setCurentlyOperatingZone(sezFreeCurrentZone);
		devProposedProject.setBusinessConductedZone(businessZoneNature);
		devProposedProject.setLocally(distributedOutputPerLocal);
		devProposedProject.setOverseas(distributedOutputPerOverseas);
		devProposedProject.setProposedName(sezProposedName);
		devProposedProject.setSpecialEconomicZone(applicationEconomicZone);
		devProposedProject.setPleaseDescribe(applicationSpecialisedZoneDesc);
		devProposedProject.setSeaPortKm(seaPortDistanceKM);
		devProposedProject.setSeaPortMi(seaPortDistanceMI);
		devProposedProject.setAirportKm(airportDistanceKM);
		devProposedProject.setAirportMi(airportDistanceMI);
		devProposedProject.setRoadKm(roadDistanceKM);
		devProposedProject.setRoadMi(roadDistanceMI);
		devProposedProject.setRailKm(railDistanceKM);
		devProposedProject.setRailMi(railDistanceMI);
		devProposedProject.setCustomProcessingKm(customDistanceKM);
		devProposedProject.setCustomProcessingMi(customDistanceMI);
		devProposedProject.setIndicateTheLandMeasurement(proposedLandMeasurement);
		devProposedProject.setBuilding(buildingSquareFootage);
		devProposedProject.setLandArea(landSquareFootage);
		devProposedProject.setOwnerShip(landOwnership);
		devProposedProject.setOtherPleaseSpecify(otherSpecifyLandOwnership);
		devProposedProject.setLandOwnerName(landOwnerName);
		devProposedProject.setLnadOwnerAddressOne(landOwnerAddrOne);
		devProposedProject.setLnadOwnerAddressTwo(landOwnerAddrTwo);
		devProposedProject.setLnadOwnerTenure(leaseAgreeTenure);
		devProposedProject.setStepToAcquireLand(stepToAcquireLand);
		devProposedProject.setStateWheatherTheProposedArea(proposedAreaDesc);
		devProposedProject.setApplicantPreviously(freeZonePrmissionDenied);
		devProposedProject.setPleaseProvideBrief(deniedPermissionDetail);
		devProposedProject.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevProposedProjectLocalServiceUtil.updateSezDevProposedProject(devProposedProject);
		
		return false;
	}
}