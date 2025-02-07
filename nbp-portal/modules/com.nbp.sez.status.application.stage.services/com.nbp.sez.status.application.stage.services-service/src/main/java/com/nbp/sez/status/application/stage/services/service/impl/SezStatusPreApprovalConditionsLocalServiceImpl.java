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
import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPreApprovalConditionsException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;
import com.nbp.sez.status.application.stage.services.service.base.SezStatusPreApprovalConditionsLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions",
	service = AopService.class
)
public class SezStatusPreApprovalConditionsLocalServiceImpl
	extends SezStatusPreApprovalConditionsLocalServiceBaseImpl {
	public SezStatusPreApprovalConditions getPreApprovalCondition_By_CI(String caseId) throws NoSuchSezStatusPreApprovalConditionsException {
		return sezStatusPreApprovalConditionsPersistence.findBygetPreAPprovalConditionBy_CI(caseId);
	}
	public SezStatusPreApprovalConditions updatePreApprovalConditions(String caseId,long preApprovalConditionLetterId) {
		SezStatusPreApprovalConditions approvalConditions=null;
		try {
			approvalConditions=sezStatusPreApprovalConditionsPersistence.findBygetPreAPprovalConditionBy_CI(caseId);
		} catch (Exception e) {
		}
	
		if(approvalConditions==null) {
			approvalConditions=sezStatusPreApprovalConditionsPersistence.create(CounterLocalServiceUtil.increment());
		}
		approvalConditions.setCaseId(caseId);
		approvalConditions.setPreApprovalLetterId(preApprovalConditionLetterId);
		sezStatusPreApprovalConditionsPersistence.update(approvalConditions);
		
		return approvalConditions;
		
	}
}