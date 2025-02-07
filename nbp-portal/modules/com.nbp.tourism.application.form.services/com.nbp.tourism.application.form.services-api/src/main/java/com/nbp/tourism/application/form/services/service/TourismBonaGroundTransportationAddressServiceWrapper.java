/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransportationAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddressService
 * @generated
 */
public class TourismBonaGroundTransportationAddressServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransportationAddressService>,
			   TourismBonaGroundTransportationAddressService {

	public TourismBonaGroundTransportationAddressServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransportationAddressServiceWrapper(
		TourismBonaGroundTransportationAddressService
			tourismBonaGroundTransportationAddressService) {

		_tourismBonaGroundTransportationAddressService =
			tourismBonaGroundTransportationAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransportationAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismBonaGroundTransportationAddressService getWrappedService() {
		return _tourismBonaGroundTransportationAddressService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransportationAddressService
			tourismBonaGroundTransportationAddressService) {

		_tourismBonaGroundTransportationAddressService =
			tourismBonaGroundTransportationAddressService;
	}

	private TourismBonaGroundTransportationAddressService
		_tourismBonaGroundTransportationAddressService;

}