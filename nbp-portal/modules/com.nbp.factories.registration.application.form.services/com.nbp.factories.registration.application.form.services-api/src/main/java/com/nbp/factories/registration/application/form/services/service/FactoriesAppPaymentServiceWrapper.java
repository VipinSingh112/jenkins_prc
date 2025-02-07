/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoriesAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppPaymentService
 * @generated
 */
public class FactoriesAppPaymentServiceWrapper
	implements FactoriesAppPaymentService,
			   ServiceWrapper<FactoriesAppPaymentService> {

	public FactoriesAppPaymentServiceWrapper() {
		this(null);
	}

	public FactoriesAppPaymentServiceWrapper(
		FactoriesAppPaymentService factoriesAppPaymentService) {

		_factoriesAppPaymentService = factoriesAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoriesAppPaymentService getWrappedService() {
		return _factoriesAppPaymentService;
	}

	@Override
	public void setWrappedService(
		FactoriesAppPaymentService factoriesAppPaymentService) {

		_factoriesAppPaymentService = factoriesAppPaymentService;
	}

	private FactoriesAppPaymentService _factoriesAppPaymentService;

}