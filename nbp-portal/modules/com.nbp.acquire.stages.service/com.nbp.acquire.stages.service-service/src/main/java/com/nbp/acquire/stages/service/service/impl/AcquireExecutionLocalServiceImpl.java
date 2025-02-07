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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.acquire.stages.service.exception.NoSuchAcquireExecutionException;
import com.nbp.acquire.stages.service.model.AcquireExecution;
import com.nbp.acquire.stages.service.service.base.AcquireExecutionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireExecution",
	service = AopService.class
)
public class AcquireExecutionLocalServiceImpl
	extends AcquireExecutionLocalServiceBaseImpl {
	private static Log _log =LogFactoryUtil.getLog(AcquireExecution.class);
	public AcquireExecution getAcquireExecutionBy_CI(String caseId) throws NoSuchAcquireExecutionException {
		return acquireExecutionPersistence.findBygetAcquireExecutionBy_CI(caseId);
	}

	public AcquireExecution updateAcquireApplicationExecutiion(String caseId, String paymentSection, String paymentDue, String contractSEction, Date dateContractExecuted) {
		AcquireExecution acquireExecution=null;
		try {
			acquireExecution=acquireExecutionPersistence.findBygetAcquireExecutionBy_CI(caseId);
		} catch (NoSuchAcquireExecutionException e) {
			// TODO Auto-generated catch block
			_log .info("CASE ID NOT FOUND----NEW DATA UPDATED");
		}
		if(Validator.isNotNull(acquireExecution)) {
			_log .info("CASE ID******"+caseId+"**EXISTING DATA UPDATED**");
			acquireExecution.setPaymentSection(paymentSection);
			acquireExecution.setPaymentAmountDue(paymentDue);
			acquireExecution.setContractSection(contractSEction);
			acquireExecution.setDateContractExecuted(dateContractExecuted);
			acquireExecution.setModifiedDate(new Date());
            acquireExecutionPersistence.update(acquireExecution);
		}else {
			_log .info("CASE ID******"+caseId+"**NEW DATA UPDATED**");
            acquireExecution=createAcquireExecution(CounterLocalServiceUtil.increment(AcquireExecution.class.getName()));
			acquireExecution.setCaseId(caseId);
			acquireExecution.setPaymentSection(paymentSection);
			acquireExecution.setPaymentAmountDue(paymentDue);
			acquireExecution.setDateContractExecuted(dateContractExecuted);
			acquireExecution.setModifiedDate(new Date());
            acquireExecutionPersistence.update(acquireExecution);
		}
		return acquireExecution;
		
	}
	

	@Override
	public AcquireExecution updateAcquireApplicationExecutiion(String caseId, String paymentSection,
			String paymentDue) {
		// TODO Auto-generated method stub
		return null;
	} 
}