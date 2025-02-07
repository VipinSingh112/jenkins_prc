/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductiveInputsFormService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormService
 * @generated
 */
public class ProductiveInputsFormServiceWrapper
	implements ProductiveInputsFormService,
			   ServiceWrapper<ProductiveInputsFormService> {

	public ProductiveInputsFormServiceWrapper() {
		this(null);
	}

	public ProductiveInputsFormServiceWrapper(
		ProductiveInputsFormService productiveInputsFormService) {

		_productiveInputsFormService = productiveInputsFormService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productiveInputsFormService.getOSGiServiceIdentifier();
	}

	@Override
	public ProductiveInputsFormService getWrappedService() {
		return _productiveInputsFormService;
	}

	@Override
	public void setWrappedService(
		ProductiveInputsFormService productiveInputsFormService) {

		_productiveInputsFormService = productiveInputsFormService;
	}

	private ProductiveInputsFormService _productiveInputsFormService;

}