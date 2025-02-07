package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.service.RadiationProtectionSecOneLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component
(immediate = true, 
property = {
	"javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
	"mvc.command.name=/hsra/rad/section/one" }, service = MVCResourceCommand.class)

public class HSRARadiationSectionOneResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String currentAuthorizationNo = ParamUtil.getString(resourceRequest, "currentAuthorizationNo");
		String amendmentReason = ParamUtil.getString(resourceRequest, "amendmentReason");
		String applicationType = ParamUtil.getString(resourceRequest, "applicationType");
		RadiationProtectionSecOne radSectionOne=null;
		try {
			radSectionOne= RadiationProtectionSecOneLocalServiceUtil.getHsraById(hsraApplicationId);
		}catch (Exception e) {
		}
		if (radSectionOne==null) {
			radSectionOne =RadiationProtectionSecOneLocalServiceUtil.createRadiationProtectionSecOne(CounterLocalServiceUtil.increment());
		}
		radSectionOne.setCurrentAuthNum(currentAuthorizationNo);
		radSectionOne.setReasonForAmendment(amendmentReason);
		radSectionOne.setTypeOfApplication(applicationType);
		radSectionOne.setHsraApplicationId(hsraApplicationId);
		System.out.println("HSRA Application Id--->>>"+hsraApplicationId);
		RadiationProtectionSecOneLocalServiceUtil.updateRadiationProtectionSecOne(radSectionOne);
		// TODO Auto-generated method stub
		return false;
	}
}