/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FilmAdditionalEquipmentListService}.
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListService
 * @generated
 */
public class FilmAdditionalEquipmentListServiceWrapper
	implements FilmAdditionalEquipmentListService,
			   ServiceWrapper<FilmAdditionalEquipmentListService> {

	public FilmAdditionalEquipmentListServiceWrapper() {
		this(null);
	}

	public FilmAdditionalEquipmentListServiceWrapper(
		FilmAdditionalEquipmentListService filmAdditionalEquipmentListService) {

		_filmAdditionalEquipmentListService =
			filmAdditionalEquipmentListService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _filmAdditionalEquipmentListService.getOSGiServiceIdentifier();
	}

	@Override
	public FilmAdditionalEquipmentListService getWrappedService() {
		return _filmAdditionalEquipmentListService;
	}

	@Override
	public void setWrappedService(
		FilmAdditionalEquipmentListService filmAdditionalEquipmentListService) {

		_filmAdditionalEquipmentListService =
			filmAdditionalEquipmentListService;
	}

	private FilmAdditionalEquipmentListService
		_filmAdditionalEquipmentListService;

}