/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDeveloperDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsService
 * @generated
 */
public class SezDeveloperDetailsServiceWrapper
	implements ServiceWrapper<SezDeveloperDetailsService>,
			   SezDeveloperDetailsService {

	public SezDeveloperDetailsServiceWrapper() {
		this(null);
	}

	public SezDeveloperDetailsServiceWrapper(
		SezDeveloperDetailsService sezDeveloperDetailsService) {

		_sezDeveloperDetailsService = sezDeveloperDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDeveloperDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDeveloperDetailsService getWrappedService() {
		return _sezDeveloperDetailsService;
	}

	@Override
	public void setWrappedService(
		SezDeveloperDetailsService sezDeveloperDetailsService) {

		_sezDeveloperDetailsService = sezDeveloperDetailsService;
	}

	private SezDeveloperDetailsService _sezDeveloperDetailsService;

}