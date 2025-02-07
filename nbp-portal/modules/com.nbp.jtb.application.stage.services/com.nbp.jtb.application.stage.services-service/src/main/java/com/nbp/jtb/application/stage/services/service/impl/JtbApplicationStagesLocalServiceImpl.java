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

package com.nbp.jtb.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.JTBApplicationTable;
import com.nbp.jtb.application.stage.services.exception.NoSuchJtbApplicationStagesException;
import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;
import com.nbp.jtb.application.stage.services.model.JtbApplicationStagesTable;
import com.nbp.jtb.application.stage.services.service.base.JtbApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.jtb.application.stage.services.model.JtbApplicationStages", service = AopService.class)
public class JtbApplicationStagesLocalServiceImpl extends JtbApplicationStagesLocalServiceBaseImpl {
	public JtbApplicationStages getJtbByCI_SN(String caseId, String stageName)
			throws NoSuchJtbApplicationStagesException {
		return jtbApplicationStagesPersistence.findBygetJtb_By_CaseIdStageName(caseId, stageName);
	}

	public JtbApplicationStages getJtbByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchJtbApplicationStagesException {
		return jtbApplicationStagesPersistence.findBygetJtb_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<JtbApplicationStages> getJtbByCI(String caseId) throws NoSuchJtbApplicationStagesException {
		return jtbApplicationStagesPersistence.findBygetJtb_By_CaseId(caseId);
	}

	public JtbApplicationStages getJtbByCI_ST(String caseId, String stageStatus)
			throws NoSuchJtbApplicationStagesException {
		return jtbApplicationStagesPersistence.findBygetJtb_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public JtbApplicationStages getJtbBy_CI(String caseId) throws NoSuchJtbApplicationStagesException {
		return jtbApplicationStagesPersistence.findBygetJtb_By_CI(caseId);
	}

	public List<JtbApplicationStages> gtJtbApplicationStages_By_SN(String stageName) {
		return jtbApplicationStagesPersistence.findBygetJtb_By_StageName(stageName);
	}

	public List<String> getJTBDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(JtbApplicationStagesTable.INSTANCE.stageName)
				.from(JtbApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getJTBSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(JtbApplicationStagesTable.INSTANCE)
				.where(JtbApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(JtbApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(JTBApplicationTable.INSTANCE.caseId).from(JTBApplicationTable.INSTANCE)
								.where(JTBApplicationTable.INSTANCE.status.eq(0)
										.and(JTBApplicationTable.INSTANCE.typeOfApplication
												.eq("Accommodations Licence"))
										.and(JTBApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public Long getJTBAttractionSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(JtbApplicationStagesTable.INSTANCE)
				.where(JtbApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(JtbApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(JTBApplicationTable.INSTANCE.caseId).from(JTBApplicationTable.INSTANCE)
								.where(JTBApplicationTable.INSTANCE.status.eq(0)
										.and(JTBApplicationTable.INSTANCE.typeOfApplication.eq("Attractions"))
										.and(JTBApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public Long getJTBOtherSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(JtbApplicationStagesTable.INSTANCE)
				.where(JtbApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(JtbApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(JTBApplicationTable.INSTANCE.caseId).from(JTBApplicationTable.INSTANCE)
								.where(JTBApplicationTable.INSTANCE.status.eq(0)
										.and(JTBApplicationTable.INSTANCE.typeOfApplication
												.eq("Other Tourism Related Licences"))
										.and(JTBApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public JtbApplicationStages updateJtbApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		JtbApplicationStages jtbApplicationStages = null;

		try {
			jtbApplicationStages = getJtbByCI_SN(caseId, stageName);
		} catch (NoSuchJtbApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(jtbApplicationStages)) {
			// jtbApplicationStages.setStageStartDate(stageStartDate);
			jtbApplicationStages.setStageEndDate(stageEndDate);
			jtbApplicationStages.setStageStatus(stageStatus);
			jtbApplicationStages.setDuration(duration);
			jtbApplicationStages.setModifiedDate(new Date());
			jtbApplicationStages.setCaseId(caseId);
			jtbApplicationStagesPersistence.update(jtbApplicationStages);
		} else {
			jtbApplicationStages = createJtbApplicationStages(
					CounterLocalServiceUtil.increment(JtbApplicationStages.class.getName()));
			jtbApplicationStages.setStageName(stageName);
			jtbApplicationStages.setStageStartDate(stageStartDate);
			jtbApplicationStages.setStageEndDate(stageEndDate);
			jtbApplicationStages.setStageStatus(stageStatus);
			jtbApplicationStages.setDuration(duration);
			jtbApplicationStages.setCreateDate(new Date());
			jtbApplicationStages.setCaseId(caseId);
			jtbApplicationStagesPersistence.update(jtbApplicationStages);
		}
		return jtbApplicationStages;
	}

	public String getJtbApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		JtbApplicationStages dataVerification = null;
		try {
			dataVerification = getJtbByCI_SN(caseId, "Data Verification");
		} catch (NoSuchJtbApplicationStagesException e) {
			// TODO Auto-generated catch block
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
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
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

		// --------next stage
		JtbApplicationStages qualityAssurance = null;

		try {
			qualityAssurance = getJtbByCI_SN(caseId, "Quality Assurance Assessment");
		} catch (NoSuchJtbApplicationStagesException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(qualityAssurance)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", qualityAssurance.getStageName());
			jsonObject.put("status", qualityAssurance.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(qualityAssurance.getStageStartDate())) {
				startDate = qualityAssurance.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (qualityAssurance.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(qualityAssurance.getStageEndDate())) {
					endDate = qualityAssurance.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Quality Assurance Assessment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
//		// --------next stage
//		JtbApplicationStages licenceReview = null;
//		try {
//			licenceReview = getJtbByCI_SN(caseId, "Licencing Processing & Registration Unit (LP&RU) Review");
//		} catch (NoSuchJtbApplicationStagesException e) {
//		}
//		if (Validator.isNotNull(licenceReview)) {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", licenceReview.getStageName());
//			jsonObject.put("status", licenceReview.getStageStatus());
//			Date startDate = new Date();
//			;
//			if (Validator.isNotNull(licenceReview.getStageStartDate())) {
//				startDate = licenceReview.getStageStartDate();
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			} else {
//				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
//			}
//			Date endDate = new Date();
//			if (licenceReview.getStageStatus().equals("Closed")) {
//				if (Validator.isNotNull(licenceReview.getStageEndDate())) {
//					endDate = licenceReview.getStageEndDate();
//				}
//				jsonObject.put("endDate", bpmDateFormat.format(endDate));
//			} else {
//				jsonObject.put("endDate", "");
//			}
//			jsonObject.put("duration", calculateWeeks(startDate, endDate));
//			stages.put(jsonObject);
//		} else {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", "Licencing Processing & Registration Unit (LP&RU) Review");
//			jsonObject.put("status", "");
//			jsonObject.put("duration", "");
//			jsonObject.put("startDate", "");
//			jsonObject.put("endDate", "");
//			stages.put(jsonObject);
//		}

		// --------next stage
		JtbApplicationStages boardDecision = null;
		try {
			boardDecision = getJtbByCI_SN(caseId, "Board Decision");
		} catch (NoSuchJtbApplicationStagesException e) {
		}
		if (Validator.isNotNull(boardDecision)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", boardDecision.getStageName());
			jsonObject.put("status", boardDecision.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(boardDecision.getStageStartDate())) {
				startDate = boardDecision.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (boardDecision.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(boardDecision.getStageEndDate())) {
					endDate = boardDecision.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Board Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JtbApplicationStages refusalLetter = null;
		try {
			refusalLetter = getJtbByCI_SN(caseId, "Licence Certificate (or Refusal Letter) Generation");
		} catch (NoSuchJtbApplicationStagesException e) {
		}
		if (Validator.isNotNull(refusalLetter)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", refusalLetter.getStageName());
			jsonObject.put("status", refusalLetter.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(refusalLetter.getStageStartDate())) {
				startDate = refusalLetter.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (refusalLetter.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(refusalLetter.getStageEndDate())) {
					endDate = refusalLetter.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Licence Certificate (or Refusal Letter) Generation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JtbApplicationStages licenceIssuance = null;
		try {
			licenceIssuance = getJtbByCI_SN(caseId, "Licence Issuance");
		} catch (NoSuchJtbApplicationStagesException e) {
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
			jsonObject.put("stageName", "Licence Issuance");
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