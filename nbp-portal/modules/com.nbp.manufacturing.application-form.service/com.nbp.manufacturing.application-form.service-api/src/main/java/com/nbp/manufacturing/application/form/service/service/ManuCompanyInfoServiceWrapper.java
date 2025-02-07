/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuCompanyInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoService
 * @generated
 */
public class ManuCompanyInfoServiceWrapper
	implements ManuCompanyInfoService, ServiceWrapper<ManuCompanyInfoService> {

	public ManuCompanyInfoServiceWrapper() {
		this(null);
	}

	public ManuCompanyInfoServiceWrapper(
		ManuCompanyInfoService manuCompanyInfoService) {

		_manuCompanyInfoService = manuCompanyInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuCompanyInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuCompanyInfoService getWrappedService() {
		return _manuCompanyInfoService;
	}

	@Override
	public void setWrappedService(
		ManuCompanyInfoService manuCompanyInfoService) {

		_manuCompanyInfoService = manuCompanyInfoService;
	}

	private ManuCompanyInfoService _manuCompanyInfoService;

}