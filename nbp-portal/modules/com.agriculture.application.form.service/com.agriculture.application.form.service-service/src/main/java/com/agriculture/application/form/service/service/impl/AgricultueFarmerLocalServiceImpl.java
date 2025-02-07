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

import com.agriculture.application.form.service.exception.NoSuchAgricultueFarmerException;
import com.agriculture.application.form.service.model.AgricultueFarmer;
import com.agriculture.application.form.service.service.base.AgricultueFarmerLocalServiceBaseImpl;
import com.agriculture.application.form.service.service.persistence.AgricultueFarmerPersistence;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.agriculture.application.form.service.model.AgricultueFarmer",
	service = AopService.class
)
public class AgricultueFarmerLocalServiceImpl
	extends AgricultueFarmerLocalServiceBaseImpl {
	public AgricultueFarmer getAgricultureById(long ApplicationId) throws NoSuchAgricultueFarmerException {
		return agricultueFarmerPersistence.fetchBygetAgricultureById(ApplicationId);
	}
			
	public List<AgricultueFarmer> getAF_by_AAI(long agricultureApplicationId){
		return agricultueFarmerPersistence.findBygetAF_by_AAI(agricultureApplicationId);
		 
	}
	public void deleteAgriFarmById(long applicationId) {
		agricultueFarmerPersistence.removeBygetAF_by_AAI(applicationId);
	}
	}
