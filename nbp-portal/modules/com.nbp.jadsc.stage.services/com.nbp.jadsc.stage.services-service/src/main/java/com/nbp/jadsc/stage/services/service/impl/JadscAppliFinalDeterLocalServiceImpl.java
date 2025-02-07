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

package com.nbp.jadsc.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliFinalDeterException;
import com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter;
import com.nbp.jadsc.stage.services.service.base.JadscAppliFinalDeterLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscAppliFinalDeter",
	service = AopService.class
)
public class JadscAppliFinalDeterLocalServiceImpl
	extends JadscAppliFinalDeterLocalServiceBaseImpl {
	public JadscAppliFinalDeter getJadscAppliFinalDeterByCI(String caseId) throws NoSuchJadscAppliFinalDeterException  {
		return jadscAppliFinalDeterPersistence.findBygetJadsc_FD_CI(caseId);
		}
	public List <JadscAppliFinalDeter> getJadscAppliFinalDeterByOutcome(String outcome) {
		return jadscAppliFinalDeterPersistence.findBygetJadsc_By_FD(outcome);
	}

	public JadscAppliFinalDeter updateJadscAppliFinalDeter(String caseId,Date dateOfFinalDeter, String outcome) {
		JadscAppliFinalDeter applicationFinalDeter=null;
		try {
			applicationFinalDeter=getJadscAppliFinalDeterByCI(caseId);
		} catch (NoSuchJadscAppliFinalDeterException e) {
		}
		if(Validator.isNotNull(applicationFinalDeter)) {
			applicationFinalDeter.setCaseId(caseId);
			applicationFinalDeter.setDateOfFinalDeter(dateOfFinalDeter);
			applicationFinalDeter.setOutcome(outcome);
			applicationFinalDeter.setModifiedDate(new Date());
			jadscAppliFinalDeterPersistence.update(applicationFinalDeter);
		}else {
			applicationFinalDeter=createJadscAppliFinalDeter(CounterLocalServiceUtil.increment());
			applicationFinalDeter.setCaseId(caseId);
			applicationFinalDeter.setDateOfFinalDeter(dateOfFinalDeter);
			applicationFinalDeter.setOutcome(outcome);
			applicationFinalDeter.setModifiedDate(new Date());
			jadscAppliFinalDeterPersistence.update(applicationFinalDeter);
		}
		return applicationFinalDeter;
	}
}
