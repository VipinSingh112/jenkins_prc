/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportEmployeeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportEmployeeInfoService
 * @generated
 */
public class TourismBonaWaterSportEmployeeInfoServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportEmployeeInfoService>,
			   TourismBonaWaterSportEmployeeInfoService {

	public TourismBonaWaterSportEmployeeInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportEmployeeInfoServiceWrapper(
		TourismBonaWaterSportEmployeeInfoService
			tourismBonaWaterSportEmployeeInfoService) {

		_tourismBonaWaterSportEmployeeInfoService =
			tourismBonaWaterSportEmployeeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportEmployeeInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaWaterSportEmployeeInfoService getWrappedService() {
		return _tourismBonaWaterSportEmployeeInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportEmployeeInfoService
			tourismBonaWaterSportEmployeeInfoService) {

		_tourismBonaWaterSportEmployeeInfoService =
			tourismBonaWaterSportEmployeeInfoService;
	}

	private TourismBonaWaterSportEmployeeInfoService
		_tourismBonaWaterSportEmployeeInfoService;

}