/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaAttractionEmployeeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfoService
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionEmployeeInfoService>,
			   TourismBonaAttractionEmployeeInfoService {

	public TourismBonaAttractionEmployeeInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionEmployeeInfoServiceWrapper(
		TourismBonaAttractionEmployeeInfoService
			tourismBonaAttractionEmployeeInfoService) {

		_tourismBonaAttractionEmployeeInfoService =
			tourismBonaAttractionEmployeeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionEmployeeInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaAttractionEmployeeInfoService getWrappedService() {
		return _tourismBonaAttractionEmployeeInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionEmployeeInfoService
			tourismBonaAttractionEmployeeInfoService) {

		_tourismBonaAttractionEmployeeInfoService =
			tourismBonaAttractionEmployeeInfoService;
	}

	private TourismBonaAttractionEmployeeInfoService
		_tourismBonaAttractionEmployeeInfoService;

}