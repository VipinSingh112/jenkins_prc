/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaOperatorInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfoService
 * @generated
 */
public class TourismBonaOperatorInfoServiceWrapper
	implements ServiceWrapper<TourismBonaOperatorInfoService>,
			   TourismBonaOperatorInfoService {

	public TourismBonaOperatorInfoServiceWrapper() {
		this(null);
	}

	public TourismBonaOperatorInfoServiceWrapper(
		TourismBonaOperatorInfoService tourismBonaOperatorInfoService) {

		_tourismBonaOperatorInfoService = tourismBonaOperatorInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaOperatorInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaOperatorInfoService getWrappedService() {
		return _tourismBonaOperatorInfoService;
	}

	@Override
	public void setWrappedService(
		TourismBonaOperatorInfoService tourismBonaOperatorInfoService) {

		_tourismBonaOperatorInfoService = tourismBonaOperatorInfoService;
	}

	private TourismBonaOperatorInfoService _tourismBonaOperatorInfoService;

}