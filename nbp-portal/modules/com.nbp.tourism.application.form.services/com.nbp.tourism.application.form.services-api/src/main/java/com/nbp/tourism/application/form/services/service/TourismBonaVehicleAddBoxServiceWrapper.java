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
 * Provides a wrapper for {@link TourismBonaVehicleAddBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBoxService
 * @generated
 */
public class TourismBonaVehicleAddBoxServiceWrapper
	implements ServiceWrapper<TourismBonaVehicleAddBoxService>,
			   TourismBonaVehicleAddBoxService {

	public TourismBonaVehicleAddBoxServiceWrapper() {
		this(null);
	}

	public TourismBonaVehicleAddBoxServiceWrapper(
		TourismBonaVehicleAddBoxService tourismBonaVehicleAddBoxService) {

		_tourismBonaVehicleAddBoxService = tourismBonaVehicleAddBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaVehicleAddBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaVehicleAddBoxService getWrappedService() {
		return _tourismBonaVehicleAddBoxService;
	}

	@Override
	public void setWrappedService(
		TourismBonaVehicleAddBoxService tourismBonaVehicleAddBoxService) {

		_tourismBonaVehicleAddBoxService = tourismBonaVehicleAddBoxService;
	}

	private TourismBonaVehicleAddBoxService _tourismBonaVehicleAddBoxService;

}