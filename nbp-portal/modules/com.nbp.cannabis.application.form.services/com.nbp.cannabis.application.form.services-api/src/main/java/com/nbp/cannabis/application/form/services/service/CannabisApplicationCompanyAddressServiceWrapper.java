/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddressService
 * @generated
 */
public class CannabisApplicationCompanyAddressServiceWrapper
	implements CannabisApplicationCompanyAddressService,
			   ServiceWrapper<CannabisApplicationCompanyAddressService> {

	public CannabisApplicationCompanyAddressServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyAddressServiceWrapper(
		CannabisApplicationCompanyAddressService
			cannabisApplicationCompanyAddressService) {

		_cannabisApplicationCompanyAddressService =
			cannabisApplicationCompanyAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationCompanyAddressService getWrappedService() {
		return _cannabisApplicationCompanyAddressService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyAddressService
			cannabisApplicationCompanyAddressService) {

		_cannabisApplicationCompanyAddressService =
			cannabisApplicationCompanyAddressService;
	}

	private CannabisApplicationCompanyAddressService
		_cannabisApplicationCompanyAddressService;

}