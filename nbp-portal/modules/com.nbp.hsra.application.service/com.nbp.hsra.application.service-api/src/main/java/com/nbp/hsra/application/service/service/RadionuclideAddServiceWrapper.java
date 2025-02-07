/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RadionuclideAddService}.
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideAddService
 * @generated
 */
public class RadionuclideAddServiceWrapper
	implements RadionuclideAddService, ServiceWrapper<RadionuclideAddService> {

	public RadionuclideAddServiceWrapper() {
		this(null);
	}

	public RadionuclideAddServiceWrapper(
		RadionuclideAddService radionuclideAddService) {

		_radionuclideAddService = radionuclideAddService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _radionuclideAddService.getOSGiServiceIdentifier();
	}

	@Override
	public RadionuclideAddService getWrappedService() {
		return _radionuclideAddService;
	}

	@Override
	public void setWrappedService(
		RadionuclideAddService radionuclideAddService) {

		_radionuclideAddService = radionuclideAddService;
	}

	private RadionuclideAddService _radionuclideAddService;

}