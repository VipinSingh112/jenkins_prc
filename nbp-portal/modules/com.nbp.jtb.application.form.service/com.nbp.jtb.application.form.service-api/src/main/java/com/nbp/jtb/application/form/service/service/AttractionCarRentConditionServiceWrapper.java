/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionCarRentConditionService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentConditionService
 * @generated
 */
public class AttractionCarRentConditionServiceWrapper
	implements AttractionCarRentConditionService,
			   ServiceWrapper<AttractionCarRentConditionService> {

	public AttractionCarRentConditionServiceWrapper() {
		this(null);
	}

	public AttractionCarRentConditionServiceWrapper(
		AttractionCarRentConditionService attractionCarRentConditionService) {

		_attractionCarRentConditionService = attractionCarRentConditionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionCarRentConditionService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionCarRentConditionService getWrappedService() {
		return _attractionCarRentConditionService;
	}

	@Override
	public void setWrappedService(
		AttractionCarRentConditionService attractionCarRentConditionService) {

		_attractionCarRentConditionService = attractionCarRentConditionService;
	}

	private AttractionCarRentConditionService
		_attractionCarRentConditionService;

}