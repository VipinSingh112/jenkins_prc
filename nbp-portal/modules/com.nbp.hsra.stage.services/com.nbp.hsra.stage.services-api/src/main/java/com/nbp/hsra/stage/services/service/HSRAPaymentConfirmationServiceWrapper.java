/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HSRAPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAPaymentConfirmationService
 * @generated
 */
public class HSRAPaymentConfirmationServiceWrapper
	implements HSRAPaymentConfirmationService,
			   ServiceWrapper<HSRAPaymentConfirmationService> {

	public HSRAPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public HSRAPaymentConfirmationServiceWrapper(
		HSRAPaymentConfirmationService hsraPaymentConfirmationService) {

		_hsraPaymentConfirmationService = hsraPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public HSRAPaymentConfirmationService getWrappedService() {
		return _hsraPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		HSRAPaymentConfirmationService hsraPaymentConfirmationService) {

		_hsraPaymentConfirmationService = hsraPaymentConfirmationService;
	}

	private HSRAPaymentConfirmationService _hsraPaymentConfirmationService;

}