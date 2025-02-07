/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmApplicationCurrentStageService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStageService
 * @generated
 */
public class FilmApplicationCurrentStageServiceWrapper
	implements FilmApplicationCurrentStageService,
			   ServiceWrapper<FilmApplicationCurrentStageService> {

	public FilmApplicationCurrentStageServiceWrapper() {
		this(null);
	}

	public FilmApplicationCurrentStageServiceWrapper(
		FilmApplicationCurrentStageService filmApplicationCurrentStageService) {

		_filmApplicationCurrentStageService =
			filmApplicationCurrentStageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmApplicationCurrentStageService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmApplicationCurrentStageService getWrappedService() {
		return _filmApplicationCurrentStageService;
	}

	@Override
	public void setWrappedService(
		FilmApplicationCurrentStageService filmApplicationCurrentStageService) {

		_filmApplicationCurrentStageService =
			filmApplicationCurrentStageService;
	}

	private FilmApplicationCurrentStageService
		_filmApplicationCurrentStageService;

}