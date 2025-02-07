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
import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationPreInitiationException;
import com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation;
import com.nbp.jadsc.stage.services.service.base.JadscApplicationPreInitiationLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscApplicationPreInitiation",
	service = AopService.class
)
public class JadscApplicationPreInitiationLocalServiceImpl
	extends JadscApplicationPreInitiationLocalServiceBaseImpl {
	public JadscApplicationPreInitiation getJadscPreInitiationByCI(String caseId) throws NoSuchJadscApplicationPreInitiationException {
		return jadscApplicationPreInitiationPersistence.findBygetJadsc_PI_CI(caseId);
		}
	public List <JadscApplicationPreInitiation> getJadscPreInitiationByOutcome(String outcome) {
		return jadscApplicationPreInitiationPersistence.findBygetJadsc_By_PI(outcome);
	}

	public JadscApplicationPreInitiation updateJadscApplicationPreInitiation(String caseId,Date dateOfPreInitiation, String outcome) {
		JadscApplicationPreInitiation applicationPreInitiation=null;
		try {
			applicationPreInitiation=getJadscPreInitiationByCI(caseId);
		} catch (NoSuchJadscApplicationPreInitiationException e) {
		}
		if(Validator.isNotNull(applicationPreInitiation)) {
			applicationPreInitiation.setCaseId(caseId);
			applicationPreInitiation.setDateOfPreInitiation(dateOfPreInitiation);
			applicationPreInitiation.setOutcome(outcome);
			applicationPreInitiation.setModifiedDate(new Date());
			jadscApplicationPreInitiationPersistence.update(applicationPreInitiation);
		}else {
			applicationPreInitiation=createJadscApplicationPreInitiation(CounterLocalServiceUtil.increment());
			applicationPreInitiation.setCaseId(caseId);
			applicationPreInitiation.setDateOfPreInitiation(dateOfPreInitiation);
			applicationPreInitiation.setOutcome(outcome);
			applicationPreInitiation.setModifiedDate(new Date());
			jadscApplicationPreInitiationPersistence.update(applicationPreInitiation);
		}
		return applicationPreInitiation;
	}
}
