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

package com.nbp.miic.stages.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.miic.stages.service.exception.NoSuchMiicRecommendationsDecisionException;
import com.nbp.miic.stages.service.model.MiicRecommendationsDecision;
import com.nbp.miic.stages.service.service.MiicRecommendationsDecisionLocalServiceUtil;
import com.nbp.miic.stages.service.service.base.MiicRecommendationsDecisionLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.miic.stages.service.model.MiicRecommendationsDecision", service = AopService.class)
public class MiicRecommendationsDecisionLocalServiceImpl extends MiicRecommendationsDecisionLocalServiceBaseImpl {
	public MiicRecommendationsDecision getMiic_RD_by_CI(String caseId)
			throws NoSuchMiicRecommendationsDecisionException {
		return miicRecommendationsDecisionPersistence.findBygetMiic_RD_by_CI(caseId);
	}

	public MiicRecommendationsDecision updateMiicRecommendationsDecision(String caseId,
			Date dateOfRecommendationsDecision, String recommendationsDecision) {
		MiicRecommendationsDecision recommendationDecisionData = null;
		try {
			recommendationDecisionData = MiicRecommendationsDecisionLocalServiceUtil.getMiic_RD_by_CI(caseId);
		} catch (NoSuchMiicRecommendationsDecisionException e) {
		}
		if (Validator.isNotNull(recommendationDecisionData)) {
			recommendationDecisionData.setCaseId(caseId);
			recommendationDecisionData.setDateOfRecommendationsDecision(dateOfRecommendationsDecision);
			recommendationDecisionData.setRecommendationsDecision(recommendationsDecision);
			miicRecommendationsDecisionPersistence.update(recommendationDecisionData);
		} else {
			recommendationDecisionData = miicRecommendationsDecisionPersistence
					.create(CounterLocalServiceUtil.increment());
			recommendationDecisionData.setCaseId(caseId);
			recommendationDecisionData.setDateOfRecommendationsDecision(dateOfRecommendationsDecision);
			recommendationDecisionData.setRecommendationsDecision(recommendationsDecision);
			miicRecommendationsDecisionPersistence.update(recommendationDecisionData);
		}
		return recommendationDecisionData;

	}

}