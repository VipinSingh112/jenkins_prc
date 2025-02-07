/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionWaterRequiredService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequiredService
 * @generated
 */
public class AttractionWaterRequiredServiceWrapper
	implements AttractionWaterRequiredService,
			   ServiceWrapper<AttractionWaterRequiredService> {

	public AttractionWaterRequiredServiceWrapper() {
		this(null);
	}

	public AttractionWaterRequiredServiceWrapper(
		AttractionWaterRequiredService attractionWaterRequiredService) {

		_attractionWaterRequiredService = attractionWaterRequiredService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterRequiredService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionWaterRequiredService getWrappedService() {
		return _attractionWaterRequiredService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterRequiredService attractionWaterRequiredService) {

		_attractionWaterRequiredService = attractionWaterRequiredService;
	}

	private AttractionWaterRequiredService _attractionWaterRequiredService;

}