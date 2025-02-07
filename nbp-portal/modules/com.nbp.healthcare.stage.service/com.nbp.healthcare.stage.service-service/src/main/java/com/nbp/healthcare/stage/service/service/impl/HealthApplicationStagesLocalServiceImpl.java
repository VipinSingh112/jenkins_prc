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

package com.nbp.healthcare.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationTable;
import com.nbp.healthcare.stage.service.exception.NoSuchHealthApplicationStagesException;
import com.nbp.healthcare.stage.service.model.HealthApplicationStages;
import com.nbp.healthcare.stage.service.model.HealthApplicationStagesTable;
import com.nbp.healthcare.stage.service.service.base.HealthApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.healthcare.stage.service.model.HealthApplicationStages", service = AopService.class)
public class HealthApplicationStagesLocalServiceImpl extends HealthApplicationStagesLocalServiceBaseImpl {

	public List<HealthApplicationStages> getHealthcareStageBy_CI(String caseId) {
		return healthApplicationStagesPersistence.findBygetHAS_BY_CI(caseId);
	}

	public HealthApplicationStages getHealthcareStageBy_CI_ST(String caseId, String stageStatus)
			throws NoSuchHealthApplicationStagesException {
		return healthApplicationStagesPersistence.findBygetHAS_BY_CI_ST(caseId, stageStatus);
	}

	public HealthApplicationStages getHealthcareStageBy_CI_SN(String caseId, String stageName)
			throws NoSuchHealthApplicationStagesException {
		return healthApplicationStagesPersistence.findBygetHAS_BY_CI_SN(caseId, stageName);
	}

	public HealthApplicationStages getHealthcareStageBy_CI_SN_ST(String caseId, String stageName, String stageStatus)
			throws NoSuchHealthApplicationStagesException {
		return healthApplicationStagesPersistence.findBygetHAS_BY_CI_ST_SN(caseId, stageName, stageStatus);
	}

	public HealthApplicationStages getHealthcareStageBy_HAI(long healthApplicationId)
			throws NoSuchHealthApplicationStagesException {
		return healthApplicationStagesPersistence.findBygetHAS_BY_FAI(healthApplicationId);
	}

	public List<HealthApplicationStages> getHealthCareBy_SN(String stageName) {
		return healthApplicationStagesPersistence.findBygetHAS_BY_StageName(stageName);
	}

	public List<HealthApplicationStages> getHealthCareBy_SN_SS(String stageName, String status) {
		return healthApplicationStagesPersistence.findBygetHAS_BY_SN_SS(stageName, status);
	}

	public Long getHealthSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(HealthApplicationStagesTable.INSTANCE)
				.where(HealthApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(HealthApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(HealthCareApplicationTable.INSTANCE.caseId)
										.from(HealthCareApplicationTable.INSTANCE)
										.where(HealthCareApplicationTable.INSTANCE.status.eq(0)
												.and(HealthCareApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public HealthApplicationStages updateHealthApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		HealthApplicationStages healthApplicationStages = null;

		try {
			healthApplicationStages = healthApplicationStagesPersistence.findBygetHAS_BY_CI_SN(caseId, stageName);
		} catch (NoSuchHealthApplicationStagesException e) {
			e.printStackTrace();
		}

		if (Validator.isNotNull(healthApplicationStages)) {
			// healthApplicationStages.setStageStartDate(stageStartDate);
			healthApplicationStages.setStageEndDate(stageEndDate);
			healthApplicationStages.setDuration(duration);
			healthApplicationStages.setModifiedDate(new Date());
			healthApplicationStages.setStageStatus(stageStatus);
			healthApplicationStagesPersistence.update(healthApplicationStages);

		} else {
			healthApplicationStages = createHealthApplicationStages(
					CounterLocalServiceUtil.increment(HealthApplicationStages.class.getName()));
			healthApplicationStages.setStageName(stageName);
			healthApplicationStages.setStageStartDate(stageStartDate);
			healthApplicationStages.setStageEndDate(stageEndDate);
			healthApplicationStages.setCaseId(caseId);
			healthApplicationStages.setDuration(duration);
			healthApplicationStages.setCreateDate(new Date());
			healthApplicationStages.setStageStatus(stageStatus);
			healthApplicationStagesPersistence.update(healthApplicationStages);
		}
		return healthApplicationStages;
	}

	public String getHealthCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateForat = new SimpleDateFormat("dd//MM//yyyy");
		HealthApplicationStages dataVerification = null;

		try {
			dataVerification = getHealthcareStageBy_CI_SN(caseId, "Data Verification");
		} catch (NoSuchHealthApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataVerification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dataVerification.getStageName());
			jsonObject.put("status", dataVerification.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dataVerification.getStageStartDate())) {
				startDate = dataVerification.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (dataVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataVerification.getStageEndDate())) {
					endDate = dataVerification.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
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

		// ---------next stage------------------------------

		HealthApplicationStages hFMU = null;

		try {
			hFMU = getHealthcareStageBy_CI_SN(caseId, "HFMU");
		} catch (NoSuchHealthApplicationStagesException e) {
			// TODO Auto-generated catch block

		}
		if (Validator.isNotNull(hFMU)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", hFMU.getStageName());
			jsonObject.put("status", hFMU.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(hFMU.getStageStartDate())) {
				startDate = hFMU.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (hFMU.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(hFMU.getStageEndDate())) {
					endDate = hFMU.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "HFMU");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// ---------next stage------------------------------

		HealthApplicationStages referralJCA = null;

		try {
			referralJCA = getHealthcareStageBy_CI_SN(caseId, "Referral to JCA");
		} catch (NoSuchHealthApplicationStagesException e) {
			// TODO Auto-generated catch block

		}
		if (Validator.isNotNull(referralJCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", referralJCA.getStageName());
			jsonObject.put("status", referralJCA.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(referralJCA.getStageStartDate())) {
				startDate = referralJCA.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateForat.format(startDate));
			Date endDate = new Date();
			if (referralJCA.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(referralJCA.getStageEndDate())) {
					endDate = referralJCA.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				} else {
					jsonObject.put("endDate", "");
				}
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
//---------next stage------------------------------

		HealthApplicationStages jCA = null;

		try {
			jCA = getHealthcareStageBy_CI_SN(caseId, "JCA Recommendations");
		} catch (NoSuchHealthApplicationStagesException e) {

		}
		if (Validator.isNotNull(jCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", jCA.getStageName());
			jsonObject.put("status", jCA.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(jCA.getStageStartDate())) {
				startDate = jCA.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateForat.format(startDate));
			Date endDate = new Date();
			if (jCA.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(jCA.getStageEndDate())) {
					endDate = jCA.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
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
//---------next stage------------------------------

		HealthApplicationStages iOPermit = null;

		try {
			iOPermit = getHealthcareStageBy_CI_SN(caseId,
					"Issuance of Permit(Exemption Certificate) or Refusal Letter");
		} catch (NoSuchHealthApplicationStagesException e) {
			// TODO Auto-generated catch block

		}
		if (Validator.isNotNull(iOPermit)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", iOPermit.getStageName());
			jsonObject.put("status", iOPermit.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(iOPermit.getStageStartDate())) {
				startDate = iOPermit.getStageStartDate();
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if (iOPermit.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(iOPermit.getStageEndDate())) {
					endDate = iOPermit.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Permit(Exemption Certificate) or Refusal Letter");
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

	public List<String> getHealthCareDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(HealthApplicationStagesTable.INSTANCE.stageName)
				.from(HealthApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

}
