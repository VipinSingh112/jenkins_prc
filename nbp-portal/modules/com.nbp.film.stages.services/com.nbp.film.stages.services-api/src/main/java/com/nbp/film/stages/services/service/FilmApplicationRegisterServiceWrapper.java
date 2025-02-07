/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmApplicationRegisterService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterService
 * @generated
 */
public class FilmApplicationRegisterServiceWrapper
	implements FilmApplicationRegisterService,
			   ServiceWrapper<FilmApplicationRegisterService> {

	public FilmApplicationRegisterServiceWrapper() {
		this(null);
	}

	public FilmApplicationRegisterServiceWrapper(
		FilmApplicationRegisterService filmApplicationRegisterService) {

		_filmApplicationRegisterService = filmApplicationRegisterService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationRegisterService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmApplicationRegisterService getWrappedService() {
		return _filmApplicationRegisterService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationRegisterService filmApplicationRegisterService) {

		_filmApplicationRegisterService = filmApplicationRegisterService;
	}

	private FilmApplicationRegisterService _filmApplicationRegisterService;

}