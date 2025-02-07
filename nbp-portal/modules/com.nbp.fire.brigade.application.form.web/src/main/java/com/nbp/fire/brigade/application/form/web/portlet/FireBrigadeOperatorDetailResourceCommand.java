package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeOperatorDetailLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/operator/detail/info" }, service = MVCResourceCommand.class)
public class FireBrigadeOperatorDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String operatorName = ParamUtil.getString(resourceRequest, "operatorName");
		String businessName = ParamUtil.getString(resourceRequest, "businessName");
		String operatorAddress = ParamUtil.getString(resourceRequest, "operatorAddress");
		String premisesUses = ParamUtil.getString(resourceRequest, "premisesUses");
		String premisesOccupancy = ParamUtil.getString(resourceRequest, "premisesOccupancy");
		String premisesBusiness = ParamUtil.getString(resourceRequest, "premisesBusiness");
		String maxWorkingPersons = ParamUtil.getString(resourceRequest, "maxWorkingPersons");
		String maxNonWorkingPersons = ParamUtil.getString(resourceRequest, "maxNonWorkingPersons");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadeOperatorDetail operatorDetail = null;
		try {
			operatorDetail = FireBrigadeOperatorDetailLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		if (operatorDetail == null) {
			operatorDetail = FireBrigadeOperatorDetailLocalServiceUtil
					.createFireBrigadeOperatorDetail(CounterLocalServiceUtil.increment());
		}
		operatorDetail.setOperatorName(operatorName);
		operatorDetail.setBusinessName(businessName);
		operatorDetail.setAddress(operatorAddress);
		operatorDetail.setPremisesUses(premisesUses);
		operatorDetail.setPremisesOccupancy(premisesOccupancy);
		operatorDetail.setPremisesBusiness(premisesBusiness);
		operatorDetail.setMaxWorkingPersons(maxWorkingPersons);
		operatorDetail.setMaxNumPersonsAtAnyOneTime(maxNonWorkingPersons);
		operatorDetail.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeOperatorDetailLocalServiceUtil.updateFireBrigadeOperatorDetail(operatorDetail);
		return false;
	}
}