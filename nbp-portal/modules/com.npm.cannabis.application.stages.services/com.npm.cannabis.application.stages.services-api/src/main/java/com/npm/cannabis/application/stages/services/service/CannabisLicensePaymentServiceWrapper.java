/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisLicensePaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentService
 * @generated
 */
public class CannabisLicensePaymentServiceWrapper
	implements CannabisLicensePaymentService,
			   ServiceWrapper<CannabisLicensePaymentService> {

	public CannabisLicensePaymentServiceWrapper() {
		this(null);
	}

	public CannabisLicensePaymentServiceWrapper(
		CannabisLicensePaymentService cannabisLicensePaymentService) {

		_cannabisLicensePaymentService = cannabisLicensePaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicensePaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisLicensePaymentService getWrappedService() {
		return _cannabisLicensePaymentService;
	}

	@Override
	public void setWrappedService(
		CannabisLicensePaymentService cannabisLicensePaymentService) {

		_cannabisLicensePaymentService = cannabisLicensePaymentService;
	}

	private CannabisLicensePaymentService _cannabisLicensePaymentService;

}