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
import com.nbp.acquire.stages.service.exception.NoSuchAcquireDraftAgreementException;
import com.nbp.acquire.stages.service.model.AcquireDraftAgreement;
import com.nbp.acquire.stages.service.service.AcquireDraftAgreementLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireDraftAgreementLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireDraftAgreement",
	service = AopService.class
)
public class AcquireDraftAgreementLocalServiceImpl
	extends AcquireDraftAgreementLocalServiceBaseImpl {
	public AcquireDraftAgreement getAcquireDrafAgreementBy_CI(String caseId) throws NoSuchAcquireDraftAgreementException {
		return acquireDraftAgreementPersistence.findBygetAcquire_DA_By_CI(caseId);
	}
	
	public AcquireDraftAgreement updateAcquireDraftAgreement(String caseId,String paymentAmountDue)
	{
		AcquireDraftAgreement draftAgreement=null;
		try {
		draftAgreement=AcquireDraftAgreementLocalServiceUtil.getAcquireDrafAgreementBy_CI(caseId);
		}catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(draftAgreement)) {
			draftAgreement.setPaymentAmountDue(paymentAmountDue);
			acquireDraftAgreementPersistence.update(draftAgreement);
		}else {
			draftAgreement=AcquireDraftAgreementLocalServiceUtil.createAcquireDraftAgreement(CounterLocalServiceUtil.increment());
			draftAgreement.setCaseId(caseId);
			draftAgreement.setCreateDate(new Date());
			draftAgreement.setPaymentAmountDue(paymentAmountDue);
			AcquireDraftAgreementLocalServiceUtil.updateAcquireDraftAgreement(draftAgreement);
		}
		
		
		return draftAgreement;
	}
}