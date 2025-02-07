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

package com.nbp.explosives.competency.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplicationTable;
import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveApplicationStagesException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;
import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStagesTable;
import com.nbp.explosives.competency.stages.service.service.base.ExplosiveApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages", service = AopService.class)
public class ExplosiveApplicationStagesLocalServiceImpl extends ExplosiveApplicationStagesLocalServiceBaseImpl {
	public ExplosiveApplicationStages getEXP_CAI(long expApplicationId)
			throws NoSuchExplosiveApplicationStagesException {
		return explosiveApplicationStagesPersistence.findBygetEXP_CAI(expApplicationId);
	}

	public ExplosiveApplicationStages getEXP_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchExplosiveApplicationStagesException {
		return explosiveApplicationStagesPersistence.findBygetEXP_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public ExplosiveApplicationStages getEXP_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchExplosiveApplicationStagesException {
		return explosiveApplicationStagesPersistence.findBygetEXP_CaseIdAndStatus(caseId, stageStatus);
	}

	public ExplosiveApplicationStages getEXP_CaseIdStageName(String caseId, String stageName)
			throws NoSuchExplosiveApplicationStagesException {
		return explosiveApplicationStagesPersistence.fetchBygetEXP_CaseIdStageName(caseId, stageName);
	}

	public List<ExplosiveApplicationStages> getEXP_CaseId(String caseId) {
		return explosiveApplicationStagesPersistence.findBygetEXP_CaseId(caseId);
	}
	public ExplosiveApplicationStages getEXP_By_CaseId(String caseId) throws NoSuchExplosiveApplicationStagesException {
		return explosiveApplicationStagesPersistence.findBygetEXP_By_CaseId(caseId);
	}

	public List<ExplosiveApplicationStages> getEXP_SNAndSS(String stageName, String status) {
		return explosiveApplicationStagesPersistence.findBygetEXP_SNAndSS(stageName, status);
	}

	public List<ExplosiveApplicationStages> getEXP_BY_SN(String stageName) {
		return explosiveApplicationStagesPersistence.findBygetEXP_StageName(stageName);
	}

	public List<String> getExplosiceDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(ExplosiveApplicationStagesTable.INSTANCE.stageName)
				.from(ExplosiveApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getExplosiveSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(ExplosiveApplicationStagesTable.INSTANCE)
				.where(ExplosiveApplicationStagesTable.INSTANCE.stageName.eq("NCBJ Review and Quotation")
						.and(ExplosiveApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(ExplosivesApplicationTable.INSTANCE.caseId)
										.from(ExplosivesApplicationTable.INSTANCE)
										.where(ExplosivesApplicationTable.INSTANCE.status.eq(0)
												.and(ExplosivesApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public ExplosiveApplicationStages updateExplosiveApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {
		ExplosiveApplicationStages ExplosiveApplicationStages = null;
		ExplosiveApplicationStages = explosiveApplicationStagesPersistence.fetchBygetEXP_CaseIdStageName(caseId,
				stageName);

		if (Validator.isNotNull(ExplosiveApplicationStages)) {
			// tourismApplicationStages.setStageStartDate(stageStartDate);
			ExplosiveApplicationStages.setStageEndDate(stageEndDate);
			ExplosiveApplicationStages.setStageStatus(stageStatus);
			ExplosiveApplicationStages.setDuration(duration);
			ExplosiveApplicationStages.setModifiedDate(new Date());
			explosiveApplicationStagesPersistence.update(ExplosiveApplicationStages);
		} else {
			ExplosiveApplicationStages = createExplosiveApplicationStages(
					CounterLocalServiceUtil.increment(ExplosiveApplicationStages.class.getName()));
			ExplosiveApplicationStages.setStageName(stageName);
			ExplosiveApplicationStages.setStageStartDate(stageStartDate);
			ExplosiveApplicationStages.setStageEndDate(stageEndDate);
			ExplosiveApplicationStages.setStageStatus(stageStatus);
			ExplosiveApplicationStages.setCaseId(caseId);
			ExplosiveApplicationStages.setDuration(duration);
			ExplosiveApplicationStages.setCreateDate(new Date());
			explosiveApplicationStagesPersistence.update(ExplosiveApplicationStages);
		}
		return ExplosiveApplicationStages;
	}

	public String getExplosiveCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		ExplosiveApplicationStages referralToJCA = null;
		try {
			referralToJCA = getEXP_CaseIdStageName(caseId, "Review & Due Diligence");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(referralToJCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", referralToJCA.getStageName());
			jsonObject.put("status", referralToJCA.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(referralToJCA.getStageStartDate())) {
				startDate = referralToJCA.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			Date endDate = new Date();
			if (referralToJCA.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(referralToJCA.getStageEndDate())) {
					endDate = referralToJCA.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review & Due Diligence");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		ExplosiveApplicationStages issuanceOfPermit = null;
		try {
			issuanceOfPermit = getEXP_CaseIdStageName(caseId, "Commission Decision");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(issuanceOfPermit)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuanceOfPermit.getStageName());
			jsonObject.put("status", issuanceOfPermit.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(issuanceOfPermit.getStageStartDate())) {
				startDate = issuanceOfPermit.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			Date endDate = new Date();
			if (issuanceOfPermit.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuanceOfPermit.getStageEndDate())) {
					endDate = issuanceOfPermit.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Commission Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		ExplosiveApplicationStages certificateIssuance = null;
		try {
			certificateIssuance = getEXP_CaseIdStageName(caseId, "Certificate Issuance");
		} catch (Exception e) {
			// TODO: handle exception
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
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
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
			jsonObject.put("stageName", "Certificate Issuance");
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
	public List<ExplosiveApplicationStages> getCAS_BY_SN(String stageName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExplosiveApplicationStages> getCAS_CaseId(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExplosiveApplicationStages> getCAS_SNAndSS(String stageName, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCretiveCurrentStages(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
}