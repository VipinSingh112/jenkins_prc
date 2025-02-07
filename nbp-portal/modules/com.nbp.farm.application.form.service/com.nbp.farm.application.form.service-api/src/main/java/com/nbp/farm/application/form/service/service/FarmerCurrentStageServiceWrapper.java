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
 * Provides a wrapper for {@link FarmerCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCurrentStageService
 * @generated
 */
public class FarmerCurrentStageServiceWrapper
	implements FarmerCurrentStageService,
			   ServiceWrapper<FarmerCurrentStageService> {

	public FarmerCurrentStageServiceWrapper() {
		this(null);
	}

	public FarmerCurrentStageServiceWrapper(
		FarmerCurrentStageService farmerCurrentStageService) {

		_farmerCurrentStageService = farmerCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FarmerCurrentStageService getWrappedService() {
		return _farmerCurrentStageService;
	}

	@Override
	public void setWrappedService(
		FarmerCurrentStageService farmerCurrentStageService) {

		_farmerCurrentStageService = farmerCurrentStageService;
	}

	private FarmerCurrentStageService _farmerCurrentStageService;

}