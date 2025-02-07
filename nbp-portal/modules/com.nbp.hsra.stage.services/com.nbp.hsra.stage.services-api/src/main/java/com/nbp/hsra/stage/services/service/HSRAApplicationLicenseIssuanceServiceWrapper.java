/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HSRAApplicationLicenseIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuanceService
 * @generated
 */
public class HSRAApplicationLicenseIssuanceServiceWrapper
	implements HSRAApplicationLicenseIssuanceService,
			   ServiceWrapper<HSRAApplicationLicenseIssuanceService> {

	public HSRAApplicationLicenseIssuanceServiceWrapper() {
		this(null);
	}

	public HSRAApplicationLicenseIssuanceServiceWrapper(
		HSRAApplicationLicenseIssuanceService
			hsraApplicationLicenseIssuanceService) {

		_hsraApplicationLicenseIssuanceService =
			hsraApplicationLicenseIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationLicenseIssuanceService.
			getOSGiServiceIdentifier();
	}

	@Override
	public HSRAApplicationLicenseIssuanceService getWrappedService() {
		return _hsraApplicationLicenseIssuanceService;
	}

	@Override
	public void setWrappedService(
		HSRAApplicationLicenseIssuanceService
			hsraApplicationLicenseIssuanceService) {

		_hsraApplicationLicenseIssuanceService =
			hsraApplicationLicenseIssuanceService;
	}

	private HSRAApplicationLicenseIssuanceService
		_hsraApplicationLicenseIssuanceService;

}