/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisApplicationCompanyInfoService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyInfoService
 * @generated
 */
public class CannabisApplicationCompanyInfoServiceWrapper
	implements CannabisApplicationCompanyInfoService,
			   ServiceWrapper<CannabisApplicationCompanyInfoService> {

	public CannabisApplicationCompanyInfoServiceWrapper() {
		this(null);
	}

	public CannabisApplicationCompanyInfoServiceWrapper(
		CannabisApplicationCompanyInfoService
			cannabisApplicationCompanyInfoService) {

		_cannabisApplicationCompanyInfoService =
			cannabisApplicationCompanyInfoService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationCompanyInfoService.
			getOSGiServiceIdentifier();
	}

	@Override
	public CannabisApplicationCompanyInfoService getWrappedService() {
		return _cannabisApplicationCompanyInfoService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationCompanyInfoService
			cannabisApplicationCompanyInfoService) {

		_cannabisApplicationCompanyInfoService =
			cannabisApplicationCompanyInfoService;
	}

	private CannabisApplicationCompanyInfoService
		_cannabisApplicationCompanyInfoService;

}