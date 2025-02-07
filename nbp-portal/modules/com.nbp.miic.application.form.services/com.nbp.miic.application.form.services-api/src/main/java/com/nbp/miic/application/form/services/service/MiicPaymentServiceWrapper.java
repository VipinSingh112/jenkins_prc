/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiicPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicPaymentService
 * @generated
 */
public class MiicPaymentServiceWrapper
	implements MiicPaymentService, ServiceWrapper<MiicPaymentService> {

	public MiicPaymentServiceWrapper() {
		this(null);
	}

	public MiicPaymentServiceWrapper(MiicPaymentService miicPaymentService) {
		_miicPaymentService = miicPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public MiicPaymentService getWrappedService() {
		return _miicPaymentService;
	}

	@Override
	public void setWrappedService(MiicPaymentService miicPaymentService) {
		_miicPaymentService = miicPaymentService;
	}

	private MiicPaymentService _miicPaymentService;

}