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

package com.nbp.jtb.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.stage.services.exception.NoSuchJtbAppBoardDecisionException;
import com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision;
import com.nbp.jtb.application.stage.services.service.base.JtbAppBoardDecisionLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jtb.application.stage.services.model.JtbAppBoardDecision",
	service = AopService.class
)
public class JtbAppBoardDecisionLocalServiceImpl
	extends JtbAppBoardDecisionLocalServiceBaseImpl {
	
	public JtbAppBoardDecision getjtb_CD_CI(String caseId) throws NoSuchJtbAppBoardDecisionException {
		return jtbAppBoardDecisionPersistence.findBygetjtb_CD_CI(caseId);
		}
	public List <JtbAppBoardDecision> getjtb_By_CD(String status) throws NoSuchJtbAppBoardDecisionException {
		return jtbAppBoardDecisionPersistence.findBygetjtb_By_CD(status);
	}
	public JtbAppBoardDecision updateJtbAppBoardDecision(String caseId,Date dateOfBoardDecision, String committeeDecision) {
		JtbAppBoardDecision applicationCommitteeDecision=null;
		try {
			applicationCommitteeDecision=getjtb_CD_CI(caseId);
		} catch (NoSuchJtbAppBoardDecisionException e) {
		}
		if(Validator.isNotNull(applicationCommitteeDecision)) {
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfBoardDecision(dateOfBoardDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setModifiedDate(new Date());
			jtbAppBoardDecisionPersistence.update(applicationCommitteeDecision);
		}else {
			applicationCommitteeDecision=createJtbAppBoardDecision(CounterLocalServiceUtil.increment());
			applicationCommitteeDecision.setCaseId(caseId);
			applicationCommitteeDecision.setDateOfBoardDecision(dateOfBoardDecision);
			applicationCommitteeDecision.setCommitteeDecision(committeeDecision);
			applicationCommitteeDecision.setCreateDate(new Date());
			jtbAppBoardDecisionPersistence.update(applicationCommitteeDecision);
		}
		return applicationCommitteeDecision;
	}



}
