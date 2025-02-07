/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LicenceToAbstractInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfoService
 * @generated
 */
public class LicenceToAbstractInfoServiceWrapper
	implements LicenceToAbstractInfoService,
			   ServiceWrapper<LicenceToAbstractInfoService> {

	public LicenceToAbstractInfoServiceWrapper() {
		this(null);
	}

	public LicenceToAbstractInfoServiceWrapper(
		LicenceToAbstractInfoService licenceToAbstractInfoService) {

		_licenceToAbstractInfoService = licenceToAbstractInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _licenceToAbstractInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public LicenceToAbstractInfoService getWrappedService() {
		return _licenceToAbstractInfoService;
	}

	@Override
	public void setWrappedService(
		LicenceToAbstractInfoService licenceToAbstractInfoService) {

		_licenceToAbstractInfoService = licenceToAbstractInfoService;
	}

	private LicenceToAbstractInfoService _licenceToAbstractInfoService;

}