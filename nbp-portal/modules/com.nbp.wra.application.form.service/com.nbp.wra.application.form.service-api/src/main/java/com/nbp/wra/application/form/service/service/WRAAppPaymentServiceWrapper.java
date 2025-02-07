/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WRAAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppPaymentService
 * @generated
 */
public class WRAAppPaymentServiceWrapper
	implements ServiceWrapper<WRAAppPaymentService>, WRAAppPaymentService {

	public WRAAppPaymentServiceWrapper() {
		this(null);
	}

	public WRAAppPaymentServiceWrapper(
		WRAAppPaymentService wraAppPaymentService) {

		_wraAppPaymentService = wraAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public WRAAppPaymentService getWrappedService() {
		return _wraAppPaymentService;
	}

	@Override
	public void setWrappedService(WRAAppPaymentService wraAppPaymentService) {
		_wraAppPaymentService = wraAppPaymentService;
	}

	private WRAAppPaymentService _wraAppPaymentService;

}