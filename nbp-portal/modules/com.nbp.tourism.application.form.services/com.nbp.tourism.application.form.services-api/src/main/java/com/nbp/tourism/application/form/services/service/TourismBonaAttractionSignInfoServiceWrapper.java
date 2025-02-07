/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAttractionSignInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionSignInfoService
 * @generated
 */
public class TourismBonaAttractionSignInfoServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionSignInfoService>,
			   TourismBonaAttractionSignInfoService {

	public TourismBonaAttractionSignInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionSignInfoServiceWrapper(
		TourismBonaAttractionSignInfoService
			tourismBonaAttractionSignInfoService) {

		_tourismBonaAttractionSignInfoService =
			tourismBonaAttractionSignInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionSignInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAttractionSignInfoService getWrappedService() {
		return _tourismBonaAttractionSignInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionSignInfoService
			tourismBonaAttractionSignInfoService) {

		_tourismBonaAttractionSignInfoService =
			tourismBonaAttractionSignInfoService;
	}

	private TourismBonaAttractionSignInfoService
		_tourismBonaAttractionSignInfoService;

}