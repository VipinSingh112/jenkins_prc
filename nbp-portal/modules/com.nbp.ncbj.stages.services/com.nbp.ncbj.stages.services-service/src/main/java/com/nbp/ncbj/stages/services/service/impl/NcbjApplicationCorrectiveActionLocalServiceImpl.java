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
import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationCorrectiveActionException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;
import com.nbp.ncbj.stages.services.service.base.NcbjApplicationCorrectiveActionLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction",
	service = AopService.class
)
public class NcbjApplicationCorrectiveActionLocalServiceImpl
	extends NcbjApplicationCorrectiveActionLocalServiceBaseImpl {
	public NcbjApplicationCorrectiveAction getPreAPprovalConditionBy_CI(String caseId) throws NoSuchNcbjApplicationCorrectiveActionException {
		return ncbjApplicationCorrectiveActionPersistence.findBygetPreAPprovalConditionBy_CI(caseId);  
	}
	
	public NcbjApplicationCorrectiveAction updateCorrectionAction(String caseId,long ncbjAppCorrActionId) {
		NcbjApplicationCorrectiveAction approvalConditions=null;
		try {
			approvalConditions=ncbjApplicationCorrectiveActionPersistence.findBygetPreAPprovalConditionBy_CI(caseId);
		} catch (Exception e) {
		}
	
		if(approvalConditions==null) {
			approvalConditions=ncbjApplicationCorrectiveActionPersistence.create(CounterLocalServiceUtil.increment());
		}
		approvalConditions.setCaseId(caseId);
		approvalConditions.setPreApprovalLetterId(ncbjAppCorrActionId);
		ncbjApplicationCorrectiveActionPersistence.update(approvalConditions);
		
		return approvalConditions;
		
	}
	
}