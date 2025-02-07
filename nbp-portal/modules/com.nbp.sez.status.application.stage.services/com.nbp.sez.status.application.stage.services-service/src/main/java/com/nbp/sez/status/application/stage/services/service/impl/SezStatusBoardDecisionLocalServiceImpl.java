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

package com.nbp.sez.status.application.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusBoardDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision",
	service = AopService.class
)
public class SezStatusBoardDecisionLocalServiceImpl
	extends SezStatusBoardDecisionLocalServiceBaseImpl {
	public SezStatusBoardDecision getSezStatus_Board_Decision_By_Id(String caseId) {
		return sezStatusBoardDecisionPersistence.fetchBygetSezStatus_Board_Decision_By_CI(caseId);
	}
	public SezStatusBoardDecision updateSezStatusDecision(String caseId,Date dateOfBoardDecision,String boardDecisio) {
		SezStatusBoardDecision boardDecision=null;
		try {
			boardDecision=sezStatusBoardDecisionPersistence.findBygetSezStatus_Board_Decision_By_CI(caseId);
		} catch (Exception e) {
		}
		if (boardDecision==null) {
			boardDecision=sezStatusBoardDecisionPersistence.create(CounterLocalServiceUtil.increment());
		}
		boardDecision.setCaseId(caseId);
		boardDecision.setBoardDecisionDate(dateOfBoardDecision);
		boardDecision.setBoardDecision(boardDecisio);
		sezStatusBoardDecisionPersistence.update(boardDecision);
		
		return boardDecision;
	}
}