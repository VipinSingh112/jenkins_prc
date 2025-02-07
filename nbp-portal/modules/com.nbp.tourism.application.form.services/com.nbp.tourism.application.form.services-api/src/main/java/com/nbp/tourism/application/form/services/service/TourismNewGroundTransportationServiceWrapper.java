/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewGroundTransportationService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportationService
 * @generated
 */
public class TourismNewGroundTransportationServiceWrapper
	implements ServiceWrapper<TourismNewGroundTransportationService>,
			   TourismNewGroundTransportationService {

	public TourismNewGroundTransportationServiceWrapper() {
		this(null);
	}

	public TourismNewGroundTransportationServiceWrapper(
		TourismNewGroundTransportationService
			tourismNewGroundTransportationService) {

		_tourismNewGroundTransportationService =
			tourismNewGroundTransportationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewGroundTransportationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewGroundTransportationService getWrappedService() {
		return _tourismNewGroundTransportationService;
	}

	@Override
	public void setWrappedService(
		TourismNewGroundTransportationService
			tourismNewGroundTransportationService) {

		_tourismNewGroundTransportationService =
			tourismNewGroundTransportationService;
	}

	private TourismNewGroundTransportationService
		_tourismNewGroundTransportationService;

}