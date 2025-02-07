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

package com.nbp.sez.status.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevProposedProjectException;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;
import com.nbp.sez.status.application.form.service.service.base.SezDevProposedProjectLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.sez.status.application.form.service.model.SezDevProposedProject",
	service = AopService.class
)
public class SezDevProposedProjectLocalServiceImpl
	extends SezDevProposedProjectLocalServiceBaseImpl {
	public SezDevProposedProject getSezById(long sezStatusApplicationId) throws NoSuchSezDevProposedProjectException{
		return sezDevProposedProjectPersistence.findBygetSezStatusByAppId(sezStatusApplicationId);
	}
}