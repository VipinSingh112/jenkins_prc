/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmApplicationStagesService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationStagesService
 * @generated
 */
public class FilmApplicationStagesServiceWrapper
	implements FilmApplicationStagesService,
			   ServiceWrapper<FilmApplicationStagesService> {

	public FilmApplicationStagesServiceWrapper() {
		this(null);
	}

	public FilmApplicationStagesServiceWrapper(
		FilmApplicationStagesService filmApplicationStagesService) {

		_filmApplicationStagesService = filmApplicationStagesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationStagesService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmApplicationStagesService getWrappedService() {
		return _filmApplicationStagesService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationStagesService filmApplicationStagesService) {

		_filmApplicationStagesService = filmApplicationStagesService;
	}

	private FilmApplicationStagesService _filmApplicationStagesService;

}