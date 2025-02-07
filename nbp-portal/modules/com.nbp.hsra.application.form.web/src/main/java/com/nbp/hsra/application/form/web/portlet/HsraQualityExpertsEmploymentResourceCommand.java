package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.QualityEmploymentInfo;
import com.nbp.hsra.application.service.service.QualityEmploymentInfoLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/quality/employement" }, service = MVCResourceCommand.class)

public class HsraQualityExpertsEmploymentResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraQualityExpertsEmploymentResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling QUALITY EMPLOYMENT*******");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String employmentCompanyName = ParamUtil.getString(resourceRequest, "employmentCompanyName");
		String employmentTeleNo = ParamUtil.getString(resourceRequest, "employmentTeleNo");
		String employmentAddress = ParamUtil.getString(resourceRequest, "employmentAddress");
		String employmentParish = ParamUtil.getString(resourceRequest, "employmentParish");
		String employmentMobileNo = ParamUtil.getString(resourceRequest, "employmentMobileNo");
		String employmentEmailAddress = ParamUtil.getString(resourceRequest, "employmentEmailAddress");

		QualityEmploymentInfo employmentDetails = null;
		try {
			employmentDetails = QualityEmploymentInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(employmentDetails)) {
			employmentDetails = QualityEmploymentInfoLocalServiceUtil
					.createQualityEmploymentInfo(CounterLocalServiceUtil.increment());
		}
		employmentDetails.setCompanyName(employmentCompanyName);
		employmentDetails.setTeleNo(employmentTeleNo);
		employmentDetails.setAddress(employmentAddress);
		employmentDetails.setParish(employmentParish);
		employmentDetails.setMobileNo(employmentMobileNo);
		employmentDetails.setEmailAddress(employmentEmailAddress);
		employmentDetails.setHsraApplicationId(hsraApplicationId);
		QualityEmploymentInfoLocalServiceUtil.updateQualityEmploymentInfo(employmentDetails);
		return false;
	}

}
