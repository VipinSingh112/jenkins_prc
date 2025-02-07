/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExplosiveAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentService
 * @generated
 */
public class ExplosiveAppPaymentServiceWrapper
	implements ExplosiveAppPaymentService,
			   ServiceWrapper<ExplosiveAppPaymentService> {

	public ExplosiveAppPaymentServiceWrapper() {
		this(null);
	}

	public ExplosiveAppPaymentServiceWrapper(
		ExplosiveAppPaymentService explosiveAppPaymentService) {

		_explosiveAppPaymentService = explosiveAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public ExplosiveAppPaymentService getWrappedService() {
		return _explosiveAppPaymentService;
	}

	@Override
	public void setWrappedService(
		ExplosiveAppPaymentService explosiveAppPaymentService) {

		_explosiveAppPaymentService = explosiveAppPaymentService;
	}

	private ExplosiveAppPaymentService _explosiveAppPaymentService;

}