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

package com.nbp.osi.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationPermitException;
import com.nbp.osi.stages.services.model.OsiApplicationPermit;
import com.nbp.osi.stages.services.service.base.OsiApplicationPermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.osi.stages.services.model.OsiApplicationPermit", service = AopService.class)
public class OsiApplicationPermitLocalServiceImpl extends OsiApplicationPermitLocalServiceBaseImpl {
	public OsiApplicationPermit getOsiByCaseId(String caseId) throws NoSuchOsiApplicationPermitException {
		return osiApplicationPermitPersistence.findBygetOsiAppPermitByCaseId(caseId);
	}

	public OsiApplicationPermit updateOsiApplicationPermit(String caseId, Date dateOfDecision, String decision,
			Date issueDate, Date expiryDate, String permitNumber, String fileEntryId) {
		OsiApplicationPermit applicationPermit = null;
		try {
			applicationPermit = osiApplicationPermitPersistence.findBygetOsiAppPermitByCaseId(caseId);
		} catch (Exception e) {
		}
		if (Validator.isNotNull(applicationPermit)) {
			applicationPermit.setCaseId(caseId);
			applicationPermit.setDateOfDecision(dateOfDecision);
			applicationPermit.setDecision(decision);
			applicationPermit.setDateOfIssue(issueDate);
			applicationPermit.setDateOfExpiration(expiryDate);
			applicationPermit.setPermitNumber(permitNumber);
			applicationPermit.setFileEntryId(fileEntryId);
			osiApplicationPermitPersistence.update(applicationPermit);
		} else {
			applicationPermit = osiApplicationPermitPersistence.create(CounterLocalServiceUtil.increment());
			applicationPermit.setCaseId(caseId);
			applicationPermit.setDateOfDecision(dateOfDecision);
			applicationPermit.setDecision(decision);
			applicationPermit.setDateOfIssue(issueDate);
			applicationPermit.setDateOfExpiration(expiryDate);
			applicationPermit.setPermitNumber(permitNumber);
			applicationPermit.setFileEntryId(fileEntryId);
			osiApplicationPermitPersistence.update(applicationPermit);
		}

		return applicationPermit;
	}
}