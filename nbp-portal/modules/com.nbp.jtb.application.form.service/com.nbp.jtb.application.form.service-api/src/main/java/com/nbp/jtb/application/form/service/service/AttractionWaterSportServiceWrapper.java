/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionWaterSportService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSportService
 * @generated
 */
public class AttractionWaterSportServiceWrapper
	implements AttractionWaterSportService,
			   ServiceWrapper<AttractionWaterSportService> {

	public AttractionWaterSportServiceWrapper() {
		this(null);
	}

	public AttractionWaterSportServiceWrapper(
		AttractionWaterSportService attractionWaterSportService) {

		_attractionWaterSportService = attractionWaterSportService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterSportService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionWaterSportService getWrappedService() {
		return _attractionWaterSportService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterSportService attractionWaterSportService) {

		_attractionWaterSportService = attractionWaterSportService;
	}

	private AttractionWaterSportService _attractionWaterSportService;

}