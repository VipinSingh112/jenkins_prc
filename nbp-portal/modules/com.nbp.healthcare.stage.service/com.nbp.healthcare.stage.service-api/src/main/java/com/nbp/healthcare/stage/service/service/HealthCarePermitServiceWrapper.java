/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCarePermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitService
 * @generated
 */
public class HealthCarePermitServiceWrapper
	implements HealthCarePermitService,
			   ServiceWrapper<HealthCarePermitService> {

	public HealthCarePermitServiceWrapper() {
		this(null);
	}

	public HealthCarePermitServiceWrapper(
		HealthCarePermitService healthCarePermitService) {

		_healthCarePermitService = healthCarePermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCarePermitService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCarePermitService getWrappedService() {
		return _healthCarePermitService;
	}

	@Override
	public void setWrappedService(
		HealthCarePermitService healthCarePermitService) {

		_healthCarePermitService = healthCarePermitService;
	}

	private HealthCarePermitService _healthCarePermitService;

}