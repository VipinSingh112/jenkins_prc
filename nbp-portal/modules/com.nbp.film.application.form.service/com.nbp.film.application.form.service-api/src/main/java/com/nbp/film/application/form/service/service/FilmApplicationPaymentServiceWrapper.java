/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmApplicationPaymentService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPaymentService
 * @generated
 */
public class FilmApplicationPaymentServiceWrapper
	implements FilmApplicationPaymentService,
			   ServiceWrapper<FilmApplicationPaymentService> {

	public FilmApplicationPaymentServiceWrapper() {
		this(null);
	}

	public FilmApplicationPaymentServiceWrapper(
		FilmApplicationPaymentService filmApplicationPaymentService) {

		_filmApplicationPaymentService = filmApplicationPaymentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationPaymentService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmApplicationPaymentService getWrappedService() {
		return _filmApplicationPaymentService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationPaymentService filmApplicationPaymentService) {

		_filmApplicationPaymentService = filmApplicationPaymentService;
	}

	private FilmApplicationPaymentService _filmApplicationPaymentService;

}