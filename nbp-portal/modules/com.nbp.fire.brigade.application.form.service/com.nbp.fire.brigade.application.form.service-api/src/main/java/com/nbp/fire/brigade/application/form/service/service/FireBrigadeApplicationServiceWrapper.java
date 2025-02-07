/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationService
 * @generated
 */
public class FireBrigadeApplicationServiceWrapper
	implements FireBrigadeApplicationService,
			   ServiceWrapper<FireBrigadeApplicationService> {

	public FireBrigadeApplicationServiceWrapper() {
		this(null);
	}

	public FireBrigadeApplicationServiceWrapper(
		FireBrigadeApplicationService fireBrigadeApplicationService) {

		_fireBrigadeApplicationService = fireBrigadeApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeApplicationService getWrappedService() {
		return _fireBrigadeApplicationService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeApplicationService fireBrigadeApplicationService) {

		_fireBrigadeApplicationService = fireBrigadeApplicationService;
	}

	private FireBrigadeApplicationService _fireBrigadeApplicationService;

}