package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;
import com.nbp.ncbj.application.form.service.service.NcbjSectionTwoLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/process/details/involved/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjSectionTwoProcessDetailsResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		Log _log=LogFactoryUtil.getLog(NcbjSectionTwoProcessDetailsResourceCommand.class.getName());
		_log.info("[ISO 22000-2018 Certification-processes Section II--- SAVE STARTED]");
		String incomingMaterials = ParamUtil.getString(resourceRequest, "incomingMaterials");
        String productStorage = ParamUtil.getString(resourceRequest, "productStorage");
        String buildingSiteAspects = ParamUtil.getString(resourceRequest, "buildingSiteAspects");
        String wasteDischarges = ParamUtil.getString(resourceRequest, "wasteDischarges");
        String transportDetails = ParamUtil.getString(resourceRequest, "transportDetails");
        String subcontractedActivities = ParamUtil.getString(resourceRequest, "subcontractedActivities");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		NcbjSectionTwo processDetails=null;
		try {
			processDetails= NcbjSectionTwoLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
		}
		if(processDetails==null) {
			processDetails=NcbjSectionTwoLocalServiceUtil.createNcbjSectionTwo(CounterLocalServiceUtil.increment());
		}
		_log.info("[SAVE STARTED--processes involved  22000]");
		processDetails.setIncomingMaterials(incomingMaterials);
	    processDetails.setProductStorage(productStorage);
	    processDetails.setBuildingSiteAspects(buildingSiteAspects);
	    processDetails.setWasteDischarges(wasteDischarges);
	    processDetails.setTransportDetails(transportDetails);
	    processDetails.setSubcontractedActivities(subcontractedActivities);
		processDetails.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionTwoLocalServiceUtil.updateNcbjSectionTwo(processDetails);
		// TODO Auto-generated method stub
		return false;
	}

}
