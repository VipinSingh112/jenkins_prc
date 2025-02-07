/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmEquipmentListService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListService
 * @generated
 */
public class FilmEquipmentListServiceWrapper
	implements FilmEquipmentListService,
			   ServiceWrapper<FilmEquipmentListService> {

	public FilmEquipmentListServiceWrapper() {
		this(null);
	}

	public FilmEquipmentListServiceWrapper(
		FilmEquipmentListService filmEquipmentListService) {

		_filmEquipmentListService = filmEquipmentListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmEquipmentListService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmEquipmentListService getWrappedService() {
		return _filmEquipmentListService;
	}

	@Override
	public void setWrappedService(
		FilmEquipmentListService filmEquipmentListService) {

		_filmEquipmentListService = filmEquipmentListService;
	}

	private FilmEquipmentListService _filmEquipmentListService;

}