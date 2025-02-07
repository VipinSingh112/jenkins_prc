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

package com.nbp.manufacturing.application.stages.services.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingPermitException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit;
import com.nbp.manufacturing.application.stages.services.service.base.ManufacturingPermitLocalServiceBaseImpl;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.manufacturing.application.stages.services.model.ManufacturingPermit",
	service = AopService.class
)
public class ManufacturingPermitLocalServiceImpl
	extends ManufacturingPermitLocalServiceBaseImpl {
	private static Log _log=LogFactoryUtil.getLog(ManufacturingPermit.class);
	public ManufacturingPermit getManufacturingPermitBY_CI(String caseId) throws NoSuchManufacturingPermitException {
		return manufacturingPermitPersistence.findBygetManufacturingPermitBY_CI(caseId);
	}
	public ManufacturingPermit getManufacturingPermitBY_PermitNumber(String pirPermitNumber) throws NoSuchManufacturingPermitException {
		return manufacturingPermitPersistence.findBygetManufacturingPermitBY_CI(pirPermitNumber);
	}
	public ManufacturingPermit getManufacturingPermitBY_Permit(String pirPermitNumber) throws NoSuchManufacturingPermitException {
		return manufacturingPermitPersistence.findBygetManufacturingPermitBY_PermitNumber(pirPermitNumber);
	}
	public ManufacturingPermit updateManufacturingPermit(String caseId,String pirPermitNumber,Date dateOfIssue,Date dateOfExpirartion, String durationOfPermit,String typeOfPermit,String numberOfExtension,String parish)
	{
		ManufacturingPermit manufacturingPermit=null;
		try {
			manufacturingPermit=getManufacturingPermitBY_CI(caseId);
		} catch (NoSuchManufacturingPermitException e) {
		}
		if(Validator.isNotNull(manufacturingPermit)) {
			_log.info("DATA EXIST CASE ID---"+caseId);
		manufacturingPermit.setCaseId(caseId);
		manufacturingPermit.setPIRPermtNumber(pirPermitNumber);
		manufacturingPermit.setDateOfIssue(dateOfIssue);
		manufacturingPermit.setDateOfExpiration(dateOfExpirartion);
		manufacturingPermit.setDurationOfPermit(durationOfPermit);
		manufacturingPermit.setTypeOfPermit(typeOfPermit);
		manufacturingPermit.setNumberOfExtensions(numberOfExtension);
		manufacturingPermit.setParish(parish);
		manufacturingPermitPersistence.update(manufacturingPermit);
		}else {
			_log.info("NEW DATA CREATED CASE ID---"+caseId);
			manufacturingPermit=createManufacturingPermit(CounterLocalServiceUtil.increment());
			manufacturingPermit.setCaseId(caseId);
			manufacturingPermit.setPIRPermtNumber(pirPermitNumber);
			manufacturingPermit.setDateOfIssue(dateOfIssue);
			manufacturingPermit.setDateOfExpiration(dateOfExpirartion);
			manufacturingPermit.setDurationOfPermit(durationOfPermit);
			manufacturingPermit.setTypeOfPermit(typeOfPermit);
			manufacturingPermit.setNumberOfExtensions(numberOfExtension);
			manufacturingPermit.setParish(parish);
			manufacturingPermitPersistence.update(manufacturingPermit);
		}
		
		return manufacturingPermit;
	}
	
}