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

package com.nbp.creative.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.creative.application.form.service.model.CreativeApplicationTable;
import com.nbp.creative.stages.services.exception.NoSuchCreativeApplicationStagesException;
import com.nbp.creative.stages.services.model.CreativeApplicationStages;
import com.nbp.creative.stages.services.model.CreativeApplicationStagesTable;
import com.nbp.creative.stages.services.service.base.CreativeApplicationStagesLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.creative.stages.services.model.CreativeApplicationStages",
	service = AopService.class
)
public class CreativeApplicationStagesLocalServiceImpl
	extends CreativeApplicationStagesLocalServiceBaseImpl {
	public CreativeApplicationStages getCAS_CAI(long creativeApplicationId) throws NoSuchCreativeApplicationStagesException{
		return creativeApplicationStagesPersistence.findBygetCAS_CAI(creativeApplicationId);
	}
	public CreativeApplicationStages getCAS_CaseIdStageStatus(String caseId, String stageName, String stageStatus) throws NoSuchCreativeApplicationStagesException {
		return creativeApplicationStagesPersistence.findBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}
	
	public CreativeApplicationStages getCAS_CaseIdAndStatus(String caseId ,String stageStatus) throws NoSuchCreativeApplicationStagesException {
		return creativeApplicationStagesPersistence.findBygetCAS_CaseIdAndStatus(caseId, stageStatus);
	}
	 public CreativeApplicationStages getCAS_CaseIdStageName(String caseId,String stageName) throws NoSuchCreativeApplicationStagesException {
			return creativeApplicationStagesPersistence.fetchBygetCAS_CaseIdStageName(caseId, stageName);
		 }
	public List<CreativeApplicationStages> getCAS_CaseId(String caseId){
		return creativeApplicationStagesPersistence.findBygetCAS_CaseId(caseId);
	}
	public List<CreativeApplicationStages> getCAS_SNAndSS(String stageName,String status){
		return creativeApplicationStagesPersistence.findBygetCAS_SNAndSS(stageName,status);
	}
	public List<CreativeApplicationStages> getCAS_BY_SN(String stageName){
		return creativeApplicationStagesPersistence.findBygetCAS_StageName(stageName);
	}
	public Long getCreativeSeenCases() {
		DSLQuery query  = DSLQueryFactoryUtil.count().from(CreativeApplicationStagesTable.INSTANCE).where(CreativeApplicationStagesTable.INSTANCE.stageName.eq("Data Verification").
						  and(CreativeApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil.select(CreativeApplicationTable.INSTANCE.caseId).from(CreativeApplicationTable.INSTANCE).where(CreativeApplicationTable.INSTANCE.status.eq(0).and(CreativeApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	
	
	 public CreativeApplicationStages updateCreativeApplicationStages(String caseId,String stageName, Date stageStartDate,Date stageEndDate, String duration,String stageStatus) {
		 CreativeApplicationStages creativeApplicationStages =null;
		 creativeApplicationStages =  creativeApplicationStagesPersistence.fetchBygetCAS_CaseIdStageName(caseId, stageName);
		 
		 if(Validator.isNotNull(creativeApplicationStages)) {
			// tourismApplicationStages.setStageStartDate(stageStartDate);
			 creativeApplicationStages.setStageEndDate(stageEndDate);
			 creativeApplicationStages.setStageStatus(stageStatus);
			 creativeApplicationStages.setDuration(duration);
			 creativeApplicationStages.setModifiedDate(new Date());
			 creativeApplicationStagesPersistence.update(creativeApplicationStages);
			}else {
				creativeApplicationStages = createCreativeApplicationStages(CounterLocalServiceUtil.increment(CreativeApplicationStages.class.getName()));
				creativeApplicationStages.setStageName(stageName);
				creativeApplicationStages.setStageStartDate(stageStartDate);
				creativeApplicationStages.setStageEndDate(stageEndDate);
				creativeApplicationStages.setStageStatus(stageStatus);
				creativeApplicationStages.setCaseId(caseId);
				creativeApplicationStages.setDuration(duration);
				creativeApplicationStages.setCreateDate(new Date());
				creativeApplicationStagesPersistence.update(creativeApplicationStages);
			}
			return creativeApplicationStages;
		 }
			public String getCretiveCurrentStages(String caseId) throws NoSuchCreativeApplicationStagesException {
				JSONArray stages = JSONFactoryUtil.createJSONArray();
				DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
				CreativeApplicationStages dataVerification =null;
				try {
					dataVerification =  getCAS_CaseIdStageName(caseId, "Data Verification");
				}catch(Exception e) {
					
				}
				if(Validator.isNotNull(dataVerification)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", dataVerification.getStageName());
					jsonObject.put("status", dataVerification.getStageStatus());
					Date startDate =new Date();
					if(Validator.isNotNull(dataVerification.getStageStartDate())) {
					 startDate = dataVerification.getStageStartDate();
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}else {
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}
					Date endDate = new Date();
					if(dataVerification.getStageStatus().equals("Closed")) {
						if(Validator.isNotNull(dataVerification.getStageEndDate())) {
							endDate = dataVerification.getStageEndDate();
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
				CreativeApplicationStages inspection = null;
				try {
					inspection =  getCAS_CaseIdStageName(caseId, "Inspection ( Min and JAMPRO)");
				}catch(Exception e) {
					
				}
				if(Validator.isNotNull(inspection)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", inspection.getStageName());
					jsonObject.put("status", inspection.getStageStatus());
					Date startDate =new Date();
					if(Validator.isNotNull(inspection.getStageStartDate())) {
						startDate = inspection.getStageStartDate();
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}else {
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}
					Date endDate = new Date();
					if(inspection.getStageStatus().equals("Closed")) {
						if(Validator.isNotNull(inspection.getStageEndDate())) {
							endDate = inspection.getStageEndDate();
						}
						jsonObject.put("endDate",bpmDateFormat.format(endDate));
					}else {
						jsonObject.put("endDate", "");
					}
					jsonObject.put("duration",calculateWeeks(startDate, endDate));
					stages.put(jsonObject);
				}else {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName","Inspection ( Min and JAMPRO)");
					jsonObject.put("status","");
					jsonObject.put("duration", "");
					jsonObject.put("startDate", "");
					jsonObject.put("endDate", "");
					
					stages.put(jsonObject);
				}
				CreativeApplicationStages ministryDecision = null;
				try {
					ministryDecision =  getCAS_CaseIdStageName(caseId, "Ministry's Decision");
				}catch (Exception e) {
					// TODO: handle exception
				}
				if(Validator.isNotNull(ministryDecision)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", ministryDecision.getStageName());
					jsonObject.put("status", ministryDecision.getStageStatus());
					Date startDate =new Date();
					if(Validator.isNotNull(ministryDecision.getStageStartDate())) {
						startDate = ministryDecision.getStageStartDate();
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}else {
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
					Date endDate = new Date();
					if(ministryDecision.getStageStatus().equals("Closed")) {
						if(Validator.isNotNull(ministryDecision.getStageEndDate())) {
							endDate = ministryDecision.getStageEndDate();
						}
						jsonObject.put("endDate",bpmDateFormat.format(endDate));
					}
					else {
						jsonObject.put("endDate", "");
					}
					jsonObject.put("duration",calculateWeeks(startDate, endDate));
					stages.put(jsonObject);
				}else {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName","Ministry's Decision");
					jsonObject.put("status","");
					jsonObject.put("duration", "");
					jsonObject.put("startDate", "");
					jsonObject.put("endDate", "");
					stages.put(jsonObject);
				}
				CreativeApplicationStages referralToJCA =  null;
				try {
					referralToJCA =  getCAS_CaseIdStageName(caseId, "Referral to JCA");
				}catch (Exception e) {
					// TODO: handle exception
				}
				if(Validator.isNotNull(referralToJCA)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", referralToJCA.getStageName());
					jsonObject.put("status", referralToJCA.getStageStatus());
					Date startDate =new Date();
					if(Validator.isNotNull( referralToJCA.getStageStartDate())) {
						startDate = referralToJCA.getStageStartDate();
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}else {
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
					Date endDate = new Date();
					if(referralToJCA.getStageStatus().equals("Closed")) {
						if(Validator.isNotNull(referralToJCA.getStageEndDate())) {
							endDate = referralToJCA.getStageEndDate();
						}
						jsonObject.put("endDate",bpmDateFormat.format(endDate));
					}
					else {
						jsonObject.put("endDate", "");
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
				
				CreativeApplicationStages issuanceOfPermit  = null;
				try {
					issuanceOfPermit =  getCAS_CaseIdStageName(caseId, "Issuance of Permit (Exemption Certificate) or Refusal Letter");
				}catch (Exception e) {
					// TODO: handle exception
				}
				if(Validator.isNotNull(issuanceOfPermit)) {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName", issuanceOfPermit.getStageName());
					jsonObject.put("status", issuanceOfPermit.getStageStatus());
					Date startDate =new Date();
					if(Validator.isNotNull(issuanceOfPermit.getStageStartDate())) {
						startDate = issuanceOfPermit.getStageStartDate();
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}else {
						jsonObject.put("startDate",bpmDateFormat.format(startDate));
					}
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
					Date endDate = new Date();
					if(issuanceOfPermit.getStageStatus().equals("Closed")) {
						if(Validator.isNotNull(issuanceOfPermit.getStageEndDate())) {
							endDate = issuanceOfPermit.getStageEndDate();
						}
						jsonObject.put("endDate",bpmDateFormat.format(endDate));
					}
					else {
						jsonObject.put("endDate", "");
					}
					jsonObject.put("duration",calculateWeeks(startDate, endDate));
					stages.put(jsonObject);
				}else {
					JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
					jsonObject.put("stageName","Issuance of Permit (Exemption Certificate) or Refusal Letter");
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
			public List<String> getCreativeDistinctStages(){
				DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(CreativeApplicationStagesTable.INSTANCE.stageName).from(CreativeApplicationStagesTable.INSTANCE);
				return dslQuery(query);
			}
}