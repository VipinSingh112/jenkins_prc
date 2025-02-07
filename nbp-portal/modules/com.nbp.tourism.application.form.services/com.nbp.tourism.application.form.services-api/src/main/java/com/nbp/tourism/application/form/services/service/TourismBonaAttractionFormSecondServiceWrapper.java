/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormSecondService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecondService
 * @generated
 */
public class TourismBonaAttractionFormSecondServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionFormSecondService>,
			   TourismBonaAttractionFormSecondService {

	public TourismBonaAttractionFormSecondServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormSecondServiceWrapper(
		TourismBonaAttractionFormSecondService
			tourismBonaAttractionFormSecondService) {

		_tourismBonaAttractionFormSecondService =
			tourismBonaAttractionFormSecondService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormSecondService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAttractionFormSecondService getWrappedService() {
		return _tourismBonaAttractionFormSecondService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormSecondService
			tourismBonaAttractionFormSecondService) {

		_tourismBonaAttractionFormSecondService =
			tourismBonaAttractionFormSecondService;
	}

	private TourismBonaAttractionFormSecondService
		_tourismBonaAttractionFormSecondService;

}