/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HsraApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationPaymentService
 * @generated
 */
public class HsraApplicationPaymentServiceWrapper
	implements HsraApplicationPaymentService,
			   ServiceWrapper<HsraApplicationPaymentService> {

	public HsraApplicationPaymentServiceWrapper() {
		this(null);
	}

	public HsraApplicationPaymentServiceWrapper(
		HsraApplicationPaymentService hsraApplicationPaymentService) {

		_hsraApplicationPaymentService = hsraApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public HsraApplicationPaymentService getWrappedService() {
		return _hsraApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationPaymentService hsraApplicationPaymentService) {

		_hsraApplicationPaymentService = hsraApplicationPaymentService;
	}

	private HsraApplicationPaymentService _hsraApplicationPaymentService;

}