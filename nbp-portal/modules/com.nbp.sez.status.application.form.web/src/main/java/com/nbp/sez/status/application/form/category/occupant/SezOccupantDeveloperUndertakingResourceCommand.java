package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupanteDeveloperUndertakingInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/delivery/undertaking/info" }, service = MVCResourceCommand.class)
public class SezOccupantDeveloperUndertakingResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(SezOccupantDeveloperUndertakingResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		 String occUndertakingDevName = ParamUtil.getString(resourceRequest, "occUndertakingDevName");
	        String occUndertakingApprLetter = ParamUtil.getString(resourceRequest, "occUndertakingApprLetter");
	        String occUndertakingDate = ParamUtil.getString(resourceRequest, "occUndertakingDate");
	        String occUndertakingAgreeNum = ParamUtil.getString(resourceRequest, "occUndertakingAgreeNum");
	        String occUndertakingAgreeDate = ParamUtil.getString(resourceRequest, "occUndertakingAgreeDate");
	        String occUndertakingControlNum = ParamUtil.getString(resourceRequest, "occUndertakingControlNum");
	        String occDevApplicantTitle = ParamUtil.getString(resourceRequest, "occDevApplicantTitle");
	        String occDevApplicantName = ParamUtil.getString(resourceRequest, "occDevApplicantName");
	        String occDevApplicantTele = ParamUtil.getString(resourceRequest, "occDevApplicantTele");
	        String occDevApplicantEmail = ParamUtil.getString(resourceRequest, "occDevApplicantEmail");
	        String occDevApplicantSignatureDate = ParamUtil.getString(resourceRequest, "occDevApplicantSignatureDate");
	        String occDevPublicNotaryName = ParamUtil.getString(resourceRequest, "occDevPublicNotaryName");
	        String occDevPublicNotarySignatureDate = ParamUtil.getString(resourceRequest, "occDevPublicNotarySignatureDate");
	        long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
	        SezOccupanteDeveloperUndertakingInfo developerUndertakingInfo=null;
	        try {
	        	developerUndertakingInfo= SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.getSezStatusBy_Id(sezStatusApplicationId);
			} catch (Exception e) {
			}
	        if(Validator.isNull(developerUndertakingInfo)) {
	        	developerUndertakingInfo= SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.createSezOccupanteDeveloperUndertakingInfo(CounterLocalServiceUtil.increment());
	        }
	        developerUndertakingInfo.setOccUndertakingDevName(occUndertakingDevName);
	        developerUndertakingInfo.setOccUndertakingApprLetter(occUndertakingApprLetter);
	        try {
				developerUndertakingInfo.setOccUndertakingDate(new SimpleDateFormat("yyyy-MM-dd").parse(occUndertakingDate));
			} catch (ParseException e) {
			}
	        developerUndertakingInfo.setOccUndertakingAgreeNum(occUndertakingAgreeNum);
	        try {
				developerUndertakingInfo.setOccUndertakingAgreeDate(new SimpleDateFormat("yyyy-MM-dd").parse(occUndertakingAgreeDate));
			} catch (ParseException e) {
			}
	        developerUndertakingInfo.setOccUndertakingControlNum(occUndertakingControlNum);
	        developerUndertakingInfo.setOccDevApplicantTitle(occDevApplicantTitle);
	        developerUndertakingInfo.setOccDevApplicantName(occDevApplicantName);
	        developerUndertakingInfo.setOccDevApplicantTele(occDevApplicantTele);
	        developerUndertakingInfo.setOccDevApplicantEmail(occDevApplicantEmail);
	        try {
				developerUndertakingInfo.setOccDevApplicantSignDate(new SimpleDateFormat("yyyy-MM-dd").parse(occDevApplicantSignatureDate));
			} catch (ParseException e) {
			}
	        developerUndertakingInfo.setOccDevPublicNotaryName(occDevPublicNotaryName);
	        try {
				developerUndertakingInfo.setOccDevPublicNotarySignDate(new SimpleDateFormat("yyyy-MM-dd").parse(occDevPublicNotarySignatureDate));
			} catch (ParseException e) {
			}
	        developerUndertakingInfo.setSezStatusApplicationId(sezStatusApplicationId);
	        // Update the database with the modified entity
	        SezOccupanteDeveloperUndertakingInfoLocalServiceUtil.updateSezOccupanteDeveloperUndertakingInfo(developerUndertakingInfo);
	        _log.info("[SAVE COMPLETE]");

	        return false;
	    }
	}