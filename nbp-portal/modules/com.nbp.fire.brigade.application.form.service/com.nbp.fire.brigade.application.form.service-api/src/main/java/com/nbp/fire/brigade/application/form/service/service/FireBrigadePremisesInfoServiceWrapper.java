/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadePremisesInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePremisesInfoService
 * @generated
 */
public class FireBrigadePremisesInfoServiceWrapper
	implements FireBrigadePremisesInfoService,
			   ServiceWrapper<FireBrigadePremisesInfoService> {

	public FireBrigadePremisesInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadePremisesInfoServiceWrapper(
		FireBrigadePremisesInfoService fireBrigadePremisesInfoService) {

		_fireBrigadePremisesInfoService = fireBrigadePremisesInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadePremisesInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadePremisesInfoService getWrappedService() {
		return _fireBrigadePremisesInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadePremisesInfoService fireBrigadePremisesInfoService) {

		_fireBrigadePremisesInfoService = fireBrigadePremisesInfoService;
	}

	private FireBrigadePremisesInfoService _fireBrigadePremisesInfoService;

}