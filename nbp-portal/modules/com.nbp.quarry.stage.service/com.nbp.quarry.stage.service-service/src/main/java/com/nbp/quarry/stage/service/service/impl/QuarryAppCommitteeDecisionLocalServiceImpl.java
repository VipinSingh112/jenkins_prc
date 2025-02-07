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

package com.nbp.quarry.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.quarry.stage.service.exception.NoSuchQuarryAppCommitteeDecisionException;
import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision;
import com.nbp.quarry.stage.service.service.base.QuarryAppCommitteeDecisionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision",
	service = AopService.class
)
public class QuarryAppCommitteeDecisionLocalServiceImpl
	extends QuarryAppCommitteeDecisionLocalServiceBaseImpl {
	
	public QuarryAppCommitteeDecision getQuarry_CD_CI(String caseId) throws NoSuchQuarryAppCommitteeDecisionException {
		return quarryAppCommitteeDecisionPersistence.findBygetQuarry_CD_CI(caseId);
		}
	public List <QuarryAppCommitteeDecision> getQuarry_By_CD(String status) throws NoSuchQuarryAppCommitteeDecisionException {
		return quarryAppCommitteeDecisionPersistence.findBygetQuarry_By_CD(status);
	}
	public QuarryAppCommitteeDecision updateQuarryApplicationCommitteeDecision(String caseId,Date dateOfCommitteeDecision, String committeeDecision) {
		QuarryAppCommitteeDecision applicationCommitteeDecision=null;
		try {
			applicationCommitteeDecision=getQuarry_CD_CI(caseId);
		} catch (NoSuchQuarryAppCommitteeDecisionException e) {
		}
		if(Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			quarryAppCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}else {
			applicationCommitteeDecision=createQuarryAppCommitteeDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setCreateDate(new Date());
			quarryAppCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}



}
