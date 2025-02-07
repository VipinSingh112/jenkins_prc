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

package com.nbp.hsra.application.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationCurrentStageException;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;
import com.nbp.hsra.application.service.service.base.HsraApplicationCurrentStageLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.application.service.model.HsraApplicationCurrentStage",
	service = AopService.class
)
public class HsraApplicationCurrentStageLocalServiceImpl
	extends HsraApplicationCurrentStageLocalServiceBaseImpl {
	public HsraApplicationCurrentStage getHsra_Stage_HAI(long hsraApplicationId) throws NoSuchHsraApplicationCurrentStageException {
		return hsraApplicationCurrentStagePersistence.findBygetHsra_Stage_HAI(hsraApplicationId);
	}
}