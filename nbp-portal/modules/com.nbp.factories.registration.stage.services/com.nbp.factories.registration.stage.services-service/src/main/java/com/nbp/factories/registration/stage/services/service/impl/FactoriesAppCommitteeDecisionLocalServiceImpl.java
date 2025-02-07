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

package com.nbp.factories.registration.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesAppCommitteeDecisionException;
import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;
import com.nbp.factories.registration.stage.services.service.base.FactoriesAppCommitteeDecisionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision",
	service = AopService.class
)
public class FactoriesAppCommitteeDecisionLocalServiceImpl
	extends FactoriesAppCommitteeDecisionLocalServiceBaseImpl {
	public FactoriesAppCommitteeDecision getFactory_CD_CI(String caseId) throws NoSuchFactoriesAppCommitteeDecisionException {
		return factoriesAppCommitteeDecisionPersistence.findBygetFactory_CD_CI(caseId);
		}
	public List <FactoriesAppCommitteeDecision> getFactory_By_CD(String status) throws NoSuchFactoriesAppCommitteeDecisionException {
		return factoriesAppCommitteeDecisionPersistence.findBygetFactory_By_CD(status);
	}
	public FactoriesAppCommitteeDecision updateQuarryApplicationCommitteeDecision(String caseId,Date dateOfCommitteeDecision, String committeeDecision) {
		FactoriesAppCommitteeDecision applicationCommitteeDecision=null;
		try {
			applicationCommitteeDecision=getFactory_CD_CI(caseId);
		} catch (NoSuchFactoriesAppCommitteeDecisionException e) {
		}
		if(Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			factoriesAppCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}else {
			applicationCommitteeDecision=createFactoriesAppCommitteeDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfCommitteeDecision(dateOfCommitteeDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setCreateDate(new Date());
			factoriesAppCommitteeDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}


}