/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesService
 * @generated
 */
public class HealthApplicationStagesServiceWrapper
	implements HealthApplicationStagesService,
			   ServiceWrapper<HealthApplicationStagesService> {

	public HealthApplicationStagesServiceWrapper() {
		this(null);
	}

	public HealthApplicationStagesServiceWrapper(
		HealthApplicationStagesService healthApplicationStagesService) {

		_healthApplicationStagesService = healthApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthApplicationStagesService getWrappedService() {
		return _healthApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		HealthApplicationStagesService healthApplicationStagesService) {

		_healthApplicationStagesService = healthApplicationStagesService;
	}

	private HealthApplicationStagesService _healthApplicationStagesService;

}