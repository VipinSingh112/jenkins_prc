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

package com.npm.cannabis.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationsTable;
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationStagesException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStagesTable;
import com.npm.cannabis.application.stages.services.service.base.CannabisApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisApplicationStages", service = AopService.class)
public class CannabisApplicationStagesLocalServiceImpl extends CannabisApplicationStagesLocalServiceBaseImpl {
	Log _log = LogFactoryUtil.getLog(CannabisApplicationStagesLocalServiceImpl.class.getName());
	public CannabisApplicationStages getCannabisApplicationStage(String caseId, String stageName)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	public CannabisApplicationStages getCannabisApplicationStage(String caseId, String stageName, String stageStatus)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	public List<CannabisApplicationStages> getCannabisApplicationStages(String caseId)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_CaseId(caseId);
	}

	public CannabisApplicationStages getCannabisApplicationStagesAndStatus(String caseId, String stageStatus)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_CaseIdAndStatus(caseId, stageStatus);
	}
	public List<CannabisApplicationStages> getCannabisApplicationStageName(String stageName)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_StageName(stageName);
	}
	public List<CannabisApplicationStages> getCAS_StageName_StageStatus(String stageName,String status)
			throws NoSuchCannabisApplicationStagesException {
		return cannabisApplicationStagesPersistence.findBygetCAS_StageName_StageStatus(stageName,status);
	}
	
	public List<String> getCannabisDistinctStages(){
		
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(CannabisApplicationStagesTable.INSTANCE.stageName).from(CannabisApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getCannabisSeenCases() {
		DSLQuery query  = DSLQueryFactoryUtil.count().from(CannabisApplicationStagesTable.INSTANCE).where(CannabisApplicationStagesTable.INSTANCE.stageName.eq("Review and Verification").
						  and(CannabisApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil.select(CannabisApplicationsTable.INSTANCE.caseId).from(CannabisApplicationsTable.INSTANCE).where(CannabisApplicationsTable.INSTANCE.status.eq(0).and(CannabisApplicationsTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public CannabisApplicationStages updateCannabisApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus)
			throws NoSuchCannabisApplicationStagesException {
		CannabisApplicationStages cannabisApplicationStages = null;
		try {
			cannabisApplicationStages = cannabisApplicationStagesPersistence.findBygetCAS_CaseIdStageName(caseId,
					stageName);
		} catch (NoSuchCannabisApplicationStagesException e) {
			e.printStackTrace();
		}

		if (Validator.isNotNull(cannabisApplicationStages)) {
			//cannabisApplicationStages.setStageStartDate(stageStartDate);
			cannabisApplicationStages.setStageEndDate(stageEndDate);
			cannabisApplicationStages.setStageStatus(stageStatus);
			cannabisApplicationStages.setDuration(duration);
			cannabisApplicationStages.setModifiedDate(new Date());
			cannabisApplicationStagesPersistence.update(cannabisApplicationStages);
		} else {
			cannabisApplicationStages = createCannabisApplicationStages(
					CounterLocalServiceUtil.increment(CannabisApplicationStages.class.getName()));
			cannabisApplicationStages.setStageName(stageName);
			cannabisApplicationStages.setStageStartDate(stageStartDate);
			cannabisApplicationStages.setStageEndDate(stageEndDate);
			cannabisApplicationStages.setStageStatus(stageStatus);
			cannabisApplicationStages.setCaseId(caseId);
			cannabisApplicationStages.setDuration(duration);
			cannabisApplicationStages.setCreateDate(new Date());
			cannabisApplicationStagesPersistence.update(cannabisApplicationStages);
		}

		return cannabisApplicationStages;
	}

	public String getCannabisCurrentStages(String caseId) throws NoSuchCannabisApplicationStagesException {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		CannabisApplicationStages reviewStage = null;
		try {
			reviewStage = getCannabisApplicationStage(caseId, "Review and Verification");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(reviewStage.getStageStartDate())) {
			startDate = reviewStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			Date endDate = new Date();
			if (reviewStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(reviewStage.getStageEndDate())) {
					endDate = reviewStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Review and Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		CannabisApplicationStages ddStage = null;
		try {
			ddStage = getCannabisApplicationStage(caseId, "Due Diligence");
		} catch (Exception e) {

		}
		if (Validator.isNotNull(ddStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", ddStage.getStageName());
			jsonObject.put("status", ddStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(ddStage.getStageStartDate())) {
				startDate = ddStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				startDate = ddStage.getStageStartDate();
			}
			Date endDate = new Date();
			if (ddStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(ddStage.getStageEndDate())) {
					endDate = ddStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
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
		CannabisApplicationStages caStage = null;
		try {
			caStage = getCannabisApplicationStage(caseId, "Conditional Approval");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(caStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", caStage.getStageName());
			jsonObject.put("status", caStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(caStage.getStageStartDate())) {
				startDate = caStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (caStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(caStage.getStageEndDate())) {
					endDate = caStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Conditional Approval");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		CannabisApplicationStages inspectionStage = null;
		try {
			inspectionStage = getCannabisApplicationStage(caseId, "Inspection Date");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(inspectionStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspectionStage.getStageName());
			jsonObject.put("status", inspectionStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(inspectionStage.getStageStartDate())) {
				startDate = inspectionStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (inspectionStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(inspectionStage.getStageEndDate())) {
					endDate = inspectionStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Inspection Date");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		CannabisApplicationStages cLAStage = null;
		try {
			cLAStage = getCannabisApplicationStage(caseId, "CLA Decision");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(cLAStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", cLAStage.getStageName());
			jsonObject.put("status", cLAStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(cLAStage.getStageStartDate())) {
				startDate = cLAStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (cLAStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(cLAStage.getStageEndDate())) {
					endDate = cLAStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "CLA Decision");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		CannabisApplicationStages lFPStage = null;
		try {
			lFPStage = getCannabisApplicationStage(caseId, "Licence Fee Payment");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(lFPStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", lFPStage.getStageName());
			jsonObject.put("status", lFPStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(lFPStage.getStageStartDate())) {
				startDate = lFPStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (lFPStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(lFPStage.getStageEndDate())) {
					endDate = lFPStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Licence Fee Payment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		CannabisApplicationStages lIMStage = null;
		try {
			lIMStage = getCannabisApplicationStage(caseId, "Licence Issuance");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(lIMStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", lIMStage.getStageName());
			jsonObject.put("status", lIMStage.getStageStatus());
			Date startDate = new  Date();
			if(Validator.isNotNull(lIMStage.getStageStartDate())) {
				startDate = lIMStage.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (lIMStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull( lIMStage.getStageEndDate())) {
					endDate = lIMStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
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
		_log.debug("Stage JSON-------------------"+stages.toString());
		return stages.toString();

	}

	private String calculateWeeks(Date startDate, Date endDate) {
		   Calendar cal = new GregorianCalendar();
	        cal.setTime(startDate);
	        long dateBeforeInMs = startDate.getTime();
	        long dateAfterInMs = endDate.getTime();
	        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
	        long week=0;
	        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
	        if(daysDiff>6) {
	        week=daysDiff/7;
	        return week+" Week";
	        }else {
	        	return daysDiff+" days";
	        }
	}
}