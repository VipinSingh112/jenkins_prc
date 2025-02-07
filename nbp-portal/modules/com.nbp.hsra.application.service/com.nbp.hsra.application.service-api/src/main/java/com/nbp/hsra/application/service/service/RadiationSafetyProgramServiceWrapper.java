/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadiationSafetyProgramService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgramService
 * @generated
 */
public class RadiationSafetyProgramServiceWrapper
	implements RadiationSafetyProgramService,
			   ServiceWrapper<RadiationSafetyProgramService> {

	public RadiationSafetyProgramServiceWrapper() {
		this(null);
	}

	public RadiationSafetyProgramServiceWrapper(
		RadiationSafetyProgramService radiationSafetyProgramService) {

		_radiationSafetyProgramService = radiationSafetyProgramService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radiationSafetyProgramService.getOSGiServiceIdentifier();
	}

	@Override
	public RadiationSafetyProgramService getWrappedService() {
		return _radiationSafetyProgramService;
	}

	@Override
	public void setWrappedService(
		RadiationSafetyProgramService radiationSafetyProgramService) {

		_radiationSafetyProgramService = radiationSafetyProgramService;
	}

	private RadiationSafetyProgramService _radiationSafetyProgramService;

}