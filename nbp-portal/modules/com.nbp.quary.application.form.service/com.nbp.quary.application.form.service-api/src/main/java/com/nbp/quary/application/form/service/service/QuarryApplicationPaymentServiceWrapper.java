/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuarryApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentService
 * @generated
 */
public class QuarryApplicationPaymentServiceWrapper
	implements QuarryApplicationPaymentService,
			   ServiceWrapper<QuarryApplicationPaymentService> {

	public QuarryApplicationPaymentServiceWrapper() {
		this(null);
	}

	public QuarryApplicationPaymentServiceWrapper(
		QuarryApplicationPaymentService quarryApplicationPaymentService) {

		_quarryApplicationPaymentService = quarryApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public QuarryApplicationPaymentService getWrappedService() {
		return _quarryApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationPaymentService quarryApplicationPaymentService) {

		_quarryApplicationPaymentService = quarryApplicationPaymentService;
	}

	private QuarryApplicationPaymentService _quarryApplicationPaymentService;

}