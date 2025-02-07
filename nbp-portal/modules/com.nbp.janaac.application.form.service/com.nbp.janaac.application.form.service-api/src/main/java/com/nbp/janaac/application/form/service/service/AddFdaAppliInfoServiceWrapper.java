/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AddFdaAppliInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfoService
 * @generated
 */
public class AddFdaAppliInfoServiceWrapper
	implements AddFdaAppliInfoService, ServiceWrapper<AddFdaAppliInfoService> {

	public AddFdaAppliInfoServiceWrapper() {
		this(null);
	}

	public AddFdaAppliInfoServiceWrapper(
		AddFdaAppliInfoService addFdaAppliInfoService) {

		_addFdaAppliInfoService = addFdaAppliInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaAppliInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public AddFdaAppliInfoService getWrappedService() {
		return _addFdaAppliInfoService;
	}

	@Override
	public void setWrappedService(
		AddFdaAppliInfoService addFdaAppliInfoService) {

		_addFdaAppliInfoService = addFdaAppliInfoService;
	}

	private AddFdaAppliInfoService _addFdaAppliInfoService;

}