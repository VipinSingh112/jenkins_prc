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

package com.nbp.agriculture.stages.services.service.impl;

import com.agriculture.application.form.service.model.AgricultureApplicationTable;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureApplicationStagesException;
import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;
import com.nbp.agriculture.stages.services.model.AgricultureApplicationStagesTable;
import com.nbp.agriculture.stages.services.service.base.AgricultureApplicationStagesLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.agriculture.stages.services.model.AgricultureApplicationStages",
	service = AopService.class
)
public class AgricultureApplicationStagesLocalServiceImpl
	extends AgricultureApplicationStagesLocalServiceBaseImpl {
	
	public AgricultureApplicationStages getAgricultureApplicationStages(String caseId,String stageName) throws NoSuchAgricultureApplicationStagesException {
		return agricultureApplicationStagesPersistence.findByAAS_CaseIdStageName(caseId, stageName);
	}
	public AgricultureApplicationStages getAgricultureApplicationStagesBY_SN_SS_CI(String caseId,String stageName,String stageStatus) throws NoSuchAgricultureApplicationStagesException {
		return agricultureApplicationStagesPersistence.findByAAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}
	public AgricultureApplicationStages getAgricultureApplicationCaseIdStatus(String caseId,String status) throws NoSuchAgricultureApplicationStagesException {
		return agricultureApplicationStagesPersistence.findByAAS_CaseIdAndStatus(caseId, status);
	}
	public List<AgricultureApplicationStages> getAgricultureApplicationByCaseId(String caseId) throws NoSuchAgricultureApplicationStagesException {
		return agricultureApplicationStagesPersistence.findByAAS_CaseId(caseId);
	}
	public List<AgricultureApplicationStages> getAgricultureStagesBy_SN(String stageName){
		return agricultureApplicationStagesPersistence.findByAAS_StageName(stageName);
	}
	public List<AgricultureApplicationStages> getAgricultureStagesBy_SN_SS(String stageName,String status){
		return agricultureApplicationStagesPersistence.findBygetAgricultureBy_SN_SS(stageName,status);
	}
	public List<String> getAgricultureDistinctStages(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(AgricultureApplicationStagesTable.INSTANCE.stageName).from(AgricultureApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getAgricultureSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(AgricultureApplicationStagesTable.INSTANCE)
				.where(AgricultureApplicationStagesTable.INSTANCE.stageName.eq("Data Verification")
						.and(AgricultureApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil
								.select(AgricultureApplicationTable.INSTANCE.caseId).from(AgricultureApplicationTable.INSTANCE)
								.where(AgricultureApplicationTable.INSTANCE.status.eq(0)
										.and(AgricultureApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public AgricultureApplicationStages updateAgricultureStages(String caseId,String stageName, Date stageStartDate,Date stageEndDate, String duration,String stageStatus) {
		
		AgricultureApplicationStages agricultureApplicationStages =null;
		try {
			agricultureApplicationStages = getAgricultureApplicationStages(caseId,stageName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(Validator.isNotNull(agricultureApplicationStages)) {
			//agricultureApplicationStages.setStageStartDate(stageStartDate);
			agricultureApplicationStages.setStageEndDate(stageEndDate);
			agricultureApplicationStages.setStageStatus(stageStatus);
			agricultureApplicationStages.setDuration(duration);
			agricultureApplicationStages.setModifiedDate(new Date());
			agricultureApplicationStages.setCaseId(caseId);
			agricultureApplicationStagesPersistence.update(agricultureApplicationStages);
		}else {
			agricultureApplicationStages = createAgricultureApplicationStages(CounterLocalServiceUtil.increment(AgricultureApplicationStages.class.getName()));
			agricultureApplicationStages.setStageStartDate(stageStartDate);
			agricultureApplicationStages.setStageEndDate(stageEndDate);
			agricultureApplicationStages.setStageStatus(stageStatus);
			agricultureApplicationStages.setDuration(duration);
			agricultureApplicationStages.setCreateDate(new Date());
			agricultureApplicationStages.setCaseId(caseId);
			agricultureApplicationStages.setStageName(stageName);
			agricultureApplicationStagesPersistence.update(agricultureApplicationStages);
			
		}
		return agricultureApplicationStages;
	}
	
	public String getAgricultureApplicationCurrentStages(String caseId)  {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		AgricultureApplicationStages reviewStage =null;
		try {
			 reviewStage =  getAgricultureApplicationStages(caseId, "Data Verification");
		}catch(Exception e) {
			
		}
		if(Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(reviewStage.getStageStartDate())) {
			startDate = reviewStage.getStageStartDate();
			jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(reviewStage.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(reviewStage.getStageEndDate())) {
					endDate = reviewStage.getStageEndDate();
				}
				jsonObject.put("endDate",bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate","");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Data Verification");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		AgricultureApplicationStages inspectionRada =null;
		try {
			inspectionRada =  getAgricultureApplicationStages(caseId, "Inspection (RADA)");
		}catch(Exception e) {
			
		}
		if(Validator.isNotNull(inspectionRada)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspectionRada.getStageName());
			jsonObject.put("status", inspectionRada.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(inspectionRada.getStageStartDate())) {
			startDate = inspectionRada.getStageStartDate();
			jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(inspectionRada.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(inspectionRada.getStageEndDate())) {
					endDate = inspectionRada.getStageEndDate();
				}
				jsonObject.put("endDate",bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate","");
			}
			
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Inspection (RADA)");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		AgricultureApplicationStages ddStage = null;
		try {
			 ddStage =  getAgricultureApplicationStages(caseId, "Referral to JCA");
		}catch(Exception e) {
			
		}
		if(Validator.isNotNull(ddStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", ddStage.getStageName());
			jsonObject.put("status", ddStage.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(ddStage.getStageStartDate())) {
				startDate = ddStage.getStageStartDate();
			jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(ddStage.getStageStatus().equals("Closed")) {
				
				if(Validator.isNotNull(ddStage.getStageEndDate())) {
					endDate = ddStage.getStageEndDate();
				}
				jsonObject.put("endDate",bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate","");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Referral to JCA");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
	
		AgricultureApplicationStages inspectionStage =  null;
		try {
			inspectionStage =  getAgricultureApplicationStages(caseId, "JCA Recommendations");
		}catch (Exception e) {
			
		}
		if(Validator.isNotNull(inspectionStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspectionStage.getStageName());
			jsonObject.put("status", inspectionStage.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(inspectionStage.getStageStartDate())) {
				startDate = inspectionStage.getStageStartDate();
			jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(inspectionStage.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(inspectionStage.getStageEndDate())) {
					endDate = inspectionStage.getStageEndDate();
				}
				jsonObject.put("endDate",bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate","");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","JCA Recommendations");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		
		AgricultureApplicationStages issuancePermit =  null;
		try {
			issuancePermit =  getAgricultureApplicationStages(caseId, "Issuance of Permit(Exemption Certificate) or Refusal Letter");
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(issuancePermit)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", issuancePermit.getStageName());
			jsonObject.put("status", issuancePermit.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull( issuancePermit.getStageStartDate())) {
				startDate = issuancePermit.getStageStartDate();
			jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(issuancePermit.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(issuancePermit.getStageEndDate())) {
					endDate = issuancePermit.getStageEndDate();
				}
				jsonObject.put("endDate",bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate","");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Issuance of Permit(Exemption Certificate) or Refusal Letter");
			jsonObject.put("status","");
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