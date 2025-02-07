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

package com.nbp.wra.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;
import com.nbp.wra.stage.service.service.base.WRAApplicationDueDiligenceLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.stage.service.model.WRAApplicationDueDiligence",
	service = AopService.class
)
public class WRAApplicationDueDiligenceLocalServiceImpl
	extends WRAApplicationDueDiligenceLocalServiceBaseImpl {
	
	
	public WRAApplicationDueDiligence getWRApplicationDueDiligenceByCI(String caseId) {
		return wraApplicationDueDiligencePersistence.fetchBygetWRADD_By_CAI(caseId);
		
	}
	public WRAApplicationDueDiligence updateWRApplicationDueDiligence(String caseId,String agencyName,String  status,String  agencyDecision,String feedback) {
		WRAApplicationDueDiligence wRApplicationDueDiligence =null;
		try {
			wRApplicationDueDiligence = getWRApplicationDueDiligenceByCI(caseId);
		} catch (Exception e) {
		}
		if(Validator.isNotNull(wRApplicationDueDiligence)) {
			wRApplicationDueDiligence.setStatus(status);	
			wRApplicationDueDiligence.setAgencyName(agencyName);
			wRApplicationDueDiligence.setModifiedDate(new Date());
			wRApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
			wRApplicationDueDiligence.setFeedbackReceived(feedback);
			wraApplicationDueDiligencePersistence.update(wRApplicationDueDiligence);
			
		}else {
			wRApplicationDueDiligence = createWRAApplicationDueDiligence(CounterLocalServiceUtil.increment(WRAApplicationDueDiligence.class.getName()));
			wRApplicationDueDiligence.setCaseId(caseId);
			wRApplicationDueDiligence.setStatus(status);	
			wRApplicationDueDiligence.setAgencyName(agencyName);
			wRApplicationDueDiligence.setModifiedDate(new Date());
			wRApplicationDueDiligence.setDurationOfTimeSpent(agencyDecision);
			wRApplicationDueDiligence.setFeedbackReceived(feedback);
			wraApplicationDueDiligencePersistence.update(wRApplicationDueDiligence);
		}
		return wRApplicationDueDiligence;
	}
}