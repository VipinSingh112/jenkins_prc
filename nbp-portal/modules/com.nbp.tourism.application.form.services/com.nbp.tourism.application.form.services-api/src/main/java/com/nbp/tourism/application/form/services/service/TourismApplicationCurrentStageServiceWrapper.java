/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationCurrentStageService
 * @generated
 */
public class TourismApplicationCurrentStageServiceWrapper
	implements ServiceWrapper<TourismApplicationCurrentStageService>,
			   TourismApplicationCurrentStageService {

	public TourismApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public TourismApplicationCurrentStageServiceWrapper(
		TourismApplicationCurrentStageService
			tourismApplicationCurrentStageService) {

		_tourismApplicationCurrentStageService =
			tourismApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationCurrentStageService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismApplicationCurrentStageService getWrappedService() {
		return _tourismApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationCurrentStageService
			tourismApplicationCurrentStageService) {

		_tourismApplicationCurrentStageService =
			tourismApplicationCurrentStageService;
	}

	private TourismApplicationCurrentStageService
		_tourismApplicationCurrentStageService;

}