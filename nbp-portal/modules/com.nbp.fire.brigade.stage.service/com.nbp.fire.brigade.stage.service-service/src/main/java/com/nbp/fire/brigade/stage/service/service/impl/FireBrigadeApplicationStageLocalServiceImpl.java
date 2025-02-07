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

package com.nbp.fire.brigade.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplicationTable;
import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeApplicationStageException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStageTable;
import com.nbp.fire.brigade.stage.service.service.base.FireBrigadeApplicationStageLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage",
	service = AopService.class
)
public class FireBrigadeApplicationStageLocalServiceImpl
	extends FireBrigadeApplicationStageLocalServiceBaseImpl {
	public List<FireBrigadeApplicationStage> getFireBrigadeByCaseId(String caseId) {
		return fireBrigadeApplicationStagePersistence.findByget_FB_AppStage_By_CI(caseId);
	}
	public FireBrigadeApplicationStage getFireBrigadeByCI(String caseId) throws NoSuchFireBrigadeApplicationStageException {
		return fireBrigadeApplicationStagePersistence.findByget_FB_AppStage_CI(caseId);
	}
	public List<FireBrigadeApplicationStage> getFireBrigade_BySN(String stageName) {
		return fireBrigadeApplicationStagePersistence.findByget_FB_By_SN(stageName);
	}
	public FireBrigadeApplicationStage getFireBrigade_By_StageStatus(String stageStatus) throws NoSuchFireBrigadeApplicationStageException {
		return fireBrigadeApplicationStagePersistence.findByget_FB_By_Status(stageStatus);
	}
	public FireBrigadeApplicationStage getFireBrigade_ByCI_SN(String caseId, String stageName) throws NoSuchFireBrigadeApplicationStageException {
		return fireBrigadeApplicationStagePersistence.findByget_FB_By_CI_SN(caseId, stageName);
	}
	public FireBrigadeApplicationStage getFireBrigade_ByCI_SN_SS(String caseId, String stageName, String stageStatus) throws NoSuchFireBrigadeApplicationStageException {
		return fireBrigadeApplicationStagePersistence.findByget_FB_By_CI_SN_SS(caseId, stageName, stageStatus);
	}
	public FireBrigadeApplicationStage getFireBrigade_ByCI_SS(String caseId, String stageStatus) throws NoSuchFireBrigadeApplicationStageException {
		return fireBrigadeApplicationStagePersistence.findByget_FB_By_CI_SS(caseId, stageStatus);
	}
	public List<String> getFBDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(FireBrigadeApplicationStageTable.INSTANCE.stageName)
				.from(FireBrigadeApplicationStageTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getFBSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(FireBrigadeApplicationStageTable.INSTANCE)
				.where(FireBrigadeApplicationStageTable.INSTANCE.stageName.eq("Review and Assignment")
						.and(FireBrigadeApplicationStageTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(FireBrigadeApplicationTable.INSTANCE.caseId)
										.from(FireBrigadeApplicationTable.INSTANCE).where(FireBrigadeApplicationTable.INSTANCE.status
												.eq(0).and(FireBrigadeApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}

	public FireBrigadeApplicationStage updateFireBrigadeAppStage(String caseId, String stageName, String stageStatus, Date stageStartDate, Date stageEndDate, String duration) {
		FireBrigadeApplicationStage fireBrigadeApplicationStage=null;
		try {
			fireBrigadeApplicationStage=fireBrigadeApplicationStagePersistence.findByget_FB_By_CI_SN(caseId, stageName);
		} catch (Exception e) {
		}
		if(Validator.isNotNull(fireBrigadeApplicationStage)) {
			fireBrigadeApplicationStage.setStageStartDate(stageStartDate);
			fireBrigadeApplicationStage.setStageEndDate(stageEndDate);
			fireBrigadeApplicationStage.setDuration(duration);
			fireBrigadeApplicationStage.setStageStatus(stageStatus);
			fireBrigadeApplicationStagePersistence.update(fireBrigadeApplicationStage);
		}else {
			fireBrigadeApplicationStage=createFireBrigadeApplicationStage(CounterLocalServiceUtil.increment(FireBrigadeApplicationStage.class.getName()));
			fireBrigadeApplicationStage.setStageStartDate(stageStartDate);
			fireBrigadeApplicationStage.setStageEndDate(stageEndDate);
			fireBrigadeApplicationStage.setDuration(duration);
			fireBrigadeApplicationStage.setStageStatus(stageStatus);
			fireBrigadeApplicationStage.setCaseId(caseId);
			fireBrigadeApplicationStage.setStageName(stageName);
			fireBrigadeApplicationStage.setCreateDate(new Date());
			fireBrigadeApplicationStagePersistence.update(fireBrigadeApplicationStage);
		}
		return fireBrigadeApplicationStage;
	}
	public String getFireBrigadeCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateForat = new SimpleDateFormat("dd//MM//yyyy");
		FireBrigadeApplicationStage reviewAssignment =null;
		
		try {
			reviewAssignment= getFireBrigade_ByCI_SN(caseId, "Review and Assignment");
		} catch (NoSuchFireBrigadeApplicationStageException e) {
		}
		if(Validator.isNotNull(reviewAssignment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewAssignment.getStageName());
			jsonObject.put("stageStatus", reviewAssignment.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(reviewAssignment.getStageStartDate())) {
				startDate = reviewAssignment.getStageStartDate();
					jsonObject.put("startDate",bpmDateForat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateForat.format(startDate));
				}
			Date endDate = new Date();
			if(reviewAssignment.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(reviewAssignment.getStageEndDate())) {
					endDate = reviewAssignment.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			}else {	
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Review and Assignment");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		//------------------------NEXT STAGE------------------------------
		FireBrigadeApplicationStage inspection=null;
		try {
			inspection=getFireBrigade_ByCI_SN(caseId, "Inspection");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(inspection)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspection.getStageName());
			jsonObject.put("stageStatus", inspection.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(inspection.getStageStartDate())) {
				startDate = inspection.getStageStartDate();
					jsonObject.put("startDate",bpmDateForat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateForat.format(startDate));
				}
			Date endDate = new Date();
			if(inspection.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(inspection.getStageEndDate())) {
					endDate = inspection.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			}else {	
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Inspection");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		//------------------------NEXT STAGE------------------------------
		FireBrigadeApplicationStage adjustment=null;
		try {
			adjustment=getFireBrigade_ByCI_SN(caseId, "Adjustment");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(adjustment)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", adjustment.getStageName());
			jsonObject.put("stageStatus", adjustment.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(adjustment.getStageStartDate())) {
				startDate = adjustment.getStageStartDate();
				jsonObject.put("startDate",bpmDateForat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if(adjustment.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(adjustment.getStageEndDate())) {
					endDate = adjustment.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			}else {	
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Adjustment");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		//------------------------NEXT STAGE------------------------------
		FireBrigadeApplicationStage generateCertificate=null;
		try {
			generateCertificate=getFireBrigade_ByCI_SN(caseId, "Generate Certificate");
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(generateCertificate)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", generateCertificate.getStageName());
			jsonObject.put("stageStatus", generateCertificate.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(generateCertificate.getStageStartDate())) {
				startDate = generateCertificate.getStageStartDate();
				jsonObject.put("startDate",bpmDateForat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateForat.format(startDate));
			}
			Date endDate = new Date();
			if(generateCertificate.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(generateCertificate.getStageEndDate())) {
					endDate = generateCertificate.getStageEndDate();
					jsonObject.put("endDate", bpmDateForat.format(endDate));
				}
			}else {	
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Generate Certificate");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
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
	