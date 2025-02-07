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

package com.nbp.janaac.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.stages.services.exception.NoSuchJanaacCommitteeDecisionException;
import com.nbp.janaac.stages.services.model.JanaacCommitteeDecision;
import com.nbp.janaac.stages.services.service.base.JanaacCommitteeDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.janaac.stages.services.model.JanaacCommitteeDecision",
	service = AopService.class
)
public class JanaacCommitteeDecisionLocalServiceImpl
	extends JanaacCommitteeDecisionLocalServiceBaseImpl {
	public JanaacCommitteeDecision getJanaac_by_caseId(String caseId) throws NoSuchJanaacCommitteeDecisionException {
		return janaacCommitteeDecisionPersistence.findBygetJanaac_by_caseId(caseId);
	}

	public JanaacCommitteeDecision updateJanaacApplicationCommitteeDecision(String caseId, Date dateOfCommitteeDecision, String committeeDecision) {
		JanaacCommitteeDecision applicationCommitteeDecision = null;
		try {
			applicationCommitteeDecision = getJanaac_by_caseId(caseId);
		} catch (NoSuchJanaacCommitteeDecisionException e) {
		}
		if (Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			janaacCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		} else {
			applicationCommitteeDecision = createJanaacCommitteeDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			janaacCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}
}