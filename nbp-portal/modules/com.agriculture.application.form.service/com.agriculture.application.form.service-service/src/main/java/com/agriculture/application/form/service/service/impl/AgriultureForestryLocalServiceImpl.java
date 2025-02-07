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

import com.agriculture.application.form.service.exception.NoSuchAgriultureForestryException;
import com.agriculture.application.form.service.model.AgriultureForestry;
import com.agriculture.application.form.service.service.base.AgriultureForestryLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgriultureForestry",
	service = AopService.class
)
public class AgriultureForestryLocalServiceImpl
	extends AgriultureForestryLocalServiceBaseImpl {
	public AgriultureForestry getAgricultureById(long ApplicationId) throws NoSuchAgriultureForestryException {
		return agriultureForestryPersistence.findBygetAgricultureById(ApplicationId);
	}

   public List<AgriultureForestry> getAForest_by_AAI(long agricultureApplicationId){
	return agriultureForestryPersistence.findBygetAForest_by_AAI(agricultureApplicationId);
   }
   public void deleteAgriForestryById(long applicationId) {
	   agriultureForestryPersistence.removeBygetAForest_by_AAI(applicationId);
	}

@Override
public List<AgriultureForestry> getAF_by_AAI(long agricultureApplicatiId) {
	// TODO Auto-generated method stub
	return null;
}}
   