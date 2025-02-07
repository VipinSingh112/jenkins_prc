package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;
import com.nbp.mining.lease.application.service.service.MiningFormFiveDelineationLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
	"mvc.command.name=/form/five/delineation/area/info" }, service = MVCResourceCommand.class)

public class MiningDelineationAreaResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Calling Form FIVE Delineation Area***-->");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String approximatelyArea = ParamUtil.getString(resourceRequest, "approximatelyArea");
		String locationBeacon = ParamUtil.getString(resourceRequest, "locationBeacon");
		String coordinates = ParamUtil.getString(resourceRequest, "coordinates");
		String northSide = ParamUtil.getString(resourceRequest, "northSide");
		String eastSide = ParamUtil.getString(resourceRequest, "eastSide");
		String firstNorthSide = ParamUtil.getString(resourceRequest, "firstNorthSide");
		String firstEastSide = ParamUtil.getString(resourceRequest, "firstEastSide");
		String firstLocationGrid = ParamUtil.getString(resourceRequest, "firstLocationGrid");
		String firstDegrees = ParamUtil.getString(resourceRequest, "firstDegrees");
		String secondNorthSide = ParamUtil.getString(resourceRequest, "secondNorthSide");
		String secondEastSide = ParamUtil.getString(resourceRequest, "secondEastSide");
		String secondLocationGrid = ParamUtil.getString(resourceRequest, "secondLocationGrid");
		String secondDegrees = ParamUtil.getString(resourceRequest, "secondDegrees");
		String thirdCoordinates = ParamUtil.getString(resourceRequest, "thirdCoordinates");
		String thirdNorthSide = ParamUtil.getString(resourceRequest, "thirdNorthSide");
		String thirdEastSide = ParamUtil.getString(resourceRequest, "thirdEastSide");
		String thirdDegrees = ParamUtil.getString(resourceRequest, "thirdDegrees");
		String thirdGridLoc = ParamUtil.getString(resourceRequest, "thirdGridLoc");
		String thirdGridL = ParamUtil.getString(resourceRequest, "thirdGridL");
		String fourthCoordinates = ParamUtil.getString(resourceRequest, "fourthCoordinates");
		String fourthNorthSide = ParamUtil.getString(resourceRequest, "fourthNorthSide");
		String fourthEastSide = ParamUtil.getString(resourceRequest, "fourthEastSide");
		String fourthDegrees = ParamUtil.getString(resourceRequest, "fourthDegrees");
		String fourthGridLoc = ParamUtil.getString(resourceRequest, "fourthGridLoc");
		String fourthGridL = ParamUtil.getString(resourceRequest, "fourthGridL");
		String fifthCoordinates = ParamUtil.getString(resourceRequest, "fifthCoordinates");
		String fifthNorthSide = ParamUtil.getString(resourceRequest, "fifthNorthSide");
		String fifthEastSide = ParamUtil.getString(resourceRequest, "fifthEastSide");
		String fifthDegrees = ParamUtil.getString(resourceRequest, "fifthDegrees");
		String fifthGridLoc = ParamUtil.getString(resourceRequest, "fifthGridLoc");
		String fifthGridL = ParamUtil.getString(resourceRequest, "fifthGridL");
		
		MiningFormFiveDelineation delineationArea=null;
		try {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (delineationArea == null) {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.createMiningFormFiveDelineation(CounterLocalServiceUtil.increment());
		}
		delineationArea.setApproximatelyArea(approximatelyArea);
		delineationArea.setLocation(locationBeacon);
		delineationArea.setCoordinates(coordinates);
		delineationArea.setNorthSide(northSide);
		delineationArea.setEastSide(eastSide);
		delineationArea.setFirstNorthSide(firstNorthSide);
		delineationArea.setFirstEastSide(firstEastSide);
		delineationArea.setFirstLocationGrid(firstLocationGrid);
		delineationArea.setFirstDegrees(firstDegrees);
		delineationArea.setSecondNorthSide(secondNorthSide);
		delineationArea.setSecondEastSide(secondEastSide);
		delineationArea.setSecondLocationGrid(secondLocationGrid);
		delineationArea.setSecondDegrees(secondDegrees);
		delineationArea.setThirdCoordinates(thirdCoordinates);
		delineationArea.setThirdNorthSide(thirdNorthSide);
		delineationArea.setThirdEastSide(thirdEastSide);
		delineationArea.setThirdDegrees(thirdDegrees);
		delineationArea.setThirdGridLoc(thirdGridLoc);
		delineationArea.setThirdGridL(thirdGridL);
		delineationArea.setFourthCoordinates(fourthCoordinates);
		delineationArea.setFourthNorthSide(fourthNorthSide);
		delineationArea.setFourthEastSide(fourthEastSide);
		delineationArea.setFourthDegrees(fourthDegrees);
		delineationArea.setFourthGridLoc(fourthGridLoc);
		delineationArea.setFourthGridL(fourthGridL);
		delineationArea.setFifthCoordinates(fifthCoordinates);
		delineationArea.setFifthNorthSide(fifthNorthSide);
		delineationArea.setFifthEastSide(fifthEastSide);
		delineationArea.setFifthDegrees(fifthDegrees);
		delineationArea.setFifthGridLoc(fifthGridLoc);
		delineationArea.setFifthGridL(fifthGridL);
		delineationArea.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningFormFiveDelineationLocalServiceUtil.updateMiningFormFiveDelineation(delineationArea);
		
		// TODO Auto-generated method stub
		return false;
	}

}
