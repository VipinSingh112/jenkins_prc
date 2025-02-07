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

package com.nbp.osi.services.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicationTable;
import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesStagesException;
import com.nbp.osi.services.stages.service.model.OSIServicesStages;
import com.nbp.osi.services.stages.service.model.OSIServicesStagesTable;
import com.nbp.osi.services.stages.service.service.base.OSIServicesStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.osi.services.stages.service.model.OSIServicesStages", service = AopService.class)
public class OSIServicesStagesLocalServiceImpl extends OSIServicesStagesLocalServiceBaseImpl {
	public OSIServicesStages getOSIServiceStagesBy_SI_SN(String caseId, String stageName) throws NoSuchOSIServicesStagesException {
		return osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, stageName);
	}
	public OSIServicesStages getOSIServiceStagesBy_SI_ST_SN(String caseId, String stageStatus,String stageName) throws NoSuchOSIServicesStagesException {
		return osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageStatus(caseId, stageStatus, stageName);
	}
	public List<OSIServicesStages> getOSI_Service_StageName(String stageName) {
		return osiServicesStagesPersistence.findBygetOSI_Service_StageName(stageName);
	}
	public List<OSIServicesStages> getOSIService_CaseId(String caseId) {
		return osiServicesStagesPersistence.findBygetOSI_Service_CaseId(caseId);
	}
	public OSIServicesStages getOSIService_By_CaseId(String caseId) throws NoSuchOSIServicesStagesException {
		return osiServicesStagesPersistence.findBygetOSI_Service_By_CaseId(caseId);
	}
	public Long getOSIServiceSeenCases(){
		DSLQuery query  = DSLQueryFactoryUtil.count().from(OSIServicesStagesTable.INSTANCE).where(OSIServicesStagesTable.INSTANCE.stageName.eq("Data Verification").
				and(OSIServicesStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil.select(OsiServicesApplicationTable.INSTANCE.caseId).from(OsiServicesApplicationTable.INSTANCE).where(OsiServicesApplicationTable.INSTANCE.status.eq(0).and(OsiServicesApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}	
	public List<String> getOSIServiceDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(OSIServicesStagesTable.INSTANCE.stageName)
				.from(OSIServicesStagesTable.INSTANCE);
		return dslQuery(query);
	}



	
	public OSIServicesStages updateOSIServicesStages(String caseId,String stageName, Date stageStartDate,Date stageEndDate, String duration,String stageStatus) throws NoSuchOSIServicesStagesException {
		OSIServicesStages osiServicesStages = null;
		try {
			osiServicesStages =	osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, stageName);
		}catch (NoSuchOSIServicesStagesException e) {
			e.printStackTrace();
		}
		
		if(Validator.isNotNull(osiServicesStages)) {
			//osiServicesStages.setStageStartDate(stageStartDate);
			osiServicesStages.setStageEndDate(stageEndDate);
			osiServicesStages.setStageStatus(stageStatus);
			osiServicesStages.setDuration(duration);
			osiServicesStages.setModifiedDate(new Date());
			osiServicesStagesPersistence.update(osiServicesStages);
		}else {
			osiServicesStages = osiServicesStagesPersistence.create(CounterLocalServiceUtil.increment(OSIServicesStages.class.getName()));
			osiServicesStages.setStageName(stageName);
			osiServicesStages.setStageStartDate(stageStartDate);
			osiServicesStages.setStageEndDate(stageEndDate);
			osiServicesStages.setStageStatus(stageStatus);
			osiServicesStages.setCaseId(caseId);
			osiServicesStages.setDuration(duration);
			osiServicesStages.setCreateDate(new Date());
			osiServicesStagesPersistence.update(osiServicesStages);
		}
		
		return osiServicesStages;
	}
	public String getOSIServicesCurrentStages(String caseId)  {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		OSIServicesStages reviewStage =null;
		try {
			 reviewStage =  osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, "Data Verification");
		}catch(Exception e) {
		}
		if(Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(  reviewStage.getStageStartDate())) {
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
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");

			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Data Verification");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		OSIServicesStages investigation = null;
		try {
			 investigation = osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, "Investigation");
		}catch(Exception e) {
		}
		if(Validator.isNotNull(investigation)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", investigation.getStageName());
			jsonObject.put("status", investigation.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(  investigation.getStageStartDate())) {
				startDate = investigation.getStageStartDate();
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}
			Date endDate = new Date();
			if(investigation.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(investigation.getStageEndDate())) {
					endDate = investigation.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");

			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Investigation");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		/*
		 * OSIServicesStages commiteeDecision = null; try { commiteeDecision =
		 * osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId,
		 * "Committee Decision"); }catch (Exception e) { // TODO: handle exception }
		 * if(Validator.isNotNull(commiteeDecision)) { JSONObject jsonObject =
		 * JSONFactoryUtil.createJSONObject(); jsonObject.put("stageName",
		 * commiteeDecision.getStageName()); jsonObject.put("status",
		 * commiteeDecision.getStageStatus()); Date startDate= new Date();
		 * if(Validator.isNotNull( commiteeDecision.getStageStartDate())) { startDate =
		 * commiteeDecision.getStageStartDate();
		 * jsonObject.put("startDate",bpmDateFormat.format(startDate)); }else {
		 * jsonObject.put("startDate",bpmDateFormat.format(startDate)); } Date endDate =
		 * new Date(); if(commiteeDecision.getStageStatus().equals("Closed")) {
		 * if(Validator.isNotNull(commiteeDecision.getStageEndDate())) { endDate =
		 * commiteeDecision.getStageEndDate(); } jsonObject.put("endDate",
		 * bpmDateFormat.format(endDate)); }else { jsonObject.put("endDate", ""); }
		 * jsonObject.put("duration",calculateWeeks(startDate, endDate));
		 * stages.put(jsonObject); }else { JSONObject jsonObject =
		 * JSONFactoryUtil.createJSONObject();
		 * jsonObject.put("stageName","Committee Decision");
		 * jsonObject.put("status",""); jsonObject.put("duration", "");
		 * jsonObject.put("startDate",""); jsonObject.put("endDate", "");
		 * stages.put(jsonObject); }
		 */
		OSIServicesStages superVisor =  null;
		try {
			 superVisor =  osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, "Supervisor Decision");
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(superVisor)) {
			
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", superVisor.getStageName());
			jsonObject.put("status", superVisor.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(  superVisor.getStageStartDate())) {
				startDate = superVisor.getStageStartDate();
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}
			Date endDate = new Date();
			if(superVisor.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(superVisor.getStageEndDate())) {
					endDate = superVisor.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Supervisor Decision");
			jsonObject.put("status","");
			jsonObject.put("duration", "");
			jsonObject.put("startDate","");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		OSIServicesStages certificateIssued =  null;
		try {
			 certificateIssued =  osiServicesStagesPersistence.findBygetOSI_Service_CaseIdStageName(caseId, "Certificate Issued");
		}catch (Exception e) {
			// TODO: handle exception
		}
		if(Validator.isNotNull(certificateIssued)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certificateIssued.getStageName());
			jsonObject.put("status", certificateIssued.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(  certificateIssued.getStageStartDate())) {
				startDate = certificateIssued.getStageStartDate();
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate",bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if(certificateIssued.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(certificateIssued.getStageEndDate())) {
					endDate = certificateIssued.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		}else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName","Certificate Issued");
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
	
	public List<OSIServicesStages> getOSI_Service_CaseId(String caseId) {
		return osiServicesStagesPersistence.findBygetOSI_Service_CaseId(caseId);
	}

	@Override
	public String getPharmaCurrentStages(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}
}