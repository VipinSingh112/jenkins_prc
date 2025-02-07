/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuAdditionalCompanyInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfoService
 * @generated
 */
public class ManuAdditionalCompanyInfoServiceWrapper
	implements ManuAdditionalCompanyInfoService,
			   ServiceWrapper<ManuAdditionalCompanyInfoService> {

	public ManuAdditionalCompanyInfoServiceWrapper() {
		this(null);
	}

	public ManuAdditionalCompanyInfoServiceWrapper(
		ManuAdditionalCompanyInfoService manuAdditionalCompanyInfoService) {

		_manuAdditionalCompanyInfoService = manuAdditionalCompanyInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuAdditionalCompanyInfoService.getOSGiServiceIdentifier();
	}

	@Override
	public ManuAdditionalCompanyInfoService getWrappedService() {
		return _manuAdditionalCompanyInfoService;
	}

	@Override
	public void setWrappedService(
		ManuAdditionalCompanyInfoService manuAdditionalCompanyInfoService) {

		_manuAdditionalCompanyInfoService = manuAdditionalCompanyInfoService;
	}

	private ManuAdditionalCompanyInfoService _manuAdditionalCompanyInfoService;

}