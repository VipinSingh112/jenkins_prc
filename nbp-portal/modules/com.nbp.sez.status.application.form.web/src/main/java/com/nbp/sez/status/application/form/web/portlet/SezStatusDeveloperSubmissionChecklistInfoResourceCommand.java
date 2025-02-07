package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.sezSubmissionChecklist;
import com.nbp.sez.status.application.form.service.service.sezSubmissionChecklistLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/developer/submission/checklist/Info" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperSubmissionChecklistInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String selectedGeneral = ParamUtil.getString(resourceRequest, "selectedGeneral");
		String selectedComInfoReq = ParamUtil.getString(resourceRequest, "selectedComInfoReq");
		String paidShareCapProof = ParamUtil.getString(resourceRequest, "paidShareCapProof");
		String selectedSwornStateReq = ParamUtil.getString(resourceRequest, "selectedSwornStateReq");
		String selectedLandOccuReq = ParamUtil.getString(resourceRequest, "selectedLandOccuReq");
		String selectedSafetyHealthReq = ParamUtil.getString(resourceRequest, "selectedSafetyHealthReq");
		String selectedLandDevlopmentReq = ParamUtil.getString(resourceRequest, "selectedLandDevlopmentReq");
		String selectedTechInfoReq = ParamUtil.getString(resourceRequest, "selectedTechInfoReq");
		String selectedSezPreliminaryReq = ParamUtil.getString(resourceRequest, "selectedSezPreliminaryReq");
		String selectedSezDevDetailReq = ParamUtil.getString(resourceRequest, "selectedSezDevDetailReq");
		String selectedApprovalReq = ParamUtil.getString(resourceRequest, "selectedApprovalReq");
		String nameReq = ParamUtil.getString(resourceRequest, "nameReq");
		String dateReq = ParamUtil.getString(resourceRequest, "dateReq");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		sezSubmissionChecklist submissionChecklist = null;
		try {
			submissionChecklist = sezSubmissionChecklistLocalServiceUtil.getSezById(sezStatusApplicationId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(submissionChecklist==null) {
		submissionChecklist = sezSubmissionChecklistLocalServiceUtil
				.createsezSubmissionChecklist(CounterLocalServiceUtil.increment());
		}
		submissionChecklist.setSelectedGeneral(selectedGeneral);
		submissionChecklist.setSelectedComInfoReq(selectedComInfoReq);
		submissionChecklist.setPaidShareCapProof(paidShareCapProof);
		submissionChecklist.setSelectedSwornStateReq(selectedSwornStateReq);
		submissionChecklist.setSelectedLandOccuReq(selectedLandOccuReq);
		submissionChecklist.setSelectedSafetyHealthReq(selectedSafetyHealthReq);
		submissionChecklist.setSelectedLandDevlopmentReq(selectedLandDevlopmentReq);
		submissionChecklist.setSelectedTechInfoReq(selectedTechInfoReq);
		submissionChecklist.setSelectedSezPreliminaryReq(selectedSezPreliminaryReq);
		submissionChecklist.setSelectedSezDevDetailReq(selectedSezDevDetailReq);
		submissionChecklist.setSelectedApprovalReq(selectedApprovalReq);
		submissionChecklist.setNameReq(nameReq);
		submissionChecklist.setSezStatusApplicationId(sezStatusApplicationId);
		try {
			if (Validator.isNotNull(dateReq)) {
				submissionChecklist.setDateReq(new SimpleDateFormat("yyyy-MM-dd").parse(dateReq));
			}
		} catch (ParseException e) {
		}
		sezSubmissionChecklistLocalServiceUtil.updatesezSubmissionChecklist(submissionChecklist);
		return false;
	}

}
