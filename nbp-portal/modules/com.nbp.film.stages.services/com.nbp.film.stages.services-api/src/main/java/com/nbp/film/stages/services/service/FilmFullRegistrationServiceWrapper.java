/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmFullRegistrationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistrationService
 * @generated
 */
public class FilmFullRegistrationServiceWrapper
	implements FilmFullRegistrationService,
			   ServiceWrapper<FilmFullRegistrationService> {

	public FilmFullRegistrationServiceWrapper() {
		this(null);
	}

	public FilmFullRegistrationServiceWrapper(
		FilmFullRegistrationService filmFullRegistrationService) {

		_filmFullRegistrationService = filmFullRegistrationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmFullRegistrationService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmFullRegistrationService getWrappedService() {
		return _filmFullRegistrationService;
	}

	@Override
	public void setWrappedService(
		FilmFullRegistrationService filmFullRegistrationService) {

		_filmFullRegistrationService = filmFullRegistrationService;
	}

	private FilmFullRegistrationService _filmFullRegistrationService;

}