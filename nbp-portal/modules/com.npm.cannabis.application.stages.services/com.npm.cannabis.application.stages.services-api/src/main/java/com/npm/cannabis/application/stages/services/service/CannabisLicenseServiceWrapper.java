/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisLicenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicenseService
 * @generated
 */
public class CannabisLicenseServiceWrapper
	implements CannabisLicenseService, ServiceWrapper<CannabisLicenseService> {

	public CannabisLicenseServiceWrapper() {
		this(null);
	}

	public CannabisLicenseServiceWrapper(
		CannabisLicenseService cannabisLicenseService) {

		_cannabisLicenseService = cannabisLicenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicenseService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisLicenseService getWrappedService() {
		return _cannabisLicenseService;
	}

	@Override
	public void setWrappedService(
		CannabisLicenseService cannabisLicenseService) {

		_cannabisLicenseService = cannabisLicenseService;
	}

	private CannabisLicenseService _cannabisLicenseService;

}