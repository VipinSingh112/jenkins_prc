/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeAppliCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppliCurrentStageService
 * @generated
 */
public class FireBrigadeAppliCurrentStageServiceWrapper
	implements FireBrigadeAppliCurrentStageService,
			   ServiceWrapper<FireBrigadeAppliCurrentStageService> {

	public FireBrigadeAppliCurrentStageServiceWrapper() {
		this(null);
	}

	public FireBrigadeAppliCurrentStageServiceWrapper(
		FireBrigadeAppliCurrentStageService
			fireBrigadeAppliCurrentStageService) {

		_fireBrigadeAppliCurrentStageService =
			fireBrigadeAppliCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeAppliCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeAppliCurrentStageService getWrappedService() {
		return _fireBrigadeAppliCurrentStageService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeAppliCurrentStageService
			fireBrigadeAppliCurrentStageService) {

		_fireBrigadeAppliCurrentStageService =
			fireBrigadeAppliCurrentStageService;
	}

	private FireBrigadeAppliCurrentStageService
		_fireBrigadeAppliCurrentStageService;

}