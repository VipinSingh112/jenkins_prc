/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureFarmService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarmService
 * @generated
 */
public class AgricultureFarmServiceWrapper
	implements AgricultureFarmService, ServiceWrapper<AgricultureFarmService> {

	public AgricultureFarmServiceWrapper() {
		this(null);
	}

	public AgricultureFarmServiceWrapper(
		AgricultureFarmService agricultureFarmService) {

		_agricultureFarmService = agricultureFarmService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureFarmService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureFarmService getWrappedService() {
		return _agricultureFarmService;
	}

	@Override
	public void setWrappedService(
		AgricultureFarmService agricultureFarmService) {

		_agricultureFarmService = agricultureFarmService;
	}

	private AgricultureFarmService _agricultureFarmService;

}