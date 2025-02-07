/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStageService
 * @generated
 */
public class SezStatusApplicationCurrentStageServiceWrapper
	implements ServiceWrapper<SezStatusApplicationCurrentStageService>,
			   SezStatusApplicationCurrentStageService {

	public SezStatusApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationCurrentStageServiceWrapper(
		SezStatusApplicationCurrentStageService
			sezStatusApplicationCurrentStageService) {

		_sezStatusApplicationCurrentStageService =
			sezStatusApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationCurrentStageService.
			getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusApplicationCurrentStageService getWrappedService() {
		return _sezStatusApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationCurrentStageService
			sezStatusApplicationCurrentStageService) {

		_sezStatusApplicationCurrentStageService =
			sezStatusApplicationCurrentStageService;
	}

	private SezStatusApplicationCurrentStageService
		_sezStatusApplicationCurrentStageService;

}