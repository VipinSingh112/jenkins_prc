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
import com.nbp.acquire.stages.service.exception.NoSuchAcquireAdvertisingException;
import com.nbp.acquire.stages.service.model.AcquireAdvertising;
import com.nbp.acquire.stages.service.model.AcquireExecution;
import com.nbp.acquire.stages.service.service.AcquireAdvertisingLocalServiceUtil;
import com.nbp.acquire.stages.service.service.base.AcquireAdvertisingLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.stages.service.model.AcquireAdvertising",
	service = AopService.class
)
public class AcquireAdvertisingLocalServiceImpl
	extends AcquireAdvertisingLocalServiceBaseImpl {
	private static Log _log =LogFactoryUtil.getLog(AcquireAdvertising.class);

	public AcquireAdvertising getAcquireAdvertisingBy_CI(String caseId) throws NoSuchAcquireAdvertisingException {
		return acquireAdvertisingPersistence.findBygetAcquireAdvertisingBy_CaseId(caseId);
		}
	public AcquireAdvertising updateAcquireApplicationAdvertising(String caseId,Date dateFrom,Date dateTo,String advertisingMediaStatus ) {
		AcquireAdvertising acquireAdvertising=null;
		try {
			acquireAdvertising=AcquireAdvertisingLocalServiceUtil.getAcquireAdvertisingBy_CI(caseId);
		} catch (NoSuchAcquireAdvertisingException e) {
		}
		if(Validator.isNotNull(acquireAdvertising)) {
			acquireAdvertising.setDateFrom(dateFrom);
			acquireAdvertising.setDateTo(dateTo);
			acquireAdvertising.setAdvertisingMediaStatus(advertisingMediaStatus);
			acquireAdvertising.setModifiedDate(new Date());
			acquireAdvertisingPersistence.update(acquireAdvertising);
		}else {
			acquireAdvertising=createAcquireAdvertising(CounterLocalServiceUtil.increment());
			acquireAdvertising.setCaseId(caseId);
			acquireAdvertising.setDateFrom(dateFrom);
			acquireAdvertising.setDateTo(dateTo);
			acquireAdvertising.setAdvertisingMediaStatus(advertisingMediaStatus);
			acquireAdvertising.setModifiedDate(new Date());
			acquireAdvertisingPersistence.update(acquireAdvertising);
		}
		return acquireAdvertising;
		}
}