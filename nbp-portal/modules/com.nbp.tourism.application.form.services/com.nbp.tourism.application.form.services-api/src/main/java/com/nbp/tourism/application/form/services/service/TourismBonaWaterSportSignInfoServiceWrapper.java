/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportSignInfoService
 * @generated
 */
public class TourismBonaWaterSportSignInfoServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportSignInfoService>,
			   TourismBonaWaterSportSignInfoService {

	public TourismBonaWaterSportSignInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportSignInfoServiceWrapper(
		TourismBonaWaterSportSignInfoService
			tourismBonaWaterSportSignInfoService) {

		_tourismBonaWaterSportSignInfoService =
			tourismBonaWaterSportSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaWaterSportSignInfoService getWrappedService() {
		return _tourismBonaWaterSportSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportSignInfoService
			tourismBonaWaterSportSignInfoService) {

		_tourismBonaWaterSportSignInfoService =
			tourismBonaWaterSportSignInfoService;
	}

	private TourismBonaWaterSportSignInfoService
		_tourismBonaWaterSportSignInfoService;

}