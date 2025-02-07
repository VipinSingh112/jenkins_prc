package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.NotifiLegalInfo;
import com.nbp.hsra.application.service.service.NotifiLegalInfoLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/legal/contact/info" }, service = MVCResourceCommand.class)

public class HsraRadiationNotificationLegalInfoResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraRadiationNotificationLegalInfoResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("--------calling radiation notification legal info resouce command--------");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String legalPersonName = ParamUtil.getString(resourceRequest, "legalPersonName");
		String legalPersonAddress = ParamUtil.getString(resourceRequest, "legalPersonAddress");
		String organizationName = ParamUtil.getString(resourceRequest, "organizationName");
		String organizationAddress = ParamUtil.getString(resourceRequest, "organizationAddress");
		String contactNumber = ParamUtil.getString(resourceRequest, "contactNumber");
		String legalPersonEmail = ParamUtil.getString(resourceRequest, "legalPersonEmail");
		String practiceNature = ParamUtil.getString(resourceRequest, "practiceNature");
		

		NotifiLegalInfo legalInfo = null;
		try {
			legalInfo = NotifiLegalInfoLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(legalInfo)) {
			legalInfo = NotifiLegalInfoLocalServiceUtil.createNotifiLegalInfo(CounterLocalServiceUtil.increment());
		}
		legalInfo.setHsraApplicationId(hsraApplicationId);
		legalInfo.setLegalPersonName(legalPersonName);
		legalInfo.setLegalPersonAddress(legalPersonAddress);
		legalInfo.setOrganizationName(organizationName);
		legalInfo.setOrganizationAddress(organizationAddress);
		legalInfo.setContactNumber(contactNumber);
		legalInfo.setLegalPersonEmail(legalPersonEmail);
		legalInfo.setPracticeNature(practiceNature);
		NotifiLegalInfoLocalServiceUtil.updateNotifiLegalInfo(legalInfo);
		return false;
	}
}