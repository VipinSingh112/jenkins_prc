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

package com.nbp.healthcare.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.healthcare.application.form.service.exception.NoSuchHealthcareEquipHeadingListException;
import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;
import com.nbp.healthcare.application.form.service.service.base.HealthcareEquipHeadingListLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList",
	service = AopService.class
)
public class HealthcareEquipHeadingListLocalServiceImpl
	extends HealthcareEquipHeadingListLocalServiceBaseImpl {
	public HealthcareEquipHeadingList get_HL_HD(String healthcareDescription) throws NoSuchHealthcareEquipHeadingListException {
		return healthcareEquipHeadingListPersistence.findByget_HL_HD(healthcareDescription);
	}
}