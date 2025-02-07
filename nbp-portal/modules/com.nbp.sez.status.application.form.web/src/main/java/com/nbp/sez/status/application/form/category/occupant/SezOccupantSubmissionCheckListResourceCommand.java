package com.nbp.sez.status.application.form.category.occupant;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezOccupanteSubmissionChecklistInfo;
import com.nbp.sez.status.application.form.service.service.SezOccupanteSubmissionChecklistInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/sez/status/occupant/submission/info" }, service = MVCResourceCommand.class)
public class SezOccupantSubmissionCheckListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(SezOccupantSubmissionCheckListResourceCommand.class.getName());

	public static void task(String taskName) {
	}

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String occNameReq = ParamUtil.getString(resourceRequest, "occNameReq");
		String occDateReq = ParamUtil.getString(resourceRequest, "occDateReq");
		String occGeneral = ParamUtil.getString(resourceRequest, "occGeneral");
		String occComInfoRequest = ParamUtil.getString(resourceRequest, "occComInfoRequest");
		String occSwanStateRequest = ParamUtil.getString(resourceRequest, "occSwanStateRequest");
		String occSelectedRequest = ParamUtil.getString(resourceRequest, "occSelectedRequest");
		String occSelectedFacilityRequest = ParamUtil.getString(resourceRequest, "occSelectedFacilityRequest");
		String occSelectedApprovals = ParamUtil.getString(resourceRequest, "occSelectedApprovals");
		String occSelectedSecurityRequest = ParamUtil.getString(resourceRequest, "occSelectedSecurityRequest");
		String occSelectedSDetailedBussiness = ParamUtil.getString(resourceRequest, "occSelectedSDetailedBussiness");
		String occPaidShareCapProof = ParamUtil.getString(resourceRequest, "occPaidShareCapProof");
		long sezStatusApplicationId = ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezOccupanteSubmissionChecklistInfo submissionChecklistInfo = null;
		try {
			submissionChecklistInfo = SezOccupanteSubmissionChecklistInfoLocalServiceUtil
					.getSezStatusBy_Id(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(submissionChecklistInfo)) {
			submissionChecklistInfo = SezOccupanteSubmissionChecklistInfoLocalServiceUtil
					.createSezOccupanteSubmissionChecklistInfo(CounterLocalServiceUtil.increment());
		}
		submissionChecklistInfo.setOccNameReq(occNameReq);
		submissionChecklistInfo.setOccDateReq(occDateReq);
		submissionChecklistInfo.setOccGeneral(occGeneral);
		submissionChecklistInfo.setOccComInfoRequest(occComInfoRequest);
		submissionChecklistInfo.setOccSwanStateRequest(occSwanStateRequest);
		submissionChecklistInfo.setOccSelectedRequest(occSelectedRequest);
		submissionChecklistInfo.setOccSelectedFacilityRequest(occSelectedFacilityRequest);
		submissionChecklistInfo.setOccSelectedApprovals(occSelectedApprovals);
		submissionChecklistInfo.setOccSelectedSecurityRequest(occSelectedSecurityRequest);
		submissionChecklistInfo.setOccSelectedSDetailedBussiness(occSelectedSDetailedBussiness);
		submissionChecklistInfo.setOccPaidShareCapProof(occPaidShareCapProof);
		submissionChecklistInfo.setSezStatusApplicationId(sezStatusApplicationId);
		// Update the database with the modified entity
		SezOccupanteSubmissionChecklistInfoLocalServiceUtil
				.updateSezOccupanteSubmissionChecklistInfo(submissionChecklistInfo);

		return false;
	}
}