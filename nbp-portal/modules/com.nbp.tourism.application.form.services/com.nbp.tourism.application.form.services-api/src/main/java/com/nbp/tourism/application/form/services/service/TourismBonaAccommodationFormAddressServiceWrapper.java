/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAccommodationFormAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressService
 * @generated
 */
public class TourismBonaAccommodationFormAddressServiceWrapper
	implements ServiceWrapper<TourismBonaAccommodationFormAddressService>,
			   TourismBonaAccommodationFormAddressService {

	public TourismBonaAccommodationFormAddressServiceWrapper() {
		this(null);
	}

	public TourismBonaAccommodationFormAddressServiceWrapper(
		TourismBonaAccommodationFormAddressService
			tourismBonaAccommodationFormAddressService) {

		_tourismBonaAccommodationFormAddressService =
			tourismBonaAccommodationFormAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccommodationFormAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAccommodationFormAddressService getWrappedService() {
		return _tourismBonaAccommodationFormAddressService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccommodationFormAddressService
			tourismBonaAccommodationFormAddressService) {

		_tourismBonaAccommodationFormAddressService =
			tourismBonaAccommodationFormAddressService;
	}

	private TourismBonaAccommodationFormAddressService
		_tourismBonaAccommodationFormAddressService;

}