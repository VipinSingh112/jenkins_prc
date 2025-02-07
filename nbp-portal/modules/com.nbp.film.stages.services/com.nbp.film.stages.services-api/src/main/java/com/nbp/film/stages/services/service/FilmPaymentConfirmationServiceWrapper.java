/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmPaymentConfirmationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmPaymentConfirmationService
 * @generated
 */
public class FilmPaymentConfirmationServiceWrapper
	implements FilmPaymentConfirmationService,
			   ServiceWrapper<FilmPaymentConfirmationService> {

	public FilmPaymentConfirmationServiceWrapper() {
		this(null);
	}

	public FilmPaymentConfirmationServiceWrapper(
		FilmPaymentConfirmationService filmPaymentConfirmationService) {

		_filmPaymentConfirmationService = filmPaymentConfirmationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmPaymentConfirmationService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmPaymentConfirmationService getWrappedService() {
		return _filmPaymentConfirmationService;
	}

	@Override
	public void setWrappedService(
		FilmPaymentConfirmationService filmPaymentConfirmationService) {

		_filmPaymentConfirmationService = filmPaymentConfirmationService;
	}

	private FilmPaymentConfirmationService _filmPaymentConfirmationService;

}