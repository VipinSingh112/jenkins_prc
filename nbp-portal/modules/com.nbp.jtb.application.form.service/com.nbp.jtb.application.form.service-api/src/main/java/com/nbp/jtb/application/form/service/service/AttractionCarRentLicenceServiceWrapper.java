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

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionCarRentLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicenceService
 * @generated
 */
public class AttractionCarRentLicenceServiceWrapper
	implements AttractionCarRentLicenceService,
			   ServiceWrapper<AttractionCarRentLicenceService> {

	public AttractionCarRentLicenceServiceWrapper() {
		this(null);
	}

	public AttractionCarRentLicenceServiceWrapper(
		AttractionCarRentLicenceService attractionCarRentLicenceService) {

		_attractionCarRentLicenceService = attractionCarRentLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionCarRentLicenceService getWrappedService() {
		return _attractionCarRentLicenceService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentLicenceService attractionCarRentLicenceService) {

		_attractionCarRentLicenceService = attractionCarRentLicenceService;
	}

	private AttractionCarRentLicenceService _attractionCarRentLicenceService;

}