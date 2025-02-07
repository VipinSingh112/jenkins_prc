/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeOperatorDetailService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailService
 * @generated
 */
public class FireBrigadeOperatorDetailServiceWrapper
	implements FireBrigadeOperatorDetailService,
			   ServiceWrapper<FireBrigadeOperatorDetailService> {

	public FireBrigadeOperatorDetailServiceWrapper() {
		this(null);
	}

	public FireBrigadeOperatorDetailServiceWrapper(
		FireBrigadeOperatorDetailService fireBrigadeOperatorDetailService) {

		_fireBrigadeOperatorDetailService = fireBrigadeOperatorDetailService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeOperatorDetailService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeOperatorDetailService getWrappedService() {
		return _fireBrigadeOperatorDetailService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeOperatorDetailService fireBrigadeOperatorDetailService) {

		_fireBrigadeOperatorDetailService = fireBrigadeOperatorDetailService;
	}

	private FireBrigadeOperatorDetailService _fireBrigadeOperatorDetailService;

}