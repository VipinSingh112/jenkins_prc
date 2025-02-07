/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusLicenseIssuanceService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuanceService
 * @generated
 */
public class SezStatusLicenseIssuanceServiceWrapper
	implements ServiceWrapper<SezStatusLicenseIssuanceService>,
			   SezStatusLicenseIssuanceService {

	public SezStatusLicenseIssuanceServiceWrapper() {
		this(null);
	}

	public SezStatusLicenseIssuanceServiceWrapper(
		SezStatusLicenseIssuanceService sezStatusLicenseIssuanceService) {

		_sezStatusLicenseIssuanceService = sezStatusLicenseIssuanceService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusLicenseIssuanceService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusLicenseIssuanceService getWrappedService() {
		return _sezStatusLicenseIssuanceService;
	}

	@Override
	public void setWrappedService(
		SezStatusLicenseIssuanceService sezStatusLicenseIssuanceService) {

		_sezStatusLicenseIssuanceService = sezStatusLicenseIssuanceService;
	}

	private SezStatusLicenseIssuanceService _sezStatusLicenseIssuanceService;

}