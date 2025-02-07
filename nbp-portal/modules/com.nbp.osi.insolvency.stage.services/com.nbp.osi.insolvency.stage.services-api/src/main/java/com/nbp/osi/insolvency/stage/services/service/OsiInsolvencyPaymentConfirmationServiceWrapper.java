/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolvencyPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationService
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationServiceWrapper
	implements OsiInsolvencyPaymentConfirmationService,
			   ServiceWrapper<OsiInsolvencyPaymentConfirmationService> {

	public OsiInsolvencyPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyPaymentConfirmationServiceWrapper(
		OsiInsolvencyPaymentConfirmationService
			osiInsolvencyPaymentConfirmationService) {

		_osiInsolvencyPaymentConfirmationService =
			osiInsolvencyPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyPaymentConfirmationService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolvencyPaymentConfirmationService getWrappedService() {
		return _osiInsolvencyPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyPaymentConfirmationService
			osiInsolvencyPaymentConfirmationService) {

		_osiInsolvencyPaymentConfirmationService =
			osiInsolvencyPaymentConfirmationService;
	}

	private OsiInsolvencyPaymentConfirmationService
		_osiInsolvencyPaymentConfirmationService;

}