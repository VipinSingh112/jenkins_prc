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

package com.nbp.medical.facilities.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalNurseStaffPremisesException;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;
import com.nbp.medical.facilities.application.form.service.service.base.MedicalNurseStaffPremisesLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises",
	service = AopService.class
)
public class MedicalNurseStaffPremisesLocalServiceImpl
	extends MedicalNurseStaffPremisesLocalServiceBaseImpl {
	public MedicalNurseStaffPremises getMedicalFacilities_ByAppId(long applicationId) throws NoSuchMedicalNurseStaffPremisesException {
		return medicalNurseStaffPremisesPersistence.findBygetMedicalFacilities_ByAppId(applicationId);
		
	}
	
}