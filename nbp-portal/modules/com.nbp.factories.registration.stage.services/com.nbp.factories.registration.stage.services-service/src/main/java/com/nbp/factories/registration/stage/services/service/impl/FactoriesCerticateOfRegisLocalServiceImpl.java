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

package com.nbp.factories.registration.stage.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesCerticateOfRegisException;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;
import com.nbp.factories.registration.stage.services.service.base.FactoriesCerticateOfRegisLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis", service = AopService.class)
public class FactoriesCerticateOfRegisLocalServiceImpl extends FactoriesCerticateOfRegisLocalServiceBaseImpl {
	public FactoriesCerticateOfRegis getFactoryCertifiResgiBy_CI(String caseId)
			throws NoSuchFactoriesCerticateOfRegisException {
		return factoriesCerticateOfRegisPersistence.findBygetFactoryCertifiResgiBy_CI(caseId);
	}

	public List<FactoriesCerticateOfRegis> getFactoryCertifiResgisBy_CI(String caseId) {
		return factoriesCerticateOfRegisPersistence.findBygetFactoryCertifiResgisBy_CI(caseId);
	}

	public FactoriesCerticateOfRegis updateFactoriesCertificateOfRegistration(String caseId, String nameOfEstablishment,
			String parish, String procuctCatAndName, Date certificateIssueDate, Date dateOfExpiration,
			String registration, String status) {
		FactoriesCerticateOfRegis certificateOfRegis = null;
		certificateOfRegis = factoriesCerticateOfRegisPersistence.create(CounterLocalServiceUtil.increment());
		certificateOfRegis.setCaseId(caseId);
		certificateOfRegis.setNameOfEstablishment(nameOfEstablishment);
		certificateOfRegis.setParish(parish);
		certificateOfRegis.setProcuctCatAndName(procuctCatAndName);
		certificateOfRegis.setCertificateIssueDate(certificateIssueDate);
		certificateOfRegis.setDateOfExpiration(dateOfExpiration);
		certificateOfRegis.setRegistration(registration);
		certificateOfRegis.setStatus(status);
		factoriesCerticateOfRegisPersistence.update(certificateOfRegis);
		return certificateOfRegis;
	}

}