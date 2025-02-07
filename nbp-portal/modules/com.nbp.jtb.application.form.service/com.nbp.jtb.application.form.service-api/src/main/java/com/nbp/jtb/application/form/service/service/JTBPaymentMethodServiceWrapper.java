/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JTBPaymentMethodService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBPaymentMethodService
 * @generated
 */
public class JTBPaymentMethodServiceWrapper
	implements JTBPaymentMethodService,
			   ServiceWrapper<JTBPaymentMethodService> {

	public JTBPaymentMethodServiceWrapper() {
		this(null);
	}

	public JTBPaymentMethodServiceWrapper(
		JTBPaymentMethodService jtbPaymentMethodService) {

		_jtbPaymentMethodService = jtbPaymentMethodService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbPaymentMethodService.getOSGiServiceIdentifier();
	}

	@Override
	public JTBPaymentMethodService getWrappedService() {
		return _jtbPaymentMethodService;
	}

	@Override
	public void setWrappedService(
		JTBPaymentMethodService jtbPaymentMethodService) {

		_jtbPaymentMethodService = jtbPaymentMethodService;
	}

	private JTBPaymentMethodService _jtbPaymentMethodService;

}