/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeApplicationStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageService
 * @generated
 */
public class FireBrigadeApplicationStageServiceWrapper
	implements FireBrigadeApplicationStageService,
			   ServiceWrapper<FireBrigadeApplicationStageService> {

	public FireBrigadeApplicationStageServiceWrapper() {
		this(null);
	}

	public FireBrigadeApplicationStageServiceWrapper(
		FireBrigadeApplicationStageService fireBrigadeApplicationStageService) {

		_fireBrigadeApplicationStageService =
			fireBrigadeApplicationStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeApplicationStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeApplicationStageService getWrappedService() {
		return _fireBrigadeApplicationStageService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeApplicationStageService fireBrigadeApplicationStageService) {

		_fireBrigadeApplicationStageService =
			fireBrigadeApplicationStageService;
	}

	private FireBrigadeApplicationStageService
		_fireBrigadeApplicationStageService;

}