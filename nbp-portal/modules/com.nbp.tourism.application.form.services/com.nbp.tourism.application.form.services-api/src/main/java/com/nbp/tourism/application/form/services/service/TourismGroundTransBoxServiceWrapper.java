/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismGroundTransBoxService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismGroundTransBoxService
 * @generated
 */
public class TourismGroundTransBoxServiceWrapper
	implements ServiceWrapper<TourismGroundTransBoxService>,
			   TourismGroundTransBoxService {

	public TourismGroundTransBoxServiceWrapper() {
		this(null);
	}

	public TourismGroundTransBoxServiceWrapper(
		TourismGroundTransBoxService tourismGroundTransBoxService) {

		_tourismGroundTransBoxService = tourismGroundTransBoxService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismGroundTransBoxService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismGroundTransBoxService getWrappedService() {
		return _tourismGroundTransBoxService;
	}

	@Override
	public void setWrappedService(
		TourismGroundTransBoxService tourismGroundTransBoxService) {

		_tourismGroundTransBoxService = tourismGroundTransBoxService;
	}

	private TourismGroundTransBoxService _tourismGroundTransBoxService;

}