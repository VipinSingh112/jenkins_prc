/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesService
 * @generated
 */
public class TourismApplicationStagesServiceWrapper
	implements ServiceWrapper<TourismApplicationStagesService>,
			   TourismApplicationStagesService {

	public TourismApplicationStagesServiceWrapper() {
		this(null);
	}

	public TourismApplicationStagesServiceWrapper(
		TourismApplicationStagesService tourismApplicationStagesService) {

		_tourismApplicationStagesService = tourismApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismApplicationStagesService getWrappedService() {
		return _tourismApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationStagesService tourismApplicationStagesService) {

		_tourismApplicationStagesService = tourismApplicationStagesService;
	}

	private TourismApplicationStagesService _tourismApplicationStagesService;

}