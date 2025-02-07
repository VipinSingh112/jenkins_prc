/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAnnualEarningsService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarningsService
 * @generated
 */
public class TourismNewAnnualEarningsServiceWrapper
	implements ServiceWrapper<TourismNewAnnualEarningsService>,
			   TourismNewAnnualEarningsService {

	public TourismNewAnnualEarningsServiceWrapper() {
		this(null);
	}

	public TourismNewAnnualEarningsServiceWrapper(
		TourismNewAnnualEarningsService tourismNewAnnualEarningsService) {

		_tourismNewAnnualEarningsService = tourismNewAnnualEarningsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAnnualEarningsService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAnnualEarningsService getWrappedService() {
		return _tourismNewAnnualEarningsService;
	}

	@Override
	public void setWrappedService(
		TourismNewAnnualEarningsService tourismNewAnnualEarningsService) {

		_tourismNewAnnualEarningsService = tourismNewAnnualEarningsService;
	}

	private TourismNewAnnualEarningsService _tourismNewAnnualEarningsService;

}