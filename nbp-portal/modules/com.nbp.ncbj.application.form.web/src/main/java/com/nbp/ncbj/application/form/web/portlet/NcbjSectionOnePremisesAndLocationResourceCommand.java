package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;
import com.nbp.ncbj.application.form.service.service.NcbjPremisesLocationLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/premises/location/information"
		},
		service = MVCResourceCommand.class
	)

public class NcbjSectionOnePremisesAndLocationResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		Log _log=LogFactoryUtil.getLog(NcbjSectionOnePremisesAndLocationResourceCommand.class.getName());
		_log.info("[ISO 22000-2018 Certification-Premises & Location--- SAVE STARTED]");
		String transferReasonDraft = ParamUtil.getString(resourceRequest, "transferReasonDraft");
		String activityExclusion = ParamUtil.getString(resourceRequest, "activityExclusion");
		String transferReasonAct = ParamUtil.getString(resourceRequest, "transferReasonAct");
		String productionFacilitySize = ParamUtil.getString(resourceRequest, "productionFacilitySize");
	    String warehouseFacilitySize = ParamUtil.getString(resourceRequest, "warehouseFacilitySize");
	    String facilitiesLocation = ParamUtil.getString(resourceRequest, "facilitiesLocation");
	    String detailForDiffManagement = ParamUtil.getString(resourceRequest, "detailForDiffManagement");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjPremisesLocation premisesLocation=null;
		try {
			premisesLocation= NcbjPremisesLocationLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(premisesLocation==null) {
			premisesLocation=NcbjPremisesLocationLocalServiceUtil.createNcbjPremisesLocation(CounterLocalServiceUtil.increment());
		}
		_log.info("[SAVE STARTED--Premises & Location 22000]");
		premisesLocation.setTransferReasonDraft(transferReasonDraft);
		premisesLocation.setActivityExclusion(activityExclusion);
		premisesLocation.setTransferReasonAct(transferReasonAct);
		premisesLocation.setProductionFacilitySize(productionFacilitySize);
	    premisesLocation.setWarehouseFacilitySize(warehouseFacilitySize);
	    premisesLocation.setFacilitiesLocation(facilitiesLocation);
	    premisesLocation.setDetailForDiffManagement(detailForDiffManagement);
		premisesLocation.setNcbjApplicationId(ncbjApplicationId);
		NcbjPremisesLocationLocalServiceUtil.updateNcbjPremisesLocation(premisesLocation);
		// TODO Auto-generated method stub
		return false;
	}

}
