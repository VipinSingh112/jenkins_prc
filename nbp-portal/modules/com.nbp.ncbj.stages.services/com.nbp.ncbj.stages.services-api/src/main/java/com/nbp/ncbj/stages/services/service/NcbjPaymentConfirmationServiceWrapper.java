/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcbjPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationService
 * @generated
 */
public class NcbjPaymentConfirmationServiceWrapper
	implements NcbjPaymentConfirmationService,
			   ServiceWrapper<NcbjPaymentConfirmationService> {

	public NcbjPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public NcbjPaymentConfirmationServiceWrapper(
		NcbjPaymentConfirmationService ncbjPaymentConfirmationService) {

		_ncbjPaymentConfirmationService = ncbjPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public NcbjPaymentConfirmationService getWrappedService() {
		return _ncbjPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		NcbjPaymentConfirmationService ncbjPaymentConfirmationService) {

		_ncbjPaymentConfirmationService = ncbjPaymentConfirmationService;
	}

	private NcbjPaymentConfirmationService _ncbjPaymentConfirmationService;

}