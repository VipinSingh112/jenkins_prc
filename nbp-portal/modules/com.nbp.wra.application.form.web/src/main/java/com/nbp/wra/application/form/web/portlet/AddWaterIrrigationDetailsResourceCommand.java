package com.nbp.wra.application.form.web.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.wra.application.form.web.constants.WRAApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(immediate = true, property = { "javax.portlet.name=" + WRAApplicationFormPortletKeys.WRAAPPLICATIONFORM,
"mvc.command.name=/water/irrigation/info" }, service = MVCResourceCommand.class)
public class AddWaterIrrigationDetailsResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String waterIrrigationVal = ParamUtil.getString(resourceRequest, "waterIrrigationVal");
		resourceRequest.setAttribute("waterIrrigationVal", waterIrrigationVal);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/forms/water-irrigation-detail-info.jsp").include(resourceRequest, resourceResponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
