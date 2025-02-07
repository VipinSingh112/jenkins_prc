/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultureBuildingService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuildingService
 * @generated
 */
public class AgricultureBuildingServiceWrapper
	implements AgricultureBuildingService,
			   ServiceWrapper<AgricultureBuildingService> {

	public AgricultureBuildingServiceWrapper() {
		this(null);
	}

	public AgricultureBuildingServiceWrapper(
		AgricultureBuildingService agricultureBuildingService) {

		_agricultureBuildingService = agricultureBuildingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureBuildingService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultureBuildingService getWrappedService() {
		return _agricultureBuildingService;
	}

	@Override
	public void setWrappedService(
		AgricultureBuildingService agricultureBuildingService) {

		_agricultureBuildingService = agricultureBuildingService;
	}

	private AgricultureBuildingService _agricultureBuildingService;

}