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

import com.agriculture.application.form.service.exception.NoSuchAgricultureApicultureException;
import com.agriculture.application.form.service.model.AgricultureApiculture;
import com.agriculture.application.form.service.service.base.AgricultureApicultureLocalServiceBaseImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureApiculturePersistence;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultureApiculture",
	service = AopService.class
)
public class AgricultureApicultureLocalServiceImpl
	extends AgricultureApicultureLocalServiceBaseImpl {
	public AgricultureApiculture getAgricultureById(long ApplicationId) throws NoSuchAgricultureApicultureException {
		return agricultureApiculturePersistence.findBygetAgricultureById(ApplicationId);
	}
	
	public List<AgricultureApiculture> getAApi_by_AAI(long agricultureApplicationId){
		return agricultureApiculturePersistence.findBygetAApi_by_AAI(agricultureApplicationId);

	}
	public void deleteAgriApicultureById(long applicationId) {
		agricultureApiculturePersistence.removeBygetAApi_by_AAI(applicationId);
	}
}