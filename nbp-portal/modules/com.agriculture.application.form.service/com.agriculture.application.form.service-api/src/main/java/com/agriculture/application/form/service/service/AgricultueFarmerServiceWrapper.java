/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AgricultueFarmerService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmerService
 * @generated
 */
public class AgricultueFarmerServiceWrapper
	implements AgricultueFarmerService,
			   ServiceWrapper<AgricultueFarmerService> {

	public AgricultueFarmerServiceWrapper() {
		this(null);
	}

	public AgricultueFarmerServiceWrapper(
		AgricultueFarmerService agricultueFarmerService) {

		_agricultueFarmerService = agricultueFarmerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultueFarmerService.getOSGiServiceIdentifier();
	}

	@Override
	public AgricultueFarmerService getWrappedService() {
		return _agricultueFarmerService;
	}

	@Override
	public void setWrappedService(
		AgricultueFarmerService agricultueFarmerService) {

		_agricultueFarmerService = agricultueFarmerService;
	}

	private AgricultueFarmerService _agricultueFarmerService;

}