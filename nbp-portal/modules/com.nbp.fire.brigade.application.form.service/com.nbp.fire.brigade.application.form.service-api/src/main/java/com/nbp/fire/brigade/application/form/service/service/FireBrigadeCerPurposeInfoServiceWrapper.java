/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeCerPurposeInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfoService
 * @generated
 */
public class FireBrigadeCerPurposeInfoServiceWrapper
	implements FireBrigadeCerPurposeInfoService,
			   ServiceWrapper<FireBrigadeCerPurposeInfoService> {

	public FireBrigadeCerPurposeInfoServiceWrapper() {
		this(null);
	}

	public FireBrigadeCerPurposeInfoServiceWrapper(
		FireBrigadeCerPurposeInfoService fireBrigadeCerPurposeInfoService) {

		_fireBrigadeCerPurposeInfoService = fireBrigadeCerPurposeInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeCerPurposeInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeCerPurposeInfoService getWrappedService() {
		return _fireBrigadeCerPurposeInfoService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeCerPurposeInfoService fireBrigadeCerPurposeInfoService) {

		_fireBrigadeCerPurposeInfoService = fireBrigadeCerPurposeInfoService;
	}

	private FireBrigadeCerPurposeInfoService _fireBrigadeCerPurposeInfoService;

}