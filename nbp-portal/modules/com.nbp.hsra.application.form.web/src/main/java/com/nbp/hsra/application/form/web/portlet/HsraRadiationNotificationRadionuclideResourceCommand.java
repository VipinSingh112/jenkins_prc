package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.RadionuclideInfo;
import com.nbp.hsra.application.service.service.RadionuclideInfoLocalServiceUtil;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/hsra/radionuclide/info" }, service = MVCResourceCommand.class)

public class HsraRadiationNotificationRadionuclideResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String radionuclideDetails = ParamUtil.getString(resourceRequest, "radionuclideDetails");
		String activityDetails = ParamUtil.getString(resourceRequest, "activityDetails");
		String activityDetailBq = ParamUtil.getString(resourceRequest, "activityDetailBq");
		String activityDate = ParamUtil.getString(resourceRequest, "activityDate");
		String chemicalDetailsForm = ParamUtil.getString(resourceRequest, "chemicalDetailsForm");
		String serialNo = ParamUtil.getString(resourceRequest, "serialNo");
		String sealedSource = ParamUtil.getString(resourceRequest, "sealedSource");
		String manufacturerDetails = ParamUtil.getString(resourceRequest, "manufacturerDetails");
		String modelNo = ParamUtil.getString(resourceRequest, "modelNo");
		String identificationNo = ParamUtil.getString(resourceRequest, "identificationNo");
		String statusDetails = ParamUtil.getString(resourceRequest, "statusDetails");

         RadionuclideInfo radionuclideInfo =null;
		try {
			radionuclideInfo = RadionuclideInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {}
		if(radionuclideInfo ==null) {
			radionuclideInfo =RadionuclideInfoLocalServiceUtil.createRadionuclideInfo(CounterLocalServiceUtil.increment());
		}
		radionuclideInfo.setRadionuclideDetails(radionuclideDetails);
        radionuclideInfo.setActivityDetails(activityDetails);
        radionuclideInfo.setActivityDetailBq(activityDetailBq);
        try {
        	radionuclideInfo.setActivityDate(new SimpleDateFormat("yyyy-MM-dd").parse(activityDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
        radionuclideInfo.setChemicalDetailsForm(chemicalDetailsForm);
        radionuclideInfo.setSerialNo(serialNo);
        radionuclideInfo.setSealedSource(sealedSource);
        radionuclideInfo.setManufacturerDetails(manufacturerDetails);
        radionuclideInfo.setModelNo(modelNo);
        radionuclideInfo.setIdentificationNo(identificationNo);
        radionuclideInfo.setStatusDetails(statusDetails);
		radionuclideInfo .setHsraApplicationId(hsraApplicationId);
		RadionuclideInfoLocalServiceUtil.updateRadionuclideInfo(radionuclideInfo);
		// TODO Auto-generated method stub
		return false;
	}

}
