/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneGeneralBussinessAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddressService
 * @generated
 */
public class SezZoneGeneralBussinessAddressServiceWrapper
	implements ServiceWrapper<SezZoneGeneralBussinessAddressService>,
			   SezZoneGeneralBussinessAddressService {

	public SezZoneGeneralBussinessAddressServiceWrapper() {
		this(null);
	}

	public SezZoneGeneralBussinessAddressServiceWrapper(
		SezZoneGeneralBussinessAddressService
			sezZoneGeneralBussinessAddressService) {

		_sezZoneGeneralBussinessAddressService =
			sezZoneGeneralBussinessAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneGeneralBussinessAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezZoneGeneralBussinessAddressService getWrappedService() {
		return _sezZoneGeneralBussinessAddressService;
	}

	@Override
	public void setWrappedService(
		SezZoneGeneralBussinessAddressService
			sezZoneGeneralBussinessAddressService) {

		_sezZoneGeneralBussinessAddressService =
			sezZoneGeneralBussinessAddressService;
	}

	private SezZoneGeneralBussinessAddressService
		_sezZoneGeneralBussinessAddressService;

}