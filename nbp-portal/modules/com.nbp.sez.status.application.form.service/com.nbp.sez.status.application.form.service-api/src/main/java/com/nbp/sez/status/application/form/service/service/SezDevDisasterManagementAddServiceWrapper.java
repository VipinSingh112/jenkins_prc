/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevDisasterManagementAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementAddService
 * @generated
 */
public class SezDevDisasterManagementAddServiceWrapper
	implements ServiceWrapper<SezDevDisasterManagementAddService>,
			   SezDevDisasterManagementAddService {

	public SezDevDisasterManagementAddServiceWrapper() {
		this(null);
	}

	public SezDevDisasterManagementAddServiceWrapper(
		SezDevDisasterManagementAddService sezDevDisasterManagementAddService) {

		_sezDevDisasterManagementAddService =
			sezDevDisasterManagementAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevDisasterManagementAddService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevDisasterManagementAddService getWrappedService() {
		return _sezDevDisasterManagementAddService;
	}

	@Override
	public void setWrappedService(
		SezDevDisasterManagementAddService sezDevDisasterManagementAddService) {

		_sezDevDisasterManagementAddService =
			sezDevDisasterManagementAddService;
	}

	private SezDevDisasterManagementAddService
		_sezDevDisasterManagementAddService;

}