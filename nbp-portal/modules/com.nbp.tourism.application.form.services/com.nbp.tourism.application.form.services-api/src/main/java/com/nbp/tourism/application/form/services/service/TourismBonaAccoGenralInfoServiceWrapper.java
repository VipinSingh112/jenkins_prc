/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAccoGenralInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfoService
 * @generated
 */
public class TourismBonaAccoGenralInfoServiceWrapper
	implements ServiceWrapper<TourismBonaAccoGenralInfoService>,
			   TourismBonaAccoGenralInfoService {

	public TourismBonaAccoGenralInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoGenralInfoServiceWrapper(
		TourismBonaAccoGenralInfoService tourismBonaAccoGenralInfoService) {

		_tourismBonaAccoGenralInfoService = tourismBonaAccoGenralInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoGenralInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAccoGenralInfoService getWrappedService() {
		return _tourismBonaAccoGenralInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoGenralInfoService tourismBonaAccoGenralInfoService) {

		_tourismBonaAccoGenralInfoService = tourismBonaAccoGenralInfoService;
	}

	private TourismBonaAccoGenralInfoService _tourismBonaAccoGenralInfoService;

}