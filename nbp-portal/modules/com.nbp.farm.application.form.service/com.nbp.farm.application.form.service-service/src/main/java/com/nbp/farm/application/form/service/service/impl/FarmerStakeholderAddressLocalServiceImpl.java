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

package com.nbp.farm.application.form.service.service.impl;

import com.liferay.portal.aop.AopService;
import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;
import com.nbp.farm.application.form.service.service.base.FarmerStakeholderAddressLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.nbp.farm.application.form.service.model.FarmerStakeholderAddress",
	service = AopService.class
)
public class FarmerStakeholderAddressLocalServiceImpl
	extends FarmerStakeholderAddressLocalServiceBaseImpl {
	public FarmerStakeholderAddress getFA_FSI_AT(String addressType, long farmerStakeholderInfoId ) {
		return farmerStakeholderAddressPersistence.fetchBygetFA_SAI_AT(addressType, farmerStakeholderInfoId);
		}
	public FarmerStakeholderAddress getFarmerById(long applicationId) {
		return farmerStakeholderAddressPersistence.fetchBygetFarmerById(applicationId);
	}
	public FarmerStakeholderAddress getFarmerByStakeholderId(long applicationId) {
		return farmerStakeholderAddressPersistence.fetchBygetFarmerByStakeInfoId(applicationId);
		
	}
}