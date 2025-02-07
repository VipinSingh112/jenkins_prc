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

import com.agriculture.application.form.service.exception.NoSuchAgricultureBuildingException;
import com.agriculture.application.form.service.model.AgricultureBuilding;
import com.agriculture.application.form.service.service.base.AgricultureBuildingLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultureBuilding",
	service = AopService.class
)
public class AgricultureBuildingLocalServiceImpl
	extends AgricultureBuildingLocalServiceBaseImpl {
	public AgricultureBuilding getAgricultureById(long ApplicationId) throws NoSuchAgricultureBuildingException {
		return agricultureBuildingPersistence.findBygetAgricultureById(ApplicationId);
	}
	public List<AgricultureBuilding> getAB_by_AAI(long agricultureApplicationId){
		return agricultureBuildingPersistence.findBygetAB_by_AAI(agricultureApplicationId);
	}
	public void deleteAgriBuildingById(long applicationId) {
		agricultureBuildingPersistence.removeBygetAB_by_AAI(applicationId);
	}
}