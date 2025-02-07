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

package com.nbp.creative.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.creative.stages.services.exception.NoSuchCreativePermitException;
import com.nbp.creative.stages.services.model.CreativePermit;
import com.nbp.creative.stages.services.service.base.CreativePermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.creative.stages.services.model.CreativePermit", service = AopService.class)
public class CreativePermitLocalServiceImpl extends CreativePermitLocalServiceBaseImpl {
	public CreativePermit getCreativePermitBy_CI(String caseId) throws NoSuchCreativePermitException {
		return creativePermitPersistence.findBygetCreativePermitBy_CI(caseId);
	}

	public CreativePermit updateAgriculturePermit(String caseId, String PIRPermtNumber, Date dateofIssue,
			Date dateofExpiration, String durationofPermit) {
		CreativePermit creativePermit = null;
		try {
			creativePermit = creativePermitPersistence.findBygetCreativePermitBy_CI(caseId);
		} catch (NoSuchCreativePermitException e) {
		}
		if (Validator.isNotNull(creativePermit)) {
			creativePermit.setPirPermtNumber(PIRPermtNumber);
			creativePermit.setDateofIssue(dateofIssue);
			creativePermit.setDateOfExpiration(dateofExpiration);
			creativePermit.setDurationOfPermit(durationofPermit);
			creativePermitPersistence.update(creativePermit);
		} else {
			creativePermit = createCreativePermit(CounterLocalServiceUtil.increment());
			creativePermit.setCaseId(caseId);
			creativePermit.setPirPermtNumber(PIRPermtNumber);
			creativePermit.setDateofIssue(dateofIssue);
			creativePermit.setDateOfExpiration(dateofExpiration);
			creativePermit.setDurationOfPermit(durationofPermit);
			creativePermitPersistence.update(creativePermit);
		}
		return creativePermit;

	}
}