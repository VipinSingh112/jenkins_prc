/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.janaac.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.stages.services.exception.NoSuchJanaacApplicationStagesException;
import com.nbp.janaac.stages.services.model.JanaacApplicationStages;
import com.nbp.janaac.stages.services.service.base.JanaacApplicationStagesLocalServiceBaseImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.janaac.stages.services.model.JanaacApplicationStages", service = AopService.class)
public class JanaacApplicationStagesLocalServiceImpl extends JanaacApplicationStagesLocalServiceBaseImpl {
	public JanaacApplicationStages getJanaacByCI_SN(String caseId, String stageName)throws NoSuchJanaacApplicationStagesException {
		return janaacApplicationStagesPersistence.findBygetJanaac_By_CaseIdStageName(caseId, stageName);
	}

	public JanaacApplicationStages getJanaacByCI_ST_SN(String caseId, String stageStatus, String stageName)throws NoSuchJanaacApplicationStagesException {
		return janaacApplicationStagesPersistence.findBygetJanaac_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<JanaacApplicationStages> getJanaacByCI(String caseId) {
		return janaacApplicationStagesPersistence.findBygetJanaac_By_CaseId(caseId);
	}

	public JanaacApplicationStages getJanaacBy_CI(String caseId) throws NoSuchJanaacApplicationStagesException {
		return janaacApplicationStagesPersistence.findBygetJanaac_ByCaseId(caseId);
	}

	public JanaacApplicationStages getJanaacByCI_ST(String caseId, String stageStatus)throws NoSuchJanaacApplicationStagesException {
		return janaacApplicationStagesPersistence.findBygetJanaac_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<JanaacApplicationStages> getJanaacApplicationStage_By_SN(String stageName) {
		return janaacApplicationStagesPersistence.findBygetJanaac_By_StageName(stageName);
	}

	public JanaacApplicationStages updateJanaacApplicationStage(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		JanaacApplicationStages JanaacApplicationStage = null;

		try {
			JanaacApplicationStage = getJanaacByCI_SN(caseId, stageName);
		} catch (NoSuchJanaacApplicationStagesException e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(JanaacApplicationStage)) {
			// JadscApplicationStage.setStageStartDate(stageStartDate);
			JanaacApplicationStage.setStageEndDate(stageEndDate);
			JanaacApplicationStage.setStageStatus(stageStatus);
			JanaacApplicationStage.setDuration(duration);
			JanaacApplicationStage.setModifiedDate(new Date());
			JanaacApplicationStage.setCaseId(caseId);
			janaacApplicationStagesPersistence.update(JanaacApplicationStage);
		} else {
			JanaacApplicationStage = createJanaacApplicationStages(
					CounterLocalServiceUtil.increment(JanaacApplicationStages.class.getName()));
			JanaacApplicationStage.setStageName(stageName);
			JanaacApplicationStage.setStageStartDate(stageStartDate);
			JanaacApplicationStage.setStageEndDate(stageEndDate);
			JanaacApplicationStage.setStageStatus(stageStatus);
			JanaacApplicationStage.setDuration(duration);
			JanaacApplicationStage.setCreateDate(new Date());
			JanaacApplicationStage.setCaseId(caseId);
			janaacApplicationStagesPersistence.update(JanaacApplicationStage);
		}
		return JanaacApplicationStage;
	}

	public String getJanaacApplicationCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// --------next stage
		JanaacApplicationStages dataReview = null;
		try {
			dataReview = getJanaacByCI_SN(caseId, "Data Review/Verification");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataReview)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Data Review/Verification");
			jsonObject.put("status", dataReview.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dataReview.getStageStartDate())) {
				startDate = dataReview.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (dataReview.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataReview.getStageEndDate())) {
					endDate = dataReview.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Data Review/Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JanaacApplicationStages initialAssessment = null;

		try {
			initialAssessment = getJanaacByCI_SN(caseId, "Initial Assessment");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(initialAssessment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Initial Assessment");
			jsonObject.put("status", initialAssessment.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(initialAssessment.getStageStartDate())) {
				startDate = initialAssessment.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (initialAssessment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(initialAssessment.getStageEndDate())) {
					endDate = initialAssessment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Initial Assessment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JanaacApplicationStages onSiteAssessment = null;
		try {
			onSiteAssessment = getJanaacByCI_SN(caseId, "On-site Assessment (Inspection calendar)");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(onSiteAssessment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", onSiteAssessment.getStageName());
			jsonObject.put("status", onSiteAssessment.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(onSiteAssessment.getStageStartDate())) {
				startDate = onSiteAssessment.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (onSiteAssessment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(onSiteAssessment.getStageEndDate())) {
					endDate = onSiteAssessment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "On-site Assessment (Inspection calendar)");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JanaacApplicationStages verificationOfAssessment = null;
		try {
			verificationOfAssessment = getJanaacByCI_SN(caseId, "Verification of Assessment");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(verificationOfAssessment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", verificationOfAssessment.getStageName());
			jsonObject.put("status", verificationOfAssessment.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(verificationOfAssessment.getStageStartDate())) {
				startDate = verificationOfAssessment.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (verificationOfAssessment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(verificationOfAssessment.getStageEndDate())) {
					endDate = verificationOfAssessment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Verification of Assessment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JanaacApplicationStages reportApproved = null;
		try {
			reportApproved = getJanaacByCI_SN(caseId, "Report approved for AEC");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(reportApproved)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reportApproved.getStageName());
			jsonObject.put("status", reportApproved.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(reportApproved.getStageStartDate())) {
				startDate = reportApproved.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (reportApproved.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(reportApproved.getStageEndDate())) {
					endDate = reportApproved.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Report approved for AEC");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JanaacApplicationStages accreditationEvaluation = null;
		try {
			accreditationEvaluation = getJanaacByCI_SN(caseId, "Accreditation Evaluation Committee Decision");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(accreditationEvaluation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", accreditationEvaluation.getStageName());
			jsonObject.put("status", accreditationEvaluation.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(accreditationEvaluation.getStageStartDate())) {
				startDate = accreditationEvaluation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (accreditationEvaluation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(accreditationEvaluation.getStageEndDate())) {
					endDate = accreditationEvaluation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Accreditation Evaluation Committee Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JanaacApplicationStages decisionRetification = null;
		try {
			decisionRetification = getJanaacByCI_SN(caseId, "Decision Ratification");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(decisionRetification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", decisionRetification.getStageName());
			jsonObject.put("status", decisionRetification.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(decisionRetification.getStageStartDate())) {
				startDate = decisionRetification.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (decisionRetification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(decisionRetification.getStageEndDate())) {
					endDate = decisionRetification.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Decision Ratification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JanaacApplicationStages accrediationPackage = null;
		try {
			accrediationPackage = getJanaacByCI_SN(caseId, "Accreditation Package Preparation/Signing");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(accrediationPackage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", accrediationPackage.getStageName());
			jsonObject.put("status", accrediationPackage.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(accrediationPackage.getStageStartDate())) {
				startDate = accrediationPackage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (accrediationPackage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(accrediationPackage.getStageEndDate())) {
					endDate = accrediationPackage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Accreditation Package Preparation/Signing");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JanaacApplicationStages licenceAgreements = null;
		try {
			licenceAgreements = getJanaacByCI_SN(caseId, "Licence Agreements/Certificates Issued to CAB");
		} catch (NoSuchJanaacApplicationStagesException e) {
		}
		if (Validator.isNotNull(licenceAgreements)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", licenceAgreements.getStageName());
			jsonObject.put("status", licenceAgreements.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(licenceAgreements.getStageStartDate())) {
				startDate = licenceAgreements.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (licenceAgreements.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(licenceAgreements.getStageEndDate())) {
					endDate = licenceAgreements.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Licence Agreements/Certificates Issued to CAB");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		return stages.toString();
	}

	private String calculateWeeks(Date startDate, Date endDate) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(startDate);
		long dateBeforeInMs = startDate.getTime();
		long dateAfterInMs = endDate.getTime();
		long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
		long week = 0;
		long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
		if (daysDiff > 6) {
			week = daysDiff / 7;
			return week + " Week";
		} else {
			return daysDiff + " days";
		}
	}
}