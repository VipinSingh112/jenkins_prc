/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyDetailsAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddressService
 * @generated
 */
public class CreativeCompanyDetailsAddressServiceWrapper
	implements CreativeCompanyDetailsAddressService,
			   ServiceWrapper<CreativeCompanyDetailsAddressService> {

	public CreativeCompanyDetailsAddressServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDetailsAddressServiceWrapper(
		CreativeCompanyDetailsAddressService
			creativeCompanyDetailsAddressService) {

		_creativeCompanyDetailsAddressService =
			creativeCompanyDetailsAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDetailsAddressService.getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyDetailsAddressService getWrappedService() {
		return _creativeCompanyDetailsAddressService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDetailsAddressService
			creativeCompanyDetailsAddressService) {

		_creativeCompanyDetailsAddressService =
			creativeCompanyDetailsAddressService;
	}

	private CreativeCompanyDetailsAddressService
		_creativeCompanyDetailsAddressService;

}