/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmDeskVerificationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerificationService
 * @generated
 */
public class FilmDeskVerificationServiceWrapper
	implements FilmDeskVerificationService,
			   ServiceWrapper<FilmDeskVerificationService> {

	public FilmDeskVerificationServiceWrapper() {
		this(null);
	}

	public FilmDeskVerificationServiceWrapper(
		FilmDeskVerificationService filmDeskVerificationService) {

		_filmDeskVerificationService = filmDeskVerificationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmDeskVerificationService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmDeskVerificationService getWrappedService() {
		return _filmDeskVerificationService;
	}

	@Override
	public void setWrappedService(
		FilmDeskVerificationService filmDeskVerificationService) {

		_filmDeskVerificationService = filmDeskVerificationService;
	}

	private FilmDeskVerificationService _filmDeskVerificationService;

}