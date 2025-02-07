/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstService
 * @generated
 */
public class TourismBonaWaterSportsFormFirstServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportsFormFirstService>,
			   TourismBonaWaterSportsFormFirstService {

	public TourismBonaWaterSportsFormFirstServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormFirstServiceWrapper(
		TourismBonaWaterSportsFormFirstService
			tourismBonaWaterSportsFormFirstService) {

		_tourismBonaWaterSportsFormFirstService =
			tourismBonaWaterSportsFormFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormFirstService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaWaterSportsFormFirstService getWrappedService() {
		return _tourismBonaWaterSportsFormFirstService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormFirstService
			tourismBonaWaterSportsFormFirstService) {

		_tourismBonaWaterSportsFormFirstService =
			tourismBonaWaterSportsFormFirstService;
	}

	private TourismBonaWaterSportsFormFirstService
		_tourismBonaWaterSportsFormFirstService;

}