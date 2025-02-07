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

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewVehicleAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxService
 * @generated
 */
public class TourismNewVehicleAddBoxServiceWrapper
	implements ServiceWrapper<TourismNewVehicleAddBoxService>,
			   TourismNewVehicleAddBoxService {

	public TourismNewVehicleAddBoxServiceWrapper() {
		this(null);
	}

	public TourismNewVehicleAddBoxServiceWrapper(
		TourismNewVehicleAddBoxService tourismNewVehicleAddBoxService) {

		_tourismNewVehicleAddBoxService = tourismNewVehicleAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewVehicleAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewVehicleAddBoxService getWrappedService() {
		return _tourismNewVehicleAddBoxService;
	}

	@Override
	public void setWrappedService(
		TourismNewVehicleAddBoxService tourismNewVehicleAddBoxService) {

		_tourismNewVehicleAddBoxService = tourismNewVehicleAddBoxService;
	}

	private TourismNewVehicleAddBoxService _tourismNewVehicleAddBoxService;

}