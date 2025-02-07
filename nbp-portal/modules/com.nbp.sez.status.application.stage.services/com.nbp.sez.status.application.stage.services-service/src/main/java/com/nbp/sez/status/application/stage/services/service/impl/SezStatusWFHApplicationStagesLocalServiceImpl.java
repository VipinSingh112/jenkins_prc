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
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWFHApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;
import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStagesTable;
import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusWFHApplicationStagesLocalServiceBaseImpl;

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
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages",
	service = AopService.class
)
public class SezStatusWFHApplicationStagesLocalServiceImpl
	extends SezStatusWFHApplicationStagesLocalServiceBaseImpl {
	
	public SezStatusWFHApplicationStages getSAS_SAI(long sezStatusApplicationId)
			throws NoSuchSezStatusWFHApplicationStagesException {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_SAI(sezStatusApplicationId);
	}

	public SezStatusWFHApplicationStages getSAS_CaseIdStageName(String caseId, String stageName)
			throws NoSuchSezStatusWFHApplicationStagesException {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_CaseIdStageName(caseId, stageName);
	}

	public SezStatusWFHApplicationStages getSAS_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchSezStatusWFHApplicationStagesException {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public SezStatusWFHApplicationStages getSAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchSezStatusWFHApplicationStagesException {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public List<SezStatusWFHApplicationStages> getSAS_CaseId(String caseId) {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_CaseId(caseId);
	}

	public List<SezStatusWFHApplicationStages> getSezStatusApplicationsList_By_SN(String stageName) {
		return sezStatusWFHApplicationStagesPersistence.findBygetSAS_StageName(stageName);
	}

	public Long getSezSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(SezStatusApplicationStagesTable.INSTANCE)
				.where(SezStatusApplicationStagesTable.INSTANCE.stageName.eq("Data /Payment Verification")
						.and(SezStatusApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(SezStatusApplicationTable.INSTANCE.caseId)
										.from(SezStatusApplicationTable.INSTANCE)
										.where(SezStatusApplicationTable.INSTANCE.status.eq(0)
												.and(SezStatusApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public SezStatusWFHApplicationStages updateSezStatusWFHApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {
		SezStatusWFHApplicationStages sezStatusApplicationStages = null;
		sezStatusApplicationStages = sezStatusWFHApplicationStagesPersistence.fetchBygetSAS_CaseIdStageName(caseId,
				stageName);
		if (Validator.isNotNull(sezStatusApplicationStages)) {
			sezStatusApplicationStages.setStageEndDate(stageEndDate);
			sezStatusApplicationStages.setStageStatus(stageStatus);
			sezStatusApplicationStages.setDuration(duration);
			sezStatusApplicationStages.setModifiedDate(new Date());
			sezStatusWFHApplicationStagesPersistence.update(sezStatusApplicationStages);
		} else {
			sezStatusApplicationStages = createSezStatusWFHApplicationStages(
					CounterLocalServiceUtil.increment(SezStatusApplicationStages.class.getName()));
			sezStatusApplicationStages.setStageName(stageName);
			sezStatusApplicationStages.setStageStartDate(stageStartDate);
			sezStatusApplicationStages.setStageEndDate(stageEndDate);
			sezStatusApplicationStages.setStageStatus(stageStatus);
			sezStatusApplicationStages.setCaseId(caseId);
			sezStatusApplicationStages.setDuration(duration);
			sezStatusApplicationStages.setCreateDate(new Date());
			sezStatusWFHApplicationStagesPersistence.update(sezStatusApplicationStages);
		}
		return sezStatusApplicationStages;
	}

	public String getSezStatusCurrentStages(String caseId) throws NoSuchSezStatusWFHApplicationStagesException {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SezStatusWFHApplicationStages paymentVerification = null;
		try {
			paymentVerification = getSAS_CaseIdStageName(caseId, "Data /Payment Verification");
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
			jsonObject.put("stageName", "Data /Payment Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}

		
		SezStatusWFHApplicationStages commiteeArcRecommendation = null;
		try {
			commiteeArcRecommendation = getSAS_CaseIdStageName(caseId, "Decision");
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
			jsonObject.put("stageName", "Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");

			stages.put(jsonObject);
		}
		
		SezStatusWFHApplicationStages issuanceOfLicence = null;
		try {
			issuanceOfLicence = getSAS_CaseIdStageName(caseId, "Issuance of Approval Letter");
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
			jsonObject.put("stageName", "Issuance of Approval Letter");
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