/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusWelcomePackageService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackageService
 * @generated
 */
public class SezStatusWelcomePackageServiceWrapper
	implements ServiceWrapper<SezStatusWelcomePackageService>,
			   SezStatusWelcomePackageService {

	public SezStatusWelcomePackageServiceWrapper() {
		this(null);
	}

	public SezStatusWelcomePackageServiceWrapper(
		SezStatusWelcomePackageService sezStatusWelcomePackageService) {

		_sezStatusWelcomePackageService = sezStatusWelcomePackageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWelcomePackageService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusWelcomePackageService getWrappedService() {
		return _sezStatusWelcomePackageService;
	}

	@Override
	public void setWrappedService(
		SezStatusWelcomePackageService sezStatusWelcomePackageService) {

		_sezStatusWelcomePackageService = sezStatusWelcomePackageService;
	}

	private SezStatusWelcomePackageService _sezStatusWelcomePackageService;

}