package com.nbp.ncra.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		property = { 
		"javax.portlet.name="+ NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=delete/Row/Table/Weigh/Device" 
		}, service = MVCResourceCommand.class)
public class DeleteWeighDeviceRowResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long ncraVerifyWeighingDeviceInfoId=ParamUtil.getLong(resourceRequest,"weighDeviceInfoId");
		NcraVerifyWeighingDeviceInfo   deviceInfo=null;
		try {
			deviceInfo=NcraVerifyWeighingDeviceInfoLocalServiceUtil.deleteNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfoId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
