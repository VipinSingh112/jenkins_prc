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

package com.nbp.ncbj.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.ncbj.stages.services.exception.NoSuchNcbjAppBoardDecisionException;
import com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision;
import com.nbp.ncbj.stages.services.service.base.NcbjAppBoardDecisionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncbj.stages.services.model.NcbjAppBoardDecision",
	service = AopService.class
)
public class NcbjAppBoardDecisionLocalServiceImpl
	extends NcbjAppBoardDecisionLocalServiceBaseImpl {
	
	public NcbjAppBoardDecision getNcbj_CD_CI(String caseId) throws NoSuchNcbjAppBoardDecisionException {
		return ncbjAppBoardDecisionPersistence.findBygetNcbj_CD_CI(caseId);
		}
	public List <NcbjAppBoardDecision> getNcbj_By_CD(String status) throws NoSuchNcbjAppBoardDecisionException {
		return ncbjAppBoardDecisionPersistence.findBygetNcbj_By_CD(status);
	}
	public NcbjAppBoardDecision updateJtbAppBoardDecision(String caseId,Date dateOfBoardDecision, String committeeDecision) {
		NcbjAppBoardDecision applicationCommitteeDecision=null;
		try {
			applicationCommitteeDecision=getNcbj_CD_CI(caseId);
		} catch (NoSuchNcbjAppBoardDecisionException e) {
		}
		if(Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfBoardDecision(dateOfBoardDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			ncbjAppBoardDecisionPersistence.update(applicationCommitteeDecision);
		}else {
			applicationCommitteeDecision=createNcbjAppBoardDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfBoardDecision(dateOfBoardDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setCreateDate(new Date());
			ncbjAppBoardDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}
}