/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccoNonHotelRequiredLicService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelRequiredLicService
 * @generated
 */
public class AccoNonHotelRequiredLicServiceWrapper
	implements AccoNonHotelRequiredLicService,
			   ServiceWrapper<AccoNonHotelRequiredLicService> {

	public AccoNonHotelRequiredLicServiceWrapper() {
		this(null);
	}

	public AccoNonHotelRequiredLicServiceWrapper(
		AccoNonHotelRequiredLicService accoNonHotelRequiredLicService) {

		_accoNonHotelRequiredLicService = accoNonHotelRequiredLicService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accoNonHotelRequiredLicService.getOSGiServiceIdentifier();
	}

	@Override
	public AccoNonHotelRequiredLicService getWrappedService() {
		return _accoNonHotelRequiredLicService;
	}

	@Override
	public void setWrappedService(
		AccoNonHotelRequiredLicService accoNonHotelRequiredLicService) {

		_accoNonHotelRequiredLicService = accoNonHotelRequiredLicService;
	}

	private AccoNonHotelRequiredLicService _accoNonHotelRequiredLicService;

}