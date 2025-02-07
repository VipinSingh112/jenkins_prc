/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeHazardousSubInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfoService
 * @generated
 */
public class FireBrigadeHazardousSubInfoServiceWrapper
	implements FireBrigadeHazardousSubInfoService,
			   ServiceWrapper<FireBrigadeHazardousSubInfoService> {

	public FireBrigadeHazardousSubInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadeHazardousSubInfoServiceWrapper(
		FireBrigadeHazardousSubInfoService fireBrigadeHazardousSubInfoService) {

		_fireBrigadeHazardousSubInfoService =
			fireBrigadeHazardousSubInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeHazardousSubInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeHazardousSubInfoService getWrappedService() {
		return _fireBrigadeHazardousSubInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeHazardousSubInfoService fireBrigadeHazardousSubInfoService) {

		_fireBrigadeHazardousSubInfoService =
			fireBrigadeHazardousSubInfoService;
	}

	private FireBrigadeHazardousSubInfoService
		_fireBrigadeHazardousSubInfoService;

}