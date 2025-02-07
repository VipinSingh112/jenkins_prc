/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AttractionWaterEmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployeeService
 * @generated
 */
public class AttractionWaterEmployeeServiceWrapper
	implements AttractionWaterEmployeeService,
			   ServiceWrapper<AttractionWaterEmployeeService> {

	public AttractionWaterEmployeeServiceWrapper() {
		this(null);
	}

	public AttractionWaterEmployeeServiceWrapper(
		AttractionWaterEmployeeService attractionWaterEmployeeService) {

		_attractionWaterEmployeeService = attractionWaterEmployeeService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractionWaterEmployeeService.getOSGiServiceIdentifier();
	}

	@Override
	public AttractionWaterEmployeeService getWrappedService() {
		return _attractionWaterEmployeeService;
	}

	@Override
	public void setWrappedService(
		AttractionWaterEmployeeService attractionWaterEmployeeService) {

		_attractionWaterEmployeeService = attractionWaterEmployeeService;
	}

	private AttractionWaterEmployeeService _attractionWaterEmployeeService;

}