/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PharmaMedicalDeviceInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaMedicalDeviceInfoService
 * @generated
 */
public class PharmaMedicalDeviceInfoServiceWrapper
	implements PharmaMedicalDeviceInfoService,
			   ServiceWrapper<PharmaMedicalDeviceInfoService> {

	public PharmaMedicalDeviceInfoServiceWrapper() {
		this(null);
	}

	public PharmaMedicalDeviceInfoServiceWrapper(
		PharmaMedicalDeviceInfoService pharmaMedicalDeviceInfoService) {

		_pharmaMedicalDeviceInfoService = pharmaMedicalDeviceInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaMedicalDeviceInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public PharmaMedicalDeviceInfoService getWrappedService() {
		return _pharmaMedicalDeviceInfoService;
	}

	@Override
	public void setWrappedService(
		PharmaMedicalDeviceInfoService pharmaMedicalDeviceInfoService) {

		_pharmaMedicalDeviceInfoService = pharmaMedicalDeviceInfoService;
	}

	private PharmaMedicalDeviceInfoService _pharmaMedicalDeviceInfoService;

}