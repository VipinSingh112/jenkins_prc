/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezStatusAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusAppPaymentService
 * @generated
 */
public class SezStatusAppPaymentServiceWrapper
	implements ServiceWrapper<SezStatusAppPaymentService>,
			   SezStatusAppPaymentService {

	public SezStatusAppPaymentServiceWrapper() {
		this(null);
	}

	public SezStatusAppPaymentServiceWrapper(
		SezStatusAppPaymentService sezStatusAppPaymentService) {

		_sezStatusAppPaymentService = sezStatusAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public SezStatusAppPaymentService getWrappedService() {
		return _sezStatusAppPaymentService;
	}

	@Override
	public void setWrappedService(
		SezStatusAppPaymentService sezStatusAppPaymentService) {

		_sezStatusAppPaymentService = sezStatusAppPaymentService;
	}

	private SezStatusAppPaymentService _sezStatusAppPaymentService;

}