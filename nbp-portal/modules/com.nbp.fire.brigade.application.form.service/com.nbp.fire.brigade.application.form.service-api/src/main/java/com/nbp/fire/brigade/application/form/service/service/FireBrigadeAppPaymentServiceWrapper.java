/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FireBrigadeAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppPaymentService
 * @generated
 */
public class FireBrigadeAppPaymentServiceWrapper
	implements FireBrigadeAppPaymentService,
			   ServiceWrapper<FireBrigadeAppPaymentService> {

	public FireBrigadeAppPaymentServiceWrapper() {
		this(null);
	}

	public FireBrigadeAppPaymentServiceWrapper(
		FireBrigadeAppPaymentService fireBrigadeAppPaymentService) {

		_fireBrigadeAppPaymentService = fireBrigadeAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public FireBrigadeAppPaymentService getWrappedService() {
		return _fireBrigadeAppPaymentService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeAppPaymentService fireBrigadeAppPaymentService) {

		_fireBrigadeAppPaymentService = fireBrigadeAppPaymentService;
	}

	private FireBrigadeAppPaymentService _fireBrigadeAppPaymentService;

}