/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadionuclideInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfoService
 * @generated
 */
public class RadionuclideInfoServiceWrapper
	implements RadionuclideInfoService,
			   ServiceWrapper<RadionuclideInfoService> {

	public RadionuclideInfoServiceWrapper() {
		this(null);
	}

	public RadionuclideInfoServiceWrapper(
		RadionuclideInfoService radionuclideInfoService) {

		_radionuclideInfoService = radionuclideInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radionuclideInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public RadionuclideInfoService getWrappedService() {
		return _radionuclideInfoService;
	}

	@Override
	public void setWrappedService(
		RadionuclideInfoService radionuclideInfoService) {

		_radionuclideInfoService = radionuclideInfoService;
	}

	private RadionuclideInfoService _radionuclideInfoService;

}