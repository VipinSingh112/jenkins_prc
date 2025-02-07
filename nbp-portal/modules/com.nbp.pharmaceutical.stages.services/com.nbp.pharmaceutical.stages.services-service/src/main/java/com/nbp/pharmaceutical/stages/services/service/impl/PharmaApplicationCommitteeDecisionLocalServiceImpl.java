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
import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationCommitteeDecisionException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;
import com.nbp.pharmaceutical.stages.services.service.PharmaApplicationCommitteeDecisionLocalServiceUtil;
import com.nbp.pharmaceutical.stages.services.service.base.PharmaApplicationCommitteeDecisionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision",
	service = AopService.class
)
public class PharmaApplicationCommitteeDecisionLocalServiceImpl
	extends PharmaApplicationCommitteeDecisionLocalServiceBaseImpl {
	public PharmaApplicationCommitteeDecision getPharmaCommitteDecisionByCI(String caseId) throws NoSuchPharmaApplicationCommitteeDecisionException {
		return pharmaApplicationCommitteeDecisionPersistence.findBygetPharma_CD_CI(caseId);
		}
	public List <PharmaApplicationCommitteeDecision> getPharmaCommitteDecisionByStatus(String status) throws NoSuchPharmaApplicationCommitteeDecisionException {
		return pharmaApplicationCommitteeDecisionPersistence.findBygetPharma_By_CD(status);
	}
	public PharmaApplicationCommitteeDecision updatePharmaApplicationCommitteeDecision(String caseId,Date dateOfCommitteeDecision, String committeeDecision) {
		PharmaApplicationCommitteeDecision applicationCommitteeDecision=null;
		try {
			applicationCommitteeDecision=getPharmaCommitteDecisionByCI(caseId);
		} catch (NoSuchPharmaApplicationCommitteeDecisionException e) {
		}
		if(Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			pharmaApplicationCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}else {
			applicationCommitteeDecision=createPharmaApplicationCommitteeDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setCreateDate(new Date());
			pharmaApplicationCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}



}
