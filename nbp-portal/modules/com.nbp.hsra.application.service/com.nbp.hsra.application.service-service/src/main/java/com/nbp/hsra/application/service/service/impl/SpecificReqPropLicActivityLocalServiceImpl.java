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
import com.nbp.hsra.application.service.exception.NoSuchSpecificReqPropLicActivityException;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.service.base.SpecificReqPropLicActivityLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.hsra.application.service.model.SpecificReqPropLicActivity",
	service = AopService.class
)
public class SpecificReqPropLicActivityLocalServiceImpl
	extends SpecificReqPropLicActivityLocalServiceBaseImpl {
	public SpecificReqPropLicActivity getHsraById(long hsraApplicationId) throws NoSuchSpecificReqPropLicActivityException  {
		return specificReqPropLicActivityPersistence.findBygetHsraById(hsraApplicationId);
	}
}