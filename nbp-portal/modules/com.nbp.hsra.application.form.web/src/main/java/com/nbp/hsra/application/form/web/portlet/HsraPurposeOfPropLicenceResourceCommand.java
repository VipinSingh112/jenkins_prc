package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.service.PurposeOfPropLicenceLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/purpose/prop/lic/four" }, service = MVCResourceCommand.class)

public class HsraPurposeOfPropLicenceResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraPurposeOfPropLicenceResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("inside hsra purpose of proplicence resource command*********");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String nuclearRegistrationLicence = ParamUtil.getString(resourceRequest, "nuclearRegistrationLicence");
		String nuclearBusinessPlace = ParamUtil.getString(resourceRequest, "nuclearBusinessPlace");
		String nuclearActivityMainAdd = ParamUtil.getString(resourceRequest, "nuclearActivityMainAdd");
		String applicationType = ParamUtil.getString(resourceRequest, "applicationType");
		String nuclearAdditionalLocation = ParamUtil.getString(resourceRequest, "nuclearAdditionalLocation");

		PurposeOfPropLicence purposeLicence = null;
		try {
			purposeLicence = PurposeOfPropLicenceLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(purposeLicence)) {
			purposeLicence = PurposeOfPropLicenceLocalServiceUtil
					.createPurposeOfPropLicence(CounterLocalServiceUtil.increment());
		}
		purposeLicence.setNuclearRegstLic(nuclearRegistrationLicence);
		purposeLicence.setNuclearBusinessPlace(nuclearBusinessPlace);
		purposeLicence.setNuclearActivityMainAdd(nuclearActivityMainAdd);
		purposeLicence.setApplicationType(applicationType);
		purposeLicence.setNuclearAdditionalLoc(nuclearAdditionalLocation);
		purposeLicence.setHsraApplicationId(hsraApplicationId);
		PurposeOfPropLicenceLocalServiceUtil.updatePurposeOfPropLicence(purposeLicence);

		return false;
	}

}
