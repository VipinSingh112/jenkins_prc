/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareBussinessInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfoService
 * @generated
 */
public class HealthCareBussinessInfoServiceWrapper
	implements HealthCareBussinessInfoService,
			   ServiceWrapper<HealthCareBussinessInfoService> {

	public HealthCareBussinessInfoServiceWrapper() {
		this(null);
	}

	public HealthCareBussinessInfoServiceWrapper(
		HealthCareBussinessInfoService healthCareBussinessInfoService) {

		_healthCareBussinessInfoService = healthCareBussinessInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareBussinessInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareBussinessInfoService getWrappedService() {
		return _healthCareBussinessInfoService;
	}

	@Override
	public void setWrappedService(
		HealthCareBussinessInfoService healthCareBussinessInfoService) {

		_healthCareBussinessInfoService = healthCareBussinessInfoService;
	}

	private HealthCareBussinessInfoService _healthCareBussinessInfoService;

}