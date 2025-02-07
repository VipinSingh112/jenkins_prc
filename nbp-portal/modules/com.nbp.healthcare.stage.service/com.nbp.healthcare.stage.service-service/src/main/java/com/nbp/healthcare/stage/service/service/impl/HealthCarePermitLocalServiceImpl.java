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

package com.nbp.healthcare.stage.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.healthcare.stage.service.exception.NoSuchHealthCarePermitException;
import com.nbp.healthcare.stage.service.model.HealthCarePermit;
import com.nbp.healthcare.stage.service.service.base.HealthCarePermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.healthcare.stage.service.model.HealthCarePermit", service = AopService.class)
public class HealthCarePermitLocalServiceImpl extends HealthCarePermitLocalServiceBaseImpl {
	public HealthCarePermit getHealthCareBy_CI(String caseId) throws NoSuchHealthCarePermitException {
		return healthCarePermitPersistence.findBygetHealthCareBY_CI(caseId);
	}

	public HealthCarePermit updateHealthCarePermit(String caseId, String transaction, String nameofApplicant,
			String Category, String pirPermt, String bonafideHC, String tariffCode, Date dateofIssue) {

		HealthCarePermit carePermit = null;
		try {
			carePermit = getHealthCareBy_CI(caseId);
		} catch (NoSuchHealthCarePermitException e) {
		}

		if (Validator.isNotNull(carePermit)) {
			carePermit.setNameofApplicant(nameofApplicant);
			carePermit.setCategory(Category);
			carePermit.setPermitTransaction(transaction);
			carePermit.setPirPermt(pirPermt);
			carePermit.setBonafideHC(bonafideHC);
			carePermit.setTariffCode(tariffCode);
			carePermit.setDateofIssue(dateofIssue);
			healthCarePermitPersistence.update(carePermit);
		} else {
			carePermit = createHealthCarePermit(CounterLocalServiceUtil.increment());
			carePermit.setCaseId(caseId);
			carePermit.setNameofApplicant(nameofApplicant);
			carePermit.setCategory(Category);
			carePermit.setPermitTransaction(transaction);
			carePermit.setPirPermt(pirPermt);
			carePermit.setBonafideHC(bonafideHC);
			carePermit.setTariffCode(tariffCode);
			carePermit.setDateofIssue(dateofIssue);
			healthCarePermitPersistence.update(carePermit);
		}

		return carePermit;
	}
}