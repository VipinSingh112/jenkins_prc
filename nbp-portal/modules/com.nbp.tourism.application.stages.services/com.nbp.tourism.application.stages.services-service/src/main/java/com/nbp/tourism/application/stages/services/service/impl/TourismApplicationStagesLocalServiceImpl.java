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

package com.nbp.tourism.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.tourism.application.form.services.model.TourismApplicationTable;
import com.nbp.tourism.application.stages.services.exception.NoSuchTourismApplicationStagesException;
import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;
import com.nbp.tourism.application.stages.services.model.TourismApplicationStagesTable;
import com.nbp.tourism.application.stages.services.service.base.TourismApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.tourism.application.stages.services.model.TourismApplicationStages", service = AopService.class)
public class TourismApplicationStagesLocalServiceImpl extends TourismApplicationStagesLocalServiceBaseImpl {

	public TourismApplicationStages getTAS_TAI(long tourismApplicationId)
			throws NoSuchTourismApplicationStagesException {
		return tourismApplicationStagesPersistence.findBygetTAS_TAI(tourismApplicationId);
	}

	public TourismApplicationStages getTAS_CaseIdStageName(String caseId, String stageName)
			throws NoSuchTourismApplicationStagesException {
		return tourismApplicationStagesPersistence.findBygetTAS_CaseIdStageName(caseId, stageName);

	}

	public TourismApplicationStages getTAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus)
			throws NoSuchTourismApplicationStagesException {
		return tourismApplicationStagesPersistence.findBygetTAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public TourismApplicationStages getTAS_CaseIdAndStatus(String caseId, String stageStatus)
			throws NoSuchTourismApplicationStagesException {
		return tourismApplicationStagesPersistence.findBygetTAS_CaseIdAndStatus(caseId, stageStatus);

	}

	public List<TourismApplicationStages> getTAS_CaseId(String caseId) {
		return tourismApplicationStagesPersistence.findBygetTAS_CaseId(caseId);

	}

	public List<TourismApplicationStages> getTourismApplicationsList_By_SN(String stageName) {
		return tourismApplicationStagesPersistence.findBygetTAS_StageName(stageName);
	}

	public List<TourismApplicationStages> getTourismApplicationsList_By_SN_SS(String stageName, String status) {
		return tourismApplicationStagesPersistence.findBygetTAS_SNAndSS(stageName, status);
	}

	public List<String> gettourismDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(TourismApplicationStagesTable.INSTANCE.stageName)
				.from(TourismApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}

	public Long getTourismSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(TourismApplicationStagesTable.INSTANCE)
				.where(TourismApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(TourismApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(TourismApplicationTable.INSTANCE.caseId).from(TourismApplicationTable.INSTANCE)
								.where(TourismApplicationTable.INSTANCE.status.eq(0)
										.and(TourismApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public TourismApplicationStages updateTourismApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		TourismApplicationStages tourismApplicationStages = null;
		tourismApplicationStages = tourismApplicationStagesPersistence.fetchBygetTAS_CaseIdStageName(caseId, stageName);

		if (Validator.isNotNull(tourismApplicationStages)) {
			// tourismApplicationStages.setStageStartDate(stageStartDate);
			tourismApplicationStages.setStageEndDate(stageEndDate);
			tourismApplicationStages.setStageStatus(stageStatus);
			tourismApplicationStages.setDuration(duration);
			tourismApplicationStages.setModifiedDate(new Date());
			tourismApplicationStagesPersistence.update(tourismApplicationStages);
		} else {
			tourismApplicationStages = createTourismApplicationStages(
					CounterLocalServiceUtil.increment(TourismApplicationStages.class.getName()));
			tourismApplicationStages.setStageName(stageName);
			tourismApplicationStages.setStageStartDate(stageStartDate);
			tourismApplicationStages.setStageEndDate(stageEndDate);
			tourismApplicationStages.setStageStatus(stageStatus);
			tourismApplicationStages.setCaseId(caseId);
			tourismApplicationStages.setDuration(duration);
			tourismApplicationStages.setCreateDate(new Date());
			tourismApplicationStagesPersistence.update(tourismApplicationStages);
		}
		return tourismApplicationStages;
	}

	public String getTourismCurrentStages(String caseId) throws NoSuchTourismApplicationStagesException {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		TourismApplicationStages dataVerification = null;
		try {
			dataVerification = getTAS_CaseIdStageName(caseId, "Data Verification");
		} catch (Exception e) {

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
		
//		TourismApplicationStages referralToJCA = null;
//		try {
//			referralToJCA = getTAS_CaseIdStageName(caseId, "Referral to JCA");
//		} catch (Exception e) {
//
//		}
//		if (Validator.isNotNull(referralToJCA)) {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", referralToJCA.getStageName());
//			jsonObject.put("status", referralToJCA.getStageStatus());
//			Date startDate = new Date();
//			if (Validator.isNotNull(referralToJCA.getStageStartDate())) {
//				startDate = referralToJCA.getStageStartDate();
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			} else {
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			}
//			Date endDate = new Date();
//			if (referralToJCA.getStageStatus().equals("Closed")) {
//				if (Validator.isNotNull(referralToJCA.getStageEndDate())) {
//					endDate = referralToJCA.getStageEndDate();
//				}
//				jsonObject.put("endDate", bpmDateFormat.format(endDate));
//			} else {
//				jsonObject.put("endDate", "");
//			}
//			jsonObject.put("duration", calculateWeeks(startDate, endDate));
//			stages.put(jsonObject);
//		} else {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", "Referral to JCA");
//			jsonObject.put("status", "");
//			jsonObject.put("duration", "");
//			jsonObject.put("startDate", "");
//			jsonObject.put("endDate", "");
//
//			stages.put(jsonObject);
//		}
//		TourismApplicationStages JCARecommendations = null;
//		try {
//			JCARecommendations = getTAS_CaseIdStageName(caseId, "JCA Recommendations");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		if (Validator.isNotNull(JCARecommendations)) {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", JCARecommendations.getStageName());
//			jsonObject.put("status", JCARecommendations.getStageStatus());
//			Date startDate = new Date();
//			if (Validator.isNotNull(JCARecommendations.getStageStartDate())) {
//				startDate = JCARecommendations.getStageStartDate();
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			} else {
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			}
//			Date endDate = new Date();
//			if (JCARecommendations.getStageStatus().equals("Closed")) {
//				if (Validator.isNotNull(JCARecommendations.getStageEndDate())) {
//					endDate = JCARecommendations.getStageEndDate();
//				}
//				jsonObject.put("endDate", bpmDateFormat.format(endDate));
//			} else {
//				jsonObject.put("endDate", "");
//			}
//			jsonObject.put("duration", calculateWeeks(startDate, endDate));
//			stages.put(jsonObject);
//		} else {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", "JCA Recommendations");
//			jsonObject.put("status", "");
//			jsonObject.put("duration", "");
//			jsonObject.put("startDate", "");
//			jsonObject.put("endDate", "");
//			stages.put(jsonObject);
//		}
		
		TourismApplicationStages issuanceOfPermit = null;
		try {
			issuanceOfPermit = getTAS_CaseIdStageName(caseId,
					"Issuance of Permit(Exemption Certificate) or Refusal Letter");
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

	@Override
	public TourismApplicationStages getTourismAppStages_By_SN(String stageName)
			throws NoSuchTourismApplicationStagesException {
		// TODO Auto-generated method stub
		return null;
	}
}