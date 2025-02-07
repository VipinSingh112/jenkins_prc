/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoNonHotelGenDecService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDecService
 * @generated
 */
public class AccoNonHotelGenDecServiceWrapper
	implements AccoNonHotelGenDecService,
			   ServiceWrapper<AccoNonHotelGenDecService> {

	public AccoNonHotelGenDecServiceWrapper() {
		this(null);
	}

	public AccoNonHotelGenDecServiceWrapper(
		AccoNonHotelGenDecService accoNonHotelGenDecService) {

		_accoNonHotelGenDecService = accoNonHotelGenDecService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelGenDecService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoNonHotelGenDecService getWrappedService() {
		return _accoNonHotelGenDecService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelGenDecService accoNonHotelGenDecService) {

		_accoNonHotelGenDecService = accoNonHotelGenDecService;
	}

	private AccoNonHotelGenDecService _accoNonHotelGenDecService;

}