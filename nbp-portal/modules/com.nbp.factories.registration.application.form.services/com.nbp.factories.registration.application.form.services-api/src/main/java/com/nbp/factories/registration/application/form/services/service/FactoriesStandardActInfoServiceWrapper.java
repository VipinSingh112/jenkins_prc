/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesStandardActInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesStandardActInfoService
 * @generated
 */
public class FactoriesStandardActInfoServiceWrapper
	implements FactoriesStandardActInfoService,
			   ServiceWrapper<FactoriesStandardActInfoService> {

	public FactoriesStandardActInfoServiceWrapper() {
		this(null);
	}

	public FactoriesStandardActInfoServiceWrapper(
		FactoriesStandardActInfoService factoriesStandardActInfoService) {

		_factoriesStandardActInfoService = factoriesStandardActInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesStandardActInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesStandardActInfoService getWrappedService() {
		return _factoriesStandardActInfoService;
	}

	@Override
	public void setWrappedService(
		FactoriesStandardActInfoService factoriesStandardActInfoService) {

		_factoriesStandardActInfoService = factoriesStandardActInfoService;
	}

	private FactoriesStandardActInfoService _factoriesStandardActInfoService;

}