/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoHotelLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoHotelLicenceService
 * @generated
 */
public class AccoHotelLicenceServiceWrapper
	implements AccoHotelLicenceService,
			   ServiceWrapper<AccoHotelLicenceService> {

	public AccoHotelLicenceServiceWrapper() {
		this(null);
	}

	public AccoHotelLicenceServiceWrapper(
		AccoHotelLicenceService accoHotelLicenceService) {

		_accoHotelLicenceService = accoHotelLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoHotelLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoHotelLicenceService getWrappedService() {
		return _accoHotelLicenceService;
	}

	@Override
	public void setWrappedService(
		AccoHotelLicenceService accoHotelLicenceService) {

		_accoHotelLicenceService = accoHotelLicenceService;
	}

	private AccoHotelLicenceService _accoHotelLicenceService;

}