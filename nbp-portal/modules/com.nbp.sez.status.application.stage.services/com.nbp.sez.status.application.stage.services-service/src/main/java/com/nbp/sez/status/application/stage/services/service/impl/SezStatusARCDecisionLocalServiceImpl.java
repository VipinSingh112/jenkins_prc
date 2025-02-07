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
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusARCDecisionException;
import com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusARCDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusARCDecision",
	service = AopService.class
)
public class SezStatusARCDecisionLocalServiceImpl
	extends SezStatusARCDecisionLocalServiceBaseImpl {
	public SezStatusARCDecision getSeStatusARCDecision_By_CI(String caseId) throws NoSuchSezStatusARCDecisionException {
		return sezStatusARCDecisionPersistence.findBygetSezStatus_Committee_Decision_By_CI(caseId);
	}
	public SezStatusARCDecision updateSezStatusARCDecision(String caseId,String committeeDecision,Date dateOfdecision) {
		SezStatusARCDecision arcDecision=null;
		try {
			arcDecision=sezStatusARCDecisionPersistence.findBygetSezStatus_Committee_Decision_By_CI(caseId);
		} catch (Exception e) {
		}
		if (arcDecision==null) {
			arcDecision=sezStatusARCDecisionPersistence.create(CounterLocalServiceUtil.increment());
		}
		arcDecision.setCaseId(caseId);
		arcDecision.setCommitteeDecision(committeeDecision);
		arcDecision.setCommitteeDecisionDate(dateOfdecision);
		sezStatusARCDecisionPersistence.update(arcDecision);
		return arcDecision;
		
	}
}