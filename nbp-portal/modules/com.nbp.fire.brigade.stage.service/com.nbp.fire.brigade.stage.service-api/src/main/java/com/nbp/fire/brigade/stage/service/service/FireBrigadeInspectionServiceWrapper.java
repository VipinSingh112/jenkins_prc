/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeInspectionService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeInspectionService
 * @generated
 */
public class FireBrigadeInspectionServiceWrapper
	implements FireBrigadeInspectionService,
			   ServiceWrapper<FireBrigadeInspectionService> {

	public FireBrigadeInspectionServiceWrapper() {
		this(null);
	}

	public FireBrigadeInspectionServiceWrapper(
		FireBrigadeInspectionService fireBrigadeInspectionService) {

		_fireBrigadeInspectionService = fireBrigadeInspectionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeInspectionService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeInspectionService getWrappedService() {
		return _fireBrigadeInspectionService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeInspectionService fireBrigadeInspectionService) {

		_fireBrigadeInspectionService = fireBrigadeInspectionService;
	}

	private FireBrigadeInspectionService _fireBrigadeInspectionService;

}