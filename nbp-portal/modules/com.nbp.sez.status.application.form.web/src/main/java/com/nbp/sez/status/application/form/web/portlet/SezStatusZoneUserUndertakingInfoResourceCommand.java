package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneUserUnderInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/userUndertaking"
		},
		service = MVCResourceCommand.class
		)
public class SezStatusZoneUserUndertakingInfoResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String declarantTitle = ParamUtil.getString(resourceRequest, "zoneUserDeclarantTitle");
		String declarantName = ParamUtil.getString(resourceRequest, "zoneUserDeclarantName");
		String declarantTeleNum = ParamUtil.getString(resourceRequest, "zoneUserDeclarantTeleNum");
		String declarantEmail = ParamUtil.getString(resourceRequest, "zoneUserDeclarantEmail");
		String applicantSignatureDate = ParamUtil.getString(resourceRequest, "zoneUserApplicantSignatureDate");
		String publicNotaryName = ParamUtil.getString(resourceRequest, "zoneUserPublicNotaryName");
		String publicNotarySignatureDate = ParamUtil.getString(resourceRequest, "zoneUserPublicNotarySignatureDate");
		Long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		
		SezZoneUserUnderInfo sezZoneUserUnderInfo = null;
		try {
			sezZoneUserUnderInfo = SezZoneUserUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}
		if(sezZoneUserUnderInfo==null) {
			sezZoneUserUnderInfo = SezZoneUserUnderInfoLocalServiceUtil.createSezZoneUserUnderInfo(CounterLocalServiceUtil.increment());
		}		
		sezZoneUserUnderInfo.setDeclarantTitle(declarantTitle);
		sezZoneUserUnderInfo.setDeclarantName(declarantName);
		sezZoneUserUnderInfo.setDeclarantTeleNum(declarantTeleNum);
		sezZoneUserUnderInfo.setDeclarantEmail(declarantEmail);
		try {
			if(Validator.isNotNull(applicantSignatureDate)) {
				sezZoneUserUnderInfo.setApplicantSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(applicantSignatureDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneUserUnderInfo.setPublicNotaryName(publicNotaryName);
		try {
			if(Validator.isNotNull(publicNotarySignatureDate)) {
				sezZoneUserUnderInfo.setPublicNotarySignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(publicNotarySignatureDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneUserUnderInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezZoneUserUnderInfoLocalServiceUtil.updateSezZoneUserUnderInfo(sezZoneUserUnderInfo);
		return false;
	}
}
