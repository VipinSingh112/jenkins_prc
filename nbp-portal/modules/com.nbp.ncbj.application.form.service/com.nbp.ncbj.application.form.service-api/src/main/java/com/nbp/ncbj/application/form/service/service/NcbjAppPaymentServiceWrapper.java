/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppPaymentService
 * @generated
 */
public class NcbjAppPaymentServiceWrapper
	implements NcbjAppPaymentService, ServiceWrapper<NcbjAppPaymentService> {

	public NcbjAppPaymentServiceWrapper() {
		this(null);
	}

	public NcbjAppPaymentServiceWrapper(
		NcbjAppPaymentService ncbjAppPaymentService) {

		_ncbjAppPaymentService = ncbjAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjAppPaymentService getWrappedService() {
		return _ncbjAppPaymentService;
	}

	@Override
	public void setWrappedService(NcbjAppPaymentService ncbjAppPaymentService) {
		_ncbjAppPaymentService = ncbjAppPaymentService;
	}

	private NcbjAppPaymentService _ncbjAppPaymentService;

}