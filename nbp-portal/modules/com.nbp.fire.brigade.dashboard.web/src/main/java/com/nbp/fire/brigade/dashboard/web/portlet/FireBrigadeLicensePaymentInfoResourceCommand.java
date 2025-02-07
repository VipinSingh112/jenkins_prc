package com.nbp.fire.brigade.dashboard.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil;
import com.nbp.fire.brigade.dashboard.web.constants.FireBrigadeDashbaordPortletKeys;
import com.nbp.fire.brigade.stage.service.model.FireBrigadePaymentConfirmation;
import com.nbp.fire.brigade.stage.service.service.FireBrigadePaymentConfirmationLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + FireBrigadeDashbaordPortletKeys.FIREBRIGADEDASHBAORD,
		"mvc.command.name=/make/payment/verification" }, service = MVCResourceCommand.class)
public class FireBrigadeLicensePaymentInfoResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");
		FireBrigadePaymentConfirmation paymentConfirmation = null;
		FireBrigadeApplication fireApplication = null;
		try {
			fireApplication = FireBrigadeApplicationLocalServiceUtil
					.getFireBrigadeApplication(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
		try {
			paymentConfirmation = FireBrigadePaymentConfirmationLocalServiceUtil
					.getFireBrigadePaymentByCaseId(fireApplication.getCaseId());
		} catch (Exception e) {
		}
		if (paymentConfirmation == null) {
			paymentConfirmation = FireBrigadePaymentConfirmationLocalServiceUtil
					.createFireBrigadePaymentConfirmation(CounterLocalServiceUtil.increment());
		}
		paymentConfirmation.setStatus("In Progress");
		FireBrigadePaymentConfirmationLocalServiceUtil.updateFireBrigadePaymentConfirmation(paymentConfirmation);
		return false;
	}

}