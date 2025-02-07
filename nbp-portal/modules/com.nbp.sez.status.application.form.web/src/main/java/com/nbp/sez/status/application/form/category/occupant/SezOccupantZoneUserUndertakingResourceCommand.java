package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupantUserUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/zone/undertaking/info" }, service = MVCResourceCommand.class)
public class SezOccupantZoneUserUndertakingResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantZoneUserUndertakingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String occApplicantTitle = ParamUtil.getString(resourceRequest, "occApplicantTitle");
        String occApplicantName = ParamUtil.getString(resourceRequest, "occApplicantName");
        String occApplicantTeleNum = ParamUtil.getString(resourceRequest, "occApplicantTeleNum");
        String occApplicantEmail = ParamUtil.getString(resourceRequest, "occApplicantEmail");
        String occApplicantSignatureDate = ParamUtil.getString(resourceRequest, "occApplicantSignatureDate");
        String occPublicNotaryName = ParamUtil.getString(resourceRequest, "occPublicNotaryName");
        String occPublicNotarySignatureDate = ParamUtil.getString(resourceRequest, "occPublicNotarySignatureDate");
        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
        SezOccupantUserUndertakingInfo occupantUserUndertakingInfo=null;
        try {
        	occupantUserUndertakingInfo=SezOccupantUserUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
        }catch (Exception e) {
		}
        if(Validator.isNull(occupantUserUndertakingInfo)) {
        	occupantUserUndertakingInfo=SezOccupantUserUndertakingInfoLocalServiceUtil.createSezOccupantUserUndertakingInfo(CounterLocalServiceUtil.increment());
        }
        occupantUserUndertakingInfo.setOccApplicantTitle(occApplicantTitle);
        occupantUserUndertakingInfo.setOccApplicantName(occApplicantName);
        occupantUserUndertakingInfo.setOccApplicantTeleNum(occApplicantTeleNum);
        occupantUserUndertakingInfo.setOccApplicantEmail(occApplicantEmail);
        occupantUserUndertakingInfo.setSezStatusApplicationId(sezStatusApplicationId);
        try {
			occupantUserUndertakingInfo.setOccApplicantSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(occApplicantSignatureDate));
		} catch (ParseException e) {
		}
        occupantUserUndertakingInfo.setOccPublicNotaryName(occPublicNotaryName);
        try {
			occupantUserUndertakingInfo.setOccPublicNotarySignDate(new SimpleDateFormat("yyyy-MM-dd").parse(occPublicNotarySignatureDate));
		} catch (ParseException e) {
		}

        // Update the database with the modified entity
        SezOccupantUserUndertakingInfoLocalServiceUtil.updateSezOccupantUserUndertakingInfo(occupantUserUndertakingInfo);
	        return false;
	    }
	}