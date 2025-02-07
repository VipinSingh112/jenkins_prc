/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NcraVerifyWeighingDeviceInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfoService
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoServiceWrapper
	implements NcraVerifyWeighingDeviceInfoService,
			   ServiceWrapper<NcraVerifyWeighingDeviceInfoService> {

	public NcraVerifyWeighingDeviceInfoServiceWrapper() {
		this(null);
	}

	public NcraVerifyWeighingDeviceInfoServiceWrapper(
		NcraVerifyWeighingDeviceInfoService
			ncraVerifyWeighingDeviceInfoService) {

		_ncraVerifyWeighingDeviceInfoService =
			ncraVerifyWeighingDeviceInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraVerifyWeighingDeviceInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public NcraVerifyWeighingDeviceInfoService getWrappedService() {
		return _ncraVerifyWeighingDeviceInfoService;
	}

	@Override
	public void setWrappedService(
		NcraVerifyWeighingDeviceInfoService
			ncraVerifyWeighingDeviceInfoService) {

		_ncraVerifyWeighingDeviceInfoService =
			ncraVerifyWeighingDeviceInfoService;
	}

	private NcraVerifyWeighingDeviceInfoService
		_ncraVerifyWeighingDeviceInfoService;

}