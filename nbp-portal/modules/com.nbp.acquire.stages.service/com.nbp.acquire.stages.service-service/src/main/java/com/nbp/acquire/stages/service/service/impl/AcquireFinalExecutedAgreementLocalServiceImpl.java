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
import com.nbp.acquire.stages.service.exception.NoSuchAcquireFinalExecutedAgreementException;
import com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement;
import com.nbp.acquire.stages.service.service.AcquireFinalExecutedAgreementLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireFinalExecutedAgreementLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireFinalExecutedAgreement", service = AopService.class)
public class AcquireFinalExecutedAgreementLocalServiceImpl extends AcquireFinalExecutedAgreementLocalServiceBaseImpl {
	public AcquireFinalExecutedAgreement getAcquireFinalAgreementBy_CI(String caseId)
			throws NoSuchAcquireFinalExecutedAgreementException {
		return acquireFinalExecutedAgreementPersistence.findBygetAcquire_FEA_By_CI(caseId);
	}

	public AcquireFinalExecutedAgreement updateAcquireFinalExecutedAgreement(String caseId, Date dateContractExecuted) {
		AcquireFinalExecutedAgreement acquireFinalExecutedAgreement = null;
		try {
			acquireFinalExecutedAgreement = AcquireFinalExecutedAgreementLocalServiceUtil. getAcquireFinalAgreementBy_CI(caseId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (Validator.isNotNull(acquireFinalExecutedAgreement)) {
			if (Validator.isNotNull(dateContractExecuted)) {	
				acquireFinalExecutedAgreement.setDateContractExecuted(dateContractExecuted);
			}
			AcquireFinalExecutedAgreementLocalServiceUtil.updateAcquireFinalExecutedAgreement(acquireFinalExecutedAgreement);
		} else {
			acquireFinalExecutedAgreement = AcquireFinalExecutedAgreementLocalServiceUtil.createAcquireFinalExecutedAgreement(CounterLocalServiceUtil.increment());
			acquireFinalExecutedAgreement.setCaseId(caseId);
			if (Validator.isNotNull(dateContractExecuted)) {
				acquireFinalExecutedAgreement.setDateContractExecuted(dateContractExecuted);
			}
			AcquireFinalExecutedAgreementLocalServiceUtil.updateAcquireFinalExecutedAgreement(acquireFinalExecutedAgreement);
		}

		return acquireFinalExecutedAgreement;
	}
}