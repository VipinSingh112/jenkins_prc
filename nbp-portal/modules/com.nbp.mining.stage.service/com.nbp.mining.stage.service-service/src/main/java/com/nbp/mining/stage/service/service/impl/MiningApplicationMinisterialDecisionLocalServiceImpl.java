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

package com.nbp.mining.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationMinisterialDecisionException;
import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;
import com.nbp.mining.stage.service.service.base.MiningApplicationMinisterialDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision", service = AopService.class)
public class MiningApplicationMinisterialDecisionLocalServiceImpl
		extends MiningApplicationMinisterialDecisionLocalServiceBaseImpl {
	public MiningApplicationMinisterialDecision getMiningApplicationMinisterialDecisionByCI(String caseId)
			throws NoSuchMiningApplicationMinisterialDecisionException {
		return miningApplicationMinisterialDecisionPersistence.findBygetMining_APP_By_CI(caseId);
	}

	public MiningApplicationMinisterialDecision updateMiningMinisterialDecision(String caseId, String committeeDecision,
			Date dateofCommitteeDecision, Date dateOfExpiration, String certificateNumber) {
		MiningApplicationMinisterialDecision ministerialDecision = null;
		try {
			ministerialDecision = miningApplicationMinisterialDecisionPersistence.findBygetMining_APP_By_CI(caseId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(ministerialDecision)) {
			ministerialDecision.setDateOfCommDec(dateofCommitteeDecision);
			ministerialDecision.setCommDecision(committeeDecision);
			miningApplicationMinisterialDecisionPersistence.update(ministerialDecision);
		} else {
			ministerialDecision = miningApplicationMinisterialDecisionPersistence
					.create(CounterLocalServiceUtil.increment());
			ministerialDecision.setCaseId(caseId);
			ministerialDecision.setDateOfCommDec(dateofCommitteeDecision);
			ministerialDecision.setCommDecision(committeeDecision);
			miningApplicationMinisterialDecisionPersistence.update(ministerialDecision);
		}
		return ministerialDecision;
	}

	@Override
	public MiningApplicationMinisterialDecision updateMiningMinisterialDecision(String caseId, String committeeDecision,
			java.sql.Date dateofCommitteeDecision, java.sql.Date dateOfExpiration, String certificateNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}