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

package com.nbp.pharmaceutical.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;
import com.nbp.pharmaceutical.stages.services.service.base.PharmaApplicationDueDiligenceLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence",
	service = AopService.class
)
public class PharmaApplicationDueDiligenceLocalServiceImpl
	extends PharmaApplicationDueDiligenceLocalServiceBaseImpl {
	
	public PharmaApplicationDueDiligence getPharmaApplicationDueDiligenceStage(String caseId,String agencyName) throws com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationDueDiligenceException{
		return pharmaApplicationDueDiligencePersistence.findBygetPHARMADD_CaseIdAgnecyName(caseId, agencyName);
	}
	public List<PharmaApplicationDueDiligence> getPharmaApplicationDueDiligenceAN(String agencyName) throws com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationDueDiligenceException{
		return pharmaApplicationDueDiligencePersistence.findBygetPHARMADD_AgnecyName(agencyName);
	}
	public PharmaApplicationDueDiligence updatePharmaApplicationDueDiligence(String caseId,String agencyName,Date dateSubmittedToAgency, Date dateFeedbackReceived,String  status,String  durationOfTimeSpentAtAgency,String  agencyDecision) {
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =null;
		try {
			pharmaApplicationDueDiligence = getPharmaApplicationDueDiligenceStage(caseId, agencyName);
		} catch (com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationDueDiligenceException e) {
		}
		if(Validator.isNotNull(pharmaApplicationDueDiligence)) {
			pharmaApplicationDueDiligence.setFeedbackReceivedDate(dateFeedbackReceived);
			pharmaApplicationDueDiligence.setSubmittedToAgencyDate(dateSubmittedToAgency);
			pharmaApplicationDueDiligence.setStatus(status);	
			pharmaApplicationDueDiligence.setAgencyName(agencyName);
			pharmaApplicationDueDiligence.setModifiedDate(new Date());
			pharmaApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
			pharmaApplicationDueDiligence.setAgencyDecision(durationOfTimeSpentAtAgency);
			pharmaApplicationDueDiligencePersistence.update(pharmaApplicationDueDiligence);
			
		}else {
			pharmaApplicationDueDiligence = createPharmaApplicationDueDiligence(CounterLocalServiceUtil.increment(PharmaApplicationDueDiligence.class.getName()));
			pharmaApplicationDueDiligence.setFeedbackReceivedDate(dateFeedbackReceived);
			pharmaApplicationDueDiligence.setCaseId(caseId);
			pharmaApplicationDueDiligence.setSubmittedToAgencyDate(dateSubmittedToAgency);
			pharmaApplicationDueDiligence.setStatus(status);	
			pharmaApplicationDueDiligence.setAgencyName(agencyName);
			pharmaApplicationDueDiligence.setModifiedDate(new Date());
			pharmaApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
			pharmaApplicationDueDiligence.setAgencyDecision(durationOfTimeSpentAtAgency);
			pharmaApplicationDueDiligencePersistence.update(pharmaApplicationDueDiligence);
		}
		return pharmaApplicationDueDiligence;
	}
	@Override
	public PharmaApplicationDueDiligence updatePharmaApplicationDueDiligence(String caseId, String agencyName,
			String agencyContactName, String agencyEmailAddress, Date dateFeedbackReceived, Date dateOfApplication,
			Date dateSubmittedToAgency, Date datefoDeadlineByAgency, String entityName, String status,
			String licenseNumber) {
		return null;
	}
}