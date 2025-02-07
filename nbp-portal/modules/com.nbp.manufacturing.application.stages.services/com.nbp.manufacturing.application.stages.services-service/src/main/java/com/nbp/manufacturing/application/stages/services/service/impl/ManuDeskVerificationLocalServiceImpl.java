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

package com.nbp.manufacturing.application.stages.services.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuDeskVerificationException;
import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;
import com.nbp.manufacturing.application.stages.services.service.base.ManuDeskVerificationLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification",
	service = AopService.class
)
public class ManuDeskVerificationLocalServiceImpl
	extends ManuDeskVerificationLocalServiceBaseImpl {
	
	public List<ManuDeskVerification> getManuDeskVerificationByStatus_ApplicationId(String status,long manufacturingApplicationId){
		return manuDeskVerificationPersistence.findBygetManuDeskVerificationByStatus_ApplicationId(status, manufacturingApplicationId);
	}
	
	public ManuDeskVerification getManufactuirngById(long manufacturingApplicationId) throws NoSuchManuDeskVerificationException {
		return manuDeskVerificationPersistence.findBygetManufactuirngById(manufacturingApplicationId);
	}
	public List<ManuDeskVerification> getDeskVerificationManufactuirngById(long manufacturingApplicationId){
		return manuDeskVerificationPersistence.findBygetDeskVerificationManufactuirngById(manufacturingApplicationId);
		
	}
	public void deleteManufacturingDV_ById(long manufacturingApplicationId) {
		manuDeskVerificationPersistence.removeBygetDeskVerificationManufactuirngById(manufacturingApplicationId);
	}
}