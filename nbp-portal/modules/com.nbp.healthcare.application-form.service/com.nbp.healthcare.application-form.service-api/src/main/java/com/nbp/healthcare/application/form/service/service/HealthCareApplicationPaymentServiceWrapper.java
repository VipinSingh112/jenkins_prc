/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HealthCareApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPaymentService
 * @generated
 */
public class HealthCareApplicationPaymentServiceWrapper
	implements HealthCareApplicationPaymentService,
			   ServiceWrapper<HealthCareApplicationPaymentService> {

	public HealthCareApplicationPaymentServiceWrapper() {
		this(null);
	}

	public HealthCareApplicationPaymentServiceWrapper(
		HealthCareApplicationPaymentService
			healthCareApplicationPaymentService) {

		_healthCareApplicationPaymentService =
			healthCareApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public HealthCareApplicationPaymentService getWrappedService() {
		return _healthCareApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicationPaymentService
			healthCareApplicationPaymentService) {

		_healthCareApplicationPaymentService =
			healthCareApplicationPaymentService;
	}

	private HealthCareApplicationPaymentService
		_healthCareApplicationPaymentService;

}