/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezDevDisasterManagementService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementService
 * @generated
 */
public class SezDevDisasterManagementServiceWrapper
	implements ServiceWrapper<SezDevDisasterManagementService>,
			   SezDevDisasterManagementService {

	public SezDevDisasterManagementServiceWrapper() {
		this(null);
	}

	public SezDevDisasterManagementServiceWrapper(
		SezDevDisasterManagementService sezDevDisasterManagementService) {

		_sezDevDisasterManagementService = sezDevDisasterManagementService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevDisasterManagementService.getOSGiServiceIdentifier();
	}

	@Override
	public SezDevDisasterManagementService getWrappedService() {
		return _sezDevDisasterManagementService;
	}

	@Override
	public void setWrappedService(
		SezDevDisasterManagementService sezDevDisasterManagementService) {

		_sezDevDisasterManagementService = sezDevDisasterManagementService;
	}

	private SezDevDisasterManagementService _sezDevDisasterManagementService;

}