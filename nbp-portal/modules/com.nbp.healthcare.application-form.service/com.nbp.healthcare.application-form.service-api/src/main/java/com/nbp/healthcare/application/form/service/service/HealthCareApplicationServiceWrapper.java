/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationService
 * @generated
 */
public class HealthCareApplicationServiceWrapper
	implements HealthCareApplicationService,
			   ServiceWrapper<HealthCareApplicationService> {

	public HealthCareApplicationServiceWrapper() {
		this(null);
	}

	public HealthCareApplicationServiceWrapper(
		HealthCareApplicationService healthCareApplicationService) {

		_healthCareApplicationService = healthCareApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareApplicationService getWrappedService() {
		return _healthCareApplicationService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicationService healthCareApplicationService) {

		_healthCareApplicationService = healthCareApplicationService;
	}

	private HealthCareApplicationService _healthCareApplicationService;

}