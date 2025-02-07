/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesProcessedFoodActService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActService
 * @generated
 */
public class FactoriesProcessedFoodActServiceWrapper
	implements FactoriesProcessedFoodActService,
			   ServiceWrapper<FactoriesProcessedFoodActService> {

	public FactoriesProcessedFoodActServiceWrapper() {
		this(null);
	}

	public FactoriesProcessedFoodActServiceWrapper(
		FactoriesProcessedFoodActService factoriesProcessedFoodActService) {

		_factoriesProcessedFoodActService = factoriesProcessedFoodActService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesProcessedFoodActService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesProcessedFoodActService getWrappedService() {
		return _factoriesProcessedFoodActService;
	}

	@Override
	public void setWrappedService(
		FactoriesProcessedFoodActService factoriesProcessedFoodActService) {

		_factoriesProcessedFoodActService = factoriesProcessedFoodActService;
	}

	private FactoriesProcessedFoodActService _factoriesProcessedFoodActService;

}