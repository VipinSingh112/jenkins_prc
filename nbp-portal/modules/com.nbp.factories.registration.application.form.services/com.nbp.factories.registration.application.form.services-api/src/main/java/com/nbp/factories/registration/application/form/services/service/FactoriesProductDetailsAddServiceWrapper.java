/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesProductDetailsAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAddService
 * @generated
 */
public class FactoriesProductDetailsAddServiceWrapper
	implements FactoriesProductDetailsAddService,
			   ServiceWrapper<FactoriesProductDetailsAddService> {

	public FactoriesProductDetailsAddServiceWrapper() {
		this(null);
	}

	public FactoriesProductDetailsAddServiceWrapper(
		FactoriesProductDetailsAddService factoriesProductDetailsAddService) {

		_factoriesProductDetailsAddService = factoriesProductDetailsAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesProductDetailsAddService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesProductDetailsAddService getWrappedService() {
		return _factoriesProductDetailsAddService;
	}

	@Override
	public void setWrappedService(
		FactoriesProductDetailsAddService factoriesProductDetailsAddService) {

		_factoriesProductDetailsAddService = factoriesProductDetailsAddService;
	}

	private FactoriesProductDetailsAddService
		_factoriesProductDetailsAddService;

}