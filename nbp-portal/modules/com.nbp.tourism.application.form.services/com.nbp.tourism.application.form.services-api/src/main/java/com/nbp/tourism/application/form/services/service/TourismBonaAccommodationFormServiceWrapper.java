/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAccommodationFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormService
 * @generated
 */
public class TourismBonaAccommodationFormServiceWrapper
	implements ServiceWrapper<TourismBonaAccommodationFormService>,
			   TourismBonaAccommodationFormService {

	public TourismBonaAccommodationFormServiceWrapper() {
		this(null);
	}

	public TourismBonaAccommodationFormServiceWrapper(
		TourismBonaAccommodationFormService
			tourismBonaAccommodationFormService) {

		_tourismBonaAccommodationFormService =
			tourismBonaAccommodationFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccommodationFormService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAccommodationFormService getWrappedService() {
		return _tourismBonaAccommodationFormService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccommodationFormService
			tourismBonaAccommodationFormService) {

		_tourismBonaAccommodationFormService =
			tourismBonaAccommodationFormService;
	}

	private TourismBonaAccommodationFormService
		_tourismBonaAccommodationFormService;

}