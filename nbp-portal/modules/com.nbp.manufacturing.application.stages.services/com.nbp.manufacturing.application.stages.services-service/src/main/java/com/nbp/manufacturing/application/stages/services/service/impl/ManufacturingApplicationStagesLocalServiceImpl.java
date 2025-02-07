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

package com.nbp.manufacturing.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.manufacturing.application.form.service.model.ManufacturingApplicationTable;
import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingApplicationStagesException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStagesTable;
import com.nbp.manufacturing.application.stages.services.service.base.ManufacturingApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages", service = AopService.class)
public class ManufacturingApplicationStagesLocalServiceImpl extends ManufacturingApplicationStagesLocalServiceBaseImpl {

	// --------------------------------------finders-----------------------
	public ManufacturingApplicationStages getManufacturingByCI_SN(String caseId, String stageName)
			throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_CaseIdStageName(caseId, stageName);
	}

	public ManufacturingApplicationStages getManufacturingByCI_ST_SN(String caseId, String stageStatus,
			String stageName) throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<ManufacturingApplicationStages> getManufacturingByCI(String caseId)
			throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_CaseId(caseId);
	}

	public ManufacturingApplicationStages getManufacturingByCI_ST(String caseId, String stageStatus)
			throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<ManufacturingApplicationStages> getManufacturingBySN_Status(String stageName, String status)
			throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_SN_Status(stageName, status);
	}

	public ManufacturingApplicationStages getManufacturingByMAI(long manufacturingApplicationId)
			throws NoSuchManufacturingApplicationStagesException {
		return manufacturingApplicationStagesPersistence.findBygetMAS_MAI(manufacturingApplicationId);
	}

	public List<ManufacturingApplicationStages> gtManufacturingApplicationStages_By_SN(String stageName) {
		return manufacturingApplicationStagesPersistence.findBygetMAS_StageName(stageName);
	}

	public List<String> getManufacturingDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(ManufacturingApplicationStagesTable.INSTANCE.stageName)
				.from(ManufacturingApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getManufacturingSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(ManufacturingApplicationStagesTable.INSTANCE)
				.where(ManufacturingApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(ManufacturingApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(ManufacturingApplicationTable.INSTANCE.caseId)
										.from(ManufacturingApplicationTable.INSTANCE)
										.where(ManufacturingApplicationTable.INSTANCE.status.eq(0)
												.and(ManufacturingApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	// -----------------------------methods----------------------------------

	public ManufacturingApplicationStages updateManufacturingApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {

		ManufacturingApplicationStages manufacturingApplicationStages = null;

		try {
			manufacturingApplicationStages = getManufacturingByCI_SN(caseId, stageName);
		} catch (NoSuchManufacturingApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(manufacturingApplicationStages)) {
			// manufacturingApplicationStages.setStageStartDate(stageStartDate);
			manufacturingApplicationStages.setStageEndDate(stageEndDate);
			manufacturingApplicationStages.setStageStatus(stageStatus);
			manufacturingApplicationStages.setDuration(duration);
			manufacturingApplicationStages.setModifiedDate(new Date());
			manufacturingApplicationStages.setCaseId(caseId);
			manufacturingApplicationStagesPersistence.update(manufacturingApplicationStages);
		} else {
			manufacturingApplicationStages = createManufacturingApplicationStages(
					CounterLocalServiceUtil.increment(ManufacturingApplicationStages.class.getName()));
			manufacturingApplicationStages.setStageName(stageName);
			manufacturingApplicationStages.setStageStartDate(stageStartDate);
			manufacturingApplicationStages.setStageEndDate(stageEndDate);
			manufacturingApplicationStages.setStageStatus(stageStatus);
			manufacturingApplicationStages.setDuration(duration);
			manufacturingApplicationStages.setCreateDate(new Date());
			manufacturingApplicationStages.setCaseId(caseId);
			manufacturingApplicationStagesPersistence.update(manufacturingApplicationStages);
		}
		return manufacturingApplicationStages;
	}

	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ManufacturingApplicationStages reviewStage = null;
		try {
			reviewStage = getManufacturingByCI_SN(caseId, "Data Verification");
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
		ManufacturingApplicationStages refferalToJCA = null;
		try {
			refferalToJCA = getManufacturingByCI_SN(caseId, "Referral to JCA");
		} catch (NoSuchManufacturingApplicationStagesException e) {
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
			jsonObject.put("stageName", "Referral to JCA");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		ManufacturingApplicationStages iD = null;

		try {
			iD = getManufacturingByCI_SN(caseId, "Inspection Date");
		} catch (NoSuchManufacturingApplicationStagesException e) {
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
			jsonObject.put("stageName", "Inspection Date");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		ManufacturingApplicationStages jca = null;
		try {
			jca = getManufacturingByCI_SN(caseId, "JCA Recommendations");
		} catch (NoSuchManufacturingApplicationStagesException e) {
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
			jsonObject.put("stageName", "JCA Recommendations");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		ManufacturingApplicationStages issuancePermit = null;
		try {
			issuancePermit = getManufacturingByCI_SN(caseId,
					"Issuance of Permit(Exemtion Certificate) or Refusal Letter");
		} catch (NoSuchManufacturingApplicationStagesException e) {
		}
		if (Validator.isNotNull(issuancePermit)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuancePermit.getStageName());
			jsonObject.put("status", issuancePermit.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(issuancePermit.getStageStartDate())) {
				startDate = issuancePermit.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (issuancePermit.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuancePermit.getStageEndDate())) {
					endDate = issuancePermit.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Permit(Exemtion Certificate) or Refusal Letter");
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