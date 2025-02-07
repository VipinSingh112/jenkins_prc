package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeBreadDownAddinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/yearlyInfoUrl" }, service = MVCResourceCommand.class)
public class OSIServiceTrusteeIndividualYearlynfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		String breakdownWorkingYear = ParamUtil.getString(resourceRequest, "breakdownWorkingYear");
		String breakdownWorkingBankrupties = ParamUtil.getString(resourceRequest, "breakdownWorkingBankrupties");
		String breakdownWorkingProposal = ParamUtil.getString(resourceRequest, "breakdownWorkingProposal");
		String breakdownWorkingComBankrupts = ParamUtil.getString(resourceRequest, "breakdownWorkingComBankrupts");
		String breakdownWorkingComProposal = ParamUtil.getString(resourceRequest, "breakdownWorkingComProposal");
		String breakdownWorkingInterimReceive = ParamUtil.getString(resourceRequest, "breakdownWorkingInterimReceive");
		String breakdownWorkingCreditors = ParamUtil.getString(resourceRequest, "breakdownWorkingCreditors");
		String counter = ParamUtil.getString(resourceRequest, "yearlyWorkingTimeDetailVal");
		String breakdownWorkingOther = ParamUtil.getString(resourceRequest, "breakdownWorkingOther");
		long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
		long yearlyId = ParamUtil.getLong(resourceRequest, "yearlyWorkingTime");
		OsiServicesTrusteeBreadDownAddinfo addinfo = null;
		try {
			addinfo = OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil
					.getOsiServicesTrusteeBreadDownAddinfo(yearlyId);
		} catch (PortalException e) {
		}
		if (addinfo == null) {
			addinfo = OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil
					.createOsiServicesTrusteeBreadDownAddinfo(CounterLocalServiceUtil.increment());
			addinfo.setCounter(counter);
		}
		addinfo.setBreakdownWorkingYear(breakdownWorkingYear);
		addinfo.setWorkingBankrupties(breakdownWorkingBankrupties);
		addinfo.setWorkingProposal(breakdownWorkingProposal);
		addinfo.setWorkingComBankrupts(breakdownWorkingComBankrupts);
		addinfo.setWorkingComProposal(breakdownWorkingComProposal);
		addinfo.setWorkingInterimReceive(breakdownWorkingInterimReceive);
		addinfo.setBreakdownWorkingCreditors(breakdownWorkingCreditors);
		addinfo.setBreakdownWorkingOther(breakdownWorkingOther);
		addinfo.setOsiServicesApplicationId(osiServicesApplicationId);
		OsiServicesTrusteeBreadDownAddinfoLocalServiceUtil.updateOsiServicesTrusteeBreadDownAddinfo(addinfo);
		jsonOBJ.put("yearlyId", addinfo.getOsiTrusId());
		jsonOBJ.put("yearlyCounter", addinfo.getCounter());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}
		return false;
	}

}
