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

package com.nbp.cannabis.application.form.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;
import com.nbp.cannabis.application.form.services.service.base.CannabisConsentBySoleOwnerLocalServiceBaseImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisConsentBySoleOwnerPersistence;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner",
	service = AopService.class
)
public class CannabisConsentBySoleOwnerLocalServiceImpl
	extends CannabisConsentBySoleOwnerLocalServiceBaseImpl {
	public List<CannabisConsentBySoleOwner> getCA_CSO_BY_CAI(long cannabisApplicationId) {
		return cannabisConsentBySoleOwnerPersistence.findBygetCA_CSO_BY_CAI(cannabisApplicationId);
	}
	/*
	 * public void deleteCS_CSO_CAI(long cannabisApplicationId){
	 * cannabisConsentBySoleOwnerPersistence.removeBygetCA_CSO_BY_CAI(
	 * cannabisApplicationId); }
	 */

	@Override
	public void deleteCS_CSO_CAI(long cannabisApplicationId) {
		// TODO Auto-generated method stub
		cannabisConsentBySoleOwnerPersistence.removeBygetCA_CSO_BY_CAI(cannabisApplicationId);
		
	}
}