/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaManufacturerInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaManufacturerInfoService
 * @generated
 */
public class PharmaManufacturerInfoServiceWrapper
	implements PharmaManufacturerInfoService,
			   ServiceWrapper<PharmaManufacturerInfoService> {

	public PharmaManufacturerInfoServiceWrapper() {
		this(null);
	}

	public PharmaManufacturerInfoServiceWrapper(
		PharmaManufacturerInfoService pharmaManufacturerInfoService) {

		_pharmaManufacturerInfoService = pharmaManufacturerInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaManufacturerInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaManufacturerInfoService getWrappedService() {
		return _pharmaManufacturerInfoService;
	}

	@Override
	public void setWrappedService(
		PharmaManufacturerInfoService pharmaManufacturerInfoService) {

		_pharmaManufacturerInfoService = pharmaManufacturerInfoService;
	}

	private PharmaManufacturerInfoService _pharmaManufacturerInfoService;

}