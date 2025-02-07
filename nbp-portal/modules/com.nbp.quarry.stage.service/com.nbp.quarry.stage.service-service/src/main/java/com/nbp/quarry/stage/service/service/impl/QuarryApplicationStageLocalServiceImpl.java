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

package com.nbp.quarry.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.quarry.stage.service.exception.NoSuchQuarryApplicationStageException;
import com.nbp.quarry.stage.service.model.QuarryApplicationStage;
import com.nbp.quarry.stage.service.model.QuarryApplicationStageTable;
import com.nbp.quarry.stage.service.service.base.QuarryApplicationStageLocalServiceBaseImpl;
import com.nbp.quary.application.form.service.model.QuarryApplicationTable;

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
@Component(property = "model.class.name=com.nbp.quarry.stage.service.model.QuarryApplicationStage", service = AopService.class)
public class QuarryApplicationStageLocalServiceImpl extends QuarryApplicationStageLocalServiceBaseImpl {
	public QuarryApplicationStage getQuarryByCI_SN(String caseId, String stageName)
			throws NoSuchQuarryApplicationStageException {
		return quarryApplicationStagePersistence.findBygetQuarry_By_CaseIdStageName(caseId, stageName);
	}

	public QuarryApplicationStage getQuarryByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchQuarryApplicationStageException {
		return quarryApplicationStagePersistence.findBygetQuarry_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<QuarryApplicationStage> getQuarryByCI(String caseId) throws NoSuchQuarryApplicationStageException {
		return quarryApplicationStagePersistence.findBygetQuarry_By_CaseId(caseId);
	}

	public QuarryApplicationStage getQuarryByCI_ST(String caseId, String stageStatus)
			throws NoSuchQuarryApplicationStageException {
		return quarryApplicationStagePersistence.findBygetQuarry_By_CaseIdAndStatus(caseId, stageStatus);
	}
	public QuarryApplicationStage getQuarryByCId(String caseId)
			throws NoSuchQuarryApplicationStageException {
		return quarryApplicationStagePersistence.findBygetQuarry_CaseId(caseId);
	}

	public List<QuarryApplicationStage> gtQuarryApplicationStage_By_SN(String stageName) {
		return quarryApplicationStagePersistence.findBygetQuarry_By_StageName(stageName);
	}

	public List<String> getQuarryDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(QuarryApplicationStageTable.INSTANCE.stageName)
				.from(QuarryApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getQuarrySeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(QuarryApplicationStageTable.INSTANCE)
				.where(QuarryApplicationStageTable.INSTANCE.stageName.eq("Data Verification")
						.and(QuarryApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(QuarryApplicationTable.INSTANCE.caseId)
										.from(QuarryApplicationTable.INSTANCE).where(QuarryApplicationTable.INSTANCE.status
												.eq(0).and(QuarryApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	
	public QuarryApplicationStage updateQuarryApplicationStage(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		System.out.println("duration---------in stage service---"+duration);
		QuarryApplicationStage QuarryApplicationStage = null;

		try {
			QuarryApplicationStage = getQuarryByCI_SN(caseId, stageName);
		} catch (NoSuchQuarryApplicationStageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(QuarryApplicationStage)) {
			// QuarryApplicationStage.setStageStartDate(stageStartDate);
			QuarryApplicationStage.setStageEndDate(stageEndDate);
			QuarryApplicationStage.setStageStatus(stageStatus);
			QuarryApplicationStage.setDuration(duration);
			QuarryApplicationStage.setModifiedDate(new Date());
			QuarryApplicationStage.setCaseId(caseId);
			quarryApplicationStagePersistence.update(QuarryApplicationStage);
			System.out.println("existing update---------in stage service---");
		} else {
			System.out.println("Before update---------in stage service---");
			QuarryApplicationStage = quarryApplicationStagePersistence.create(
					CounterLocalServiceUtil.increment(QuarryApplicationStage.class.getName()));
			QuarryApplicationStage.setStageName(stageName);
			QuarryApplicationStage.setStageStartDate(stageStartDate);
			QuarryApplicationStage.setStageEndDate(stageEndDate);
			QuarryApplicationStage.setStageStatus(stageStatus);
			QuarryApplicationStage.setDuration(duration);
			QuarryApplicationStage.setCreateDate(new Date());
			QuarryApplicationStage.setCaseId(caseId);
			System.out.println("Before update---------in stage service---");
			quarryApplicationStagePersistence.update(QuarryApplicationStage);
		}
		return QuarryApplicationStage;
	}

	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		QuarryApplicationStage reviewStage = null;
		try {
			reviewStage = getQuarryByCI_SN(caseId, "Data Verification");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			jsonObject.put("stageName", "Data Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		QuarryApplicationStage refferalToJCA = null;
		try {
			refferalToJCA = getQuarryByCI_SN(caseId, "Inspection");
		} catch (NoSuchQuarryApplicationStageException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(refferalToJCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", refferalToJCA.getStageName());
			jsonObject.put("status", refferalToJCA.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(refferalToJCA.getStageStartDate())) {
				startDate = refferalToJCA.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (refferalToJCA.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(refferalToJCA.getStageEndDate())) {
					endDate = refferalToJCA.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Inspection");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		QuarryApplicationStage iD = null;

		try {
			iD = getQuarryByCI_SN(caseId, "Committee Decision");
		} catch (NoSuchQuarryApplicationStageException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(iD)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", iD.getStageName());
			jsonObject.put("status", iD.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(iD.getStageStartDate())) {
				startDate = iD.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (iD.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(iD.getStageEndDate())) {
					endDate = iD.getStageEndDate();
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
		// --------next stage
		QuarryApplicationStage jca = null;
		try {
			jca = getQuarryByCI_SN(caseId, "Licence of Certificate or Refusal Letter");
		} catch (NoSuchQuarryApplicationStageException e) {
		}
		if (Validator.isNotNull(jca)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", jca.getStageName());
			jsonObject.put("status", jca.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(jca.getStageStartDate())) {
				startDate = jca.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (jca.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(jca.getStageEndDate())) {
					endDate = jca.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Licence of Certificate or Refusal Letter");
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

	@Override
	public List<String> getFilmDistinctStages() {
		// TODO Auto-generated method stub
		return null;
	}

}