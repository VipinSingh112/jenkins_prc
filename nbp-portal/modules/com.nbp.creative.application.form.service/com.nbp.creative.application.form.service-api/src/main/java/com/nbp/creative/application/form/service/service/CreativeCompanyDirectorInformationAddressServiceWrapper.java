/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CreativeCompanyDirectorInformationAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddressService
 * @generated
 */
public class CreativeCompanyDirectorInformationAddressServiceWrapper
	implements CreativeCompanyDirectorInformationAddressService,
			   ServiceWrapper
				   <CreativeCompanyDirectorInformationAddressService> {

	public CreativeCompanyDirectorInformationAddressServiceWrapper() {
		this(null);
	}

	public CreativeCompanyDirectorInformationAddressServiceWrapper(
		CreativeCompanyDirectorInformationAddressService
			creativeCompanyDirectorInformationAddressService) {

		_creativeCompanyDirectorInformationAddressService =
			creativeCompanyDirectorInformationAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeCompanyDirectorInformationAddressService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CreativeCompanyDirectorInformationAddressService
		getWrappedService() {

		return _creativeCompanyDirectorInformationAddressService;
	}

	@Override
	public void setWrappedService(
		CreativeCompanyDirectorInformationAddressService
			creativeCompanyDirectorInformationAddressService) {

		_creativeCompanyDirectorInformationAddressService =
			creativeCompanyDirectorInformationAddressService;
	}

	private CreativeCompanyDirectorInformationAddressService
		_creativeCompanyDirectorInformationAddressService;

}