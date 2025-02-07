/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuCompanyInfoAddressService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddressService
 * @generated
 */
public class ManuCompanyInfoAddressServiceWrapper
	implements ManuCompanyInfoAddressService,
			   ServiceWrapper<ManuCompanyInfoAddressService> {

	public ManuCompanyInfoAddressServiceWrapper() {
		this(null);
	}

	public ManuCompanyInfoAddressServiceWrapper(
		ManuCompanyInfoAddressService manuCompanyInfoAddressService) {

		_manuCompanyInfoAddressService = manuCompanyInfoAddressService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuCompanyInfoAddressService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuCompanyInfoAddressService getWrappedService() {
		return _manuCompanyInfoAddressService;
	}

	@Override
	public void setWrappedService(
		ManuCompanyInfoAddressService manuCompanyInfoAddressService) {

		_manuCompanyInfoAddressService = manuCompanyInfoAddressService;
	}

	private ManuCompanyInfoAddressService _manuCompanyInfoAddressService;

}