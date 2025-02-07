/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationService
 * @generated
 */
public class QuarryPaymentConfirmationServiceWrapper
	implements QuarryPaymentConfirmationService,
			   ServiceWrapper<QuarryPaymentConfirmationService> {

	public QuarryPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public QuarryPaymentConfirmationServiceWrapper(
		QuarryPaymentConfirmationService quarryPaymentConfirmationService) {

		_quarryPaymentConfirmationService = quarryPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryPaymentConfirmationService getWrappedService() {
		return _quarryPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		QuarryPaymentConfirmationService quarryPaymentConfirmationService) {

		_quarryPaymentConfirmationService = quarryPaymentConfirmationService;
	}

	private QuarryPaymentConfirmationService _quarryPaymentConfirmationService;

}