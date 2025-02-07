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

package com.nbp.miic.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.application.form.services.model.MiicApplicationTable;
import com.nbp.miic.stages.service.exception.NoSuchMiicApplicationStagesException;
import com.nbp.miic.stages.service.model.MiicApplicationStages;
import com.nbp.miic.stages.service.model.MiicApplicationStagesTable;
import com.nbp.miic.stages.service.service.base.MiicApplicationStagesLocalServiceBaseImpl;

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
	property = "model.class.name=com.nbp.miic.stages.service.model.MiicApplicationStages",
	service = AopService.class
)
public class MiicApplicationStagesLocalServiceImpl
	extends MiicApplicationStagesLocalServiceBaseImpl {
	public MiicApplicationStages findBygetMIIC_CaseIdStageName(String caseId, String stageName) throws NoSuchMiicApplicationStagesException
			 {
		return miicApplicationStagesPersistence.findBygetMIIC_CaseIdStageName(caseId, stageName);
	}

	public MiicApplicationStages findBygetMIIC_CaseIdStageStatus(String caseId, String stageStatus,
			String stageName) throws NoSuchMiicApplicationStagesException  {
		return miicApplicationStagesPersistence.findBygetMIIC_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<MiicApplicationStages> findBygetMIIC_CaseId(String caseId)
			 {
		return miicApplicationStagesPersistence.findBygetMIIC_CaseId(caseId);
	}
	public MiicApplicationStages findBygetMIIC_By_CaseId(String caseId) throws NoSuchMiicApplicationStagesException
	{
		return miicApplicationStagesPersistence.findBygetMIIC_By_CaseId(caseId);
	}

	public MiicApplicationStages findBygetMIIC_CaseIdAndStatus(String caseId, String stageStatus) throws NoSuchMiicApplicationStagesException
			 {
		return miicApplicationStagesPersistence.findBygetMIIC_CaseIdAndStatus(caseId, stageStatus);
	}

	public MiicApplicationStages findBygetMIIC_CAI(long miicApplicationId) throws NoSuchMiicApplicationStagesException
			 {
		return miicApplicationStagesPersistence.findBygetMIIC_CAI(miicApplicationId);
	}
	public List<MiicApplicationStages> findBygetMIIC_StageName(String stageName){
		return miicApplicationStagesPersistence.findBygetMIIC_StageName(stageName);
		}
	public List<String> getMiicDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(MiicApplicationStagesTable.INSTANCE.stageName)
				.from(MiicApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getMIICSeenCases(){
		DSLQuery query  = DSLQueryFactoryUtil.count().from(MiicApplicationStagesTable.INSTANCE).where(MiicApplicationStagesTable.INSTANCE.stageName.eq("Eligibility Verification").
				and(MiicApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil.select(MiicApplicationTable.INSTANCE.caseId).from(MiicApplicationTable.INSTANCE).where(MiicApplicationTable.INSTANCE.status.eq(0).and(MiicApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}
	public MiicApplicationStages updateMIICApplicationStages(String caseId, String stageName,
			Date stageStartDate, Date stageEndDate, String duration, String stageStatus) {
		MiicApplicationStages miicApplicationStages = null;

			try {
				miicApplicationStages = findBygetMIIC_CaseIdStageName(caseId, stageName);
			} catch (NoSuchMiicApplicationStagesException e) {
			}
			if (Validator.isNotNull(miicApplicationStages)) {
				//miicApplicationStages.setStageStartDate(stageStartDate);
				miicApplicationStages.setStageEndDate(stageEndDate);
				miicApplicationStages.setStageStatus(stageStatus);
				miicApplicationStages.setDuration(duration);
				miicApplicationStages.setModifiedDate(new Date());
				miicApplicationStages.setCaseId(caseId);
				miicApplicationStagesPersistence.update(miicApplicationStages);
			} else {
				miicApplicationStages = createMiicApplicationStages(
						CounterLocalServiceUtil.increment());
				miicApplicationStages.setStageName(stageName);
				miicApplicationStages.setStageStartDate(stageStartDate);
				miicApplicationStages.setStageEndDate(stageEndDate);
				miicApplicationStages.setStageStatus(stageStatus);
				miicApplicationStages.setDuration(duration);
				miicApplicationStages.setCreateDate(new Date());
				miicApplicationStages.setCaseId(caseId);
				miicApplicationStagesPersistence.update(miicApplicationStages);
			}
			return miicApplicationStages;
	}
	public String getMIICApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		MiicApplicationStages reviewStage = null;
		try {
			reviewStage = findBygetMIIC_CaseIdStageName(caseId, "Eligibility Verification");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate = new Date();
			if(Validator.isNotNull(reviewStage.getStageStartDate())) {
				startDate = reviewStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (reviewStage.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(reviewStage.getStageEndDate())) {
					endDate =reviewStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Eligibility Verification");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		MiicApplicationStages refferalToJCA = null;
		try {
			refferalToJCA = findBygetMIIC_CaseIdStageName(caseId, "Due Diligence");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(refferalToJCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", refferalToJCA.getStageName());
			jsonObject.put("status", refferalToJCA.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(refferalToJCA.getStageStartDate()))
			{
				 startDate = refferalToJCA.getStageStartDate();
					jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (refferalToJCA.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(refferalToJCA.getStageEndDate())) {
					endDate = refferalToJCA.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
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

		// --------next stage
		MiicApplicationStages iD = null;

		try {
			iD = findBygetMIIC_CaseIdStageName(caseId, "Regional Assessment");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(iD)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", iD.getStageName());
			jsonObject.put("status", iD.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(iD.getStageStartDate())){
			startDate = iD.getStageStartDate();
			jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (iD.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(iD.getStageEndDate())) {
					endDate = iD.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Regional Assessment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		MiicApplicationStages jca = null;
		try {
			jca = findBygetMIIC_CaseIdStageName(caseId, "Certificate Issued");
		} catch (Exception e) {
		}
		if (Validator.isNotNull(jca)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", jca.getStageName());
			jsonObject.put("status", jca.getStageStatus());
			Date startDate = new Date(); ;
			if(Validator.isNotNull(jca.getStageStartDate())){
				startDate =jca.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate", bpmDateFormat.format(new Date()));
				}
			Date endDate = new Date();
			if (jca.getStageStatus().equals("Closed")) {
				if(Validator.isNotNull(jca.getStageEndDate())) {
					endDate = jca.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			}else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Certificate Issued");
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