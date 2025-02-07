/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationPaymentService
 * @generated
 */
public class OsiInsolvencyApplicationPaymentServiceWrapper
	implements OsiInsolvencyApplicationPaymentService,
			   ServiceWrapper<OsiInsolvencyApplicationPaymentService> {

	public OsiInsolvencyApplicationPaymentServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationPaymentServiceWrapper(
		OsiInsolvencyApplicationPaymentService
			osiInsolvencyApplicationPaymentService) {

		_osiInsolvencyApplicationPaymentService =
			osiInsolvencyApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationPaymentService.
			getOSGiServiceIdentifier();
	}

	@Override
	public OsiInsolvencyApplicationPaymentService getWrappedService() {
		return _osiInsolvencyApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationPaymentService
			osiInsolvencyApplicationPaymentService) {

		_osiInsolvencyApplicationPaymentService =
			osiInsolvencyApplicationPaymentService;
	}

	private OsiInsolvencyApplicationPaymentService
		_osiInsolvencyApplicationPaymentService;

}