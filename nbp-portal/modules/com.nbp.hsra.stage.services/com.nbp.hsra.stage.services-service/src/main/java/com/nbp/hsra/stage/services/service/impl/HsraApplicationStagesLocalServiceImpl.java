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

package com.nbp.hsra.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.service.model.HsraApplicationTable;
import com.nbp.hsra.stage.services.exception.NoSuchHsraApplicationStagesException;
import com.nbp.hsra.stage.services.model.HsraApplicationStages;
import com.nbp.hsra.stage.services.model.HsraApplicationStagesTable;
import com.nbp.hsra.stage.services.service.base.HsraApplicationStagesLocalServiceBaseImpl;

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
@Component(
	property = "model.class.name=com.nbp.hsra.stage.services.model.HsraApplicationStages",
	service = AopService.class
)
public class HsraApplicationStagesLocalServiceImpl
	extends HsraApplicationStagesLocalServiceBaseImpl {
	public HsraApplicationStages getHsraByCI_SN(String caseId, String stageName)
			throws NoSuchHsraApplicationStagesException {
		return hsraApplicationStagesPersistence.findBygetHsra_By_CaseIdStageName(caseId, stageName);
	}

	public HsraApplicationStages getHsraByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchHsraApplicationStagesException {
		return hsraApplicationStagesPersistence.findBygetHsra_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<HsraApplicationStages> getHsraByCI(String caseId) throws NoSuchHsraApplicationStagesException {
		return hsraApplicationStagesPersistence.findBygetHsra_By_CaseId(caseId);
	}
	public HsraApplicationStages getHsraApp_By_CI(String caseId) throws NoSuchHsraApplicationStagesException {
		return hsraApplicationStagesPersistence.findBygetHsraApp_By_CaseId(caseId);
	}

	public HsraApplicationStages getHsraByCI_ST(String caseId, String stageStatus)
			throws NoSuchHsraApplicationStagesException {
		return hsraApplicationStagesPersistence.findBygetHsra_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<HsraApplicationStages> gtHsraApplicationStages_By_SN(String stageName) {
		return hsraApplicationStagesPersistence.findBygetHsra_By_StageName(stageName);
	}
	public List<String> getHsraDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(HsraApplicationStagesTable.INSTANCE.stageName)
				.from(HsraApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getHsraSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(HsraApplicationStagesTable.INSTANCE)
				.where(HsraApplicationStagesTable.INSTANCE.stageName.eq("Review and Assignment")
						.and(HsraApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(HsraApplicationTable.INSTANCE.caseId)
										.from(HsraApplicationTable.INSTANCE).where(HsraApplicationTable.INSTANCE.status
												.eq(0).and(HsraApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public HsraApplicationStages updateHsraApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		HsraApplicationStages hsraApplicationStages = null;

		try {
			hsraApplicationStages = getHsraByCI_SN(caseId, stageName);
		} catch (NoSuchHsraApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(hsraApplicationStages)) {
			// hsraApplicationStages.setStageStartDate(stageStartDate);
			hsraApplicationStages.setStageEndDate(stageEndDate);
			hsraApplicationStages.setStageStatus(stageStatus);
			hsraApplicationStages.setDuration(duration);
			hsraApplicationStages.setModifiedDate(new Date());
			hsraApplicationStages.setCaseId(caseId);
			hsraApplicationStagesPersistence.update(hsraApplicationStages);
		} else {
			hsraApplicationStages = createHsraApplicationStages(
					CounterLocalServiceUtil.increment(HsraApplicationStages.class.getName()));
			hsraApplicationStages.setStageName(stageName);
			hsraApplicationStages.setStageStartDate(stageStartDate);
			hsraApplicationStages.setStageEndDate(stageEndDate);
			hsraApplicationStages.setStageStatus(stageStatus);
			hsraApplicationStages.setDuration(duration);
			hsraApplicationStages.setCreateDate(new Date());
			hsraApplicationStages.setCaseId(caseId);
			hsraApplicationStagesPersistence.update(hsraApplicationStages);
		}
		return hsraApplicationStages;
	}

	public String getHsraApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		HsraApplicationStages paymentValid = null;
		try {
			paymentValid = getHsraByCI_SN(caseId, "Review Payment Validation");
		} catch (NoSuchHsraApplicationStagesException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(paymentValid)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", paymentValid.getStageName());
			jsonObject.put("status", paymentValid.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(paymentValid.getStageStartDate())) {
				startDate = paymentValid.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (paymentValid.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(paymentValid.getStageEndDate())) {
					endDate = paymentValid.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review Payment Validation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		HsraApplicationStages inspection = null;

		try {
			inspection = getHsraByCI_SN(caseId, "Inspection");
		} catch (NoSuchHsraApplicationStagesException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(inspection)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspection.getStageName());
			jsonObject.put("status", inspection.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(inspection.getStageStartDate())) {
				startDate = inspection.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (inspection.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(inspection.getStageEndDate())) {
					endDate = inspection.getStageEndDate();
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
		HsraApplicationStages dueDiligence = null;
		try {
			dueDiligence = getHsraByCI_SN(caseId, "Due Diligence");
		} catch (NoSuchHsraApplicationStagesException e) {
		}
		if (Validator.isNotNull(dueDiligence)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dueDiligence.getStageName());
			jsonObject.put("status", dueDiligence.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(dueDiligence.getStageStartDate())) {
				startDate = dueDiligence.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (dueDiligence.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dueDiligence.getStageEndDate())) {
					endDate = dueDiligence.getStageEndDate();
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
		HsraApplicationStages licenceIssuance = null;
		try {
			licenceIssuance = getHsraByCI_SN(caseId, "Licence Registration Issuance");
		} catch (NoSuchHsraApplicationStagesException e) {
		}
		if (Validator.isNotNull(licenceIssuance)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", licenceIssuance.getStageName());
			jsonObject.put("status", licenceIssuance.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(licenceIssuance.getStageStartDate())) {
				startDate = licenceIssuance.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (licenceIssuance.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(licenceIssuance.getStageEndDate())) {
					endDate = licenceIssuance.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Licence Registration Issuance");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		// --------next stage
		HsraApplicationStages ceritificationIssued = null;
		try {
			ceritificationIssued = getHsraByCI_SN(caseId, "Certificate of Licence Registration Issued");
		} catch (NoSuchHsraApplicationStagesException e) {
		}
		if (Validator.isNotNull(ceritificationIssued)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", ceritificationIssued.getStageName());
			jsonObject.put("status", ceritificationIssued.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(ceritificationIssued.getStageStartDate())) {
				startDate = ceritificationIssued.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (ceritificationIssued.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(ceritificationIssued.getStageEndDate())) {
					endDate = ceritificationIssued.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Certificate of Licence Registration Issued");
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