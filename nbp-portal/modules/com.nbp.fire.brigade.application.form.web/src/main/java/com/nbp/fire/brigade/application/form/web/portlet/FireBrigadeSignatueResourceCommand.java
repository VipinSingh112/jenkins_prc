package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeSignatureInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/signature/info" }, service = MVCResourceCommand.class)
public class FireBrigadeSignatueResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String title = ParamUtil.getString(resourceRequest, "title");
		String signName = ParamUtil.getString(resourceRequest, "signName");
		String signTelephone = ParamUtil.getString(resourceRequest, "signTelephone");
		String signFax = ParamUtil.getString(resourceRequest, "signFax");
		String applicantTrn = ParamUtil.getString(resourceRequest, "applicantTrn");
		String signEmail = ParamUtil.getString(resourceRequest, "signEmail");
		String signDate = ParamUtil.getString(resourceRequest, "signDate");
		String signAddress = ParamUtil.getString(resourceRequest, "signAddress");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadeSignatureInfo signatureInfo = null;
		try {
			signatureInfo=FireBrigadeSignatureInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
		} catch (Exception e) {
		}
        if(signatureInfo==null) {
		signatureInfo = FireBrigadeSignatureInfoLocalServiceUtil
				.createFireBrigadeSignatureInfo(CounterLocalServiceUtil.increment());
		}
		signatureInfo.setTitle(title);
		signatureInfo.setName(signName);
		signatureInfo.setTelephone(signTelephone);
		signatureInfo.setFax(signFax);
		signatureInfo.setTrn(applicantTrn);
		signatureInfo.setEmail(signEmail);
		try {
			signatureInfo.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(signDate));
		} catch (ParseException e) {
		}
		signatureInfo.setAddress(signAddress);
		signatureInfo.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeSignatureInfoLocalServiceUtil.updateFireBrigadeSignatureInfo(signatureInfo);
		return false;
	}
}