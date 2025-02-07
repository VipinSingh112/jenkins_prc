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
import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationInitiateInvestigationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation;
import com.nbp.jadsc.stage.services.service.base.JadscApplicationInitiateInvestigationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscApplicationInitiateInvestigation", service = AopService.class)
public class JadscApplicationInitiateInvestigationLocalServiceImpl
		extends JadscApplicationInitiateInvestigationLocalServiceBaseImpl {
	public JadscApplicationInitiateInvestigation getJadscApplicationInitiateInvestigationByCI(String caseId)
			throws NoSuchJadscApplicationInitiateInvestigationException {
		return jadscApplicationInitiateInvestigationPersistence.findBygetJadsc_II_CI(caseId);
	}

	public List<JadscApplicationInitiateInvestigation> getJadscApplicationInitiateInvestigationBy_List_CI(
			String outcome) {
		return jadscApplicationInitiateInvestigationPersistence.findBygetJadsc_By_II(outcome);
	}

	public JadscApplicationInitiateInvestigation updateJadscApplicationInitiateInvestigation(String caseId,
			Date dateOfInitiationInvestrigation, String outcome) {
		JadscApplicationInitiateInvestigation applicationInitiationInvestigation = null;
		try {
			applicationInitiationInvestigation = getJadscApplicationInitiateInvestigationByCI(caseId);

		} catch (NoSuchJadscApplicationInitiateInvestigationException e) {
		}
		if (Validator.isNotNull(applicationInitiationInvestigation)) {
			applicationInitiationInvestigation.setCaseId(caseId);
			applicationInitiationInvestigation.setDateOfIniInvest(dateOfInitiationInvestrigation);
			applicationInitiationInvestigation.setOutcome(outcome);
			applicationInitiationInvestigation.setModifiedDate(new Date());
			jadscApplicationInitiateInvestigationPersistence.update(applicationInitiationInvestigation);
		} else {
			applicationInitiationInvestigation = createJadscApplicationInitiateInvestigation(CounterLocalServiceUtil.increment());
			applicationInitiationInvestigation.setCaseId(caseId);
			applicationInitiationInvestigation.setDateOfIniInvest(dateOfInitiationInvestrigation);
			applicationInitiationInvestigation.setOutcome(outcome);
			applicationInitiationInvestigation.setModifiedDate(new Date());
			jadscApplicationInitiateInvestigationPersistence.update(applicationInitiationInvestigation);
		}
		return applicationInitiationInvestigation;
	}
}