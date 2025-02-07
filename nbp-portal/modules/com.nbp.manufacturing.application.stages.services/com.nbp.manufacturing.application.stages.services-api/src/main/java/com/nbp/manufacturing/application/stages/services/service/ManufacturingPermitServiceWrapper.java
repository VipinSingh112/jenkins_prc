/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManufacturingPermitService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingPermitService
 * @generated
 */
public class ManufacturingPermitServiceWrapper
	implements ManufacturingPermitService,
			   ServiceWrapper<ManufacturingPermitService> {

	public ManufacturingPermitServiceWrapper() {
		this(null);
	}

	public ManufacturingPermitServiceWrapper(
		ManufacturingPermitService manufacturingPermitService) {

		_manufacturingPermitService = manufacturingPermitService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingPermitService.getOSGiServiceIdentifier();
	}

	@Override
	public ManufacturingPermitService getWrappedService() {
		return _manufacturingPermitService;
	}

	@Override
	public void setWrappedService(
		ManufacturingPermitService manufacturingPermitService) {

		_manufacturingPermitService = manufacturingPermitService;
	}

	private ManufacturingPermitService _manufacturingPermitService;

}