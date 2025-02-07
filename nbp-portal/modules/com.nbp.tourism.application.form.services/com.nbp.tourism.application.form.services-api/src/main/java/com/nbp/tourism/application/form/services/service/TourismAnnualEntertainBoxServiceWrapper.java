/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismAnnualEntertainBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxService
 * @generated
 */
public class TourismAnnualEntertainBoxServiceWrapper
	implements ServiceWrapper<TourismAnnualEntertainBoxService>,
			   TourismAnnualEntertainBoxService {

	public TourismAnnualEntertainBoxServiceWrapper() {
		this(null);
	}

	public TourismAnnualEntertainBoxServiceWrapper(
		TourismAnnualEntertainBoxService tourismAnnualEntertainBoxService) {

		_tourismAnnualEntertainBoxService = tourismAnnualEntertainBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismAnnualEntertainBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismAnnualEntertainBoxService getWrappedService() {
		return _tourismAnnualEntertainBoxService;
	}

	@Override
	public void setWrappedService(
		TourismAnnualEntertainBoxService tourismAnnualEntertainBoxService) {

		_tourismAnnualEntertainBoxService = tourismAnnualEntertainBoxService;
	}

	private TourismAnnualEntertainBoxService _tourismAnnualEntertainBoxService;

}