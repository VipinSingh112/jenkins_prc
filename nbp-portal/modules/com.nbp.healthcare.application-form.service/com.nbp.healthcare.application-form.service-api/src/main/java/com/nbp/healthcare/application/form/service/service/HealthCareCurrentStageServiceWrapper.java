/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStageService
 * @generated
 */
public class HealthCareCurrentStageServiceWrapper
	implements HealthCareCurrentStageService,
			   ServiceWrapper<HealthCareCurrentStageService> {

	public HealthCareCurrentStageServiceWrapper() {
		this(null);
	}

	public HealthCareCurrentStageServiceWrapper(
		HealthCareCurrentStageService healthCareCurrentStageService) {

		_healthCareCurrentStageService = healthCareCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareCurrentStageService getWrappedService() {
		return _healthCareCurrentStageService;
	}

	@Override
	public void setWrappedService(
		HealthCareCurrentStageService healthCareCurrentStageService) {

		_healthCareCurrentStageService = healthCareCurrentStageService;
	}

	private HealthCareCurrentStageService _healthCareCurrentStageService;

}