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

package com.nbp.cannabis.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCurrentStageException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage;
import com.nbp.cannabis.application.form.services.service.base.CannabisApplicationCurrentStageLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage",
	service = AopService.class
)
public class CannabisApplicationCurrentStageLocalServiceImpl
	extends CannabisApplicationCurrentStageLocalServiceBaseImpl {
	
	public CannabisApplicationCurrentStage getCA_Stage_CAI(long cannabisApplicationId) throws NoSuchCannabisApplicationCurrentStageException {
		return cannabisApplicationCurrentStagePersistence.findBygetCA_Stage_CAI(cannabisApplicationId);
	}
}