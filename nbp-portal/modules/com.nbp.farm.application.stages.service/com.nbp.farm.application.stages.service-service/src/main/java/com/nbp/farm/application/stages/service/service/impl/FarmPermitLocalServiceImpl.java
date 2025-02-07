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

package com.nbp.farm.application.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.farm.application.stages.service.exception.NoSuchFarmPermitException;
import com.nbp.farm.application.stages.service.model.FarmPermit;
import com.nbp.farm.application.stages.service.service.base.FarmPermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.stages.service.model.FarmPermit",
	service = AopService.class
)
public class FarmPermitLocalServiceImpl extends FarmPermitLocalServiceBaseImpl {
	private static Log _log=LogFactoryUtil.getLog(FarmPermit.class.getName());
	public FarmPermit getFarmBY_CI(String caseId) throws NoSuchFarmPermitException {
		return farmPermitPersistence.findBygetFarmBy_CI(caseId);
	}
	
	public FarmPermit updateFarmPermit(String caseId, String PIRPermtNumber, Date dateofIssue, Date dateofExpiration,
			long docFileEntryId,String durationOfPermit) {
		FarmPermit farmPermit = null;

		try {
			farmPermit = farmPermitPersistence.findBygetFarmBy_CI(caseId);
		} catch (Exception e) {
			_log.error(e);
		}
		if (Validator.isNotNull(farmPermit)) {
			farmPermit.setPirPermtNumber(PIRPermtNumber);
			farmPermit.setDateofIssue(dateofIssue);
			farmPermit.setDateOfExpiration(dateofExpiration);
			farmPermit.setPirCertificateNUmber(docFileEntryId);
			farmPermit.setDuration(durationOfPermit);
			farmPermitPersistence.update(farmPermit);
		} else {
			farmPermit = farmPermitPersistence.create(CounterLocalServiceUtil.increment());
			farmPermit.setCaseId(caseId);
			farmPermit.setPirPermtNumber(PIRPermtNumber);
			farmPermit.setDateofIssue(dateofIssue);
			farmPermit.setDateOfExpiration(dateofExpiration);
			farmPermit.setDuration(durationOfPermit);
			farmPermitPersistence.update(farmPermit);
		}
		return farmPermit;
	}

	@Override
	public FarmPermit updateFarmPermit(String caseId, String PIRPermtNumber, Date dateofIssue, Date dateofExpiration,
			long docFileEntryId) {
		// TODO Auto-generated method stub
		return null;
	}
}