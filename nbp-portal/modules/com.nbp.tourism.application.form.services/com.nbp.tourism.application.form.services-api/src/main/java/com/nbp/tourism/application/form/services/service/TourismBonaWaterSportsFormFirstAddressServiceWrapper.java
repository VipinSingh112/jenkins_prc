/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormFirstAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddressService
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportsFormFirstAddressService>,
			   TourismBonaWaterSportsFormFirstAddressService {

	public TourismBonaWaterSportsFormFirstAddressServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormFirstAddressServiceWrapper(
		TourismBonaWaterSportsFormFirstAddressService
			tourismBonaWaterSportsFormFirstAddressService) {

		_tourismBonaWaterSportsFormFirstAddressService =
			tourismBonaWaterSportsFormFirstAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormFirstAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaWaterSportsFormFirstAddressService getWrappedService() {
		return _tourismBonaWaterSportsFormFirstAddressService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormFirstAddressService
			tourismBonaWaterSportsFormFirstAddressService) {

		_tourismBonaWaterSportsFormFirstAddressService =
			tourismBonaWaterSportsFormFirstAddressService;
	}

	private TourismBonaWaterSportsFormFirstAddressService
		_tourismBonaWaterSportsFormFirstAddressService;

}