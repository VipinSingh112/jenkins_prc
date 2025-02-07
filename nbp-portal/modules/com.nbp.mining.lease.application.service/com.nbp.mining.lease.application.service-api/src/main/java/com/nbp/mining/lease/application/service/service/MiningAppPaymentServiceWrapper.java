/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MiningAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppPaymentService
 * @generated
 */
public class MiningAppPaymentServiceWrapper
	implements MiningAppPaymentService,
			   ServiceWrapper<MiningAppPaymentService> {

	public MiningAppPaymentServiceWrapper() {
		this(null);
	}

	public MiningAppPaymentServiceWrapper(
		MiningAppPaymentService miningAppPaymentService) {

		_miningAppPaymentService = miningAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public MiningAppPaymentService getWrappedService() {
		return _miningAppPaymentService;
	}

	@Override
	public void setWrappedService(
		MiningAppPaymentService miningAppPaymentService) {

		_miningAppPaymentService = miningAppPaymentService;
	}

	private MiningAppPaymentService _miningAppPaymentService;

}