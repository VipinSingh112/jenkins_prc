/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisConditionalLicenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicenseService
 * @generated
 */
public class CannabisConditionalLicenseServiceWrapper
	implements CannabisConditionalLicenseService,
			   ServiceWrapper<CannabisConditionalLicenseService> {

	public CannabisConditionalLicenseServiceWrapper() {
		this(null);
	}

	public CannabisConditionalLicenseServiceWrapper(
		CannabisConditionalLicenseService cannabisConditionalLicenseService) {

		_cannabisConditionalLicenseService = cannabisConditionalLicenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConditionalLicenseService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisConditionalLicenseService getWrappedService() {
		return _cannabisConditionalLicenseService;
	}

	@Override
	public void setWrappedService(
		CannabisConditionalLicenseService cannabisConditionalLicenseService) {

		_cannabisConditionalLicenseService = cannabisConditionalLicenseService;
	}

	private CannabisConditionalLicenseService
		_cannabisConditionalLicenseService;

}