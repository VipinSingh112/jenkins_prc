/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevEmployeeDefineOccuAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmployeeDefineOccuAddService
 * @generated
 */
public class SezDevEmployeeDefineOccuAddServiceWrapper
	implements ServiceWrapper<SezDevEmployeeDefineOccuAddService>,
			   SezDevEmployeeDefineOccuAddService {

	public SezDevEmployeeDefineOccuAddServiceWrapper() {
		this(null);
	}

	public SezDevEmployeeDefineOccuAddServiceWrapper(
		SezDevEmployeeDefineOccuAddService sezDevEmployeeDefineOccuAddService) {

		_sezDevEmployeeDefineOccuAddService =
			sezDevEmployeeDefineOccuAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevEmployeeDefineOccuAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevEmployeeDefineOccuAddService getWrappedService() {
		return _sezDevEmployeeDefineOccuAddService;
	}

	@Override
	public void setWrappedService(
		SezDevEmployeeDefineOccuAddService sezDevEmployeeDefineOccuAddService) {

		_sezDevEmployeeDefineOccuAddService =
			sezDevEmployeeDefineOccuAddService;
	}

	private SezDevEmployeeDefineOccuAddService
		_sezDevEmployeeDefineOccuAddService;

}