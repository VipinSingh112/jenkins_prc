/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductiveInputsFormAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddService
 * @generated
 */
public class ProductiveInputsFormAddServiceWrapper
	implements ProductiveInputsFormAddService,
			   ServiceWrapper<ProductiveInputsFormAddService> {

	public ProductiveInputsFormAddServiceWrapper() {
		this(null);
	}

	public ProductiveInputsFormAddServiceWrapper(
		ProductiveInputsFormAddService productiveInputsFormAddService) {

		_productiveInputsFormAddService = productiveInputsFormAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productiveInputsFormAddService.getOSGiServiceIdentifier();
	}

	@Override
	public ProductiveInputsFormAddService getWrappedService() {
		return _productiveInputsFormAddService;
	}

	@Override
	public void setWrappedService(
		ProductiveInputsFormAddService productiveInputsFormAddService) {

		_productiveInputsFormAddService = productiveInputsFormAddService;
	}

	private ProductiveInputsFormAddService _productiveInputsFormAddService;

}