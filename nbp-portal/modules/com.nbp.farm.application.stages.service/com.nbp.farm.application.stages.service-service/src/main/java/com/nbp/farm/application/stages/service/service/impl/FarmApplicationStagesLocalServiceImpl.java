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

package com.nbp.farm.application.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.farm.application.form.service.model.FarmerApplicationTable;
import com.nbp.farm.application.stages.service.exception.NoSuchFarmApplicationStagesException;
import com.nbp.farm.application.stages.service.model.FarmApplicationStages;
import com.nbp.farm.application.stages.service.model.FarmApplicationStagesTable;
import com.nbp.farm.application.stages.service.service.base.FarmApplicationStagesLocalServiceBaseImpl;

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
@Component(property = "model.class.name=com.nbp.farm.application.stages.service.model.FarmApplicationStages", service = AopService.class)
public class FarmApplicationStagesLocalServiceImpl extends FarmApplicationStagesLocalServiceBaseImpl {

	public FarmApplicationStages getFarmByFAI(long farmApplicationId) throws NoSuchFarmApplicationStagesException {
		return farmApplicationStagesPersistence.findBygetFAS_CAI(farmApplicationId);
	}

	public FarmApplicationStages getFarmByCI_SN(String caseId, String stageName)
			throws NoSuchFarmApplicationStagesException {
		return farmApplicationStagesPersistence.findBygetFAS_CaseIdStageName(caseId, stageName);
	}

	public FarmApplicationStages getFarmByCI_ST_SN(String CaseId, String stageStatus, String StageName)
			throws NoSuchFarmApplicationStagesException {
		return farmApplicationStagesPersistence.findBygetFAS_CaseIdStageStatus(CaseId, stageStatus, StageName);
	}

	public FarmApplicationStages getFarmByCI_ST(String caseId, String status)
			throws NoSuchFarmApplicationStagesException {
		return farmApplicationStagesPersistence.findBygetFAS_CaseIdAndStatus(caseId, status);
	}

	public List<FarmApplicationStages> getFarmByCI(String caseId) {
		return farmApplicationStagesPersistence.findBygetCAS_CaseId(caseId);
	}
	public List<FarmApplicationStages> getFarmBySN(String stageName) {
		return farmApplicationStagesPersistence.findBygetFAS_StageName(stageName);
	}
	public List<FarmApplicationStages> getFAS_StageName_Status(String stageName,String status) {
		return farmApplicationStagesPersistence.findBygetFAS_StageName_Status(stageName,status);
	}
	public List<String> getFarmerDistinctStages(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(FarmApplicationStagesTable.INSTANCE.stageName).from(FarmApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getFarmSeenCases() {
		DSLQuery query  = DSLQueryFactoryUtil.count().from(FarmApplicationStagesTable.INSTANCE).where(FarmApplicationStagesTable.INSTANCE.stageName.eq("Data Verification").
						  and(FarmApplicationStagesTable.INSTANCE.caseId.in(DSLQueryFactoryUtil.select(FarmerApplicationTable.INSTANCE.caseld).from(FarmerApplicationTable.INSTANCE).where(FarmerApplicationTable.INSTANCE.status.eq(0).and(FarmerApplicationTable.INSTANCE.caseld.isNotNull())))));
		return dslQuery(query);
	}
	public FarmApplicationStages updateFarmApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {
		FarmApplicationStages farmApplicationStages = null;

		try {
			farmApplicationStages = farmApplicationStagesPersistence.findBygetFAS_CaseIdStageName(caseId, stageName);
		} catch (NoSuchFarmApplicationStagesException e) {
		}

		if (Validator.isNotNull(farmApplicationStages)) {
			//farmApplicationStages.setStageStartDate(stageStartDate);
			farmApplicationStages.setStageEndDate(stageEndDate);
			farmApplicationStages.setStageStatus(stageStatus);
			farmApplicationStages.setDuration(duration);
			farmApplicationStages.setModifiedDate(new Date());
			farmApplicationStagesPersistence.update(farmApplicationStages);
		} else {
			farmApplicationStages = createFarmApplicationStages(
					CounterLocalServiceUtil.increment(FarmApplicationStages.class.getName()));
			farmApplicationStages.setStageName(stageName);
			farmApplicationStages.setStageStartDate(stageStartDate);
			farmApplicationStages.setStageEndDate(stageEndDate);
			farmApplicationStages.setStageStatus(stageStatus);
			farmApplicationStages.setCaseId(caseId);
			farmApplicationStages.setDuration(duration);
			farmApplicationStages.setCreateDate(new Date());
			farmApplicationStagesPersistence.update(farmApplicationStages);
		}
		return farmApplicationStages;
	}

	public String getfarmCurrentStage(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		// ------- stage
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		FarmApplicationStages dataVerification = null;

		try {
			dataVerification = getFarmByCI_SN(caseId, "Data Verification");
		} catch (NoSuchFarmApplicationStagesException e) {
		}
		if (Validator.isNotNull(dataVerification)) {
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
			if (dataVerification.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(dataVerification.getStageEndDate())) {
					endDate = dataVerification.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
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
		// -------------next stage

		FarmApplicationStages inspectionDate = null;

		try {
			inspectionDate = getFarmByCI_SN(caseId, "Inspection Date");
		} catch (NoSuchFarmApplicationStagesException e1) {

		}

		if (Validator.isNotNull(inspectionDate)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", inspectionDate.getStageName());
			jsonObject.put("status", inspectionDate.getStageStatus());
			Date startDate =new Date();
			if(Validator.isNotNull(dataVerification.getStageStartDate())) {
				startDate = inspectionDate.getStageStartDate();
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}
			Date endDate = new Date();
			if (inspectionDate.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(inspectionDate.getStageEndDate())) {
					endDate = inspectionDate.getStageEndDate();
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
		// -------next stage
		FarmApplicationStages lIRefusal = null;

		try {
			lIRefusal = getFarmByCI_SN(caseId, "License Issuance or Refusal");
		} catch (NoSuchFarmApplicationStagesException e1) {
		}

		if (Validator.isNotNull(lIRefusal)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", lIRefusal.getStageName());
			jsonObject.put("status", lIRefusal.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(lIRefusal.getStageStartDate())) {
				startDate = lIRefusal.getStageStartDate();
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}
			Date endDate = new Date();
			if (lIRefusal.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(lIRefusal.getStageEndDate())) {
					endDate = lIRefusal.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "License Issuance or Refusal");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// -------next stage
		FarmApplicationStages oRCPayment = null;
		try {
			oRCPayment = getFarmByCI_SN(caseId, "Registration Card Payment");
		} catch (NoSuchFarmApplicationStagesException e) {
		}
		if (Validator.isNotNull(oRCPayment)) {

			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", oRCPayment.getStageName());
			jsonObject.put("status", oRCPayment.getStageStatus());
			Date startDate= new Date();
			if(Validator.isNotNull(oRCPayment.getStageStartDate())) {
				startDate = oRCPayment.getStageStartDate();
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}else {
					jsonObject.put("startDate",bpmDateFormat.format(startDate));
				}
			Date endDate = new Date();
			if (oRCPayment.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(oRCPayment.getStageEndDate())) {
					endDate = oRCPayment.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			
			jsonObject.put("duration",calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Registration Card Payment");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		return stages.toString();
	}

	private String calculateWeeks(Date startDate, Date endDate) {
		Calendar cal=new GregorianCalendar();
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