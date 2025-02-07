/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareBusinessAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddressService
 * @generated
 */
public class HealthCareBusinessAddressServiceWrapper
	implements HealthCareBusinessAddressService,
			   ServiceWrapper<HealthCareBusinessAddressService> {

	public HealthCareBusinessAddressServiceWrapper() {
		this(null);
	}

	public HealthCareBusinessAddressServiceWrapper(
		HealthCareBusinessAddressService healthCareBusinessAddressService) {

		_healthCareBusinessAddressService = healthCareBusinessAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareBusinessAddressService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareBusinessAddressService getWrappedService() {
		return _healthCareBusinessAddressService;
	}

	@Override
	public void setWrappedService(
		HealthCareBusinessAddressService healthCareBusinessAddressService) {

		_healthCareBusinessAddressService = healthCareBusinessAddressService;
	}

	private HealthCareBusinessAddressService _healthCareBusinessAddressService;

}