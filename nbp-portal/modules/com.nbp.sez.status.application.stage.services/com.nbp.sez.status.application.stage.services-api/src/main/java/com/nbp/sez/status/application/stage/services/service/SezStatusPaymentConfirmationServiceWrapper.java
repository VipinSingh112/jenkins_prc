/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusPaymentConfirmationService
 * @generated
 */
public class SezStatusPaymentConfirmationServiceWrapper
	implements ServiceWrapper<SezStatusPaymentConfirmationService>,
			   SezStatusPaymentConfirmationService {

	public SezStatusPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public SezStatusPaymentConfirmationServiceWrapper(
		SezStatusPaymentConfirmationService
			sezStatusPaymentConfirmationService) {

		_sezStatusPaymentConfirmationService =
			sezStatusPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusPaymentConfirmationService getWrappedService() {
		return _sezStatusPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		SezStatusPaymentConfirmationService
			sezStatusPaymentConfirmationService) {

		_sezStatusPaymentConfirmationService =
			sezStatusPaymentConfirmationService;
	}

	private SezStatusPaymentConfirmationService
		_sezStatusPaymentConfirmationService;

}