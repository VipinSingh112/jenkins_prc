/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPaymentConfirmationService
 * @generated
 */
public class TourismPaymentConfirmationServiceWrapper
	implements ServiceWrapper<TourismPaymentConfirmationService>,
			   TourismPaymentConfirmationService {

	public TourismPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public TourismPaymentConfirmationServiceWrapper(
		TourismPaymentConfirmationService tourismPaymentConfirmationService) {

		_tourismPaymentConfirmationService = tourismPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public TourismPaymentConfirmationService getWrappedService() {
		return _tourismPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		TourismPaymentConfirmationService tourismPaymentConfirmationService) {

		_tourismPaymentConfirmationService = tourismPaymentConfirmationService;
	}

	private TourismPaymentConfirmationService
		_tourismPaymentConfirmationService;

}