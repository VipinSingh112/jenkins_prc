/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionWaterGenDeclareService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterGenDeclareService
 * @generated
 */
public class AttractionWaterGenDeclareServiceWrapper
	implements AttractionWaterGenDeclareService,
			   ServiceWrapper<AttractionWaterGenDeclareService> {

	public AttractionWaterGenDeclareServiceWrapper() {
		this(null);
	}

	public AttractionWaterGenDeclareServiceWrapper(
		AttractionWaterGenDeclareService attractionWaterGenDeclareService) {

		_attractionWaterGenDeclareService = attractionWaterGenDeclareService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterGenDeclareService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionWaterGenDeclareService getWrappedService() {
		return _attractionWaterGenDeclareService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterGenDeclareService attractionWaterGenDeclareService) {

		_attractionWaterGenDeclareService = attractionWaterGenDeclareService;
	}

	private AttractionWaterGenDeclareService _attractionWaterGenDeclareService;

}