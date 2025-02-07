/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManufacturingApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationService
 * @generated
 */
public class ManufacturingApplicationServiceWrapper
	implements ManufacturingApplicationService,
			   ServiceWrapper<ManufacturingApplicationService> {

	public ManufacturingApplicationServiceWrapper() {
		this(null);
	}

	public ManufacturingApplicationServiceWrapper(
		ManufacturingApplicationService manufacturingApplicationService) {

		_manufacturingApplicationService = manufacturingApplicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingApplicationService.getOSGiServiceIdentifier();
	}

	@Override
	public ManufacturingApplicationService getWrappedService() {
		return _manufacturingApplicationService;
	}

	@Override
	public void setWrappedService(
		ManufacturingApplicationService manufacturingApplicationService) {

		_manufacturingApplicationService = manufacturingApplicationService;
	}

	private ManufacturingApplicationService _manufacturingApplicationService;

}