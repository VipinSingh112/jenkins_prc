/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadiationProtectionSecOneService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOneService
 * @generated
 */
public class RadiationProtectionSecOneServiceWrapper
	implements RadiationProtectionSecOneService,
			   ServiceWrapper<RadiationProtectionSecOneService> {

	public RadiationProtectionSecOneServiceWrapper() {
		this(null);
	}

	public RadiationProtectionSecOneServiceWrapper(
		RadiationProtectionSecOneService radiationProtectionSecOneService) {

		_radiationProtectionSecOneService = radiationProtectionSecOneService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationProtectionSecOneService.getOSGiServiceIdentifier();
	}

	@Override
	public RadiationProtectionSecOneService getWrappedService() {
		return _radiationProtectionSecOneService;
	}

	@Override
	public void setWrappedService(
		RadiationProtectionSecOneService radiationProtectionSecOneService) {

		_radiationProtectionSecOneService = radiationProtectionSecOneService;
	}

	private RadiationProtectionSecOneService _radiationProtectionSecOneService;

}