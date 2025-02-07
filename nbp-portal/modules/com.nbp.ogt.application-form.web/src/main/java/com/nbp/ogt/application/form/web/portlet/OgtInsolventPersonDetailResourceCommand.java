package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail;
import com.nbp.ogt.application.form.services.service.OgtInsolventPersonDetailLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=add/insolvent/detail/info" }, service = MVCResourceCommand.class)

public class OgtInsolventPersonDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String insolventPersonNature = ParamUtil.getString(resourceRequest, "insolventPersonNature");
		String insolventIndiFirstName = ParamUtil.getString(resourceRequest, "insolventIndiFirstName");
		String insolventIndiLastName = ParamUtil.getString(resourceRequest, "insolventIndiLastName");
		String insolventCompanyName = ParamUtil.getString(resourceRequest, "insolventCompanyName");
		String debtstatute = ParamUtil.getString(resourceRequest, "debtstatute");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		OgtInsolventPersonDetail insolventDetail = null;
		try {
			insolventDetail = OgtInsolventPersonDetailLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}

		if (insolventDetail == null) {
			insolventDetail = OgtInsolventPersonDetailLocalServiceUtil
					.createOgtInsolventPersonDetail(CounterLocalServiceUtil.increment());
		}
		insolventDetail.setNatureOfInsolvent(insolventPersonNature);
		insolventDetail.setInsolventFirstName(insolventIndiFirstName);
		insolventDetail.setInsolventLastName(insolventIndiLastName);
		insolventDetail.setInsolventCompanyName(insolventCompanyName);
		insolventDetail.setInsolventDebtStatute(debtstatute);
		insolventDetail.setOgtApplicationId(ogtApplicationId);
		OgtInsolventPersonDetailLocalServiceUtil.updateOgtInsolventPersonDetail(insolventDetail);
		return false;
	}
}