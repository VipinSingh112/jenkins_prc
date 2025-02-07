/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbPaymentConfirmationService
 * @generated
 */
public class JtbPaymentConfirmationServiceWrapper
	implements JtbPaymentConfirmationService,
			   ServiceWrapper<JtbPaymentConfirmationService> {

	public JtbPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public JtbPaymentConfirmationServiceWrapper(
		JtbPaymentConfirmationService jtbPaymentConfirmationService) {

		_jtbPaymentConfirmationService = jtbPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public JtbPaymentConfirmationService getWrappedService() {
		return _jtbPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		JtbPaymentConfirmationService jtbPaymentConfirmationService) {

		_jtbPaymentConfirmationService = jtbPaymentConfirmationService;
	}

	private JtbPaymentConfirmationService _jtbPaymentConfirmationService;

}