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

package com.nbp.ncra.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncra.application.form.service.model.NcraApplicationTable;
import com.nbp.ncra.stages.services.exception.NoSuchNcraApplicationStagesException;
import com.nbp.ncra.stages.services.model.NcraApplicationStages;
import com.nbp.ncra.stages.services.model.NcraApplicationStagesTable;
import com.nbp.ncra.stages.services.service.base.NcraApplicationStagesLocalServiceBaseImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.ncra.stages.services.model.NcraApplicationStages", service = AopService.class)
public class NcraApplicationStagesLocalServiceImpl extends NcraApplicationStagesLocalServiceBaseImpl {
	public List<NcraApplicationStages> getNCRA_By_CaseId(String caseId) {
		return ncraApplicationStagesPersistence.findByget_NCRA_AppStage_By_CI(caseId);
	}

	public List<NcraApplicationStages> getNCRA_BySN(String stageName) {
		return ncraApplicationStagesPersistence.findByget_NCRA_By_SN(stageName);
	}

	public NcraApplicationStages getNCRA_By_StageStatus(String stageStatus)
			throws NoSuchNcraApplicationStagesException {
		return ncraApplicationStagesPersistence.findByget_NCRA_By_Status(stageStatus);
	}

	public NcraApplicationStages getNCRA_ByCI_SN(String caseId, String stageName)
			throws NoSuchNcraApplicationStagesException {
		return ncraApplicationStagesPersistence.findByget_NCRA_By_CI_SN(caseId, stageName);
	}

	public NcraApplicationStages getNCRA_ByCI_SN_SS(String caseId, String stageName, String stageStatus)
			throws NoSuchNcraApplicationStagesException {
		return ncraApplicationStagesPersistence.findByget_NCRA_By_CI_SN_SS(caseId, stageName, stageStatus);
	}

	public NcraApplicationStages getNCRA_ByCI_SS(String caseId, String stageStatus)
			throws NoSuchNcraApplicationStagesException {
		return ncraApplicationStagesPersistence.findByget_NCRA_By_CI_SS(caseId, stageStatus);
	}
	public NcraApplicationStages getNCRA_ByCI(String caseId)
			throws NoSuchNcraApplicationStagesException {
		return ncraApplicationStagesPersistence.findByget_NCRA_AppStage_CI(caseId);
	}

	public List<String> getNCRADistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(NcraApplicationStagesTable.INSTANCE.stageName)
				.from(NcraApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getNCRASeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(NcraApplicationStagesTable.INSTANCE)
				.where(NcraApplicationStagesTable.INSTANCE.stageName.eq("Application Credit Status")
						.and(NcraApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(NcraApplicationTable.INSTANCE.caseId)
										.from(NcraApplicationTable.INSTANCE).where(NcraApplicationTable.INSTANCE.status
												.eq(0).and(NcraApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public NcraApplicationStages updateNCRAAppStage(String caseId, String stageName, String stageStatus,
			Date stageStartDate, Date stageEndDate, String duration) {
		NcraApplicationStages applicationStage = null;
		try {
			applicationStage = getNCRA_ByCI_SN(caseId, stageName);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(applicationStage)) {
			applicationStage.setStageStartDate(stageStartDate);
			applicationStage.setStageEndDate(stageEndDate);
			applicationStage.setDuration(duration);
			applicationStage.setStageStatus(stageStatus);
			ncraApplicationStagesPersistence.update(applicationStage);
		} else {
			applicationStage = createNcraApplicationStages(CounterLocalServiceUtil.increment());
			applicationStage.setStageStartDate(stageStartDate);
			applicationStage.setStageEndDate(stageEndDate);
			applicationStage.setDuration(duration);
			applicationStage.setStageStatus(stageStatus);
			applicationStage.setCaseId(caseId);
			applicationStage.setStageName(stageName);
			applicationStage.setCreateDate(new Date());
			ncraApplicationStagesPersistence.update(applicationStage);
		}
		return applicationStage;
	}

	public String getNCRACurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateForat = new SimpleDateFormat("dd//MM//yyyy");
		NcraApplicationStages applicationCredit = null;

		try {
			applicationCredit = getNCRA_ByCI_SN(caseId, "Application Credit Status");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(applicationCredit)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", applicationCredit.getStageName());
			jsonObject.put("status", applicationCredit.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(applicationCredit.getStageStartDate())) {
				startDate = applicationCredit.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (applicationCredit.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(applicationCredit.getStageEndDate())) {
					endDate = applicationCredit.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Application Credit Status");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		NcraApplicationStages inspection = null;

		try {
			inspection = getNCRA_ByCI_SN(caseId, "Inspection");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(inspection)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspection.getStageName());
			jsonObject.put("status", inspection.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(inspection.getStageStartDate())) {
				startDate = inspection.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (inspection.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(inspection.getStageEndDate())) {
					endDate = inspection.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
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
		NcraApplicationStages recommendation = null;

		try {
			recommendation = getNCRA_ByCI_SN(caseId, "Recommendations Decision");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(recommendation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", recommendation.getStageName());
			jsonObject.put("status", recommendation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(recommendation.getStageStartDate())) {
				startDate = recommendation.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (recommendation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(recommendation.getStageEndDate())) {
					endDate = recommendation.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Recommendations Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		NcraApplicationStages certificate = null;

		try {
			certificate = getNCRA_ByCI_SN(caseId, "Issuance of Verification Certificate");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(certificate)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certificate.getStageName());
			jsonObject.put("status", certificate.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(certificate.getStageStartDate())) {
				startDate = certificate.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (certificate.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(certificate.getStageEndDate())) {
					endDate = certificate.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Verification Certificate");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		return stages.toString();
	}

	private String calculateWeeks(Date startDate, Date endDate) {
		java.util.Calendar cal = new GregorianCalendar();
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