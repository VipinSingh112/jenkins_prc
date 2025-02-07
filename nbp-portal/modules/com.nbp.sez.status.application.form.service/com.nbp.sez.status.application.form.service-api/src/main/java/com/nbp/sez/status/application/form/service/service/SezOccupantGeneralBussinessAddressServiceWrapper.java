/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezOccupantGeneralBussinessAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddressService
 * @generated
 */
public class SezOccupantGeneralBussinessAddressServiceWrapper
	implements ServiceWrapper<SezOccupantGeneralBussinessAddressService>,
			   SezOccupantGeneralBussinessAddressService {

	public SezOccupantGeneralBussinessAddressServiceWrapper() {
		this(null);
	}

	public SezOccupantGeneralBussinessAddressServiceWrapper(
		SezOccupantGeneralBussinessAddressService
			sezOccupantGeneralBussinessAddressService) {

		_sezOccupantGeneralBussinessAddressService =
			sezOccupantGeneralBussinessAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantGeneralBussinessAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezOccupantGeneralBussinessAddressService getWrappedService() {
		return _sezOccupantGeneralBussinessAddressService;
	}

	@Override
	public void setWrappedService(
		SezOccupantGeneralBussinessAddressService
			sezOccupantGeneralBussinessAddressService) {

		_sezOccupantGeneralBussinessAddressService =
			sezOccupantGeneralBussinessAddressService;
	}

	private SezOccupantGeneralBussinessAddressService
		_sezOccupantGeneralBussinessAddressService;

}