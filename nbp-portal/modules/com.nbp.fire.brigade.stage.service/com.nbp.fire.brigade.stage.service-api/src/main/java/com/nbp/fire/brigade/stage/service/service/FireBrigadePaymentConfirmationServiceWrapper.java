/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadePaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePaymentConfirmationService
 * @generated
 */
public class FireBrigadePaymentConfirmationServiceWrapper
	implements FireBrigadePaymentConfirmationService,
			   ServiceWrapper<FireBrigadePaymentConfirmationService> {

	public FireBrigadePaymentConfirmationServiceWrapper() {
		this(null);
	}

	public FireBrigadePaymentConfirmationServiceWrapper(
		FireBrigadePaymentConfirmationService
			fireBrigadePaymentConfirmationService) {

		_fireBrigadePaymentConfirmationService =
			fireBrigadePaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadePaymentConfirmationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadePaymentConfirmationService getWrappedService() {
		return _fireBrigadePaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		FireBrigadePaymentConfirmationService
			fireBrigadePaymentConfirmationService) {

		_fireBrigadePaymentConfirmationService =
			fireBrigadePaymentConfirmationService;
	}

	private FireBrigadePaymentConfirmationService
		_fireBrigadePaymentConfirmationService;

}