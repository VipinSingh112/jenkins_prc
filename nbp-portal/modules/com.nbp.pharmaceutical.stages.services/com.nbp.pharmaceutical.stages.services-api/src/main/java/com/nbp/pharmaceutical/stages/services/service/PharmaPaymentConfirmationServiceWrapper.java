/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmationService
 * @generated
 */
public class PharmaPaymentConfirmationServiceWrapper
	implements PharmaPaymentConfirmationService,
			   ServiceWrapper<PharmaPaymentConfirmationService> {

	public PharmaPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public PharmaPaymentConfirmationServiceWrapper(
		PharmaPaymentConfirmationService pharmaPaymentConfirmationService) {

		_pharmaPaymentConfirmationService = pharmaPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaPaymentConfirmationService getWrappedService() {
		return _pharmaPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		PharmaPaymentConfirmationService pharmaPaymentConfirmationService) {

		_pharmaPaymentConfirmationService = pharmaPaymentConfirmationService;
	}

	private PharmaPaymentConfirmationService _pharmaPaymentConfirmationService;

}