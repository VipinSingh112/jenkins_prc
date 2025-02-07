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

package com.nbp.farm.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmerApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationService
 * @generated
 */
public class FarmerApplicationServiceWrapper
	implements FarmerApplicationService,
			   ServiceWrapper<FarmerApplicationService> {

	public FarmerApplicationServiceWrapper() {
		this(null);
	}

	public FarmerApplicationServiceWrapper(
		FarmerApplicationService farmerApplicationService) {

		_farmerApplicationService = farmerApplicationService;
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerApplication
			getFarmerByAppNum(String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return _farmerApplicationService.getFarmerByAppNum(applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerApplication>
			getFarmerByStatus_UserId(int status, long userId) {

		return _farmerApplicationService.getFarmerByStatus_UserId(
			status, userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public FarmerApplicationService getWrappedService() {
		return _farmerApplicationService;
	}

	@Override
	public void setWrappedService(
		FarmerApplicationService farmerApplicationService) {

		_farmerApplicationService = farmerApplicationService;
	}

	private FarmerApplicationService _farmerApplicationService;

}