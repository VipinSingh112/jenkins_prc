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

package com.nbp.sez.status.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationTable;
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStagesTable;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages", service = AopService.class)
public class SezStatusApplicationStagesLocalServiceImpl extends SezStatusApplicationStagesLocalServiceBaseImpl {
	public SezStatusApplicationStages getSAS_SAI(long sezStatusApplicationId)
			throws NoSuchSezStatusApplicationStagesException {
		return sezStatusApplicationStagesPersistence.findBygetSAS_SAI(sezStatusApplicationId);
	}

	public SezStatusApplicationStages getSAS_CaseIdStageName(String caseId, String stageName)
			throws NoSuchSezStatusApplicationStagesException {
		return sezStatusApplicationStagesPersistence.findBygetSAS_CaseIdStageName(caseId, stageName);
	}

	public SezStatusApplicationStages getSAS_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchSezStatusApplicationStagesException {
		return sezStatusApplicationStagesPersistence.findBygetSAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public SezStatusApplicationStages getSAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchSezStatusApplicationStagesException {
		return sezStatusApplicationStagesPersistence.findBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public List<SezStatusApplicationStages> getSAS_CaseId(String caseId) {
		return sezStatusApplicationStagesPersistence.findBygetSAS_CaseId(caseId);
	}

	public List<SezStatusApplicationStages> getSezStatusApplicationsList_By_SN(String stageName) {
		return sezStatusApplicationStagesPersistence.findBygetSAS_StageName(stageName);
	}
	public SezStatusApplicationStages getSezStatusApplications_By_CI(String caseId) throws NoSuchSezStatusApplicationStagesException {
		return sezStatusApplicationStagesPersistence.findBygetSAS_By_CaseId(caseId);
	}

	public Long getSezSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(SezStatusApplicationStagesTable.INSTANCE)
				.where(SezStatusApplicationStagesTable.INSTANCE.stageName.eq("Fact Check or Payment Verification")
						.and(SezStatusApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(SezStatusApplicationTable.INSTANCE.caseId)
										.from(SezStatusApplicationTable.INSTANCE)
										.where(SezStatusApplicationTable.INSTANCE.status.eq(0)
												.and(SezStatusApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public List<String> getSezDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(SezStatusApplicationStagesTable.INSTANCE.stageName)
				.from(SezStatusApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public SezStatusApplicationStages updateSezStatusApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {
		SezStatusApplicationStages sezStatusApplicationStages = null;
		sezStatusApplicationStages = sezStatusApplicationStagesPersistence.fetchBygetSAS_CaseIdStageName(caseId,
				stageName);
		if (Validator.isNotNull(sezStatusApplicationStages)) {
			sezStatusApplicationStages.setStageEndDate(stageEndDate);
			sezStatusApplicationStages.setStageStatus(stageStatus);
			sezStatusApplicationStages.setDuration(duration);
			sezStatusApplicationStages.setModifiedDate(new Date());
			sezStatusApplicationStagesPersistence.update(sezStatusApplicationStages);
		} else {
			sezStatusApplicationStages = createSezStatusApplicationStages(
					CounterLocalServiceUtil.increment(SezStatusApplicationStages.class.getName()));
			sezStatusApplicationStages.setStageName(stageName);
			sezStatusApplicationStages.setStageStartDate(stageStartDate);
			sezStatusApplicationStages.setStageEndDate(stageEndDate);
			sezStatusApplicationStages.setStageStatus(stageStatus);
			sezStatusApplicationStages.setCaseId(caseId);
			sezStatusApplicationStages.setDuration(duration);
			sezStatusApplicationStages.setCreateDate(new Date());
			sezStatusApplicationStagesPersistence.update(sezStatusApplicationStages);
		}
		return sezStatusApplicationStages;
	}

	public String getSezStatusCurrentStages(String caseId) throws NoSuchSezStatusApplicationStagesException {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SezStatusApplicationStages paymentVerification = null;
		try {
			paymentVerification = getSAS_CaseIdStageName(caseId, "Fact Check or Payment Verification");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(paymentVerification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", paymentVerification.getStageName());
			jsonObject.put("status", paymentVerification.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(paymentVerification.getStageStartDate())) {
				startDate = paymentVerification.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (paymentVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(paymentVerification.getStageEndDate())) {
					endDate = paymentVerification.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Fact Check or Payment Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}

		/*
		 * SezStatusApplicationStages applicationValidation =null; try {
		 * applicationValidation = getSAS_CaseIdStageName(caseId,
		 * "Application Validation"); }catch (Exception e) { // TODO: handle exception }
		 * if(Validator.isNotNull(applicationValidation)) { JSONObject jsonObject =
		 * JSONFactoryUtil.createJSONObject(); jsonObject.put("stageName",
		 * applicationValidation.getStageName()); jsonObject.put("status",
		 * applicationValidation.getStageStatus()); Date startDate= new Date();
		 * if(Validator.isNotNull(applicationValidation.getStageStartDate())) {
		 * startDate = applicationValidation.getStageStartDate();
		 * jsonObject.put("startDate",bpmDateFormat.format(startDate)); }else {
		 * jsonObject.put("startDate",bpmDateFormat.format(startDate)); } Date endDate =
		 * new Date(); if(applicationValidation.getStageStatus().equals("Closed")) {
		 * if(Validator.isNotNull(applicationValidation.getStageEndDate())) { endDate =
		 * applicationValidation.getStageEndDate(); }
		 * jsonObject.put("endDate",bpmDateFormat.format(endDate)); } else {
		 * jsonObject.put("endDate", ""); }
		 * jsonObject.put("duration",calculateWeeks(startDate, endDate));
		 * stages.put(jsonObject); }else { JSONObject jsonObject =
		 * JSONFactoryUtil.createJSONObject();
		 * jsonObject.put("stageName","Application Validation");
		 * jsonObject.put("status",""); jsonObject.put("duration", "");
		 * jsonObject.put("startDate", ""); jsonObject.put("endDate", "");
		 * stages.put(jsonObject); }
		 */
		SezStatusApplicationStages applicationAssigmentReview = null;
		try {
			applicationAssigmentReview = getSAS_CaseIdStageName(caseId, "Application Assignment/Review");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(applicationAssigmentReview)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", applicationAssigmentReview.getStageName());
			jsonObject.put("status", applicationAssigmentReview.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(applicationAssigmentReview.getStageStartDate())) {
				startDate = applicationAssigmentReview.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (applicationAssigmentReview.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(applicationAssigmentReview.getStageEndDate())) {
					endDate = applicationAssigmentReview.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Application Assignment/Review");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		SezStatusApplicationStages commiteeArcRecommendation = null;
		try {
			commiteeArcRecommendation = getSAS_CaseIdStageName(caseId, "Committee(ARC) Recommendations");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(commiteeArcRecommendation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", commiteeArcRecommendation.getStageName());
			jsonObject.put("status", commiteeArcRecommendation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(commiteeArcRecommendation.getStageStartDate())) {
				startDate = commiteeArcRecommendation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (commiteeArcRecommendation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(commiteeArcRecommendation.getStageEndDate())) {
					endDate = commiteeArcRecommendation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Committee(ARC) Recommendations");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}
		SezStatusApplicationStages boardDecision = null;
		try {
			boardDecision = getSAS_CaseIdStageName(caseId, "Board Decision");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(boardDecision)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", boardDecision.getStageName());
			jsonObject.put("status", boardDecision.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(boardDecision.getStageStartDate())) {
				startDate = boardDecision.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (boardDecision.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(boardDecision.getStageEndDate())) {
					endDate = boardDecision.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Board Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}
		SezStatusApplicationStages preApprovalCon = null;
		try {
			preApprovalCon = getSAS_CaseIdStageName(caseId, "Pre-Approval/Conditions");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(preApprovalCon)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", preApprovalCon.getStageName());
			jsonObject.put("status", preApprovalCon.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(preApprovalCon.getStageStartDate())) {
				startDate = preApprovalCon.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (preApprovalCon.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(preApprovalCon.getStageEndDate())) {
					endDate = preApprovalCon.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Pre-Approval/Conditions");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}
		SezStatusApplicationStages issuanceOfLicence = null;
		try {
			issuanceOfLicence = getSAS_CaseIdStageName(caseId, "Issuance of Licence Agreement/ Certificates");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(issuanceOfLicence)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuanceOfLicence.getStageName());
			jsonObject.put("status", issuanceOfLicence.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(issuanceOfLicence.getStageStartDate())) {
				startDate = issuanceOfLicence.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (issuanceOfLicence.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuanceOfLicence.getStageEndDate())) {
					endDate = issuanceOfLicence.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Licence Agreement/ Certificates");
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
	public String getSezStatusWFMCurrentStages(String caseId) throws NoSuchSezStatusApplicationStagesException {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SezStatusApplicationStages review = null;
		try {
			review = getSAS_CaseIdStageName(caseId, "Review for Sufficiency");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(review)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", review.getStageName());
			jsonObject.put("status", review.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(review.getStageStartDate())) {
				startDate = review.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (review.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(review.getStageEndDate())) {
					endDate = review.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review for Sufficiency");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}
		SezStatusApplicationStages decision = null;
		try {
			review = getSAS_CaseIdStageName(caseId, "Decision (Approve or Refuse)");
		} catch (Exception e) {
			
		}
		if (Validator.isNotNull(decision)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", decision.getStageName());
			jsonObject.put("status", decision.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(decision.getStageStartDate())) {
				startDate = decision.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (decision.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(decision.getStageEndDate())) {
					endDate = decision.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Decision (Approve or Refuse)");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			
			stages.put(jsonObject);
		}
		SezStatusApplicationStages letter = null;
		try {
			letter = getSAS_CaseIdStageName(caseId, "Approval Letter Issued");
		} catch (Exception e) {
			
		}
		if (Validator.isNotNull(letter)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", letter.getStageName());
			jsonObject.put("status", letter.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(letter.getStageStartDate())) {
				startDate = letter.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (letter.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(letter.getStageEndDate())) {
					endDate = letter.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Approval Letter Issued");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			
			stages.put(jsonObject);
		}
		return stages.toString();}
}