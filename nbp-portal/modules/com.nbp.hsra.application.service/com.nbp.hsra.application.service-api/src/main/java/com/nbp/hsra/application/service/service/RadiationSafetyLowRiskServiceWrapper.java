/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadiationSafetyLowRiskService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRiskService
 * @generated
 */
public class RadiationSafetyLowRiskServiceWrapper
	implements RadiationSafetyLowRiskService,
			   ServiceWrapper<RadiationSafetyLowRiskService> {

	public RadiationSafetyLowRiskServiceWrapper() {
		this(null);
	}

	public RadiationSafetyLowRiskServiceWrapper(
		RadiationSafetyLowRiskService radiationSafetyLowRiskService) {

		_radiationSafetyLowRiskService = radiationSafetyLowRiskService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationSafetyLowRiskService.getOSGiServiceIdentifier();
	}

	@Override
	public RadiationSafetyLowRiskService getWrappedService() {
		return _radiationSafetyLowRiskService;
	}

	@Override
	public void setWrappedService(
		RadiationSafetyLowRiskService radiationSafetyLowRiskService) {

		_radiationSafetyLowRiskService = radiationSafetyLowRiskService;
	}

	private RadiationSafetyLowRiskService _radiationSafetyLowRiskService;

}