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

package com.nbp.entity.information.services.service.impl;

import com.liferay.portal.aop.AopService;

import com.nbp.entity.information.services.exception.NoSuchEntityInformationException;
import com.nbp.entity.information.services.model.EntityInformation;
import com.nbp.entity.information.services.service.base.EntityInformationLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.entity.information.services.model.EntityInformation",
	service = AopService.class
)
public class EntityInformationLocalServiceImpl
	extends EntityInformationLocalServiceBaseImpl {

	public EntityInformation getEntityInformationByEntityNumber(String entityNumber) throws NoSuchEntityInformationException {
		return entityInformationPersistence.findByentityNumber(entityNumber);
	}

}