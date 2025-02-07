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

package com.nbp.ncbj.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.sql.dsl.DSLQueryFactoryUtil;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationStagesException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;
import com.nbp.ncbj.stages.services.service.base.NcbjApplicationStagesLocalServiceBaseImpl;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStagesTable;

import com.nbp.ncbj.application.form.service.model.NcbjApplicationTable;
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
@Component(property = "model.class.name=com.nbp.ncbj.stages.services.model.NcbjApplicationStages", service = AopService.class)
public class NcbjApplicationStagesLocalServiceImpl extends NcbjApplicationStagesLocalServiceBaseImpl {
	public NcbjApplicationStages getNcbjByCI_SN(String caseId, String stageName)
			throws NoSuchNcbjApplicationStagesException {
		return ncbjApplicationStagesPersistence.findBygetNcbj_By_CaseIdStageName(caseId, stageName);
	}

	public NcbjApplicationStages getNcbjByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchNcbjApplicationStagesException {
		return ncbjApplicationStagesPersistence.findBygetNcbj_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	public List<NcbjApplicationStages> getMiningByCI(String caseId) throws NoSuchNcbjApplicationStagesException {
		return ncbjApplicationStagesPersistence.findBygetNcbj_By_CaseId(caseId);
	}
	public NcbjApplicationStages getNCBJByCI(String caseId) throws NoSuchNcbjApplicationStagesException  {
		return ncbjApplicationStagesPersistence.findBygetNcbj_App_By_CaseId(caseId);
	}

	public NcbjApplicationStages getMiningByCI_ST(String caseId, String stageStatus)
			throws NoSuchNcbjApplicationStagesException {
		return ncbjApplicationStagesPersistence.findBygetNcbj_By_CaseIdAndStatus(caseId, stageStatus);
	}

	public List<NcbjApplicationStages> gtNcbjApplicationStages_By_SN(String stageName) {
		return ncbjApplicationStagesPersistence.findBygetQuarry_By_StageName(stageName);
	}
	
	public List<String> getNcbjDistinctStages() {
		DSLQuery query = DSLQueryFactoryUtil.selectDistinct(NcbjApplicationStagesTable.INSTANCE.stageName)
				.from(NcbjApplicationStagesTable.INSTANCE);
		return dslQuery(query);
	}
	public Long getNCBJSeenCases() {
		DSLQuery query = DSLQueryFactoryUtil.count().from(NcbjApplicationStagesTable.INSTANCE)
				.where(NcbjApplicationStagesTable.INSTANCE.stageName.eq("NCBJ Review and Quotation")
						.and(NcbjApplicationStagesTable.INSTANCE.caseId
								.in(DSLQueryFactoryUtil.select(NcbjApplicationTable.INSTANCE.caseId)
										.from(NcbjApplicationTable.INSTANCE).where(NcbjApplicationTable.INSTANCE.status
												.eq(0).and(NcbjApplicationTable.INSTANCE.caseId.isNotNull())))));
		return dslQuery(query);
	}


	public NcbjApplicationStages updateNcbjApplicationStages(String caseId, String stageName, Date stageStartDate,
			Date stageEndDate, String duration, String stageStatus) {

		NcbjApplicationStages NcbjApplicationStages = null;

		try {
			NcbjApplicationStages = getMiningByCI_SN(caseId, stageName);
		} catch (NoSuchNcbjApplicationStagesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Validator.isNotNull(NcbjApplicationStages)) {
			// NcbjApplicationStages.setStageStartDate(stageStartDate);
			NcbjApplicationStages.setStageEndDate(stageEndDate);
			NcbjApplicationStages.setStageStatus(stageStatus);
			NcbjApplicationStages.setDuration(duration);
			NcbjApplicationStages.setModifiedDate(new Date());
			NcbjApplicationStages.setCaseId(caseId);
			ncbjApplicationStagesPersistence.update(NcbjApplicationStages);
		} else {
			NcbjApplicationStages = ncbjApplicationStagesPersistence.create(
					CounterLocalServiceUtil.increment(NcbjApplicationStages.class.getName()));
			NcbjApplicationStages.setStageName(stageName);
			NcbjApplicationStages.setStageStartDate(stageStartDate);
			NcbjApplicationStages.setStageEndDate(stageEndDate);
			NcbjApplicationStages.setStageStatus(stageStatus);
			NcbjApplicationStages.setDuration(duration);
			NcbjApplicationStages.setCreateDate(new Date());
			NcbjApplicationStages.setCaseId(caseId);
			ncbjApplicationStagesPersistence.update(NcbjApplicationStages);
		}
		return NcbjApplicationStages;
	}

	public String getNcbjApplicaitonCurrentStages(String caseId) {
		JSONArray stages = JSONFactoryUtil.createJSONArray();
		DateFormat bpmDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		NcbjApplicationStages reviewStage = null;
		try {
			reviewStage = getNcbjByCI_SN(caseId, "NCBJ Review and Quotation");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(reviewStage)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", reviewStage.getStageName());
			jsonObject.put("status", reviewStage.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(reviewStage.getStageStartDate())) {
				startDate = reviewStage.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			}
			Date endDate = new Date();
			if (reviewStage.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(reviewStage.getStageEndDate())) {
					endDate = reviewStage.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "NCBJ Review and Quotation");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		NcbjApplicationStages refferalToJCA = null;
		try {
			refferalToJCA = getNcbjByCI_SN(caseId, "Audit Scheduling");
		} catch (NoSuchNcbjApplicationStagesException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(refferalToJCA)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", refferalToJCA.getStageName());
			jsonObject.put("status", refferalToJCA.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(refferalToJCA.getStageStartDate())) {
				startDate = refferalToJCA.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (refferalToJCA.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(refferalToJCA.getStageEndDate())) {
					endDate = refferalToJCA.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Audit Scheduling");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}

		// --------next stage
		NcbjApplicationStages iD = null;

		try {
			iD = getNcbjByCI_SN(caseId, "Audit Execution");
		} catch (NoSuchNcbjApplicationStagesException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(iD)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", iD.getStageName());
			jsonObject.put("status", iD.getStageStatus());
			Date startDate = new Date();
			if (Validator.isNotNull(iD.getStageStartDate())) {
				startDate = iD.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (iD.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(iD.getStageEndDate())) {
					endDate = iD.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Audit Execution");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		NcbjApplicationStages jca = null;
		try {
			jca = getNcbjByCI_SN(caseId, "Follow Up Corrective Action");
		} catch (NoSuchNcbjApplicationStagesException e) {
		}
		if (Validator.isNotNull(jca)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", jca.getStageName());
			jsonObject.put("status", jca.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(jca.getStageStartDate())) {
				startDate = jca.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (jca.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(jca.getStageEndDate())) {
					endDate = jca.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Follow Up Corrective Action");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
//		NcbjApplicationStages issuancePermit = null;
//		try {
//			issuancePermit = getNcbjByCI_SN(caseId, "Audit Package (Verification/Assembling)");
//		} catch (NoSuchNcbjApplicationStagesException e) {
//		}
//		if (Validator.isNotNull(issuancePermit)) {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", issuancePermit.getStageName());
//			jsonObject.put("status", issuancePermit.getStageStatus());
//			Date startDate = new Date();
//			;
//			if (Validator.isNotNull(issuancePermit.getStageStartDate())) {
//				startDate = issuancePermit.getStageStartDate();
//				jsonObject.put("startDate", bpmDateFormat.format(startDate));
//			} else {
//				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
//			}
//			Date endDate = new Date();
//			if (issuancePermit.getStageStatus().equals("Closed")) {
//				if (Validator.isNotNull(issuancePermit.getStageEndDate())) {
//					endDate = issuancePermit.getStageEndDate();
//				}
//				jsonObject.put("endDate", bpmDateFormat.format(endDate));
//			} else {
//				jsonObject.put("endDate", "");
//			}
//			jsonObject.put("duration", calculateWeeks(startDate, endDate));
//			stages.put(jsonObject);
//		} else {
//			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//			jsonObject.put("stageName", "Audit Package (Verification/Assembling)");
//			jsonObject.put("status", "");
//			jsonObject.put("duration", "");
//			jsonObject.put("startDate", "");
//			jsonObject.put("endDate", "");
//			stages.put(jsonObject);
//		}
		// --------next stage
		NcbjApplicationStages packageReview = null;
		try {
			packageReview = getNcbjByCI_SN(caseId, "Package Review");
		} catch (NoSuchNcbjApplicationStagesException e) {
		}
		if (Validator.isNotNull(packageReview)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", packageReview.getStageName());
			jsonObject.put("status", packageReview.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(packageReview.getStageStartDate())) {
				startDate = packageReview.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (packageReview.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(packageReview.getStageEndDate())) {
					endDate = packageReview.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Package Review");
			jsonObject.put("status", "");
			jsonObject.put("duration", "");
			jsonObject.put("startDate", "");
			jsonObject.put("endDate", "");
			stages.put(jsonObject);
		}
		// --------next stage
		NcbjApplicationStages certificateIssuance = null;
		try {
			certificateIssuance = getNcbjByCI_SN(caseId, "Certificate Issuance");
		} catch (NoSuchNcbjApplicationStagesException e) {
		}
		if (Validator.isNotNull(certificateIssuance)) {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", certificateIssuance.getStageName());
			jsonObject.put("status", certificateIssuance.getStageStatus());
			Date startDate = new Date();
			;
			if (Validator.isNotNull(certificateIssuance.getStageStartDate())) {
				startDate = certificateIssuance.getStageStartDate();
				jsonObject.put("startDate", bpmDateFormat.format(startDate));
			} else {
				jsonObject.put("startDate", bpmDateFormat.format(new Date()));
			}
			Date endDate = new Date();
			if (certificateIssuance.getStageStatus().equals("Closed")) {
				if (Validator.isNotNull(certificateIssuance.getStageEndDate())) {
					endDate = certificateIssuance.getStageEndDate();
				}
				jsonObject.put("endDate", bpmDateFormat.format(endDate));
			} else {
				jsonObject.put("endDate", "");
			}
			jsonObject.put("duration", calculateWeeks(startDate, endDate));
			stages.put(jsonObject);
		} else {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("stageName", "Certificate Issuance");
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
	public NcbjApplicationStages getMiningByCI_ST_SN(String caseId, String stageStatus, String stageName)
			throws NoSuchNcbjApplicationStagesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NcbjApplicationStages getMiningByCI_SN(String caseId, String stageName)
			throws NoSuchNcbjApplicationStagesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getQuarrySeenCases() {
		// TODO Auto-generated method stub
		return null;
	}

}