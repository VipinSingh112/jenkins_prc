/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WraPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationService
 * @generated
 */
public class WraPaymentConfirmationServiceWrapper
	implements ServiceWrapper<WraPaymentConfirmationService>,
			   WraPaymentConfirmationService {

	public WraPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public WraPaymentConfirmationServiceWrapper(
		WraPaymentConfirmationService wraPaymentConfirmationService) {

		_wraPaymentConfirmationService = wraPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public WraPaymentConfirmationService getWrappedService() {
		return _wraPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		WraPaymentConfirmationService wraPaymentConfirmationService) {

		_wraPaymentConfirmationService = wraPaymentConfirmationService;
	}

	private WraPaymentConfirmationService _wraPaymentConfirmationService;

}