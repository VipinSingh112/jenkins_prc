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
	"mvc.command.name=/form/twelve/delineation/area/info" }, service = MVCResourceCommand.class)

public class MiningLeaseDelineationAreaResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		System.out.println("Calling Form Twelve Delineation Area***-->");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String leaseSquareKilo = ParamUtil.getString(resourceRequest, "leaseSquareKilo");
		String leaseLocation = ParamUtil.getString(resourceRequest, "leaseLocation");
		String leaseCoordinates = ParamUtil.getString(resourceRequest, "leaseCoordinates");
		String leaseNorthSide = ParamUtil.getString(resourceRequest, "leaseNorthSide");
		String leaseEastSide = ParamUtil.getString(resourceRequest, "leaseEastSide");
		String firstNorthLease = ParamUtil.getString(resourceRequest, "firstNorthLease");
		String firstEastLease = ParamUtil.getString(resourceRequest, "firstEastLease");
		String leaselocationGrid = ParamUtil.getString(resourceRequest, "leaselocationGrid");
		String leaseDegrees = ParamUtil.getString(resourceRequest, "leaseDegrees");
		String secondNorthLease = ParamUtil.getString(resourceRequest, "secondNorthLease");
		String secondEastLease = ParamUtil.getString(resourceRequest, "secondEastLease");
		String secondLocationLease = ParamUtil.getString(resourceRequest, "secondLocationLease");
		String secondDegreesLease = ParamUtil.getString(resourceRequest, "secondDegreesLease");
		String thirdCoordinatesLease = ParamUtil.getString(resourceRequest, "thirdCoordinatesLease");
		String thirdNorthLease = ParamUtil.getString(resourceRequest, "thirdNorthLease");
		String thirdEastLease = ParamUtil.getString(resourceRequest, "thirdEastLease");
		String thirdDegreesLease = ParamUtil.getString(resourceRequest, "thirdDegreesLease");
		String thirdLocationLease = ParamUtil.getString(resourceRequest, "thirdLocationLease");
		String thirdGridLease = ParamUtil.getString(resourceRequest, "thirdGridLease");
		String fourthCoordinatesLease = ParamUtil.getString(resourceRequest, "fourthCoordinatesLease");
		String fourthNorthLease = ParamUtil.getString(resourceRequest, "fourthNorthLease");
		String fourthEastLease = ParamUtil.getString(resourceRequest, "fourthEastLease");
		String fourthDegreesLease = ParamUtil.getString(resourceRequest, "fourthDegreesLease");
		String fourthGridLease = ParamUtil.getString(resourceRequest, "fourthGridLease");
		String fourthLocationLease = ParamUtil.getString(resourceRequest, "fourthLocationLease");
		String fifthCoordinatesLease = ParamUtil.getString(resourceRequest, "fifthCoordinatesLease");
		String fifthNorthLease = ParamUtil.getString(resourceRequest, "fifthNorthLease");
		String fifthEastLease = ParamUtil.getString(resourceRequest, "fifthEastLease");
		String fifthDegreesLease = ParamUtil.getString(resourceRequest, "fifthDegreesLease");
		String fifthGridLease = ParamUtil.getString(resourceRequest, "fifthGridLease");
		String fifthLocationLease = ParamUtil.getString(resourceRequest, "fifthLocationLease");
		
		MiningFormFiveDelineation delineationArea=null;
		try {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (delineationArea == null) {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.createMiningFormFiveDelineation(CounterLocalServiceUtil.increment());
		}
		delineationArea.setApproximatelyArea(leaseSquareKilo);
		delineationArea.setLocation(leaseLocation);
		delineationArea.setCoordinates(leaseCoordinates);
		delineationArea.setNorthSide(leaseNorthSide);
		delineationArea.setEastSide(leaseEastSide);
		delineationArea.setFirstNorthSide(firstNorthLease);
		delineationArea.setFirstEastSide(firstEastLease);
		delineationArea.setFirstLocationGrid(leaselocationGrid);
		delineationArea.setFirstDegrees(leaseDegrees);
		delineationArea.setSecondNorthSide(secondNorthLease);
		delineationArea.setSecondEastSide(secondEastLease);
		delineationArea.setSecondLocationGrid(secondLocationLease);
		delineationArea.setSecondDegrees(secondDegreesLease);
		delineationArea.setThirdCoordinates(thirdCoordinatesLease);
		delineationArea.setThirdNorthSide(thirdNorthLease);
		delineationArea.setThirdEastSide(thirdEastLease);
		delineationArea.setThirdDegrees(thirdDegreesLease);
		delineationArea.setThirdGridLoc(thirdLocationLease);
		delineationArea.setThirdGridL(thirdGridLease);
		delineationArea.setFourthCoordinates(fourthCoordinatesLease);
		delineationArea.setFourthNorthSide(fourthNorthLease);
		delineationArea.setFourthEastSide(fourthEastLease);
		delineationArea.setFourthDegrees(fourthDegreesLease);
		delineationArea.setFourthGridLoc(fourthGridLease);
		delineationArea.setFourthGridL(fourthLocationLease);
		delineationArea.setFifthCoordinates(fifthCoordinatesLease);
		delineationArea.setFifthNorthSide(fifthNorthLease);
		delineationArea.setFifthEastSide(fifthEastLease);
		delineationArea.setFifthDegrees(fifthDegreesLease);
		delineationArea.setFifthGridLoc(fifthGridLease);
		delineationArea.setFifthGridL(fifthLocationLease);
		delineationArea.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningFormFiveDelineationLocalServiceUtil.updateMiningFormFiveDelineation(delineationArea);
		
		// TODO Auto-generated method stub
		return false;
	}

}
