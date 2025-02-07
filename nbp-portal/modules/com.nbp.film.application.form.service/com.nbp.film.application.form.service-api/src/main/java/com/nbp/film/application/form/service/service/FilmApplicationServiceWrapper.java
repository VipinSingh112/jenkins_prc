/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationService
 * @generated
 */
public class FilmApplicationServiceWrapper
	implements FilmApplicationService, ServiceWrapper<FilmApplicationService> {

	public FilmApplicationServiceWrapper() {
		this(null);
	}

	public FilmApplicationServiceWrapper(
		FilmApplicationService filmApplicationService) {

		_filmApplicationService = filmApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmApplicationService getWrappedService() {
		return _filmApplicationService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationService filmApplicationService) {

		_filmApplicationService = filmApplicationService;
	}

	private FilmApplicationService _filmApplicationService;

}