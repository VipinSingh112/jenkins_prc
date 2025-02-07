/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAccoSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoSignInfoService
 * @generated
 */
public class TourismBonaAccoSignInfoServiceWrapper
	implements ServiceWrapper<TourismBonaAccoSignInfoService>,
			   TourismBonaAccoSignInfoService {

	public TourismBonaAccoSignInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaAccoSignInfoServiceWrapper(
		TourismBonaAccoSignInfoService tourismBonaAccoSignInfoService) {

		_tourismBonaAccoSignInfoService = tourismBonaAccoSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccoSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAccoSignInfoService getWrappedService() {
		return _tourismBonaAccoSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccoSignInfoService tourismBonaAccoSignInfoService) {

		_tourismBonaAccoSignInfoService = tourismBonaAccoSignInfoService;
	}

	private TourismBonaAccoSignInfoService _tourismBonaAccoSignInfoService;

}