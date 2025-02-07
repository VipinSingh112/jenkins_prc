/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisOccupationaLicenseService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicenseService
 * @generated
 */
public class CannabisOccupationaLicenseServiceWrapper
	implements CannabisOccupationaLicenseService,
			   ServiceWrapper<CannabisOccupationaLicenseService> {

	public CannabisOccupationaLicenseServiceWrapper() {
		this(null);
	}

	public CannabisOccupationaLicenseServiceWrapper(
		CannabisOccupationaLicenseService cannabisOccupationaLicenseService) {

		_cannabisOccupationaLicenseService = cannabisOccupationaLicenseService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisOccupationaLicenseService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisOccupationaLicenseService getWrappedService() {
		return _cannabisOccupationaLicenseService;
	}

	@Override
	public void setWrappedService(
		CannabisOccupationaLicenseService cannabisOccupationaLicenseService) {

		_cannabisOccupationaLicenseService = cannabisOccupationaLicenseService;
	}

	private CannabisOccupationaLicenseService
		_cannabisOccupationaLicenseService;

}