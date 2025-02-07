/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccommodationFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationFormService
 * @generated
 */
public class TourismNewAccommodationFormServiceWrapper
	implements ServiceWrapper<TourismNewAccommodationFormService>,
			   TourismNewAccommodationFormService {

	public TourismNewAccommodationFormServiceWrapper() {
		this(null);
	}

	public TourismNewAccommodationFormServiceWrapper(
		TourismNewAccommodationFormService tourismNewAccommodationFormService) {

		_tourismNewAccommodationFormService =
			tourismNewAccommodationFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccommodationFormService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAccommodationFormService getWrappedService() {
		return _tourismNewAccommodationFormService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccommodationFormService tourismNewAccommodationFormService) {

		_tourismNewAccommodationFormService =
			tourismNewAccommodationFormService;
	}

	private TourismNewAccommodationFormService
		_tourismNewAccommodationFormService;

}