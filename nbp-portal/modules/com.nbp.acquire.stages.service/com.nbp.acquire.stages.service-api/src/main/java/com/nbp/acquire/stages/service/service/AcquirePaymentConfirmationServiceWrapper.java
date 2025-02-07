/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquirePaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentConfirmationService
 * @generated
 */
public class AcquirePaymentConfirmationServiceWrapper
	implements AcquirePaymentConfirmationService,
			   ServiceWrapper<AcquirePaymentConfirmationService> {

	public AcquirePaymentConfirmationServiceWrapper() {
		this(null);
	}

	public AcquirePaymentConfirmationServiceWrapper(
		AcquirePaymentConfirmationService acquirePaymentConfirmationService) {

		_acquirePaymentConfirmationService = acquirePaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquirePaymentConfirmationService getWrappedService() {
		return _acquirePaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		AcquirePaymentConfirmationService acquirePaymentConfirmationService) {

		_acquirePaymentConfirmationService = acquirePaymentConfirmationService;
	}

	private AcquirePaymentConfirmationService
		_acquirePaymentConfirmationService;

}