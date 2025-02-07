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

package com.nbp.tourism.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.tourism.application.stages.services.exception.NoSuchTourismPermitException;
import com.nbp.tourism.application.stages.services.model.TourismPermit;
import com.nbp.tourism.application.stages.services.service.TourismPermitLocalServiceUtil;
import com.nbp.tourism.application.stages.services.service.base.TourismPermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.nbp.tourism.application.stages.services.model.TourismPermit", service = AopService.class)
public class TourismPermitLocalServiceImpl extends TourismPermitLocalServiceBaseImpl {
	private static Log _log = LogFactoryUtil.getLog(TourismPermit.class);

	public TourismPermit getTourisPermitBy_CI(String caseId) throws NoSuchTourismPermitException {

		return tourismPermitPersistence.findBygetManufacturingPermitBY_CI(caseId);
	}

	public TourismPermit updateTourismPermit(String caseId, String pirPermitNumber, Date dateOfIssue,
			Date dateOfExpirartion, String durationOfPermit, String typeOfPermit, String numberOfExtension) {

		TourismPermit permit = null;
		try {
			permit = getTourisPermitBy_CI(caseId);
		} catch (NoSuchTourismPermitException e) {
			// TODO Auto-generated catch block
		}
		if (Validator.isNotNull(permit)) {
			_log.info("DATA EXIST CASE ID---" + caseId);
			permit.setCaseId(caseId);
			permit.setPIRPermtNumber(pirPermitNumber);
			permit.setDateOfIssue(dateOfIssue);
			permit.setDateOfExpiration(dateOfExpirartion);
			permit.setDurationOfPermit(durationOfPermit);
			permit.setTypeOfPermit(typeOfPermit);
			permit.setNumberOfExtensions(numberOfExtension);
			tourismPermitPersistence.update(permit);
		} else {
			_log.info("NEW DATA CREATED CASE ID---" + caseId);
			permit=createTourismPermit(CounterLocalServiceUtil.increment());
			permit.setCaseId(caseId);
			permit.setPIRPermtNumber(pirPermitNumber);
			permit.setDateOfIssue(dateOfIssue);
			permit.setDateOfExpiration(dateOfExpirartion);
			permit.setDurationOfPermit(durationOfPermit);
			permit.setTypeOfPermit(typeOfPermit);
			permit.setNumberOfExtensions(numberOfExtension);
			tourismPermitPersistence.update(permit);
		}

		return permit;
	}

}
