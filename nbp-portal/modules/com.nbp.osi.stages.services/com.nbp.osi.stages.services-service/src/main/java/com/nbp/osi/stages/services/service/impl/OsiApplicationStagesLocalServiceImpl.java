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

package com.nbp.osi.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.application.form.services.model.OsiApplicationTable;
import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationStagesException;
import com.nbp.osi.stages.services.model.OsiApplicationStages;
import com.nbp.osi.stages.services.model.OsiApplicationStagesTable;
import com.nbp.osi.stages.services.service.base.OsiApplicationStagesLocalServiceBaseImpl;
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
@Component(property = "model.class.name=com.nbp.osi.stages.services.model.OsiApplicationStages", service = AopService.class)
public class OsiApplicationStagesLocalServiceImpl extends OsiApplicationStagesLocalServiceBaseImpl {

//	--------------------------------------finders-----------------------
	public OsiApplicationStages getOAS_OAI(long osiApplicationId) throws NoSuchOsiApplicationStagesException {
		return osiApplicationStagesPersistence.findBygetOAS_OAI(osiApplicationId);
	}

	public OsiApplicationStages getCAS_CaseIdStageName(String caseId, String stageName)
			throws NoSuchOsiApplicationStagesException {
		return osiApplicationStagesPersistence.findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	public List<OsiApplicationStages> getOAS_StageName(String stageName) {
		return osiApplicationStagesPersistence.findBygetOAS_StageName(stageName);
	}

	public OsiApplicationStages getOAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchOsiApplicationStagesException {
		return osiApplicationStagesPersistence.findBygetOAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public OsiApplicationStages getOAS_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchOsiApplicationStagesException {
		return osiApplicationStagesPersistence.findBygetOAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<OsiApplicationStages> getOAS_CaseId(String caseId) {
		return osiApplicationStagesPersistence.findBygetOAS_CaseId(caseId);
	}

	public List<OsiApplicationStages> getOAS_StageNamendStageStatus(String caseId, String status) {
		return osiApplicationStagesPersistence.findBygetOAS_StageNamendStageStatus(caseId, status);
	}

	public Long getOSIFCSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(OsiApplicationStagesTable.INSTANCE)
				.where(OsiApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(OsiApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(OsiApplicationTable.INSTANCE.caseId)
										.from(OsiApplicationTable.INSTANCE).where(OsiApplicationTable.INSTANCE.status
												.eq(0).and(OsiApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	// -----------------------------methods----------------------------------
	public OsiApplicationStages updateOsiApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		OsiApplicationStages osiApplicationStages = null;
		try {
			osiApplicationStages = getCAS_CaseIdStageName(caseId, stageName);
		} catch (NoSuchOsiApplicationStagesException e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(osiApplicationStages)) {
			osiApplicationStages.setStageEndDate(stageEndDate);
			osiApplicationStages.setStageStatus(stageStatus);
			osiApplicationStages.setDuration(duration);
			osiApplicationStages.setModifiedDate(new Date());
			osiApplicationStages.setCaseId(caseId);
			osiApplicationStagesPersistence.update(osiApplicationStages);
		} else {
			osiApplicationStages = createOsiApplicationStages(
					CounterLocalServiceUtil.increment(OsiApplicationStages.class.getName()));
			osiApplicationStages.setStageName(stageName);
			osiApplicationStages.setStageStartDate(stageStartDate);
			osiApplicationStages.setStageEndDate(stageEndDate);
			osiApplicationStages.setStageStatus(stageStatus);
			osiApplicationStages.setDuration(duration);
			osiApplicationStages.setCreateDate(new Date());
			osiApplicationStages.setCaseId(caseId);
			osiApplicationStagesPersistence.update(osiApplicationStages);
		}
		return osiApplicationStages;

	}

	public String getOsiApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		OsiApplicationStages dataVerification = null;
		try {
			dataVerification = getCAS_CaseIdStageName(caseId, "Data Verification");
		} catch (NoSuchOsiApplicationStagesException e) {
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

//		--------next stage

		OsiApplicationStages investigations = null;
		try {
			investigations = getCAS_CaseIdStageName(caseId, "Investigations");
		} catch (NoSuchOsiApplicationStagesException e) {
		}
		if (Validator.isNotNull(investigations)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", investigations.getStageName());
			jsonObject.put("status", investigations.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(investigations.getStageStartDate())) {
				startDate = investigations.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (investigations.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(investigations.getStageEndDate())) {
					endDate = investigations.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Investigations");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

//		--------next stage

		OsiApplicationStages supervisorReview = null;
		try {
			supervisorReview = getCAS_CaseIdStageName(caseId, "Supervisor Review");
		} catch (NoSuchOsiApplicationStagesException e) {
		}
		if (Validator.isNotNull(supervisorReview)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", supervisorReview.getStageName());
			jsonObject.put("status", supervisorReview.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(supervisorReview.getStageStartDate())) {
				startDate = supervisorReview.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (supervisorReview.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(supervisorReview.getStageEndDate())) {
					endDate = supervisorReview.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Supervisor Review");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

//		--------next stage

		OsiApplicationStages certificateIssuance = null;
		try {
			certificateIssuance = getCAS_CaseIdStageName(caseId, "Certificate issuance or Refusal ");
		} catch (NoSuchOsiApplicationStagesException e) {
		}
		if (Validator.isNotNull(certificateIssuance)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certificateIssuance.getStageName());
			jsonObject.put("status", certificateIssuance.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(certificateIssuance.getStageStartDate())) {
				startDate = certificateIssuance.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (certificateIssuance.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(certificateIssuance.getStageEndDate())) {
					endDate = certificateIssuance.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Certificate issuance or Refusal ");
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