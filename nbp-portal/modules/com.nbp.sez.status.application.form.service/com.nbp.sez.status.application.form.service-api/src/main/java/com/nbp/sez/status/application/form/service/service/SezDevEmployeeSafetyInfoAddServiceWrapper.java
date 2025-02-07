/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevEmployeeSafetyInfoAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeSafetyInfoAddService
 * @generated
 */
public class SezDevEmployeeSafetyInfoAddServiceWrapper
	implements ServiceWrapper<SezDevEmployeeSafetyInfoAddService>,
			   SezDevEmployeeSafetyInfoAddService {

	public SezDevEmployeeSafetyInfoAddServiceWrapper() {
		this(null);
	}

	public SezDevEmployeeSafetyInfoAddServiceWrapper(
		SezDevEmployeeSafetyInfoAddService sezDevEmployeeSafetyInfoAddService) {

		_sezDevEmployeeSafetyInfoAddService =
			sezDevEmployeeSafetyInfoAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmployeeSafetyInfoAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevEmployeeSafetyInfoAddService getWrappedService() {
		return _sezDevEmployeeSafetyInfoAddService;
	}

	@Override
	public void setWrappedService(
		SezDevEmployeeSafetyInfoAddService sezDevEmployeeSafetyInfoAddService) {

		_sezDevEmployeeSafetyInfoAddService =
			sezDevEmployeeSafetyInfoAddService;
	}

	private SezDevEmployeeSafetyInfoAddService
		_sezDevEmployeeSafetyInfoAddService;

}