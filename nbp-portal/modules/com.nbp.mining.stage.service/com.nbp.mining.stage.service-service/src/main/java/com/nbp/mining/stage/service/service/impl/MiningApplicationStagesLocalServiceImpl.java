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

package com.nbp.mining.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplicationTable;
import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationStagesException;
import com.nbp.mining.stage.service.model.MiningApplicationStages;
import com.nbp.mining.stage.service.model.MiningApplicationStagesTable;
import com.nbp.mining.stage.service.service.base.MiningApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.mining.stage.service.model.MiningApplicationStages", service = AopService.class)
public class MiningApplicationStagesLocalServiceImpl extends MiningApplicationStagesLocalServiceBaseImpl {
	public MiningApplicationStages getMiningByCI_SN(String caseId, String stageName)
			throws NoSuchMiningApplicationStagesException {
		return miningApplicationStagesPersistence.findBygetMining_By_CaseIdStageName(caseId, stageName);
	}

	public MiningApplicationStages getMiningByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchMiningApplicationStagesException {
		return miningApplicationStagesPersistence.findBygetMining_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<MiningApplicationStages> getMiningByCI(String caseId) throws NoSuchMiningApplicationStagesException {
		return miningApplicationStagesPersistence.findBygetMining_By_CaseId(caseId);
	}
	public MiningApplicationStages getMining_By_CI(String caseId) throws NoSuchMiningApplicationStagesException  {
		return miningApplicationStagesPersistence.findBygetMiningBy_Case_Id(caseId);
	}

	public MiningApplicationStages getMiningByCI_ST(String caseId, String stageStatus)
			throws NoSuchMiningApplicationStagesException {
		return miningApplicationStagesPersistence.findBygetMining_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<MiningApplicationStages> gtMiningApplicationStages_By_SN(String stageName) {
		return miningApplicationStagesPersistence.findBygetMining_By_StageName(stageName);
	}

	public List<String> getMiningDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(MiningApplicationStagesTable.INSTANCE.stageName)
				.from(MiningApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getMiningSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(MiningApplicationStagesTable.INSTANCE)
				.where(MiningApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(MiningApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(MiningLeaseApplicationTable.INSTANCE.caseId)
										.from(MiningLeaseApplicationTable.INSTANCE)
										.where(MiningLeaseApplicationTable.INSTANCE.status.eq(0)
												.and(MiningLeaseApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public MiningApplicationStages updateMiningApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		MiningApplicationStages MiningApplicationStages = null;

		try {
			MiningApplicationStages = getMiningByCI_SN(caseId, stageName);
		} catch (NoSuchMiningApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(MiningApplicationStages)) {
			// MiningApplicationStages.setStageStartDate(stageStartDate);
			MiningApplicationStages.setStageEndDate(stageEndDate);
			MiningApplicationStages.setStageStatus(stageStatus);
			MiningApplicationStages.setDuration(duration);
			MiningApplicationStages.setModifiedDate(new Date());
			MiningApplicationStages.setCaseId(caseId);
			miningApplicationStagesPersistence.update(MiningApplicationStages);
		} else {
			MiningApplicationStages = createMiningApplicationStages(
					CounterLocalServiceUtil.increment(MiningApplicationStages.class.getName()));
			MiningApplicationStages.setStageName(stageName);
			MiningApplicationStages.setStageStartDate(stageStartDate);
			MiningApplicationStages.setStageEndDate(stageEndDate);
			MiningApplicationStages.setStageStatus(stageStatus);
			MiningApplicationStages.setDuration(duration);
			MiningApplicationStages.setCreateDate(new Date());
			MiningApplicationStages.setCaseId(caseId);
			miningApplicationStagesPersistence.update(MiningApplicationStages);
		}
		return MiningApplicationStages;
	}

	public String getMiningApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		MiningApplicationStages reviewStage = null;
		try {
			reviewStage = getMiningByCI_SN(caseId, "Data Verification");
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
		MiningApplicationStages refferalToJCA = null;
		try {
			refferalToJCA = getMiningByCI_SN(caseId, "Due Diligence");
		} catch (NoSuchMiningApplicationStagesException e) {
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
			jsonObject.put("stageName", "Due Diligence");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		MiningApplicationStages iD = null;

		try {
			iD = getMiningByCI_SN(caseId, "Ministerial Decision");
		} catch (NoSuchMiningApplicationStagesException e) {
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
			jsonObject.put("stageName", "Ministerial Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		MiningApplicationStages jca = null;
		try {
			jca = getMiningByCI_SN(caseId, "Issuance of Certificate or Refusal Letter");
		} catch (NoSuchMiningApplicationStagesException e) {
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
			jsonObject.put("stageName", "Issuance of Certificate or Refusal Letter");
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
	public List<String> getJadscDistinctStages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getJadscSeenCases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}

}