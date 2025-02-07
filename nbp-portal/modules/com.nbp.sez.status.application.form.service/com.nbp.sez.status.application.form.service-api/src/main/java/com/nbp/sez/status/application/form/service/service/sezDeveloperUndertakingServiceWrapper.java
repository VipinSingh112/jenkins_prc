/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link sezDeveloperUndertakingService}.
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertakingService
 * @generated
 */
public class sezDeveloperUndertakingServiceWrapper
	implements ServiceWrapper<sezDeveloperUndertakingService>,
			   sezDeveloperUndertakingService {

	public sezDeveloperUndertakingServiceWrapper() {
		this(null);
	}

	public sezDeveloperUndertakingServiceWrapper(
		sezDeveloperUndertakingService sezDeveloperUndertakingService) {

		_sezDeveloperUndertakingService = sezDeveloperUndertakingService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDeveloperUndertakingService.getOSGiServiceIdentifier();
	}

	@Override
	public sezDeveloperUndertakingService getWrappedService() {
		return _sezDeveloperUndertakingService;
	}

	@Override
	public void setWrappedService(
		sezDeveloperUndertakingService sezDeveloperUndertakingService) {

		_sezDeveloperUndertakingService = sezDeveloperUndertakingService;
	}

	private sezDeveloperUndertakingService _sezDeveloperUndertakingService;

}