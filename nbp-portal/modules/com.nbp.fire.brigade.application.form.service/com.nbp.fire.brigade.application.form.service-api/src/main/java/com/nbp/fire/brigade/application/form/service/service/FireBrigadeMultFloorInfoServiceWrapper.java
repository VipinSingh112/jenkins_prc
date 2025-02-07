/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeMultFloorInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfoService
 * @generated
 */
public class FireBrigadeMultFloorInfoServiceWrapper
	implements FireBrigadeMultFloorInfoService,
			   ServiceWrapper<FireBrigadeMultFloorInfoService> {

	public FireBrigadeMultFloorInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadeMultFloorInfoServiceWrapper(
		FireBrigadeMultFloorInfoService fireBrigadeMultFloorInfoService) {

		_fireBrigadeMultFloorInfoService = fireBrigadeMultFloorInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeMultFloorInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeMultFloorInfoService getWrappedService() {
		return _fireBrigadeMultFloorInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeMultFloorInfoService fireBrigadeMultFloorInfoService) {

		_fireBrigadeMultFloorInfoService = fireBrigadeMultFloorInfoService;
	}

	private FireBrigadeMultFloorInfoService _fireBrigadeMultFloorInfoService;

}