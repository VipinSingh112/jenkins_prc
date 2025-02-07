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

package com.nbp.explosives.competency.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.stages.service.exception.NoSuchExplosiveCommisionDecisionException;
import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;
import com.nbp.explosives.competency.stages.service.service.base.ExplosiveCommisionDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision", service = AopService.class)
public class ExplosiveCommisionDecisionLocalServiceImpl extends ExplosiveCommisionDecisionLocalServiceBaseImpl {
	public ExplosiveCommisionDecision getExplosiveCommisionDecisionBy_CI(String caseId) throws NoSuchExplosiveCommisionDecisionException {
		return explosiveCommisionDecisionPersistence.findBygetEXP_CD_CI(caseId);
	}

	public ExplosiveCommisionDecision updateExplosiveCommisionDecision(String caseId, Date dateOfDecision,
			String commisionDecision) throws NoSuchExplosiveCommisionDecisionException {
		 ExplosiveCommisionDecision explosiveApplicationdecision =null;
		 try {
			 explosiveApplicationdecision =  getExplosiveCommisionDecisionBy_CI(caseId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 if(Validator.isNotNull(explosiveApplicationdecision)) {
			 explosiveApplicationdecision.setCommisionDecision(commisionDecision);
			 explosiveApplicationdecision.setDecisionDate(dateOfDecision);
			 explosiveApplicationdecision.setModifiedDate(new Date());
			 explosiveCommisionDecisionPersistence.update(explosiveApplicationdecision);
			}else {
				explosiveApplicationdecision = explosiveCommisionDecisionPersistence.create(CounterLocalServiceUtil.increment(ExplosiveCommisionDecision.class.getName()));
				explosiveApplicationdecision.setCommisionDecision(commisionDecision);
				explosiveApplicationdecision.setDecisionDate(dateOfDecision);
				explosiveApplicationdecision.setCaseId(caseId);
				explosiveApplicationdecision.setCreateDate(new Date());
				explosiveCommisionDecisionPersistence.update(explosiveApplicationdecision);
			}
			return explosiveApplicationdecision;
		 }
}