/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecondService
 * @generated
 */
public class TourismBonaWaterSportsFormSecondServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportsFormSecondService>,
			   TourismBonaWaterSportsFormSecondService {

	public TourismBonaWaterSportsFormSecondServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormSecondServiceWrapper(
		TourismBonaWaterSportsFormSecondService
			tourismBonaWaterSportsFormSecondService) {

		_tourismBonaWaterSportsFormSecondService =
			tourismBonaWaterSportsFormSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormSecondService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaWaterSportsFormSecondService getWrappedService() {
		return _tourismBonaWaterSportsFormSecondService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormSecondService
			tourismBonaWaterSportsFormSecondService) {

		_tourismBonaWaterSportsFormSecondService =
			tourismBonaWaterSportsFormSecondService;
	}

	private TourismBonaWaterSportsFormSecondService
		_tourismBonaWaterSportsFormSecondService;

}