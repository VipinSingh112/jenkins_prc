/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentConfirmationService
 * @generated
 */
public class CannabisApplicationPaymentConfirmationServiceWrapper
	implements CannabisApplicationPaymentConfirmationService,
			   ServiceWrapper<CannabisApplicationPaymentConfirmationService> {

	public CannabisApplicationPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public CannabisApplicationPaymentConfirmationServiceWrapper(
		CannabisApplicationPaymentConfirmationService
			cannabisApplicationPaymentConfirmationService) {

		_cannabisApplicationPaymentConfirmationService =
			cannabisApplicationPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationPaymentConfirmationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationPaymentConfirmationService getWrappedService() {
		return _cannabisApplicationPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationPaymentConfirmationService
			cannabisApplicationPaymentConfirmationService) {

		_cannabisApplicationPaymentConfirmationService =
			cannabisApplicationPaymentConfirmationService;
	}

	private CannabisApplicationPaymentConfirmationService
		_cannabisApplicationPaymentConfirmationService;

}