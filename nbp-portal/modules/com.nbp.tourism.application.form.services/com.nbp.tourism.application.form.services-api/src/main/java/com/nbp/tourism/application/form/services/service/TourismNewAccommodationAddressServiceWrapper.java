/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccommodationAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddressService
 * @generated
 */
public class TourismNewAccommodationAddressServiceWrapper
	implements ServiceWrapper<TourismNewAccommodationAddressService>,
			   TourismNewAccommodationAddressService {

	public TourismNewAccommodationAddressServiceWrapper() {
		this(null);
	}

	public TourismNewAccommodationAddressServiceWrapper(
		TourismNewAccommodationAddressService
			tourismNewAccommodationAddressService) {

		_tourismNewAccommodationAddressService =
			tourismNewAccommodationAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccommodationAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAccommodationAddressService getWrappedService() {
		return _tourismNewAccommodationAddressService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccommodationAddressService
			tourismNewAccommodationAddressService) {

		_tourismNewAccommodationAddressService =
			tourismNewAccommodationAddressService;
	}

	private TourismNewAccommodationAddressService
		_tourismNewAccommodationAddressService;

}