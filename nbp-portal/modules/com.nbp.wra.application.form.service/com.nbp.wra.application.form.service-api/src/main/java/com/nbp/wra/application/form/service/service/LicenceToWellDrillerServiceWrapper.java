/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LicenceToWellDrillerService}.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDrillerService
 * @generated
 */
public class LicenceToWellDrillerServiceWrapper
	implements LicenceToWellDrillerService,
			   ServiceWrapper<LicenceToWellDrillerService> {

	public LicenceToWellDrillerServiceWrapper() {
		this(null);
	}

	public LicenceToWellDrillerServiceWrapper(
		LicenceToWellDrillerService licenceToWellDrillerService) {

		_licenceToWellDrillerService = licenceToWellDrillerService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _licenceToWellDrillerService.getOSGiServiceIdentifier();
	}

	@Override
	public LicenceToWellDrillerService getWrappedService() {
		return _licenceToWellDrillerService;
	}

	@Override
	public void setWrappedService(
		LicenceToWellDrillerService licenceToWellDrillerService) {

		_licenceToWellDrillerService = licenceToWellDrillerService;
	}

	private LicenceToWellDrillerService _licenceToWellDrillerService;

}