/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesApplicationRegistrationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationRegistrationService
 * @generated
 */
public class FactoriesApplicationRegistrationServiceWrapper
	implements FactoriesApplicationRegistrationService,
			   ServiceWrapper<FactoriesApplicationRegistrationService> {

	public FactoriesApplicationRegistrationServiceWrapper() {
		this(null);
	}

	public FactoriesApplicationRegistrationServiceWrapper(
		FactoriesApplicationRegistrationService
			factoriesApplicationRegistrationService) {

		_factoriesApplicationRegistrationService =
			factoriesApplicationRegistrationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesApplicationRegistrationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesApplicationRegistrationService getWrappedService() {
		return _factoriesApplicationRegistrationService;
	}

	@Override
	public void setWrappedService(
		FactoriesApplicationRegistrationService
			factoriesApplicationRegistrationService) {

		_factoriesApplicationRegistrationService =
			factoriesApplicationRegistrationService;
	}

	private FactoriesApplicationRegistrationService
		_factoriesApplicationRegistrationService;

}