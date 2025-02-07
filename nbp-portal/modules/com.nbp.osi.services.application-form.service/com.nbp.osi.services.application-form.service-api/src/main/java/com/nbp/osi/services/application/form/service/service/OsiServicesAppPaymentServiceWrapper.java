/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OsiServicesAppPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPaymentService
 * @generated
 */
public class OsiServicesAppPaymentServiceWrapper
	implements OsiServicesAppPaymentService,
			   ServiceWrapper<OsiServicesAppPaymentService> {

	public OsiServicesAppPaymentServiceWrapper() {
		this(null);
	}

	public OsiServicesAppPaymentServiceWrapper(
		OsiServicesAppPaymentService osiServicesAppPaymentService) {

		_osiServicesAppPaymentService = osiServicesAppPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesAppPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public OsiServicesAppPaymentService getWrappedService() {
		return _osiServicesAppPaymentService;
	}

	@Override
	public void setWrappedService(
		OsiServicesAppPaymentService osiServicesAppPaymentService) {

		_osiServicesAppPaymentService = osiServicesAppPaymentService;
	}

	private OsiServicesAppPaymentService _osiServicesAppPaymentService;

}