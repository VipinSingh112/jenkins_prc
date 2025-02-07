/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeSignatureInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfoService
 * @generated
 */
public class FireBrigadeSignatureInfoServiceWrapper
	implements FireBrigadeSignatureInfoService,
			   ServiceWrapper<FireBrigadeSignatureInfoService> {

	public FireBrigadeSignatureInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadeSignatureInfoServiceWrapper(
		FireBrigadeSignatureInfoService fireBrigadeSignatureInfoService) {

		_fireBrigadeSignatureInfoService = fireBrigadeSignatureInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeSignatureInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeSignatureInfoService getWrappedService() {
		return _fireBrigadeSignatureInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeSignatureInfoService fireBrigadeSignatureInfoService) {

		_fireBrigadeSignatureInfoService = fireBrigadeSignatureInfoService;
	}

	private FireBrigadeSignatureInfoService _fireBrigadeSignatureInfoService;

}