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

package com.nbp.acquire.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.stages.service.exception.NoSuchAcquireEvaluationException;
import com.nbp.acquire.stages.service.model.AcquireEvaluation;
import com.nbp.acquire.stages.service.service.AcquireEvaluationLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireEvaluationLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireEvaluation",
	service = AopService.class
)
public class AcquireEvaluationLocalServiceImpl
	extends AcquireEvaluationLocalServiceBaseImpl {
	public AcquireEvaluation getAcquireEvaluationBy_CI(String caseId) throws NoSuchAcquireEvaluationException {
		return acquireEvaluationPersistence.findBygetAcquireEvaluationBy_CaseId(caseId);
		
	} 
	public AcquireEvaluation updateAcquireApplicationEvaluation(String caseId,String typeOfCommittee,Date dateOfCommitteeDecision,String committeeDecision) {
		AcquireEvaluation acquireEvaluation=null;
		try {
			acquireEvaluation=AcquireEvaluationLocalServiceUtil.getAcquireEvaluationBy_CI(caseId);
		} catch (NoSuchAcquireEvaluationException e) {
		}
		if(Validator.isNotNull(acquireEvaluation)) {
			acquireEvaluation.setTypeOfCommittee(typeOfCommittee);
			acquireEvaluation.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			acquireEvaluation.setCommitteeDecision(committeeDecision);
			acquireEvaluation.setModifiedDate(new Date());
			acquireEvaluationPersistence.update(acquireEvaluation);
		}else {
			acquireEvaluation=createAcquireEvaluation(CounterLocalServiceUtil.increment());
			acquireEvaluation.setCaseId(caseId);
			acquireEvaluation.setTypeOfCommittee(typeOfCommittee);
			acquireEvaluation.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			acquireEvaluation.setCommitteeDecision(committeeDecision);
			acquireEvaluation.setCreateDate(new Date());
			acquireEvaluationPersistence.update(acquireEvaluation);
		}
		
		return acquireEvaluation;}
	
}