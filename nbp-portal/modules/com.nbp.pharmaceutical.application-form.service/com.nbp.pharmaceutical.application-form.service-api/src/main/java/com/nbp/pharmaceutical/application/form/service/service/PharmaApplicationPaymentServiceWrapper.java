/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPaymentService
 * @generated
 */
public class PharmaApplicationPaymentServiceWrapper
	implements PharmaApplicationPaymentService,
			   ServiceWrapper<PharmaApplicationPaymentService> {

	public PharmaApplicationPaymentServiceWrapper() {
		this(null);
	}

	public PharmaApplicationPaymentServiceWrapper(
		PharmaApplicationPaymentService pharmaApplicationPaymentService) {

		_pharmaApplicationPaymentService = pharmaApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaApplicationPaymentService getWrappedService() {
		return _pharmaApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationPaymentService pharmaApplicationPaymentService) {

		_pharmaApplicationPaymentService = pharmaApplicationPaymentService;
	}

	private PharmaApplicationPaymentService _pharmaApplicationPaymentService;

}