/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisLicensePreCondtionsService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtionsService
 * @generated
 */
public class CannabisLicensePreCondtionsServiceWrapper
	implements CannabisLicensePreCondtionsService,
			   ServiceWrapper<CannabisLicensePreCondtionsService> {

	public CannabisLicensePreCondtionsServiceWrapper() {
		this(null);
	}

	public CannabisLicensePreCondtionsServiceWrapper(
		CannabisLicensePreCondtionsService cannabisLicensePreCondtionsService) {

		_cannabisLicensePreCondtionsService =
			cannabisLicensePreCondtionsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicensePreCondtionsService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisLicensePreCondtionsService getWrappedService() {
		return _cannabisLicensePreCondtionsService;
	}

	@Override
	public void setWrappedService(
		CannabisLicensePreCondtionsService cannabisLicensePreCondtionsService) {

		_cannabisLicensePreCondtionsService =
			cannabisLicensePreCondtionsService;
	}

	private CannabisLicensePreCondtionsService
		_cannabisLicensePreCondtionsService;

}