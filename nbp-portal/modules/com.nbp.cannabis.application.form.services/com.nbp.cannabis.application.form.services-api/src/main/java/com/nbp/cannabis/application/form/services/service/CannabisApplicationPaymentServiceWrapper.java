/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationPaymentService
 * @generated
 */
public class CannabisApplicationPaymentServiceWrapper
	implements CannabisApplicationPaymentService,
			   ServiceWrapper<CannabisApplicationPaymentService> {

	public CannabisApplicationPaymentServiceWrapper() {
		this(null);
	}

	public CannabisApplicationPaymentServiceWrapper(
		CannabisApplicationPaymentService cannabisApplicationPaymentService) {

		_cannabisApplicationPaymentService = cannabisApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationPaymentService getWrappedService() {
		return _cannabisApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationPaymentService cannabisApplicationPaymentService) {

		_cannabisApplicationPaymentService = cannabisApplicationPaymentService;
	}

	private CannabisApplicationPaymentService
		_cannabisApplicationPaymentService;

}