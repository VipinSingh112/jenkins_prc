/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationService
 * @generated
 */
public class SezStatusApplicationServiceWrapper
	implements ServiceWrapper<SezStatusApplicationService>,
			   SezStatusApplicationService {

	public SezStatusApplicationServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationServiceWrapper(
		SezStatusApplicationService sezStatusApplicationService) {

		_sezStatusApplicationService = sezStatusApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusApplicationService getWrappedService() {
		return _sezStatusApplicationService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationService sezStatusApplicationService) {

		_sezStatusApplicationService = sezStatusApplicationService;
	}

	private SezStatusApplicationService _sezStatusApplicationService;

}