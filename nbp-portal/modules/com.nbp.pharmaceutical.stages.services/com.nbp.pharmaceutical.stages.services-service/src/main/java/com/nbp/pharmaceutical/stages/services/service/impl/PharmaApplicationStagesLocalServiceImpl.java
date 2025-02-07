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

package com.nbp.pharmaceutical.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationTable;
import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationStagesException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStagesTable;
import com.nbp.pharmaceutical.stages.services.service.base.PharmaApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages", service = AopService.class)
public class PharmaApplicationStagesLocalServiceImpl extends PharmaApplicationStagesLocalServiceBaseImpl {
	private static Log _log = LogFactoryUtil.getLog(PharmaApplicationStagesLocalServiceImpl.class);

	public List<PharmaApplicationStages> getPharmaApplicationStagesByCI_SN_SS(String caseId, String stageName,
			String Stage) {
		return pharmaApplicationStagesPersistence.findBygetPS_ByCaseIdStageStatus(stageName, Stage, caseId);
	}

	public PharmaApplicationStages getPharmaApplicationStagesByCaseIdStageStageNameStageStatus(String caseId,
			String stageName, String Stage) throws NoSuchPharmaApplicationStagesException {
		return pharmaApplicationStagesPersistence.findBygetPS_ByCaseId_SS_SN(stageName, Stage, caseId);
	}

	public PharmaApplicationStages getPharmaApplicationStages(String caseId, String stageName)
			throws NoSuchPharmaApplicationStagesException {
		return pharmaApplicationStagesPersistence.findBygetPS_CaseIdStageName(caseId, stageName);
	}

	public List<PharmaApplicationStages> getPharmaApplicationStagesByCaseId(String caseId)
			throws NoSuchPharmaApplicationStagesException {
		return pharmaApplicationStagesPersistence.findBygetPS_CaseId(caseId);
	}

	public PharmaApplicationStages getPharmaApplicationStagesByStatus(String caseId, String stageStatus)
			throws NoSuchPharmaApplicationStagesException {
		return pharmaApplicationStagesPersistence.findBygetPS_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<PharmaApplicationStages> getPharmaBy_SN(String stageName) {
		return pharmaApplicationStagesPersistence.findBygetPS_StageName(stageName);
	}

	public List<PharmaApplicationStages> getPS_StageName_StageStatus(String stageName, String status) {
		return pharmaApplicationStagesPersistence.findBygetPS_StageName_StageStatus(stageName, status);
	}

	public Long getPharmaceuticalSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(PharmaApplicationStagesTable.INSTANCE)
				.where(PharmaApplicationStagesTable.INSTANCE.stageName.eq("Review and Verification")
						.and(PharmaApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(PharmaApplicationTable.INSTANCE.caseld).from(PharmaApplicationTable.INSTANCE)
								.where(PharmaApplicationTable.INSTANCE.status.eq(0)
										.and(PharmaApplicationTable.INSTANCE.caseld.isNotNull())))));
		return dslQuery(query);
	}

	public PharmaApplicationStages updatePharmaApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) throws NoSuchPharmaApplicationStagesException {
		PharmaApplicationStages pharmaApplicationStages = null;
		try {
			pharmaApplicationStages = pharmaApplicationStagesPersistence.findBygetPS_CaseIdStageName(caseId, stageName);
		} catch (NoSuchPharmaApplicationStagesException e) {
			e.printStackTrace();
		}

		if (Validator.isNotNull(pharmaApplicationStages)) {
			// pharmaApplicationStages.setStageStartDate(stageStartDate);
			pharmaApplicationStages.setStageEndDate(stageEndDate);
			pharmaApplicationStages.setStageStatus(stageStatus);
			pharmaApplicationStages.setDuration(duration);
			pharmaApplicationStages.setModifiedDate(new Date());
			pharmaApplicationStagesPersistence.update(pharmaApplicationStages);
		} else {
			pharmaApplicationStages = createPharmaApplicationStages(
					CounterLocalServiceUtil.increment(PharmaApplicationStages.class.getName()));
			pharmaApplicationStages.setStageName(stageName);
			pharmaApplicationStages.setStageStartDate(stageStartDate);
			pharmaApplicationStages.setStageEndDate(stageEndDate);
			pharmaApplicationStages.setStageStatus(stageStatus);
			pharmaApplicationStages.setCaseId(caseId);
			pharmaApplicationStages.setDuration(duration);
			pharmaApplicationStages.setCreateDate(new Date());
			pharmaApplicationStagesPersistence.update(pharmaApplicationStages);
		}

		return pharmaApplicationStages;
	}

	public String getPharmaCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		PharmaApplicationStages reviewStage = null;
		try {
			reviewStage = getPharmaApplicationStages(caseId, "Review and Verification");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(reviewStage.getStageStartDate())) {
				startDate = reviewStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (reviewStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(reviewStage.getStageEndDate())) {
					endDate = reviewStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");

			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review and Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		PharmaApplicationStages ddStage = null;
		try {
			ddStage = getPharmaApplicationStages(caseId, "Due Diligence- Scientific Evaluation");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(ddStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", ddStage.getStageName());
			jsonObject.put("status", ddStage.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(ddStage.getStageStartDate())) {
				startDate = ddStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (ddStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(ddStage.getStageEndDate())) {
					endDate = ddStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");

			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Due Diligence- Scientific Evaluation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		PharmaApplicationStages caStage = null;
		try {
			caStage = getPharmaApplicationStages(caseId, "Committee Decision");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(caStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", caStage.getStageName());
			jsonObject.put("status", caStage.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(caStage.getStageStartDate())) {
				startDate = caStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (caStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(caStage.getStageEndDate())) {
					endDate = caStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Committee Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		PharmaApplicationStages inspectionStage = null;
		try {
			inspectionStage = getPharmaApplicationStages(caseId, "Issuance of License Certificate or Refusal Letter");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(inspectionStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspectionStage.getStageName());
			jsonObject.put("status", inspectionStage.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(reviewStage.getStageStartDate())) {
				startDate = inspectionStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (inspectionStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(inspectionStage.getStageEndDate())) {
					endDate = inspectionStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of License Certificate or Refusal Letter");
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

	public List<String> getPharmaDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(PharmaApplicationStagesTable.INSTANCE.stageName)
				.from(PharmaApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
}