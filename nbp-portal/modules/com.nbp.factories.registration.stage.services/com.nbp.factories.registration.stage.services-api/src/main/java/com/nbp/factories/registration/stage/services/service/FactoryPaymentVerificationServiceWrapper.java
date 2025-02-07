/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FactoryPaymentVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationService
 * @generated
 */
public class FactoryPaymentVerificationServiceWrapper
	implements FactoryPaymentVerificationService,
			   ServiceWrapper<FactoryPaymentVerificationService> {

	public FactoryPaymentVerificationServiceWrapper() {
		this(null);
	}

	public FactoryPaymentVerificationServiceWrapper(
		FactoryPaymentVerificationService factoryPaymentVerificationService) {

		_factoryPaymentVerificationService = factoryPaymentVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoryPaymentVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public FactoryPaymentVerificationService getWrappedService() {
		return _factoryPaymentVerificationService;
	}

	@Override
	public void setWrappedService(
		FactoryPaymentVerificationService factoryPaymentVerificationService) {

		_factoryPaymentVerificationService = factoryPaymentVerificationService;
	}

	private FactoryPaymentVerificationService
		_factoryPaymentVerificationService;

}