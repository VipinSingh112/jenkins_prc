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

package com.nbp.film.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.film.application.form.service.model.FilmApplicationTable;
import com.nbp.film.stages.services.exception.NoSuchFilmApplicationStagesException;
import com.nbp.film.stages.services.model.FilmApplicationStages;
import com.nbp.film.stages.services.model.FilmApplicationStagesTable;
import com.nbp.film.stages.services.service.base.FilmApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.film.stages.services.model.FilmApplicationStages", service = AopService.class)
public class FilmApplicationStagesLocalServiceImpl extends FilmApplicationStagesLocalServiceBaseImpl {
	public FilmApplicationStages getFilmByFAI(long filmApplicationId) throws NoSuchFilmApplicationStagesException {
		return filmApplicationStagesPersistence.findBygetFAS_CAI(filmApplicationId);
	}

	public FilmApplicationStages getFilmByCI_SN(String caseId, String stageName)
			throws NoSuchFilmApplicationStagesException {
		return filmApplicationStagesPersistence.findBygetFAS_CaseIdStageName(caseId, stageName);
	}

	public FilmApplicationStages getFilmByCI_ST_SN(String CaseId, String stageStatus, String StageName)
			throws NoSuchFilmApplicationStagesException {
		return filmApplicationStagesPersistence.findBygetFAS_CaseIdStageStatus(CaseId, stageStatus, StageName);
	}

	public FilmApplicationStages getFilmByCI_ST(String caseId, String status)
			throws NoSuchFilmApplicationStagesException {
		return filmApplicationStagesPersistence.findBygetFAS_CaseIdAndStatus(caseId, status);
	}

	public List<FilmApplicationStages> getFilmByCI(String caseId) {
		return filmApplicationStagesPersistence.findBygetCAS_CaseId(caseId);
	}

	public List<FilmApplicationStages> getFilmBySN(String stageName) {
		return filmApplicationStagesPersistence.findBygetFAS_StageName(stageName);
	}

	public List<FilmApplicationStages> getFAS_StageName_StageStatus(String stageName, String status) {
		return filmApplicationStagesPersistence.findBygetFAS_StageName_StageStatus(stageName, status);
	}

	public List<String> getFilmDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(FilmApplicationStagesTable.INSTANCE.stageName)
				.from(FilmApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getFilmSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(FilmApplicationStagesTable.INSTANCE)
				.where(FilmApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(FilmApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(FilmApplicationTable.INSTANCE.caseId)
										.from(FilmApplicationTable.INSTANCE).where(FilmApplicationTable.INSTANCE.status
												.eq(0).and(FilmApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public FilmApplicationStages updateFilmApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		FilmApplicationStages filmApplicationStages = null;

		try {
			filmApplicationStages = filmApplicationStagesPersistence.findBygetFAS_CaseIdStageName(caseId, stageName);
		} catch (NoSuchFilmApplicationStagesException e) {
		}

		if (Validator.isNotNull(filmApplicationStages)) {
			filmApplicationStages.setStageEndDate(stageEndDate);
			filmApplicationStages.setStageStatus(stageStatus);
			filmApplicationStages.setDuration(duration);
			filmApplicationStages.setModifiedDate(new Date());
			filmApplicationStagesPersistence.update(filmApplicationStages);
		} else {
			filmApplicationStages = createFilmApplicationStages(
					CounterLocalServiceUtil.increment(FilmApplicationStages.class.getName()));
			filmApplicationStages.setStageName(stageName);
			filmApplicationStages.setStageStartDate(stageStartDate);
			filmApplicationStages.setStageEndDate(stageEndDate);
			filmApplicationStages.setStageStatus(stageStatus);
			filmApplicationStages.setCaseId(caseId);
			filmApplicationStages.setDuration(duration);
			filmApplicationStages.setCreateDate(new Date());
			filmApplicationStagesPersistence.update(filmApplicationStages);
		}
		return filmApplicationStages;
	}

	public String getfilmCurrentStage(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		// ------- stage
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		FilmApplicationStages dataVerification = null;
		try {
			dataVerification = getFilmByCI_SN(caseId, "Data Verification");
		} catch (NoSuchFilmApplicationStagesException e) {
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
		FilmApplicationStages issuanceOfLicense = null;
		try {
			issuanceOfLicense = getFilmByCI_SN(caseId, "Issuance of License Certificate or Refusal Letter");
		} catch (NoSuchFilmApplicationStagesException e) {
		}
		if (Validator.isNotNull(issuanceOfLicense)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuanceOfLicense.getStageName());
			jsonObject.put("status", issuanceOfLicense.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(issuanceOfLicense.getStageStartDate())) {
				startDate = issuanceOfLicense.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (issuanceOfLicense.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuanceOfLicense.getStageEndDate())) {
					endDate = issuanceOfLicense.getStageEndDate();
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
}