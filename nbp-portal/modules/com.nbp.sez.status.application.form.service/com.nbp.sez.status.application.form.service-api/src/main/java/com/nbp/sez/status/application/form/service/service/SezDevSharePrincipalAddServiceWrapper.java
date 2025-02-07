/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevSharePrincipalAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAddService
 * @generated
 */
public class SezDevSharePrincipalAddServiceWrapper
	implements ServiceWrapper<SezDevSharePrincipalAddService>,
			   SezDevSharePrincipalAddService {

	public SezDevSharePrincipalAddServiceWrapper() {
		this(null);
	}

	public SezDevSharePrincipalAddServiceWrapper(
		SezDevSharePrincipalAddService sezDevSharePrincipalAddService) {

		_sezDevSharePrincipalAddService = sezDevSharePrincipalAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevSharePrincipalAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevSharePrincipalAddService getWrappedService() {
		return _sezDevSharePrincipalAddService;
	}

	@Override
	public void setWrappedService(
		SezDevSharePrincipalAddService sezDevSharePrincipalAddService) {

		_sezDevSharePrincipalAddService = sezDevSharePrincipalAddService;
	}

	private SezDevSharePrincipalAddService _sezDevSharePrincipalAddService;

}