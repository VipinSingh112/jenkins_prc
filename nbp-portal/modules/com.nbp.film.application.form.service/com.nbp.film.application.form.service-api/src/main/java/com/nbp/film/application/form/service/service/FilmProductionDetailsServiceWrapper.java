/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmProductionDetailsService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetailsService
 * @generated
 */
public class FilmProductionDetailsServiceWrapper
	implements FilmProductionDetailsService,
			   ServiceWrapper<FilmProductionDetailsService> {

	public FilmProductionDetailsServiceWrapper() {
		this(null);
	}

	public FilmProductionDetailsServiceWrapper(
		FilmProductionDetailsService filmProductionDetailsService) {

		_filmProductionDetailsService = filmProductionDetailsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmProductionDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmProductionDetailsService getWrappedService() {
		return _filmProductionDetailsService;
	}

	@Override
	public void setWrappedService(
		FilmProductionDetailsService filmProductionDetailsService) {

		_filmProductionDetailsService = filmProductionDetailsService;
	}

	private FilmProductionDetailsService _filmProductionDetailsService;

}