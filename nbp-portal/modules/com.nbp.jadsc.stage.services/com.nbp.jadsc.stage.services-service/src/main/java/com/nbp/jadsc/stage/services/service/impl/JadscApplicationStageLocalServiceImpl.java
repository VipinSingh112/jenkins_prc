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

package com.nbp.jadsc.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.application.form.service.model.JADSCApplicationTable;
import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationStageException;
import com.nbp.jadsc.stage.services.model.JadscApplicationStage;
import com.nbp.jadsc.stage.services.model.JadscApplicationStageTable;
import com.nbp.jadsc.stage.services.service.base.JadscApplicationStageLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscApplicationStage",
	service = AopService.class
)
public class JadscApplicationStageLocalServiceImpl
	extends JadscApplicationStageLocalServiceBaseImpl {

	public JadscApplicationStage getJadscByCI_SN(String caseId, String stageName)
			throws NoSuchJadscApplicationStageException {
		return jadscApplicationStagePersistence.findBygetJadsc_By_CaseIdStageName(caseId, stageName);
	}

	public JadscApplicationStage getJadscByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchJadscApplicationStageException {
		return jadscApplicationStagePersistence.findBygetJadsc_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<JadscApplicationStage> getJadscByCI(String caseId) throws NoSuchJadscApplicationStageException {
		return jadscApplicationStagePersistence.findBygetJadsc_By_CaseId(caseId);
	}
	public JadscApplicationStage getJadscBy_CI(String caseId) throws NoSuchJadscApplicationStageException {
		return jadscApplicationStagePersistence.findBygetJadsc_ByCaseId(caseId);
	}

	public JadscApplicationStage getJadscByCI_ST(String caseId, String stageStatus)
			throws NoSuchJadscApplicationStageException {
		return jadscApplicationStagePersistence.findBygetJadsc_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<JadscApplicationStage> gtJadscApplicationStage_By_SN(String stageName) {
		return jadscApplicationStagePersistence.findBygetJadsc_By_StageName(stageName);
	}
	public List<String> getJadscDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(JadscApplicationStageTable.INSTANCE.stageName)
				.from(JadscApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getJadscSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(JadscApplicationStageTable.INSTANCE)
				.where(JadscApplicationStageTable.INSTANCE.stageName.eq("Review Validation")
						.and(JadscApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(JADSCApplicationTable.INSTANCE.caseId)
										.from(JADSCApplicationTable.INSTANCE).where(JADSCApplicationTable.INSTANCE.status
												.eq(0).and(JADSCApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}


	public JadscApplicationStage updateJadscApplicationStage(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		JadscApplicationStage JadscApplicationStage = null;

		try {
			JadscApplicationStage = getJadscByCI_SN(caseId, stageName);
		} catch (NoSuchJadscApplicationStageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(JadscApplicationStage)) {
			// JadscApplicationStage.setStageStartDate(stageStartDate);
			JadscApplicationStage.setStageEndDate(stageEndDate);
			JadscApplicationStage.setStageStatus(stageStatus);
			JadscApplicationStage.setDuration(duration);
			JadscApplicationStage.setModifiedDate(new Date());
			JadscApplicationStage.setCaseId(caseId);
			jadscApplicationStagePersistence.update(JadscApplicationStage);
		} else {
			JadscApplicationStage = createJadscApplicationStage(
					CounterLocalServiceUtil.increment(JadscApplicationStage.class.getName()));
			JadscApplicationStage.setStageName(stageName);
			JadscApplicationStage.setStageStartDate(stageStartDate);
			JadscApplicationStage.setStageEndDate(stageEndDate);
			JadscApplicationStage.setStageStatus(stageStatus);
			JadscApplicationStage.setDuration(duration);
			JadscApplicationStage.setCreateDate(new Date());
			JadscApplicationStage.setCaseId(caseId);
			jadscApplicationStagePersistence.update(JadscApplicationStage);
		}
		return JadscApplicationStage;
	}

	public String getJadscApplicationCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
//		JadscApplicationStage applicationSubmission = null;
//		try {
//			applicationSubmission = getJadscByCI_SN(caseId, "Application Submission");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//		}
//		if (Validator.isNotNull(applicationSubmission)) {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", applicationSubmission.getStageName());
//			jsonObject.put("status", applicationSubmission.getStageStatus());
//			Date startDate = new Date();
//			if (Validator.isNotNull(applicationSubmission.getStageStartDate())) {
//				startDate = applicationSubmission.getStageStartDate();
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			} else {
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			}
//			Date endDate = new Date();
//			if (applicationSubmission.getStageStatus().equals("Closed")) {
//				if (Validator.isNotNull(applicationSubmission.getStageEndDate())) {
//					endDate = applicationSubmission.getStageEndDate();
//				}
//				jsonObject.put("endDate", bpmDateFormat.format(endDate));
//			} else {
//				jsonObject.put("endDate", "");
//			}
//			jsonObject.put("duration", calculateWeeks(startDate, endDate));
//			stages.put(jsonObject);
//		} else {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", "Application Submission");
//			jsonObject.put("status", "");
//			jsonObject.put("duration", "");
//			jsonObject.put("startDate", "");
//			jsonObject.put("endDate", "");
//			stages.put(jsonObject);
//		}

		// --------next stage
		JadscApplicationStage review = null;
		try {
			review = getJadscByCI_SN(caseId, "Review Validation");
		} catch (NoSuchJadscApplicationStageException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(review)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review & Validation");
			jsonObject.put("status", review.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(review.getStageStartDate())) {
				startDate = review.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (review.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(review.getStageEndDate())) {
					endDate = review.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review & Validation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		JadscApplicationStage validation = null;

		try {
			validation = getJadscByCI_SN(caseId, "Pre Initiation");
		} catch (NoSuchJadscApplicationStageException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(validation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Pre-Initiation");
			jsonObject.put("status", validation.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(validation.getStageStartDate())) {
				startDate = validation.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (validation.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(validation.getStageEndDate())) {
					endDate = validation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Pre-Initiation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JadscApplicationStage initiateInvest = null;
		try {
			initiateInvest = getJadscByCI_SN(caseId, "Initiate Investigation");
		} catch (NoSuchJadscApplicationStageException e) {
		}
		if (Validator.isNotNull(initiateInvest)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", initiateInvest.getStageName());
			jsonObject.put("status", initiateInvest.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(initiateInvest.getStageStartDate())) {
				startDate = initiateInvest.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (initiateInvest.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(initiateInvest.getStageEndDate())) {
					endDate = initiateInvest.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Initiate Investigation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		JadscApplicationStage preliminaryDetermination = null;
		try {
			preliminaryDetermination = getJadscByCI_SN(caseId, "Preliminary Determination");
		} catch (NoSuchJadscApplicationStageException e) {
		}
		if (Validator.isNotNull(preliminaryDetermination)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", preliminaryDetermination.getStageName());
			jsonObject.put("status", preliminaryDetermination.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(preliminaryDetermination.getStageStartDate())) {
				startDate = preliminaryDetermination.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (preliminaryDetermination.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(preliminaryDetermination.getStageEndDate())) {
					endDate = preliminaryDetermination.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Preliminary Determination");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		// --------next stage
				JadscApplicationStage finalDetermination = null;
				try {
					finalDetermination = getJadscByCI_SN(caseId, "Final Determination");
				} catch (NoSuchJadscApplicationStageException e) {
				}
				if (Validator.isNotNull(finalDetermination)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", finalDetermination.getStageName());
					jsonObject.put("status", finalDetermination.getStageStatus());
					Date startDate = new Date();
					;
					if (Validator.isNotNull(finalDetermination.getStageStartDate())) {
						startDate = finalDetermination.getStageStartDate();
						jsonObject.put("startDate", bpmDateFormat.format(startDate));
					} else {
						jsonObject.put("startDate", bpmDateFormat.format(new Date()));
					}
					Date endDate = new Date();
					if (finalDetermination.getStageStatus().equals("Closed")) {
						if (Validator.isNotNull(finalDetermination.getStageEndDate())) {
							endDate = finalDetermination.getStageEndDate();
						}
						jsonObject.put("endDate", bpmDateFormat.format(endDate));
					} else {
						jsonObject.put("endDate", "");
					}
					jsonObject.put("duration", calculateWeeks(startDate, endDate));
					stages.put(jsonObject);
				} else {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", "Final Determination");
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