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
import com.nbp.jadsc.stage.services.exception.NoSuchJadscAppliPreliminationDeteException;
import com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete;
import com.nbp.jadsc.stage.services.service.base.JadscAppliPreliminationDeteLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.jadsc.stage.services.model.JadscAppliPreliminationDete",
	service = AopService.class
)
public class JadscAppliPreliminationDeteLocalServiceImpl
	extends JadscAppliPreliminationDeteLocalServiceBaseImpl {
	public JadscAppliPreliminationDete getJadscAppliPreliminationDeteByCI(String caseId) throws NoSuchJadscAppliPreliminationDeteException{
		return jadscAppliPreliminationDetePersistence.findBygetJadsc_PD_CI(caseId);
		}
	
	public List<JadscAppliPreliminationDete> getJadscAppliPreliminationDeteByOutcome(String outcome) {
		return jadscAppliPreliminationDetePersistence.findBygetJadsc_By_PD(outcome);
	}

	public JadscAppliPreliminationDete updateJadscAppliPreliminationDete(String caseId,Date dateOfPreDete, String outcome) {
		JadscAppliPreliminationDete applicationPreliminationDete=null;
		try {
			applicationPreliminationDete=getJadscAppliPreliminationDeteByCI(caseId);
		} catch (NoSuchJadscAppliPreliminationDeteException e) {
		}
		if(Validator.isNotNull(applicationPreliminationDete)) {
			applicationPreliminationDete.setCaseId(caseId);
			applicationPreliminationDete.setDateOfPreDete(dateOfPreDete);
			applicationPreliminationDete.setOutcome(outcome);
			applicationPreliminationDete.setModifiedDate(new Date());
			jadscAppliPreliminationDetePersistence.update(applicationPreliminationDete);
		}else {
			applicationPreliminationDete=createJadscAppliPreliminationDete(CounterLocalServiceUtil.increment());
			applicationPreliminationDete.setCaseId(caseId);
			applicationPreliminationDete.setDateOfPreDete(dateOfPreDete);
			applicationPreliminationDete.setOutcome(outcome);
			applicationPreliminationDete.setModifiedDate(new Date());
			jadscAppliPreliminationDetePersistence.update(applicationPreliminationDete);
		}
		return applicationPreliminationDete;
	}
}
