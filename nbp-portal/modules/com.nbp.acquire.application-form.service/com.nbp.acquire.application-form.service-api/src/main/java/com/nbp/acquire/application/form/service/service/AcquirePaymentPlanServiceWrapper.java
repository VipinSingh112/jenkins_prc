/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AcquirePaymentPlanService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanService
 * @generated
 */
public class AcquirePaymentPlanServiceWrapper
	implements AcquirePaymentPlanService,
			   ServiceWrapper<AcquirePaymentPlanService> {

	public AcquirePaymentPlanServiceWrapper() {
		this(null);
	}

	public AcquirePaymentPlanServiceWrapper(
		AcquirePaymentPlanService acquirePaymentPlanService) {

		_acquirePaymentPlanService = acquirePaymentPlanService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquirePaymentPlanService.getOSGiServiceIdentifier();
	}

	@Override
	public AcquirePaymentPlanService getWrappedService() {
		return _acquirePaymentPlanService;
	}

	@Override
	public void setWrappedService(
		AcquirePaymentPlanService acquirePaymentPlanService) {

		_acquirePaymentPlanService = acquirePaymentPlanService;
	}

	private AcquirePaymentPlanService _acquirePaymentPlanService;

}