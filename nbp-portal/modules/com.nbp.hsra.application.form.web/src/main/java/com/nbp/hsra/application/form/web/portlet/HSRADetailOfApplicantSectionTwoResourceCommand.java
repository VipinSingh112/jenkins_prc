package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.DetailOfApplicantSecTwo;
import com.nbp.hsra.application.service.service.DetailOfApplicantSecTwoLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/detail/applicant/section/two" }, service = MVCResourceCommand.class)

public class HSRADetailOfApplicantSectionTwoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HSRADetailOfApplicantSectionTwoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("inside Applicant Section Two****************");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String organizationName = ParamUtil.getString(resourceRequest, "organizationName");
		String nuclearMailingAddress = ParamUtil.getString(resourceRequest, "nuclearMailingAddress");
		String parish = ParamUtil.getString(resourceRequest, "parish");
		String nuclearTrnNumber = ParamUtil.getString(resourceRequest, "nuclearTrnNumber");
		String nuclearTelephoneNo = ParamUtil.getString(resourceRequest, "nuclearTelephoneNo");
		String nuclearFaxNo = ParamUtil.getString(resourceRequest, "nuclearFaxNo");
		String nuclearEmailAddress = ParamUtil.getString(resourceRequest, "nuclearEmailAddress");
		DetailOfApplicantSecTwo applicantDetail = null;
		try {
			applicantDetail = DetailOfApplicantSecTwoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(applicantDetail)) {
			applicantDetail = DetailOfApplicantSecTwoLocalServiceUtil
					.createDetailOfApplicantSecTwo(CounterLocalServiceUtil.increment());
		}
		applicantDetail.setOrganizationName(organizationName);
		applicantDetail.setNuclearMailingAddr(nuclearMailingAddress);
		applicantDetail.setParish(parish);
		applicantDetail.setNuclearTrnNumber(nuclearTrnNumber);
		applicantDetail.setNuclearTelephoneNo(nuclearTelephoneNo);
		applicantDetail.setNuclearFaxNo(nuclearFaxNo);
		applicantDetail.setNuclearEmailAddr(nuclearEmailAddress);
		applicantDetail.setHsraApplicationId(hsraApplicationId);
		DetailOfApplicantSecTwoLocalServiceUtil.updateDetailOfApplicantSecTwo(applicantDetail);
		return false;
	}

}
