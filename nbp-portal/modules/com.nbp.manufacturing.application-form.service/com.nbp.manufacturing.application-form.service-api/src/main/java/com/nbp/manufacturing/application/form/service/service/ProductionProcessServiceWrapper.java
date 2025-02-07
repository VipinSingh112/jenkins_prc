/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductionProcessService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductionProcessService
 * @generated
 */
public class ProductionProcessServiceWrapper
	implements ProductionProcessService,
			   ServiceWrapper<ProductionProcessService> {

	public ProductionProcessServiceWrapper() {
		this(null);
	}

	public ProductionProcessServiceWrapper(
		ProductionProcessService productionProcessService) {

		_productionProcessService = productionProcessService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productionProcessService.getOSGiServiceIdentifier();
	}

	@Override
	public ProductionProcessService getWrappedService() {
		return _productionProcessService;
	}

	@Override
	public void setWrappedService(
		ProductionProcessService productionProcessService) {

		_productionProcessService = productionProcessService;
	}

	private ProductionProcessService _productionProcessService;

}