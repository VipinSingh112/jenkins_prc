/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundSignInfoService
 * @generated
 */
public class TourismBonaGroundSignInfoServiceWrapper
	implements ServiceWrapper<TourismBonaGroundSignInfoService>,
			   TourismBonaGroundSignInfoService {

	public TourismBonaGroundSignInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundSignInfoServiceWrapper(
		TourismBonaGroundSignInfoService tourismBonaGroundSignInfoService) {

		_tourismBonaGroundSignInfoService = tourismBonaGroundSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundSignInfoService getWrappedService() {
		return _tourismBonaGroundSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundSignInfoService tourismBonaGroundSignInfoService) {

		_tourismBonaGroundSignInfoService = tourismBonaGroundSignInfoService;
	}

	private TourismBonaGroundSignInfoService _tourismBonaGroundSignInfoService;

}