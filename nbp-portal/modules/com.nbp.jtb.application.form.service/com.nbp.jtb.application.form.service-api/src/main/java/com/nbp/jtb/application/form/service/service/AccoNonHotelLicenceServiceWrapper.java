/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoNonHotelLicenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicenceService
 * @generated
 */
public class AccoNonHotelLicenceServiceWrapper
	implements AccoNonHotelLicenceService,
			   ServiceWrapper<AccoNonHotelLicenceService> {

	public AccoNonHotelLicenceServiceWrapper() {
		this(null);
	}

	public AccoNonHotelLicenceServiceWrapper(
		AccoNonHotelLicenceService accoNonHotelLicenceService) {

		_accoNonHotelLicenceService = accoNonHotelLicenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelLicenceService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoNonHotelLicenceService getWrappedService() {
		return _accoNonHotelLicenceService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelLicenceService accoNonHotelLicenceService) {

		_accoNonHotelLicenceService = accoNonHotelLicenceService;
	}

	private AccoNonHotelLicenceService _accoNonHotelLicenceService;

}