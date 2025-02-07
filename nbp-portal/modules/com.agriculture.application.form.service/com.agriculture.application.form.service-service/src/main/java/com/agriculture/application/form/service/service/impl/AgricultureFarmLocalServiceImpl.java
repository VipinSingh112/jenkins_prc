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

package com.agriculture.application.form.service.service.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureFarmException;
import com.agriculture.application.form.service.model.AgricultureFarm;
import com.agriculture.application.form.service.service.base.AgricultureFarmLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultureFarm",
	service = AopService.class
)
public class AgricultureFarmLocalServiceImpl
	extends AgricultureFarmLocalServiceBaseImpl {
	public AgricultureFarm getAgricultureById(long ApplicationId) throws NoSuchAgricultureFarmException {
		return agricultureFarmPersistence.fetchBygetAgricultureById(ApplicationId);
	}
	public List<AgricultureFarm>  getAFa_by_AAI(long agricultureApplicationId){
		return agricultureFarmPersistence.findBygetAFa_by_AAI(agricultureApplicationId);
		
	}
	public void deleteAgriFarmerById(long applicationId) {
		agricultureFarmPersistence.removeBygetAFa_by_AAI(applicationId);
	}
} 