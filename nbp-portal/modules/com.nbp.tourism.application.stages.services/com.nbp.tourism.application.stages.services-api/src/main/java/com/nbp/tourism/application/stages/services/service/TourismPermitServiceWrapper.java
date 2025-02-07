/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismPermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermitService
 * @generated
 */
public class TourismPermitServiceWrapper
	implements ServiceWrapper<TourismPermitService>, TourismPermitService {

	public TourismPermitServiceWrapper() {
		this(null);
	}

	public TourismPermitServiceWrapper(
		TourismPermitService tourismPermitService) {

		_tourismPermitService = tourismPermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismPermitService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismPermitService getWrappedService() {
		return _tourismPermitService;
	}

	@Override
	public void setWrappedService(TourismPermitService tourismPermitService) {
		_tourismPermitService = tourismPermitService;
	}

	private TourismPermitService _tourismPermitService;

}