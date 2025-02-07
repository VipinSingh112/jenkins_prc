/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmOtherDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetailsService
 * @generated
 */
public class FilmOtherDetailsServiceWrapper
	implements FilmOtherDetailsService,
			   ServiceWrapper<FilmOtherDetailsService> {

	public FilmOtherDetailsServiceWrapper() {
		this(null);
	}

	public FilmOtherDetailsServiceWrapper(
		FilmOtherDetailsService filmOtherDetailsService) {

		_filmOtherDetailsService = filmOtherDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmOtherDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmOtherDetailsService getWrappedService() {
		return _filmOtherDetailsService;
	}

	@Override
	public void setWrappedService(
		FilmOtherDetailsService filmOtherDetailsService) {

		_filmOtherDetailsService = filmOtherDetailsService;
	}

	private FilmOtherDetailsService _filmOtherDetailsService;

}