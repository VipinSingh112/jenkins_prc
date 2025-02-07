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

package com.nbp.factories.registration.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistration;
import com.nbp.factories.registration.application.form.services.model.FactoriesApplicationRegistrationTable;
import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesApplicationStageException;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStageTable;
import com.nbp.factories.registration.stage.services.service.base.FactoriesApplicationStageLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage", service = AopService.class)
public class FactoriesApplicationStageLocalServiceImpl extends FactoriesApplicationStageLocalServiceBaseImpl {

	public FactoriesApplicationStage getFactories_By_AI(long factoriesApplicationId)
			throws NoSuchFactoriesApplicationStageException {
		return factoriesApplicationStagePersistence.findBygetFactories_By_AI(factoriesApplicationId);
	}

	public FactoriesApplicationStage getFactories_By_CaseIdStageName(String caseId, String stageName)
			throws NoSuchFactoriesApplicationStageException {
		return factoriesApplicationStagePersistence.findBygetFactories_By_CaseIdStageName(caseId, stageName);
	}

	public FactoriesApplicationStage getFactories_By_CaseIdStageStatus(String caseId, String stageStatus,
			String stageName) throws NoSuchFactoriesApplicationStageException {
		return factoriesApplicationStagePersistence.findBygetFactories_By_CaseIdStageStatus(caseId, stageStatus,
				stageName);
	}

	public FactoriesApplicationStage getFactories_By_CaseIdAndStatus(String caseId, String status)
			throws NoSuchFactoriesApplicationStageException {
		return factoriesApplicationStagePersistence.findBygetFactories_By_CaseIdAndStatus(caseId, status);
	}
	public FactoriesApplicationStage get_Factories_By_CaseId(String caseId)
			throws NoSuchFactoriesApplicationStageException {
		return factoriesApplicationStagePersistence.findByget_Factories_By_CaseId(caseId);
	}
	public List<FactoriesApplicationStage> getFactories_By_CaseId(String caseId) {
		return factoriesApplicationStagePersistence.findBygetFactories_By_CaseId(caseId);
	}

	public List<FactoriesApplicationStage> getFactories_By_StageName(String stageName) {
		return factoriesApplicationStagePersistence.findBygetFactories_By_StageName(stageName);
	}

	public List<String> getFactoriesDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(FactoriesApplicationStageTable.INSTANCE.stageName)
				.from(FactoriesApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getFactoriesSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(FactoriesApplicationStageTable.INSTANCE)
				.where(FactoriesApplicationStageTable.INSTANCE.stageName.eq("Application Submission/Creation")
						.and(FactoriesApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(FactoriesApplicationRegistrationTable.INSTANCE.caseId)
										.from(FactoriesApplicationRegistrationTable.INSTANCE).where(FactoriesApplicationRegistrationTable.INSTANCE.status
												.eq(0).and(FactoriesApplicationRegistrationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public FactoriesApplicationStage updateFactoriesApplicationStage(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {

		FactoriesApplicationStage factoriesApplicationStages = null;
		System.out.println("factoriesApplicationStages is*****************");

		try {
			factoriesApplicationStages = factoriesApplicationStagePersistence
					.findBygetFactories_By_CaseIdStageName(caseId, stageName);
		} catch (NoSuchFactoriesApplicationStageException e) {
		}

		if (Validator.isNotNull(factoriesApplicationStages)) {
			System.out.println("inside Factories Application stages-------------------");
			factoriesApplicationStages.setStageEndDate(stageEndDate);
			factoriesApplicationStages.setStageStatus(stageStatus);
			factoriesApplicationStages.setDuration(duration);
			factoriesApplicationStages.setModifiedDate(new Date());
			factoriesApplicationStagePersistence.update(factoriesApplicationStages);
		} else {
			factoriesApplicationStages = createFactoriesApplicationStage(
					CounterLocalServiceUtil.increment(FactoriesApplicationStage.class.getName()));
			factoriesApplicationStages.setStageName(stageName);
			factoriesApplicationStages.setStageStartDate(stageStartDate);
			factoriesApplicationStages.setStageEndDate(stageEndDate);
			factoriesApplicationStages.setStageStatus(stageStatus);
			factoriesApplicationStages.setCaseId(caseId);
			factoriesApplicationStages.setDuration(duration);
			factoriesApplicationStages.setCreateDate(new Date());
			factoriesApplicationStagePersistence.update(factoriesApplicationStages);
			System.out.println("after uodate Factories Application stages-------------------");
		}
		return factoriesApplicationStages;
	}

	public String getfactoriesCurrentStage(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		// ------- stage
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		FactoriesApplicationStage applicationCreatiom = null;

		try {
			applicationCreatiom = getFactories_By_CaseIdStageName(caseId, "Application Submission/Creation");
		} catch (NoSuchFactoriesApplicationStageException e) {
		}
		if (Validator.isNotNull(applicationCreatiom)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", applicationCreatiom.getStageName());
			jsonObject.put("status", applicationCreatiom.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(applicationCreatiom.getStageStartDate())) {
				startDate = applicationCreatiom.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (applicationCreatiom.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(applicationCreatiom.getStageEndDate())) {
					endDate = applicationCreatiom.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Application Submission/Creation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// -------------next stage
		FactoriesApplicationStage reviewPayment = null;

		try {
			reviewPayment = getFactories_By_CaseIdStageName(caseId, "Review/Assessment/Payment Validation");
		} catch (NoSuchFactoriesApplicationStageException e) {
		}
		if (Validator.isNotNull(reviewPayment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewPayment.getStageName());
			jsonObject.put("status", reviewPayment.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(reviewPayment.getStageStartDate())) {
				startDate = reviewPayment.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (reviewPayment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(reviewPayment.getStageEndDate())) {
					endDate = reviewPayment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review/Assessment/Payment Validation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// -------next stage
		FactoriesApplicationStage inspection = null;
		try {
			inspection = getFactories_By_CaseIdStageName(caseId, "Inspection");
		} catch (NoSuchFactoriesApplicationStageException e) {
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
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
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
		// -------next stage
		FactoriesApplicationStage registrationAssessment = null;
		try {
			registrationAssessment = getFactories_By_CaseIdStageName(caseId, "Registration Assessment/Decision");
		} catch (NoSuchFactoriesApplicationStageException e) {
		}
		if (Validator.isNotNull(registrationAssessment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", registrationAssessment.getStageName());
			jsonObject.put("status", registrationAssessment.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(registrationAssessment.getStageStartDate())) {
				startDate = registrationAssessment.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (registrationAssessment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(registrationAssessment.getStageEndDate())) {
					endDate = registrationAssessment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Registration Assessment/Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// -------next stage
		FactoriesApplicationStage certiOfRegis = null;
		try {
			certiOfRegis = getFactories_By_CaseIdStageName(caseId, "Certificate of Registration Issued");
		} catch (NoSuchFactoriesApplicationStageException e) {
		}
		if (Validator.isNotNull(certiOfRegis)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certiOfRegis.getStageName());
			jsonObject.put("status", certiOfRegis.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(certiOfRegis.getStageStartDate())) {
				startDate = certiOfRegis.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (certiOfRegis.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(certiOfRegis.getStageEndDate())) {
					endDate = certiOfRegis.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Certificate of Registration Issued");
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