package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneDevUnderInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/developerUndertaking"
		},
		service = MVCResourceCommand.class
		)
public class SezStatusZoneDeveloperUndertakingInfoResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String developerName = ParamUtil.getString(resourceRequest, "zoneDevUndertakingDevName");
		String approvalLetterNum = ParamUtil.getString(resourceRequest, "zoneDevUndertakingApprLetter");
		String approvalLetterDate = ParamUtil.getString(resourceRequest, "zoneDevUndertakingDate");
		String developerAgreeNum = ParamUtil.getString(resourceRequest, "zoneDevUndertakingAgreeNum");
		String developerAgreeDate = ParamUtil.getString(resourceRequest, "zoneDevUndertakingAgreeDate");
		String developerControlNum = ParamUtil.getString(resourceRequest, "zoneDevUndertakingControlNum");
		String declarantTitle = ParamUtil.getString(resourceRequest, "zoneDevApplicantTitle");
		String declarantName = ParamUtil.getString(resourceRequest, "zoneDevApplicantName");
		String declarantTelephoneNum = ParamUtil.getString(resourceRequest, "zoneDevApplicantTele");
		String declarantEmail = ParamUtil.getString(resourceRequest, "zoneDevApplicantEmail");
		String signatureDate = ParamUtil.getString(resourceRequest, "zoneDevApplicantSignatureDate");
		String publicNotaryName = ParamUtil.getString(resourceRequest, "zoneDevPublicNotaryName");
		String publicNotarySignatureDate = ParamUtil.getString(resourceRequest, "zoneDevPublicNotarySignatureDate");
		Long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezZoneDevUnderInfo sezZoneDevUnderInfo = null;
		try {
			sezZoneDevUnderInfo = SezZoneDevUnderInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
		}
		if(sezZoneDevUnderInfo==null) {
		sezZoneDevUnderInfo = SezZoneDevUnderInfoLocalServiceUtil.createSezZoneDevUnderInfo(CounterLocalServiceUtil.increment());
		}
		sezZoneDevUnderInfo.setDeveloperName(developerName);
		sezZoneDevUnderInfo.setApprovalLetterNum(approvalLetterNum);
		try {
			if(Validator.isNotNull(approvalLetterDate)) {
		    sezZoneDevUnderInfo.setApprovalLetterDate(new SimpleDateFormat("yyyy-MM-dd").parse(approvalLetterDate));
			}
		}catch(Exception e) {
		}
		sezZoneDevUnderInfo.setDeveloperAgreeNum(developerAgreeNum);
		try {
			if(Validator.isNotNull(developerAgreeDate)) {
				sezZoneDevUnderInfo.setDeveloperAgreeDate(new SimpleDateFormat("yyyy-MM-dd").parse(developerAgreeDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneDevUnderInfo.setDeveloperControlNum(developerControlNum);
		sezZoneDevUnderInfo.setDeclarantTitle(declarantTitle);
		sezZoneDevUnderInfo.setDeclarantName(declarantName);
		sezZoneDevUnderInfo.setDeclarantTelephoneNum(declarantTelephoneNum);
		sezZoneDevUnderInfo.setDeclarantEmail(declarantEmail);
		try {
			if(Validator.isNotNull(signatureDate)) {
				sezZoneDevUnderInfo.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneDevUnderInfo.setPublicNotaryName(publicNotaryName);
		try {
			if(Validator.isNotNull(publicNotarySignatureDate)) {
				sezZoneDevUnderInfo.setPublicNotarySignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(publicNotarySignatureDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneDevUnderInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezZoneDevUnderInfoLocalServiceUtil.updateSezZoneDevUnderInfo(sezZoneDevUnderInfo);
		return false;
	}
}
