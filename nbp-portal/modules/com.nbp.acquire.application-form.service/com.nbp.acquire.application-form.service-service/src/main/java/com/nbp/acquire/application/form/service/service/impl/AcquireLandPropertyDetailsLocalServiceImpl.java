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

package com.nbp.acquire.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandPropertyDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;
import com.nbp.acquire.application.form.service.service.base.AcquireLandPropertyDetailsLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails",
	service = AopService.class
)
public class AcquireLandPropertyDetailsLocalServiceImpl
	extends AcquireLandPropertyDetailsLocalServiceBaseImpl {
	
	public AcquireLandPropertyDetails getAcquireLandPropertyDetailsById(long acquireApplicationId) throws NoSuchAcquireLandPropertyDetailsException {
		return 		acquireLandPropertyDetailsPersistence.fetchBygetAcquireById(acquireApplicationId);

		}
}