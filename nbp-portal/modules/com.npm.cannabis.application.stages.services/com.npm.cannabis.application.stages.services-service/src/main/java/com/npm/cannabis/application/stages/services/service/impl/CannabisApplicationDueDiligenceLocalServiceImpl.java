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
import com.liferay.portal.kernel.util.Validator;
import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationDueDiligenceException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligenceTable;
import com.npm.cannabis.application.stages.services.service.base.CannabisApplicationDueDiligenceLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence",
	service = AopService.class
)
public class CannabisApplicationDueDiligenceLocalServiceImpl
	extends CannabisApplicationDueDiligenceLocalServiceBaseImpl {
	
	public List<CannabisApplicationDueDiligence> getCannabisApplicationDueDiligenceStages(String caseId){
		return cannabisApplicationDueDiligencePersistence.findBygetCADD_CaseId(caseId);
	}
	public CannabisApplicationDueDiligence getCannabisApplicationDueDiligenceStage(String caseId,String agencyName) throws NoSuchCannabisApplicationDueDiligenceException{
		return cannabisApplicationDueDiligencePersistence.findBygetCADD_CaseIdAgnecyName(caseId, agencyName);
	}

	public CannabisApplicationDueDiligence updateCannabisApplicationDueDiligence(String caseId,String agencyName,String agencyContactName,String agencyEmailAddress, Date dateFeedbackReceived,Date dateOfApplication,Date dateSubmittedToAgency,Date datefoDeadlineByAgency,String entityName,String status, String licenseNumber,String statusOfAgencyLetter,String agencyDecision) {
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =null;
		try {
			cannabisApplicationDueDiligence = getCannabisApplicationDueDiligenceStage(caseId, agencyName);
		} catch (NoSuchCannabisApplicationDueDiligenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Validator.isNotNull(cannabisApplicationDueDiligence)) {
			cannabisApplicationDueDiligence.setAgencyContactName(agencyContactName);
			cannabisApplicationDueDiligence.setAgencyEmailAddress(agencyEmailAddress);
			cannabisApplicationDueDiligence.setFeedbackReceivedDate(dateFeedbackReceived);
			cannabisApplicationDueDiligence.setDateOfApplication(dateOfApplication);
			cannabisApplicationDueDiligence.setSubmittedToAgencyDate(dateSubmittedToAgency);
			cannabisApplicationDueDiligence.setDeadlineDate(datefoDeadlineByAgency);
			cannabisApplicationDueDiligence.setEntityName(entityName);
			cannabisApplicationDueDiligence.setStatus(status);	
			cannabisApplicationDueDiligence.setCaseId(caseId);
			cannabisApplicationDueDiligence.setAgencyName(agencyName);
			cannabisApplicationDueDiligence.setStatusOfAgencyLetter(statusOfAgencyLetter);
			cannabisApplicationDueDiligence.setAgencyDecision(agencyDecision);
			cannabisApplicationDueDiligence.setLicenseNumber(licenseNumber);
			cannabisApplicationDueDiligence.setModifiedDate(new Date());
			cannabisApplicationDueDiligencePersistence.update(cannabisApplicationDueDiligence);
			
		}else {
			cannabisApplicationDueDiligence = createCannabisApplicationDueDiligence(CounterLocalServiceUtil.increment(CannabisApplicationDueDiligence.class.getName()));
			cannabisApplicationDueDiligence.setAgencyContactName(agencyContactName);
			cannabisApplicationDueDiligence.setAgencyEmailAddress(agencyEmailAddress);
			cannabisApplicationDueDiligence.setFeedbackReceivedDate(dateFeedbackReceived);
			cannabisApplicationDueDiligence.setDateOfApplication(dateOfApplication);
			cannabisApplicationDueDiligence.setSubmittedToAgencyDate(dateSubmittedToAgency);
			cannabisApplicationDueDiligence.setDeadlineDate(datefoDeadlineByAgency);
			cannabisApplicationDueDiligence.setEntityName(entityName);
			cannabisApplicationDueDiligence.setStatus(status);	
			cannabisApplicationDueDiligence.setCreateDate(new Date());
			cannabisApplicationDueDiligence.setCaseId(caseId);
			cannabisApplicationDueDiligence.setAgencyName(agencyName);
			cannabisApplicationDueDiligence.setStatusOfAgencyLetter(statusOfAgencyLetter);
			cannabisApplicationDueDiligence.setAgencyDecision(agencyDecision);
			cannabisApplicationDueDiligence.setLicenseNumber(licenseNumber);
			cannabisApplicationDueDiligencePersistence.update(cannabisApplicationDueDiligence);
		}
		return cannabisApplicationDueDiligence;
	}
	
	public List<String> getDistinctAgencies(){
		DSLQuery query  =DSLQueryFactoryUtil.selectDistinct(CannabisApplicationDueDiligenceTable.INSTANCE.agencyName).from(CannabisApplicationDueDiligenceTable.INSTANCE);
		return dslQuery(query);
	}
}