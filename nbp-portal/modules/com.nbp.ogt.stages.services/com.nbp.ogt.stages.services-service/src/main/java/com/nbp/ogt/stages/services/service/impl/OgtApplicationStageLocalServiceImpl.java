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

package com.nbp.ogt.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ogt.application.form.services.model.OgtApplicationTable;
import com.nbp.ogt.stages.services.exception.NoSuchOgtApplicationStageException;
import com.nbp.ogt.stages.services.model.OgtApplicationStage;
import com.nbp.ogt.stages.services.model.OgtApplicationStageTable;
import com.nbp.ogt.stages.services.service.base.OgtApplicationStageLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.ogt.stages.services.model.OgtApplicationStage", service = AopService.class)
public class OgtApplicationStageLocalServiceImpl extends OgtApplicationStageLocalServiceBaseImpl {
	public OgtApplicationStage getOtgByCI_SN(String caseId, String stageName)
			throws NoSuchOgtApplicationStageException {
		return ogtApplicationStagePersistence.findBygetOgt_By_CaseIdStageName(caseId, stageName);
	}

	public OgtApplicationStage getOtgByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchOgtApplicationStageException {
		return ogtApplicationStagePersistence.findBygetOgt_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}
	public OgtApplicationStage getOtgBy_CI(String caseId)
			throws NoSuchOgtApplicationStageException {
		return ogtApplicationStagePersistence.fetchBygetOgt_By_CI(caseId);
	}

	public List<OgtApplicationStage> getOgtByCI(String caseId) throws NoSuchOgtApplicationStageException {
		return ogtApplicationStagePersistence.findBygetOgt_By_CaseId(caseId);
	}

	public OgtApplicationStage getMedicalByCI_ST(String caseId, String stageStatus)
			throws NoSuchOgtApplicationStageException {
		return ogtApplicationStagePersistence.findBygetOgt_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<OgtApplicationStage> gtOgtApplicationStage_By_SN(String stageName) {
		return ogtApplicationStagePersistence.findBygetOgt_By_StageName(stageName);
	}
	public List<String> getOGTDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(OgtApplicationStageTable.INSTANCE.stageName)
				.from(OgtApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getOGTSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(OgtApplicationStageTable.INSTANCE)
				.where(OgtApplicationStageTable.INSTANCE.stageName.eq("Data Verification")
						.and(OgtApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(OgtApplicationTable.INSTANCE.caseId)
										.from(OgtApplicationTable.INSTANCE).where(OgtApplicationTable.INSTANCE.status
												.eq(0).and(OgtApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}


	public OgtApplicationStage updateOgtApplicationStage(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		OgtApplicationStage OgtApplicationStage = null;

		try {
			OgtApplicationStage = getOtgByCI_SN(caseId, stageName);
		} catch (NoSuchOgtApplicationStageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(OgtApplicationStage)) {
			// OgtApplicationStage.setStageStartDate(stageStartDate);
			OgtApplicationStage.setStageEndDate(stageEndDate);
			OgtApplicationStage.setStageStatus(stageStatus);
			OgtApplicationStage.setDuration(duration);
			OgtApplicationStage.setModifiedDate(new Date());
			OgtApplicationStage.setCaseId(caseId);
			ogtApplicationStagePersistence.update(OgtApplicationStage);
		} else {
			OgtApplicationStage = createOgtApplicationStage(
					CounterLocalServiceUtil.increment(OgtApplicationStage.class.getName()));
			OgtApplicationStage.setStageName(stageName);
			OgtApplicationStage.setStageStartDate(stageStartDate);
			OgtApplicationStage.setStageEndDate(stageEndDate);
			OgtApplicationStage.setStageStatus(stageStatus);
			OgtApplicationStage.setDuration(duration);
			OgtApplicationStage.setCreateDate(new Date());
			OgtApplicationStage.setCaseId(caseId);
			ogtApplicationStagePersistence.update(OgtApplicationStage);
		}
		return OgtApplicationStage;
	}

	public String getNcbjApplicaitonCurrentStages(String caseId) {
		System.out.println("Called-------------------------");
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		OgtApplicationStage reviewStage = null;
		try {
			reviewStage = getOtgByCI_SN(caseId, "Data Verification");
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
		OgtApplicationStage refferalToJCA = null;
		try {
			refferalToJCA = getOtgByCI_SN(caseId, "Investigation");
		} catch (NoSuchOgtApplicationStageException e) {
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
			jsonObject.put("stageName", "Investigation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		OgtApplicationStage iD = null;

		try {
			iD = getOtgByCI_SN(caseId, "OGT Decision");
		} catch (NoSuchOgtApplicationStageException e) {
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
			jsonObject.put("stageName", "OGT Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		OgtApplicationStage jca = null;
		try {
			jca = getOtgByCI_SN(caseId, "Outcome of Claim");
		} catch (NoSuchOgtApplicationStageException e) {
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
			jsonObject.put("stageName", "Outcome of Claim");
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
