package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;
import com.nbp.sez.status.application.form.service.service.SezZoneSubCheckInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/zone/submissionChecklist"
		},
		service = MVCResourceCommand.class
		)
public class SezStatusZoneSubmissionChecklistInfoResourceCommand implements MVCResourceCommand{
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		String generalRequirement = ParamUtil.getString(resourceRequest, "zoneUserGeneralReq");
		String companyInformation = ParamUtil.getString(resourceRequest, "zoneUserComInfoReq");
		String swornState = ParamUtil.getString(resourceRequest, "zoneSwornStateReq");
		String occupancyRequirement = ParamUtil.getString(resourceRequest, "zoneOccupancyReq");
		String approvals = ParamUtil.getString(resourceRequest, "zoneUserApprovals");
		String signatureName = ParamUtil.getString(resourceRequest, "zoneUserNameReq");
		String signatureDate = ParamUtil.getString(resourceRequest, "zoneUserDateReq");
		Long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezZoneSubCheckInfo sezZoneSubCheckInfo = null;
		try {
			sezZoneSubCheckInfo = SezZoneSubCheckInfoLocalServiceUtil.getSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(sezZoneSubCheckInfo==null) {		
				sezZoneSubCheckInfo = SezZoneSubCheckInfoLocalServiceUtil.createSezZoneSubCheckInfo(CounterLocalServiceUtil.increment());
		}
		sezZoneSubCheckInfo.setGeneralRequirement(generalRequirement);
		sezZoneSubCheckInfo.setCompanyInformation(companyInformation);
		sezZoneSubCheckInfo.setSwornState(swornState);
		sezZoneSubCheckInfo.setOccupancyRequirement(occupancyRequirement);
		sezZoneSubCheckInfo.setApprovals(approvals);
		sezZoneSubCheckInfo.setSignatureName(signatureName);
		try {
			if(Validator.isNotNull(signatureDate)) {
				sezZoneSubCheckInfo.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		sezZoneSubCheckInfo.setSezStatusApplicationId(sezStatusApplicationId);
		SezZoneSubCheckInfoLocalServiceUtil.updateSezZoneSubCheckInfo(sezZoneSubCheckInfo);
		return false;
	}
}
