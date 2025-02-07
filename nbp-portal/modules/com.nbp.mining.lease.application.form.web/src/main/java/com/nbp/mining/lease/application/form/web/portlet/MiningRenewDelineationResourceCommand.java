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
	"mvc.command.name=/renewal/licence/delineation/area" }, service = MVCResourceCommand.class)

public class MiningRenewDelineationResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String renApproximatelyArea = ParamUtil.getString(resourceRequest, "renApproximatelyArea");
		String renewalLocation = ParamUtil.getString(resourceRequest, "renewalLocation");
		String renewalCoordinates = ParamUtil.getString(resourceRequest, "renewalCoordinates");
		String renewalNorthSide = ParamUtil.getString(resourceRequest, "renewalNorthSide");
		String renewalEastSide = ParamUtil.getString(resourceRequest, "renewalEastSide");
		String renewalFirstNorth = ParamUtil.getString(resourceRequest, "renewalFirstNorth");
		String renewalFirstEast = ParamUtil.getString(resourceRequest, "renewalFirstEast");
		String renewalFirstLocation = ParamUtil.getString(resourceRequest, "renewalFirstLocation");
		String renewalFirstDegrees = ParamUtil.getString(resourceRequest, "renewalFirstDegrees");
		String renewalSecondNorth = ParamUtil.getString(resourceRequest, "renewalSecondNorth");
		String renewalSecondEast = ParamUtil.getString(resourceRequest, "renewalSecondEast");
		String renewalSecondLocation = ParamUtil.getString(resourceRequest, "renewalSecondLocation");
		String renewalSecondDegrees = ParamUtil.getString(resourceRequest, "renewalSecondDegrees");
		String renewalThirdCoordinates = ParamUtil.getString(resourceRequest, "renewalThirdCoordinates");
		String renewalThirdNorth = ParamUtil.getString(resourceRequest, "renewalThirdNorth");
		String renewalThirdEast = ParamUtil.getString(resourceRequest, "renewalThirdEast");
		String renewalThirdDegrees = ParamUtil.getString(resourceRequest, "renewalThirdDegrees");
		String renewalThirdGridLoc = ParamUtil.getString(resourceRequest, "renewalThirdGridLoc");
		String renewalThirdBearing = ParamUtil.getString(resourceRequest, "renewalThirdBearing");
		MiningFormFiveDelineation delineationArea=null;
		try {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.getMiningById(miningLeaseApplicationId);
		} catch (Exception e) {
		}
		if (delineationArea == null) {
			delineationArea = MiningFormFiveDelineationLocalServiceUtil.createMiningFormFiveDelineation(CounterLocalServiceUtil.increment());
		}
		delineationArea.setApproximatelyArea(renApproximatelyArea);
		delineationArea.setLocation(renewalLocation);
		delineationArea.setCoordinates(renewalCoordinates);
		delineationArea.setNorthSide(renewalNorthSide);
		delineationArea.setEastSide(renewalEastSide);
		delineationArea.setFirstNorthSide(renewalFirstNorth);
		delineationArea.setFirstEastSide(renewalFirstEast);
		delineationArea.setFirstLocationGrid(renewalFirstLocation);
		delineationArea.setFirstDegrees(renewalFirstDegrees);
		delineationArea.setSecondNorthSide(renewalSecondNorth);
		delineationArea.setSecondEastSide(renewalSecondEast);
		delineationArea.setSecondLocationGrid(renewalSecondLocation);
		delineationArea.setSecondDegrees(renewalSecondDegrees);
		delineationArea.setThirdCoordinates(renewalThirdCoordinates);
		delineationArea.setThirdNorthSide(renewalThirdNorth);
		delineationArea.setThirdEastSide(renewalThirdEast);
		delineationArea.setThirdDegrees(renewalThirdDegrees);
		delineationArea.setThirdGridLoc(renewalThirdGridLoc);
		delineationArea.setThirdGridL(renewalThirdBearing);
		delineationArea.setMiningLeaseApplicationId(miningLeaseApplicationId);
		MiningFormFiveDelineationLocalServiceUtil.updateMiningFormFiveDelineation(delineationArea);
		
		return false;
	}

}
