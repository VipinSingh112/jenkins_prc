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
import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationDueDiligenceException;
import com.nbp.mining.stage.service.model.MiningApplicationCertificateIssuance;
import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;
import com.nbp.mining.stage.service.service.base.MiningApplicationDueDiligenceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.mining.stage.service.model.MiningApplicationDueDiligence",
	service = AopService.class
)
public class MiningApplicationDueDiligenceLocalServiceImpl
	extends MiningApplicationDueDiligenceLocalServiceBaseImpl {
	public MiningApplicationDueDiligence getMiningApplicationDueDiligenceByCI(String caseId) throws NoSuchMiningApplicationDueDiligenceException {
		return miningApplicationDueDiligencePersistence.findBygetMining_APP_By_CI(caseId);
	}
	public MiningApplicationDueDiligence updateMiningApplicationDueDiligence(String caseId, String agencyName,
			String statusOfSubmission,String feedbackReceived,String status) {
		MiningApplicationDueDiligence dueDiligence = null;
		try {
			dueDiligence = miningApplicationDueDiligencePersistence.findBygetMining_APP_By_CI(caseId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Validator.isNotNull(dueDiligence)) {
			dueDiligence.setAgencyName(agencyName);
			dueDiligence.setFeedbackReceived(feedbackReceived);
			dueDiligence.setStatus(status);
			dueDiligence.setIsSubToAgency(statusOfSubmission);
			miningApplicationDueDiligencePersistence.update(dueDiligence);
		} else {
			dueDiligence = miningApplicationDueDiligencePersistence.create(CounterLocalServiceUtil.increment());
			dueDiligence.setCaseId(caseId);
			dueDiligence.setAgencyName(agencyName);
			dueDiligence.setFeedbackReceived(feedbackReceived);
			dueDiligence.setStatus(status);
			dueDiligence.setIsSubToAgency(statusOfSubmission);
			miningApplicationDueDiligencePersistence.update(dueDiligence);
		}
		return dueDiligence;
	}
}