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

package com.nbp.acquire.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.application.form.service.model.AcquireApplicationTable;
import com.nbp.acquire.stages.service.exception.NoSuchAcquireApplicationStagesException;
import com.nbp.acquire.stages.service.model.AcquireApplicationStages;
import com.nbp.acquire.stages.service.model.AcquireApplicationStagesTable;
import com.nbp.acquire.stages.service.service.base.AcquireApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireApplicationStages", service = AopService.class)
public class AcquireApplicationStagesLocalServiceImpl extends AcquireApplicationStagesLocalServiceBaseImpl {
	public AcquireApplicationStages getAcquireApplicationStagesBy_AppId(long acquireApplicationId)
			throws NoSuchAcquireApplicationStagesException {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_AppId(acquireApplicationId);
	}

	public AcquireApplicationStages getAcquireApplicationStagesBy_CaseId_StageName(String acquireCaseId,
			String stageName) throws NoSuchAcquireApplicationStagesException {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_CaseId_StageName(acquireCaseId,
				stageName);
	}

	public AcquireApplicationStages getAcquireApplicationStagesBy_CaseId_StageName_StageStatus(String acquireCaseId,
			String stageName, String stageStatus) throws NoSuchAcquireApplicationStagesException {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_CaseId_StageName_Status(acquireCaseId,
				stageName, stageStatus);
	}

	public AcquireApplicationStages getAcquireApplicationStagesBy_CaseId(String acquireCaseId, String stageStatus)
			throws NoSuchAcquireApplicationStagesException {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_CaseId_Status(acquireCaseId,
				stageStatus);
	}

	public AcquireApplicationStages getAcquireApplicationStagesBy_CI(String acquireCaseId)
			throws NoSuchAcquireApplicationStagesException {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_CI(acquireCaseId);
	}

	public List<AcquireApplicationStages> getAcquireApplicationByCaseId(String acquireCaseId) {
		return acquireApplicationStagesPersistence.findBygetAcquireApplicationBy_CaseId(acquireCaseId);
	}

	public List<AcquireApplicationStages> getApplicatrionStagesBy_SN(String stageName) {
		return acquireApplicationStagesPersistence.findBygetAcquireApplication_By_SN(stageName);
	}

	public List<AcquireApplicationStages> getApplicatrionStagesBy_StageName_StageStatus(String stageName,
			String stageStatus) {
		return acquireApplicationStagesPersistence.findBygetAcquireApplication_By_SN_StageStatus(stageName,
				stageStatus);
	}

	public List<String> getAcquireDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(AcquireApplicationStagesTable.INSTANCE.stageName)
				.from(AcquireApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getAcquireSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(AcquireApplicationStagesTable.INSTANCE)
				.where(AcquireApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(AcquireApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(AcquireApplicationTable.INSTANCE.caseId).from(AcquireApplicationTable.INSTANCE)
								.where(AcquireApplicationTable.INSTANCE.status.eq(0)
										.and(AcquireApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public AcquireApplicationStages updateAcquireApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		AcquireApplicationStages acquireApplicationStages = null;

		acquireApplicationStages = acquireApplicationStagesPersistence
				.fetchBygetAcquireApplicationBy_CaseId_StageName(caseId, stageName);
		if (Validator.isNotNull(acquireApplicationStages)) {
			// tourismApplicationStages.setStageStartDate(stageStartDate);
			acquireApplicationStages.setStageEndDate(stageEndDate);
			acquireApplicationStages.setStageStatus(stageStatus);
			acquireApplicationStages.setDuration(duration);
			acquireApplicationStages.setModifiedDate(new Date());
			acquireApplicationStages.setCaseId(caseId);
			acquireApplicationStagesPersistence.update(acquireApplicationStages);
		} else {
			acquireApplicationStages = createAcquireApplicationStages(
					CounterLocalServiceUtil.increment(AcquireApplicationStages.class.getName()));
			acquireApplicationStages.setStageName(stageName);
			acquireApplicationStages.setStageStartDate(stageStartDate);
			acquireApplicationStages.setStageEndDate(stageEndDate);
			acquireApplicationStages.setStageStatus(stageStatus);
			acquireApplicationStages.setCaseId(caseId);
			acquireApplicationStages.setDuration(duration);
			acquireApplicationStages.setCreateDate(new Date());
			acquireApplicationStagesPersistence.update(acquireApplicationStages);
		}
		return acquireApplicationStages;
	}

	public String getAcquireCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		AcquireApplicationStages dataVerification = null;
		try {
			dataVerification = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Data Verification");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataVerification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dataVerification.getStageName());
			jsonObject.put("status", dataVerification.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dataVerification.getStageStartDate())) {
				startDate = dataVerification.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (dataVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataVerification.getStageEndDate())) {
					endDate = dataVerification.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Data Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages dueDiligence = null;
		try {
			dueDiligence = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Due Diligence/Investigations");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(dueDiligence)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dueDiligence.getStageName());
			jsonObject.put("status", dueDiligence.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dueDiligence.getStageStartDate())) {
				startDate = dueDiligence.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (dueDiligence.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dueDiligence.getStageEndDate())) {
					endDate = dueDiligence.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Due Diligence/Investigations");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages valuation = null;
		try {
			valuation = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Valuation");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(valuation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", valuation.getStageName());
			jsonObject.put("status", valuation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(valuation.getStageStartDate())) {
				startDate = valuation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (valuation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(valuation.getStageEndDate())) {
					endDate = valuation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Valuation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages advertising = null;
		try {
			advertising = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Advertising");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(advertising)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", advertising.getStageName());
			jsonObject.put("status", advertising.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(advertising.getStageStartDate())) {
				startDate = advertising.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (advertising.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(advertising.getStageEndDate())) {
					endDate = advertising.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Advertising");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages tendering = null;
		try {
			tendering = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Tendering");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(tendering)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", tendering.getStageName());
			jsonObject.put("status", tendering.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(tendering.getStageStartDate())) {
				startDate = tendering.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (tendering.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(tendering.getStageEndDate())) {
					endDate = tendering.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Tendering");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages evaluation = null;
		try {
			evaluation = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Evaluation");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(evaluation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", evaluation.getStageName());
			jsonObject.put("status", evaluation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(evaluation.getStageStartDate())) {
				startDate = evaluation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (evaluation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(evaluation.getStageEndDate())) {
					endDate = evaluation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Evaluation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		AcquireApplicationStages execution = null;
		try {
			execution = getAcquireApplicationStagesBy_CaseId_StageName(caseId, "Execution+Payment");
		} catch (NoSuchAcquireApplicationStagesException e) {
		}
		if (Validator.isNotNull(execution)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", execution.getStageName());
			jsonObject.put("status", execution.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(execution.getStageStartDate())) {
				startDate = execution.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));

			}
			Date endDate = new Date();
			if (execution.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(execution.getStageEndDate())) {
					endDate = execution.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Execution+Payment");
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