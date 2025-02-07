/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationIndividualAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressService
 * @generated
 */
public class CannabisApplicationIndividualAddressServiceWrapper
	implements CannabisApplicationIndividualAddressService,
			   ServiceWrapper<CannabisApplicationIndividualAddressService> {

	public CannabisApplicationIndividualAddressServiceWrapper() {
		this(null);
	}

	public CannabisApplicationIndividualAddressServiceWrapper(
		CannabisApplicationIndividualAddressService
			cannabisApplicationIndividualAddressService) {

		_cannabisApplicationIndividualAddressService =
			cannabisApplicationIndividualAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationIndividualAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationIndividualAddressService getWrappedService() {
		return _cannabisApplicationIndividualAddressService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationIndividualAddressService
			cannabisApplicationIndividualAddressService) {

		_cannabisApplicationIndividualAddressService =
			cannabisApplicationIndividualAddressService;
	}

	private CannabisApplicationIndividualAddressService
		_cannabisApplicationIndividualAddressService;

}