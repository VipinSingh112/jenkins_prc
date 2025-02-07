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

import com.agriculture.application.form.service.exception.NoSuchAgricultureAquacultureException;
import com.agriculture.application.form.service.model.AgricultureAquaculture;
import com.agriculture.application.form.service.service.base.AgricultureAquacultureLocalServiceBaseImpl;
import com.agriculture.application.form.service.service.base.AgricultureAquacultureServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultureAquaculture",
	service = AopService.class
)


public class AgricultureAquacultureLocalServiceImpl
extends AgricultureAquacultureLocalServiceBaseImpl {
public AgricultureAquaculture getAgricultureById(long ApplicationId) throws NoSuchAgricultureAquacultureException {
	return agricultureAquaculturePersistence.findBygetAgricultureById(ApplicationId);
}
 public List<AgricultureAquaculture> getAAqa_by_AAI(long agricultureApplicationId){
	return agricultureAquaculturePersistence.findBygetAAqua_by_AAI(agricultureApplicationId);
 }
 public void deleteAquaById(long applicationId) {
	 agricultureAquaculturePersistence.removeBygetAAqua_by_AAI(applicationId);
	}
}