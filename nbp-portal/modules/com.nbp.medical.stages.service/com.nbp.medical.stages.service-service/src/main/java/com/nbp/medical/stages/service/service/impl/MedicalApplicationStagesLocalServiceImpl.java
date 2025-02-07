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

package com.nbp.medical.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppTable;
import com.nbp.medical.stages.service.exception.NoSuchMedicalApplicationStagesException;
import com.nbp.medical.stages.service.model.MedicalApplicationStages;
import com.nbp.medical.stages.service.model.MedicalApplicationStagesTable;
import com.nbp.medical.stages.service.service.base.MedicalApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.medical.stages.service.model.MedicalApplicationStages", service = AopService.class)
public class MedicalApplicationStagesLocalServiceImpl extends MedicalApplicationStagesLocalServiceBaseImpl {
	public MedicalApplicationStages getMedicalByCI_SN(String caseId, String stageName)
			throws NoSuchMedicalApplicationStagesException {
		return medicalApplicationStagesPersistence.findBygetMedical_By_CaseIdStageName(caseId, stageName);
	}

	public MedicalApplicationStages getMedicalByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchMedicalApplicationStagesException {
		return medicalApplicationStagesPersistence.findBygetMedical_By_CaseIdStageStatus(caseId, stageStatus,
				stageName);
	}

	public List<MedicalApplicationStages> getMedicalByCI(String caseId) throws NoSuchMedicalApplicationStagesException {
		return medicalApplicationStagesPersistence.findBygetMedical_By_CaseId(caseId);
	}

	public MedicalApplicationStages getMedicalByCI_ST(String caseId, String stageStatus)
			throws NoSuchMedicalApplicationStagesException {
		return medicalApplicationStagesPersistence.findBygetMedical_By_CaseIdAndStatus(caseId, stageStatus);
	}
	public MedicalApplicationStages get_Medical_By_CI(String caseId)
			throws NoSuchMedicalApplicationStagesException {
		return medicalApplicationStagesPersistence.findByget_Medical_By_CaseId(caseId);
	}

	public List<MedicalApplicationStages> gtMedicalApplicationStages_By_SN(String stageName) {
		return medicalApplicationStagesPersistence.findBygetMedical_By_StageName(stageName);
	}
	public List<String> getMedicalDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(MedicalApplicationStagesTable.INSTANCE.stageName)
				.from(MedicalApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getMedicalSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(MedicalApplicationStagesTable.INSTANCE)
				.where(MedicalApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(MedicalApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(MedicalFacilitiesAppTable.INSTANCE.caseId)
										.from(MedicalFacilitiesAppTable.INSTANCE).where(MedicalFacilitiesAppTable.INSTANCE.status
												.eq(0).and(MedicalFacilitiesAppTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public MedicalApplicationStages updateMedicalApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		MedicalApplicationStages MedicalApplicationStages = null;

		try {
			MedicalApplicationStages = getMedicalByCI_SN(caseId, stageName);
		} catch (NoSuchMedicalApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(MedicalApplicationStages)) {
			// MedicalApplicationStages.setStageStartDate(stageStartDate);
			MedicalApplicationStages.setStageEndDate(stageEndDate);
			MedicalApplicationStages.setStageStatus(stageStatus);
			MedicalApplicationStages.setDuration(duration);
			MedicalApplicationStages.setModifiedDate(new Date());
			MedicalApplicationStages.setCaseId(caseId);
			medicalApplicationStagesPersistence.update(MedicalApplicationStages);
		} else {
			MedicalApplicationStages = createMedicalApplicationStages(
					CounterLocalServiceUtil.increment(MedicalApplicationStages.class.getName()));
			MedicalApplicationStages.setStageName(stageName);
			MedicalApplicationStages.setStageStartDate(stageStartDate);
			MedicalApplicationStages.setStageEndDate(stageEndDate);
			MedicalApplicationStages.setStageStatus(stageStatus);
			MedicalApplicationStages.setDuration(duration);
			MedicalApplicationStages.setCreateDate(new Date());
			MedicalApplicationStages.setCaseId(caseId);
			medicalApplicationStagesPersistence.update(MedicalApplicationStages);
		}
		return MedicalApplicationStages;
	}

	public String getNcbjApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		MedicalApplicationStages reviewStage = null;
		try {
			reviewStage = getMedicalByCI_SN(caseId, "Data Verification");
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
		MedicalApplicationStages refferalToJCA = null;
		try {
			refferalToJCA = getMedicalByCI_SN(caseId, "Inspection");
		} catch (NoSuchMedicalApplicationStagesException e) {
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
		MedicalApplicationStages iD = null;

		try {
			iD = getMedicalByCI_SN(caseId, "Committee Decision");
		} catch (NoSuchMedicalApplicationStagesException e) {
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
		MedicalApplicationStages jca = null;
		try {
			jca = getMedicalByCI_SN(caseId, "Issuance of Certificate or Refusal Letter");
		} catch (NoSuchMedicalApplicationStagesException e) {
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
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}

}