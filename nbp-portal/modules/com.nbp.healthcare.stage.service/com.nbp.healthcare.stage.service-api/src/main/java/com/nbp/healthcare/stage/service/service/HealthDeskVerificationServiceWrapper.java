/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationService
 * @generated
 */
public class HealthDeskVerificationServiceWrapper
	implements HealthDeskVerificationService,
			   ServiceWrapper<HealthDeskVerificationService> {

	public HealthDeskVerificationServiceWrapper() {
		this(null);
	}

	public HealthDeskVerificationServiceWrapper(
		HealthDeskVerificationService healthDeskVerificationService) {

		_healthDeskVerificationService = healthDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthDeskVerificationService getWrappedService() {
		return _healthDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		HealthDeskVerificationService healthDeskVerificationService) {

		_healthDeskVerificationService = healthDeskVerificationService;
	}

	private HealthDeskVerificationService _healthDeskVerificationService;

}