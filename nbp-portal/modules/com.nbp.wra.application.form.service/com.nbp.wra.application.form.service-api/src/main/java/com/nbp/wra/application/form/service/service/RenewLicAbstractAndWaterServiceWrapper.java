/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RenewLicAbstractAndWaterService}.
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterService
 * @generated
 */
public class RenewLicAbstractAndWaterServiceWrapper
	implements RenewLicAbstractAndWaterService,
			   ServiceWrapper<RenewLicAbstractAndWaterService> {

	public RenewLicAbstractAndWaterServiceWrapper() {
		this(null);
	}

	public RenewLicAbstractAndWaterServiceWrapper(
		RenewLicAbstractAndWaterService renewLicAbstractAndWaterService) {

		_renewLicAbstractAndWaterService = renewLicAbstractAndWaterService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _renewLicAbstractAndWaterService.getOSGiServiceIdentifier();
	}

	@Override
	public RenewLicAbstractAndWaterService getWrappedService() {
		return _renewLicAbstractAndWaterService;
	}

	@Override
	public void setWrappedService(
		RenewLicAbstractAndWaterService renewLicAbstractAndWaterService) {

		_renewLicAbstractAndWaterService = renewLicAbstractAndWaterService;
	}

	private RenewLicAbstractAndWaterService _renewLicAbstractAndWaterService;

}