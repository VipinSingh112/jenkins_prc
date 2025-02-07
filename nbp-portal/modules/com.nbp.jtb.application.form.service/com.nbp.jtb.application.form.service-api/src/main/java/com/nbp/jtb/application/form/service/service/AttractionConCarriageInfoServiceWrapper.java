/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionConCarriageInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionConCarriageInfoService
 * @generated
 */
public class AttractionConCarriageInfoServiceWrapper
	implements AttractionConCarriageInfoService,
			   ServiceWrapper<AttractionConCarriageInfoService> {

	public AttractionConCarriageInfoServiceWrapper() {
		this(null);
	}

	public AttractionConCarriageInfoServiceWrapper(
		AttractionConCarriageInfoService attractionConCarriageInfoService) {

		_attractionConCarriageInfoService = attractionConCarriageInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionConCarriageInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionConCarriageInfoService getWrappedService() {
		return _attractionConCarriageInfoService;
	}

	@Override
	public void setWrappedService(
		AttractionConCarriageInfoService attractionConCarriageInfoService) {

		_attractionConCarriageInfoService = attractionConCarriageInfoService;
	}

	private AttractionConCarriageInfoService _attractionConCarriageInfoService;

}