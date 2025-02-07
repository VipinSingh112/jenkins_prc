package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;
import com.nbp.sez.status.application.form.service.service.sezDeveloperUndertakingLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/undertaking/Info" }, service = MVCResourceCommand.class)
public class SezDeveloperUndertakingInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String applicantTitle = ParamUtil.getString(resourceRequest, "applicantTitle");
		String applicantName = ParamUtil.getString(resourceRequest, "applicantName");
		String applicantTeleNum = ParamUtil.getString(resourceRequest, "applicantTeleNum");
		String applicantEmail = ParamUtil.getString(resourceRequest, "applicantEmail");
		String applicantSignatureDate = ParamUtil.getString(resourceRequest, "applicantSignatureDate");
		String publicNotaryName = ParamUtil.getString(resourceRequest, "publicNotaryName");
		String publicNotarySignatureDate = ParamUtil.getString(resourceRequest, "publicNotarySignatureDate");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		sezDeveloperUndertaking developerUndertaking = null;
		try {
			developerUndertaking = sezDeveloperUndertakingLocalServiceUtil.getSezById(sezStatusApplicationId);	
		}catch (Exception e) {
			// TODO: handle exception
		}
		developerUndertaking = sezDeveloperUndertakingLocalServiceUtil
				.createsezDeveloperUndertaking(CounterLocalServiceUtil.increment());
		developerUndertaking.setTitleOfApplicant(applicantTitle);
		developerUndertaking.setNameOfApplicant(applicantName);
		developerUndertaking.setTelephoneNum(applicantTeleNum);
		developerUndertaking.setEmailAddress(applicantEmail);
		try {
			if (Validator.isNotNull(applicantSignatureDate)) {
				developerUndertaking
						.setApplicantSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(applicantSignatureDate));
			}
		} catch (ParseException e) {
		}
		developerUndertaking.setNameOfNotaryPublic(publicNotaryName);
		try {
			if (Validator.isNotNull(publicNotarySignatureDate)) {
				developerUndertaking.setPublicNotarySignatureDate(
						new SimpleDateFormat("yyyy-MM-dd").parse(publicNotarySignatureDate));
			}
		} catch (ParseException e) {
		}
		developerUndertaking.setSezStatusApplicationId(sezStatusApplicationId);
		sezDeveloperUndertakingLocalServiceUtil.updatesezDeveloperUndertaking(developerUndertaking);
		return false;
	}
}