/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormFirstAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddressService
 * @generated
 */
public class TourismNewAttractionFormFirstAddressServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormFirstAddressService>,
			   TourismNewAttractionFormFirstAddressService {

	public TourismNewAttractionFormFirstAddressServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormFirstAddressServiceWrapper(
		TourismNewAttractionFormFirstAddressService
			tourismNewAttractionFormFirstAddressService) {

		_tourismNewAttractionFormFirstAddressService =
			tourismNewAttractionFormFirstAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormFirstAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public TourismNewAttractionFormFirstAddressService getWrappedService() {
		return _tourismNewAttractionFormFirstAddressService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormFirstAddressService
			tourismNewAttractionFormFirstAddressService) {

		_tourismNewAttractionFormFirstAddressService =
			tourismNewAttractionFormFirstAddressService;
	}

	private TourismNewAttractionFormFirstAddressService
		_tourismNewAttractionFormFirstAddressService;

}