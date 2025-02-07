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

import com.agriculture.application.form.service.exception.NoSuchAgriApplicationCurrentStageException;
import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;
import com.agriculture.application.form.service.service.base.AgriApplicationCurrentStageLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgriApplicationCurrentStage",
	service = AopService.class
)
public  class AgriApplicationCurrentStageLocalServiceImpl
	extends AgriApplicationCurrentStageLocalServiceBaseImpl {
	public AgriApplicationCurrentStage getAgricultureById(long agricultureApplicationId) throws NoSuchAgriApplicationCurrentStageException {
		return agriApplicationCurrentStagePersistence.fetchBygetAgricultureById(agricultureApplicationId);}

public AgriApplicationCurrentStage getAA_Stage_AAI(long agricultureApplicationId) throws NoSuchAgriApplicationCurrentStageException {
	return agriApplicationCurrentStagePersistence.findBygetAA_Stage_AAI(agricultureApplicationId);
  }

@Override
public AgriApplicationCurrentStage getAA_stage_AAI(long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException {
	// TODO Auto-generated method stub
	return null;
}
}