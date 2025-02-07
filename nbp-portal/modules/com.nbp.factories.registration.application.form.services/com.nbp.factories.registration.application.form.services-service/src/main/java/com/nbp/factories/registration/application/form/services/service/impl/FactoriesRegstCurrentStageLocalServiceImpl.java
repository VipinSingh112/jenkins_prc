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

package com.nbp.factories.registration.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesRegstCurrentStageException;
import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.service.base.FactoriesRegstCurrentStageLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage",
	service = AopService.class
)
public class FactoriesRegstCurrentStageLocalServiceImpl
	extends FactoriesRegstCurrentStageLocalServiceBaseImpl {
	public FactoriesRegstCurrentStage getByFactories_Stage(long factoriesApplicationId) throws NoSuchFactoriesRegstCurrentStageException {
		return factoriesRegstCurrentStagePersistence.findBygetByFactories_Stage(factoriesApplicationId);
	}
}