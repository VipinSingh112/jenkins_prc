/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesRegstCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStageService
 * @generated
 */
public class FactoriesRegstCurrentStageServiceWrapper
	implements FactoriesRegstCurrentStageService,
			   ServiceWrapper<FactoriesRegstCurrentStageService> {

	public FactoriesRegstCurrentStageServiceWrapper() {
		this(null);
	}

	public FactoriesRegstCurrentStageServiceWrapper(
		FactoriesRegstCurrentStageService factoriesRegstCurrentStageService) {

		_factoriesRegstCurrentStageService = factoriesRegstCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesRegstCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesRegstCurrentStageService getWrappedService() {
		return _factoriesRegstCurrentStageService;
	}

	@Override
	public void setWrappedService(
		FactoriesRegstCurrentStageService factoriesRegstCurrentStageService) {

		_factoriesRegstCurrentStageService = factoriesRegstCurrentStageService;
	}

	private FactoriesRegstCurrentStageService
		_factoriesRegstCurrentStageService;

}