package com.nbp.ogt.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ogt.application.form.services.model.OgtClaimToProperty;
import com.nbp.ogt.application.form.services.service.OgtClaimToPropertyLocalServiceUtil;
import com.nbp.ogt.application.form.web.constants.OgtApplicationFormWebPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OgtApplicationFormWebPortletKeys.OGTAPPLICATIONFORMWEB,
		"mvc.command.name=add/property/toClaim/formB" }, service = MVCResourceCommand.class)

public class OgtClaimToPropertyResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String bankruptcyDatePro = ParamUtil.getString(resourceRequest, "bankruptcyDatePro");
		String propClaimDescription = ParamUtil.getString(resourceRequest, "propClaimDescription");
		String affidavitDescription = ParamUtil.getString(resourceRequest, "affidavitDescription");
		long ogtApplicationId = ParamUtil.getLong(resourceRequest, "ogtApplicationId");
		OgtClaimToProperty formB = null;
		try {
			formB = OgtClaimToPropertyLocalServiceUtil.getOgtById(ogtApplicationId);
		} catch (Exception e) {
		}

		if (formB == null) {
			formB = OgtClaimToPropertyLocalServiceUtil.createOgtClaimToProperty(CounterLocalServiceUtil.increment());
		}
		try {
			if (Validator.isNotNull(bankruptcyDatePro)) {
				formB.setPropertyDate(new SimpleDateFormat("yyyy-MM-dd").parse(bankruptcyDatePro));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formB.setPropClaimDesc(propClaimDescription);
		formB.setAffidavitDesc(affidavitDescription);
		formB.setOgtApplicationId(ogtApplicationId);
		formB.setOgtApplicationId(ogtApplicationId);
		OgtClaimToPropertyLocalServiceUtil.updateOgtClaimToProperty(formB);
		return false;
	}

}
