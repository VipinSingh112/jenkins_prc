/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadiationDevicesAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddService
 * @generated
 */
public class RadiationDevicesAddServiceWrapper
	implements RadiationDevicesAddService,
			   ServiceWrapper<RadiationDevicesAddService> {

	public RadiationDevicesAddServiceWrapper() {
		this(null);
	}

	public RadiationDevicesAddServiceWrapper(
		RadiationDevicesAddService radiationDevicesAddService) {

		_radiationDevicesAddService = radiationDevicesAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationDevicesAddService.getOSGiServiceIdentifier();
	}

	@Override
	public RadiationDevicesAddService getWrappedService() {
		return _radiationDevicesAddService;
	}

	@Override
	public void setWrappedService(
		RadiationDevicesAddService radiationDevicesAddService) {

		_radiationDevicesAddService = radiationDevicesAddService;
	}

	private RadiationDevicesAddService _radiationDevicesAddService;

}