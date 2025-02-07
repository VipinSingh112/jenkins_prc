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
import com.nbp.acquire.stages.service.exception.NoSuchAcquireValuationException;
import com.nbp.acquire.stages.service.model.AcquireValuation;
import com.nbp.acquire.stages.service.service.AcquireValuationLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireValuationLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireValuation",
	service = AopService.class
)
public class AcquireValuationLocalServiceImpl
	extends AcquireValuationLocalServiceBaseImpl { 
	public AcquireValuation getAcquireValuationBy_CI(String caseId) throws NoSuchAcquireValuationException {
		return acquireValuationPersistence.findBygetAcquireValuationBy_CaseId(caseId);
		
	}
	public AcquireValuation updateAcquireApplicationValuation(String caseId,String valuationStatus,String valuationFolio,String valuationVolume,String valuationNumber) {
		AcquireValuation acquireValuation=null;
		try {
			acquireValuation=AcquireValuationLocalServiceUtil.getAcquireValuationBy_CI(caseId);
		} catch (NoSuchAcquireValuationException e) {
		}
		if(Validator.isNotNull(acquireValuation)) {
			acquireValuation.setValuationNumber(valuationNumber);
			acquireValuation.setValuationStatus(valuationStatus);
			acquireValuation.setValuationFolio(valuationFolio);
			acquireValuation.setValuationVolume(valuationVolume);
			acquireValuation.setModifiedDate(new Date());
			acquireValuationPersistence.update(acquireValuation);
		}else {
			acquireValuation=createAcquireValuation(CounterLocalServiceUtil.increment());
			acquireValuation.setCaseId(caseId);
			acquireValuation.setValuationNumber(valuationNumber);
			acquireValuation.setValuationStatus(valuationStatus);
			acquireValuation.setValuationFolio(valuationFolio);
			acquireValuation.setValuationVolume(valuationVolume);
			acquireValuation.setModifiedDate(new Date());
			acquireValuationPersistence.update(acquireValuation);
		}
		return acquireValuation;}
}