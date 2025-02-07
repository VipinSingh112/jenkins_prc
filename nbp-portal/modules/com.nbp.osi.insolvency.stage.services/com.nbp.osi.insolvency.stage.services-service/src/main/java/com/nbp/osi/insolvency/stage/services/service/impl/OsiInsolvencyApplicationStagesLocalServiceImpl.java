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

package com.nbp.osi.insolvency.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationTable;
import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyApplicationStagesException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStagesTable;
import com.nbp.osi.insolvency.stage.services.service.base.OsiInsolvencyApplicationStagesLocalServiceBaseImpl;
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
@Component(property = "model.class.name=com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages", service = AopService.class)
public class OsiInsolvencyApplicationStagesLocalServiceImpl extends OsiInsolvencyApplicationStagesLocalServiceBaseImpl {
//	--------------------------------------finders-----------------------
	public OsiInsolvencyApplicationStages getOIAS_OAI(long osiInsolvencyId)
			throws NoSuchOsiInsolvencyApplicationStagesException {
		return osiInsolvencyApplicationStagesPersistence.findBygetOIAS_OAI(osiInsolvencyId);
	}

	public OsiInsolvencyApplicationStages getCAS_CaseIdStageName(String caseId, String stageName)
			throws NoSuchOsiInsolvencyApplicationStagesException {
		return osiInsolvencyApplicationStagesPersistence.findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	public List<OsiInsolvencyApplicationStages> getOAIS_StageName(String stageName) {
		return osiInsolvencyApplicationStagesPersistence.findBygetOIAS_StageName(stageName);
	}

	public OsiInsolvencyApplicationStages getOIAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchOsiInsolvencyApplicationStagesException {
		return osiInsolvencyApplicationStagesPersistence.fetchBygetOIAS_CaseIdStageStatus(caseId, stageName,
				stageStatus);
	}

	public OsiInsolvencyApplicationStages getOIAS_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchOsiInsolvencyApplicationStagesException {
		return osiInsolvencyApplicationStagesPersistence.findBygetOIAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<OsiInsolvencyApplicationStages> getOIAS_CaseId(String caseId) {
		return osiInsolvencyApplicationStagesPersistence.findBygetOIAS_CaseId(caseId);
	}

	public List<OsiInsolvencyApplicationStages> getOIAS_StageName_StageStatus(String caseId, String status) {
		return osiInsolvencyApplicationStagesPersistence.findBygetOIAS_StageName_StageStatus(caseId, status);
	}

	public Long getOSIIRSeenCases(String stageName) {
		DSLQuery query = DSLQueryFactoryUtil.count().from(OsiInsolvencyApplicationStagesTable.INSTANCE)
				.where(OsiInsolvencyApplicationStagesTable.INSTANCE.stageName.eq(stageName)
						.and(OsiInsolvencyApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(OsiInsolvencyApplicationTable.INSTANCE.caseId)
										.from(OsiInsolvencyApplicationTable.INSTANCE)
										.where(OsiInsolvencyApplicationTable.INSTANCE.status.eq(0)
												.and(OsiInsolvencyApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	// -----------------------------methods----------------------------------
	public OsiInsolvencyApplicationStages updateOsiInsolvencyApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {

		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages = null;
		try {
			osiInsolvencyApplicationStages = getCAS_CaseIdStageName(caseId, stageName);
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(osiInsolvencyApplicationStages)) {
			osiInsolvencyApplicationStages.setStageEndDate(stageEndDate);
			osiInsolvencyApplicationStages.setStageStatus(stageStatus);
			osiInsolvencyApplicationStages.setDuration(duration);
			osiInsolvencyApplicationStages.setModifiedDate(new Date());
			osiInsolvencyApplicationStages.setCaseId(caseId);
			osiInsolvencyApplicationStagesPersistence.update(osiInsolvencyApplicationStages);
		} else {
			osiInsolvencyApplicationStages = createOsiInsolvencyApplicationStages(
					CounterLocalServiceUtil.increment(OsiInsolvencyApplicationStages.class.getName()));
			osiInsolvencyApplicationStages.setStageName(stageName);
			osiInsolvencyApplicationStages.setStageStartDate(stageStartDate);
			osiInsolvencyApplicationStages.setStageEndDate(stageEndDate);
			osiInsolvencyApplicationStages.setStageStatus(stageStatus);
			osiInsolvencyApplicationStages.setDuration(duration);
			osiInsolvencyApplicationStages.setCreateDate(new Date());
			osiInsolvencyApplicationStages.setCaseId(caseId);
			osiInsolvencyApplicationStagesPersistence.update(osiInsolvencyApplicationStages);
		}
		return osiInsolvencyApplicationStages;

	}

	public String getOsiInsolvencypplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		OsiInsolvencyApplicationStages dataPaymentVerification = null;
		try {
			dataPaymentVerification = getCAS_CaseIdStageName(caseId, "Data Verification");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataPaymentVerification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dataPaymentVerification.getStageName());
			jsonObject.put("status", dataPaymentVerification.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dataPaymentVerification.getStageStartDate())) {
				startDate = dataPaymentVerification.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (dataPaymentVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataPaymentVerification.getStageEndDate())) {
					endDate = dataPaymentVerification.getStageEndDate();
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

// 		--------next stage

		OsiInsolvencyApplicationStages financialPosition = null;
		try {
			financialPosition = getCAS_CaseIdStageName(caseId, "Financial Position");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(financialPosition)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", financialPosition.getStageName());
			jsonObject.put("status", financialPosition.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(financialPosition.getStageStartDate())) {
				startDate = financialPosition.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (financialPosition.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(financialPosition.getStageEndDate())) {
					endDate = financialPosition.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Financial Position");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

// 		--------next stage

		OsiInsolvencyApplicationStages investigation = null;
		try {
			investigation = getCAS_CaseIdStageName(caseId, "Investigations");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(investigation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", investigation.getStageName());
			jsonObject.put("status", investigation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(investigation.getStageStartDate())) {
				startDate = investigation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (investigation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(investigation.getStageEndDate())) {
					endDate = investigation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Investigations");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

// 		--------next stage

		OsiInsolvencyApplicationStages recommendationsDecision = null;
		try {
			recommendationsDecision = getCAS_CaseIdStageName(caseId, "Recommendations Decision");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(recommendationsDecision)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", recommendationsDecision.getStageName());
			jsonObject.put("status", recommendationsDecision.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(recommendationsDecision.getStageStartDate())) {
				startDate = recommendationsDecision.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (recommendationsDecision.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(recommendationsDecision.getStageEndDate())) {
					endDate = recommendationsDecision.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
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
// 		--------next stage

		OsiInsolvencyApplicationStages issuanceOfAssesmentReport = null;
		try {
			issuanceOfAssesmentReport = getCAS_CaseIdStageName(caseId, "Issuance of Insolvency Assessment Report");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(issuanceOfAssesmentReport)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuanceOfAssesmentReport.getStageName());
			jsonObject.put("status", issuanceOfAssesmentReport.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(issuanceOfAssesmentReport.getStageStartDate())) {
				startDate = issuanceOfAssesmentReport.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (issuanceOfAssesmentReport.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuanceOfAssesmentReport.getStageEndDate())) {
					endDate = issuanceOfAssesmentReport.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Insolvency Assessment Report");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		return stages.toString();

	}

	public String getOsiInsolvencypplicaitonCurrentStagesForVerificationReport(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		OsiInsolvencyApplicationStages dataPaymentVerification = null;
		try {
			dataPaymentVerification = getCAS_CaseIdStageName(caseId, "Payment Verification");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataPaymentVerification)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dataPaymentVerification.getStageName());
			jsonObject.put("status", dataPaymentVerification.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(dataPaymentVerification.getStageStartDate())) {
				startDate = dataPaymentVerification.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (dataPaymentVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataPaymentVerification.getStageEndDate())) {
					endDate = dataPaymentVerification.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Payment Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		OsiInsolvencyApplicationStages insolvencySearch = null;
		try {
			insolvencySearch = getCAS_CaseIdStageName(caseId, "Insolvency Search");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(insolvencySearch)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", insolvencySearch.getStageName());
			jsonObject.put("status", insolvencySearch.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(insolvencySearch.getStageStartDate())) {
				startDate = insolvencySearch.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (insolvencySearch.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(insolvencySearch.getStageEndDate())) {
					endDate = insolvencySearch.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Insolvency Search");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		OsiInsolvencyApplicationStages issuanceOfInsolvencyReport = null;
		try {
			issuanceOfInsolvencyReport = getCAS_CaseIdStageName(caseId, "Issuance of Report");
		} catch (NoSuchOsiInsolvencyApplicationStagesException e) {
		}
		if (Validator.isNotNull(issuanceOfInsolvencyReport)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuanceOfInsolvencyReport.getStageName());
			jsonObject.put("status", issuanceOfInsolvencyReport.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(issuanceOfInsolvencyReport.getStageStartDate())) {
				startDate = issuanceOfInsolvencyReport.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (issuanceOfInsolvencyReport.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(issuanceOfInsolvencyReport.getStageEndDate())) {
					endDate = issuanceOfInsolvencyReport.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Issuance of Report");
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