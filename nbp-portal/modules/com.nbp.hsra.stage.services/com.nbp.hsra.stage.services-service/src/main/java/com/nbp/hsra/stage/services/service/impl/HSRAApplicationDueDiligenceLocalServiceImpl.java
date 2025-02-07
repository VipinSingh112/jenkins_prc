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

package com.nbp.hsra.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence;
import com.nbp.hsra.stage.services.service.base.HSRAApplicationDueDiligenceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence",
	service = AopService.class
)
public class HSRAApplicationDueDiligenceLocalServiceImpl
	extends HSRAApplicationDueDiligenceLocalServiceBaseImpl {

public HSRAApplicationDueDiligence getHSRAApplicationDueDiligenceByCI(String caseId) {
	return hsraApplicationDueDiligencePersistence.fetchBygetHSRADD_By_CAI(caseId);
	
}
public HSRAApplicationDueDiligence updateHSRAApplicationDueDiligence(String caseId,String agencyName,String  status,String  agencyDecision,String feedback) {
	HSRAApplicationDueDiligence HSRAApplicationDueDiligence =null;
	try {
		HSRAApplicationDueDiligence = getHSRAApplicationDueDiligenceByCI(caseId);
	} catch (Exception e) {
	}
	if(Validator.isNotNull(HSRAApplicationDueDiligence)) {
		HSRAApplicationDueDiligence.setStatus(status);	
		HSRAApplicationDueDiligence.setAgencyName(agencyName);
		HSRAApplicationDueDiligence.setModifiedDate(new Date());
		HSRAApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
		HSRAApplicationDueDiligence.setFeedbackReceived(feedback);
		hsraApplicationDueDiligencePersistence.update(HSRAApplicationDueDiligence);
		
	}else {
		HSRAApplicationDueDiligence = createHSRAApplicationDueDiligence(CounterLocalServiceUtil.increment(HSRAApplicationDueDiligence.class.getName()));
		HSRAApplicationDueDiligence.setCaseId(caseId);
		HSRAApplicationDueDiligence.setStatus(status);	
		HSRAApplicationDueDiligence.setAgencyName(agencyName);
		HSRAApplicationDueDiligence.setModifiedDate(new Date());
		HSRAApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
		HSRAApplicationDueDiligence.setFeedbackReceived(feedback);
		hsraApplicationDueDiligencePersistence.update(HSRAApplicationDueDiligence);
	}
	return HSRAApplicationDueDiligence;
}
@Override
public HSRAApplicationDueDiligence updateHSRAApplicationDueDiligence(String caseId, String agencyName, String status,
		String agencyDecision) {
	// TODO Auto-generated method stub
	return null;
}

}
