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

package com.nbp.wra.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.wra.application.form.service.model.WRAApplicationTable;
import com.nbp.wra.stage.service.exception.NoSuchWraApplicationStageException;
import com.nbp.wra.stage.service.model.WraApplicationStage;
import com.nbp.wra.stage.service.model.WraApplicationStageTable;
import com.nbp.wra.stage.service.service.base.WraApplicationStageLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.wra.stage.service.model.WraApplicationStage",
	service = AopService.class
)
public class WraApplicationStageLocalServiceImpl
	extends WraApplicationStageLocalServiceBaseImpl {

	public WraApplicationStage getWraByCI_SN(String caseId, String stageName)
			throws NoSuchWraApplicationStageException {
		return wraApplicationStagePersistence.findBygetWra_By_CaseIdStageName(caseId, stageName);
	}

	public WraApplicationStage getWraByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchWraApplicationStageException {
		return wraApplicationStagePersistence.findBygetWra_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<WraApplicationStage> getWraByCI(String caseId) throws NoSuchWraApplicationStageException {
		return wraApplicationStagePersistence.findBygetWra_By_CaseId(caseId);
	}

	public WraApplicationStage getWraByCI_ST(String caseId, String stageStatus)
			throws NoSuchWraApplicationStageException {
		return wraApplicationStagePersistence.findBygetWra_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<WraApplicationStage> gtWraApplicationStage_By_SN(String stageName) {
		return wraApplicationStagePersistence.findBygetWra_By_StageName(stageName);
	}
	public WraApplicationStage get_WRA_Stage_By_CI(String caseId) throws NoSuchWraApplicationStageException {
		return wraApplicationStagePersistence.findByget_Wra_By_CaseId(caseId);
	}
	public List<String> getWRADistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(WraApplicationStageTable.INSTANCE.stageName)
				.from(WraApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getWRASeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(WraApplicationStageTable.INSTANCE)
				.where(WraApplicationStageTable.INSTANCE.stageName.eq("Data Verification")
						.and(WraApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(WRAApplicationTable.INSTANCE.caseId)
										.from(WRAApplicationTable.INSTANCE).where(WRAApplicationTable.INSTANCE.status
												.eq(0).and(WRAApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public WraApplicationStage updateWraApplicationStage(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		WraApplicationStage WraApplicationStage = null;

		try {
			WraApplicationStage = getWraByCI_SN(caseId, stageName);
		} catch (NoSuchWraApplicationStageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(WraApplicationStage)) {
			// WraApplicationStage.setStageStartDate(stageStartDate);
			WraApplicationStage.setStageEndDate(stageEndDate);
			WraApplicationStage.setStageStatus(stageStatus);
			WraApplicationStage.setDuration(duration);
			WraApplicationStage.setModifiedDate(new Date());
			WraApplicationStage.setCaseId(caseId);
			wraApplicationStagePersistence.update(WraApplicationStage);
		} else {
			WraApplicationStage = createWraApplicationStage(
					CounterLocalServiceUtil.increment(WraApplicationStage.class.getName()));
			WraApplicationStage.setStageName(stageName);
			WraApplicationStage.setStageStartDate(stageStartDate);
			WraApplicationStage.setStageEndDate(stageEndDate);
			WraApplicationStage.setStageStatus(stageStatus);
			WraApplicationStage.setDuration(duration);
			WraApplicationStage.setCreateDate(new Date());
			WraApplicationStage.setCaseId(caseId);
			wraApplicationStagePersistence.update(WraApplicationStage);
		}
		return WraApplicationStage;
	}

	public String getWraApplicationCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		WraApplicationStage reviewPayment = null;
		try {
			reviewPayment = getWraByCI_SN(caseId, "Review Payment Validation");
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			jsonObject.put("stageName", "Review Payment Validation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		WraApplicationStage inspection = null;
		try {
			inspection = getWraByCI_SN(caseId, "Inspection");
		} catch (NoSuchWraApplicationStageException e) {
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
		WraApplicationStage dueDiligence = null;

		try {
			dueDiligence = getWraByCI_SN(caseId, "Due Diligence");
		} catch (NoSuchWraApplicationStageException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(dueDiligence)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", dueDiligence.getStageName());
			jsonObject.put("status", dueDiligence.getStageStatus());
			Date startDate = new Date();
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
		WraApplicationStage licenceIssuance = null;
		try {
			licenceIssuance = getWraByCI_SN(caseId, "Licence Permit Issuance");
		} catch (NoSuchWraApplicationStageException e) {
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
			jsonObject.put("stageName", "Licence Permit Issuance");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		WraApplicationStage certificateOfRegst = null;
		try {
			certificateOfRegst = getWraByCI_SN(caseId, "Certificate of Registration Issued");
		} catch (NoSuchWraApplicationStageException e) {
		}
		if (Validator.isNotNull(certificateOfRegst)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certificateOfRegst.getStageName());
			jsonObject.put("status", certificateOfRegst.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(certificateOfRegst.getStageStartDate())) {
				startDate = certificateOfRegst.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (certificateOfRegst.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(certificateOfRegst.getStageEndDate())) {
					endDate = certificateOfRegst.getStageEndDate();
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

	@Override
	public WraApplicationStage getWraApplicationStage_By_CI(String stageName) {
		// TODO Auto-generated method stub
		return null;
	}


}