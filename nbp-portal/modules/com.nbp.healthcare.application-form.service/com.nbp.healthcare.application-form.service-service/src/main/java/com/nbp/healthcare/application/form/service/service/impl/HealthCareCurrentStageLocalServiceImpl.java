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
import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareCurrentStageException;
import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;
import com.nbp.healthcare.application.form.service.service.base.HealthCareCurrentStageLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage",
	service = AopService.class
)
public class HealthCareCurrentStageLocalServiceImpl
	extends HealthCareCurrentStageLocalServiceBaseImpl {
	
	public HealthCareCurrentStage getC_SById(long healthCareId) throws NoSuchHealthCareCurrentStageException {
		return healthCareCurrentStagePersistence.findBygethealthById(healthCareId);
		
	}
}