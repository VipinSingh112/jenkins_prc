/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormFirstService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstService
 * @generated
 */
public class TourismBonaAttractionFormFirstServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionFormFirstService>,
			   TourismBonaAttractionFormFirstService {

	public TourismBonaAttractionFormFirstServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormFirstServiceWrapper(
		TourismBonaAttractionFormFirstService
			tourismBonaAttractionFormFirstService) {

		_tourismBonaAttractionFormFirstService =
			tourismBonaAttractionFormFirstService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormFirstService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAttractionFormFirstService getWrappedService() {
		return _tourismBonaAttractionFormFirstService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormFirstService
			tourismBonaAttractionFormFirstService) {

		_tourismBonaAttractionFormFirstService =
			tourismBonaAttractionFormFirstService;
	}

	private TourismBonaAttractionFormFirstService
		_tourismBonaAttractionFormFirstService;

}