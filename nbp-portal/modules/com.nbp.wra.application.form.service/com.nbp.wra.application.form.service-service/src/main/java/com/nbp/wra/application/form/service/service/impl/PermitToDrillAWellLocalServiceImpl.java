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

package com.nbp.wra.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.wra.application.form.service.exception.NoSuchPermitToDrillAWellException;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.service.base.PermitToDrillAWellLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.wra.application.form.service.model.PermitToDrillAWell",
	service = AopService.class
)
public class PermitToDrillAWellLocalServiceImpl
	extends PermitToDrillAWellLocalServiceBaseImpl {
	public PermitToDrillAWell getPermitToDrillAWell_By_WRAAppId(long wraApplicationId) throws NoSuchPermitToDrillAWellException {
		return permitToDrillAWellPersistence.findBygetWRA_By_Id(wraApplicationId);
	}

	@Override
	public PermitToDrillAWell getPermitToDrillAWell_By_Id() {
		// TODO Auto-generated method stub
		return null;
	}
}