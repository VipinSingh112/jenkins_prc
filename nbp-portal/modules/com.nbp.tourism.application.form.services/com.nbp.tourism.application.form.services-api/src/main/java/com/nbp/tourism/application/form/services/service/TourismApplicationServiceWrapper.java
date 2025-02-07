/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationService
 * @generated
 */
public class TourismApplicationServiceWrapper
	implements ServiceWrapper<TourismApplicationService>,
			   TourismApplicationService {

	public TourismApplicationServiceWrapper() {
		this(null);
	}

	public TourismApplicationServiceWrapper(
		TourismApplicationService tourismApplicationService) {

		_tourismApplicationService = tourismApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismApplicationService getWrappedService() {
		return _tourismApplicationService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationService tourismApplicationService) {

		_tourismApplicationService = tourismApplicationService;
	}

	private TourismApplicationService _tourismApplicationService;

}