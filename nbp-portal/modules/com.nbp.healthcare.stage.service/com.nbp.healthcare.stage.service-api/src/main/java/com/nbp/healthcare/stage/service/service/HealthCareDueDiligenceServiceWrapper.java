/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareDueDiligenceService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceService
 * @generated
 */
public class HealthCareDueDiligenceServiceWrapper
	implements HealthCareDueDiligenceService,
			   ServiceWrapper<HealthCareDueDiligenceService> {

	public HealthCareDueDiligenceServiceWrapper() {
		this(null);
	}

	public HealthCareDueDiligenceServiceWrapper(
		HealthCareDueDiligenceService healthCareDueDiligenceService) {

		_healthCareDueDiligenceService = healthCareDueDiligenceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareDueDiligenceService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareDueDiligenceService getWrappedService() {
		return _healthCareDueDiligenceService;
	}

	@Override
	public void setWrappedService(
		HealthCareDueDiligenceService healthCareDueDiligenceService) {

		_healthCareDueDiligenceService = healthCareDueDiligenceService;
	}

	private HealthCareDueDiligenceService _healthCareDueDiligenceService;

}