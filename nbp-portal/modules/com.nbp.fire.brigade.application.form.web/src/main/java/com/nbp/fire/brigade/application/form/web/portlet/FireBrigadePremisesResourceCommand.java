package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/permises/info" }, service = MVCResourceCommand.class)
public class FireBrigadePremisesResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String premisesStatus = ParamUtil.getString(resourceRequest, "premisesStatus");
		String premisesCertified = ParamUtil.getString(resourceRequest, "premisesCertified");
		String expirationDate = ParamUtil.getString(resourceRequest, "expirationDate");
		String certificateNumber = ParamUtil.getString(resourceRequest, "certificateNumber");
		String name = ParamUtil.getString(resourceRequest, "name");
		String address = ParamUtil.getString(resourceRequest, "address");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadePremisesInfo premisesInfo = null;
		try {
			premisesInfo = FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (premisesInfo == null) {
			premisesInfo = FireBrigadePremisesInfoLocalServiceUtil
					.createFireBrigadePremisesInfo(CounterLocalServiceUtil.increment());
		}
		premisesInfo.setPremises(premisesStatus);
		premisesInfo.setPremisesCertified(premisesCertified);
		try {
			premisesInfo.setExpirationDate(new SimpleDateFormat("yyyy-MM-dd").parse(expirationDate));
		} catch (ParseException e) {
		}
		premisesInfo.setCertificateNumber(certificateNumber);
		premisesInfo.setName(name);
		premisesInfo.setAddress(address);
		premisesInfo.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadePremisesInfoLocalServiceUtil.updateFireBrigadePremisesInfo(premisesInfo);

		return false;
	}
}