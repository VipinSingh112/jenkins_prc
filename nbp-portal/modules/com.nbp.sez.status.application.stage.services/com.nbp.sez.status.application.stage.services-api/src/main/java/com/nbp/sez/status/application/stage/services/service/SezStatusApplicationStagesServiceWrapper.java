/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesService
 * @generated
 */
public class SezStatusApplicationStagesServiceWrapper
	implements ServiceWrapper<SezStatusApplicationStagesService>,
			   SezStatusApplicationStagesService {

	public SezStatusApplicationStagesServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationStagesServiceWrapper(
		SezStatusApplicationStagesService sezStatusApplicationStagesService) {

		_sezStatusApplicationStagesService = sezStatusApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusApplicationStagesService getWrappedService() {
		return _sezStatusApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationStagesService sezStatusApplicationStagesService) {

		_sezStatusApplicationStagesService = sezStatusApplicationStagesService;
	}

	private SezStatusApplicationStagesService
		_sezStatusApplicationStagesService;

}