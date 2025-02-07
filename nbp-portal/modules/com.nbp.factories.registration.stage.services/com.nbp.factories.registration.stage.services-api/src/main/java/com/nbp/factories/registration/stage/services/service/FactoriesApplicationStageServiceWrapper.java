/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageService
 * @generated
 */
public class FactoriesApplicationStageServiceWrapper
	implements FactoriesApplicationStageService,
			   ServiceWrapper<FactoriesApplicationStageService> {

	public FactoriesApplicationStageServiceWrapper() {
		this(null);
	}

	public FactoriesApplicationStageServiceWrapper(
		FactoriesApplicationStageService factoriesApplicationStageService) {

		_factoriesApplicationStageService = factoriesApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesApplicationStageService getWrappedService() {
		return _factoriesApplicationStageService;
	}

	@Override
	public void setWrappedService(
		FactoriesApplicationStageService factoriesApplicationStageService) {

		_factoriesApplicationStageService = factoriesApplicationStageService;
	}

	private FactoriesApplicationStageService _factoriesApplicationStageService;

}